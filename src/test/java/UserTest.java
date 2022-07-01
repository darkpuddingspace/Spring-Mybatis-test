import com.qf.pojo.User;
import com.qf.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserTest {
    @Autowired
    public UserService userService;

    //全部查询
    @Test
    public void selectAllTest() {
        List<User> userList = userService.selectAll();
        for (User user : userList) {
            System.out.println(user.getName() + "\t" + user.getAddress());
        }
    }

    //添加数据
    @Test
    public void addTest() {
        User user = new User();
        user.setName("图图ab");
        user.setPassword("1234156");
        user.setAddress("成都");
        int i = userService.addUser(user);
        System.out.println(i);
    }

    //删除数据
    @Test
    public void deleteTest() {
        int i = userService.deleteUser(11);
        System.out.println(i);
    }

    //更新数据
    @Test
    public void updateTest() {
        //创建实体类user对象
        User user = new User();
        user.setId(5);
        user.setAddress("翻斗大街");
        int i = userService.updateUser(user);
        System.out.println(i);
    }

    //根据名字查询
    @Test
    public void selectUserByNameTest() {
        //创建实体类user对象
        User user = new User();
        user.setName("沸羊羊");
        List<User> users = userService.selectUserByName(user.getName());
        System.out.println(users.toString());
    }

}
