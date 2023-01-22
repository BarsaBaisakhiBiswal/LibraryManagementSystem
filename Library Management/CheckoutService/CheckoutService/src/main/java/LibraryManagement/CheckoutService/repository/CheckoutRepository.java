package LibraryManagement.CheckoutService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import LibraryManagement.CheckoutService.entity.CheckoutEntity;


public interface CheckoutRepository extends JpaRepository<CheckoutEntity, Integer>{

	CheckoutEntity save(CheckoutEntity checkoutEntity);

}
