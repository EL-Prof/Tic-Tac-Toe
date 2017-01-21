/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iTi.Project.Game;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author Passant
 */
public class UI extends javax.swing.JFrame {

    private String whoseTurn="X";
    private String playerOne="Player One";
    private String playerTwo="Player Two";
    private int playerOneCount=0;
    private int playerTwoCount=0;
    private int playerOneIndex = 1 ;
    private int playerTwoIndex  = 1 ;
    private Color playerOneColor = Color.RED ;
    private Color playerTwoColor = Color.BLUE ;
    private Color DefaultColor = Color.WHITE;
    int test = 2;
    public static int isSingle;

    public boolean isFinished()
    {
        /*
        return true if the game finished 
        return false in the normal
        */
        boolean result ; 
        result = determineIfWin(); 
        if(result)
            return result ; 
        else 
            result = tieGame() ;
        return result ; 
    }   
    
    public int getIndex(int p)
    {
        /*
        p is parameter for player no.
        return the cell number 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 or 9
        */
        switch (p){
            case 1:  return playerOneIndex ; 
            case 2 : return playerTwoIndex ; 
            default: return 0 ; 
        }
    }
    public void setIndex(int p1 , int p2)
    {
        playerOneIndex = p1 ; 
        playerTwoIndex = p2 ; 
    
    }
    
    
    public void setCell(int p)
    {
        /*
        p is parameter for player no.
        to set cell with the character for the player       
        */
        if(p == 1)
        {
            switch(playerOneIndex){
                case 1 :  jButton1.setText("X");
                jButton1.setForeground(Color.pink); 
                jPanel_1.setBackground(DefaultColor);break ;
                case 2 :  jButton2.setText("X");
                jButton2.setForeground(Color.pink);
                 jPanel_2.setBackground(DefaultColor);break ; 
                case 3 :  jButton3.setText("X");
                jButton3.setForeground(Color.pink); 
                 jPanel_3.setBackground(DefaultColor);break ; 
                case 4 :  jButton4.setText("X");
                jButton4.setForeground(Color.pink); 
                 jPanel_4.setBackground(DefaultColor);break ; 
                case 5 :  jButton5.setText("X");
                jButton5.setForeground(Color.pink); 
                 jPanel_5.setBackground(DefaultColor);break ; 
                case 6 :  jButton6.setText("X");
                jButton6.setForeground(Color.pink); 
                 jPanel_6.setBackground(DefaultColor);break ; 
                case 7 :  jButton7.setText("X");
                jButton7.setForeground(Color.pink); 
                 jPanel_7.setBackground(DefaultColor);break ; 
                case 8 :  jButton8.setText("X");
                jButton8.setForeground(Color.pink); 
                 jPanel_8.setBackground(DefaultColor);break ; 
                case 9 :  jButton9.setText("X");
                jButton9.setForeground(Color.pink); 
                 jPanel_9.setBackground(DefaultColor);break ; 
                   }
            if(isSingle==0)
            {
                playerTwoIndex = 1 ; 
                jPanel_1.setBackground(playerTwoColor);
            }
        }
          else
        {
            switch(playerTwoIndex){
                case 1 :  jButton1.setText("O");
                jButton1.setForeground(Color.gray);
                 jPanel_1.setBackground(DefaultColor);break ; 
                case 2 :  jButton2.setText("O");
                jButton2.setForeground(Color.gray);
                 jPanel_2.setBackground(DefaultColor);break ; 
                case 3 :  jButton3.setText("O");
                jButton3.setForeground(Color.gray);
                 jPanel_3.setBackground(DefaultColor);break ; 
                case 4 :  jButton4.setText("O");
                jButton4.setForeground(Color.gray);
                 jPanel_4.setBackground(DefaultColor);break ; 
                case 5 :  jButton5.setText("O");
                jButton5.setForeground(Color.gray);
                 jPanel_5.setBackground(DefaultColor);break ; 
                case 6 :  jButton6.setText("O");
                jButton6.setForeground(Color.gray);
                 jPanel_6.setBackground(DefaultColor);break ; 
                case 7 :  jButton7.setText("O");
                jButton7.setForeground(Color.gray);
                 jPanel_7.setBackground(DefaultColor);break ; 
                case 8 :  jButton8.setText("O");
                jButton8.setForeground(Color.gray);
                 jPanel_8.setBackground(DefaultColor);break ; 
                case 9 :  jButton9.setText("O");
                jButton9.setForeground(Color.gray);
                 jPanel_9.setBackground(DefaultColor);break ; 
                 }
            if(isSingle==0)
            {
                playerOneIndex = 1 ; 
                jPanel_1.setBackground(playerOneColor);
            }

        }
    //     determineIfWin();
    //    tieGame();
        
     }
    
