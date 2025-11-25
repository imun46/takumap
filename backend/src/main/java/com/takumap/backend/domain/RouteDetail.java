package com.takumap.backend.domain;

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
public class RouteDetail {
	
	private Long routeDetailId;   //루트 상세 아이디
    private Long routeId;         //상위 루트 아이디
    private Long shopId;          //가게 아이디(FK)
    private Integer stepOrder;    //루트 방문 순서
    
}
