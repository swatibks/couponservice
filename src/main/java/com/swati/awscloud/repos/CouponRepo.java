package com.swati.awscloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swati.awscloud.model.Coupon;

public interface CouponRepo extends JpaRepository<Coupon, Long> {

	Coupon findByCode(String code);

}
