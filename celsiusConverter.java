import java.awt.Dimension; // needed for dimension clas.
import javax.swing.*;     // needed for swing class.
import java.awt.event.*; // needed for event listener interface
/**
 *  This class displays JFrame that lets the user enter a temperature in 
 * Celsius. When the calculate button is clicked a new number is displayed  by 
 * presenting number converted to Fahrenheit.
 * @author nemtsovilya
 */
public class CelsiusConverter extends JFrame 
{
       private JPanel panel;  // to reference panel
       private JLabel messageLabel; // to reference a label.
       private JTextField celTextField; // to reference a text field,
       private JButton calcButton; // to reference a button.
       private final int WIN_WIDTH=250; // window width
       private final int WIN_HEIGHT = 100; // window height.
       private JLabel celsconverted;
       
       /**
        * Constructor. 
        */
       public CelsiusConverter()
       {
           setTitle("Celsius Converter"); // set the title
           setSize(WIN_WIDTH,WIN_HEIGHT); // set the size of the window.
           //specify what happens when the close button is clicked.
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
           buildPanel(); // build the panel and add it to the frame.
           add(panel); // add the panel to the frame's content pane.
           setVisible(true); // display the window.
       }
       
       /**
        * the buildPanel method adds a label, a text field, button to a panel
        * and the result.
        */
       private void buildPanel()
       {
           // create a label to display Fahrenheit.
           messageLabel = new JLabel("Fahrenheit: ");
           //create a text field 6 characters wide.
           celTextField = new JTextField(6);
           //create a button with the caption "Calculate:."
           calcButton = new JButton("Calculate");
           celsconverted = new JLabel("... degrees");        
           
           //add an action listener to the button.
           calcButton.addActionListener(new CalcButtonListener());
           
           //create a JPanel object and let the panel field refrence it.
           panel = new JPanel();
          
           //it does allignment for the messageLabel label.
           messageLabel.setPreferredSize(new Dimension(100,20));
           messageLabel.setHorizontalAlignment(JLabel.LEFT);
           
           //add the label, text field, button and calculation result to the panel.
           panel.add(celTextField);           
           panel.add(calcButton);
           panel.add(messageLabel);
           panel.add(celsconverted); 
       }
       
       /**
        * CalcButtonListener is an action listener class for the calculate button.
        */
       private class CalcButtonListener implements ActionListener
       {
           
           /**
            * the action performed method executes when  the user clicks on the 
            * calculate button.
            * @param e The event object.
            */
           @Override
           public void actionPerformed(ActionEvent e)
           {
               String input; //to hold the user inpput 
               int Fahrenheit; // the temperature in fahrenheit.
                
               //get the text entered by the user into the text field.
               input = celTextField.getText(); 
               Fahrenheit= Integer.parseInt(input) *9/5 + 32;
               celsconverted.setText(Integer.toString(Fahrenheit)+" degrees");             
           }
       }
       
       /**
        * main method 
     * @param args
        */
       public static void main(String[] args)
       {
           new CelsiusConverter();
       }
  }

import java.awt.Dimension; // needed for dimension clas.
import javax.swing.*;     // needed for swing class.
import java.awt.event.*; // needed for event listener interface
/**
 *  This class displays JFrame that lets the user enter a temperature in 
 * Celsius. When the calculate button is clicked a new number is displayed  by 
 * presenting number converted to Fahrenheit.
 * @author nemtsovilya
 */
public class CelsiusConverter extends JFrame 
{
       private JPanel panel;  // to reference panel
       private JLabel messageLabel; // to reference a label.
       private JTextField celTextField; // to reference a text field,
       private JButton calcButton; // to reference a button.
       private final int WIN_WIDTH=250; // window width
       private final int WIN_HEIGHT = 100; // window height.
       private JLabel celsconverted;
       
       /**
        * Constructor. 
        */
       public CelsiusConverter()
       {
           setTitle("Celsius Converter"); // set the title
           setSize(WIN_WIDTH,WIN_HEIGHT); // set the size of the window.
           //specify what happens when the close button is clicked.
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
           buildPanel(); // build the panel and add it to the frame.
           add(panel); // add the panel to the frame's content pane.
           setVisible(true); // display the window.
       }
       
       /**
        * the buildPanel method adds a label, a text field, button to a panel
        * and the result.
        */
       private void buildPanel()
       {
           // create a label to display Fahrenheit.
           messageLabel = new JLabel("Fahrenheit: ");
           //create a text field 6 characters wide.
           celTextField = new JTextField(6);
           //create a button with the caption "Calculate:."
           calcButton = new JButton("Calculate");
           celsconverted = new JLabel("... degrees");        
           
           //add an action listener to the button.
           calcButton.addActionListener(new CalcButtonListener());
           
           //create a JPanel object and let the panel field refrence it.
           panel = new JPanel();
          
           //it does allignment for the messageLabel label.
           messageLabel.setPreferredSize(new Dimension(100,20));
           messageLabel.setHorizontalAlignment(JLabel.LEFT);
           
           //add the label, text field, button and calculation result to the panel.
           panel.add(celTextField);           
           panel.add(calcButton);
           panel.add(messageLabel);
           panel.add(celsconverted); 
       }
       
       /**
        * CalcButtonListener is an action listener class for the calculate button.
        */
       private class CalcButtonListener implements ActionListener
       {
           
           /**
            * the action performed method executes when  the user clicks on the 
            * calculate button.
            * @param e The event object.
            */
           @Override
           public void actionPerformed(ActionEvent e)
           {
               String input; //to hold the user inpput 
               int Fahrenheit; // the temperature in fahrenheit.
                
               //get the text entered by the user into the text field.
               input = celTextField.getText(); 
               Fahrenheit= Integer.parseInt(input) *9/5 + 32;
               celsconverted.setText(Integer.toString(Fahrenheit)+" degrees");             
           }
       }
       
       /**
        * main method 
     * @param args
        */
       public static void main(String[] args)
       {
           new CelsiusConverter();
       }
  }
