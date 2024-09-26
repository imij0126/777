package com.kh.spring.member.model.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor			// 기본생성자
@AllArgsConstructor			// 모든 필드를 매개변수로 가지는 생성자
@Getter						// getter 메소드
@Setter						// setter 메소드
@ToString	
public class Reply {
	private int replyNo;
	private String replyContent;
	private int refBno;
	private String replyWriter;
	private Date createDate;
	private String Status;
}
