package com.github.kolyall;

import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {

    public MainFrame() {
        super("MainFrame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(850, 650));
        setSize(new Dimension(850, 650));


        JPanel rootPanel = new JPanel();
        rootPanel.setLayout(new BoxLayout(rootPanel, BoxLayout.X_AXIS));
        getContentPane().add(rootPanel);
        setLocationRelativeTo(null);
        setVisible(true);


//        JPanel mainPanel = new JPanel();
//        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
//        mainPanel.add(Box.createVerticalGlue());
//        mainPanel.add(new JButton("Start"));
//        mainPanel.add(Box.createVerticalGlue());
//        rootPanel.add(mainPanel);

        rootPanel.add(new ButtonsFrame().buttonsPanel);
    }

}
