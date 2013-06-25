package com.me.test;
import java.io.IOException;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.PerspectiveCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.VertexAttributes.Usage;
import com.badlogic.gdx.graphics.g3d.Model;
import com.badlogic.gdx.graphics.g3d.ModelBatch;
import com.badlogic.gdx.graphics.g3d.ModelInstance;
import com.badlogic.gdx.graphics.g3d.materials.Material;
import com.badlogic.gdx.graphics.g3d.materials.TextureAttribute;
import com.badlogic.gdx.graphics.g3d.utils.CameraInputController;
import com.badlogic.gdx.graphics.g3d.utils.ModelBuilder;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Array;
import com.me.test.image;


public class MyTest implements ApplicationListener {
	private PerspectiveCamera cam,nikon,canon;
	private CameraInputController camController;
	private AssetManager assets;
	private ModelBatch modelBatch;
	private Model model;
	private boolean loading;
	private ModelInstance displayInstance;
	private Model val_model;
	private ModelBuilder v_builder = new ModelBuilder();
	
	private final Vector3 R1_val= new Vector3(29,45,-14);
	private final Vector3 R2_val= new Vector3(30,45,15);
	private final Vector3 Acc_val= new Vector3(30,15,0);
	private final Vector3 op_val= new Vector3(26,45,0);
	

	private boolean opening =false;
	private boolean shouldLoad = false;
	private boolean val_shouldLoad = false;
	private final Vector3 default_camera_pos=new Vector3(0f,20f,50f);
	private Vector3 current_camera_pos=default_camera_pos;
	private final Vector3 default_camera_look_at=new Vector3(0,20,0);
	private Vector3 current_camera_look_at=default_camera_look_at;
	private final Vector3 register_camera_position= new Vector3(-7,30,0);
	private final Vector3 register_camera_look_at= new Vector3(25,30,0);
	private final Vector3 default_dumbo_pos=new Vector3(0,0,0);
	private Vector3 current_dumbo_pos=default_dumbo_pos;
	private final float startX =-25;
	private final float startY =30;
	private final float startZ =15;
	private final float no_of_rows=5;
	private final float box_height=6;
	private final float box_width=7.5f;
	private float pos_x=0,pos_y=0,pos_z=0,step=0;
	private final float box_thickness=6.5f;
	private ModelBuilder builder = new ModelBuilder();
	private boolean loaddisplayimage = false;
	//LABEL
	private boolean display= false;
	private Texture displaytexture;
	private TextureAttribute tex_att_label;
	private Material mat_label;
	private ModelInstance label_instance;
	private Texture label_texture;
	private Array<ModelInstance> label_inst_array= new Array<ModelInstance>();

	private Vector3 val_pos= new Vector3(0,0,0);
	private Array<ModelInstance> box_inst_array = new Array<ModelInstance>();
	private Array<ModelInstance> drawer_inst_array = new Array<ModelInstance>();
	private ModelInstance room_ins;
	private ModelInstance side_wall_inst;
	private ModelInstance memory_inst;
	private ModelInstance reg_acc_text_inst;
	private ModelInstance dumbo_inst;
	private ModelInstance display_inst;
	private float f_x, f_z, i_x, i_z;
	private boolean wants_to_move_dumbo=false;
	private float dumbo_rot_angle=0;
	private  String imgname;
	private  String val_imgname;
	private ModelInstance value_instance;
	private TextureAttribute val_att_label;
	private Material mat_value;
	private Texture value_texture;
	private Array<ModelInstance> value_inst_array= new Array<ModelInstance>();
	private Model displaymodel;
	@Override

