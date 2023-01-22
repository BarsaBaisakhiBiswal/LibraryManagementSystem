package LibraryManagement.CheckoutService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import LibraryManagement.CheckoutService.entity.CheckoutEntity;
import LibraryManagement.CheckoutService.service.CheckoutService;

@RestController
public class CheckoutController {
	
@Autowired
CheckoutService checkoutService;

@RequestMapping("saveCheckoutDetails")
public CheckoutEntity saveCheckoutDetails(@RequestBody CheckoutEntity checkoutEntity) {
	CheckoutEntity checkoutData = new CheckoutEntity();
	try {
		checkoutData = checkoutService.saveCheckoutDetails(checkoutEntity);
	} catch (Exception e) {
		e.printStackTrace();
	}
	return checkoutData;
}

}
