public class stick {


	public static void main(String[] args) {

		int ex = 0;
		int stick = 64;
		int stick_cnt=0;
		int input=0;
		int stick_sum = 0;
		int i=0;
		int[] cut_stick = new int[20];
		Scanner scanner = new Scanner(System.in);
		while(input <= 0 || input > 64){
		System.out.print("Input length of stick(<= 64)  ====>");
		input = scanner.nextInt();
		}
		while(ex == 0 ){
			stick_sum = 0; 
			stick = stick / 2;		
			cut_stick[stick_cnt] = stick;
			stick_cnt++;
			for(i=0;i<stick_cnt;i++){
				if(cut_stick[i]<= input){
				  stick_sum = stick_sum + cut_stick[i];
				} else {
					cut_stick[i] = 0; 
					stick_cnt--;
				  }	
			}
			
			if(stick_sum+stick == input || stick == input || stick_sum == input){
				ex = 1;
			} else if(stick_sum > input){
				cut_stick[stick_cnt-1] = 0;
				stick_cnt--;
			  } 			
			 
		}
				System.out.print(stick_cnt);
	}
}


