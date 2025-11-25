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
public class Route {
	
	private Long routeId;            //루트 아이디
    private Long userId;             //사용자 아이디(FK)
    private String title;            //루트 제목
    private String description;      //루트 설명 
    
}
