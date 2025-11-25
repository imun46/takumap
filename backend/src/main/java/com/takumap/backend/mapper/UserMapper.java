package com.takumap.backend.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.takumap.backend.domain.User;

@Mapper
public interface UserMapper {

	//사용자 조회(로그인)
	User findBySnsId(String snsId, String snsType);
	
	//사용자 등록(회원가입)
	void insert(User user);
	
	//사용자 수정(회원정보수정)
	void update(User user);
	
	//사용자 삭제(회원 탈퇴)
	void deleteById(Long userId);
	
	//사용자 전체 조회
	List<User> findAll();
}
