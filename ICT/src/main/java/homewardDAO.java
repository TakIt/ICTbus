import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class homewardDAO {
    @Autowired
    private JdbcTemplate jdbc;

    public int select(entity){
        String x = zikoku();
        //xの値に時刻が入る。
        var sql = "SELECT * FROM 復路時刻表　WHERE 復路時刻表.Chitose > " +x;
        var sql2 = "SELECT 往路時刻表.* ,乗り場.NORIBA FROM 往路時刻表 LEFT JOIN  乗り場 ON 往路時刻表.ID = 乗り場.ID";
    }
}
