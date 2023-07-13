package com.bhardwaj.productapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.bhardwaj.productapi.entity.ProductEntity;
@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
	@Query("SELECT p FROM ProductEntity p WHERE " +
	           "(:productCode IS NULL OR p.productCode = :productCode) AND " +
	           "(:productName IS NULL OR p.productName = :productName) AND " +
	           "(:productBrand IS NULL OR p.productBrand = :productBrand)")
	public List<ProductEntity> getSearchResult(@Param("productCode") String productCode, @Param("productBrand") String productBrand, @Param("productName") String productName);
	//native query
	//@Query(value="select * from product where productBrand='brand2'", nativeQuery = true)
}
