package com.tencent.p014mm.plugin.sns.device.appstore;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher */
public abstract class ApkInstalledWatcher extends BroadcastReceiver {
    /* renamed from: a */
    public abstract boolean mo130694a(Context context, String str);

    /* renamed from: b */
    public abstract boolean mo130695b(Context context, String str);

    public void onReceive(Context context, Intent intent) {
        SnsMethodCalculate.markStartTimeMs("onReceive", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher");
        if (intent != null) {
            try {
                String action = intent.getAction();
                String str = "";
                if ("android.intent.action.PACKAGE_ADDED".equals(action)) {
                    SnsMethodCalculate.markStartTimeMs("onPackageAdd", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher");
                    SnsMethodCalculate.markStartTimeMs("getAppPackage", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher");
                    str = intent.getData().getSchemeSpecificPart();
                    SnsMethodCalculate.markEndTimeMs("getAppPackage", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher");
                    if (TextUtils.isEmpty(str)) {
                        SnsMethodCalculate.markEndTimeMs("onPackageAdd", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher");
                    } else {
                        mo130694a(context, str);
                        SnsMethodCalculate.markEndTimeMs("onPackageAdd", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher");
                    }
                } else if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {
                    SnsMethodCalculate.markStartTimeMs("onPackageRemove", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher");
                    SnsMethodCalculate.markStartTimeMs("getAppPackage", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher");
                    try {
                        str = intent.getData().getSchemeSpecificPart();
                        SnsMethodCalculate.markEndTimeMs("getAppPackage", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher");
                    } catch (Throwable unused) {
                        SnsMethodCalculate.markEndTimeMs("getAppPackage", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher");
                    }
                    if (TextUtils.isEmpty(str)) {
                        SnsMethodCalculate.markEndTimeMs("onPackageRemove", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher");
                    } else {
                        mo130695b(context, str);
                        SnsMethodCalculate.markEndTimeMs("onPackageRemove", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher");
                    }
                }
            } catch (Throwable unused2) {
            }
        }
        SnsMethodCalculate.markEndTimeMs("onReceive", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher");
    }
}
