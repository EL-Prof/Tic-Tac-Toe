/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iTi.Project.Game;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andrew Sadeq
 */
public class Main {
    public static void main(String[] args) {
        
    char XO[] = new char[9];
   
    int player=1;
    int curr;
    UI frame=new UI();
    frame.show();
    Joystic j=new Joystic();
    frame.selectCell(1, 1);
    
    for (int i = 0; i < 9; i++)
    XO[i] = '-' ;
    
    while( !j.initialize());
     while(true)
    {
        if( frame.isFinished())
        {
            System.out.println("Finished");
                for (int i = 0; i < 9; i++)
                    XO[i] = '-' ;
        }
        curr=frame.getIndex(player);
        char ch = j.getChar() ;  
        switch (ch) {
            case 'X':
            case 'O':
                if(XO[curr-1]=='-')
                {
                    XO[curr-1]= ch ; 
                    frame.setCell(player);
                    //player=~player; //change turn  xxxxxx
                    if (player==1)
                    {
                        player=2;                     
                    }
                    else if(player==2)
                    {
                        player=1;
                    }
            }              
                else
                    j.turn = ! j.turn ; 
                break;
            case 'U':                
                if( curr!=1 && curr!=2 &&curr!=3)
                {
               //     while  (j.getChar()=='U'){}                        
                    frame.selectCell( curr-3 ,player);
                }
                break;
            case 'D':
                if( curr!=7 && curr!=8&&curr!=9)
                {
                  //   while  (j.getChar()=='D'){}                        
                    frame.selectCell( curr+3 ,player);
                }
                break;
            case 'R':
                if( curr!=3 && curr!=6 &&curr!=9)
                {
                //     while  (j.getChar()=='R'){}                        
                    frame.selectCell( curr+1 ,player);
                }
                break;
            case 'L':
                if( curr!=1 && curr!=4 &&curr!=7)
                {
                 //    while  (j.getChar()=='L'){}                        
                    frame.selectCell( curr-1 ,player);
                }
                break;
            default:
                frame.selectCell( 0 ,player);
                break;
        }
    }    
    
    }
    
}