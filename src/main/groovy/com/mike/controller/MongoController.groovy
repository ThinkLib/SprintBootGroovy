package com.mike.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import com.gmongo.GMongoClient
import com.mike.util.MongoUtil
import com.mongodb.DBCollection

@RestController
class MongoController {

    public MongoController() {}
    
    @RequestMapping("/queryMongo")
    public String queryMongo() {
        
        GMongoClient client = new MongoUtil("patentdata", "data.cloud.Abc12345", "127.0.0.1", 27017).getClient()
        
        DBCollection userCol = client.getDB("test").getCollection("User")
        
        def cur = userCol.find()
        
        String mongoStr = ""
        cur.each {
            println it
            mongoStr += it.toString()
        }
        
        return mongoStr
    }

}
