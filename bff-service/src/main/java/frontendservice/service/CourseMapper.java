package frontendservice.service;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CourseMapper {

    List<frontendservice.service.Course> toDto(List<frontendservice.coursegateway.Course> courses);
}
