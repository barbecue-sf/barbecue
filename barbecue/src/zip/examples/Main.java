import net.sourceforge.barbecue.BarcodeException;

/*
 * Test Harness for calling examples
 * 
 * TODO add guidelines or instructions similar to the Barbecue Main runner class.
 */

/**
 * @author Werner Keil
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			try {
				System.out.println("Running PNG example...");
				Example ex = new Example();
				ex.outputtingBarcodeAsPNG();
				
				System.out.println("Running JPEG example...");
				Example1 e1 = new Example1();
				e1.outputtingBarcodeAsJPEG();
			}
			catch (BarcodeException be) {

	        System.out.println("Error: "+be.getMessage());// Error handling

	        }

	        catch (Exception er) {

	            	System.out.println("Error: "+er.getMessage());// Error handling

	        }		

	}

}
