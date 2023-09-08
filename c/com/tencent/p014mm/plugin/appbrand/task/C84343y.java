package com.tencent.p014mm.plugin.appbrand.task;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import h81.C32735h;
import kr0.C88267e;
import mj0.C88734d;
import uj0.C90675f;

/* renamed from: com.tencent.mm.plugin.appbrand.task.y */
public enum C84343y {
    WASERVICE(1, Integer.MAX_VALUE, C88267e.class, C83928t1.class),
    WAGAME(2, 2, C88734d.class, C90675f.class),
    NIL(0, 0, (int) null, (int) null);
    

    /* renamed from: d */
    public final Class<? extends C81925i2> f246275d;

    /* access modifiers changed from: public */
    C84343y(int i, int i2, Class<? extends C81925i2> cls, Class<? extends C83780d1> cls2) {
        if (i == 2) {
            m103970b();
        }
        this.f246275d = cls;
    }

    /* renamed from: a */
    public static C84343y m103969a(boolean z) {
        return z ? WAGAME : WASERVICE;
    }

    /* renamed from: b */
    public static int m103970b() {
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_wagame_task_num, 2);
        Log.m105925i("AppBrandServiceType", "getGameTaskExptNum exp:%d", Integer.valueOf(Qe));
        if (Qe <= 0) {
            return 2;
        }
        return Qe;
    }
}
