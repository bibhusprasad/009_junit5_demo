package com.sg.antman;

import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

public class AbstractTestJunitFacilitator extends Mockito {

    public AbstractTestJunitFacilitator(){
    }

    public static <T> ArgumentCaptor<T> captor(Class<?> clazz){
        return (ArgumentCaptor<T>) ArgumentCaptor.forClass(clazz);
    }

    public static <T> T mockGeneric(Class<?> clazz){
        return (T) Mockito.mock(clazz);
    }
}
