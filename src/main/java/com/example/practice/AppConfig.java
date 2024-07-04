package com.example.practice;

import com.example.practice.discount.FixDiscountPolicy;
import com.example.practice.member.MemberService;
import com.example.practice.member.MemberServiceImpl;
import com.example.practice.member.MemoryMemberRepository;
import com.example.practice.order.OrderService;
import com.example.practice.order.OrderServiceImpl;

public class AppConfig {
    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }
}
