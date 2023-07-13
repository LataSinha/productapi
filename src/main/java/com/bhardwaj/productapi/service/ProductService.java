package com.bhardwaj.productapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhardwaj.productapi.dto.AnonymousSearchResponseDTO;
import com.bhardwaj.productapi.dto.LoggedUserSearchResponseDTO;
import com.bhardwaj.productapi.entity.ProductEntity;
import com.bhardwaj.productapi.model.SearchModel;
import com.bhardwaj.productapi.repository.ProductRepository;
@Service
public class ProductService {
	List<AnonymousSearchResponseDTO> anonymousSearchResponseDTOs = new ArrayList<>();
	List<LoggedUserSearchResponseDTO> loggedUserSearchResponseDTOs = new ArrayList<>();
	List<ProductEntity> response = null;
	@Autowired
	ProductRepository productRepository;
	public List<AnonymousSearchResponseDTO> getSearchResultForAnonymousUser(SearchModel sm){
		response = productRepository.getSearchResult(sm.getProductCode(), sm.getProductBrand(), sm.getProductName());
		anonymousSearchResponseDTOs.clear();
		for(ProductEntity p: response) {
			AnonymousSearchResponseDTO anonymousSearchResponseDTO = new AnonymousSearchResponseDTO();
			anonymousSearchResponseDTO.setId(p.getProductId());
			anonymousSearchResponseDTO.setName(p.getProductName());
			anonymousSearchResponseDTO.setBrand(p.getProductBrand());
			anonymousSearchResponseDTO.setImage(p.getProductImage());
			anonymousSearchResponseDTOs.add(anonymousSearchResponseDTO);
		}
		return anonymousSearchResponseDTOs;
	}
	public List<LoggedUserSearchResponseDTO> getSearchResultForLoggedUser(SearchModel sm){
		response = productRepository.getSearchResult(sm.getProductCode(), sm.getProductBrand(), sm.getProductName());
		loggedUserSearchResponseDTOs.clear();
		for(ProductEntity p: response) {
			LoggedUserSearchResponseDTO loggedUserSearchResponseDTO = new LoggedUserSearchResponseDTO();
			loggedUserSearchResponseDTO.setId(p.getProductId());
			loggedUserSearchResponseDTO.setName(p.getProductName());
			loggedUserSearchResponseDTO.setBrand(p.getProductBrand());
			loggedUserSearchResponseDTO.setImage(p.getProductImage());
			loggedUserSearchResponseDTO.setPrice(p.getProductPrice());
			loggedUserSearchResponseDTOs.add(loggedUserSearchResponseDTO);
		}
		return loggedUserSearchResponseDTOs;
	}
	
}
