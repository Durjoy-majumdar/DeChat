package com.tencent.p014mm.plugin.appbrand.app;

import android.app.ActivityManager;
import android.os.Build;
import com.tencent.p014mm.plugin.appbrand.app.C81194z;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.app.a0 */
public final class C81146a0 implements C81194z.C81197d {
    /* renamed from: a */
    public boolean mo113336a(ActivityManager.AppTask appTask) {
        C87412m.m108594g(appTask, "appTask");
        int i = Build.VERSION.SDK_INT;
        return ((i < 29 || !C81194z.f238514h) ? (i < 23 || !C81194z.f238513g) ? C81194z.f238512f ? C81194z.C81202g.f238539b : C81194z.C81203h.f238540b : C81194z.C81200e.f238537b : C81194z.C81201f.f238538b).mo113336a(appTask) || C81194z.C81204i.f238541b.mo113336a(appTask);
    }
}
