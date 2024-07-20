package com.onebyte.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onebyte.modal.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
