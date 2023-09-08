package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18335q1;
import com.tencent.p014mm.storage.C19623o0;
import wd3.C22906q;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.m1 */
public final class C18314m1 implements C22906q.C22907a {

    /* renamed from: a */
    public final /* synthetic */ C18335q1.C18336a f50674a;

    /* renamed from: b */
    public final /* synthetic */ C19623o0 f50675b;

    /* renamed from: c */
    public final /* synthetic */ int f50676c;

    public C18314m1(C18335q1.C18336a aVar, C19623o0 o0Var, int i) {
        this.f50674a = aVar;
        this.f50675b = o0Var;
        this.f50676c = i;
    }

    public void onFinish() {
        C18335q1.C18336a aVar = this.f50674a;
        aVar.mo22879d(aVar.f50761G, this.f50675b, this.f50676c, true);
        this.f50674a.f50825d.f51445p.mo23110l(this.f50675b.field_msgId, this.f50676c);
    }

    public void onStart() {
    }
}
