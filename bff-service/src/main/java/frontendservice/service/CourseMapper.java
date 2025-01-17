package frontendservice.service;

import frontendservice.employeesgateway.Employee;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
@DecoratedWith(CourseMapperDecorator.class)
public interface CourseMapper {

    List<frontendservice.service.Course> toDto(List<frontendservice.coursegateway.Course> courses);

    @Mapping(target = "enrolledEmployees", ignore = true)
    @Mapping(target = "completedEmployees", ignore = true)
    frontendservice.service.CourseDetails toDto(frontendservice.coursegateway.CourseDetails courseDetails, List<Employee> employees);


}
