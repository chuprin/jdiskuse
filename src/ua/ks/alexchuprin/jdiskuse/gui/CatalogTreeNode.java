/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.ks.alexchuprin.jdiskuse.gui;

import java.util.Enumeration;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;

/**
 *
 * @author alex
 */
public class CatalogTreeNode extends DefaultMutableTreeNode{

    public CatalogTreeNode(Object userObject) {
        super(userObject);
    }

    public static Enumeration<TreeNode> getEMPTY_ENUMERATION() {
        return EMPTY_ENUMERATION;
    }

    @Override
    public Enumeration children() {
        Enumeration<TreeNode>child;
        if (getChildCount()==0){
            child = EMPTY_ENUMERATION;
        }
        return super.children();
    }
    
}
