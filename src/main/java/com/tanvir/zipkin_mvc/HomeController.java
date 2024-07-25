package com.tanvir.zipkin_mvc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @PostMapping("/hello")
    public HelloResponse home(@RequestBody HelloRequest request)
    {
        return new HelloResponse("Hello, " + request.getName());
    }

}

@Data
@AllArgsConstructor
@NoArgsConstructor
class HelloRequest {
    String name;
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class HelloResponse {
    String data;
}

