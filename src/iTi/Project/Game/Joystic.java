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
    static Controller allcontroller;
    static Controller [] cont=new Controller[2];
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
        int no=0;
        for (int i=0;i<Controllers.getControllerCount();i++)
        {
            allcontroller=Controllers.getController(i);
            if(allcontroller.getName().contains("Twin") || allcontroller.getName().contains("Gamepad"))
            {     
              System.out.println(allcontroller.getName());
                cont[no]=Controllers.getController(i);
                no++;
            }
        }
        System.out.print(cont[0].getName());
        System.out.print(cont[1].getName());
        
       while(true){           
        if(turn)   // it's player1 turn
        {
           cont[0].poll();
            if(cont[0].isButtonPressed(2)==true )
            {
                System.out.println("Hello i'm button X from Controller.1");
                turn = !turn ;
                return 'X' ; 
            }
            
            float xval=cont[0].getPovX();
             float yval=cont[0].getPovY();
            if(xval<0)
            {
                 System.out.println(xval);
              while (cont[0].getPovX() <0) {cont[0].poll();}
                return 'L' ; 
            }
            else if(xval>0)
            {
                System.out.println(xval+" C1");
                 while (cont[0].getPovX()>0) {cont[0].poll();}
                 return 'R' ; 
            }
            
          else if(yval>0)
            {
                System.out.println(yval+" C1");
                while (cont[0].getPovY()>0) {cont[0].poll();}
                return 'D' ; 
            }
            else if(yval<0)
            {
                 System.out.println(yval+" C1");
                 while (cont[0].getPovY() <0) {cont[0].poll();}
                 return 'U' ; 
            }
        }
        else if(UI.isSingle==0 && !turn )//player2 turn
        {
            cont[1].poll();
            
            if(cont[1].isButtonPressed(2)==true )
            {        
                System.out.println("Hello i'm button X from Controller2");
                turn = !turn ;
                return 'X' ; 
            }
            
            float xval=cont[1].getPovX();
             float yval=cont[1].getPovY();
            if(xval<0)
            {
                System.out.println(xval+" C2");
                while (cont[1].getPovX() <0) {cont[1].poll();}
                return 'L' ; 
            }
            else  if(xval>0)
            {
                while (cont[1].getPovX() >0) {cont[1].poll();}
                System.out.println(xval+" C2");
                 return 'R' ; 
            }
            
            if(yval>0)
            {
                System.out.println(yval+" C2");
                while (cont[1].getPovY()>0) {cont[1].poll();}
                return 'D' ; 
            }
            else  if(yval<0)
            {
                 System.out.println(yval+" C2");
                 while (cont[1].getPovY()<0) {cont[1].poll();}
                 return 'U' ; 
            }
         }
    
       }
    }
}