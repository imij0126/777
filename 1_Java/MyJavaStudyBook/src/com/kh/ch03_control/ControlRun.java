package com.kh.ch03_control;

import java.util.Scanner;

public class ControlRun {
	public static void main(String[] args) {
		/*
		 * * 프로그램의 진행은 순차적으로 진행됨 (위에서 아래로, 왼쪾에서 오른쪽으로)
		 *   이 흐름을 바꾸고자 할 때 제어문을 통해 직접 제어 가능
		 *   
		 *   - 선택적으로 실행시키고자 할 때 => 조건문
		 *   - 반복적으로 실행시키고자 할 때 => 반복문
		 *   - 그 외의 흐름 제어 => 분기문
		 */
		/*
		 * * 조건문 : 조건식을 통해 참/거짓에 따라 코드를 실행
		 *   - 종류
		 *     [1] if문
		 *     [2] switch문
		 */
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		// 입력된 값이 양수인지 양수가 아닌지 판별
		if (num > 0) {	// 조건식의 결과가 true인 경우 if 중괄호 안의 코드 실행
			System.out.println(num + "의 값은 양수다.");
		} else {		// 조건식의 결과가 false인 경우 else 중괄호 안의 코드 실행
			System.out.println(num + "의 값은 양수가 아니다.");
		}
		*/
		
		/*
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		// 13세 이하인 경우 "어린이", 14세 이상 19세 이하인 경우 "청소년", 20세 이상인 경우 "성인"
		String result = "";
		if (age > 0) {
			if (age <= 13) {
				result = "어린이";
			} else if (age <= 19) {
				result = "청소년";
			} else {
				result = "성인";
			}
			System.out.println(age + "살은 " + result + "입니다.");
		} else {
			System.out.println("잘못 입력하였습니다.");
		}
		*/
		
		/**
		 * 사용자에게 구매할 과일을 입력받아, 가격을 출력하기
		 * - 수박 : 15000
		 * - 참외 : 5000
		 * - 복숭아 : 10000
		 */
		/*
		System.out.print("구매할 과일을 입력 (수박/참외/복숭아) : ");
		String fruit = sc.next();
		
		// TODO: "xx의 가격은 xxx원입니다." 출력. (단, 다른 과일을 입력했을 때 "잘못 입력하였습니다." 출력
		int price = 0;
		switch (fruit) {
		case "수박":
			price = 15000; break;
		case "참외":
			price = 5000; break;
		case "복숭아":
			price = 10000; break;
		default:
				System.out.println("잘못 입력하였습니다.");
		}
		if (price > 0) {
		System.out.println(fruit + "의 가격은 " + price + "원입니다.");
		}
		*/
		// ======================================================
		/*
		 * * 반복문 : 어떤 코드를 반복적으로 실행
		 *   - 종류
		 *   [1] for문
		 *   [2] while문
		 */
		/*
		 * 		for(초기식; 조건식; 증감식) { 	// 반복 횟수 설정
		 * 			// 반복적으로 실행할 코드 작성
		 * 		}
		 * 
		 * 		- 초기식 : 반복문이 수행될 때 "처음 단 한 번만 실행"
		 * 				 => 보통 반복문 안에서 사용될 변수를 선언 및 초기화
		 * 		- 조건식 : "반복문이 수행될 조건"
		 * 				 => 조건식의 결과가 true일 때 코드 실행
		 * 					조건식의 결과가 false일 때 반복문을 종료
		 * 				 => 보통 초기식에 선언된 변수를 가지고 조건식을 작성
		 * 		- 증감식 : 반복문을 제어하는 변수의 값을 증가시키거나 감소시키는 부분
		 * 				 => 보통 초기식에 선언된 변수를 가지고 증감연산자(++, --)를 사용
		 */
		
		
		// TODO: 2 ~ 9 사이의 랜덤값을 뽑아 x단 출력하기
		/*int dan = (int)(Math.random() * (9-2+1) + 2);
		// 4 x 1 = 4
		// 4 x 2 = 8
		// ...
		// 4 x 9 = 36 --> 출력은 printf 사용
		for (int i=1; i<10; i++) {
			System.out.printf("%d x %d = %d\n", dan, i, dan * i);
		}*/
		
		
		/*
		 * TODO: 위의 랜덤값을 기준으로 아래와 같이 출력해보기. (ex dan == 4)
		 *  1***
		 *  *2**
		 *  **3*
		 *  ***4
		 */
		
		/*
		for(int i=0; i<dan; i++) {
			for(int j=0; i<dan; j++) {
				if(i == j) System.out.print(i+1);
				else System.out.print("*");
				}
				System.out.println();
			}
			*/
		// -----------------------------------------------------
		/*
		 * 		while(조건식) {
		 * 			반복 실행할 코드
		 * 		}
		 */
		// 위의 랜덤 구구단을 while문을 사용하여 출력
		/*int i = 1;
		while(i < 10) {
			System.out.printf("%d x %d = %d\n", dan, i, dan*i);
			i++;
		}*/
		
		/*
		  	do {		// 무조건 1회 실행한 후 조건식의 결과를 확인하여 반복 수행
		  		반복 실행할 코드
		  	} while(조건식);
		 */
		/*int num2 = 1;
		do {
			System.out.println(num2);
		} while (num2 == 0);*/
		// --------------------------
		/*
		 * 분기문
		 * 		- continue; : 코드 실행하다가 이 분기문을 만나면 다음 분기로 넘김
		 * 
		 * 		- break;    : 반복문을 강제로 빠져나감(종료)
		 * 			* switch문 안의 break;는 switch문만을 빠져나감!
		 */
		// 1 ~ 10 사이의 홀수만 출력 ==> continue;
		for(int k=1; k<=10; k++) { // 1 3 5 7 9
			if(k % 2 == 0) {
				continue;
			}
				System.out.print(k + " ");
			}
			System.out.println("---------------");
		
		// 반복적으로 랜덤값 (1 ~ 100)을 추출한 후 출력. 단, 3의 배수인 경우 반복문 종료
		while(true) {
			int random = (int)(Math.random() * 100 + 1);
			
			if (random % 3 == 0) {
				System.out.println("\n 3의 배수 : " + random);
				break;
			}
				System.out.print(random + " ");
		}
		
	}
}
	
	
