package com.takumap.backend.domain;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor   // 기본 생성자	          
@AllArgsConstructor  // 모든 필드를 인자로 받는 생성자
@ToString
@Builder
public class Shop {
	
	private Long shopId;                  //가게 아이디
	private String shopName;              //가게 명
	private String shopAddress;           //가게 주소
	private String shopContent;           //가게 설명
    private String shopHours;             //가게 영업 시간
    private String shopPhone;             //가게 전화번호
    private String shopSnsUrl;            //가게 sns 주소
    private BigDecimal latitude;          //위도
    private BigDecimal longitude;         //경도
    private String category;              //카테고리
}
