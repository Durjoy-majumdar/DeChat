package com.tencent.live2.jsplugin;

import java.util.Map;

public class V2TXJSAdapterError {
    public int errorCode;
    public String errorInfo;
    public Map<String, Object> resultMap;

    public V2TXJSAdapterError() {
        this.errorCode = 0;
        this.errorInfo = "Success";
        this.resultMap = null;
    }

    public V2TXJSAdapterError(int i, String str) {
        this.resultMap = null;
        this.errorCode = i;
        this.errorInfo = str;
    }

    public V2TXJSAdapterError(int i, Map<String, Object> map) {
        this.errorInfo = "Success";
        this.errorCode = i;
        this.resultMap = map;
    }
}
