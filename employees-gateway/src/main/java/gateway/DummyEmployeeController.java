package gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;

@RestController
@RequestMapping("/api/dummy-employees")
public class DummyEmployeeController {

    @GetMapping
    private Flux<Employee> findAllEmployees() {
        return Flux.fromIterable(List.of(
                new Employee(1L, "Dummy Joe"),
                new Employee(2L, "Dummy Jack")
        ));
    }
}
