/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadManager;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author SQ04
 */
public class ThreadManagerGUI extends javax.swing.JFrame {
private ThreadManager script;
    /**
     * Creates new form ThreadManagerGUI
     */
    public ThreadManagerGUI(ThreadManager script) {
        this.script=script;
        initComponents();
        
          runningBar.setVisible(false);
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
        jToolBar1 = new javax.swing.JToolBar();
        pauseBtn = new javax.swing.JButton();
        killBtn = new javax.swing.JButton();
        resumeBtn = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        delaySuspend = new javax.swing.JTextField();
        suspendBtn = new javax.swing.JButton();
        runningBar = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        threadView = new javax.swing.JList();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thread Manager -Theophilus");

        jToolBar1.setRollover(true);

        pauseBtn.setText("Pause");
        pauseBtn.setFocusable(false);
        pauseBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pauseBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pauseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseBtnActionPerformed(evt);
            }
        });
        jToolBar1.add(pauseBtn);

        killBtn.setText("Kill");
        killBtn.setFocusable(false);
        killBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        killBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        killBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                killBtnActionPerformed(evt);
            }
        });
        jToolBar1.add(killBtn);

        resumeBtn.setText("Resume");
        resumeBtn.setFocusable(false);
        resumeBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        resumeBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        resumeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resumeBtnActionPerformed(evt);
            }
        });
        jToolBar1.add(resumeBtn);

        jToolBar2.setRollover(true);

        delaySuspend.setToolTipText("in milliseconds");
        delaySuspend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delaySuspendActionPerformed(evt);
            }
        });
        jToolBar2.add(delaySuspend);

        suspendBtn.setText("Suspend");
        suspendBtn.setFocusable(false);
        suspendBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        suspendBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        suspendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suspendBtnActionPerformed(evt);
            }
        });
        jToolBar2.add(suspendBtn);

        jToolBar1.add(jToolBar2);

        runningBar.setToolTipText("");
        runningBar.setIndeterminate(true);
        runningBar.setString("Running");
        runningBar.setStringPainted(true);

        jScrollPane1.setViewportView(threadView);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 196, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(runningBar, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(runningBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText("File");

        jMenuItem1.setText("Run");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Stop");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void delaySuspendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delaySuspendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delaySuspendActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
              // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        script.run();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
    script.stop();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void pauseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseBtnActionPerformed
        try{
            ListView selected= (ListView) threadView.getSelectedValue();
            script.suspend(selected.x);
            selected.state="Paused";
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Message:"+ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
             ex.printStackTrace();
        }
    }//GEN-LAST:event_pauseBtnActionPerformed

    private void suspendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suspendBtnActionPerformed
         try{
            ListView selected= (ListView) threadView.getSelectedValue();
            int delay=Integer.parseInt(delaySuspend.getText());
            script.suspend(delay,selected.x);
            selected.state="Suspened For "+delay+" Millisecond";
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Message:"+ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
             ex.printStackTrace();
        }
    }//GEN-LAST:event_suspendBtnActionPerformed

    private void resumeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resumeBtnActionPerformed
         try{
            ListView selected= (ListView) threadView.getSelectedValue();
            script.resume(selected.x);
            selected.state="Resumed";
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Message:"+ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_resumeBtnActionPerformed

    private void killBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_killBtnActionPerformed
       try{
            ListView selected= (ListView) threadView.getSelectedValue();
            script.kill(selected.x);
            selected.state="Killed";
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Message:"+ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }  
    }//GEN-LAST:event_killBtnActionPerformed

    public JProgressBar getRunningBar() {
        return runningBar;
    }

    public JList getThreadView() {
        return threadView;
    }
 
    
    
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ThreadManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThreadManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThreadManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThreadManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThreadManagerGUI(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField delaySuspend;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JButton killBtn;
    private javax.swing.JButton pauseBtn;
    private javax.swing.JButton resumeBtn;
    private javax.swing.JProgressBar runningBar;
    private javax.swing.JButton suspendBtn;
    private javax.swing.JList threadView;
    // End of variables declaration//GEN-END:variables
}
