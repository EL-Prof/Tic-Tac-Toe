/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iTi.Project.Game;

import java.awt.Color;
import javax.swing.JOptionPane;

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
    private int playerOneIndex ;
    private int playerTwoIndex ;
        
    public boolean isFinished()
    {
        /*
        return true if the game finished 
        return false in the normal
        */
        return false; 
    }   
    
    public int getCell(int p)
    {
        /*
        p is parameter for player no.
        return the cell number 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 or 9
        */
        return 0;
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
                case 1 :  jButton1.setForeground(Color.pink);
            
            }
        
        }
           
        else
        switch(playerOneIndex){
                case 1 :  jButton1.setForeground(Color.gray);
                 }
            
    }
    
    public void selectCell(int i,int p)
    {
        /*
        p is parameter for player no.
        i is parameter for the index to select a new cell using the arrows in joystic
        */
        switch (p){
            case 1: playerOneIndex = i ; break ; 
            case 2 : playerTwoIndex = i ; break ;
        
        }
        
    }
   
   
  private void setScore()
  {
  jLabel_Score.setText(playerOne + "'s Score is :" +String.valueOf(playerOneCount)+"\t                        " + playerTwo + "'s Score is :" + String.valueOf(playerTwoCount));
  
  }
    
  /* 
  private void setPanel()
  {
  int panelNumber;
  char color;
  switch(panelNumber)
      case 1:
          jPanel_1.
  
  }
  */
  private void getPlayerName()
  
  {
      playerOne=JOptionPane.showInputDialog(this, "Player one name", "Player Name", JOptionPane.INFORMATION_MESSAGE);
      playerTwo=JOptionPane.showInputDialog(this, "Player two name", "Player Name", JOptionPane.INFORMATION_MESSAGE);
  if(playerOne.equals(""))
  {playerOne = "Player One";}
  if(playerTwo.equals(""))
  {playerTwo = "Player Two";}
  }

  
    
    public UI() {
        initComponents();
        setSize(600,600);
        setLocationRelativeTo(null);
       getPlayerName();

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
        setScore();
        }
        
        
        
        private void determineIfWin()
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
       
        if(one == "X" && two == "X" && three == "X") {xWins();}
        if(four == "X" && five == "X" && six == "X") {xWins();}
        if(seven == "X" && eight == "X" && nine == "X") {xWins();}
        if(one == "X" && four == "X" && seven == "X") {xWins();}
        if(two == "X" && five == "X" && eight == "X") {xWins();}
        if(three == "X" && six == "X" && nine == "X") {xWins();}
        if(one == "X" && five == "X" && nine == "X") {xWins();}
        if(three == "X" && five == "X" && seven == "X") {xWins();}
       
        if(one == "O" && two == "O" && three == "O") {oWins();}
        if(four == "O" && five == "O" && six == "O") {oWins();}
        if(seven == "O" && eight == "O" && nine == "O") {oWins();}
        if(one == "O" && four == "O" && seven == "O") {oWins();}
        if(two == "O" && five == "O" && eight == "O") {oWins();}
        if(three == "O" && six == "O" && nine == "O") {oWins();}
        if(one == "O" && five == "O" && nine == "O") {oWins();}
        if(three == "O" && five == "O" && seven == "O") {oWins();}
        
        
        }
        private void tieGame()
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
    resetGame();}
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel_Score.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Score.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabel_Score.setText("Score:");
        jPanel1.add(jLabel_Score, java.awt.BorderLayout.PAGE_END);

        jPanel_gridholder.setBackground(new java.awt.Color(0, 102, 102));
        jPanel_gridholder.setLayout(new java.awt.GridLayout(3, 3, 1, 1));

        jPanel_1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));
        jPanel_1.setForeground(new java.awt.Color(204, 0, 0));
        jPanel_1.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel_1.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel_gridholder.add(jPanel_1);

        jPanel_2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel_2.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel_2.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel_gridholder.add(jPanel_2);

        jPanel_3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel_3.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel_3.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel_gridholder.add(jPanel_3);

        jPanel_4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel_4.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel_4.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel_gridholder.add(jPanel_4);

        jPanel_5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel_5.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel_5.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel_gridholder.add(jPanel_5);

        jPanel_6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel_6.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel_6.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel_gridholder.add(jPanel_6);

        jPanel_7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel_7.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel_7.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel_gridholder.add(jPanel_7);

        jPanel_8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel_8.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel_8.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel_gridholder.add(jPanel_8);

        jPanel_9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));
        jPanel_9.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel_9.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel_gridholder.add(jPanel_9);

        jPanel1.add(jPanel_gridholder, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    /**
     * @param args the command line arguments
     */
    public static void init(String args[]) {
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
