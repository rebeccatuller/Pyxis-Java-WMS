/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senaimg.wms.view.layout;

import javafx.scene.Node;
import javafx.scene.control.TreeItem;

/**
 *
 * @author Aluno
 */
public class PalletTreeItem<T> extends TreeItem<T>  {

    public PalletTreeItem() {
    }

    public PalletTreeItem(T value) {
        super(value);
    }

    public PalletTreeItem(T value, Node graphic) {
        super(value, graphic);
    }
    
}
