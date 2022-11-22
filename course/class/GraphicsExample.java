import java.awt.*;
import java.applet.*;

public class GraphicsExample extends Applet {
    public void init(){
        setBackground(Color.blue);
        setForeground(Color.white);
    }
    public void paint(Graphics g){
        g.drawString("Happy Diwali",80,50);
    }    
}


/*
 * <html>
 * <body>
 * <applet code="GraphicsExample.class" width="500" height="500">
 * </applet>
 * </body>
 * </html>
 */
