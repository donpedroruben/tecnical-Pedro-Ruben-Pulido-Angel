package com.glue.tecnical.service;

import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public interface WeighService {

	public Double multiply(Double weigh, Integer integer);

	public Double addAllWeights(Map<Double, Integer> mapToAddAllWeights);
}