    public void selectCell(int i,int p)
    {
        /*
        p is parameter for player no.
        i is parameter for the index to select a new cell using the arrows in joystic
        */
      
      if (p==1){
          
          switch(playerOneIndex)
          {
              case 1: jPanel_1.setBackground(DefaultColor);break;
              case 2: jPanel_2.setBackground(DefaultColor);break;
              case 3: jPanel_3.setBackground(DefaultColor);break;
              case 4: jPanel_4.setBackground(DefaultColor);break;
              case 5: jPanel_5.setBackground(DefaultColor);break;
              case 6: jPanel_6.setBackground(DefaultColor);break;
              case 7: jPanel_7.setBackground(DefaultColor);break;
              case 8: jPanel_8.setBackground(DefaultColor);break;
              case 9: jPanel_9.setBackground(DefaultColor);break;
          }
          switch(i)
          {
              case 1 : jPanel_1.setBackground(playerOneColor);break;
              case 2 : jPanel_2.setBackground(playerOneColor);break;
              case 3 : jPanel_3.setBackground(playerOneColor);break;
              case 4 : jPanel_4.setBackground(playerOneColor);break;
              case 5 : jPanel_5.setBackground(playerOneColor);break;
              case 6 : jPanel_6.setBackground(playerOneColor);break;
              case 7 : jPanel_7.setBackground(playerOneColor);break;
              case 8 : jPanel_8.setBackground(playerOneColor);break;
              case 9 : jPanel_9.setBackground(playerOneColor);break;
          }
          
             playerOneIndex = i ;  
       }
      else if  (p==2)
      {
          
          switch(playerTwoIndex)
          {
              case 1: jPanel_1.setBackground(DefaultColor);break;
              case 2: jPanel_2.setBackground(DefaultColor);break;
              case 3: jPanel_3.setBackground(DefaultColor);break;
              case 4: jPanel_4.setBackground(DefaultColor);break;
              case 5: jPanel_5.setBackground(DefaultColor);break;
              case 6: jPanel_6.setBackground(DefaultColor);break;
              case 7: jPanel_7.setBackground(DefaultColor);break;
              case 8: jPanel_8.setBackground(DefaultColor);break;
              case 9: jPanel_9.setBackground(DefaultColor);break;
          }
          switch(i)
          {
              case 1 : jPanel_1.setBackground(playerTwoColor);break ; 
              case 2 : jPanel_2.setBackground(playerTwoColor);break ; 
              case 3 : jPanel_3.setBackground(playerTwoColor);break ; 
              case 4 : jPanel_4.setBackground(playerTwoColor);break ; 
              case 5 : jPanel_5.setBackground(playerTwoColor);break;
              case 6 : jPanel_6.setBackground(playerTwoColor);break;
              case 7 : jPanel_7.setBackground(playerTwoColor);break;
              case 8 : jPanel_8.setBackground(playerTwoColor);break;
              case 9 : jPanel_9.setBackground(playerTwoColor);break;
          }
          
          playerTwoIndex = i ;
      
      }
      
       }
   
   
  private void setScore()
  {
  jLabel_Score.setText(playerOne + "'s Score is :" +String.valueOf(playerOneCount)+"\t                        " + playerTwo + "'s Score is :" + String.valueOf(playerTwoCount));
  
  }
    public void singleOrMultiple()  
  {
        //String choose = JOptionPane.showConfirmDialog(this, "Single player or multi player", "your choose", JOptionPane.QUESTION_MESSAGE);
        isSingle=JOptionPane.showOptionDialog(this,"Single or Multiplayer ?","",JOptionPane.OK_CANCEL_OPTION,
                 JOptionPane.INFORMATION_MESSAGE,null, new String[]{"Multi", "Single"}/*this is the array*/,"default");
        System.out.println(isSingle);
  }
 
  private void getPlayerName()  
  {
      playerOne=JOptionPane.showInputDialog(this, "Player one name", "Player Name", JOptionPane.INFORMATION_MESSAGE);
      if(playerOne.equals(""))
      {playerOne = "Player One";}
      if(isSingle==0)
      {
          playerTwo=JOptionPane.showInputDialog(this, "Player two name", "Player Name", JOptionPane.INFORMATION_MESSAGE);
            if(playerTwo.equals(""))
            {playerTwo = "Player Two";}
      }
      else
      {
          playerTwo = "PC";
      }
        
      
  }

  
  
    
    public UI() {
        initComponents();
       // setSize(600,600);
        setLocationRelativeTo(null);
        singleOrMultiple();
       getPlayerName();
  //     playerOneColor = jPanel_1.getBackground();
  //     playerTwoColor = jPanel_2.getBackground();
  //     DefaultColor = jPanel1.getBackground();
   //     selectCell(1, 1);
   //     selectCell(1, 2);

    }

