
public class Mp3 extends Gadget
{
    // instance variables - replace the example below with your own
    private float memory;

    public Mp3(String aModel, double aPrice, int aWeight,
    String aSize,float aMemory)
    {
        /* initialise instance variables for Mp3 class and 
        adding the variables from the super class gadget*/
       super(aModel, aPrice, aWeight,aSize ); 
       memory = aMemory;
    } 
    
    //Printing the atributes for Mp3
    public void displayMp3Atributes()
    {
        System.out.println("The Mp3 Characteristics are:");
        super.printGadget();
        System.out.println("The available space is : " + memory + " GB");
        System.out.println();
    }
}
