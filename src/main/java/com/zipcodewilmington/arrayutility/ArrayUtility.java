package com.zipcodewilmington.arrayutility;

import java.util.*;


/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<E> {


    private E[] input;

    public ArrayUtility(E[] input) {
        this.input = input;
    }


    public E getMostCommonFromMerge(E[] arrayToMerge) {

        E[] array = Arrays.copyOf(input, input.length);
        List<E> list = new ArrayList<>(Arrays.asList(array));
        list.addAll(Arrays.asList(arrayToMerge));

        Map<E, Integer> map = new HashMap<>();
        for (E e : list) {
            Integer x = map.get(e);
            map.put(e, x == null ? 1 : x + 1);

        }
            Map.Entry<E, Integer> mostcommon = null;
            for (Map.Entry<E, Integer> eIntegerEntry : map.entrySet()) {
                if (mostcommon == null || eIntegerEntry.getValue() > mostcommon.getValue())
                    mostcommon = eIntegerEntry;
                }

            return mostcommon.getKey();

        }

    public Integer getNumberOfOccurrences(E valueToEvaluate) {

        E[] array = Arrays.copyOf(input, input.length);

        int count=0;
        for(int i =0; i < array.length; i++){
            if(array[i].equals(valueToEvaluate)){

                count++;
            }
        }



        return count;

    }

    public E[] removeValue(E valueToRemove) {

        E[] array= Arrays.copyOf(input, input.length-getNumberOfOccurrences(valueToRemove));
        int index=0;

        for (int i =0; i < input.length; i++) {
            if (!input[i].equals(valueToRemove)) {
                array[index] = input[i];
                index++;

            }
        }

        return array;
    }

    public Integer countDuplicatesInMerge(E[] arrayToMerge, E valueToEvaluate){

        E[] array = Arrays.copyOf(input, input.length);
        List<E> list = new ArrayList<>(Arrays.asList(array));
        list.addAll(Arrays.asList(arrayToMerge));


        E[] newarray= (E[]) list.toArray();

        int count=0;
        for( int i=0; i < newarray.length; i++){
            if(newarray[i].equals(valueToEvaluate)){
                count++;
            }
        }


        return count;
    }




}

