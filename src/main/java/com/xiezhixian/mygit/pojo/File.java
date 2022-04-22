package com.xiezhixian.mygit.pojo;

public class File {
    private Integer id;

    private String fname;

    private Integer latestchangeuser;

    private Integer latestload;

    private String fpath;

    private Integer projectid;

    private String latestChangeUserName = "无";
    private String latestLoadName = "无";
    private String projectName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname == null ? null : fname.trim();
    }

    public Integer getLatestchangeuser() {
        return latestchangeuser;
    }

    public void setLatestchangeuser(Integer latestchangeuser) {
        this.latestchangeuser = latestchangeuser;
    }

    public Integer getLatestload() {
        return latestload;
    }

    public void setLatestload(Integer latestload) {
        this.latestload = latestload;
    }

    public String getFpath() {
        return fpath;
    }

    public void setFpath(String fpath) {
        this.fpath = fpath == null ? null : fpath.trim();
    }

    public Integer getProjectid() {
        return projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    public String getLatestChangeUserName() {
        return latestChangeUserName;
    }

    public void setLatestChangeUserName(String latestChangeUserName) {
        this.latestChangeUserName = latestChangeUserName;
    }

    public String getLatestLoadName() {
        return latestLoadName;
    }

    public void setLatestLoadName(String latestLoadName) {
        this.latestLoadName = latestLoadName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}