package com.example1.demo1.bootlaunch.utils;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import java.util.ArrayList;
import java.util.List;

public class DozerUtils {
        static Mapper mapper = new DozerBeanMapper();
        /**
         * 将list转换为vo的list
         * @param source
         * @param destType
         * @return
         */
        public static <T, U> List<U> mapList(final List<T> source, final Class<U> destType) {
            final List<U> dest = new ArrayList<U>();
            for (T element : source) {
                dest.add(mapper.map(element, destType));
            }
            return dest;
        }

}
