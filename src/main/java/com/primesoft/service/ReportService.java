package com.primesoft.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

import com.primesoft.request.SearchRequest;
import com.primesoft.response.SearchResponse;

@Component
public interface ReportService {

	public List<String> getUniquePlanNames();
	
	public List<String> getUniquePlanStatuses();
	
	public List<SearchResponse> search(SearchRequest request);
	
	public void generateExcel(HttpServletResponse response)throws Exception;
	
	public void generatePdf(HttpServletResponse response) throws Exception;
}