    private void determinewhoseTurn()
    {
    if (whoseTurn.equalsIgnoreCase("X"))
    {
    whoseTurn = "O";
    }
    else{
    whoseTurn = "X";
    }
    }
    
    private void xWins()
    {JOptionPane.showMessageDialog(this, playerOne+" wins", "Winner", JOptionPane.INFORMATION_MESSAGE);
        playerOneCount ++;
    resetGame();
    }
        private void oWins()
    {JOptionPane.showMessageDialog(this, playerTwo+" wins", "Winner", JOptionPane.INFORMATION_MESSAGE);
        playerTwoCount ++;
    resetGame();
    }

        private void resetGame()
        {
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        if(isSingle==1)
        {
            jPanel_1.setBackground(playerOneColor);
            playerOneIndex=1;
        }
        setScore();
        }
        
        private Boolean determineIfWin()
        {
        String one = jButton1.getText();
        String two = jButton2.getText();
        String three = jButton3.getText();
        String four = jButton4.getText();
        String five = jButton5.getText();
        String six = jButton6.getText();
        String seven = jButton7.getText();
        String eight = jButton8.getText();
        String nine = jButton9.getText();
       
        if( (one == "X" && four == "X" && seven == "X")||
        (seven == "X" && eight == "X" && nine == "X")||
        (two == "X" && five == "X" && eight == "X")||
        (four == "X" && five == "X" && six == "X")||
        (three == "X" && six == "X" && nine == "X")||
        (one == "X" && two == "X" && three == "X")||
        (one == "X" && five == "X" && nine == "X")||
        (three == "X" && five == "X" && seven == "X") ) {
            xWins();
            System.out.println("xWINSSS");
            return true ; 
        }
       
       else if ( (one == "O" && two == "O" && three == "O") ||
        (four == "O" && five == "O" && six == "O") ||
        (seven == "O" && eight == "O" && nine == "O")||
        (one == "O" && four == "O" && seven == "O") ||
        (two == "O" && five == "O" && eight == "O") ||
        (three == "O" && six == "O" && nine == "O") ||
        (one == "O" && five == "O" && nine == "O") ||
        (three == "O" && five == "O" && seven == "O") ) {
           oWins();
       return true; 
       }
        else return false ; 
        }
        private boolean tieGame()
        {
        String one = jButton1.getText();
        String two = jButton2.getText();
        String three = jButton3.getText();
        String four = jButton4.getText();
        String five = jButton5.getText();
        String six = jButton6.getText();
        String seven = jButton7.getText();
        String eight = jButton8.getText();
        String nine = jButton9.getText();
       
        if(one != "" && two != "" && three != "" && four != "" && five != ""  && six != "" && seven != "" && eight != "" && nine != "")
            {JOptionPane.showMessageDialog(this, "This Game is a tie", "Tie Game", JOptionPane.INFORMATION_MESSAGE);
                resetGame();
                return true ; 
            }
        return false ;  
        }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_Score = new javax.swing.JLabel();
        jPanel_gridholder = new javax.swing.JPanel();
        jPanel_1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel_2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel_3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel_4 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel_5 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel_6 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel_7 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel_8 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel_9 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel_Score.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Score.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabel_Score.setText("Score:");
        jPanel1.add(jLabel_Score, java.awt.BorderLayout.PAGE_END);

        jPanel_gridholder.setBackground(new java.awt.Color(0, 102, 102));
        jPanel_gridholder.setLayout(null);

        jPanel_1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel_1.setForeground(new java.awt.Color(204, 0, 0));
        jPanel_1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton1.setMaximumSize(new java.awt.Dimension(25, 6));
        jButton1.setMinimumSize(new java.awt.Dimension(25, 6));
        jButton1.setPreferredSize(new java.awt.Dimension(25, 6));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel_1.add(jButton1);
        jButton1.setBounds(4, 4, 145, 118);

        jPanel_gridholder.add(jPanel_1);
        jPanel_1.setBounds(1, 0, 154, 127);

        jPanel_2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel_2.setLayout(null);

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton2.setAlignmentX(15.0F);
        jButton2.setAlignmentY(20.0F);
        jButton2.setMaximumSize(new java.awt.Dimension(30, 6));
        jButton2.setMinimumSize(new java.awt.Dimension(30, 6));
        jButton2.setPreferredSize(new java.awt.Dimension(30, 6));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel_2.add(jButton2);
        jButton2.setBounds(4, 4, 145, 118);

        jPanel_gridholder.add(jPanel_2);
        jPanel_2.setBounds(156, 0, 154, 127);

        jPanel_3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel_3.setLayout(null);

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel_3.add(jButton3);
        jButton3.setBounds(4, 4, 145, 118);

        jPanel_gridholder.add(jPanel_3);
        jPanel_3.setBounds(311, 0, 154, 127);

