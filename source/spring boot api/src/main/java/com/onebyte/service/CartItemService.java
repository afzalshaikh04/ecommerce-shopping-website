package com.onebyte.service;

import com.onebyte.exception.CartItemException;
import com.onebyte.exception.UserException;
import com.onebyte.modal.Cart;
import com.onebyte.modal.CartItem;
import com.onebyte.modal.Product;

public interface CartItemService {
	
	public CartItem createCartItem(CartItem cartItem);
	
	public CartItem updateCartItem(Long userId, Long id,CartItem cartItem) throws CartItemException, UserException;
	
	public CartItem isCartItemExist(Cart cart,Product product,String size, Long userId);
	
	public void removeCartItem(Long userId,Long cartItemId) throws CartItemException, UserException;
	
	public CartItem findCartItemById(Long cartItemId) throws CartItemException;
	
}
