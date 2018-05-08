package activityrecord;

import activity.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRecordRepository extends JpaRepository<ActivityRecord, Integer> {
    ActivityRecord deleteByActivityIdAndUserId(String activityId, String userId);

    ActivityRecord findByActivityIdAndUserId(String activityId, String userId);

    ActivityRecord findByUserId(String uerId);

}
