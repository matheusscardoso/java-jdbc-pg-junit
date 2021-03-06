package domain.irepository;

import java.util.List;

import domain.entities.Product;

public interface IProductRepository {
	Product listProductByID(String productId);

	List<Product> listAllProducts();

	int insertProduct(Product product);

	int deleteProduct(String productId);

	int updateProduct(Product product, String productId);
}
