/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renamer;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * @author Administrator
 */
public class MainWnd extends javax.swing.JDialog
{

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField afterTxt;
    private javax.swing.JTextField beforeTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField startNum;
    private javax.swing.JTextField stepSize;
    /**
     * Creates new form MainWnd
     */
    public MainWnd (java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
        jFileChooser1.setControlButtonsAreShown(false);
    }

    private static void run ()
    {
        MainWnd dialog = new MainWnd(new JFrame(), true);
        dialog.setTitle("Bulk Renamer");
        dialog.setResizable(false);
        dialog.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing (WindowEvent e)
            {
                System.exit(0);
            }
        });
        dialog.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents ()
    {

        jFileChooser1 = new javax.swing.JFileChooser();
        startNum = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        beforeTxt = new javax.swing.JTextField();
        afterTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        stepSize = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jFileChooser1.setFileSelectionMode(
                javax.swing.JFileChooser.FILES_AND_DIRECTORIES);
        jFileChooser1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        startNum.setText("0");

        jLabel1.setText("StartNum");

        jLabel2.setText("Before");

        jLabel3.setText("After");

        jButton1.setText("Rename");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed (java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Step");

        stepSize.setText("1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jFileChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel3)
                                                                        .addComponent(jLabel2))
                                                                .addGap(22, 22, 22)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(beforeTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                                                                        .addComponent(afterTxt)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel1)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(startNum, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel4)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(stepSize, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(startNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel4)
                                                        .addComponent(stepSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(beforeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(afterTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed (java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        //String n = jFileChooser1.getSelectedFile().getPath();
        //System.out.println(n);
        File f = jFileChooser1.getSelectedFile();
        if (f == null)
            return;
        renamerEngine(f.getAbsolutePath());
        jFileChooser1.rescanCurrentDirectory();
    }//GEN-LAST:event_jButton1ActionPerformed

    private File getPath (String in)
    {
        File f_in = new File(in);
        if (f_in.isFile())
        {
            f_in = new File(f_in.getParent());
        }
        return f_in;
    }

    private int loadValue (JTextField t, int def)
    {
        try
        {
            return Integer.parseInt(t.getText());
        }
        catch (NumberFormatException e)
        {
            return def;
        }
    }

    public void renamerEngine (String s_in)
    {
        File[] files = getPath(s_in).listFiles();
        if (files == null)
        {
            System.out.println("Not a dir");
            return;
        }
        int num = loadValue (startNum,0);;
        int step = loadValue (stepSize,1);
        String before = beforeTxt.getText();
        String after = afterTxt.getText();
        for (File file : files)
        {
            if (file.isFile())
            {
                String extension = "";
                String fileName = file.getName();
                int i = fileName.lastIndexOf('.');
                if (i > 0)
                {
                    extension = fileName.substring(i + 1);
                }
                while (true)
                {
                    num += step;
                    File newFile = new File(file.getParent(),
                            before + num + after + "." + extension);
                    try
                    {
                        Files.move(file.toPath(), newFile.toPath());
                        break;
                    }
                    catch (IOException e)
                    {
                        System.out.println(e+"---"+num);
                    }
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main (String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(MainWnd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(MainWnd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(MainWnd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(MainWnd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(MainWnd::run);
    }
    // End of variables declaration//GEN-END:variables
}
