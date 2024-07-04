package com.example.practice.discount;

import com.example.practice.member.Member;

public interface DiscountPolicy {
    int discount(Member member, int price);
}
