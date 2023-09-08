package com.tencent.p014mm.vfs;

import fy3.C32227p;
import gy3.C87412m;
import qp3.C118204f;

/* renamed from: com.tencent.mm.vfs.f1 */
public final class C116290f1 implements C118204f.C118205a<C86001b0, C97318g1> {

    /* renamed from: d */
    public final int f348995d;

    /* renamed from: e */
    public final String f348996e;

    /* renamed from: f */
    public final C32227p<C86001b0, Integer, Integer> f348997f;

    public C116290f1(int i, String str, C32227p<? super C86001b0, ? super Integer, Integer> pVar) {
        C87412m.m108594g(str, "fsName");
        this.f348995d = i;
        this.f348996e = str;
        this.f348997f = pVar;
    }

    /* renamed from: f */
    public Object mo105957f(Object obj) {
        C86001b0 b0Var = (C86001b0) obj;
        if (b0Var == null) {
            return null;
        }
        C32227p<C86001b0, Integer, Integer> pVar = this.f348997f;
        return new C97318g1(pVar != null ? pVar.invoke(b0Var, Integer.valueOf(this.f348995d)).intValue() : this.f348995d, this.f348996e, b0Var);
    }
}
