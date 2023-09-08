package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import com.tencent.p014mm.storage.C19623o0;
import s90.C77630j;
import wd3.C22906q;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.u3 */
public class C18367u3 implements C22906q.C22907a {

    /* renamed from: a */
    public final /* synthetic */ C18339q3 f50867a;

    /* renamed from: b */
    public final /* synthetic */ C77630j f50868b;

    /* renamed from: c */
    public final /* synthetic */ C19623o0 f50869c;

    /* renamed from: d */
    public final /* synthetic */ int f50870d;

    /* renamed from: e */
    public final /* synthetic */ C18361t3 f50871e;

    public C18367u3(C18361t3 t3Var, C18339q3 q3Var, C77630j jVar, C19623o0 o0Var, int i) {
        this.f50871e = t3Var;
        this.f50867a = q3Var;
        this.f50868b = jVar;
        this.f50869c = o0Var;
        this.f50870d = i;
    }

    public void onFinish() {
        this.f50867a.mo22908e(this.f50868b, this.f50869c, this.f50870d, true);
        this.f50867a.mo22879d(this.f50868b, this.f50869c, this.f50870d, true);
        this.f50871e.f50825d.f51445p.mo23110l(this.f50869c.field_msgId, this.f50870d);
    }

    public void onStart() {
    }
}
