import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.glu.GLU;
import java.lang.Math;
import javax.swing.JFrame;

class ThirdGLEventListener implements GLEventListener {
/**
 * Interface to the GLU library.
 */
private GLU glu;

/**
 * Take care of initialization here.
 */
public void init(GLAutoDrawable gld) {
    GL2 gl = gld.getGL().getGL2();
    glu = new GLU();

    gl.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
    gl.glViewport(-250, -150, 250, 150);
    gl.glMatrixMode(GL2.GL_PROJECTION);
    gl.glLoadIdentity();
    glu.gluOrtho2D(-250.0, 250.0, -150.0, 150.0);
}

/**
 * Take care of drawing here.
 */
public void display(GLAutoDrawable drawable) {
    GL2 gl = drawable.getGL().getGL2();

    gl.glClear(GL2.GL_COLOR_BUFFER_BIT);
    /*
     * put your code here
      */
    DDA(gl,-50,50,50,50);
    DDA(gl,-50,-50,-50,50);
    DDA(gl,-50,50,0,0);
   
}
    private void DDA(GL2 gl, float x1, float x2, float y1, float y2) {
    	gl.glColor3d(0, 4, 0);
    	gl.glPointSize(5.0f);
    	float x = x1;
    	float y = y1;
    	gl.glBegin(GL2.GL_POINTS);
    	float m = (y2 - y1)/(x2 - x1);
    	if(m>=-1 && m<=1) {
    		while(x<=x2) {
    			x = x +1;
    			y = y+m;
    			gl.glVertex2d(x, y);
       		}
    	}
    	else {
    		while(y<=y2) {
    			y=y+1;
    			x=x+(1/m);
    			gl.glVertex2d(x,y);
    		}
    	}
    	gl.glEnd();
    }
    


public void reshape(GLAutoDrawable drawable, int x, int y, int width,
        int height) {
}

public void displayChanged(GLAutoDrawable drawable,
        boolean modeChanged, boolean deviceChanged) {
}

public void dispose(GLAutoDrawable arg0)
{
 
}
}
public class Task2_18301193
{
public static void main(String args[])
{
 //getting the capabilities object of GL2 profile
 final GLProfile profile=GLProfile.get(GLProfile.GL2);
 GLCapabilities capabilities=new GLCapabilities(profile);
 // The canvas
 final GLCanvas glcanvas=new GLCanvas(capabilities);
 ThirdGLEventListener b=new ThirdGLEventListener();
 glcanvas.addGLEventListener(b);
 glcanvas.setSize(400, 400);
 //creating frame
 final JFrame frame=new JFrame("18301193");
 //adding canvas to frame
 frame.add(glcanvas);
 frame.setSize(640,480);
 frame.setVisible(true);
}
}