package com.tencent.mapsdk.internal;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.tencent.mapsdk.internal.ja */
public final class C113833ja extends C113831iz {

    /* renamed from: a */
    private ArrayList<C113831iz> f340608a;

    private C113833ja(ArrayList<C113831iz> arrayList) {
        this.f340608a = arrayList;
    }

    /* renamed from: a */
    public final boolean mo172218a(C113835jc jcVar) {
        if (this.f340608a.isEmpty()) {
            return true;
        }
        Iterator<C113831iz> it = this.f340608a.iterator();
        while (it.hasNext()) {
            it.next().mo172218a(jcVar);
        }
        return true;
    }
}
