package org.ecommerce.emarket.Service;


import org.ecommerce.emarket.FakeStoreDto;
import org.ecommerce.emarket.Model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.ecommerce.emarket.Model.Category;

@Service
public class FakeStoreProductService implements ProductService{

    RestTemplate restTemplate;

    public  FakeStoreProductService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    public Product getProduct(int id){

        FakeStoreDto fakeStoreDto = restTemplate.getForObject("https://fakestoreapi.com/products/"+id, FakeStoreDto.class);

        return convertFakeStoreDtotoProduct(fakeStoreDto);


    }

    public Product createProduct(Product product){

        FakeStoreDto fakeStoreDto= new FakeStoreDto();
        //fakeStoreDto.setId(product.getId());
        fakeStoreDto.setTitle(product.getName());
        fakeStoreDto.setPrice(product.getPrice());
        fakeStoreDto.setDescription(product.getDescription());
        fakeStoreDto.setCategory(product.getCategory().getCategory_name());
        //fakeStoreDto.setImage(product.getImageUrl());


        FakeStoreDto fakeStore=restTemplate.postForObject("https://fakestoreapi.com/products",fakeStoreDto, FakeStoreDto.class);

        return convertFakeStoreDtotoProduct(fakeStore);


    }



    public Product convertFakeStoreDtotoProduct(FakeStoreDto fakeStoreDto){
        Product product = new Product();
        product.setId(fakeStoreDto.getId());
        product.setDescription(fakeStoreDto.getDescription());
        product.setName(fakeStoreDto.getTitle());
        product.setPrice(fakeStoreDto.getPrice());

        Category category= new Category();
        category.setCategory_name(fakeStoreDto.getCategory());

        product.setCategory(category);

        return product;




    }

}
