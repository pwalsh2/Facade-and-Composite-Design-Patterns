import java.util.*;
public class Base{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ListBuilder builder = new ListBuilder();
		System.out.println("Please input string:");
		String inp = in.nextLine();
		for(char token: inp.toCharArray()){
		    	if (token == '(') builder.buildOpenBracket();
    			else if (token == ')') builder.buildCloseBracket();
    			else if (token == ' ') continue;
    			else builder.buildElement(token-'0');
    			//System.out.println(token);
		}
		builder.GetList();
		
		}	
}