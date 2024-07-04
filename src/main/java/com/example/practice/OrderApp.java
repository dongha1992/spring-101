package com.example.practice;

import com.example.practice.member.Grade;
import com.example.practice.member.Member;
import com.example.practice.member.MemberService;
import com.example.practice.order.Order;
import com.example.practice.order.OrderService;

public class OrderApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        Order order = orderService.createOrder(memberId, "itemA", 10000);
    }
}
