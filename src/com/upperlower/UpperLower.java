package com.upperlower;

public class UpperLower {

	public static void main(String[] args) {
		char score [] = {'a', 'B', 'C', 'd', 'e'}; //����score�ַ�����
		System.out.println("����Ԫ��Ϊ��");
		for (int i = 0; i < score.length; i++)
			System.out.print(score[i] + "��\t"); //��������е�Ԫ��
		for (int i = 0; i < score.length; i++) {
			if (Character.isLowerCase(score[i])) { //�ж��ַ��Ƿ�ΪСд
				score[i] = Character.toUpperCase(score[i]); //��Сд�ַ�ת��Ϊ��д
			}
		}
		System.out.println(""); //����
		System.out.println("ת������Ϊ��");
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + "��\t"); //���ת����Ľ��
		}
	}

}
