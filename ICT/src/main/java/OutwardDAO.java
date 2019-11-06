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
        var sql = "SELECT * FROM 復路時刻表　WHERE 復路時刻表.Chitose > " +x;
        var sql2 = "SELECT 復路時刻表.* ,乗り場.NORIBA FROM 復路時刻表 LEFT JOIN  乗り場 ON 復路時刻表.ID = 乗り場.ID";

}



}
