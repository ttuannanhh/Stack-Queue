package main;

import java.util.Scanner;
import java.util.Stack;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Stack<String>stackChuoi = new Stack<String>();
		
		//stackChuoi.push("giatri")=>đua gia tri vao stack
		//stackChuoi.pop()=>lấy giá trị ra,xoá khói stack
		//stackChuoi.peek()=>lấy gia tri ra, nhung khong xoa khoi stack
		//stack.Chuoi.clear();=>xoá tất cả phần tử trong stack
		//stackChuoi.contains("giati")=>xác định giá trị có tồn tại trong stack hay không
		//stackChuoi.size()=>độ lớn của stack
		
		
		//ví dụ đảo ngược chuỗi
		System.out.println("Nhap vao chuoi: ");
		String s = sc.nextLine();
		
		for(int i=0; i<s.length();i++) {
			stackChuoi.push(s.charAt(i)+"");
		}
			for(int i=0; i<s.length();i++) {
				System.out.println(stackChuoi.pop());
			}
			System.out.println();
			//Chuyen tu he thap phan sang he nhi phan
			Stack<String> stackSoDu = new Stack<String>();
			System.out.println("Nhap 1 so nguyen duong tu ban phim");
			int x = sc.nextInt();
			while(x>0) {
				int soDu = x%2;
				stackSoDu.push(soDu+"");
				x=x/2;
				
			}
			System.out.println("Số nhị phân là: ");
			int n = stackSoDu.size();
			for(int i=0; i<n;i++) {
				System.out.print(stackSoDu.pop());
		
				
			}
		}
	}


