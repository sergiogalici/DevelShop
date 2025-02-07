package kosmok.teamlebimbe.ecommerce.controller;

import it.pasqualecavallo.studentsmaterial.authorization_framework.filter.AuthenticationContext;
import it.pasqualecavallo.studentsmaterial.authorization_framework.security.RoleSecurity;
import kosmok.teamlebimbe.ecommerce.controller.response.BaseResponse;
;
import kosmok.teamlebimbe.ecommerce.repository.IRegistrationCustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/delete-customer")
public class DeleteCustomer {

    @Autowired
    private IRegistrationCustomerRepository iRegistrationCustomerRepository;

    @DeleteMapping("/{id}")
    @RoleSecurity(value = "admin")
    public BaseResponse deleteCustomerById(@PathVariable Long id) {

        iRegistrationCustomerRepository.deleteById(id);

        return new BaseResponse("Customer with id " + id + " has been deleted from the repository");
    }

}