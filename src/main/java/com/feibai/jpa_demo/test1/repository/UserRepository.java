package com.feibai.jpa_demo.test1.repository;

import com.feibai.jpa_demo.test1.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @Author: feibai
 * @description:
 * @Date: Created in 10:57 2019/1/28
 * @Modify by: feibai
 * @ModifyDate by: 10:57 2019/1/28
 */
public interface UserRepository extends CrudRepository<User, String> {
}
