package activityrecord;

import activity.Activity;

import java.util.List;

// 描述：用户访问关于ActivityRecord实体类相关的数据
public class ActivityRecordController {
    private final ActivityRecordRepository activityRecordRepository;

    public ActivityRecordController(ActivityRecordRepository activityRecordRepository) {
        this.activityRecordRepository = activityRecordRepository;
    }

    /**
     * 业务逻辑：用户进行活动报名
     * 功能描述：通过userId和activityId新建一个ActivityRecord对象从而完成报名操作
     * 使用方法: 1. 通过传入的参数创建一个ActivityRecord对象(签到状态默认设置为 NO)
     * 2. 通过调用activityRecordRepository的save()方法保存新的活动记录(ActivityRecord)
     * 3. 通过activityRepository的findById()方法返回该活动信息
     * 相关接口：ActivityRecordRepository & ActivityRepository
     *
     * @param userId     用户ID
     * @param activityId 活动ID
     * @return 返回报名的活动信息
     */
    public Activity signUpActivity(String userId, String activityId) {
        // TODO
        return null;
    }

    /**
     * 业务逻辑：用户取消报名
     * 功能描述：通过userId和activityId找到一条报名记录，将其删去完成取消报名的操作
     * 使用方法: 1.将两个参数传入activityRecordRepository自定义的deleteByActivityIdAndUserId()方法即可
     * 2.通过调用activityRepository的findById()方法返回该活动信息
     * 相关接口：ActivityRecordRepository & ActivityRepository
     *
     * @param activityId 活动ID
     * @param userId     用户ID
     * @return 返回取消报名的活动信息
     */
    public Activity cancelActivity(String activityId, String userId) {
        // TODO
        return null;
    }

    /**
     * 业务逻辑：活动签到
     * 功能描述：通过userId和activityId找到一条报名记录，修改其signInState的内容，完成签到
     * 使用方法: 1. 通过传入的参数创建一个ActivityRecord对象(签到状态默认设置为 YES)
     * 2. 通过调用activityRecordRepository的save()方法覆盖原来的活动记录
     * 相关接口：ActivityRecordRepository
     *
     * @param activityId 活动id
     * @param userId     用户id
     * @return 该记录的信息(ActivityRecord)
     */
    public ActivityRecord signInActivity(String activityId, String userId) {
        // TODO
        return null;
    }

    /**
     * 业务逻辑：查询活动历史记录
     * 功能描述：通过userId找到所有活动记录
     * 使用方法: 1. 通过ActivityRecordRepository的findByUserId()找到所有相关信息
     * 相关接口：ActivityRecordRepository
     *
     * @return 该用户的所有历史记录
     */
    public List<ActivityRecord> userHistoryRecords(String userId) {
        // TODO
        return null;
    }

    /**
     * 业务逻辑：查询用户当前将要参加的活动
     * 功能描述：通过userId找到该用户所有活动记录，再通过activityId找到所有未进行的活动
     * 使用方法: 1. 将userId传入activityRecordRepository的findById()方法找到所有该用户的活动记录
     *          2. 将上述活动记录中的activityId传入activityRepository的findById()方法找到所有标签为正在进行的活动
     * 相关接口：ActivityRecordRepository & ActivityRepository
     *
     * @param userId 用户ID
     * @return 返回该用户所有将要进行的活动信息列表
     */
    public List<ActivityRecord> userCurrentRecords(String userId) {
        // TODO
        return null;
    }
}
