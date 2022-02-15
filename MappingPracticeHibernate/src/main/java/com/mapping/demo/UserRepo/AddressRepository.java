package com.mapping.demo.UserRepo;

import com.mapping.demo.entity.Address;
import com.mapping.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address,Integer> {
}
