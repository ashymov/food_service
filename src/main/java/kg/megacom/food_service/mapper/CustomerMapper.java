package kg.megacom.food_service.mapper;

import kg.megacom.food_service.model.dto.CustomerDto;
import kg.megacom.food_service.model.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CustomerMapper {
    CustomerMapper INSTANCE= Mappers.getMapper(CustomerMapper.class);

    Customer customerDtoToCustomer(CustomerDto customerDto);
    CustomerDto customerToCustomerDto(Customer customer);

    List<Customer> customerDtosToCustomers(List<CustomerDto> customerDtos);
    List<CustomerDto> customerToCustomersdtos(List<Customer> customer);
}
