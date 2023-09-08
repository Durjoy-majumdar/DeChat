package com.tencent.p014mm.plugin.appbrand.menu;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.C83714o2;
import com.tencent.p014mm.plugin.report.service.C115669n;
import di3.C86312j;
import java.util.concurrent.atomic.AtomicBoolean;
import p003ay.C0235b;

/* renamed from: com.tencent.mm.plugin.appbrand.menu.q */
public class C83687q implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AtomicBoolean f244307d;

    /* renamed from: e */
    public final /* synthetic */ Context f244308e;

    /* renamed from: f */
    public final /* synthetic */ C83714o2.C83715a f244309f;

    /* renamed from: g */
    public final /* synthetic */ int f244310g;

    /* renamed from: h */
    public final /* synthetic */ int f244311h;

    /* renamed from: i */
    public final /* synthetic */ int f244312i;

    /* renamed from: j */
    public final /* synthetic */ boolean f244313j;

    public C83687q(C83688r rVar, AtomicBoolean atomicBoolean, Context context, C83714o2.C83715a aVar, int i, int i2, int i3, boolean z) {
        this.f244307d = atomicBoolean;
        this.f244308e = context;
        this.f244309f = aVar;
        this.f244310g = i;
        this.f244311h = i2;
        this.f244312i = i3;
        this.f244313j = z;
    }

    public void run() {
        this.f244307d.set(C83714o2.m102751a(this.f244308e, this.f244309f, this.f244310g, false));
        if (this.f244307d.get()) {
            C115669n.INSTANCE.idkeyStat(443, 1, 1, false);
        }
        if (this.f244308e != null && this.f244307d.get()) {
            ((C0235b) C86312j.m106911c(C0235b.class)).mo266qf(this.f244308e, this.f244311h, this.f244312i, this.f244313j, this.f244309f.f244361d, true);
        }
    }
}
