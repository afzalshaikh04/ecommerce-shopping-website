package com.onebyte.service;

import com.onebyte.exception.ProductException;
import com.onebyte.modal.Cart;
import com.onebyte.modal.CartItem;
import com.onebyte.modal.User;
import com.onebyte.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public CartItem addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
