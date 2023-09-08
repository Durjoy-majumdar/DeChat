package com.tencent.p014mm.plugin.vlog.model;

import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import te3.u35;
import te3.uj4;

/* renamed from: com.tencent.mm.plugin.vlog.model.c0 */
public abstract class C96533c0 {

    /* renamed from: a */
    public long f282489a;

    /* renamed from: b */
    public long f282490b;

    /* renamed from: c */
    public String f282491c;

    /* renamed from: d */
    public List<? extends u35> f282492d;

    /* renamed from: e */
    public List<? extends uj4> f282493e;

    public C96533c0(C96546j0 j0Var, C30519r rVar, C5689m0 m0Var, long j, long j2, long j3, String str, List<? extends u35> list, List<? extends uj4> list2, int i, C8480h hVar) {
        j0Var = (i & 1) != 0 ? C96546j0.CENTER_INSIDE : j0Var;
        rVar = (i & 2) != 0 ? C30519r.NO_FILTER : rVar;
        m0Var = (i & 4) != 0 ? C5689m0.NONE : m0Var;
        str = (i & 64) != 0 ? "" : str;
        list = (i & 128) != 0 ? null : list;
        list2 = (i & 256) != 0 ? null : list2;
        C87412m.m108594g(j0Var, "scaleType");
        C87412m.m108594g(rVar, "filter");
        C87412m.m108594g(m0Var, "transition");
        C87412m.m108594g(str, "path");
        this.f282489a = j;
        this.f282490b = j2;
        this.f282491c = str;
        this.f282492d = list;
        this.f282493e = list2;
    }
}
