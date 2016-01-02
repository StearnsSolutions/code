/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author jraega
 */
public class MainGUI extends JFrame {
    
    public MainGUI() {
        initComponents();
    }
    
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainGUI().setVisible(true);
        });
    }

    private void initComponents() {
        helloLabel = new JLabel();
        helloLabel.setText("Hello GUI!");
        
        this.add(helloLabel);
        this.pack();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int left = dim.width / 2 - this.getSize().width / 2;
        int top = dim.height / 2 - this.getSize().height / 2;
        this.setLocation(left, top);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    private JLabel helloLabel;
}
