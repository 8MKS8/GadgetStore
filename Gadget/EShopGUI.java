import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

public class EShopGUI implements ActionListener
{
    private JFrame frame; //Vriable to create the frame
    
    // Variables for the text fild in type JTextField 
    private JTextField theModel;
    private JTextField thePrice;
    private JTextField theWeight;
    private JTextField theSize;
    private JTextField theCredit;
    private JTextField theMemory;
    private JTextField thePhoneNumb;
    private JTextField theDuration;
    private JTextField Download;
    private JTextField DisplayNumber;
    
    //Variables for buttons in type JButton 
    private JButton addPhoneButton;
    private JButton addMp3Button;
    private JButton clearButton;
    private JButton displayAllButton;
    private JButton makeCallButton;
    private JButton downloadMusicButton;
    
    private String model; 
    private double price;
    private String size;
    private int weight;
    private float memory;
    private float credit;
    
    //Creating a varible of arraylist type  of string  
    private ArrayList<Gadget> gadgets;
    
    public EShopGUI()
    {
        gadgets = new ArrayList<Gadget>();
        drawGUI();
    }
    
    public void drawGUI()
    {
        frame = new JFrame("E-Shop"); //craete the frame window
        frame.setLocation(400,100); //set the location of the frame on the screen 
        
        JMenuBar menuBar = new JMenuBar(); //Create new empty menu bar
        frame.setJMenuBar(menuBar); //set the menu bar to the frame
        
        //File block 
        JMenu fileMenu = new JMenu("File"); // create the file menu
        menuBar.add(fileMenu); // add the file menu to the menu bar
        
        JMenuItem newFileItem = new JMenuItem("New File"); //create a new item
        newFileItem.addActionListener(this); //add the "new file" item to action listener to provide the comand
        fileMenu.add(newFileItem); // add the "new file" item to the file in menu bar menu
        
        JMenuItem openFileItem = new JMenuItem("Open");
        openFileItem.addActionListener(this);
        fileMenu.add(openFileItem);
        
        menuBar.add(Box.createHorizontalStrut(100)); // add a space between the 2 items in menu bar
        //menuBar.add(Box.createHorizontalGlue()); // add maximum available space between 2 menu items
        
        //Help block
        JMenu helpMenu = new JMenu("Help"); // create the file menu
        menuBar.add(helpMenu); // add the file menu to the menu bar
        
        Container contentPane = frame.getContentPane();//create the spase to be filed with butons and fields
        
        BorderLayout borderLayout = new BorderLayout(); //create new border layout
        contentPane.setLayout(borderLayout);  //set the border layout for the content panel
        
        
        //Panel for the North block
        JPanel northPanel = new JPanel(); // crete a new panel 
        contentPane.add(northPanel,BorderLayout.NORTH); // add the north border to the top of the window panel 
        
        northPanel.add(new JLabel("Welcome to Gadget Shop")); // add a label to north borer
        northPanel.setBackground(new Color(255,229,181)); //set the color to the north panel
        
        //Panel for the West block
        JPanel westPanel = new JPanel(); //create a new panel in the left side of the window
        contentPane.add(westPanel,BorderLayout.WEST); // add the west panel to the border layout
        GridLayout westGridLayout = new GridLayout(2,1); //create grid layout in the west bordr of the layout
        westPanel.setLayout(westGridLayout); //seting the grid for the west panel
        westPanel.setBackground(new Color(210,249,241)); //set the color to the west panel
        
        westPanel.add(new JLabel("Store"));
        westPanel.add(new JLabel("Library"));
        
        //westPanel.add(Box.createHorizontalStrut(10));
        
        
        
        //Panel for the Center block
        JPanel centerPanel = new JPanel();
        contentPane.add(centerPanel,BorderLayout.CENTER);
        
        
        
        //JPanel cnterBorderLayout = new JPanel();
        //centerPanel.add(cnterBorderLayout,BorderLayout.WEST);
        
        GridLayout gridCenterLayout = new GridLayout(12,2); //create grid layout in the west bordr of the layout
        centerPanel.setLayout(gridCenterLayout);   //set the grid layout to center panel     
        
        //The "model" field block which contains the label  and the text field 
        centerPanel.add(new JLabel("Model:"));//add the "model" label to center panel
        //The "model" text field block
        theModel = new JTextField("Galaxy s23"); //create new text box
        centerPanel.add(theModel); //add the text box to the center panel
        
        
        
        //The "price" field block which contains the label  and the field 
        centerPanel.add(new JLabel("Price:"));//add the "price" label to center panel
        //The "price" text field block
        thePrice = new JTextField("152.00");
        centerPanel.add(thePrice);
        
        
        //The "size" field block which contains the label  and the field
        centerPanel.add(new JLabel("Size:"));//add the "size" label to center panel
        //The "size" text field block
        theSize = new JTextField("108 x 84 x 10");
        centerPanel.add(theSize);
        
        //The "weight" field block which contains the label  and the field
        centerPanel.add(new JLabel("Weight"));
        //The "weight" text field block
        theWeight = new JTextField("233");
        centerPanel.add(theWeight);
        
        //The "credit" field block which contains the label  and the field
        centerPanel.add(new JLabel("Credit"));
        //The "credit" text field block
        theCredit = new JTextField("15.62");
        centerPanel.add(theCredit);
        
        //The "memory" field block which contains the label  and the field
        centerPanel.add(new JLabel("Memory"));
        //The "memory" text field block
        theMemory = new JTextField("630");
        centerPanel.add(theMemory);
        
        //The "phone number" field block which contains the label  and the field
        centerPanel.add(new JLabel("Phone No."));
        //The "phone number" text field block
        thePhoneNumb = new JTextField("+44 77-1234-5678");
        centerPanel.add(thePhoneNumb);
        
        //The "duration of the song" field block which contains the label  and the field
        centerPanel.add(new JLabel("Duration"));
        //The "duration" text field block
        theDuration = new JTextField("3.22");
        centerPanel.add(theDuration);
        
        //The "download" field block which contains the label  and the field
        centerPanel.add(new JLabel("Download"));
        //The "download" text field block
        Download = new JTextField("5.04");
        centerPanel.add(Download);
        
        //The "display number" field block which contains the label  and the field
        centerPanel.add(new JLabel("DisplayNumber"));
        //The "display number" text field block
        DisplayNumber = new JTextField();
        centerPanel.add(DisplayNumber);
        
        JPanel eastPanel = new JPanel(); //create a new panel in the left side of the window
        contentPane.add(eastPanel,BorderLayout.EAST); // add the west panel to the border layout
        GridLayout eastGridLayout = new GridLayout(3,2); //create grid layout in the west bordr of the layout
        eastPanel.setLayout(eastGridLayout); //seting the grid for the west panel
        eastPanel.setBackground(new Color(210,249,241)); 
        
        //Add new phone button block
        addPhoneButton = new JButton("Add New Phone"); //create new button
        eastPanel.add(addPhoneButton); //add button to the east panel
        addPhoneButton.addActionListener(this); //connect button to action listener
        
        //Add new mp3 button block
        addMp3Button = new JButton("Add New MP3"); 
        eastPanel.add(addMp3Button);
        addMp3Button.addActionListener(this);
        
        //Add new clear button block
        clearButton = new JButton("Clear");
        eastPanel.add(clearButton);
        clearButton.addActionListener(this);
        
        //Add new display all button block
        displayAllButton = new JButton("Display All");
        eastPanel.add(displayAllButton);
        displayAllButton.addActionListener(this);        
        
        // makeCallButton;
        makeCallButton = new JButton("Call");
        eastPanel.add(makeCallButton);
        makeCallButton.addActionListener(this);
        
        // downloadMusicButton;
        downloadMusicButton = new JButton("Download");
        eastPanel.add(downloadMusicButton);
        downloadMusicButton.addActionListener(this);
        
        frame.pack();
        frame.setVisible(true); 
    }
    
