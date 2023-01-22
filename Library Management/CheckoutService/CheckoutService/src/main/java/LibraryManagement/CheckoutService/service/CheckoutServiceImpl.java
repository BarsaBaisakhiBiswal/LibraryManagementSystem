package LibraryManagement.CheckoutService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import LibraryManagement.CheckoutService.entity.CheckoutEntity;
import LibraryManagement.CheckoutService.repository.CheckoutRepository;

@Service
public class CheckoutServiceImpl implements CheckoutService{
	
	@Autowired
	private CheckoutRepository checkoutRepository;

	@Override
	public CheckoutEntity saveCheckoutDetails(CheckoutEntity checkoutEntity) {
		CheckoutEntity checkoutData = new CheckoutEntity();
		try {
			checkoutData = checkoutRepository.save(checkoutEntity);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return checkoutData;
	
	}
	

}
