package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        for(Map.Entry m : functionMap.entrySet()){
            if((Integer)m.getValue()==requiredValue){
                return true;
            }
        }
        return false;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer,Integer>map=new HashMap<>();
        for (int i = 0; i < sourceList.size(); i++) {
            map.put(sourceList.get(i),5*sourceList.get(i)+2);
        }
        return map;
    }
}
