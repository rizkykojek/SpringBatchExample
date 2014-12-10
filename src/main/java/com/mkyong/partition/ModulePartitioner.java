package com.mkyong.partition;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.core.partition.support.Partitioner;
import org.springframework.batch.item.ExecutionContext;

public class ModulePartitioner implements Partitioner {

	 public static final String MOD_DIVISOR_KEY = "mod.divisor";
	 public static final String MOD_REMAINDER_KEY = "mod.remainder";

	 @Override
	 public Map<String, ExecutionContext> partition(int gridSize) {
		 final Map<String, ExecutionContext> contextMap = new HashMap<String, ExecutionContext>();

	     for (int i = 0; i < gridSize; i++) {
	    	 ExecutionContext context = new ExecutionContext();
	         context.putInt(MOD_DIVISOR_KEY, gridSize);
	         context.putInt(MOD_REMAINDER_KEY, i);
	         contextMap.put(getPartitionName(i), context);
	     }

	     return contextMap;
	 }

	 private String getPartitionName(int index) {
		 return String.format("partition-%d", index);
	 }   

}
