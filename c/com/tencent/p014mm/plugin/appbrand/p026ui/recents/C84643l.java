package com.tencent.p014mm.plugin.appbrand.p026ui.recents;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo;
import com.tencent.p014mm.plugin.appbrand.p026ui.recents.AppBrandLauncherRecentsList;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.l */
public class C84643l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f246949d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandLauncherRecentsList f246950e;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.l$a */
    public class C84644a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ArrayList f246951d;

        public C84644a(ArrayList arrayList) {
            this.f246951d = arrayList;
        }

        public void run() {
            LoadMoreRecyclerView loadMoreRecyclerView = C84643l.this.f246950e.f246849w;
            if (loadMoreRecyclerView != null) {
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                if (C107207u.C107211e.m145207b(loadMoreRecyclerView)) {
                    if (C84643l.this.f246950e.f246849w.mo17036W0()) {
                        C84643l.this.f246950e.f246812B.obtainMessage(2, this).sendToTarget();
                    } else {
                        AppBrandLauncherRecentsList.m104194R(C84643l.this.f246950e, this.f246951d);
                    }
                }
            }
        }
    }

    public C84643l(AppBrandLauncherRecentsList appBrandLauncherRecentsList, long j) {
        this.f246950e = appBrandLauncherRecentsList;
        this.f246949d = j;
    }

    public void run() {
        C84622b0 b0Var = this.f246950e.f246840o;
        C81161g2.requireAccountInitializedOnDemand();
        ArrayList<AppBrandRecentTaskInfo> a = b0Var.mo117322a(C81161g2.f238473i.f80166f.mo56648a(this.f246949d, 32));
        AppBrandLauncherRecentsList.C84605j jVar = this.f246950e.f246812B;
        int i = AppBrandLauncherRecentsList.C84605j.f246870b;
        jVar.mo117294a();
        AppBrandLauncherRecentsList.C84605j jVar2 = this.f246950e.f246812B;
        jVar2.sendMessage(jVar2.obtainMessage(1, new C84644a(a)));
    }
}
