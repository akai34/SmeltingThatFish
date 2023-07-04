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
 * @说明 游戏的主要面板
 * @author renjj
 * @功能说明 主要进行元素的显示，同时进行界面的刷新(多线程)
 * 
 * @题外话 java开发实现思考的应该是：做继承或者是接口实现
 */
public class GameMainJPanel extends JPanel{
//	联动管理器
	private ElementManager em;
	
	public GameMainJPanel() {
		init();
//		以下代码 后面会换地方重写(测试代码)
		load();
	}
	public void load() {
//		图片导入
		ImageIcon icon=new ImageIcon("image/tank/play1/player1_up.png");
		ElementObj obj=new Play(100,100,50,50,icon);//实例化对象
//		讲对象放入到 元素管理器中
//		em.getElementsByKey(GameElement.PLAY).add(obj);
		em.addElement(obj,GameElement.PLAY);//直接添加
		ElementObj obj1=new Play(200,200,50,50,icon);
		em.addElement(obj1,GameElement.MAPS );
		ElementObj obj2=new Play(300,300,50,50,icon);
		em.addElement(obj2,GameElement.BOSS );
	}
	public void init() {
		em = ElementManager.getManager();//得到元素管理器对象
	}
	
	@Override  //用于绘画的    Graphics 画笔 专门用于绘画的
	public void paint(Graphics g) {
		super.paint(g);
		
		Map<GameElement, List<ElementObj>> all = em.getGameElements();
		Set<GameElement> set = all.keySet(); //得到所有的key集合
		for(GameElement ge:set) { //迭代器
			List<ElementObj> list = all.get(ge);
			for(int i=0;i<list.size();i++) {
				ElementObj obj=list.get(i);
				obj.showElement(g);//调用每个类的自己的show方法完成自己的显示
			}
		}
		
	}
	
	
}