    //Creating action listener method to be able to interact with the program from GUI
    public void actionPerformed(ActionEvent event) 
    {
        String command = event.getActionCommand(); //making action listener to read string commands
        model = theModel.getText();
        price = Double.parseDouble(thePrice.getText());
        size = theSize.getText();
        weight = Integer.parseInt(theWeight.getText());
        memory = Float.parseFloat(theMemory.getText());
        credit = Float.parseFloat(theCredit.getText());
    
        if (command.equals("Add New Phone")) 
            {
            captureModel();
            //the information to create a new gadget
            Gadget newGadget = new Mobile(model, price, weight, size, credit);
            //add the newly created Gadget object to the gadgets ArrayList
            gadgets.add(newGadget);
            System.out.println("+1 Phone added");
            System.out.println("Model: " + model);
            System.out.println();
            }
        if (command.equals("Add New MP3")) 
            {
            //the information to create a new gadget
            Gadget newGadget = new Mp3(model, price, weight, size, memory);
            //add the newly created Gadget object to the gadgets ArrayList
            gadgets.add(newGadget);
            System.out.println("+1 MP3 added");
            System.out.println("Model: " + model);
            System.out.println();
            }
            
        if (command.equals("Clear")) 
            {
                Clear();
            }
        if (command.equals("Display All")) 
         {
           System.out.println(numberOfGadgets() + " Gadgets in library");
           System.out.println();
           System.out.println("The list of gagets is : " + gadgets );
           System.out.println();
           for (Gadget g : gadgets)
            {
              Gadget currentGad = g;
              if (currentGad instanceof Mobile)
                {
                  Mobile mobile = (Mobile) currentGad;
                  mobile.displayMobAtributes();
                } 
              if (currentGad instanceof Mp3)
              {
                  Mp3 mp3 = (Mp3) currentGad;
                  mp3.displayMp3Atributes();
              }
            }     
         }
    }
    
    public int numberOfGadgets()
    {
        return gadgets.size();
    }
    
    public void Clear()
    {
        theModel.setText("");
        thePrice.setText("");
        theWeight.setText("");
        theSize.setText("");
        theCredit.setText("");
        theMemory.setText("");
        thePhoneNumb.setText("");
        theDuration.setText("");
        Download.setText("");
        DisplayNumber.setText("");
    } 
    
    private void captureModel() {
    String aModel = "XX";
    try {
        if (aModel.isEmpty()) {
            model = aModel;
            JOptionPane.showMessageDialog(frame, "The model is now " + model);
        } else {
            JOptionPane.showMessageDialog(frame, "The model field is empty. Please insert text.");
        }
    } catch (NumberFormatException e) {
        // This catch block won't be triggered because you're not parsing any numbers
        JOptionPane.showMessageDialog(frame, "An error occurred while processing the model.");
    }
}

    
        // String model = theModel.getText();
        // double price = Double.parseDouble(thePrice.getText());
        // String size = theSize.getText();
        // int weight = Integer.parseInt(theWeight.getText());
        // float memory = Float.parseFloat(theMemory.getText());
        // float credit = Float.parseFloat(theCredit.getText());
}