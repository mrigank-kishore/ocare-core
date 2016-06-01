package com.care.service.cbdb.core.interact;

import java.util.List;

import javax.annotation.PreDestroy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.care.service.cbdb.core.config.ApplicationProperties;
import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.Cluster;
import com.couchbase.client.java.CouchbaseCluster;

public class CBDBService {
	private static final Logger LOG = LogManager.getLogger("CBDBConnection");
	
	private static final List<String> NODES = ApplicationProperties.getList("nodes");
	
	private static final String BUCKET_NAME = ApplicationProperties.getProperty("bucketName");
	private static final String BUCKET_PASSWORD = ApplicationProperties.getProperty("bucketPassword");
	
	private final Bucket bucket;
	private final Cluster cluster;

	public CBDBService() {
		//connect to the cluster and open the configured bucket
		LOG.trace("INIT couchbase cluster and bucket");
		this.cluster = CouchbaseCluster.create(NODES);
		this.bucket = cluster.openBucket(BUCKET_NAME, BUCKET_PASSWORD);
		LOG.trace("End of INIT couchbase cluster and bucket");
	}

	@PreDestroy
	public void preDestroy() {
		/*if (this.bucket != null) {
			this.bucket.close();
		}*/
		
		if (this.cluster != null) {
			this.cluster.disconnect();
		}
	}
	
	public Bucket getBucket()	{
		return this.bucket;
	}
	
	public static void main(String[] args) {
		CBDBService cbService = new CBDBService();
		System.out.println(cbService.getBucket());
	}

}
