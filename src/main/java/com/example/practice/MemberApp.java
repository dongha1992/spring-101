package com.example.practice;

import com.example.practice.member.Grade;
import com.example.practice.member.Member;
import com.example.practice.member.MemberService;

public class MemberApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();

        Member memberA = new Member(1L, "memberA", Grade.VIP);
        memberService.join(memberA);

        Member findMember = memberService.findMember(1L);
        System.out.println(findMember.getName());
    }
}
