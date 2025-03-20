
public class Gadget
{
    // Ctrate 4 instances for the class gadget
    private String model;
    private double price;
    private int weight;
    private String size;
    
    public Gadget(String aModel,double aPrice,int aWeight,String aSize)
    //This is a constructor method for the Gadget class
    {
        // initialise instance variables
        model = aModel;
        price = aPrice;
        weight = aWeight;
        size = aSize;
        
    }
    
    //Retuning each value separately
    public String showModel()
    {
      return model;  
    }
    public double showPrice()
    {
      return price;  
    }
    public int showWeight()
    {
      return weight;  
    }
    public String showSize()
    {
      return size;  
    }
    
    //Print the gadget atributes list
    public void printGadget()
    {
        System.out.println("Model: " + model);
        System.out.println("Price: " + price +"£");
        System.out.println("Weight: " + weight + "grams");
        System.out.println("Size: " + size);
    }
   
}
