/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.ks.alexchuprin.jdiskuse.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.util.Locale;
import java.util.ResourceBundle;
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

    private JTree catalogTree;
    private ResourceBundle res;

    public MainForm() throws HeadlessException {
        res = ResourceBundle.getBundle("ua.ks.alexchuprin.jdiskuse.res.LabelBundle");
        this.setTitle(res.getString("main.title"));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(800, 600));
        this.getContentPane().setLayout(new BorderLayout());
        this.setJMenuBar(createMenuBar());
        this.getContentPane().add(createToolBar(), BorderLayout.NORTH);
        this.getContentPane().add(initComponents(), BorderLayout.CENTER);
        this.pack();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                setVisible(true);
            }
        });
    }

    private JSplitPane initComponents() {
        catalogTree = createDistRootTree();
        JPanel panel2 = new JPanel();
        JSplitPane split;
        split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
                new JScrollPane(catalogTree),
                panel2);
        return split;
    }

    private JMenuBar createMenuBar() {
        return new JMenuBar();
    }

    private JToolBar createToolBar() {
        return new JToolBar();
    }

    private JTree createDistRootTree() {
        DefaultMutableTreeNode rootNode = new CatalogTreeNode("Partition");
        JTree tree = new JTree(rootNode);
        DefaultMutableTreeNode node = new DefaultMutableTreeNode("New Node");
        node.setAllowsChildren(true);        
        rootNode.add(node);
        tree.expandRow(0);        
        tree.putClientProperty("JTree.lineStyle", "Horizontal");
        //tree.setShowsRootHandles(false);
        tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        tree.setRootVisible(false);
        return tree;
    }
    /**
     * Add  child and sub child to node.
     * If node has child, chech child on update, 
     * and add sub child  
     * @param node Node which append child and sub child. 
     */
    private void loadChildNode(DefaultMutableTreeNode node){
        if (node.getLevel()==0){
            
        }
    }
}
