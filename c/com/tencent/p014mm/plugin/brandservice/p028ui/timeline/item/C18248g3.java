package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18291i3;
import com.tencent.p014mm.storage.C19623o0;
import wd3.C22906q;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.g3 */
public final class C18248g3 implements C22906q.C22907a {

    /* renamed from: a */
    public final /* synthetic */ C18291i3.C18292a f50464a;

    /* renamed from: b */
    public final /* synthetic */ C19623o0 f50465b;

    /* renamed from: c */
    public final /* synthetic */ int f50466c;

    public C18248g3(C18291i3.C18292a aVar, C19623o0 o0Var, int i) {
        this.f50464a = aVar;
        this.f50465b = o0Var;
        this.f50466c = i;
    }

    public void onFinish() {
        C18291i3.C18292a aVar = this.f50464a;
        aVar.mo22879d(aVar.f50593H, this.f50465b, this.f50466c, true);
    }

    public void onStart() {
    }
}
