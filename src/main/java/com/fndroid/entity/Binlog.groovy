package com.fndroid.entity

import javax.xml.bind.annotation.XmlRootElement

@XmlRootElement(name = 'binlog')
class Binlog {
    int id
    String file_name
    String file_partition


    Binlog() {
    }

    Binlog(int id, String file_name, String file_partition) {
        this.id = id
        this.file_name = file_name
        this.file_partition = file_partition
    }
}