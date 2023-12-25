package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return list ->{
            List<Integer> result = new ArrayList<>();
            for(Integer el : list){
                result.add(el/divider);
            }
            return result;
        };
    }
}
