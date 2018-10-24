
public class TeaParty {
	public String welcome(String name, boolean isWoman, boolean isKnighted) {

		String fullName = "";
		
		if (isKnighted == true) {
			if (isWoman == true) {
				fullName = "Lady " + name;
			} 
			
			else {
				fullName = "Sir " + name;
			}
		}
		
		else {
				if(isWoman == true) {
					fullName = "Ms. " + name;
				}
				
				else {
					fullName = "Mr. " + name;
				}
			}
		return "Hello " + fullName;
		}
	}

