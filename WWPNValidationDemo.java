import java.util.regex.Matcher;
import java.util.regex.Pattern;

class WWPNValidationDemo{

	public static void main(String[] args) {
		String wwpn = "10:00:00:00:c9:2e:e3:21";

		String pattern = "([0-9a-f]{2}:){7}[0-9a-f]{2}";
		// Create a Pattern object
		Pattern p = Pattern.compile(pattern);
		boolean validWwpn = true;
		// Now create matcher object.
		Matcher m = p.matcher(wwpn);
		if (m.find( )) {
			String[] words = wwpn.split(":");
			if(words.length != 8){
				validWwpn = false;
			}	
			for(String word:words){
				if(word.length() != 2){
					validWwpn = false;
				}	
				break;
			}
		}
		else {
			validWwpn = false;
		}

		if(validWwpn){
			System.out.println("wwpn is valid");
		}else{
			System.out.println("wwpn is not valid"); 
		}
	}        

}
