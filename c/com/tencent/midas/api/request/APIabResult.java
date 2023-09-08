package com.tencent.midas.api.request;

public class APIabResult {
    public String mMessage;
    public int mResponse;

    public APIabResult(int i, String str) {
        this.mResponse = i;
        if (str == null || str.trim().length() == 0) {
            this.mMessage = getResponseDesc(i);
            return;
        }
        this.mMessage = str + " (response: " + getResponseDesc(i) + ")";
    }

    public static String getResponseDesc(int i) {
        return "";
    }

    public String getMessage() {
        return this.mMessage;
    }

    public int getResponse() {
        return this.mResponse;
    }

    public boolean isFailure() {
        return !isSuccess();
    }

    public boolean isPendig() {
        return this.mResponse == 101;
    }

    public boolean isSuccess() {
        return this.mResponse == 0;
    }

    public String toString() {
        return "IabResult: " + getMessage();
    }
}
