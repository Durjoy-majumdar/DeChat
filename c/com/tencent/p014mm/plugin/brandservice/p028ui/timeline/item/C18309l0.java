package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18326p0;
import com.tencent.p014mm.storage.C19623o0;
import wd3.C22906q;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.l0 */
public final class C18309l0 implements C22906q.C22907a {

    /* renamed from: a */
    public final /* synthetic */ C18326p0.C18327a f50655a;

    /* renamed from: b */
    public final /* synthetic */ C19623o0 f50656b;

    /* renamed from: c */
    public final /* synthetic */ int f50657c;

    public C18309l0(C18326p0.C18327a aVar, C19623o0 o0Var, int i) {
        this.f50655a = aVar;
        this.f50656b = o0Var;
        this.f50657c = i;
    }

    public void onFinish() {
        C18326p0.C18327a aVar = this.f50655a;
        aVar.mo22879d(aVar.f50728G, this.f50656b, this.f50657c, true);
        this.f50655a.f50825d.f51445p.mo23110l(this.f50656b.field_msgId, this.f50657c);
    }

    public void onStart() {
    }
}
