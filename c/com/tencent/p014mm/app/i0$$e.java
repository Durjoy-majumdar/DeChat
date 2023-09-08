package com.tencent.p014mm.app;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.xweb.XWebSdk;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import java.util.concurrent.Callable;
import p235sm.C36688e0;

/* renamed from: com.tencent.mm.app.i0$$e */
public final /* synthetic */ class i0$$e implements Callable {
    public final Object call() {
        String str;
        int i;
        int i2;
        int i3;
        String str2;
        Throwable th;
        String str3 = "";
        String crashReportExtraMessage = ((C36688e0) C86312j.m106911c(C36688e0.class)).mo60634j().getCrashReportExtraMessage();
        try {
            if (crashReportExtraMessage.contains("weapp_id")) {
                str = crashReportExtraMessage.substring(crashReportExtraMessage.indexOf(XVFSFile.PATH_SEPARATOR, crashReportExtraMessage.indexOf("weapp_id")) + 1, crashReportExtraMessage.indexOf(";", crashReportExtraMessage.indexOf("weapp_id"))) + "-" + crashReportExtraMessage.substring(crashReportExtraMessage.indexOf(XVFSFile.PATH_SEPARATOR, crashReportExtraMessage.indexOf("weapp_name")) + 1, crashReportExtraMessage.indexOf(";", crashReportExtraMessage.indexOf("weapp_name")));
                i3 = XWebSdk.getInstalledNewstVersion(MMApplicationContext.getContext());
                i2 = XWebSdk.safeGetChromiumVersion();
                i = XWebSdk.getXWebSdkVersion();
                str2 = MultiProcessMMKV.getDefault().decodeString("Matrix-AccInfo", str3);
                str3 = MultiProcessMMKV.getDefault().getString("webview_url_prefs_url", (String) null);
                if (str3 != null && str3.length() > 120) {
                    str3 = str3.substring(0, 119);
                }
                return new String[]{str, String.valueOf(i3), String.valueOf(i2), String.valueOf(i), str2, str3};
            }
        } catch (Throwable th4) {
            Log.m105921e("MicroMsg.MMCrashReporter", "get weappInfo error, %s", th4.getMessage());
        }
        str = str3;
        try {
            i3 = XWebSdk.getInstalledNewstVersion(MMApplicationContext.getContext());
            try {
                i2 = XWebSdk.safeGetChromiumVersion();
            } catch (Throwable th5) {
                th = th5;
                i2 = 0;
                Log.m105921e("MicroMsg.MMCrashReporter", "get xweb info error, %s", th.getMessage());
                i = 0;
                str2 = MultiProcessMMKV.getDefault().decodeString("Matrix-AccInfo", str3);
                str3 = MultiProcessMMKV.getDefault().getString("webview_url_prefs_url", (String) null);
                str3 = str3.substring(0, 119);
                return new String[]{str, String.valueOf(i3), String.valueOf(i2), String.valueOf(i), str2, str3};
            }
            try {
                i = XWebSdk.getXWebSdkVersion();
            } catch (Throwable th6) {
                th = th6;
                Log.m105921e("MicroMsg.MMCrashReporter", "get xweb info error, %s", th.getMessage());
                i = 0;
                str2 = MultiProcessMMKV.getDefault().decodeString("Matrix-AccInfo", str3);
                str3 = MultiProcessMMKV.getDefault().getString("webview_url_prefs_url", (String) null);
                str3 = str3.substring(0, 119);
                return new String[]{str, String.valueOf(i3), String.valueOf(i2), String.valueOf(i), str2, str3};
            }
        } catch (Throwable th7) {
            th = th7;
            i3 = 0;
            i2 = 0;
            Log.m105921e("MicroMsg.MMCrashReporter", "get xweb info error, %s", th.getMessage());
            i = 0;
            str2 = MultiProcessMMKV.getDefault().decodeString("Matrix-AccInfo", str3);
            str3 = MultiProcessMMKV.getDefault().getString("webview_url_prefs_url", (String) null);
            str3 = str3.substring(0, 119);
            return new String[]{str, String.valueOf(i3), String.valueOf(i2), String.valueOf(i), str2, str3};
        }
        try {
            str2 = MultiProcessMMKV.getDefault().decodeString("Matrix-AccInfo", str3);
        } catch (Throwable th8) {
            Log.m105921e("MicroMsg.MMCrashReporter", "get accessibilityInfo error, %s", th8.getMessage());
            str2 = str3;
        }
        try {
            str3 = MultiProcessMMKV.getDefault().getString("webview_url_prefs_url", (String) null);
            str3 = str3.substring(0, 119);
        } catch (Throwable th9) {
            Log.m105921e("MicroMsg.MMCrashReporter", "get webview url error, %s", th9.getMessage());
        }
        return new String[]{str, String.valueOf(i3), String.valueOf(i2), String.valueOf(i), str2, str3};
    }
}
