/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

/**
 *
 * @author jraega
 */
public class MainGUI extends JFrame {
    
    public MainGUI(int numOfLabels) {
        initComponents(numOfLabels);
    }
    
    private void initComponents(int numOfLabels) {
        getContentPane().setLayout(new FlowLayout());
        for (int i = 0; i < numOfLabels; i++) {
            this.add(new JLabel(Integer.toString(i)));
        }
        pack();
        setMinimumSize(new Dimension(300, 200));
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int left = dim.width / 2 - getSize().width / 2;
        int top = dim.height / 2 - getSize().height / 2;
        setLocation(left, top);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

}
