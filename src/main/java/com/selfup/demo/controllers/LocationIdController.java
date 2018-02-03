package com.selfup.demo.controllers;

import com.selfup.demo.tables.LocationIds;
import com.selfup.demo.services.TableService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationIdController {
    public TableService tables;

    public LocationIdController(TableService tableService) {
        this.tables = tableService;
    }

    @RequestMapping
    public LocationIds index() {
        return this.tables.locationIds;
    }
}
