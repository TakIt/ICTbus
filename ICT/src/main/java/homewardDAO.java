import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.time.LocalTime;

@Repository
public class homewardDAO {
    @Autowired
    private JdbcTemplate jdbc;

    public void select(){
       // String x = zikoku();
        LocalTime x = LocalTime.now();
        //xの値に時刻が入る。
        var sql = "SELECT * FROM 復路時刻表　WHERE 復路時刻表.CHITOSE > " +x;
    }

}
