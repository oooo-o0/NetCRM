package com.example.app.mapper;

import java.util.List;

import com.example.app.domain.Member;

public interface MemberMapper {
	List<Member> selectAll();
	Member selectById(Integer id);
	void insert(Member member);
	void update(Member member);
	void delete(Integer id);
}
