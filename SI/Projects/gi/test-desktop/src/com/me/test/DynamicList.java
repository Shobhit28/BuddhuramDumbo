package com.me.test;
//Imports
import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.event.*;
class DynamicList extends 	JPanel implements	ListSelectionListener, ActionListener
{
	static JList listbox;
	static JScrollPane scrollPane;
	static DefaultListModel model = new DefaultListModel();
	JButton b3,b4,b5,b6,b7,b8,b9;
    private TitledBorder listTitle;

	public DynamicList()
	{
		JPanel ctrlPanel = new JPanel();
		ctrlPanel.setLayout(new GridLayout(0,7));
		ctrlPanel.setMaximumSize(new Dimension(400,100)); 
		ctrlPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		b3 = new JButton("Play");b3.setPreferredSize(new Dimension(20,20));b3.setActionCommand("PLAY");b3.addActionListener(this);
		b4 = new JButton("Pause");b4.setMaximumSize(new Dimension(20,20));b4.setActionCommand("PAUSE");b4.addActionListener(this);
		b5 = new JButton("Stop");b5.setMaximumSize(new Dimension(20,20));b5.setActionCommand("STOP");b5.addActionListener(this);
		ctrlPanel.add(b3);
		ctrlPanel.add(b4);
		ctrlPanel.add(b5);
		setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));
		//add(ctrlPanel);
		listTitle = BorderFactory.createTitledBorder("Instructions Set");
		setBorder(listTitle);
		listbox = new JList( model );
		listbox.setEnabled(false);
		listbox.addListSelectionListener( this );
		scrollPane = new JScrollPane(listbox);
		scrollPane.getViewport().add( listbox );
		add(scrollPane,BorderLayout.CENTER);
	}
	public void valueChanged( ListSelectionEvent event )
	{
		if( event.getSource() == listbox && !event.getValueIsAdjusting() )
		{
			String stringValue = (String)listbox.getSelectedValue();
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("PLAY"))
		{
			for(int ind=0;ind< model.getSize();ind++)
			{
				listbox.setSelectedIndex(ind);
				JOptionPane.showMessageDialog(this,"<html>ParseMe<b><font color=red>("+ model.getElementAt(ind)+")");
			}
		}
		
	}
}


