package com.tencent.p014mm.plugin.finder.feed.model;

import gy3.C87412m;
import tf1.C13891a;

/* renamed from: com.tencent.mm.plugin.finder.feed.model.e */
public final class C55760e {

    /* renamed from: a */
    public final C55777s0 f158760a = new C55780v0(30);

    /* renamed from: a */
    public final void mo77360a(C13891a aVar) {
        C87412m.m108594g(aVar, "adCache");
        C55780v0 v0Var = (C55780v0) this.f158760a;
        synchronized (v0Var) {
            v0Var.f158816a.put(Long.valueOf(aVar.mo13365id()), aVar);
        }
    }

    /* renamed from: b */
    public final boolean mo77361b(long j) {
        boolean check;
        C55780v0 v0Var = (C55780v0) this.f158760a;
        synchronized (v0Var) {
            check = v0Var.f158816a.check(Long.valueOf(j));
        }
        return check;
    }

    /* renamed from: c */
    public final C13891a mo77362c(long j) {
        C55779u0 u0Var;
        C55780v0 v0Var = (C55780v0) this.f158760a;
        synchronized (v0Var) {
            u0Var = v0Var.f158816a.get(Long.valueOf(j));
            if (u0Var != null) {
                if (!u0Var.isValid()) {
                    C55779u0 remove = v0Var.f158816a.remove(Long.valueOf(j));
                }
            }
            u0Var = null;
        }
        if (u0Var instanceof C13891a) {
            return (C13891a) u0Var;
        }
        return null;
    }

    /* renamed from: d */
    public final void mo77363d(long j) {
        C55780v0 v0Var = (C55780v0) this.f158760a;
        synchronized (v0Var) {
            v0Var.f158816a.remove(Long.valueOf(j));
        }
    }
}
