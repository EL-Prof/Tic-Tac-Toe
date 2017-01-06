/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iTi.Project.Game;
import org.lwjgl.LWJGLException;
import org.lwjgl.input.Controller;
import org.lwjgl.input.Controllers;

/**
 *
 * @author Mohamed Waleed
 */
public class Joystic {
     static Controller allcontroller,controller1,controller2;
    static Boolean turn = true ; 
    public boolean initialize()
    {
        /*
        to initialize the joystic controller
        return true if successfull
        return false if not successfull
        */
     try {
            // TODO code application logic here
            
            Controllers.create();
        } catch (LWJGLException ex) {
            return false ; 
        }
        Controllers.poll();
        for (int i=0;i<Controllers.getControllerCount();i++)
        {
            allcontroller=Controllers.getController(i);
          if(allcontroller.getName().contains("Twin") || allcontroller.getName().contains("Gamepad"))
          {     
              System.out.println(allcontroller.getName());
              return true ; 
          }
          }
        
       return false; 
    }
    
    public char getChar()
    {
        /*
        return the button char that the player pressed
        return 'U' for up arrow
        return 'D' for down arrow
        return 'R' for right arrow
        return 'L' for left arrow
        return 'X' for x
        return 'O' for o
        */
        controller1=Controllers.getController(0);
        controller2=Controllers.getController(1);
       while(true){
           
        if(turn)   // it's player1 turn
        {
           controller1.poll();
            if(controller1.isButtonPressed(2)==true )
            {        
                System.out.println("Hello i'm button X from Controller.1");
                turn = !turn ;
                return 'X' ; 
          }
            
            float xval=controller1.getPovX();
             float yval=controller1.getPovY();
            if(xval<0)
            {
                 System.out.println(xval);
              while (controller1.getPovX() <0) {controller1.poll();}
                return 'L' ; 
            }
            else if(xval>0)
            {
                System.out.println(xval+" C1");
                 while (controller1.getPovX()>0) {controller1.poll();}
                 return 'R' ; 
            }
            
          else if(yval>0)
            {
                System.out.println(yval+" C1");
                while (controller1.getPovY()>0) {controller1.poll();}
                return 'D' ; 
            }
            else if(yval<0)
            {
                 System.out.println(yval+" C1");
                 while (controller1.getPovY() <0) {controller1.poll();}
                 return 'U' ; 
            }
    }
           else //player2 turn
        {
            controller2.poll();
            
            if(controller2.isButtonPressed(2)==true )
            {        
                System.out.println("Hello i'm button X from Controller2");
                turn = !turn ;
                return 'X' ; 
            }
            
            float xval=controller2.getPovX();
             float yval=controller2.getPovY();
            if(xval<0)
            {
                System.out.println(xval+" C2");
                while (controller2.getPovX() <0) {controller2.poll();}
                return 'L' ; 
            }
            else  if(xval>0)
            {
                while (controller2.getPovX() >0) {controller2.poll();}
                System.out.println(xval+" C2");
                 return 'R' ; 
            }
            
            if(yval>0)
            {
                System.out.println(yval+" C2");
                while (controller2.getPovY()>0) {controller2.poll();}
                return 'D' ; 
            }
            else  if(yval<0)
            {
                 System.out.println(yval+" C2");
                 while (controller2.getPovY()<0) {controller2.poll();}
                 return 'U' ; 
            }
         }
    
       }
    }
}

