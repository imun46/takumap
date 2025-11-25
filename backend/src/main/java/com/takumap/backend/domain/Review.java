package com.takumap.backend.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor 		// 기본 생성자	
@AllArgsConstructor		// 모든 필드를 인자로 받는 생성자
@ToString			
@Builder
public class Review {
	
	private Long reviewId;               //후기 아이디
    private Long userId;                 //사용자 아이디(FK)
    private Long shopId;                 //가게 아이디(FK)
    private BigDecimal rating;           //평점
    private String content;              //후기 내용
    private LocalDateTime createdAt;     //생성일자
}                                        
