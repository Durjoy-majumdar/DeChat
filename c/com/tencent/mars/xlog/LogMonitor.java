package com.tencent.mars.xlog;

import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.sdk.platformtools.AppBrands;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import java.text.SimpleDateFormat;
import java.util.Date;
import kj2.C117407d;
import p1035sf.C90183c;
import qe3.C89625d;

public class LogMonitor {

    /* renamed from: KV */
    private static final int f235233KV = 24354;
    public static final int LONG_LONG_TIME_TRIGGER = 18;
    public static final int LONG_TIME_TRIGGER = 16;
    public static final int SHORT_TIME_TRIGGER = 17;
    private static final String TAG = "LogMonitor";
    private static final String pattern = "yyyy-MM-dd HH:mm:ss.SSS";
    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    public ThreadLocal<Boolean> entered = new ThreadLocal<>();
    private WindowCounter longLongTimeCounter;
    private WindowCounter longTimeCounter;
    private WindowCounter shortTimeCounter;

    public LogMonitor() {
        boolean z = true;
        boolean z2 = C89625d.f257845k || BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED;
        boolean z3 = z2 || MultiProcessMMKV.getDefault().decodeBool("clicfg_log_monitor_short_time_count", false);
        boolean z4 = z2 || MultiProcessMMKV.getDefault().decodeBool("clicfg_log_monitor_long_time_count", false);
        if (!z2 && !MultiProcessMMKV.getDefault().decodeBool("clicfg_log_monitor_long_long_time_count", false)) {
            z = false;
        }
        if (z3) {
            WindowCounter windowCounter = new WindowCounter(250, 20, 125000, 15000, true);
            this.shortTimeCounter = windowCounter;
            windowCounter.setEnableFilter();
            this.shortTimeCounter.setThresholdTriggeredCallBack(new LogMonitor$$a());
        }
        if (z4) {
            WindowCounter windowCounter2 = new WindowCounter(15000, 20, 900000, 1000000, false);
            this.longTimeCounter = windowCounter2;
            windowCounter2.setThresholdTriggeredCallBack(new LogMonitor$$b());
        }
        if (z) {
            WindowCounter windowCounter3 = new WindowCounter(60000, 120, 1200000, 500000, true);
            this.longLongTimeCounter = windowCounter3;
            windowCounter3.setThresholdTriggeredCallBack(new LogMonitor$$c());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$1(String str, String str2, int i) {
        report(str, str2, i, i > 3000000 ? 113 : 115, 16);
    }

    public static void report(String str, String str2, int i, int i2, int i3) {
        AppBrands.AppBrandAppInfo appBrandInfo;
        Log.m105925i(TAG, "report frequently log print, tag=%s, log=%s, type=%d, count=%d", str, str2, Integer.valueOf(i3), Integer.valueOf(i));
        String processName = MMApplicationContext.getProcessName();
        if (MMApplicationContext.isAppBrandProcess() && (appBrandInfo = AppBrands.getAppBrandInfo()) != null) {
            processName = (processName + " [" + appBrandInfo.appId) + "@" + appBrandInfo.appName + "]";
        }
        String c = AppForegroundDelegate.INSTANCE.mo174210c();
        if (c == null) {
            c = "null";
        }
        int lastIndexOf = c.lastIndexOf(64);
        if (lastIndexOf > 0) {
            c = c.substring(0, lastIndexOf);
        }
        C117407d.INSTANCE.mo160131h(f235233KV, c, C90183c.m112853a(), Integer.valueOf(i2), processName, simpleDateFormat.format(new Date()), Long.valueOf(System.currentTimeMillis()), Integer.valueOf(i), str, Integer.valueOf(i3), str2);
    }

    public boolean monitor(String str, String str2) {
        if (this.shortTimeCounter == null && this.longTimeCounter == null && this.longLongTimeCounter == null) {
            return true;
        }
        Boolean bool = Boolean.TRUE;
        if (bool.equals(this.entered.get())) {
            return true;
        }
        this.entered.set(bool);
        if (str == null) {
            str = "null";
        }
        if (str2 == null) {
            str2 = "null";
        }
        WindowCounter windowCounter = this.shortTimeCounter;
        boolean z = windowCounter == null || windowCounter.addLog2Monitor(str, str2);
        WindowCounter windowCounter2 = this.longTimeCounter;
        boolean z2 = windowCounter2 == null || windowCounter2.addLog2Monitor(str, str2);
        WindowCounter windowCounter3 = this.longLongTimeCounter;
        boolean z3 = windowCounter3 == null || windowCounter3.addLog2Monitor(str, str2);
        this.entered.set(Boolean.FALSE);
        return z && z2 && z3;
    }
}
