/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.me.test;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.TitledBorder;
import javax.swing.text.DefaultEditorKit;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.backends.lwjgl.LwjglCanvas;
import com.badlogic.gdx.backends.lwjgl.LwjglFrame;
import com.badlogic.gdx.Game;
import com.me.test.MyTest;

import buddhuram.Buddhuram;
import buddhuram.Command;
import buddhuram.SharedObject;

/**
 *
 * @author shivakumar13
 */
public class FrameWorkGIBDIA implements ActionListener
{
	
	private JFrame frame;
    private JFileChooser openFC,saveFC;
    private JMenuBar menuBar;
    private JMenu fileMenu, editMenu, animMenu, helpMenu;
    private JMenuItem typeItem, openItem, quitItem, saveItem, cut, copy, paste;
    private JMenuItem start,stop,pause,hContents,about,manual,undob,redob;
    private JPanel animPanel,varPanel;
	static JPanel dynamicPanel;
	private JPanel dp;
    private JToolBar head;
    private TitledBorder animTitle;
    private JScrollPane animScroller;
    private Component aComponent;
    private JButton openButton,saveButton,helpButton; 
    private JButton playButton,pauseButton,stopButton,execButton;
    JToggleButton tglButton;
    public Buddhuram bdr;
    public int curIndex=0; 
    
    //  QUEUE OF COMMANDS
    //
    LinkedList<Command> list=new LinkedList<Command>();
    
    
    
    
    
    public void startFramework()
    {
		try
		{
	    	UIManager.put("nimbusBase", Color.ORANGE);
	    	UIManager.put("nimbusBlueGrey", Color.ORANGE);
	    	UIManager.put("control", Color.GRAY);
	    	UIManager.put("nimbusSelectionBackground", Color.ORANGE);
	    	UIManager.put("controlShadow", Color.green);
		    for(LookAndFeelInfo info : UIManager.getInstalledLookAndFeels())
		    {
			if("Nimbus".equals(info.getName()))
			{
			    UIManager.setLookAndFeel(info.getClassName());
			    break;
			}
		    }
		}
		catch (Exception e)
		{
		    // If Nimbus is not available, you can set the GUI to another look and feel.
		}        
		
		FrameWorkGIBDIA fw = new FrameWorkGIBDIA();
        fw.showGUI();
    }
    
