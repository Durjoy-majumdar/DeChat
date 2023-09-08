package com.tencent.xweb.internal;

import android.webkit.ValueCallback;
import java.util.Map;

public interface IWebStorage {
    void deleteAllData();

    void deleteOrigin(String str);

    void getOrigins(ValueCallback<Map> valueCallback);

    void getQuotaForOrigin(String str, ValueCallback<Long> valueCallback);

    void getUsageForOrigin(String str, ValueCallback<Long> valueCallback);

    void setQuotaForOrigin(String str, long j);
}
