package com.wshy.demo.Enum;

/**
 * @author wshy
 * @data 2020/6/15
 **/
public enum Day {
    SUSCCESS("0000","成功"),
    FAILURE("9999","失败");
    private String returnCode;
    private String returnInfo;

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnInfo() {
        return returnInfo;
    }

    public void setReturnInfo(String returnInfo) {
        this.returnInfo = returnInfo;
    }

    Day(String returnCode, String returnInfo) {
        this.returnCode = returnCode;
        this.returnInfo = returnInfo;
    }
}
