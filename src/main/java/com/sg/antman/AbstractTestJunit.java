package com.sg.antman;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.core.GenericTypeResolver;

import java.lang.reflect.Field;

public abstract class AbstractTestJunit<T> extends AbstractTestJunitFacilitator {

    @InjectMocks
    protected T test;
    private final Class<T> beanClass = (Class<T>) GenericTypeResolver.resolveTypeArgument(this.getClass(), AbstractTestJunit.class);

    public AbstractTestJunit(){
    }

    protected T newInstance(){
        return null;
    }

    @BeforeEach
    public void initInstance(){
        T newInstance = this.newInstance();
        this.test = newInstance == null ? Mockito.spy(this.beanClass) : Mockito.spy(newInstance);
        MockitoAnnotations.initMocks(this);
    }

    protected void setField(String fieldName, Object value){
        try{
            Field field = this.beanClass.getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(this.test, value);
        } catch (SecurityException | IllegalArgumentException | IllegalAccessException | NoSuchFieldException var4){
           // throw new Exception(var4);
        }
    }

    public T getTest(){
        return this.test;
    }

    public Class<T> getBeanClass(){
        return this.beanClass;
    }

}
