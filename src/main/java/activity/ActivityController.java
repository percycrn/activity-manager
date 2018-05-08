package activity;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// 描述：用户访问关于Activity实体类相关的数据
@RestController
public class ActivityController {
    // 属性
    private final ActivityRepository activityRepository;

    // 构造函数，用于beans的依赖注入
    public ActivityController(ActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }

    /**
     * 业务逻辑：添加新的activity
     * 功能描述：向数据库中插入一个新的activity元组
     * 使用方法: 1.实例化一个Activity对象
     *          2.使用activityRepository自带的save()方法，将数据插入数据库
     * 相关接口：使用了activityRepository接口
     *
     * @param id 活动ID
     * @param name 活动名称
     * @param place 活动地点
     * @param state 活动状态（延后，正在报名，正在进行）
     * @param startTime 活动开始时间
     * @param endTime 活动结束时间
     * @param maxPerson 活动最大人数
     * @param minPerson 活动最小人数
     * @param tagId 活动标签ID
     * @return 返回该活动信息
     */
    public Activity addNewActivity(String id, String name, String place,
                                   String state, String startTime, String endTime,
                                   String maxPerson, String minPerson, String tagId) {
        // TODO
        return null;
    }

    /**
     * 业务逻辑：删除一个已有的activity
     * 功能描述：删除数据库中的一个activity对象
     * 使用方法: 使用activityRepository自带的deleteById()方法，从数据库中删除
     * 相关接口：使用了activityRepository接口
     *
     * @param activityId 活动id
     * @return 返回被删除的活动对象
     */
    public Activity deleteNewActivity(String activityId) {
        // TODO
        return null;
    }

    /**
     * 业务逻辑：修改activity
     * 功能描述：修改数据库中的一个activity元组
     * 使用方法: 1.实例化一个Activity对象
     *          2.使用activityRepository自带的save()方法，从数据库修改（覆盖）活动信息
     * 相关接口：使用了activityRepository接口
     *
     * @param activityId 活动ID
     * @param name 活动名称
     * @param place 活动地点
     * @param state 活动状态（延后，正在报名，正在进行）
     * @param startTime 活动开始时间
     * @param endTime 活动结束时间
     * @param maxPerson 活动最大人数
     * @param minPerson 活动最小人数
     * @return 修改后的活动信息
     */
    public Activity modifyNewActivity(String activityId, String name, String place,
                                      String state, String startTime, String endTime,
                                      String maxPerson, String minPerson, String tagId) {
        // TODO
        return null;
    }

    /**
     * 功能描述：得到数据库中所有的activity对象
     * 使用方法:使用activityRepository自带的findByTagId()方法
     * 相关接口：使用了activityRepository接口
     *
     * @return 返回List类型的活动对象
     */
    public List<Activity> activityList(String tagId) {
        // TODO
        return null;
    }
}