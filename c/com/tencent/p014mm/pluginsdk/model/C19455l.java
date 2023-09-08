package com.tencent.p014mm.pluginsdk.model;

import com.tencent.p014mm.pluginsdk.model.C19449k;

/* renamed from: com.tencent.mm.pluginsdk.model.l */
public final class C19455l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f54978d;

    /* renamed from: e */
    public final /* synthetic */ int f54979e;

    /* renamed from: f */
    public final /* synthetic */ long f54980f;

    public C19455l(String str, int i, long j) {
        this.f54978d = str;
        this.f54979e = i;
        this.f54980f = j;
    }

    public final void run() {
        C19449k.C19451b bVar = C19449k.f54940b.get(this.f54978d);
        if (bVar != null) {
            bVar.mo25214b(this.f54979e, this.f54980f);
        }
    }
}
