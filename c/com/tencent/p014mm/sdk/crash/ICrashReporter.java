package com.tencent.p014mm.sdk.crash;

import android.content.Context;

/* renamed from: com.tencent.mm.sdk.crash.ICrashReporter */
public interface ICrashReporter {

    /* renamed from: com.tencent.mm.sdk.crash.ICrashReporter$ICrashExpansionDelegate */
    public interface ICrashExpansionDelegate {
        String getLastObbErrorInfo();

        String getObbInfo();

        boolean isInstalled(String str);

        boolean needObbRes();
    }

    /* renamed from: com.tencent.mm.sdk.crash.ICrashReporter$ICrashReportExtraMessageGetter */
    public interface ICrashReportExtraMessageGetter {
        String getCrashReportExtraMessage();
    }

    /* renamed from: com.tencent.mm.sdk.crash.ICrashReporter$ICrashReportListener */
    public interface ICrashReportListener {
        void onCrashDumped(String str);
    }

    void addCrashReportListener(ICrashReportListener iCrashReportListener);

    void addExtraMessageGetter(ICrashReportExtraMessageGetter iCrashReportExtraMessageGetter);

    void init(Context context, boolean z);

    void removeCrashReportListener(ICrashReportListener iCrashReportListener);

    void reportCrashMessage(String str, String str2);

    void reportJniCrash(int i, String str, String str2);

    void reportRawMessage(String str, String str2);

    void setCallbackForReset(CallbackForReset callbackForReset);

    void setReportID(String str);

    void setupSubReporter(ISubReporter iSubReporter);
}
