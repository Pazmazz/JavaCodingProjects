public class Jaylen_Small_PasswordCheck {
    public static void main(String[] args) {
        // Prompt the user to enter a password
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a string for password: ");
        String s = input.nextLine();
    
        if (isValidPassword(s) == true) {
          System.out.println("Valid Password");
        }
        else {
          System.out.println("Invalid Password");
        }
      }//end main method
    
    public static boolean isValidPassword(String string){
        int validPassword = 0;
        int digitCount = 0;
        char stringChar;

        for (int i = 0; i < string.length(); i++){
            stringChar = string.charAt(i);
            boolean hasDigit = Character.isDigit(stringChar);
            boolean hasLetter = Character.isLetter(stringChar);
            
            if (i > 7){
                validPassword--;
            } 
            
            if (!(hasDigit || hasLetter)){
                validPassword--;
            }
        }

        for (int i = 0; i < string.length(); i++){
            stringChar = string.charAt(i);
            boolean hasDigit = Character.isDigit(stringChar);
            
            if (hasDigit == true){
                digitCount++;
            }

            if (digitCount > 2){
                validPassword--;
            }
        }

        if(validPassword < 0){
            return false;
        } else {
            return true;
        }
    }
}
