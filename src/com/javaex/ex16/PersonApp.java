package com.javaex.ex16;

public class PersonApp {

	public static void main(String[] args) {
		
		Person p01 = new Person("정우성", 45);
		p01.showInfo();
		
		Student s01 = new Student("이정재",46,"서울고");
		s01.showInfo();
		
		Person ps01 = new Student("강호동",50,"마산고");
		ps01.showInfo(); //자식 코드를 막아놔도 생성자 이름이 같다면 자식의 걸로 출력됨
		
	}

}
