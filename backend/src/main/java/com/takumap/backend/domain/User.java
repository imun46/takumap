package com.takumap.backend.domain;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.Builder;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor 		// 기본 생성자	
@AllArgsConstructor		// 모든 필드를 인자로 받는 생성자
@ToString			
@Builder
public class User {

		private Long userId;                      //사용자 아이디
		private String snsType;                   //sns 타입 
		private String snsId;                     //sns 아이디
		private String ninkname;                  //닉네임
		private String email;                     //이메일
		private String profileImageUrl;           //프로필 이미지 링크
		private LocalDateTime createAt;           //가입 일시

}
