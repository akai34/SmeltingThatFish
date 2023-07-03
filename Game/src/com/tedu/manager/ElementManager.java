package com.tedu.manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.tedu.element.ElementObj;

/**
 * @˵�� Ԫ�ع�����
 * @author ASUS
 * @ һ�����
 * @ ��������������
 */
public class ElementManager {
	/*
	 * key(ö��)->list<Ԫ�ػ���>
	 */
	private Map<GameElement, List<ElementObj>> gameElements;

	public Map<GameElement, List<ElementObj>> getGameElements() {
		return gameElements;
	}
	
	/*
	 * ����
	 * 1��̬����
	 * 2��̬����
	 * 3˽�л�����
	 */
	
	private static ElementManager EM=null;
	// �߳���
	public static synchronized ElementManager getManager() {
		if (EM == null) {
			EM=new ElementManager();
		}
		return EM;
	}
	//���Ԫ��
	public void addElement(ElementObj obj, GameElement ge) {
//		List<ElementObj> list=gameElements.get(ge);
//		list.add(obj);
		//�ȼ���
		gameElements.get(ge).add(obj);
	}
	//��key����list
	public List<ElementObj> getElementsByKey(GameElement ge){
		return gameElements.get(ge);
	}
	
	private ElementManager() {
		init();
	}
	//����ʵ����
//	static {
//		EM=new ElementManager();
//	}
	public void init() {
		gameElements = new HashMap<GameElement, List<ElementObj>>();
		gameElements.put(GameElement.PLAY, new ArrayList<ElementObj>());
		//...
	}
	
}
