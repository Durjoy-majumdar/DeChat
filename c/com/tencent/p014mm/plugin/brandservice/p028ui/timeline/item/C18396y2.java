package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18401z2;
import com.tencent.p014mm.storage.C19623o0;
import wd3.C22906q;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.y2 */
public final class C18396y2 implements C22906q.C22907a {

    /* renamed from: a */
    public final /* synthetic */ C18401z2.C18402a f51001a;

    /* renamed from: b */
    public final /* synthetic */ C19623o0 f51002b;

    /* renamed from: c */
    public final /* synthetic */ int f51003c;

    public C18396y2(C18401z2.C18402a aVar, C19623o0 o0Var, int i) {
        this.f51001a = aVar;
        this.f51002b = o0Var;
        this.f51003c = i;
    }

    public void onFinish() {
        C18401z2.C18402a aVar = this.f51001a;
        aVar.mo22879d(aVar.f51042Q, this.f51002b, this.f51003c, true);
    }

    public void onStart() {
    }
}
