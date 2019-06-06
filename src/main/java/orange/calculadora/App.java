package orange.calculadora;

/**
 * calculadora curso Calidad !! asdfasdf !!! sdfgsdfgs asdf asd
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    public static int add(String nums) {
    	
    		String[] num_arr=nums.split(",");
    		int suma=0;
    		for (String unNum : num_arr) {
    			suma+=unNum.contentEquals("") ? 0 :Integer.parseInt(unNum.trim());
    		}
    		return suma;
    	
    }
}
