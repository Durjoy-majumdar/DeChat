package com.tencent.p014mm.plugin.appbrand.app;

import android.app.Activity;
import android.app.ActivityManager;
import android.util.SparseIntArray;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84566n2;
import com.tencent.p014mm.plugin.appbrand.task.C84273a0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: com.tencent.mm.plugin.appbrand.app.n */
public final class C81176n {

    /* renamed from: a */
    public static final C81177a f238499a = new C81177a((C81168l) null);

    /* renamed from: b */
    public static volatile boolean f238500b = false;

    /* renamed from: c */
    public static volatile boolean f238501c = false;

    /* renamed from: com.tencent.mm.plugin.appbrand.app.n$a */
    public static final class C81177a {

        /* renamed from: a */
        public final boolean f238502a;

        /* renamed from: b */
        public final SparseIntArray f238503b;

        public C81177a(C81168l lVar) {
            this.f238502a = C84566n2.m104161j() && MMApplicationContext.getProcessName().equals(C84273a0.f246143j);
            this.f238503b = new SparseIntArray();
        }

        /* renamed from: a */
        public static void m99462a(C81177a aVar, Activity activity) {
            if (activity == null) {
                aVar.getClass();
                return;
            }
            aVar.f238503b.delete(activity.hashCode());
            if (aVar.f238503b.size() <= 0) {
                C81177a aVar2 = C81176n.f238499a;
                Log.m105925i("MicroMsg.AppBrandProcessProfileInit[applaunch][PreloadProfile][preload]", "setSkipMiscPreload %b", Boolean.FALSE);
                C81176n.f238500b = false;
            }
            Log.m105925i("MicroMsg.AppBrandProcessProfileInit[applaunch][PreloadProfile][preload]", "alive activity count %d", Integer.valueOf(aVar.f238503b.size()));
        }
    }

    /* renamed from: a */
    public static void m99461a(String str) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        Log.m105925i("MicroMsg.AppBrandProcessProfileInit[applaunch][PreloadProfile][preload]", "current ProcessImportance [%d][%d][%s], %s", Integer.valueOf(runningAppProcessInfo.importance), Integer.valueOf(runningAppProcessInfo.importanceReasonCode), runningAppProcessInfo.importanceReasonComponent, str);
    }
}
