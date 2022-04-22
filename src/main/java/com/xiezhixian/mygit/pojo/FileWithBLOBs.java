package com.xiezhixian.mygit.pojo;

public class FileWithBLOBs extends File {
    private String fdescribe = "";

    private String latestlog = "";

    public String getFdescribe() {
        return fdescribe;
    }

    public void setFdescribe(String fdescribe) {
        this.fdescribe = fdescribe == null ? null : fdescribe.trim();
    }

    public String getLatestlog() {
        return latestlog;
    }

    public void setLatestlog(String latestlog) {
        this.latestlog = latestlog == null ? null : latestlog.trim();
    }
}