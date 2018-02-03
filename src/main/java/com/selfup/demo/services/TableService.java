package com.selfup.demo.services;

import com.selfup.demo.tables.LocationIds;
import org.springframework.stereotype.Service;

@Service
public class TableService {
    public LocationIds locationIds;

    public TableService() {
        this.locationIds = new LocationIds();
    }
}
