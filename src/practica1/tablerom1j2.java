package practica1;

import java.awt.Color;
import java.awt.Label;
import java.awt.MenuComponent;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class tablerom1j2 extends javax.swing.JFrame {
    private ArrayList<JPanel> Panels; 
    boolean player = true;
    int n;
    public tablerom1j2() {
        initComponents();
        Panels = new ArrayList<>();
        this. setLocationRelativeTo(null);
        generarCerillo();//metodo para que aparezcan las cartas
        btn_player1.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_modalidad = new javax.swing.JLabel();
        btn_salir = new javax.swing.JButton();
        btn_volver = new javax.swing.JButton();
        jLabel_Title = new javax.swing.JLabel();
        btn_fila1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        btn_fila2 = new javax.swing.JButton();
        btn_fila3 = new javax.swing.JButton();
        btn_fila4 = new javax.swing.JButton();
        btn_fila5 = new javax.swing.JButton();
        btn_fila6 = new javax.swing.JButton();
        btn_fila7 = new javax.swing.JButton();
        btn_fila8 = new javax.swing.JButton();
        btn_fila9 = new javax.swing.JButton();
        btn_fila10 = new javax.swing.JButton();
        btn_newgame = new javax.swing.JButton();
        btn_player2 = new javax.swing.JButton();
        btn_player1 = new javax.swing.JButton();

        jLabel_modalidad.setFont(new java.awt.Font("Adobe Hebrew", 0, 18)); // NOI18N
        jLabel_modalidad.setText("<html>En este juego, dos jugadores, reciben un tablero con un número arbitrario de fichas sobre el, separadas en filas y columnas. Tanto el número de filas como el número de fichas en cada fila son también arbitrarios. El primer jugador toma cualquier número de fichas de una fila, entre uno y el total de la fila, pero sólo de una fila. El segundo jugador hace su jugada de manera similar, retirando algunos de las fichas que quedan, y los jugadores van alternándose en sus jugadas.<html>");
        jLabel_modalidad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_salir.setBackground(new java.awt.Color(245, 245, 220));
        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar-sesion.png"))); // NOI18N
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, 40, -1));

        btn_volver.setBackground(new java.awt.Color(245, 245, 220));
        btn_volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regreso.png"))); // NOI18N
        btn_volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_volverMouseClicked(evt);
            }
        });
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });
        getContentPane().add(btn_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, -1));

        jLabel_Title.setFont(new java.awt.Font("Adobe Hebrew", 1, 48)); // NOI18N
        jLabel_Title.setText("MODALITY 1");
        getContentPane().add(jLabel_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        btn_fila1.setBackground(new java.awt.Color(245, 245, 220));
        btn_fila1.setText("Fila 1");
        btn_fila1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_fila1MouseClicked(evt);
            }
        });
        btn_fila1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fila1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_fila1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 70, -1, 20));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 820, 20));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 820, 20));
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 820, 20));
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 820, 20));
        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 820, 20));
        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 820, 20));
        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 820, 20));
        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 820, 20));
        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 820, 20));
        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 820, 20));

        btn_fila2.setBackground(new java.awt.Color(245, 245, 220));
        btn_fila2.setText("Fila 2");
        btn_fila2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_fila2MouseClicked(evt);
            }
        });
        btn_fila2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fila2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_fila2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 100, -1, 20));

        btn_fila3.setBackground(new java.awt.Color(245, 245, 220));
        btn_fila3.setText("Fila 3");
        btn_fila3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_fila3MouseClicked(evt);
            }
        });
        btn_fila3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fila3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_fila3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 130, -1, 20));

        btn_fila4.setBackground(new java.awt.Color(245, 245, 220));
        btn_fila4.setText("Fila 4");
        btn_fila4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_fila4MouseClicked(evt);
            }
        });
        getContentPane().add(btn_fila4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 160, -1, 20));

        btn_fila5.setBackground(new java.awt.Color(245, 245, 220));
        btn_fila5.setText("Fila 5");
        btn_fila5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_fila5MouseClicked(evt);
            }
        });
        getContentPane().add(btn_fila5, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 190, -1, 20));

        btn_fila6.setBackground(new java.awt.Color(245, 245, 220));
        btn_fila6.setText("Fila 6");
        btn_fila6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_fila6MouseClicked(evt);
            }
        });
        getContentPane().add(btn_fila6, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 220, -1, 20));

        btn_fila7.setBackground(new java.awt.Color(245, 245, 220));
        btn_fila7.setText("Fila 7");
        btn_fila7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_fila7MouseClicked(evt);
            }
        });
        getContentPane().add(btn_fila7, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 250, -1, 20));

        btn_fila8.setBackground(new java.awt.Color(245, 245, 220));
        btn_fila8.setText("Fila 8");
        btn_fila8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_fila8MouseClicked(evt);
            }
        });
        getContentPane().add(btn_fila8, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 280, -1, 20));

        btn_fila9.setBackground(new java.awt.Color(245, 245, 220));
        btn_fila9.setText("Fila 9");
        btn_fila9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_fila9MouseClicked(evt);
            }
        });
        getContentPane().add(btn_fila9, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 310, -1, 20));

        btn_fila10.setBackground(new java.awt.Color(245, 245, 220));
        btn_fila10.setText("Fila 10");
        btn_fila10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_fila10MouseClicked(evt);
            }
        });
        getContentPane().add(btn_fila10, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 340, -1, 20));

        btn_newgame.setBackground(new java.awt.Color(245, 245, 220));
        btn_newgame.setText("New game");
        btn_newgame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_newgameMouseClicked(evt);
            }
        });
        btn_newgame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newgameActionPerformed(evt);
            }
        });
        getContentPane().add(btn_newgame, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 170, -1));

        btn_player2.setBackground(new java.awt.Color(245, 245, 220));
        btn_player2.setText("Move player 2 ");
        btn_player2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_player2MouseClicked(evt);
            }
        });
        btn_player2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_player2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_player2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 370, 150, 20));

        btn_player1.setText("Move player 1");
        btn_player1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_player1MouseClicked(evt);
            }
        });
        getContentPane().add(btn_player1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 150, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generarCerillo(){
        btn_fila1.setVisible(false);
        btn_fila2.setVisible(false);
        btn_fila3.setVisible(false);
        btn_fila4.setVisible(false);
        btn_fila5.setVisible(false);
        btn_fila6.setVisible(false);
        btn_fila7.setVisible(false);
        btn_fila8.setVisible(false);
        btn_fila9.setVisible(false);
        btn_fila10.setVisible(false);
        int filas= (int) (Math.random()*9+1);
        for(int j=1; j<=filas; j++){
            switch(j) {
                case 1:Panels.add(jPanel1);
                       btn_fila1.setVisible(true);
                       break;
                
                case 2:Panels.add(jPanel2);
                       btn_fila2.setVisible(true);
                       break;
                       
                case 3:Panels.add(jPanel3);
                       btn_fila3.setVisible(true);
                       break;
                       
                case 4:Panels.add(jPanel4);
                       btn_fila4.setVisible(true);
                       break;
                       
                case 5:Panels.add(jPanel5);
                       btn_fila5.setVisible(true);                        
                       break;
                       
                case 6:Panels.add(jPanel6);
                       btn_fila6.setVisible(true);
                       break;
                       
                case 7:Panels.add(jPanel7);
                       btn_fila7.setVisible(true);
                       break;
                       
                case 8:Panels.add(jPanel8);
                       btn_fila8.setVisible(true);
                       break;
                       
                case 9:Panels.add(jPanel9);
                       btn_fila9.setVisible(true);
                       break;
                       
                case 10:Panels.add(jPanel10);
                        btn_fila10.setVisible(true);
                        break;
            }
        }
        for (JPanel Panel : Panels) {    
        int columnas = (int) (Math.random()*24+1);
        n = columnas + n;    
        ArrayList<JLabel> Labels = new ArrayList<>();
          //  System.out.println(columnas);
            for (int i = 1; i <= columnas; i++) {
                JLabel Label = new JLabel();
                Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/casino.png")));
                Panel.add(Label);
                Panel.revalidate();
                Panel.repaint();
            //    Labels.add(Label); 
            }                       
        }
        System.out.println(n);
    }
    
    private void ganador(int n){
        if(n==0){
            if(player == false){JOptionPane.showMessageDialog(null, "El perdedor es el jugador 2");}
            if(player == true) {JOptionPane.showMessageDialog(null, "El perdedor es el jugador 1");}
        }
    }
    private void retirocerillo(int j){
        Panels.get(j).remove(Panels.get(j).getComponentCount()-1);
        Panels.get(j).revalidate();
        Panels.get(j).repaint();
    }
    
    private void condicionbotones(int i){
        if(i==0){btn_fila1.setEnabled(true);
                btn_fila2.setEnabled(true);
                btn_fila3.setEnabled(true);
                btn_fila4.setEnabled(true);
                btn_fila5.setEnabled(true);
                btn_fila6.setEnabled(true);
                btn_fila7.setEnabled(true);
                btn_fila8.setEnabled(true);
                btn_fila9.setEnabled(true);
                btn_fila10.setEnabled(true);
            
        }
        else{
        for(int j=1; j<=10; j++)
            if(j != i){
                switch(j) {
                    
                case 1:btn_fila1.setEnabled(false);
                       break;
                
                case 2:btn_fila2.setEnabled(false);
                       break;
                       
                case 3:btn_fila3.setEnabled(false);
                       break;
                       
                case 4:btn_fila4.setEnabled(false);
                       break;
                       
                case 5:btn_fila5.setEnabled(false);                        
                       break;
                       
                case 6:btn_fila6.setEnabled(false);
                       break;
                       
                case 7:btn_fila7.setEnabled(false);
                       break;
                       
                case 8:btn_fila8.setEnabled(false);
                       break;
                       
                case 9:btn_fila9.setEnabled(false);
                       break;
                       
                case 10:btn_fila10.setEnabled(false);
                        break;
            }
        
    }}}
    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
           System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_volverMouseClicked
        modality x = new modality();
        x.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_volverMouseClicked

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_volverActionPerformed

    private void btn_fila1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fila1ActionPerformed
       
    }//GEN-LAST:event_btn_fila1ActionPerformed

    private void btn_fila1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_fila1MouseClicked
        if(btn_fila1.isEnabled()){
            if (Panels.get(0).getComponentCount()>0){
                retirocerillo(0);
                condicionbotones(1);
                n = n-1;
                ganador(n);
            }
        }
    }//GEN-LAST:event_btn_fila1MouseClicked

    private void btn_newgameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newgameActionPerformed
       
    }//GEN-LAST:event_btn_newgameActionPerformed

    private void btn_fila2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fila2ActionPerformed
   
    }//GEN-LAST:event_btn_fila2ActionPerformed

    private void btn_fila2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_fila2MouseClicked
        if(btn_fila2.isEnabled()){
            if (Panels.get(1).getComponentCount()>0){
                retirocerillo(1);
                condicionbotones(2);
                n = n-1;
                ganador(n); 
            }
        }
    }//GEN-LAST:event_btn_fila2MouseClicked

    private void btn_fila3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_fila3MouseClicked
        if(btn_fila3.isEnabled()){
            if (Panels.get(2).getComponentCount()>0){
                retirocerillo(2);
                condicionbotones(3);
                n = n-1;
                ganador(n);
            }
        }
    }//GEN-LAST:event_btn_fila3MouseClicked

    private void btn_fila3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fila3ActionPerformed
    
    }//GEN-LAST:event_btn_fila3ActionPerformed

    private void btn_fila4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_fila4MouseClicked
        if(btn_fila4.isEnabled()){
            if (Panels.get(3).getComponentCount()>0){
                retirocerillo(3);
                condicionbotones(4);
                n = n-1;
                ganador(n);
            }
        }
    }//GEN-LAST:event_btn_fila4MouseClicked

    private void btn_fila5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_fila5MouseClicked
        if(btn_fila5.isEnabled()){
            if (Panels.get(4).getComponentCount()>0){
                retirocerillo(4);
                condicionbotones(5);
                n = n-1;
                ganador(n);
            }
        }
    }//GEN-LAST:event_btn_fila5MouseClicked

    private void btn_fila6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_fila6MouseClicked
        if(btn_fila6.isEnabled()){
            if (Panels.get(5).getComponentCount()>0){
                retirocerillo(5);
                condicionbotones(6);
                n = n-1;
                ganador(n);
            }
        }
    }//GEN-LAST:event_btn_fila6MouseClicked

    private void btn_fila7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_fila7MouseClicked
        if(btn_fila7.isEnabled()){
            if (Panels.get(6).getComponentCount()>0){
                retirocerillo(6);
                condicionbotones(7);
                n = n-1;
                ganador(n);
            }
        }
    }//GEN-LAST:event_btn_fila7MouseClicked

    private void btn_fila8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_fila8MouseClicked
        if(btn_fila8.isEnabled()){
            if (Panels.get(7).getComponentCount()>0){
                retirocerillo(7);
                condicionbotones(8);
                n = n-1;
                ganador(n);
            }
        }
    }//GEN-LAST:event_btn_fila8MouseClicked

    private void btn_fila9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_fila9MouseClicked
        if(btn_fila9.isEnabled()){
            if (Panels.get(8).getComponentCount()>0){
                retirocerillo(8);;
                condicionbotones(9);
                n = n-1;
                ganador(n);
            }
        }
    }//GEN-LAST:event_btn_fila9MouseClicked

    private void btn_fila10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_fila10MouseClicked
        if(btn_fila10.isEnabled()){
            if (Panels.get(9).getComponentCount()>0){
                retirocerillo(9);
                condicionbotones(10);
            }
        }
    }//GEN-LAST:event_btn_fila10MouseClicked

    private void btn_player2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_player2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_player2ActionPerformed

    private void btn_player2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_player2MouseClicked
        if (player == true){
            btn_player2.setEnabled(false);
            btn_player1.setEnabled(true);
            player = false;
            condicionbotones(0);
        }
    }//GEN-LAST:event_btn_player2MouseClicked

    private void btn_player1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_player1MouseClicked
            if (player == false){
            btn_player1.setEnabled(false);
            btn_player2.setEnabled(true);
            player = true;
            condicionbotones(0);
        }
    }//GEN-LAST:event_btn_player1MouseClicked

    private void btn_newgameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_newgameMouseClicked
        play x = new play();
        x.setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_newgameMouseClicked

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(tablerom1j2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tablerom1j2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tablerom1j2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tablerom1j2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tablerom1j2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_fila1;
    private javax.swing.JButton btn_fila10;
    private javax.swing.JButton btn_fila2;
    private javax.swing.JButton btn_fila3;
    private javax.swing.JButton btn_fila4;
    private javax.swing.JButton btn_fila5;
    private javax.swing.JButton btn_fila6;
    private javax.swing.JButton btn_fila7;
    private javax.swing.JButton btn_fila8;
    private javax.swing.JButton btn_fila9;
    private javax.swing.JButton btn_newgame;
    private javax.swing.JButton btn_player1;
    private javax.swing.JButton btn_player2;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton btn_volver;
    private javax.swing.JLabel jLabel_Title;
    private javax.swing.JLabel jLabel_modalidad;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
