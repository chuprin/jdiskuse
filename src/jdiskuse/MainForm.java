/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jdiskuse;

import java.awt.Dimension;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author alex
 */
public class MainForm extends JFrame {

    public MainForm() throws HeadlessException {
        this.setTitle("DiskUse");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(800, 600));
        this.getContentPane().add(initComponents());
        this.pack();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                setVisible(true);
            }
        });
    }

    private JScrollPane initComponents() {
        JPanel panel = new JPanel();
        return new JScrollPane(panel);
    }
       
}
