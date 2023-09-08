package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18296j0;
import com.tencent.p014mm.storage.C19623o0;
import wd3.C22906q;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.f0 */
public final class C18242f0 implements C22906q.C22907a {

    /* renamed from: a */
    public final /* synthetic */ C18296j0.C18297a f50445a;

    /* renamed from: b */
    public final /* synthetic */ C19623o0 f50446b;

    /* renamed from: c */
    public final /* synthetic */ int f50447c;

    public C18242f0(C18296j0.C18297a aVar, C19623o0 o0Var, int i) {
        this.f50445a = aVar;
        this.f50446b = o0Var;
        this.f50447c = i;
    }

    public void onFinish() {
        C18296j0.C18297a aVar = this.f50445a;
        aVar.mo22879d(aVar.f50609F, this.f50446b, this.f50447c, true);
        this.f50445a.f50825d.f51445p.mo23110l(this.f50446b.field_msgId, this.f50447c);
    }

    public void onStart() {
    }
}
