package org.kano.planc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: kano33
 * @Create: 2025-09-04 09:45
 **/

@RestController
@RequestMapping("/item")
public class ItemController {


    @GetMapping("/getItem")
    public String getItem() {
        return "ok";
    }
}
