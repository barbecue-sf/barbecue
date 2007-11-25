// This is a JPEG image generation example

// TODO merge into Example.java

import java.io.*;



import net.sourceforge.barbecue.Barcode;

import net.sourceforge.barbecue.BarcodeFactory;

import net.sourceforge.barbecue.BarcodeImageHandler;

import net.sourceforge.barbecue.BarcodeException;
import net.sourceforge.barbecue.env.Environment;
import net.sourceforge.barbecue.env.EnvironmentFactory;


public class Example1 {

	public void outputtingBarcodeAsJPEG() throws BarcodeException {
		  

		try {
			
			
			Environment env = EnvironmentFactory.getEnvironment();
			System.out.println(env.toString());
			System.out.println(env.getResolution());
			
			Barcode barcode3;

			barcode3 = BarcodeFactory.createCode128C("123456");

			barcode3.setResolution(300);

			BarcodeImageHandler.saveJPEG(barcode3, new File("0075.jpg"));
		
    	}

        catch (Exception er) {

            	System.out.println("Error: "+er.getMessage());// Error handling

        }		  

    }

}

