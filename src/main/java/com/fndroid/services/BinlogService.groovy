package com.fndroid.services

import com.fndroid.entity.Binlog
import com.fndroid.dao.IBinlogDao
import org.springframework.stereotype.Service

import javax.annotation.Resource

@Service
class BinlogService {
    @Resource
    IBinlogDao binlogDao

    List<Binlog> getBinlogs() {
        binlogDao.getBinlogs()
    }

    Binlog getBinlog(int id){
        binlogDao.getBinlog(id)
    }
}