        jPanel_4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel_4.setLayout(null);

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel_4.add(jButton4);
        jButton4.setBounds(4, 4, 145, 118);

        jPanel_gridholder.add(jPanel_4);
        jPanel_4.setBounds(1, 128, 154, 127);

        jPanel_5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel_5.setLayout(null);

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel_5.add(jButton5);
        jButton5.setBounds(4, 4, 145, 118);

        jPanel_gridholder.add(jPanel_5);
        jPanel_5.setBounds(156, 128, 154, 127);

        jPanel_6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel_6.setLayout(null);

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel_6.add(jButton6);
        jButton6.setBounds(4, 4, 145, 118);

        jPanel_gridholder.add(jPanel_6);
        jPanel_6.setBounds(311, 128, 154, 127);

        jPanel_7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel_7.setLayout(null);

        jButton7.setBackground(new java.awt.Color(204, 204, 204));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel_7.add(jButton7);
        jButton7.setBounds(4, 4, 145, 118);

        jPanel_gridholder.add(jPanel_7);
        jPanel_7.setBounds(1, 256, 154, 127);

        jPanel_8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel_8.setLayout(null);

        jButton8.setBackground(new java.awt.Color(204, 204, 204));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel_8.add(jButton8);
        jButton8.setBounds(4, 4, 145, 118);

        jPanel_gridholder.add(jPanel_8);
        jPanel_8.setBounds(156, 256, 154, 127);

        jPanel_9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel_9.setLayout(null);

        jButton9.setBackground(new java.awt.Color(204, 204, 204));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel_9.add(jButton9);
        jButton9.setBounds(4, 4, 145, 118);

        jPanel_gridholder.add(jPanel_9);
        jPanel_9.setBounds(311, 256, 154, 127);

        jPanel1.add(jPanel_gridholder, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 411));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
jButton7.setText(whoseTurn);
if(whoseTurn.equalsIgnoreCase("X"))
{jButton7.setForeground(Color.pink);}
else
{jButton7.setForeground(Color.gray);}
determinewhoseTurn();
determineIfWin();
tieGame();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
jButton8.setText(whoseTurn);
if(whoseTurn.equalsIgnoreCase("X"))
{jButton8.setForeground(Color.pink);}
else
{jButton8.setForeground(Color.gray);}
determinewhoseTurn();
determineIfWin();
tieGame();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
jButton9.setText(whoseTurn);
if(whoseTurn.equalsIgnoreCase("X"))
{jButton9.setForeground(Color.pink);}
else
{jButton9.setForeground(Color.gray);}
determinewhoseTurn();
determineIfWin();
tieGame();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton6.setText(whoseTurn);
        if(whoseTurn.equalsIgnoreCase("X"))
        {jButton6.setForeground(Color.pink);}
        else
        {jButton6.setForeground(Color.gray);}
        determinewhoseTurn();
        determineIfWin();
        tieGame();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton4.setText(whoseTurn);
        if(whoseTurn.equalsIgnoreCase("X"))
        {jButton4.setForeground(Color.pink);}
        else
        {jButton4.setForeground(Color.gray);}
        determinewhoseTurn();
        determineIfWin();
        tieGame();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton5.setText(whoseTurn);
        if(whoseTurn.equalsIgnoreCase("X"))
        {jButton5.setForeground(Color.pink);}
        else
        {jButton5.setForeground(Color.gray);}
        determinewhoseTurn();
        determineIfWin();
        tieGame();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton3.setText(whoseTurn);
        if(whoseTurn.equalsIgnoreCase("X"))
        {jButton3.setForeground(Color.pink);}
        else
        {jButton3.setForeground(Color.gray);}
        determinewhoseTurn();
        determineIfWin();
        tieGame();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setText(whoseTurn);
        if(whoseTurn.equalsIgnoreCase("X"))
        {jButton2.setForeground(Color.pink);}
        else
        {jButton2.setForeground(Color.gray);}
        determinewhoseTurn();
        determineIfWin();
        tieGame();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.setText(whoseTurn);
        if(whoseTurn.equalsIgnoreCase("X"))
        {jButton1.setForeground(Color.pink);}
        else
        {jButton1.setForeground(Color.gray);}
        determinewhoseTurn();
        determineIfWin();
        tieGame();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String []args) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel_Score;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_1;
    private javax.swing.JPanel jPanel_2;
    private javax.swing.JPanel jPanel_3;
    private javax.swing.JPanel jPanel_4;
    private javax.swing.JPanel jPanel_5;
    private javax.swing.JPanel jPanel_6;
    private javax.swing.JPanel jPanel_7;
    private javax.swing.JPanel jPanel_8;
    private javax.swing.JPanel jPanel_9;
    private javax.swing.JPanel jPanel_gridholder;
    // End of variables declaration//GEN-END:variables

}
