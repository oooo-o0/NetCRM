package com.example.app.service;

import java.util.List;

import com.example.app.domain.Member;
import com.example.app.domain.MemberType;

public interface MemberService {
    List<Member> getMemberList();

    Member getMemberById(Integer id);

    void addMember(Member member);

    void editMember(Member member);

    void deleteMember(Integer id);

    List<MemberType> getTypeList();
}
