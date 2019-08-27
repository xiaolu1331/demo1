package com.example1.demo1.bootlaunch.dao;

import com.example1.demo1.bootlaunch.model.Reader;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity //告诉JPA这是一个实体类（和数据表映射的类）
@Table(name = "article") //@Table来指定和哪个数据表对应;如果省略默认表名就是article；
public class Article {


        @Id //这是一个主键
        @GeneratedValue
        private Long id;

        @Column(nullable = false,length = 32) //这是和数据表对应的一个列
        private String author;

        @Column(nullable = false,unique = true,length = 32)
        private String title;

        @Column(length = 512)
        private String content;

        private Date createTime;


}
