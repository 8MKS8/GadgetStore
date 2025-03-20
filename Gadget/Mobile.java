
public class Mobile extends Gadget
{
    
    private float credit;
    public Mobile(String aModel, double aPrice, int aWeight,
    String aSize,float aCredit)
    {
        /* initialise instance variables for mobile class and 
        adding the variables from the super class gadget*/
        super(aModel, aPrice, aWeight,aSize ); 
        credit = aCredit;
    }
    
    public void displayMobAtributes()
    {
        System.out.println("The Mobile Characteristics are:"); 
        super.printGadget();
        System.out.println("Your balance is: " + credit + " min");
        System.out.println("");
    }

}
