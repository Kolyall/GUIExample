package com.github.kolyall;

import javax.swing.SwingUtilities;

public class MainClass {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainFrame::new);
    }

}
