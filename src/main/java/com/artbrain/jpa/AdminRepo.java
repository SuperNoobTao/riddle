package com.artbrain.jpa;

import com.artbrain.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by Administrator on 2016/12/4 0004.
 */
public interface AdminRepo extends JpaRepository<Admin,Integer> {

    @Query("from Admin a where a.admin =?1 and a.pwd =?2")
    Admin findByName(String admin,String pwd);

}
