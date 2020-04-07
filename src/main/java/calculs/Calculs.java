package calculs;

public class Calculs
{
        private final int operande1;
        private final int operande2;

        public Calculs(int operande1, int operande2)
        {
                this.operande1 = operande1;
                this.operande2 = operande2;
        }
        
        public int multiplier()
        {
                return operande1 * operande2;
        }
        
        public int additionner()
        {
                return operande1 + operande2;
        }
        
        public int diviser()
        {
                return operande1 / operande2;
        }
        
        public int soustraire()
        {
                return operande1 - operande2;
        }        
        public static void main(String[] args) {
        	Calculs test = new Calculs(1,2);
        /////////////////////////////////////////////////
        try {

            	System.out.println(test.operande1 + " x " + test.operande2 + " = " + test.multiplier());
        }
        catch (Exception e) {
        		System.out.println(e.getLocalizedMessage());
        		System.out.println(e.getStackTrace());
        }
        /////////////////////////////////////////////////
        try {
        	System.out.println(test.operande1 + " / " + test.operande2 + " = " + test.diviser());
    	}
    	catch (Exception e) {
    		System.out.println(e.getLocalizedMessage());
    		System.out.println(e.getStackTrace());
    	}
        /////////////////////////////////////////////////
        try {
        	System.out.println(test.operande1 + " + " + test.operande2 + " = " + test.additionner());
    	}
    	catch (Exception e) {
    		System.out.println(e.getLocalizedMessage());
    		System.out.println(e.getStackTrace());
    	}
        /////////////////////////////////////////////////
        try {
        	System.out.println(test.operande1 + " - " + test.operande2 + " = " + test.soustraire());

    	}
    	catch (Exception e) {
    		System.out.println(e.getLocalizedMessage());
    		System.out.println(e.getStackTrace());
    	}
        ////////////////////////////////////////////////
        }
        
}