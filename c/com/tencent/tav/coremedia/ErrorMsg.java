package com.tencent.tav.coremedia;

public class ErrorMsg {
    public int errorCode;
    public String errorMsg;

    public ErrorMsg() {
    }

    public ErrorMsg(int i, String str) {
        this.errorCode = i;
        this.errorMsg = str;
    }
}
