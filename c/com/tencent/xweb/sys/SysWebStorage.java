package com.tencent.xweb.sys;

import android.webkit.ValueCallback;
import android.webkit.WebStorage;
import com.tencent.xweb.internal.IWebStorage;
import java.util.Map;

public class SysWebStorage implements IWebStorage {
    public void deleteAllData() {
    }

    public void deleteOrigin(String str) {
        WebStorage.getInstance().deleteOrigin(str);
    }

    public void getOrigins(ValueCallback<Map> valueCallback) {
    }

    public void getQuotaForOrigin(String str, ValueCallback<Long> valueCallback) {
    }

    public void getUsageForOrigin(String str, ValueCallback<Long> valueCallback) {
    }

    public void setQuotaForOrigin(String str, long j) {
    }
}
