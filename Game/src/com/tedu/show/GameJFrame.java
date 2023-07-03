package com.tedu.show;

import java.awt.event.KeyListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.tedu.element.ElementObj;
import com.tedu.element.Play;

/**
 * @˵�� ��Ϸ����
 * @author ASUS
 * @����˵��:
 * 	    Ƕ����壬�������̵߳ȵ�
 * @����˵�� swing awt ��С����¼�ϴδ�С��
 * 
 * @ ���� 1.���󶨴���
 * 		  2.������
 *        3.���߳�����
 *        4.��ʾ����
 */
public class GameJFrame extends JFrame{
	public static int GameX = 500;
	public static int GameY = 600;
	private JPanel jPanel = null;//���
	private KeyListener KeyListener=null;
	private MouseMotionListener mouseMotionListener=null;
	private MouseMotionListener mouseListener=null;
	private Thread thead = null;
	
	public GameJFrame() {
		init();
		
	}
	
	public void init() {
		this.setSize(GameX, GameY);
		this.setTitle("������Ϸ");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//
		this.setLocationRelativeTo(null);//����
	}
	/*
	 * ���岼��
	 */
	public void addButton() {
//		this.setLayout(manager);//��ӿؼ�
	}
	
	/*
	 * ����
	 */
	public void start() {
		if (jPanel!=null) {
			this.add(jPanel);
		}
		if (KeyListener!=null) {
			this.addKeyListener(KeyListener);
		}
		if (thead!=null) {
			thead.start();
		}
		//����ˢ��
		this.setVisible(true);
	}
	
	/* setע�� */
	public void setjPanel(JPanel jPanel) {
		this.jPanel = jPanel;
	}

	public void setKeyListener(KeyListener keyListener) {
		KeyListener = keyListener;
	}

	public void setMouseMotionListener(MouseMotionListener mouseMotionListener) {
		this.mouseMotionListener = mouseMotionListener;
	}

	public void setMouseListener(MouseMotionListener mouseListener) {
		this.mouseListener = mouseListener;
	}

	public void setThead(Thread thead) {
		this.thead = thead;
	}
	
	 
}
