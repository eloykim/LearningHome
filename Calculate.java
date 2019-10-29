package com.eloyk.mathassistant;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class Calculate {
    //有限集
    public class LimitedSet{
        private java.util.Set<BigDecimal> set;
        LimitedSet(){
            set = new HashSet<BigDecimal>(){

            };
        }
        public Set getSet(){
            return this.set;
        }
        public LimitedSet addElement(BigDecimal element){
            set.add(element);
            return  this;
        }
        //集合 并集
        public Set<BigDecimal> and(Set set1, Set set2){
            Set result = new HashSet<>();
            result.addAll(set1);
            result.removeAll(set2);
            result.addAll(set2);
            return result;
        }
        //集合 交集
        public Set<BigDecimal> or(Set set1, Set set2){
            java.util.Set result = new HashSet<>();
            result.addAll(set1);
            result.retainAll(set2);
            return result;
        }
        //集合 补集
        public java.util.Set<BigDecimal> not(Set set1,Set set2){
            Set result = new HashSet<>();
            if(set1.contains(set2)){
                result.addAll(set1);
                result.removeAll(set2);
            }else if(set2.contains(set1)){
                result.addAll(set2);
                result.removeAll(set1);
            }else{
                result.addAll(set2);
                result.removeAll(set1);
            }
            return result;
        }
    }
    //无限集
    public class InfinitySet{
        ArrayList<String> Formulars;
        InfinitySet(String Symbol, BigDecimal point){
            this.Formulars = new ArrayList<String>();
            this.Formulars.add(Symbol);
            this.Formulars.add(point.toString());
        }
        InfinitySet(String Symbol0, BigDecimal point0, String Symbol1, BigDecimal point1){
            this.Formulars = new ArrayList<String>();
            this.Formulars.add(Symbol0);
            this.Formulars.add(point0.toString());
            this.Formulars.add(Symbol1);
            this.Formulars.add(point1.toString());
        }
    }
    public class Equation{

    }
    public class Function{

    }
}
