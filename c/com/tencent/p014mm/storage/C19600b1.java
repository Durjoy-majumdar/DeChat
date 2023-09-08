package com.tencent.p014mm.storage;

import fy3.C32226l;
import gy3.C45983e0;
import gy3.C87413o;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import te3.C22501jg;

/* renamed from: com.tencent.mm.storage.b1 */
public final class C19600b1 extends C87413o implements C32226l<C22501jg, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ List<C19623o0> f55444d;

    /* renamed from: e */
    public final /* synthetic */ C45983e0 f55445e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19600b1(List<? extends C19623o0> list, C45983e0 e0Var) {
        super(1);
        this.f55444d = list;
        this.f55445e = e0Var;
    }

    public Object invoke(Object obj) {
        boolean z;
        C22501jg jgVar = (C22501jg) obj;
        List<C19623o0> list = this.f55444d;
        C45983e0 e0Var = this.f55445e;
        boolean z2 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C19623o0 o0Var = (C19623o0) it.next();
                if (o0Var.field_msgId != jgVar.f64019u || o0Var.mo25767q2() == e0Var.f124000d) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    z2 = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z2);
    }
}
