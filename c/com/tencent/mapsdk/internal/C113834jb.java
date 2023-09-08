package com.tencent.mapsdk.internal;

import java.util.ArrayList;

/* renamed from: com.tencent.mapsdk.internal.jb */
public final class C113834jb extends C113831iz {

    /* renamed from: a */
    private ArrayList<C113831iz> f340609a;

    private C113834jb(ArrayList<C113831iz> arrayList) {
        this.f340609a = arrayList;
    }

    /* renamed from: a */
    public final boolean mo172218a(C113835jc jcVar) {
        if (this.f340609a.isEmpty()) {
            return true;
        }
        C113831iz izVar = this.f340609a.get(0);
        if (izVar.mo172218a(jcVar)) {
            this.f340609a.remove(izVar);
        }
        return this.f340609a.isEmpty();
    }
}
