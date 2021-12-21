import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.glu.GLU;

//import java.util.Random;

import javax.swing.JFrame;


public class Lab2_18301193 implements GLEventListener{
   
	private GLU glu;
   @Override
   public void display(GLAutoDrawable drawable) {
      final GL2 gl = drawable.getGL().getGL2();
      
       /*
         * put your code here
         */
      //for 1
      	int zone = findZone(-10,10,0,10);
      	convertToZone0(gl,-10,10,0,10,zone);
      	int zone1 = findZone(-10,-16,0,-16);
      	convertToZone0(gl,-10,-16,0,-16,zone1);
      	int zone2 = findZone(-10,8,-10,7);
      	convertToZone0(gl,-10,8,-10,7,zone2);
      	int zone3 = findZone(-10,6,-10,5);
      	convertToZone0(gl,-10,6,-10,5,zone3);
      	int zone4 = findZone(-10,4,-10,3);
      	convertToZone0(gl,-10,4,-10,3,zone4);
      	int zone5 = findZone(-10,2,-10,1);
      	convertToZone0(gl,-10,2,-10,1,zone5);
      	int zone6 = findZone( 0,8,0,7);
      	convertToZone0(gl, 0,8,0,7,zone6);
      	int zone7 = findZone(  0,6,0,5);
      	convertToZone0(gl, 0,6,0,5,zone7);
      	int zone8 = findZone( 0,4,0,3);
      	convertToZone0(gl, 0,4,0,3,zone8);
      	int zone9 = findZone(  0,2,0,1);
      	convertToZone0(gl, 0,2,0,1,zone9);
      	int zone10 = findZone(  0,-4,0,-3);
      	convertToZone0(gl,  0,-4,0,-3,zone10);
      	int zone11 = findZone( 0,-6,0,-5);
      	convertToZone0(gl,0,-6,0,-5,zone11);
      	int zone12 = findZone(  0,-8,0,-7);
      	convertToZone0(gl, 0,-8,0,-7,zone12);
      	int zone13 = findZone( 0,-10,0,-9);
      	convertToZone0(gl,  0,-10,0,-9,zone13);
      	int zone14 = findZone( 0,-12,0,-11);
      	convertToZone0(gl,0,-12,0,-11,zone14);
      	int zone15 = findZone(  0,-14,0,-13);
      	convertToZone0(gl, 0,-14,0,-13,zone15);
      	int zone16 = findZone( -10,0,0,0);
      	convertToZone0(gl,-10,0,0,0,zone16);
      
      	
      	//for 3
    	
      	int zone17 = findZone(  5,0,15,0);
      	convertToZone0(gl,5,0,15,0,zone17);
      	int zone18 = findZone(5,10,15,10);
      	convertToZone0(gl,5,10,15,10,zone18);
      	int zone19 = findZone(5,-16,15,-16);
      	convertToZone0(gl,5,-16,15,-16,zone19);
      	int zone20 = findZone( 15,8,15,7);
      	convertToZone0(gl, 15,8,15,7,zone20);
      	int zone21 = findZone( 15,6,15,5);
      	convertToZone0(gl,15,6,15,5,zone21);
      	int zone22 = findZone(15,4,15,3);
      	convertToZone0(gl,15,4,15,3,zone22);
      	int zone23 = findZone(15,2,15,1);
      	convertToZone0(gl,15,2,15,1,zone23);
      	int zone24 = findZone(15,-2,15,-1);
      	convertToZone0(gl,15,-2,15,-1,zone24);
      	int zone25 = findZone( 15,-4,15,-3);
      	convertToZone0(gl, 15,-4,15,-3,zone25);
      	int zone26 = findZone( 15,-6,15,-5);
      	convertToZone0(gl,15,-6,15,-5,zone26);
      	int zone27 = findZone( 15,-8,15,-7);
      	convertToZone0(gl,15,-8,15,-7,zone27);
      	int zone28 = findZone( 15,-10,15,-9);
      	convertToZone0(gl,15,-10,15,-9,zone28);
      	int zone29 = findZone( 15,-12,15,-11);
      	convertToZone0(gl,15,-12,15,-11,zone29);
      	int zone30 = findZone( 15,-14,15,-13);
      	convertToZone0(gl,15,-14,15,-13,zone30);
      	
      	
      	
      	
      	
      	
      	
      	
      	
      	
      	
      	
      	
      	 gl.glEnd();
      
      
   }
   @Override
   public void dispose(GLAutoDrawable arg0) {
      //do nothing
	   
   }
   
   @Override
   public void init(GLAutoDrawable gld) {
       GL2 gl = gld.getGL().getGL2();
       glu = new GLU();

       gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
       gl.glViewport(-100, -50, -50, 100);
       gl.glMatrixMode(GL2.GL_PROJECTION);
       gl.glLoadIdentity();
       glu.gluOrtho2D(-100.0, 100.0, -100.0, 100.0);
   }

   

