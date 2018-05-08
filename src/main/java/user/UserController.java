package user;

import org.springframework.web.bind.annotation.RestController;

//用户访问关于User实体类的相关操作
@RestController
public class UserController {

    //用户仓库以连接相应数据库
    private final UserRepository userRepository;

    //构造函数，用与beans的依赖注入
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * 业务逻辑：用户注册
     * 功能描述：向数据库添加一个新的user元组
     * 使用方法: 1. 查询数据库中是否存在相同phoneNumber的元组
     *          2. 通过参数构造一个新的User对象
     *          3. 用userRepository的静态的save方法存入这个User对象
     * 相关接口：UserRepository
     *
     * @param username    用户名
     * @param password    密码
     * @param phoneNumber 手机号
     * @param email       邮箱
     * @param address     住址
     * @return 成功注册，返回用户对象（包含了用户基本信息）；注册失败返回null
     */
    public String register(String username, String password, String phoneNumber, String email, String address) {
        // TODO: 2018/5/7
        return null;
    }

    /**
     * 业务逻辑：修改用户信息
     * 功能描述：修改用户信息，并同步到数据库
     * 使用方法: 1. 通过userId查找相对应的用户元组，未找到则返回null
     *          2. 通过参数构造一个新的User对象
     *          3. 通过userRepository的静态方法save()修改（覆盖）表中数据
     * 相关接口：UserRepository
     *
     * @param username 用户名
     * @param password 密码
     * @param email    邮箱
     * @param address  住址
     * @return 成功修改，返回用户对象；修改失败返回null
     */
    public User modifyUserInfo(String userId, String username, String password, String email, String address) {
        // TODO: 2018/5/7
        return null;
    }

    /**
     * 业务逻辑：用户登录
     * 功能描述：通过phoneNumber和密码登陆用户
     * 使用方法: 1. 通过userRepository的静态方法findByPhoneNumber()查询表中数据，获得用户信息
     * 2. 对比password正确与否返回信息，信息正确返回用户对象，不正确返回null
     * 相关接口：UserRepository
     *
     * @param phoneNumber 用户手机号
     * @param password    用户密码
     * @return 是否登陆成功
     */
    public User login(String phoneNumber, String password) {
        // TODO: 2018/5/7
        return null;
    }


    /**
     * 业务逻辑：获得用户信息
     * 功能描述：通过用户phoneNumber获取用户信息
     * 使用方法：userRepository的静态数据库方法findByPhoneNumber()查询表中数据，若有结果则返回User对象，入若无则返回null
     * 相关接口：UserRepository
     *
     * @param userId 用户ID
     * @return 用户信息
     */
    public User getUserInfo(String userId) {
        // TODO: 2018/5/7
        return null;
    }

}
