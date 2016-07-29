package com.mike.util

import com.gmongo.GMongoClient
import com.mongodb.MongoCredential
import com.mongodb.ServerAddress

class MongoUtil {
	
	def ac
	
	def pwd
	
	def ip
	
	def port
	
	def dbName
	
	MongoUtil(ac, pwd, ip, port, dbName) {
		this.ac = ac;
		this.pwd = pwd;
		this.ip = ip;
		this.port = port;
		this.dbName = dbName;
	}
    
    MongoUtil(ac, pwd, ip, port) {
        this.ac = ac;
        this.pwd = pwd;
        this.ip = ip;
        this.port = port;
    }

	def getClient() {
        
		def credential = MongoCredential.createCredential(ac, "admin", pwd as char[]);
        
		return new GMongoClient(new ServerAddress(ip, port), [credential])
        
	}
	
	def getDb() {
        
		return getClient().getDB(dbName)
        
	}
    
}
