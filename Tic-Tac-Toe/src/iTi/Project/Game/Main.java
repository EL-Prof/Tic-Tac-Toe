/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iTi.Project.Game;

/**
 *
 * @author Ahmed Emad el-deen
 */
public class Main {
    public static void main(String[] args) {
        
    char XO[][] = new char[3][3];
   
    int player=0;
    int curr;
    for (int i = 0; i < 3; i++)
    for (int j = 0; j < 3; j++) 
    XO[i][j] = '-';
    
    while( !Joystic.initialize() ) {   }
    
    while(true)
    {
        if( UI.isFinished() )
        {
            break;
        }
        curr=UI.getCell(player+1);
        switch (Joystic.getChar()) {
            case 'X':
            case 'O':
                UI.setCell(player+1);
                player=~player;
                break;
            case 'U':                
                if( curr!=1 || curr!=2 ||curr!=3)
                {
                    UI.selectCell( curr-3 ,player+1);
                }
                break;
            case 'D':
                if( curr!=7 || curr!=8 ||curr!=9)
                {
                    UI.selectCell( curr+3 ,player+1);
                }
                break;
            case 'R':
                if( curr!=3 || curr!=6 ||curr!=9)
                {
                    UI.selectCell( curr+1 ,player+1);
                }
                break;
            case 'L':
                if( curr!=1 || curr!=4 ||curr!=7)
                {
                    UI.selectCell( curr-3 ,player+1);
                }
                break;
            default:
                UI.selectCell( 0 ,player+1);
                break;
        }
    }    
    
    }
    
}
