/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iTi.Project.Game;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Andrew Sadeq
 */
public class Main {
    
    public enum itsadefend{NO,YES};
    public static UI frame=new UI();
    public static char XO[][] = new char[3][3];
    public static int n=0;
    public static int player=1;
    
    public static void choice(int x, int y)
    {

            frame.selectCell(  3*(x-1) + y , 2);
            frame.setCell(2);
            XO[x-1][y-1]='O';
            player=1;
            n++;
        try {
            TimeUnit.MILLISECONDS.sleep(300);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
            Joystic.turn=!Joystic.turn;
            System.out.println("pc role");  
    }

    public static void main(String[] args) {  
        
    int curr;
    char ch;
    Random rand = new Random();
    int x = 0,y = 0,a = 0,b = 0;
    
    int m,q=0;
 
    itsadefend defend; 

    frame.show();
    
    Joystic stick=new Joystic();
    frame.selectCell(1, 1);
    
    for (int i = 0; i < 9; i++)
    XO[i/3][i%3] = '-' ;
    
    while( !stick.initialize());
      
    outerloop:
    while(true)
    {

        if( frame.isFinished())
        {
            System.out.println("Finished");
            for (int i = 0; i < 9; i++)
                XO[i/3][i%3] = '-' ;
            if(UI.isSingle==1)
            {
                n=0; 
                q=0;
                Joystic.turn=true;
                player=1;
            }
        }       
        if(UI.isSingle==1 &&  player==1 || UI.isSingle == 0 )
        {
            curr=frame.getIndex(player);
            ch = stick.getChar();
        switch (ch) {
            case 'X':
            case 'O':
                if(XO[ (curr-1)/3 ][(curr-1)%3 ]=='-')
                {
                    x=(curr-1)/3 +1;
                    y=(curr-1)%3 +1;
                    XO[ x-1 ][ y-1 ]= 'X' ; 
                    System.out.println(x+" "+y);
                    frame.setCell(player);
                    System.out.println("here player 1 choice");
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
            Joystic.turn = ! Joystic.turn ;
            break;
            case 'U':                
                if( curr!=1 && curr!=2 &&curr!=3)
                {
               //     while  (stick.getChar()=='U'){}                        
                    frame.selectCell( curr-3 ,player);
                    System.out.println("here player 1 up");
                }
                break;
            case 'D':
                if( curr!=7 && curr!=8&&curr!=9)
                {
                  //   while  (stick.getChar()=='D'){}                        
                    frame.selectCell( curr+3 ,player);
                    System.out.println("here player 1 down");
                }
                break;
            case 'R':
                if( curr!=3 && curr!=6 &&curr!=9)
                {
                //     while  (stick.getChar()=='R'){}                        
                    frame.selectCell( curr+1 ,player);
                    System.out.println("here player 1 right");
                }
                break;
            case 'L':
                if( curr!=1 && curr!=4 &&curr!=7)
                {
                 //    while  (stick.getChar()=='L'){}                        
                    frame.selectCell( curr-1 ,player);
                    System.out.println("here player 1 left");
                }
                break;
            default:
            frame.selectCell( 0 ,player);
            break;
        }
        }
        else if (UI.isSingle==1 && player==2 )
        {
            if(n==0)
            {
            if( x==1&&y==1 || x==3&&y==3 || x==1&&y==3 || x==3&&y==1 )
            {
                x=y=2; 
                q=1;
                System.out.println("222222222222222 222222222222222");
            }
            else if(x==2&&y==2)
            {
                for(;;) {
                q=2;            
                x=rand.nextInt(3) + 1;
                y=rand.nextInt(3) + 1;
                if(x!=2&&y!=2)
                break;
            }
            }            
            else
            {
            q=3;
            if(x==2&&y!=2)
            for(;;) {
            x = rand.nextInt(3) + 1;
            if(XO[x-1][y-1]=='-')
            break;
            }
            if(x!=2&&y==2)
            for(;;) {
            y=rand.nextInt(3) + 1;
            if(XO[x-1][y-1]=='-')
            break; }
            }
            choice(x,y);
            }
            else if(n>0)
            {
                for( int j=0;j<3;j++)
                {
                    m=0;defend=itsadefend.NO;
                    for(int i=0;i<3;i++)                            //win
                    {                                               //by
                        if(XO[j][i]=='O')                           //rows
                        m++;
                        else if(XO[j][i]=='-')
                        {a=j;b=i;
                        defend=itsadefend.YES;
                        }
                    }
                    if(m==2&&defend==itsadefend.YES)
                    {
                        x=a+1;y=b+1;
                        //choice:
                         choice(x,y);
                       //System.out.println("win by rows");
                       continue outerloop;
                    }
                }
    
    
                //.......................
                for(int j=0;j<3;j++)
                {
                    m=0;defend=itsadefend.NO;
                    for(int i=0;i<3;i++)                        //win
                    {                                           //by
                        if(XO[i][j]=='O')                       //columes
                        m++;
                        else if(XO[i][j]=='-')
                        {a=i;b=j;
                        defend=itsadefend.YES;
                        }
                    }
                    if(m==2&&defend==itsadefend.YES)
                    {
                        x=a+1;y=b+1;
                        //choice:
                    choice(x,y);
                        //System.out.println("win by columns");
                        continue outerloop;
                    }
                }
                   
                   ///////////////////////////
                if(q!=2)
                {
                 m=0;defend=itsadefend.NO;
                 for(int j=0,i=0;j<3&&i<3;j++,i++)
                 if(XO[j][i]=='O')
                 m++;                                            //win
                 else if(XO[j][i]=='-')                          //by
                 {a=b=j;                                         //district
                 defend=itsadefend.YES;
                 }
                 if(m==2&&defend==itsadefend.YES)
                 {
                 x=y=a+1;
                 //goto choice;
                    choice(x,y);
                 //System.out.println("win by district 1");
                continue;
                 }
                 //................................
                 m=0;defend=itsadefend.NO;
                 for(int j=0,i=2;j<3&&i>=0;j++,i--)
                 if(XO[j][i]=='O')
                 m++;
                 else if(XO[j][i]=='-')
                 {a=j;b=i;
                 defend=itsadefend.YES;
                 }
                 if(m==2&&defend==itsadefend.YES)
                 {
                 x=a+1;y=b+1;
                 //goto choice;
                    choice(x,y);
                 //System.out.println("win by district 2");
                 continue;
                 }
                }                
                ////////////////////////    
                for(int j=0;j<3;j++)
                {
                    m=0;defend=itsadefend.NO;
                    for(int i=0;i<3;i++)                        //defend
                    {                                           //for
                        if(XO[j][i]=='X')                       //rows
                        m++;
                        else if(XO[j][i]=='-')
                        {a=j;b=i;
                        defend=itsadefend.YES;
                        }
                    }
                    if(m==2&&defend==itsadefend.YES)
                    {
                        x=a+1;y=b+1;
                        //goto choice;
                    choice(x,y);
                    //System.out.println("defend for rows");
                        continue outerloop;
                    }
                }
                //////////////////////////////
                for(int j=0;j<3;j++)
                {
                    m=0;defend=itsadefend.NO;
                    for(int i=0;i<3;i++)                        //defend
                    {                                           //for
                        if(XO[i][j]=='X')                       //columes
                        m++;
                        else if(XO[i][j]=='-')
                        {a=i;b=j;
                        defend=itsadefend.YES;
                        }
                    }
                    if(m==2&&defend==itsadefend.YES)
                    {
                        x=a+1;y=b+1;
                        //goto choice;
                    choice(x,y);
                    //System.out.println("defend for columns");
                        continue outerloop;
                    }
                }
                //////////////////////////////////
                if(q!=1)
                {
                    m=0;
                    defend=itsadefend.NO;
                    for(int j=0,i=0;j<3&&i<3;j++,i++)
                    if(XO[j][i]=='X')
                    m++;
                    else if(XO[j][i]=='-')
                    {a=b=j;
                    defend=itsadefend.YES;
                    }                                                       //defend
                    if(m==2&&defend==itsadefend.YES)
                    {                                                       //for
                    x=y=a+1;
                    //goto choice;                                          //destrict
                    choice(x,y);
                    //System.out.println("defend for district1");
                    continue;
                    }
                    //..............................
                    m=0;defend=itsadefend.NO;
                    for(int j=0,i=2;j<3&&i>=0;j++,i--)
                    if(XO[j][i]=='X')   m++;
                    else if(XO[j][i]=='-')
                    {a=j;b=i;
                    defend=itsadefend.YES;
                    }
                    if(m==2&&defend==itsadefend.YES)
                    {
                    x=a+1;y=b+1;
                    //goto choice;
                    choice(x,y);
                    continue;
                    }
                }
               
                ///////////////////////////////
                if(q == 1)
                {                    
                if(x==2&&y==3)
                for(;;) {
                x=rand.nextInt(3) + 1;
                if(XO[x-1][y-1]=='-'&&x!=2)
                {
                    //goto choice;
                    choice(x,y);
                    continue outerloop;
                }
                
                }
                else if(x==3&&y==2)
                for(;;) {
                y=rand.nextInt(3) + 1;
                if(XO[x-1][y-1]=='-'&&y!=2)
                {
                    //goto choice;
                    choice(x,y);
                    continue outerloop;
                }
                
                }
                else
                for(;;) {
                x=rand.nextInt(3) + 1;y=rand.nextInt(3) + 1;
                if(x==2&&XO[x-1][y-1]=='-'||y==2&&XO[x-1][y-1]=='-')
                {
                    //goto choice;
                    choice(x,y);
                    continue outerloop;
                }               
               
                }
                }
                else if(q==2 && XO[2][0]=='-') {
                x=3;y=1;
                //goto choice;
                choice(x,y);
                continue;
                }
                else if(q==3&&XO[1][1]=='-')
                {                    
                    x=y=2;
                    choice(x, y);
                }                    
                else {
                for(;;) {
                x=rand.nextInt(3) + 1;
                y=rand.nextInt(3) + 1;
                    
                if(XO[x-1][y-1]=='-')
                {
                    //choice:
                    System.out.println("qelse");
                    choice(x,y);
                    continue outerloop;
                }                
                
                }
                }
                
                }
        
        }
    }    
    
     
    }


}