package cn.itcast_03;

import java.util.LinkedList;

/*
 * LinkedList鐨勭壒鏈夊姛鑳斤細
 * 		A:娣诲姞鍔熻兘
 * 			void addFirst()
 * 			void addLast()
 * 		B:绉婚櫎鍔熻兘
 * 			Object removeFirst()
 * 			Object removeLast()
 * 		C:鑾峰彇鍔熻兘
 * 			Object getFirst()
 * 			Object getLast()
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		// 鍒涘缓闆嗗悎瀵硅薄
		LinkedList link = new LinkedList();

		// 娣诲姞鍏冪礌
		link.add("hello");
		link.add("world");
		link.add("java");

		// void addFirst()
		// void addLast()
		// link.addFirst("android");
		// link.addLast("javaee");

		// Object removeFirst()
		// Object removeLast()
		// System.out.println("removeFirst:" + link.removeFirst());
		// System.out.println("removeLast:" + link.removeLast());

		// Object getFirst()
		// Object getLast()
		System.out.println("getFirst:" + link.getFirst());
		System.out.println("getLast:" + link.getLast());

		System.out.println("link:" + link);
	}
}
