package devv_prg1;

public class Result {	
		public static String display(int m) {
			if(m<0 || m>100 ) {
				return "Invalid";
			}
			else if (m<40){
				return "fail";
			}
			else {
				return "pass";
			}
		}
}
