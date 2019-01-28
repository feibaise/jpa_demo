package com.feibai.jpa_demo.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

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
public class User {

    @Getter
    @Setter
    @Id
    @GeneratedValue(generator = "uuidGenerator")
    @GenericGenerator(name = "uuidGenerator", strategy = "uuid")
    private String id;


}
