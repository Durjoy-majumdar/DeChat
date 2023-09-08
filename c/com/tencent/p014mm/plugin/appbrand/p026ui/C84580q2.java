package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.app.ActivityManager;
import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUIMoveTaskToBackStubUI;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import java.util.List;
import p385u2.C111105a;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.q2 */
public class C84580q2 {

    /* renamed from: a */
    public boolean f246791a = false;

    /* JADX WARNING: Removed duplicated region for block: B:39:0x006d A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo117268a(com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI r6, com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC r7) {
        /*
            r5 = this;
            boolean r0 = r5.f246791a
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            if (r7 != 0) goto L_0x0009
            return r1
        L_0x0009:
            boolean r0 = r6.isTaskRoot()
            if (r0 == 0) goto L_0x006e
            boolean r0 = r6.f246483A
            if (r0 != 0) goto L_0x006e
            boolean r0 = r6.f246506z
            if (r0 != 0) goto L_0x006e
            boolean r0 = r6.f246484B
            if (r0 != 0) goto L_0x006e
            com.tencent.mm.plugin.appbrand.ui.AppBrandUITranslucentWorkaroundDelegate r0 = r6.f246497q
            boolean r0 = r0.f246539e
            if (r0 != 0) goto L_0x006e
            boolean r0 = r6.isInMultiWindowMode()
            if (r0 != 0) goto L_0x006e
            boolean r0 = com.tencent.p014mm.p136ui.C85875k4.m106197n0()
            if (r0 != 0) goto L_0x006e
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r0 = r7.f234834c1
            int r2 = com.tencent.p014mm.plugin.appbrand.p026ui.C84583r2.m104181c(r0)
            r3 = 1023(0x3ff, float:1.434E-42)
            r4 = 1
            if (r2 == r3) goto L_0x0043
            int r0 = com.tencent.p014mm.plugin.appbrand.p026ui.C84583r2.m104181c(r0)
            r2 = 1223(0x4c7, float:1.714E-42)
            if (r0 != r2) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            r0 = 0
            goto L_0x0044
        L_0x0043:
            r0 = 1
        L_0x0044:
            if (r0 != 0) goto L_0x0061
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r7 = r7.f234834c1
            int r0 = com.tencent.p014mm.plugin.appbrand.p026ui.C84583r2.m104181c(r7)
            r2 = 1113(0x459, float:1.56E-42)
            if (r0 == r2) goto L_0x005b
            int r7 = com.tencent.p014mm.plugin.appbrand.p026ui.C84583r2.m104181c(r7)
            r0 = 1114(0x45a, float:1.561E-42)
            if (r7 != r0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r7 = 0
            goto L_0x005c
        L_0x005b:
            r7 = 1
        L_0x005c:
            if (r7 == 0) goto L_0x005f
            goto L_0x0061
        L_0x005f:
            r7 = 0
            goto L_0x0062
        L_0x0061:
            r7 = 1
        L_0x0062:
            if (r7 == 0) goto L_0x0065
            return r1
        L_0x0065:
            com.tencent.mm.plugin.appbrand.ui.AppBrandUIMoveTaskToBackStubUI$a r7 = com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUIMoveTaskToBackStubUI.f246524g
            boolean r6 = r7.mo117144b(r6)
            if (r6 == 0) goto L_0x006e
            return r4
        L_0x006e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.p026ui.C84580q2.mo117268a(com.tencent.mm.plugin.appbrand.ui.AppBrandUI, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC):boolean");
    }

    /* renamed from: b */
    public void mo117269b(AppBrandUI appBrandUI, Intent intent) {
        List<ActivityManager.AppTask> appTasks;
        ActivityManager.RecentTaskInfo recentTaskInfo;
        if (intent == null) {
            this.f246791a = false;
            return;
        }
        int intExtra = IntentUtil.getIntExtra(intent, "key_appbrand_source_android_task_id", 0);
        if (intExtra == appBrandUI.getTaskId()) {
            this.f246791a = this.f246791a;
            return;
        }
        ActivityManager activityManager = (ActivityManager) C111105a.m151502d(appBrandUI, ActivityManager.class);
        if (!(activityManager == null || (appTasks = activityManager.getAppTasks()) == null)) {
            for (ActivityManager.AppTask taskInfo : appTasks) {
                try {
                    recentTaskInfo = taskInfo.getTaskInfo();
                } catch (IllegalArgumentException unused) {
                    recentTaskInfo = null;
                }
                if (recentTaskInfo != null && intExtra == recentTaskInfo.id) {
                    try {
                        Intent intent2 = recentTaskInfo.baseIntent;
                        this.f246791a = intent2 != null && "android.intent.action.MAIN".equals(intent2.getAction()) && intent2.getCategories() != null && intent2.getCategories().contains("android.intent.category.LAUNCHER");
                        return;
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.AppBrandUIAndroid12CloseAnimationWorkaround", "onActivityNewIntent check taskId:%d is launcherIntent, get unrecognized exception:%s", Integer.valueOf(intExtra), e);
                    }
                }
            }
        }
        this.f246791a = false;
    }

    /* renamed from: c */
    public boolean mo117270c(AppBrandUI appBrandUI, AppBrandInitConfigWC appBrandInitConfigWC) {
        if (!mo117268a(appBrandUI, appBrandInitConfigWC)) {
            return false;
        }
        AppBrandUIMoveTaskToBackStubUI.C84460a aVar = AppBrandUIMoveTaskToBackStubUI.f246524g;
        C87412m.m108594g(appBrandUI, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        return aVar.mo117145c(appBrandUI, AppBrandUIMoveTaskToBackStubUI.C84460a.C84461a.Finish);
    }
}
