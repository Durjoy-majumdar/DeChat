package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18321o2;
import com.tencent.p014mm.storage.C19623o0;
import wd3.C22906q;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.k2 */
public final class C18306k2 implements C22906q.C22907a {

    /* renamed from: a */
    public final /* synthetic */ C18321o2.C18322a f50648a;

    /* renamed from: b */
    public final /* synthetic */ C19623o0 f50649b;

    /* renamed from: c */
    public final /* synthetic */ int f50650c;

    public C18306k2(C18321o2.C18322a aVar, C19623o0 o0Var, int i) {
        this.f50648a = aVar;
        this.f50649b = o0Var;
        this.f50650c = i;
    }

    public void onFinish() {
        C18321o2.C18322a aVar = this.f50648a;
        aVar.mo22879d(aVar.f50708G, this.f50649b, this.f50650c, true);
        this.f50648a.f50825d.f51445p.mo23110l(this.f50649b.field_msgId, this.f50650c);
    }

    public void onStart() {
    }
}
