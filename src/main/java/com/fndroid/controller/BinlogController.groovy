package com.fndroid.controller

import com.fndroid.entity.Binlog
import com.fndroid.services.BinlogService
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import javax.annotation.Resource

@RestController
class BinlogController {

    @Resource
    BinlogService service;

    @RequestMapping('/binlogs')
    List<Binlog> getBinlogs() {
        service.getBinlogs()
    }

    @RequestMapping('/binlog/{id}')
    Binlog getBinlog(@PathVariable(name = 'id')int id) {
        service.getBinlog(id)
    }
}
