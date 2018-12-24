package com.refutrue.mock.builder;

import com.refutrue.mock.annotation.*;
import com.refutrue.mock.annotation.Number;
import com.refutrue.mock.generater.*;
import com.refutrue.mock.pojo.FieldMsg;

import java.lang.reflect.Field;

/**
 * @Author: Michael Xu
 * @Date: 2018/12/22 14:51
 * @Description:
 */
public class GeneratorBuilder<T> implements IGeneratorBuilder<T>{

    @Override
    public FieldMsg build(FieldMsg fieldMsg){
        fieldMsg.getAnnotationList().forEach(annotation ->{
            IGenerator generator = null;
            if(annotation instanceof Dict){
                generator = new DictGenerator();
                ((DictGenerator) generator).setDict((Dict) annotation);
            }
            if(annotation instanceof Number){
                generator = new NumberGenerator();
                ((NumberGenerator) generator).setNumber((Number)annotation);
            }
            if(annotation instanceof Random){

                Class<?> randomClass = ((Random) annotation).generator();
                if(randomClass != null){
                    try {
                        generator = (IGenerator) randomClass.newInstance();
                        Field randomField = randomClass.getSuperclass().getDeclaredField("random");
                        randomField.setAccessible(true);
                        randomField.set(generator,annotation);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }else{
                    generator = new StringGenerator();
                    ((StringGenerator) generator).setRandom((Random)annotation);
                }

            }
            if(annotation instanceof Time){
                generator = new TimeGenerateor();
                ((TimeGenerateor) generator).setTime((Time)annotation);
            }
            if(annotation instanceof Sign){
                generator = new SignGenerator();
                ((SignGenerator) generator).setSign((Sign)annotation);
            }
            fieldMsg.setGenerator(generator);
        });
        return fieldMsg;
    }
}
