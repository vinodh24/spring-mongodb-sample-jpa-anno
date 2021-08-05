package com.vinodh.criteriabuilder;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
@Repository
public class CriteriaQueryBuild {
	
	public Query findByRequestTimeBetween(String from, String to){
		  Query query = new Query();
		  Criteria c = new Criteria().andOperator(
				  Criteria.where("REQUESTTIME").gte(from),  
		            Criteria.where("REQUESTTIME").lte(to));
		    query.addCriteria(c);
		return query;
	}
	public Query findByRequestTimeBetweenAndOperation(String from, String to,String operation){
		  Query query = new Query();
		  Criteria c = new Criteria().andOperator(
				    Criteria.where("REQUESTTIME").gte(from),  
		            Criteria.where("REQUESTTIME").lte(to),
		            Criteria.where("OPERATION").is(operation),
		            Criteria.where("CUID").nin(),
		            Criteria.where("TRANSACTIONID").nin()
				  );
		  query.addCriteria(c);
		  query.with(new Sort(Sort.Direction.ASC,"CUID"));  //sorting asc
	//	  query.with(new PageRequest(1, 10));               // pagination Constructor deprecated
		  /*query.with(PageRequest.of(1, 10));*/               // pagination
		  //  query.addCriteria(c).limit(3);  //limit condition
		return query;
	}
	
	public Query findByRequestTimeBetweenAndOperationOrCondition(String from, String to,String operation){
		  Query query = new Query();
		  Criteria c = new Criteria().andOperator(
				    Criteria.where("REQUESTTIME").gte(from),  
		            Criteria.where("REQUESTTIME").lte(to).and ("OPERATION").is(operation)
		            .orOperator(Criteria.where("CUID").ne(null), //not null condition
		            		Criteria.where("TRANSACTIONID").nin())  //null condition
				  );
		    query.addCriteria(c);
		return query;
	}
	/*public UpdateResult findAndUpdateStatus(String remark, String application,String status,MongoTemplate mongoTemplate){
		  Query query = new Query();
		  Criteria c = new Criteria().andOperator(
				    Criteria.where("REMARKS").regex(remark),
				    Criteria.where("APPLICATION").is(application),
				    Criteria.where("STATUS").is(status)
				  );
		  Update update = new Update();
          update.set("STATUS", "Communication Error");	  
		    query.addCriteria(c);
		    UpdateResult apAuditlog=  mongoTemplate.updateMulti(query, update, SPAUDITLOG.class);
		return apAuditlog;
	}*/
	
	/*public DeleteResult deleterProvision(String remark, String application,String status,MongoTemplate mongoTemplate){
		  Query query = new Query();
		  Criteria c = new Criteria().andOperator(
				    Criteria.where("REMARKS").regex(remark),
				    Criteria.where("APPLICATION").is(application),
				    Criteria.where("STATUS").is(status)
				  );
		    query.addCriteria(c);
		    DeleteResult apAuditlog=  mongoTemplate.remove(query, SPAUDITLOG.class);
		return apAuditlog;
	}*/
	
/*	public Mono<String> deleteListOfOntIdsAndNodeName(List<String> ondIds, String nodeName,ReactiveMongoTemplate mongoTemplate){
			Query query = new Query();
			query.addCriteria(Criteria.where("Ont.nodeName").is(nodeName));
			query.addCriteria(Criteria.where("Ont.ontId").in(ondIds.toArray()));
			Mono<DeleteResult> delete=  mongoTemplate.remove(query, OntDetails.class);
			delete.subscribe();
	  return Mono.just("deleted successfully");
	}
	
	public Flux<OntDetails> findListOfOntIdsAndNodeName(List<Integer> ondIds, String nodeName,ReactiveMongoTemplate mongoTemplate){
			Query query = new Query();
			query.addCriteria(Criteria.where("Ont.nodeName").is(nodeName));
			query.addCriteria(Criteria.where("Ont.ontId").in(ondIds.toArray()));
		Flux<OntDetails> detailes= mongoTemplate.find(query,OntDetails.class);
	  return detailes;
	}
	public  Mono<String> deleterAllOntNodeName(String nodeName,ReactiveMongoTemplate reactiveMongoTemplate){
		  Query query = new Query();
		  Criteria c = new Criteria().andOperator(
				    Criteria.where("Ont.nodeName").is(nodeName)
				  );
		    query.addCriteria(c);
		    Mono<DeleteResult> detailes=  reactiveMongoTemplate.remove(query, OntDetails.class);
		    detailes.subscribe();
		return Mono.just("deleted successfully");
	}
	public Mono<Map<String,String>> deleteByOntIdAndNodeNameAndOntPortName(String id,
			String ontPortName,ReactiveMongoTemplate reactiveMongoTemplate) {
		 Query query = new Query();
		  Criteria c = new Criteria().andOperator(
				    Criteria.where("id").is(id),  
		            Criteria.where("ont.ontPorts.ontPortName").is(ontPortName)
				  );
		  query.addCriteria(c);
		  Mono<DeleteResult> detailes= reactiveMongoTemplate.remove(query, OntDetails.class);
		  detailes.subscribe();
		  Map<String,String> result=new HashMap<String,String>();
		  result.put("result", "deleted Ont  service successfull");
		return Mono.just(result);	  	
	}*/
	

}
