package com.tedu.game;

import com.tedu.show.GameJFrame;
import com.tedu.show.GameMainJPanel;

public class GameStart {
	/**
	 * ����Ψһ���
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		GameJFrame gj=new GameJFrame();
		/*
		 * ʵ�������
		 */
		GameMainJPanel jp=new GameMainJPanel();
		gj.setjPanel(jp);
		gj.start();
	}

}
