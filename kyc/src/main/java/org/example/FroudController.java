package org.example;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/froud")
public class FroudController {

    private FroudService froudService;


    public FroudController(FroudService froudService) {
        this.froudService = froudService;
    }

    @GetMapping (path = "{customerId}")
    public FroudResponse froudResponse(@PathVariable("customerId") Integer customerId){
        boolean response = froudService.froudResponse(customerId);
        return new FroudResponse(response);
    }
}
