import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class _3_ActionListener {
    public _3_ActionListener(){
        Frame frame=new Frame(" Hello World"); //Creating the Frame Object which we extend for creating applications

        //Creating Button
        Button button=new Button("Click Me");//create a button object
        button.setBounds(20,40,80,40);//set the size of the button
        frame.add(button);//add button to the webapp
        button.setBackground(Color.green);//It sets color for the Button
        button.setForeground(Color.red);//It sets color for the text Inside the Button

        //Creating Label
        Label label=new Label("Hello World");
        label.setBounds(20,90,150,50);
        frame.add(label);

        frame.setSize(700,500); //this creates an outer frame of the web app
        frame.setLayout(null);//if we not write this line then the elements we add will come as same size of whole layout
        frame.setVisible(true); //this tells to allow to display the output we are doing
        button.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Clicked Successfully"); //This will change the text of label when button is clicked
            }
        });
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
    public static void main(String[] args) {
        _3_ActionListener actionlistener=new _3_ActionListener();
    }
}
