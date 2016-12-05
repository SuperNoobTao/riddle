package com.artbrain.jpa;

import com.artbrain.entity.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/2 0002.
 */
@Repository
public class ListRepo {


    @Autowired
    private EntityManager em;


    public List<Level> listbynum(int num) {
        List<Level> list = new ArrayList<>();
        String sql = "" +
                "select username,count(q.id) as num " +
                "from question as q right join solution as s " +
                "on q.answer = s.answer and q.sort = s.question  " +
                "group by s.username HAVING num = :num";
        javax.persistence.Query query = em.createNativeQuery(sql);
        query.setParameter("num", num);
        List objecArraytList = query.getResultList();
        for (int i = 0; i < objecArraytList.size(); i++) {
            Object[] obj = (Object[]) objecArraytList.get(i);
            //使用obj[0],obj[1],obj[2]取出属性
            Level l = new Level();
            l.setUsername((String) obj[0]);
            l.setNum((BigInteger) obj[1]);
//            l.setHonor((BigInteger) obj[1]);
            list.add(l);
        }
        em.close();
        return list;
    }


    public List<Level> list() {
        List<Level> list = new ArrayList<>();
        String sql = "" +
                "select username,count(q.id) as num " +
                "from question as q right join solution as s " +
                "on q.answer = s.answer and q.sort = s.question  " +
                "group by s.username HAVING num>0  ORDER BY num desc";
        javax.persistence.Query query = em.createNativeQuery(sql);
        List objecArraytList = query.getResultList();
        for (int i = 0; i < objecArraytList.size(); i++) {
            Object[] obj = (Object[]) objecArraytList.get(i);
            //使用obj[0],obj[1],obj[2]取出属性
            Level l = new Level();
            l.setUsername((String) obj[0]);
            l.setNum((BigInteger) obj[1]);
//            l.setHonor((BigInteger) obj[1]);
            list.add(l);
        }
        em.close();
        return list;
    }





}
