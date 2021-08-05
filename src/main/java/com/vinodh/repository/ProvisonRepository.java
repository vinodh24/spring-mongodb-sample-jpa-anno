package com.vinodh.repository;


import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.Query;

import com.vinodh.model.ServiceDetailes;


public interface ProvisonRepository extends GenericDAO<ServiceDetailes> {

	@Query("{ 'dataServices.nodeName' : ?0, 'dataServices.portName' : ?1}")
	public List<ServiceDetailes> findByNodeNameAndPortName(String nodeName,
			String portName);

	@Query("{ 'dataServices.nodeDbId' : ?0, 'dataServices.portDbId' : ?1}")
	public List<Boolean> existsIfNodeDbIdAndPortDbIdIsExist(String nodeDbId,
			String portDbId);

	@Query(value = "{'dataServices.nodeDbId': ?0, 'dataServices.portDbId': ?1}", count = true)
	public List<Long> findByNodeDbIdAndPortDbIdCount(String nodeDbId, String portDbId);
	
	
	/*@Query(value = "{'dataServices.nodeDbId': ?0, 'dataServices.portDbId': ?1}", count = true)
	public Mono<Long> findByNodeDbIdAndPortDbIdCount111(String nodeDbId, String portDbId);*/
	
	public List<ServiceDetailes> findByDataServicesNodeNameAndDataServicesPortName(String nodeName,
			String portName);
	
	public List<ServiceDetailes> findByDataServicesNodeNameLikeAndDataServicesPortNameLike(String nodeName,
			String portName);
	
	public List<ServiceDetailes> findByDataServicesNodeNameLikeAndDataServicesPortNameLike(String nodeName,
			String portName,Pageable page);
	
	
	public List<ServiceDetailes> findByDataServicesNodeNameOrderByDataServicesPortNameDesc(String nodeName,
			String portName);
	
	
	public List<ServiceDetailes> findByDataServicesNodeNameOrDataServicesPortName(String nodeName,
			String portName);
	
	public List<ServiceDetailes> findFirst3ByDataServicesNodeNameOrDataServicesPortName(String nodeName,
			String portName);
	
	public List<ServiceDetailes> findTop3ByDataServicesNodeNameOrDataServicesPortName(String nodeName,
			String portName);
	
	public List<ServiceDetailes> findDistinctByDataServicesNodeNameOrDataServicesPortName(String nodeName,
			String portName);
	
	public List<ServiceDetailes> findByDataServicesNodeNameAndDataServicesPortNameAllIgnoreCase(String nodeName,
			String portName);
	// another way of separating class names and field names
	public List<ServiceDetailes> findByDataServices_NodeNameAndDataServices_PortNameAllIgnoreCase(String nodeName,
			String portName);
	
	
	public List<ServiceDetailes> findByDataServices_NodeNameAndDataServices_PortNameOrderByDataServices_PortNameDesc(String nodeName,
			String portName);
	
	public List<ServiceDetailes> findByDataServices_NodeNameAndDataServices_PortNameOrderByDataServices_PortNameDesc(String nodeName,
			String portName,Sort sort);
	
}
