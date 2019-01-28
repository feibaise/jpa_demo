package com.feibai.jpa_demo.test1.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *@Author: feibai
 *@description:
 *@Date: Created in 10:02 2019/1/28
 *@Modify by: wushi
 *@ModifyDate by: 10:02 2019/1/28
 *
 */
@Entity
public class User {

    @Getter
    @Setter
    @Id
    @GeneratedValue(generator = "uuidGenerator")
    @GenericGenerator(name = "uuidGenerator", strategy = "uuid")
    private String id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String email;


}
