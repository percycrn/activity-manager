package user;

import org.springframework.data.repository.CrudRepository;


//用户操作类，用于连接数据库中相应的用户表，并实现相应的数据操作
public interface UserRepository extends CrudRepository<User,String> {
    User findByPhoneNumber(String phoneNumber);
}
