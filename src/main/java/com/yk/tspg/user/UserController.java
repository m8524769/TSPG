package com.yk.tspg.user;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/ts")
    public Map<String, Object> test() {
        return new HashMap<String, Object>() {{
            put("name", "asedf");
        }};
    }
}
