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
public class videoawt  {
    public videoawt(){
        Frame frame=new Frame(" Hello World");
        Button button=new Button("Click Me");//create a button object
        button.setBounds(20,40,80,40);//set the size of the button
        frame.add(button);//add button to the webapp
        frame.setSize(400,300); //this creates an outer frame of the web app
        frame.setLayout(null);//if we not write this line then the elements we add will come as same size of whole layout
        frame.setVisible(true); //this tells to allow to display the output we are doing
        frame.addWindowListener(new WindowAdapter() { //select second option close
            @Override
            public void windowClosing(WindowEvent e) {
                //super.windowClosing(e);
                frame.dispose(); //and write this function to close
            }
        });
    }
    public static void main(String[] args) {
        //new videoawt();
        videoawt obj=new videoawt();

    }
}
