import com.artbrain.Application;

import com.artbrain.Service.SolutionService;
import com.artbrain.entity.Level;
import com.artbrain.entity.Question;

import com.artbrain.entity.Solution;
import com.artbrain.jpa.ListRepo;
import com.artbrain.jpa.QusRepo;
import com.artbrain.jpa.SolutionRepo;

import org.aspectj.weaver.patterns.TypePatternQuestions;
import org.hibernate.annotations.SourceType;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2016/12/3 0003.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class StudentTest {


    @Autowired
    private QusRepo qusRepo;
    @Autowired
    private SolutionRepo solutionRepo;
    @Autowired
    private EntityManager em;
    @Autowired
    private ListRepo listRepo;
    @Autowired
    private SolutionService solutionService;

    @Test
    public void likeName() throws ParseException {
//
//        ArrayList<Level> levelList = listRepo.findByNo(0);
//
//        for (int i = 0;i<levelList.size();i++) {
//
//            System.out.println(levelList.get(i).getUsername());
//
//        }
//        List<Question> q = qusRepo.findAll();
//        for (int i=0;i<q.size();i++) {
//            System.out.println(q.get(i).getId());
//        }

//        Question q1 = qusRepo.find(1);
//        System.out.println(q1.getId());

//        List<Level> list = listRepo.list();
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i).getUsername() + "---" + list.get(i).getNum());
//        }
//
//        Solution solution = new Solution("st2", 1, "2");
//        solutionRepo.save(solution);
//
//        Question question = new Question("你奶奶贵姓","sss");
//        qusRepo.save(question);

//        Solution s = new Solution("st1",1,"1");
//        Boolean flag = solutionService.save(s);
//        System.out.println(flag);
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse("2011-12-17");
        System.out.println(date);


    }

}