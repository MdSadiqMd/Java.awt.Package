import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
We can create an GUI application code from importing from Frame Class or Creating object of the Frame
 */
/*public class videoawt extends Frame {
    public videoawt(){
        setSize(400,300); //this creates an outer frame of the web app
        setVisible(true); //this tells to allow to display the output we are doing
    }*/
public class _1_videoawt  {
    public _1_videoawt(){ //It's a Constructor
        Frame frame=new Frame(" Hello World"); //Creating the Frame Object which we extend for creating applications

        //Creating Button
        Button button=new Button("Click Me");//create a button object
        button.setBounds(20,40,80,40);//set the size of the button
        frame.add(button);//add button to the webapp
        button.setBackground(Color.green);//It sets color for the Button
        button.setForeground(Color.red);//It sets color for the text Inside the Button

        //Creating Text field
        TextField textfeild=new TextField("TextFeild");
        textfeild.setBounds(20,150,150,60);
        frame.add(textfeild);

        //Creating Label
        Label label=new Label("Hello World");
        label.setBounds(20,90,150,50);
        frame.add(label);

        //Creating Text Area
        TextArea textarea=new TextArea("TextArea");
        textarea.setBounds(250,40,100,100);
        frame.add(textarea);

        //Creating a Checkbox
        Checkbox checkbox =new Checkbox("Java");
        checkbox.setBounds(350,100,100,100);
        frame.add(checkbox);
        Checkbox checkbox1 =new Checkbox("Python");
        checkbox1.setBounds(350,150,100,100);
        frame.add(checkbox1);

        frame.setSize(700,500); //this creates an outer frame of the web app
        frame.setLayout(null);//if we not write this line then the elements we add will come as same size of whole layout
        frame.setVisible(true); //this tells to allow to display the output we are doing
        frame.addWindowListener(new WindowAdapter() { //select second option close
            @Override
            public void windowClosing(WindowEvent e) {
                //super.windowClosing(e);
                frame.dispose(); //and write this function to close
                System.out.println("windowClosing");//This Print statement will print in the console when the output window is closed or when we click on ( X ) mark
            }
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("windowOpened");
            }
            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("windowIconified");//when we minimize the output window
            }
            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("windowDeiconified"); //When we minimize and open the output window
            }
            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("windowActivated"); //when we perform any task on window
            }
            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("windowDeactivated"); //when window is open, and we are working on another web app
            }
            @Override
            public void windowStateChanged(WindowEvent e) {
                System.out.println("windowStateChanged");
            }
            @Override
            public void windowGainedFocus(WindowEvent e) {
                System.out.println("windowGainedFocus");
            }
            @Override
            public void windowLostFocus(WindowEvent e) {
                System.out.println("windowLostFocus");
            }
        });
    }
    public static void main(String[] args) {
        //new videoawt();
        _1_videoawt obj=new _1_videoawt();

    }
}
