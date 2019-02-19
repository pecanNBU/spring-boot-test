package com.fndroid.dao

import com.fndroid.entity.Binlog
import org.springframework.stereotype.Repository

@Repository
interface IBinlogDao {
    List<Binlog> getBinlogs()
    Binlog getBinlog(int id)
}