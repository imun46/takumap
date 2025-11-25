package com.takumap.backend.domain;

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
public class Bookmark {
	
	private Long bookmarkId;              //북마크 아이디
    private Long userId;                  //유저 아이디(FK)
    private Long shopId;                  //가게 아이디(FK)
    private LocalDateTime createdAt;      //생성일자
    
}
