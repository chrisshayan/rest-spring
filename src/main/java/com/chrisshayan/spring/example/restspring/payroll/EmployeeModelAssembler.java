package com.chrisshayan.spring.example.restspring.payroll;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@Component
public class EmployeeModelAssembler implements RepresentationModelAssembler<Employee, EntityModel<Employee>> {

    @Override
    public EntityModel<Employee> toModel(Employee entity) {
        return new EntityModel<>(entity,
                    linkTo(methodOn(EmployeeController.class).find(entity.getId())).withSelfRel(),
                    linkTo(methodOn(EmployeeController.class).all()).withRel("employees")
                );
    }
}
