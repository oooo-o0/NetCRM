package com.example.app.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.app.domain.Member;
import com.example.app.domain.MemberType;
import com.example.app.mapper.MemberMapper;
import com.example.app.mapper.MemberTypeMapper;

import lombok.RequiredArgsConstructor;

@Service
@Transactional(rollbackFor = Exception.class)
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    private final MemberMapper memberMapper;
    private final MemberTypeMapper memberTypeMapper;

    @Override
    public List<Member> getMemberList() {
        return memberMapper.selectAll();
    }

    @Override
    public Member getMemberById(Integer id) {
        return memberMapper.selectById(id);
    }

    @Override
    public void addMember(Member member) {
        memberMapper.insert(member);
    }

    @Override
    public void editMember(Member member) {
        memberMapper.update(member);
    }

    @Override
    public void deleteMember(Integer id) {
        memberMapper.delete(id);
    }

    @Override
    public List<MemberType> getTypeList() {
        return memberTypeMapper.selectAll();
    }
}