package com.tencent.p014mm.plugin.performance.jectl;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.crash.ICrashReporter;

/* renamed from: com.tencent.mm.plugin.performance.jectl.a */
public class C30346a implements ICrashReporter.ICrashReportExtraMessageGetter {
    public String getCrashReportExtraMessage() {
        String decodeString = JeVersion.f81899a.decodeString("JV_KEY_LAST_JE_VERSION_STRING", "");
        if (TextUtils.isEmpty(decodeString)) {
            return "";
        }
        return "jemalloc:" + decodeString;
    }
}
