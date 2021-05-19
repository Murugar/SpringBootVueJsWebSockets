package com.iqmsoft.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Component;

@Component
public class InfoHolder {

	private List<Info> modelInfoList = new ArrayList<>();
	
	public InfoHolder() {
		modelInfoList = IntStream.range(0, 9).
				mapToObj(e -> new Info()).collect(Collectors.toList());
	}

	public List<Info> getModelInfoList() {
		return modelInfoList;
	}
	
	
	public void changeValues() {
		modelInfoList.parallelStream().forEach(Info::changeValues);
	}
	
	

}
