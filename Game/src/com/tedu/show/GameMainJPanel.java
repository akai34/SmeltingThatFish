package com.tedu.show;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import com.tedu.element.ElementObj;
import com.tedu.element.Play;
import com.tedu.manager.ElementManager;
import com.tedu.manager.GameElement;

/**
 * @˵�� ��Ϸ�����
 * @author ASUS
 * @���� Ԫ����ʾ������ˢ��
 */
public class GameMainJPanel extends JPanel{
//������
	private ElementManager em;
	
	public GameMainJPanel() {
		init();
		//���Դ���
		load();
	}
	
	public void load() {
		//ͼƬ����
		ImageIcon icon = new ImageIcon("ͼƬ·��");
		//ʵ����
		ElementObj obj=new Play(100, 100, 50, 50, icon);
		//��Ӷ���
//		em.getElementsByKey(GameElement.PLAY).add(obj);
		em.addElement(obj, GameElement.PLAY);
	}
	
	public void init() {
		em=ElementManager.getManager();//�õ�����
	}
	@Override //���ڻ滭 Graphics����
	public void paint(Graphics g) {
		super.paint(g);
		
		Map<GameElement, List<ElementObj>> all = em.getGameElements();
		Set<GameElement> set = all.keySet();
		//������
		for (GameElement ge:set) {
			List<ElementObj> list = all.get(ge);
			for (int i=0; i<list.size(); i++) {
				ElementObj obj=list.get(i);
				obj.showElement(g);
			}
		}
		
//		g.setColor(new Color(255, 0, 0));
//		g.setFont(new Font("΢���ź�", Font.BOLD, 48));
//		g.drawString("I Hat ", 200, 200);
//		
//		g.fillOval(300, 300, 100, 100);//���Բ
//		g.drawOval(300, 300, 100, 200);//�����
	}
	
	
}
