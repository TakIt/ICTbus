public class timetable implements Serializable{
    /**
     * 今の時間
     */
    private LocalDateTime time;

    private String platform;
    private LocalDateTime time;

    public timetable(String platform){
        this.platform=platform;
        this.time=time;
    }

    public String getPlatform() {
        return platform;
    }

    public LocalDateTime getTime() {
        return time;
    }
    /**
     * 往路千歳駅の時間
     */

    /**
     * 往路南千歳駅の時間
     */

    /**
     * 往路実験棟
     */

    /**
     * 往路本部棟
     */

    /**
     * 復路千歳駅の時間
     */

    /**
     * 復路南千歳駅の時間
     */

    /**
     * 復路実験棟
     */

    /**
     * 復路本部棟
     */
}