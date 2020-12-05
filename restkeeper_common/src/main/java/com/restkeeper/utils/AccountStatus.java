package com.restkeeper.utils;


/**
 * 账号状态
 */
public enum AccountStatus {
    TRIAL(0, "试用账号"),
    OFFICIAL(1, "正式账号"),
    FORBIDDEN(-1, "禁用账号");

    private int status;
    private String desc;

    AccountStatus(int status, String desc) {
        this.status = status;
        this.desc = desc;
    }

    public int getStatus() {
        return status;
    }

    public String getDesc() {
        return desc;
    }


}
