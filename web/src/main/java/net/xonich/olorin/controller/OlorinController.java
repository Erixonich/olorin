package net.xonich.olorin.controller;

import net.xonich.olorin.dto.Response;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/olorin")
public class OlorinController {

    @PostMapping("/new")
    public Response<?> newRecord() {
        return Response.error("not implemented!");
    }
}
