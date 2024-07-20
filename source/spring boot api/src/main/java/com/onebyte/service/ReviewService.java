package com.onebyte.service;

import java.util.List;

import com.onebyte.exception.ProductException;
import com.onebyte.modal.Review;
import com.onebyte.modal.User;
import com.onebyte.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
