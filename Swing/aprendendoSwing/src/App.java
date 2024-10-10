import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App extends JFrame {

    private static JLabel directionsLabel = new JLabel("Enter your name in the box:");
    private static JLabel outputLabel = new JLabel();
    private static JTextField nameBox = new JTextField(25);
    private static JButton nameButton = new JButton("Click me");

    public static void main(String[] args) throws Exception {
        App window = new App();
        window.setSize(500,500);
        window.setVisible(true);
        window.setTitle("My JFrame");

        // ordem é importante:
        window.setLayout(new FlowLayout());
        window.getContentPane().add(directionsLabel);
        window.getContentPane().add(nameBox);
        window.getContentPane().add(nameButton);
        window.getContentPane().add(outputLabel);

        //add an action listener
        nameButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                buttonClick(e); //function tha handles the event

            }
        });

        // Deixa a janela do tamanho mínimo:
        //window.pack();

        // add Swing objects here
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // FECHA A JANELA, PARA O PROGRAMA

    }// end of main

    public static void buttonClick(ActionEvent e){
        //put code in here do respond to the button

        // shows dialog box: its commented because it's not necessary, use just in case the button stops working 
        // JOptionPane.showMessageDialog(null, "Button Works!", "Hi!", JOptionPane.INFORMATION_MESSAGE);
        /*
            1. Strip from the screen objects
            2. Do something with the data from the screen
            3. Output the something
         */
        // get put stuff out of the box, set put stuff in
        String yourName = nameBox.getText();
        String outputMessage = "Hello there " + yourName;
        outputLabel.setText(outputMessage);
    }
}
