import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import java.time.LocalTime;

import static org.springframework.jdbc.core.BeanPropertyRowMapper.newInstance;

@Repository
public class OutwardDAO {

    @Autowired
    private JdbcTemplate jdbc;

     public Object select(){
        //String x = zikann();
        LocalTime x = LocalTime.now();
        //String sql = "SELECT 復路時刻表.ID,IDと乗り場.NORIBA FROM 復路時刻表 LEFT JOIN  IDと乗り場 ON 復路時刻表.ID = IDと乗り場.ID WHERE 復路時刻表.HONBUTOU > " +x;
         var sql = "SELECT * FROM 復路時刻表 WHERE 復路時刻表.HONBUTOU > '14:00:00'";
         return jdbc.queryForObject(sql,newInstance(a.class));
    }
}
