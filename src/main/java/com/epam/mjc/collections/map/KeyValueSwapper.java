package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public static Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer>map=new HashMap<>();
        for(Map.Entry m: sourceMap.entrySet()){
            if(map.get(m.getValue())!=null && (Integer)m.getKey()>map.get(m.getValue())){

            }else {
                map.put(m.getValue().toString(), (Integer) m.getKey());
            }
        }
        return map;
    }
}
