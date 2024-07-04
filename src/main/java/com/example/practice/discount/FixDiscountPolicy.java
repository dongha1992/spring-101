package com.example.practice.discount;

import com.example.practice.member.Grade;
import com.example.practice.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {
    private int dicountFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return dicountFixAmount;
        } else {
            return 0;
        }
    }
}
