package com.tencent.p014mm.storage;

import hp3.C87581a;
import java.util.List;

/* renamed from: com.tencent.mm.storage.t0 */
public class C19631t0 implements C87581a<Void, Void> {

    /* renamed from: a */
    public final /* synthetic */ List f55615a;

    /* renamed from: b */
    public final /* synthetic */ C19625p0 f55616b;

    public C19631t0(C19625p0 p0Var, List list) {
        this.f55616b = p0Var;
        this.f55615a = list;
    }

    public Object call(Object obj) {
        Void voidR = (Void) obj;
        p0$$f p0__f = new p0$$f();
        p0__f.f55562a = p0$$g.UPDATE;
        p0__f.f55565d = this.f55615a;
        this.f55616b.mo25805jo(p0__f);
        return null;
    }
}