    public void showGUI()
    {
		frame = new JFrame("Graphical Interpreter : Buddhuram Dumbo In Action....");
		frame.setVisible(true);
		//LwjglApplicationConfiguration cfg= new LwjglApplicationConfiguration();
		//cfg.title="dcds";
		//cfg.useGL20 = true;
		//cfg.width= 200;
		//cfg.height=180;
		//MyTest ob= new MyTest();
		
		//SharedObject.dummy_obj=ob;
		
		//LwjglCanvas canvas = new LwjglCanvas(new Game() {@Override public void create(){} }, true);
		//new LwjglApplication(ob,cfg);
		//LwjglCanvas canvas = new LwjglCanvas(ob,true);
		//canvas.
		//frame.add(canvas.getCanvas());
		//frame.setVisible(true);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setBounds(0,0,screenSize.width, screenSize.height);
		frame.setSize(screenSize.width,screenSize.height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menuBar = new JMenuBar();
		fileMenu = new JMenu("File");
		fileMenu.setMnemonic(KeyEvent.VK_F);
		new JMenu("New Code Segment");
		typeItem = new JMenuItem("Enter Instructions Manually", KeyEvent.VK_T);
		typeItem.setActionCommand("TYPE");
		typeItem.addActionListener(this);
		openItem = new JMenuItem("Open", KeyEvent.VK_O);
		openItem.setActionCommand("OPEN");
		openItem.addActionListener(this);
		fileMenu.add(openItem);
		fileMenu.add(typeItem);
		saveItem = new JMenuItem("Save", KeyEvent.VK_S);
		saveItem.setActionCommand("SAVE");
		saveItem.addActionListener(this);
		fileMenu.add(saveItem);
		quitItem = new JMenuItem("Quit", KeyEvent.VK_Q);
		quitItem.setActionCommand("QUIT");
		quitItem.addActionListener(this);
		fileMenu.add(quitItem);

		editMenu = new JMenu("Edit");
		editMenu.setMnemonic(KeyEvent.VK_E);
		cut = new JMenuItem(new DefaultEditorKit.CutAction());
		cut.setText("Cut");
		cut.setMnemonic(KeyEvent.VK_X);
		copy = new JMenuItem(new DefaultEditorKit.CopyAction());
		copy.setText("Copy");
		copy.setMnemonic(KeyEvent.VK_C);
		paste = new JMenuItem(new DefaultEditorKit.PasteAction());
		paste.setText("Paste");
		paste.setMnemonic(KeyEvent.VK_V);
	
		undob = new JMenuItem("Undo", KeyEvent.VK_Z);undob.setActionCommand("UNDO");
		redob = new JMenuItem("Redo", KeyEvent.VK_Y);redob.setActionCommand("REDO");
		undob.addActionListener(this);
		redob.addActionListener(this);
		editMenu.add(cut);
		editMenu.add(copy);
		editMenu.add(paste);
		editMenu.add(undob);
		editMenu.add(redob);
		
		animMenu = new JMenu("Run");
		animMenu.setMnemonic(KeyEvent.VK_R);
		start = new JMenuItem("Start Animation",KeyEvent.VK_T);
		stop = new JMenuItem("Stop Animation",KeyEvent.VK_O);
		pause = new JMenuItem("Pause Animation",KeyEvent.VK_U);
		animMenu.add(start);
		animMenu.add(stop);
		animMenu.add(pause);
		
		helpMenu = new JMenu("Help");
		helpMenu.setMnemonic(KeyEvent.VK_H);
		hContents = new JMenuItem("Help Contents",KeyEvent.VK_C);
		about = new JMenuItem("About",KeyEvent.VK_A);
		manual = new JMenuItem("User Manual",KeyEvent.VK_M);

		helpMenu.add(hContents);
		helpMenu.add(about);
		helpMenu.add(manual);
	
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(animMenu);
		menuBar.add(helpMenu);
		frame.setJMenuBar(menuBar);       

		animPanel = new JPanel();
		//animPanel.setMaximumSize(new Dimension(600,400));
		animPanel.setPreferredSize(new Dimension(800,400));
		animTitle = BorderFactory.createTitledBorder("Dumbo Animation Area");
		animPanel.setBorder(animTitle);
		animScroller = new JScrollPane(animPanel);
		animScroller.setPreferredSize(new Dimension(800,600));
		
		//animPanel.add(canvas.getCanvas());

		//North/Head Panel
		
		
		head = new JToolBar();
		head.setPreferredSize(new Dimension(1200,40));
	
		ImageIcon open = createImageIcon("images/fopen.png");
		ImageIcon save = createImageIcon("images/save.png");
		ImageIcon help = createImageIcon("images/help.png");
		ImageIcon play = createImageIcon("images/play.png");
		ImageIcon pause = createImageIcon("images/pause.png");
		ImageIcon stop = createImageIcon("images/stop.png");
		ImageIcon exec = createImageIcon("images/exec.png");
		
		openButton = this.makeMyButton("Open","OPEN",open);
		saveButton = this.makeMyButton("Save","SAVE",save);
		helpButton = this.makeMyButton("Help","HELP",help);
		head.add(openButton);
		head.add(saveButton);
		head.add(helpButton);
		head.add(new JSeparator());
		//varPanel PANEL
		varPanel = new DisplayMessages();
		JPanel ctrlPanel = new JPanel();
		ctrlPanel.setLayout(new GridLayout(0,7));
		ctrlPanel.setMaximumSize(new Dimension(400,100)); 
		ctrlPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		playButton = this.makeMyButton("Play", "PLAY", play); //new JButton("Play");playButton.setPreferredSize(new Dimension(20,20));playButton.setActionCommand("PLAY");playButton.addActionListener(this);
		pauseButton =this.makeMyButton("Pause", "PAUSE", pause);// new JButton("Pause");pauseButton.setMaximumSize(new Dimension(20,20));pauseButton.setActionCommand("PAUSE");pauseButton.addActionListener(this);
		stopButton = this.makeMyButton("Stop", "STOP", stop);//stopButton.setMaximumSize(new Dimension(20,20));stopButton.setActionCommand("STOP");stopButton.addActionListener(this);
		execButton = this.makeMyButton("Exec", "EXEC", exec);//stopButton.setMaximumSize(new Dimension(20,20));stopButton.setActionCommand("STOP");stopButton.addActionListener(this);
		ctrlPanel.add(playButton);
		ctrlPanel.add(pauseButton);
		ctrlPanel.add(stopButton);
		ctrlPanel.add(execButton);

		dynamicPanel = new JPanel();
		dynamicPanel.setLayout(new BoxLayout(dynamicPanel,BoxLayout.PAGE_AXIS));
		dp = new JPanel();
		dynamicPanel.add(dp);
		JPanel tempPanel = new JPanel();
		tempPanel.setLayout(new BoxLayout(tempPanel, BoxLayout.PAGE_AXIS));
		tempPanel.add(ctrlPanel);
		tempPanel.add(dynamicPanel);
		JSplitPane splitPane1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,tempPanel,varPanel);
		splitPane1.setOneTouchExpandable(true);
		splitPane1.setDividerLocation(screenSize.height/2);
		JPanel tp=new JPanel();
		tp.add(splitPane1);
		tp.setLayout(new BoxLayout(tp, BoxLayout.PAGE_AXIS));
		JSplitPane splitPane2 = new JSplitPane(JSplitPane.VERTICAL_SPLIT,animPanel,splitPane1);
		splitPane2.setOneTouchExpandable(true);
		splitPane2.setDividerLocation(400);
		frame.add(new JLabel("    "),BorderLayout.EAST);
		frame.add(new JLabel("    "),BorderLayout.WEST);
		frame.add(head,BorderLayout.NORTH);
		frame.add(tp, BorderLayout.SOUTH);
		frame.add(splitPane2,BorderLayout.CENTER);
		frame.pack();
    }
	@Override
    public void actionPerformed(ActionEvent e)
    {
    	System.out.println(e.getActionCommand());
        BufferedReader inputStream;
        if(e.getActionCommand().equals("OPEN"))
        {
        	dynamicPanel.removeAll();
        	dp = new EditorPanel();
        	dp.revalidate();
        	dp.repaint();
        	dynamicPanel.add(dp);
        	dynamicPanel.revalidate();
        	dynamicPanel.repaint();
            openFC = new JFileChooser();
            openFC.setDialogTitle("GIBDIA: Opening File from Local Disk...."); 
            int returnVal = openFC.showOpenDialog(aComponent);
            openFC.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		    File file = openFC.getSelectedFile();
		    String file_Name= file.getName();
		    list.clear();
		    bdr = new Buddhuram(file_Name,list);
		    String fileExt=file.getName().substring(file.getName().lastIndexOf(".")+1,file.getName().length());
            if(fileExt.equals("txt"))
            {
                JOptionPane.showMessageDialog(frame,"File Opened Successfully....","Success...",JOptionPane.DEFAULT_OPTION);
                File f = new File(openFC.getSelectedFile().toString());
                try
                {
                    inputStream = new BufferedReader(new FileReader(f));
                    String line = null;
				    try
				    {
				    	String prev="";
						while ((line = inputStream.readLine()) != null)
						{
							prev = EditorPanel.textArea.getText();
							DynamicList.model.addElement(line);
							EditorPanel.textArea.setText(prev+"\n"+line);
						}
				    }
				    catch (IOException ex)
				    {
				    	Logger.getLogger(FrameWorkGIBDIA.class.getName()).log(Level.SEVERE, null, ex);
				    }
                }
                catch (Exception ioex)
                {
                
                }

            } 
            else
            {
            	JOptionPane.showMessageDialog(frame,"<html><font color=red><b>Error Occured While Opening the File</b></font></html>\n Trying to Open the Bad Format....","Error:",JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(e.getActionCommand().equals("SAVE")) 
        {
             saveFC = new JFileChooser();
             saveFC.setDialogTitle("GIBDIA: Saving To File..."); 
             int returnVal = saveFC.showSaveDialog(aComponent);
             if (returnVal == JFileChooser.APPROVE_OPTION)
		     {
			    BufferedWriter writer = null;
			    try
			    {
					File file =saveFC.getSelectedFile();
					writer = new BufferedWriter(new FileWriter(file+".txt"));
					writer.write(EditorPanel.textArea.getText());
			    }
			    catch (IOException ex)
			    {
			    	Logger.getLogger(FrameWorkGIBDIA.class.getName()).log(Level.SEVERE, null, ex);
			    }
			    finally
			    {
					try
					{
					    writer.close();
					}
					catch(IOException ex)
					{
					    Logger.getLogger(FrameWorkGIBDIA.class.getName()).log(Level.SEVERE, null, ex);
					}
			    }
		    }
        }
        else if(e.getActionCommand().equals("TYPE"))
        {
        	dynamicPanel.removeAll();
        	dp= new EditorPanel();
        	dynamicPanel.add(dp);
        	dynamicPanel.revalidate();
        	dynamicPanel.repaint();
            EditorPanel.textArea.setEditable(true);
	    }
        else if (e.getActionCommand().equals("EXEC"))
        {
        	
        	//System.out.println(list.get(1).getCommandtype());
			try {
				list.poll().executecommand();
				//list.get().executecommand();
				//System.out.println("SIZE "+list.size());
			} catch (IOException e1) {System.out.println("Error in exec");
				// TODO Auto-generated catch block
				//e1.printStackTrace();
			}
         }
        else if(e.getActionCommand().equals("PLAY"))
		{
        	if(curIndex==0)
        	{
	        	String xtract = EditorPanel.textArea.getText();
	        	MiniParser mp=new MiniParser(xtract);
	        	String[] ted = mp.getcode();
	        	JPanel dp = new JPanel();
	        	FrameWorkGIBDIA.dynamicPanel.removeAll();
	        	dp= new DynamicList();
	        	DynamicList.model.clear();
	        	for(int i=0;i<ted.length; i++)
	        	{
	        		DynamicList.model.addElement(ted[i]);
	        	}
	        	FrameWorkGIBDIA.dynamicPanel.add(dp);
	        	FrameWorkGIBDIA.dynamicPanel.revalidate();
	        	FrameWorkGIBDIA.dynamicPanel.repaint();
        	}
        	DynamicList.listbox.setSelectedIndex(curIndex);
			DynamicList.listbox.ensureIndexIsVisible(curIndex);
			DisplayMessages.instLabel.setText(""+ DynamicList.model.getElementAt(curIndex));
			
			bdr.setParameters(curIndex+1, DynamicList.listbox.getSelectedValue().toString());
			bdr.parse();
			
			//System.out.println((DynamicList.model.size()>=curIndex));
			System.out.println(DynamicList.model.size()+"    "+curIndex);
			if(!(DynamicList.model.size()==(curIndex+1)))
			{	
				curIndex++;
			}
			else
			{
				curIndex = 0;
			}
		}
		else if(e.getActionCommand().equals("NEXT"))
		{
		    //listbox.setSelectedValue(listData[++index], true);
		}
		else if(e.getActionCommand().equals("PREV"))
		{
		    //listbox.setSelectedValue(listData[--index], true);
		}
		else if(e.getActionCommand().equals("QUIT"))
	    {
	        System.out.println("Exiting the Application Bye!");
		    int b= JOptionPane.showConfirmDialog(frame, "Are you sure want to Exit?");	  
		    if(b==0)
		    {
		    	System.exit(0);
		    }
	    }
		else
		{}
    }
    protected static ImageIcon createImageIcon(String path)
    {
    	java.net.URL imgURL = FrameWorkGIBDIA.class.getResource(path);
    	return new ImageIcon(imgURL);
    }
    public JButton makeMyButton(String name,String aCommand,ImageIcon img)
    {
		JButton btn= new JButton(name,img);
		btn.setActionCommand(aCommand);
		btn.addActionListener(this);
		return btn;
    }
}