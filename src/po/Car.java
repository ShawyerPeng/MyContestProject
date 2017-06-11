package po;

public class Car {
    private Integer carid;

    private String carno;

    private String gpsid;

    private Integer userid;

    private String driver;

    private String mobile;

    private Integer created;

    private Long lastid;

    private Byte carstatus;

    private Byte driverstatus;

    private Byte lockstatus;

    public Integer getCarid() {
        return carid;
    }

    public void setCarid(Integer carid) {
        this.carid = carid;
    }

    public String getCarno() {
        return carno;
    }

    public void setCarno(String carno) {
        this.carno = carno == null ? null : carno.trim();
    }

    public String getGpsid() {
        return gpsid;
    }

    public void setGpsid(String gpsid) {
        this.gpsid = gpsid == null ? null : gpsid.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver == null ? null : driver.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    public Long getLastid() {
        return lastid;
    }

    public void setLastid(Long lastid) {
        this.lastid = lastid;
    }

    public Byte getCarstatus() {
        return carstatus;
    }

    public void setCarstatus(Byte carstatus) {
        this.carstatus = carstatus;
    }

    public Byte getDriverstatus() {
        return driverstatus;
    }

    public void setDriverstatus(Byte driverstatus) {
        this.driverstatus = driverstatus;
    }

    public Byte getLockstatus() {
        return lockstatus;
    }

    public void setLockstatus(Byte lockstatus) {
        this.lockstatus = lockstatus;
    }
}