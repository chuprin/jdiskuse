/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.ks.alexchuprin.jdiskuse.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;

/**
 *
 * @author alex
 */
public class MainForm extends JFrame {

    public MainForm() throws HeadlessException {
        this.setTitle("DiskUse");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(800, 600));
        this.getContentPane().setLayout(new BorderLayout());
        this.setJMenuBar(createMenuBar());
        this.getContentPane().add(createToolBar(), BorderLayout.NORTH);
        this.getContentPane().add(initComponents(),BorderLayout.CENTER);
        this.pack();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                setVisible(true);
            }
        });
    }

    private JSplitPane initComponents() {
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        JSplitPane split;
        split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
                new JScrollPane(createDistRootTree()),
                panel2);
        return split;
    }
    
    private JMenuBar createMenuBar(){
        return new JMenuBar();
    }
    
    private JToolBar createToolBar(){
        return new JToolBar();
    }
    
    private JTree createDistRootTree(){
        DefaultMutableTreeNode rootNode = new CatalogTreeNode("Root");
        rootNode.setAllowsChildren(true);
        DefaultMutableTreeNode secondNode=new CatalogTreeNode("Second");
        rootNode.add(secondNode);
        secondNode.add(new CatalogTreeNode("123"));
        JTree catalogTree = new JTree(rootNode);     
        catalogTree.putClientProperty("JTree.lineStyle", "Horizontal");
        catalogTree.setShowsRootHandles(false);
        catalogTree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        
        return catalogTree;
    }
}
