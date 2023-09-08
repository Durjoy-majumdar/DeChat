package com.tencent.p014mm.plugin.appbrand.task;

import android.app.Activity;
import android.app.Service;
import com.tencent.luggage.sdk.processes.C80249b;
import com.tencent.luggage.sdk.processes.C80250c;
import com.tencent.luggage.sdk.processes.C80264l;
import com.tencent.luggage.sdk.processes.C80265m;
import com.tencent.p014mm.plugin.appbrand.app.C81194z;
import com.tencent.p014mm.plugin.appbrand.task.ipc.AppBrandKillByClientMessage;
import fy3.C32224a;
import gy3.C87412m;
import java.util.Iterator;
import kj2.C117407d;

/* renamed from: com.tencent.mm.plugin.appbrand.task.k */
public class C84310k extends C80250c<C84274b0> {

    /* renamed from: g */
    public final Class<? extends Activity> f246194g;

    /* renamed from: h */
    public final Class<? extends Activity> f246195h;

    /* renamed from: i */
    public final Class<? extends Service> f246196i;

    /* renamed from: j */
    public final Class<? extends Service> f246197j;

    /* renamed from: k */
    public final Class<? extends Activity> f246198k;

    /* renamed from: l */
    public int f246199l = -1;

    public C84310k(Class<? extends Activity> cls, Class<? extends Activity> cls2, Class<? extends Service> cls3, Class<? extends Service> cls4, Class<? extends Service> cls5, Class<? extends Activity> cls6) {
        C87412m.m108594g(cls, "uiClass");
        C87412m.m108594g(cls2, "pluginUIClass");
        C87412m.m108594g(cls3, "keepAliveServiceClass");
        C87412m.m108594g(cls4, "foregroundServiceClass");
        C87412m.m108594g(cls5, "processTriggerServiceClass");
        C87412m.m108594g(cls6, "preLoadingUIClass");
        this.f246194g = cls;
        this.f246195h = cls2;
        this.f246196i = cls4;
        this.f246197j = cls5;
        this.f246198k = cls6;
    }

    /* renamed from: a */
    public C80264l mo111356a(String str, int i, String str2, boolean z) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "instanceId");
        return mo111370o(str, z, i, str2);
    }

    /* renamed from: b */
    public C80264l mo111357b(String str, int i, boolean z) {
        C87412m.m108594g(str, "appId");
        return new C84315o(str, i, C80265m.INIT, z);
    }

    /* renamed from: g */
    public Class<? extends Activity> mo111362g() {
        return this.f246195h;
    }

    /* renamed from: i */
    public Class<? extends Activity> mo111364i() {
        return this.f246194g;
    }

    /* renamed from: m */
    public void mo111368m(C80249b bVar) {
        C87412m.m108594g(bVar, "type");
        mo111365j();
        if (mo111367l()) {
            for (String appBrandKillByClientMessage : mo111360e()) {
                C80250c.m97639p(this, new AppBrandKillByClientMessage(appBrandKillByClientMessage, bVar.ordinal()), (C32224a) null, 2, (Object) null);
            }
        }
    }

    /* renamed from: n */
    public void mo111369n() {
        super.mo111369n();
        C117407d.INSTANCE.idkeyStat(365, 5, 1, false);
        C81194z.zx0(C81194z.C81196b.APPBRAND_BINDER_DIED);
    }

    /* renamed from: u */
    public final long mo117010u() {
        T t;
        Iterator<T> it = this.f234940a.iterator();
        if (!it.hasNext()) {
            t = null;
        } else {
            T next = it.next();
            if (!it.hasNext()) {
                t = next;
            } else {
                C80264l lVar = (C80264l) next;
                C87412m.m108592e(lVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.task.AppBrandMiniProgramRecord");
                long j = ((C84315o) lVar).f246201i;
                do {
                    T next2 = it.next();
                    C80264l lVar2 = (C80264l) next2;
                    C87412m.m108592e(lVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.task.AppBrandMiniProgramRecord");
                    long j2 = ((C84315o) lVar2).f246201i;
                    if (j < j2) {
                        next = next2;
                        j = j2;
                    }
                } while (it.hasNext());
            }
            t = next;
        }
        C80264l lVar3 = (C80264l) t;
        if (lVar3 != null) {
            return ((C84315o) lVar3).f246201i;
        }
        return 0;
    }
}
