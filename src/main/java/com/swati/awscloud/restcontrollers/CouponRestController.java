package com.swati.awscloud.restcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.swati.awscloud.model.Coupon;
import com.swati.awscloud.repos.CouponRepo;

@RestController
@RequestMapping("/couponapi")
public class CouponRestController {
	
	@Autowired
	private CouponRepo couponRepo;
	
	//create a coupon
	@RequestMapping(value="/coupons", method=RequestMethod.POST)
	public Coupon createCoupon(@RequestBody Coupon coupon) {
		return couponRepo.save(coupon);
	}
	
	//find a coupon by code
	@RequestMapping(value="/getcoupon/{code}", method=RequestMethod.GET)
	public Coupon getCoupon(@PathVariable("code") String code) {
		return couponRepo.findByCode(code);
	}

}
