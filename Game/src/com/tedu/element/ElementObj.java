package com.tedu.element;

import java.awt.Graphics;

import javax.swing.ImageIcon;

/**
 * @˵�� Ԫ�ػ���
 * @author ASUS
 *
 */
public abstract class ElementObj {
	private int x;
	private int y;
	private int w;
	private int h;
	private ImageIcon icon;
	//...
	public ElementObj() {
		
	}
	/**
	 * ���ι���
	 * @param x ���Ͻ�x����
	 * @param y ���Ͻ�y����
	 * @param w ���
	 * @param h �߶�
	 * @param icon ͼƬ
	 */
	public ElementObj(int x, int y, int w, int h, ImageIcon icon) {
		super();
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.icon = icon;
	}
	/**
	 * @˵�� ���󷽷�����ʾԪ��
	 * @param g ����
	 */
	public abstract void showElement(Graphics g);
	
	/**
	 * set��get����
	 * @return
	 */
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public ImageIcon getIcon() {
		return icon;
	}
	public void setIcon(ImageIcon icon) {
		this.icon = icon;
	}
	
	
}
