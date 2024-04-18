package edu.miu.cs.cs489.lesson7.adsweb.dao;

import edu.miu.cs.cs489.lesson7.adsweb.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Long> {
    List<Address> findAllByOrderByCityAsc();
}
