package main;

import java.util.LinkedList;
import java.util.Queue;

public class ViduQueue {
	public static void main(String[] args) {
		Queue<String> danhSachSV = new LinkedList<String>();
		danhSachSV.offer("tuan 1");
		danhSachSV.offer("Nguyen Van A");
		danhSachSV.offer("nguyen van B");
		danhSachSV.offer("anh 2");
		
		while(true) {
			String ten = danhSachSV.poll(); //=>lấy ra và xoá
			if(ten==null) {
				break;
			}
			//peek=> lấy ra nhưng không xoá.
			System.out.println(ten);
		}
	}

}
