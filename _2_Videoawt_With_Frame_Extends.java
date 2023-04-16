import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//We can create an GUI application code from importing from Frame Class or Creating object of the Frame
public class _2_Videoawt_With_Frame_Extends extends Frame {
    public _2_Videoawt_With_Frame_Extends(){ //same name as public class
        Button button=new Button();
        button.setBounds(20,40,80,20);
        add(button);//rather writing frame.add(button) we write this as we extended the Frame class
        setLayout(null);
        setSize(400,300);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //******Here we need to create the frame object to initialize the frame into( X ) in our GUI Application
                Frame frame=(Frame)e.getSource();
                frame.dispose();
            }
        });
    }
    public static void main(String[] args) {
        _2_Videoawt_With_Frame_Extends obj=new _2_Videoawt_With_Frame_Extends();
    }
}
