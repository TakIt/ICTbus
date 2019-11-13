import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.time.LocalTime;

@Repository
public class OutwardDAO {
    @Autowired
    private JdbcTemplate jdbc;

    public void select(){
        //String x = zikann();
        LocalTime x = LocalTime.now();
        var sql = "SELECT * FROM 復路時刻表　WHERE 復路時刻表.CHITOSE > " +x;
        var sql2 = "SELECT 復路時刻表.* ,IDと乗り場.NORIBA FROM 復路時刻表 LEFT JOIN  IDと乗り場 ON 復路時刻表.ID = IDと乗り場.ID";

}



}
