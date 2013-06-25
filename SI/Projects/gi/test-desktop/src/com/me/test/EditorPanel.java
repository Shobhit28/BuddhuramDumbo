package com.me.test;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;

public class EditorPanel extends JPanel implements ActionListener{
	static JTextComponent textArea;
    final UndoManager undo = new UndoManager();
    private TitledBorder editorTitle;
	public EditorPanel()
	{
		textArea = new JTextArea();
		textArea.setEditable(false);	
		new UndoManager();
		Document doc= textArea.getDocument();
		doc.addUndoableEditListener(new UndoableEditListener()
		{
		    @Override
		    public void undoableEditHappened(UndoableEditEvent evt) {
		    undo.addEdit(evt.getEdit());
		}
		});
		textArea.getActionMap().put("Undo",new AbstractAction("Undo")
		{
		    @Override
		    public void actionPerformed(ActionEvent evt)
		    {
				try
				{
				    if(undo.canUndo())
				    {
					undo.undo();
				    }
				}
				catch(CannotUndoException e){ }
		    }
		});
		textArea.getInputMap().put(KeyStroke.getKeyStroke("control Z"), "Undo");
		textArea.getActionMap().put("Redo",new AbstractAction("Redo")
		{
		    @Override
		    public void actionPerformed(ActionEvent evt)
		    {
			try
			{
			    if(undo.canRedo())
			    {
				undo.redo();
			    }
			}
			catch (CannotRedoException e){ }
		    }
		});
		textArea.getInputMap().put(KeyStroke.getKeyStroke("control Y"), "Redo");
	
		final JTextArea lines = new JTextArea("1");
		lines.setBackground(Color.LIGHT_GRAY);
		lines.setEditable(false);
	
		textArea.getDocument().addDocumentListener(new DocumentListener()
		{
		    public String getText(){
			    int caretPosition = textArea.getDocument().getLength();
			    javax.swing.text.Element root = textArea.getDocument().getDefaultRootElement();
			    String text = "1" + System.getProperty("line.separator");
			    for(int i = 2; i < root.getElementIndex( caretPosition ) + 2; i++){
				    text += i + System.getProperty("line.separator");
			    }
			    return text;
		    }
		    @Override
		    public void changedUpdate(DocumentEvent de) {
			    lines.setText(getText());
		    }
		    @Override
		    public void insertUpdate(DocumentEvent de)
		    {
			    lines.setText(getText());
		    }
		    @Override
		    public void removeUpdate(DocumentEvent de){
					lines.setText(getText());
				}
		});
		JScrollPane editorScroller = new JScrollPane(textArea);
		editorScroller.getViewport().add(textArea);
		editorScroller.setRowHeaderView(lines);
		editorScroller.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		editorScroller.setPreferredSize(new Dimension(400,200));

		JPanel ctrlPanel = new JPanel();
		ctrlPanel.setLayout(new GridLayout(0,7));
		ctrlPanel.setMaximumSize(new Dimension(400,100)); 
		ctrlPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		JButton b3 = new JButton("Play");b3.setPreferredSize(new Dimension(20,20));b3.setActionCommand("PLAY");b3.addActionListener(this);
		JButton b4 = new JButton("Pause");b4.setMaximumSize(new Dimension(20,20));b4.setActionCommand("PAUSE");b4.addActionListener(this);
		JButton b5 = new JButton("Stop");b5.setMaximumSize(new Dimension(20,20));b5.setActionCommand("STOP");b5.addActionListener(this);

		ctrlPanel.add(b3);
		ctrlPanel.add(b4);
		ctrlPanel.add(b5);
		setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));
		add(editorScroller);
		//add(ctrlPanel);
		editorTitle = BorderFactory.createTitledBorder("Text Editor For Programming Purpose");
		setBorder(editorTitle);
		add(editorScroller);
	}
	@Override
	public void actionPerformed(ActionEvent e) {

		UndoManager undoManager = null;
		if (e.getActionCommand().equals("UNDO"))
		{
		   undoManager.undo();
		}
		else if (e.getActionCommand().equals("REDO"))
		{
		    undoManager.redo();
		}
		else if (e.getActionCommand().equals("CUT")) 
	        {
	             
	        }   
        else if (e.getActionCommand().equals("COPY")) 
        {
            
        }
        else if (e.getActionCommand().equals("EXEC"))
        {
        	String xtract = textArea.getText();
        	String[] ted = xtract.split("\n");

        	JPanel dp= new JPanel();
        	FrameWorkGIBDIA.dynamicPanel.removeAll();
        	dp= new DynamicList();
        	//DynamicList.listData.clear();
        	DynamicList.model.clear();
        	
        	for(int i=0;i<ted.length; i++)
        	{
        		System.out.println(ted[i]);
        		DynamicList.model.addElement(ted[i]);
        	}
        	FrameWorkGIBDIA.dynamicPanel.add(dp);
        	FrameWorkGIBDIA.dynamicPanel.revalidate();
        	FrameWorkGIBDIA.dynamicPanel.repaint();
        	
        }
	}

}
