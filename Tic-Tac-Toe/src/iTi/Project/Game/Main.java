/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iTi.Project.Game;

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
    Joystic j=new Joystic();
    
    for (int i = 0; i < 9; i++)
    XO[i] = '-';
    
    while( !j.initialize() ) {   }
    UI.init();
    while(true)
    {
        if( frame.isFinished() )
        {
            break;
        }
        curr=frame.getCell(player);
        switch (j.getChar()) {
            case 'X':
            case 'O':
                if(XO[curr-1]=='-')
                {
                    XO[curr-1]=j.getChar();
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
                break;
            case 'U':                
                if( curr!=1 || curr!=2 ||curr!=3)
                {
                    frame.selectCell( curr-3 ,player);
                }
                break;
            case 'D':
                if( curr!=7 || curr!=8 ||curr!=9)
                {
                    frame.selectCell( curr+3 ,player);
                }
                break;
            case 'R':
                if( curr!=3 || curr!=6 ||curr!=9)
                {
                    frame.selectCell( curr+1 ,player);
                }
                break;
            case 'L':
                if( curr!=1 || curr!=4 ||curr!=7)
                {
                    frame.selectCell( curr-3 ,player);
                }
                break;
            default:
                frame.selectCell( 0 ,player);
                break;
        }
    }    
    
    }
    
}