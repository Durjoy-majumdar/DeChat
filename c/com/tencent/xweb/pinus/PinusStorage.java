package com.tencent.xweb.pinus;

import android.webkit.ValueCallback;
import com.tencent.xweb.internal.ConstValue;
import com.tencent.xweb.internal.IWebStorage;
import com.tencent.xweb.util.XWebLog;
import java.util.Map;

public class PinusStorage implements IWebStorage {
    public static final String TAG = "PinusStorage";

    public void deleteAllData() {
    }

    public void deleteOrigin(String str) {
        Object invokeRuntimeChannel = PinusStandAloneChannel.getInstance().invokeRuntimeChannel(ConstValue.INVOKE_RUNTIME_ID_DELETE_ORIGIN, new Object[]{str});
        XWebLog.m21911i(TAG, "delete origin(" + str + ") result is " + invokeRuntimeChannel);
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
