package com.tencent.p014mm.storage;

import eb0.z3$$h;
import f62.C75704m0;
import g62.C75875l;
import java.util.LinkedList;
import zh3.C91753f;

/* renamed from: com.tencent.mm.storage.e */
public abstract class C72959e {

    /* renamed from: b */
    public static C75704m0 f212647b;

    /* renamed from: a */
    public C75875l f212648a;

    public C72959e(C75875l lVar) {
        this.f212648a = lVar;
    }

    /* renamed from: d */
    public static C75704m0 m85566d() {
        return f212647b;
    }

    /* renamed from: a */
    public void mo100939a(C75875l.C75878d dVar) {
        C72972g4 g4Var = (C72972g4) this.f212648a;
        synchronized (g4Var.f212769g) {
            ((LinkedList) g4Var.f212769g).add(dVar);
        }
        g4Var.Ay0(dVar);
    }

    /* renamed from: b */
    public boolean mo100922b(C72963f4 f4Var, z3$$h z3__h) {
        return true;
    }

    /* renamed from: c */
    public C91753f mo100940c() {
        return ((C72972g4) this.f212648a).f212775p;
    }

    /* renamed from: e */
    public String mo100941e(String str) {
        return ((C72972g4) this.f212648a).hy0(str);
    }

    /* renamed from: f */
    public abstract String mo100923f(String str);

    /* renamed from: g */
    public void mo100942g(C91753f fVar, String str) {
        ((C72972g4) this.f212648a).uy0(fVar, str);
    }
}
