package com.onebyte.service;

import java.util.List;

import com.onebyte.exception.ProductException;
import com.onebyte.modal.Rating;
import com.onebyte.modal.User;
import com.onebyte.request.RatingRequest;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
