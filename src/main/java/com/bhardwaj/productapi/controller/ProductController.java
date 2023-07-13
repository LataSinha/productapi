package com.bhardwaj.productapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bhardwaj.productapi.dto.AnonymousSearchResponseDTO;
import com.bhardwaj.productapi.dto.LoggedUserSearchResponseDTO;
import com.bhardwaj.productapi.dto.ServicabilityResponseDTO;
import com.bhardwaj.productapi.entity.ProductEntity;
import com.bhardwaj.productapi.entity.ProductServiceAreaEntity;
import com.bhardwaj.productapi.model.SearchModel;
import com.bhardwaj.productapi.repository.ProductRepository;
import com.bhardwaj.productapi.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductRepository productRepository;
	@Autowired
	ProductService productService;
	
	//no authentication required
	//returns producId, productName, productBrand, productImage
	@CrossOrigin("*")
	@PostMapping("/api/product/anonymous/search")
	public List<AnonymousSearchResponseDTO> getSearchResultForAnonymousUser(@RequestBody SearchModel sm){
		return productService.getSearchResultForAnonymousUser(sm);
	}
	
	//End point for handling preflight OPTION request.
	@CrossOrigin("*")
	@RequestMapping(value = "/api/product/loggeduser/search", method = RequestMethod.OPTIONS)
    public ResponseEntity handlePreflightRequestForSearch() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Access-Control-Allow-Origin", "*");
        headers.add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE");
        headers.add("Access-Control-Allow-Headers", "Authorization");
        headers.add("Access-Control-Allow-Credentials", "true");
        headers.add("Access-Control-Max-Age", "3600");

        return new ResponseEntity(headers, HttpStatus.OK);
    }
	
	@CrossOrigin("*")
	@RequestMapping(value = "/api/product/price/{id}", method = RequestMethod.OPTIONS)
    public ResponseEntity handlePreflightRequestForPrice() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Access-Control-Allow-Origin", "*");
        headers.add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE");
        headers.add("Access-Control-Allow-Headers", "Authorization");
        headers.add("Access-Control-Allow-Credentials", "true");
        headers.add("Access-Control-Max-Age", "3600");

        return new ResponseEntity(headers, HttpStatus.OK);
    }
	
	@CrossOrigin("*")
	@RequestMapping(value = "/api/product/detail{id}", method = RequestMethod.OPTIONS)
    public ResponseEntity handlePreflightRequestForDetail() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Access-Control-Allow-Origin", "*");
        headers.add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE");
        headers.add("Access-Control-Allow-Headers", "Authorization");
        headers.add("Access-Control-Allow-Credentials", "true");
        headers.add("Access-Control-Max-Age", "3600");

        return new ResponseEntity(headers, HttpStatus.OK);
    }
	
	@CrossOrigin("*")
	@RequestMapping(value = "/api/product/servicability/{id}/{areaCode}", method = RequestMethod.OPTIONS)
    public ResponseEntity handlePreflightRequestForServicability() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Access-Control-Allow-Origin", "*");
        headers.add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE");
        headers.add("Access-Control-Allow-Headers", "Authorization");
        headers.add("Access-Control-Allow-Credentials", "true");
        headers.add("Access-Control-Max-Age", "3600");

        return new ResponseEntity(headers, HttpStatus.OK);
    }
	
	
	//authentication required
	//returns producId, productName, productBrand, productImage, productPrice
	@CrossOrigin("*")
	@PostMapping("/api/product/loggeduser/search")
	public List<LoggedUserSearchResponseDTO> getSearchResultForLoggedUser(@RequestBody SearchModel sm){
		return productService.getSearchResultForLoggedUser(sm);
	}
	//authentication required
	//return complete details of a particular product
	@CrossOrigin("*")
	@GetMapping("/api/product/detail/{id}")
	public ProductEntity getProductDetail(@PathVariable int id){
		return (ProductEntity) productRepository.findById(id).orElse(null);
	}
	//authentication required
	//returns price of a particular product
	@CrossOrigin("*")
	@GetMapping("/api/product/price/{id}")
	public double getProductPrice(@PathVariable int id){
		ProductEntity p = (ProductEntity) productRepository.findById(id).orElse(null);
		return p.getProductPrice();
	}
	
	//authentication required
	//returns the servicability status for a given product in a particular area.
	@CrossOrigin("*")
	@GetMapping("/api/product/servicability/{id}/{areaCode}")
	public ServicabilityResponseDTO getServicabilityStatus(@PathVariable int id, @PathVariable String areaCode) {
		ProductEntity p = (ProductEntity) productRepository.findById(id).orElse(null);
		List<ProductServiceAreaEntity> productServiceAreas = p.getProductServiceAreas();
		ServicabilityResponseDTO servicabilityResponseDTO = new ServicabilityResponseDTO();
		for(ProductServiceAreaEntity psa: productServiceAreas) {
			if(psa.getAreaCode().equalsIgnoreCase(areaCode)) {
				servicabilityResponseDTO.setStatus(true);
				servicabilityResponseDTO.setInDays(psa.getDaysToDeliver());
				return servicabilityResponseDTO;
			}
		}
		servicabilityResponseDTO.setInDays(-1);
		servicabilityResponseDTO.setStatus(false);
		return servicabilityResponseDTO;
	}
	
	//additional api which is not required
	//return image of a particular product
	@CrossOrigin("*")
	@GetMapping(path="/api/product/image/{id}")
	public byte[] getProductImage(@PathVariable int id){
		ProductEntity p = (ProductEntity) productRepository.findById(id).orElse(null);
		return p.getProductImage();
	}
}
