package com.me.test;

import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.TitledBorder;

public class DisplayMessages extends JPanel{
	private JPanel varPanel;
	private TitledBorder varTitle,msgTitle;
	private JScrollPane varScroller;
	static JLabel instLabel;
	public DisplayMessages()
	{
		varPanel = new JPanel();
		varTitle = BorderFactory.createTitledBorder("Variables");
		varPanel.setBorder(varTitle);
		varPanel.setMinimumSize(new Dimension(600,400));
		varScroller = new JScrollPane(varPanel);
		varScroller.setPreferredSize(new Dimension(800,400));
		varScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		instLabel = new JLabel();
		instLabel.setText("THIS IS FOR DISPLAYING INSTANCE MESSAGES");
		add(instLabel);
		add(varScroller);
		msgTitle = BorderFactory.createTitledBorder("Explanation Area");
		setBorder(msgTitle);
	}

}
