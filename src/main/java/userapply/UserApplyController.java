package userapply;

import java.util.Date;
import java.util.List;

// 描述：用户访问关于UserApply实体类相关的数据
public class UserApplyController {

    //属性
    private final UserApplyRepository userApplyRepository;

    //构造函数，用于beans的依赖注入
    public UserApplyController(UserApplyRepository userApplyRepository) {
        this.userApplyRepository = userApplyRepository;
    }

    /**
     * 业务逻辑：用户申请新的身份
     * 功能描述：向数据库中插入一个新的UserApply元组
     * 使用方法: 1. 通过userId和tagName查找是否已存在该元组
     *          2. 根据传入的参数创建一个UserApply实例化对象
     *          3. 使用UserApplyRepository自带的save()方法，将数据插入数据库
     * 相关接口：UserApplyRepository
     *
     * @param userId    用户Id
     * @param tagName   标签名称
     * @param applyTime 申请时间
     * @param state     申请的审核状态
     * @return 是否添加成功
     */
    public boolean addNewApply(String userId, String tagName, Date applyTime, String state) {
        //TODO
        return true;
    }

    /**
     * 业务逻辑：用户查看个人申请信息
     * 功能描述：通过用户ID获得所有有关该用户的申请信息
     * 使用方法: 通过userApplyRepository中的findById()方法查找申请表信息并返回
     * 相关接口：UserApplyRepository
     *
     * @return 返回所有该用户的申请信息
     */
    public List<UserApply> applicationResults(String userId) {
        //TODO
        return null;
    }

    /**
     * 业务逻辑：工作人员查看所有用户的申请信息
     * 功能描述：通过用户ID获得所有有关该用户的申请信息
     * 使用方法: 1.创建一个ArrayList<UserApply> userApplies实例
     *          2.使用userApplyRepository中的findById()方法查找申请表信息
     * 相关接口：UserApplyRepository
     *
     * @return 返回所有的申请表信息userApplies
     */
    public List<UserApply> getApplicationList() {
        //TODO
        return null;
    }

    /**
     * 业务逻辑：工作人员审核申请表
     * 使用方法: 1.通过传入的userId， 使用userApplyRepository中的search()方法查找出对应的申请表
     *          2.输入参数labelName，来表示审核的结果，是通过或者失败
     *          3.通过使用UserApplyRepository自带的save()方法将labelName的值赋给到UserApply实例中的state属性,刷新实例信息
     *          4.返回用户Id为userId的申请表的审核结果labelName
     * 相关接口：UserApplyRepository
     *
     * @param userId  用户的Id
     * @param tagName 标签名
     * @param applyState 审核是否通过 （pass or deny）
     * @return 返回操作是否成功
     */
    public Boolean checkApplication(String userId, String tagName, String applyState) {
        //TODO
        return false;
    }

}
