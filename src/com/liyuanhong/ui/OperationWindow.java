package com.liyuanhong.ui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import com.liyuanhong.listener.ChooseFile;
import com.liyuanhong.listener.ConvertFile;

public class OperationWindow {	
		public void init(){
		JFrame frame = new JFrame("android�Զ����ű�ת����");
		frame.setLayout(new FlowLayout());
		JButton selectFile = new JButton("ѡ��");
		JTextField filePathFild = new JTextField();
		JButton convertTo = new JButton("ת��");
		
		filePathFild.setColumns(35);
		
		selectFile.addMouseListener(new ChooseFile(filePathFild, frame));
		convertTo.addMouseListener(new ConvertFile(frame, filePathFild));
		
		frame.add(selectFile);
		frame.add(filePathFild);
		frame.add(convertTo);
		
		frame.pack();
		setWindowCenter(frame);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		
	public void setWindowCenter(JFrame frame){
		int windowWidth = frame.getWidth();                    //��ô��ڿ�
        int windowHeight = frame.getHeight();                  //��ô��ڸ�
        Toolkit kit = Toolkit.getDefaultToolkit();             //���幤�߰�
        Dimension screenSize = kit.getScreenSize();            //��ȡ��Ļ�ĳߴ�
        int screenWidth = screenSize.width;                    //��ȡ��Ļ�Ŀ�
        int screenHeight = screenSize.height;                  //��ȡ��Ļ�ĸ�
        frame.setLocation(screenWidth/2-windowWidth/2, screenHeight/2-windowHeight/2);
	}
}