   @Override
   public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3, int arg4) {
      // do nothing
   }
   
   
   public void Midpoint(GL2 gl, int x1, int y1, int x2, int y2,int zone) {
       
     //write your own code
	   
	   int dx = x2 -x1;
	   int dy = y2 - y1;
	   int d = 2*dy - dx;
	   int e = 2*dy;
	   int ne = 2*(dy-dx);
	   int y= y1;
	   int x= x1;
	   while(x<=x2) {

           gl.glBegin(GL2.GL_POINTS);

		   if(d<=0){
			   x++;
			   d = d+e;
		   }
		   else {
			   x++;
			   y++;
			   d = d+ne;  
		   }
		   gl.glVertex2f(x, y);
	   }
	   gl.glEnd();
    }
   public void originalZone(GL2 gl,int x,int y,int zone){
       
      int a=0;
      int b=0;
      if (zone == 0) {
    	  a = x;
    	  b = y;
      }
      if (zone == 1) {
    	  a = y;
    	  b = x;
      }
      if (zone == 2) {
    	  a = -1*y;
    	  b = x;
      }
      if (zone == 3) {
    	  a = -1*x;
    	  b = y;
      }
      if (zone == 4) {
    	  a = -1*x;
    	  b = -1*y;
      }
      if (zone == 5) {
    	  a = -1*y;
    	  b = -1*x;
      }
      if (zone == 6) {
    	  a = y;
    	  b = -1*x;
      }
      if (zone == 7) {
    	  a = x;
    	  b = -1*y;
      }
     //conditions to convert back to original zone

       gl.glBegin (GL2.GL_POINTS);
       gl.glVertex3f(a,b,1);
       gl.glEnd();
       
       
   }
   public int findZone(int x1, int y1, int x2, int y2){
       //find dx and dy
	   int dx = x2 - x1;
	   int dy = y2 - y1;
	   int zone = 0; 
         //write conditions to check zone  
	   if (Math.abs(dx) > Math.abs(dy)) {
           if (dx > 0 && dy > 0) {
               zone = 0;
           }

           else if (dx < 0 && dy > 0) {
               zone = 3;
           }

           else if (dx < 0 && dy < 0) {
               zone = 4;
           }

           else if (dx > 0 && dy < 0) {
               zone = 7;
           }

       }

       else {
           if (dx > 0 && dy > 0) {
               zone = 1;
           }

           else if (dx < 0 && dy > 0) {
               zone = 2;
           }

           else if (dx < 0 && dy < 0) {
               zone = 5;
           }

           else if (dx > 0 && dy < 0) {
               zone = 6;
           }
       }

       return zone;
   }
   public void convertToZone0(GL2 gl,int x1, int y1, int x2, int y2,int zone){
       int a = 0;
       int b = 0;
       int c = 0;
       int d = 0;
       if(zone == 0) {
    	   a = x1;
    	   b = y1;
    	   c = x2;
    	   d = y2;
    	   Midpoint(gl ,a,b,c,d,zone);
       }
       if (zone == 1) {
    	   a = y1;
    	   b = x1;
    	   c = y2;
    	   d = x2;
    	   Midpoint(gl ,a,b,c,d,zone);
       }
       if (zone == 2) {
    	   a = y1;
    	   b = -1* x1;
    	   c = y2;
    	   d = -1 * x2;
    	   Midpoint(gl ,a,b,c,d,zone);
       }
       if (zone == 3) {
    	   a = -1* x1;
    	   b = y1;
    	   c = -1*x2;
    	   d = y2;
    	   Midpoint(gl ,a,b,c,d,zone);
       }
       if (zone == 4) {
    	   a = -1*x1;
    	   b = -1*y1;
    	   c = -1*x2;
    	   d = -1*y2;
    	   Midpoint(gl ,a,b,c,d,zone);
       }
       if (zone == 5) {
    	   a = -1*y1;
    	   b = -1*x1;
    	   c = -1*y2;
    	   d = -1*x2;
    	   Midpoint(gl ,a,b,c,d,zone);
       }
       if (zone == 6) {
    	   a = -1*y1;
    	   b = x1;
    	   c = -1*y2;
    	   d = x2;
    	   Midpoint(gl ,a,b,c,d,zone); 
       }
       if (zone == 7) {
    	   a = x1;
    	   b = -1*y1;
    	   c = x2;
    	   d = -1*y2;
    	  Midpoint(gl ,a,b,c,d,zone);
       }
       gl.glEnd();
       }

      //Write conditions to convert zones to zone 0
     //Call method Midpoint(gl ,a,b,c,d,zone)
   
   
   public static void main(String[] args) {
      //getting the capabilities object of GL2 profile
      final GLProfile profile = GLProfile.get(GLProfile.GL2);
      GLCapabilities capabilities = new GLCapabilities(profile);
      // The canvas 
      final GLCanvas glcanvas = new GLCanvas(capabilities);
      Lab2_18301193 l = new Lab2_18301193();
      glcanvas.addGLEventListener(l);
      glcanvas.setSize(400, 400);
      //creating frame
      final JFrame frame = new JFrame ("18301193");
      //adding canvas to frame
      frame.getContentPane().add(glcanvas);
      frame.setSize(frame.getContentPane().getPreferredSize());
      frame.setVisible(true);
   }//end of main
}//end of classimport javax.media.opengl.GL2;