	public void create ()
	{

		modelBatch = new ModelBatch();
		cam = new PerspectiveCamera(67, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		cam.position.set(0f, 20f, 50f);
		cam.lookAt(0,20,0);
		cam.near = 0.1f;
		cam.far= 300f;
		cam.update();


		nikon = new PerspectiveCamera(67, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		nikon.position.set(0f, 20f, 50f);
		nikon.lookAt(0,20,0);
		nikon.near = 0.1f;
		nikon.far= 300f;
		nikon.update();
		canon=cam;
		camController = new CameraInputController(canon);
		Gdx.input.setInputProcessor(camController);
		assets = new AssetManager();
		assets.load("data/abc2.obj", Model.class);
		assets.load("data/a2.obj", Model.class);
		assets.load("data/o_dr.obj", Model.class);
		assets.load("data/d2.obj",Model.class);
		assets.load("data/t1.obj",Model.class);
		assets.load("data/t3.obj",Model.class);
		assets.load("data/mydumbo1.obj",Model.class);
		assets.load("data/l.obj",Model.class);
		loading = true;

		model = builder.createBox(0, 1, 4, new Material(), Usage.Position | Usage.Normal | Usage.TextureCoordinates);

		model.manageDisposable(label_texture);
		val_model = builder.createBox(0, 10, 14, new Material(), Usage.Position | Usage.Normal | Usage.TextureCoordinates);

		val_model.manageDisposable(value_texture);
		displaymodel = builder.createBox(20, 5, 0, new Material(), Usage.Position | Usage.Normal | Usage.TextureCoordinates);

		displaymodel.manageDisposable(label_texture);



	}

	private void doneLoading()
	{
		Model room = assets.get("data/abc2.obj", Model.class);
		Model box = assets.get("data/o_dr.obj", Model.class);
		Model drawer = assets.get("data/d2.obj",Model.class);
		Model wall = assets.get("data/a2.obj", Model.class);
		Model memory = assets.get("data/t1.obj", Model.class);
		Model register = assets.get("data/t3.obj", Model.class);
		Model dumbo=assets.get("data/mydumbo1.obj", Model.class);
		Model display=assets.get("data/l.obj", Model.class);

		for (float z = startZ; z >= -15f; z -= box_width)
		{
			for (float y = startY; y >= 6f; y -= box_height)
			{
				ModelInstance boxInstance = new ModelInstance(box);
				ModelInstance drawerInstance = new ModelInstance(drawer);
				boxInstance.transform.setToTranslation(startX,y,z);
				box_inst_array.add(boxInstance);
				drawerInstance.transform.setToTranslation(startX,y,z);
				drawer_inst_array.add(drawerInstance);
			}
		}

		room_ins = new ModelInstance(room);

		side_wall_inst = new ModelInstance(wall);

		memory_inst = new ModelInstance(memory);

		reg_acc_text_inst = new ModelInstance(register);

		dumbo_inst=new ModelInstance(dumbo);

		display_inst=new ModelInstance(display);

		loading = false;

		//}}
	}
	@Override
	public void render ()
	{
		if (loading && assets.update())
			doneLoading();
		button();
		camController.update();
		canon.update();
		Gdx.gl.glViewport(0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT | GL10.GL_DEPTH_BUFFER_BIT);

		modelBatch.begin(canon);
		for (ModelInstance instance : box_inst_array)
			modelBatch.render(instance);
		for (ModelInstance instance : drawer_inst_array)
			modelBatch.render(instance);
		for (ModelInstance instance : label_inst_array)
			modelBatch.render(instance);
		for(ModelInstance instance : value_inst_array)
			modelBatch.render(instance);
		if (shouldLoad == true)
		{
			label_texture = new Texture(Gdx.files.internal("data/one.png"),false);
			//value_texture = new Texture(Gdx.files.internal("data/"+val_imgname+".png"),false);
		}
		else
			shouldLoad=false;
		if (val_shouldLoad == true)
		{
			//label_texture = new Texture(Gdx.files.internal("data/"+imgname+".png"),false);
			value_texture = new Texture(Gdx.files.internal("data/one.png"),false);
		}
		else
			val_shouldLoad=false;


		if(loaddisplayimage==true)
			displaytexture = new Texture(Gdx.files.internal("data/one.png"),false);
		if (display== true)
			modelBatch.render(displayInstance);
		if(loading ==false)
		{
			modelBatch.render(room_ins);			
			modelBatch.render(side_wall_inst);
			modelBatch.render(memory_inst);
			modelBatch.render(reg_acc_text_inst);
			modelBatch.render(dumbo_inst);
			modelBatch.render(display_inst);
		}
		modelBatch.end();

		if(wants_to_move_dumbo==true)
		{
			movedumbo();
			rotate_dumbo();
		}


	}
	
	public void show_text(int type,int no,String te)
	{
	if(type==0){
		
		int row,col;
		float y_cord,z_cord;
		row= (int) (no%no_of_rows);
		col= (int) (no/no_of_rows);
		z_cord= (float) (startZ -(col*box_width))-2;
		y_cord = (float) ((no_of_rows-row)*box_height)+(box_height/2);
		val_pos.set(-20, y_cord, z_cord);
		load_val_imag(te);
		
	}
		if(type==1)
		{
			if(no==1)
			{
				System.out.println("in register 1");
				val_pos=R1_val;
				load_val_imag(te);
			}
			else if(no==2)
			{
				System.out.println("In register 2");
				val_pos=R2_val;
				load_val_imag(te);
			}
		}
			
		
		else if(type==2)
		{
			val_pos=Acc_val;
			load_val_imag(te);
		}
		else if(type==3)
		{
			val_pos=op_val;
			load_val_imag(te);
		}
		else if(type==4)
		{
			val_pos.set(-3.5f,18,4.5f);
			load_val_imag(te);
		}
		else if(type==5)
		{
			val_pos.set(0,42,-15);
			load_val_imag(te);
		}
	}
	public void box_close(int boxNo)
	{
		int row,col;
		float y_cord,z_cord;
		row= (int) (boxNo%no_of_rows);
		col= (int) (boxNo/no_of_rows);
		z_cord= (float) (startZ -(col*box_width));
		y_cord = (float) ((no_of_rows-row)*box_height);
		drawer_inst_array.get(boxNo).transform.setToTranslation(startX, y_cord, z_cord);
		/*for(ModelInstance ins : label_inst_array)
		{
			ins.transform.setToTranslation(startX+box_thickness, y_cord+5, z_cord-3);
			ins.transform.rotate(1,0,0,180);
		}*/
	}
	public void box_open(int boxNo)
	{
		
		System.out.println("box open me aa gaye"+boxNo);
		int row,col;
		float y_cord,z_cord;
		row= (int) (boxNo%no_of_rows);
		col= (int) (boxNo/no_of_rows);
		z_cord= (float) (startZ -(col*box_width));
		y_cord = (float) ((no_of_rows-row)*box_height);
		drawer_inst_array.get(boxNo).transform.setToTranslation(startX+5, y_cord, z_cord);
		/*for(ModelInstance ins : label_inst_array)
		{
			ins.transform.setToTranslation(startX+11.5f, y_cord+5, z_cord-3);
			ins.transform.rotate(1,0,0,180);
		}*/
	}
	public void loadImage(String name, int boxNo)
	{
		this.setImgname(name);
		img_th t=new img_th(name,boxNo);
		t.start();

		
		//shouldLoad=true;Memory.boxes.get(this.op2.getBoxno()).getValue(0)
	}

	public void labelBox(String label, int boxNo) 
	{	
		loadImage(label,boxNo);

	}

	private void button() 
	{

		if(Gdx.input.isKeyPressed(Input.Keys.F))
		{
			dumbo_inst.transform.setToTranslation(20, 0, -20);
			//current_camera_pos=register_camera_position;			
			//current_camera_look_at=register_camera_look_at;
			cam.position.set(register_camera_position);
			cam.lookAt(register_camera_look_at);
			System.out.println(register_camera_position);
			System.out.println(register_camera_look_at);
			canon=cam;
		}
		if(Gdx.input.isKeyPressed(Input.Keys.M))
		{
			//int boxNo=0;
			//movedumbo();
			//System.out.println(pos_x+" "+ pos_z);
			//look_to_memory_wall(boxNo);
			//look_to_register_wall();
			//box_open(boxNo);
		}
		if(Gdx.input.isKeyPressed(Input.Keys.A))
		{
			int boxNo=11;
			int row,col;
			float y_cord,z_cord;
			row= (int) (boxNo%no_of_rows);
			col= (int) (boxNo/no_of_rows);
			z_cord= (float) (startZ -(col*box_width))-(box_width/2);
			y_cord = (float) ((no_of_rows-row)*box_height)+(box_height/2);
			//current_camera_pos.set(-10,y_cord+10,z_cord);
			nikon.position.set(-5,y_cord+5,z_cord);
			nikon.lookAt(startX,y_cord, z_cord);
			canon=nikon;

		}
		if(Gdx.input.isKeyPressed(Input.Keys.L))
		{
			/*float ini_x,ini_y=0,ini_z,final_x, final_z, final_y;
			final_x=20f;
			final_y=ini_y;
			final_z=10f;
			ini_x=0;
			ini_z=0;
			//movedumbo(100,ini_x,ini_z,final_x,final_z);*/
		}


	}
	public void look_to_default()
	{
		cam.position.set(default_camera_pos);
		cam.lookAt(default_camera_look_at);
		canon=cam;
	}
	public void look_to_memory_wall(int boxNo)
	{
		int row,col;
		float y_cord,z_cord;
		row= (int) (boxNo%no_of_rows);
		col= (int) (boxNo/no_of_rows);
		z_cord= (float) (startZ -(col*box_width))-(box_width/2);
		y_cord = (float) ((no_of_rows-row)*box_height)+(box_height/2);
		nikon.position.set(-5,y_cord+5,z_cord);
		nikon.lookAt(startX,y_cord, z_cord);
		canon=nikon;
	}

	public void look_to_register_wall()
	{
		dumbo_inst.transform.setToTranslation(20, 0, -20);
		cam.position.set(register_camera_position);
		cam.lookAt(register_camera_look_at);
		System.out.println(register_camera_position);
		System.out.println(register_camera_look_at);
		canon=cam;
	}
	public void movedumbo()
	{  

		AnimationThread t=new AnimationThread(100,f_x,f_z,i_x,i_z);

		t.start();
		if(dumbo_inst!=null)
		{
			dumbo_inst.transform.setToTranslation(pos_x,pos_y,pos_z);	
		}		

	}
	private void rotate_dumbo()
	{


		dumbo_inst.transform.rotate(0, 1, 0, dumbo_rot_angle);



	}

	public void movedumbo(int init_pos_type, int final_pos_type,int final_pos)
	{  
		if(init_pos_type==0)
		{
			this.i_x=default_dumbo_pos.x;
			this.i_z=default_dumbo_pos.z;
		}
		else
		{
			this.i_x=current_dumbo_pos.x;
			this.i_z=current_dumbo_pos.z;

		}
		if(final_pos_type==0)
		{
			int col;
			float z_cord,x_cord;
			//row= (int) (final_pos%no_of_rows);
			col= (int) (final_pos/no_of_rows);
			z_cord= (float) (startZ -(col*box_width))-(box_width*1.5f);
			System.out.println(z_cord);
			x_cord=-12;
			this.f_z=z_cord;
			this.f_x=x_cord;	
		}
		else if(final_pos_type==1)
		{
			float z_cord,x_cord;
			z_cord=15-(final_pos*30);
			x_cord=20;
			this.f_z=z_cord;
			this.f_x=x_cord;

		}
		else if(final_pos_type==2)
		{
			float z_cord,x_cord;
			z_cord=0;
			x_cord=20;
			this.f_z=z_cord;
			this.f_x=x_cord;
		}
		if(final_pos_type==3)
		{
			float z_cord,x_cord;
			z_cord=-20;
			x_cord=1;
			this.f_z=z_cord;
			this.f_x=x_cord;

		}
		if((f_x-i_x)>0)
		{
			dumbo_rot_angle=90-(float) Math.toDegrees(Math.atan((f_z-i_z)/(f_x-i_x)));
		}
		else
		{
			dumbo_rot_angle=270-(float) Math.toDegrees(Math.atan((f_z-i_z)/(f_x-i_x)));
		}
		System.out.println(dumbo_rot_angle);
		AnimationThread t=new AnimationThread(100,f_x,f_z,i_x,i_z);

		wants_to_move_dumbo=true;
		t.start();

		if(dumbo_inst!=null)
		{


			dumbo_inst.transform.setToTranslation(pos_x,pos_y,pos_z);	

		}



	}
	public void store(String value)
	{
		load_val_imag(value);

	}
	
	@Override
	public void dispose ()
	{

		modelBatch.dispose();
		box_inst_array.clear();
		label_inst_array.clear();
		value_inst_array.clear();
		drawer_inst_array.clear();
		assets.dispose();

	}

	public boolean needsGL20 ()
	{
		return true;
	}

	public void resume () 
	{
	}

	public void resize (int width, int height) 
	{
	}

	public void pause ()
	{
	}
public void load_val_imag(String value) {
		val_img_th t=new val_img_th(value);
		t.start();

		this.setVal_imgname(value);

	}
	class AnimationThread extends Thread
	{
		int steps;
		float final_x,final_y,final_z,ini_x,ini_y,ini_z;
		float off_pos_x,off_pos_z;

		public AnimationThread(int steps,float final_x,float final_z,float ix, float iz)
		{
			this.steps=steps;
			this.final_x=final_x;
			this.final_z=final_z;
			ini_x=ix;
			ini_z=iz;
			off_pos_x=(final_x-ix)/(float)steps;
			off_pos_z=(final_z-iz)/(float)steps;

		}

		public void run() 
		{
			if(step<steps)
			{
				pos_x+=off_pos_x;
				pos_z+=off_pos_z;
				try
				{
					Thread.sleep(50);
				}
				catch(InterruptedException e){}
				step++;
			}

			else{
				wants_to_move_dumbo=false;
				System.out.println("asd");
				dumbo_inst.transform.setToTranslation(final_x,0, final_z);

			}


		}
	}

	class img_th extends Thread
	{
		String label;
		int boxNo;
		public img_th(String label,int boxNo)
		{
			this.boxNo=boxNo;
			this.label=label;

		}

		public void run()
		{
			image img=new image(label);
			try {
				img.createImage();

			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			shouldLoad=true;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int row,col;
			float y_cord,z_cord;
			row= (int) (boxNo%no_of_rows);
			col= (int) (boxNo/no_of_rows);
			z_cord= (float) (startZ -(col*box_width));
			y_cord = (float) ((no_of_rows-row)*box_height);
			label_instance = new ModelInstance(model);
			label_instance.transform.setToTranslation(startX+box_thickness,y_cord+5 , z_cord-3);

			tex_att_label = new TextureAttribute(TextureAttribute.Diffuse, label_texture);
			mat_label = label_instance.materials.get(0);
			shouldLoad=false;
			mat_label.set(tex_att_label);
			label_instance.transform.rotate(1, 0, 0, 180);
			label_inst_array.add(label_instance);

		}

	}
	class val_img_th extends Thread
	{
		String value;

		public val_img_th(String value)
		{
			this.value=value;

		}

		public void run()
		{
			image vimg=new image(value);
			try {
				vimg.createImage();

			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			val_shouldLoad=true;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			Model mo= model;
				if(val_pos.x<0)
				mo=model;
				else
					mo=val_model;
			value_instance = new ModelInstance(mo);
			value_instance.transform.setToTranslation(val_pos);
			val_att_label = new TextureAttribute(TextureAttribute.Diffuse, value_texture);
			mat_value = value_instance.materials.get(0);
			val_shouldLoad=false;
			mat_value.set(val_att_label);
			value_instance.transform.rotate(1, 0, 0, 180);
			value_inst_array.add(value_instance);

		}

	}
	private class DisplayThread extends Thread
	{
		public void run()
		{
			display = false;
			
			try {
				
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			displayInstance = new ModelInstance(displaymodel);
			displayInstance.transform.setToTranslation(0,45,-20);

			tex_att_label = new TextureAttribute(TextureAttribute.Diffuse, displaytexture);
			mat_label = displayInstance.materials.get(0);
			//shouldLoad=false;
			loaddisplayimage=false;
			mat_label.set(tex_att_label);
			//label_instance.transform.rotate(1, 0, 0, 180);
				display =true;
		}
	}
	public void displaycmd(String string) {
		// TODO Auto-generated method stub
		loaddisplayimage= true;
		DisplayThread t = new DisplayThread();
		t.start();

	}

	public ModelBuilder getV_builder() {
		return v_builder;
	}

	public void setV_builder(ModelBuilder v_builder) {
		this.v_builder = v_builder;
	}

	public boolean isOpening() {
		return opening;
	}

	public void setOpening(boolean opening) {
		this.opening = opening;
	}

	public Vector3 getCurrent_camera_pos() {
		return current_camera_pos;
	}

	public void setCurrent_camera_pos(Vector3 current_camera_pos) {
		this.current_camera_pos = current_camera_pos;
	}

	public Vector3 getCurrent_camera_look_at() {
		return current_camera_look_at;
	}

	public void setCurrent_camera_look_at(Vector3 current_camera_look_at) {
		this.current_camera_look_at = current_camera_look_at;
	}

	public String getVal_imgname() {
		return val_imgname;
	}

	public void setVal_imgname(String val_imgname) {
		this.val_imgname = val_imgname;
	}

	public String getImgname() {
		return imgname;
	}

	public void setImgname(String imgname) {
		this.imgname = imgname;
	}
	
}
