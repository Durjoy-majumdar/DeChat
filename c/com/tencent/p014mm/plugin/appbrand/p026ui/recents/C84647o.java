package com.tencent.p014mm.plugin.appbrand.p026ui.recents;

import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo;
import com.tencent.p014mm.plugin.appbrand.appusage.C68585h1;
import com.tencent.p014mm.plugin.appbrand.appusage.C81478e0;
import com.tencent.p014mm.plugin.appbrand.appusage.C81500i0;
import com.tencent.p014mm.plugin.appbrand.appusage.C81516o;
import com.tencent.p014mm.plugin.appbrand.config.C81661j;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.o */
public class C84647o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandLauncherRecentsList f246955d;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.o$a */
    public class C84648a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ArrayList f246956d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList f246957e;

        public C84648a(ArrayList arrayList, ArrayList arrayList2) {
            this.f246956d = arrayList;
            this.f246957e = arrayList2;
        }

        public void run() {
            AppBrandLauncherRecentsList appBrandLauncherRecentsList = C84647o.this.f246955d;
            int i = AppBrandLauncherRecentsList.f246810y0;
            appBrandLauncherRecentsList.getClass();
            C81661j.m100182g().add(appBrandLauncherRecentsList.f246811A.getSerial(), appBrandLauncherRecentsList.f246832W);
            C81161g2.requireAccountInitializedOnDemand();
            C81161g2.f238473i.add(appBrandLauncherRecentsList.f246811A.getSerial(), appBrandLauncherRecentsList.f246831V);
            if (appBrandLauncherRecentsList.f246837i) {
                ((C81500i0) C81161g2.Bx0(C81500i0.class)).add(appBrandLauncherRecentsList.f246811A.getSerial(), appBrandLauncherRecentsList.f246830U);
            }
            appBrandLauncherRecentsList.f246841p.add(appBrandLauncherRecentsList.f246811A.getSerial(), appBrandLauncherRecentsList.f246833X);
            AppBrandLauncherRecentsList.m104193Q(C84647o.this.f246955d, this.f246956d, this.f246957e, false);
        }
    }

    public C84647o(AppBrandLauncherRecentsList appBrandLauncherRecentsList) {
        this.f246955d = appBrandLauncherRecentsList;
    }

    public void run() {
        String str;
        C84622b0 b0Var = this.f246955d.f246840o;
        C81161g2.requireAccountInitializedOnDemand();
        ArrayList<AppBrandRecentTaskInfo> a = C81161g2.f238473i.f80166f.mo56648a(MAlarmHandler.NEXT_FIRE_INTERVAL, 32);
        b0Var.getClass();
        AppBrandLauncherRecentsList appBrandLauncherRecentsList = this.f246955d;
        C84635h0 h0Var = appBrandLauncherRecentsList.f246813C;
        int i = appBrandLauncherRecentsList.f246389e;
        String str2 = appBrandLauncherRecentsList.f246390f;
        h0Var.getClass();
        ArrayList<AppBrandRecentTaskInfo> arrayList = null;
        if (a.size() <= 0) {
            str = null;
        } else {
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            for (int i3 = 0; i3 < a.size(); i3++) {
                AppBrandRecentTaskInfo appBrandRecentTaskInfo = a.get(i3);
                if (appBrandRecentTaskInfo instanceof AppBrandRecentTaskInfo) {
                    i2++;
                    sb.append(appBrandRecentTaskInfo.f239041e);
                    if (i2 == 20 || i2 >= a.size()) {
                        break;
                    }
                    sb.append(":#:");
                }
            }
            str = sb.toString();
        }
        Set<Object> set = C81478e0.f239071d;
        C84240s.m103837c(i, "", 0, str, 0, "", str2);
        AppBrandLauncherRecentsList appBrandLauncherRecentsList2 = this.f246955d;
        if (appBrandLauncherRecentsList2.f246838j) {
            arrayList = new ArrayList<>(0);
        } else if (appBrandLauncherRecentsList2.f246837i) {
            arrayList = ((C81500i0) C81161g2.Bx0(C81500i0.class)).mo113792Yt(-1, C68585h1.C68586a.ASC);
        }
        this.f246955d.mo117067N(new C84648a(arrayList, a));
        C81516o qq = C81516o.m100007qq();
        long j = this.f246955d.f246844r.get();
        AppBrandLauncherRecentsList appBrandLauncherRecentsList3 = this.f246955d;
        qq.sp0(j, true, appBrandLauncherRecentsList3.f246843q, appBrandLauncherRecentsList3.f246820J, appBrandLauncherRecentsList3.f246821K);
        this.f246955d.f246846t.set(true);
    }
}
