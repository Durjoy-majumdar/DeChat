package com.tencent.p014mm.smiley;

import android.util.SparseArray;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.smiley.b */
public abstract class C96925b implements C96976z {

    /* renamed from: a */
    public C96974x f283931a;

    /* renamed from: b */
    public final SparseArray<C96976z> f283932b;

    public C96925b(int i) {
        this.f283932b = new SparseArray<>(i);
    }

    /* renamed from: a */
    public void mo135512a(C96974x xVar, int i, C32224a<? extends C96976z> aVar) {
        C87412m.m108594g(xVar, "item");
        C87412m.m108594g(aVar, "nodeCreator");
        boolean z = false;
        if (i >= 0 && i < xVar.mo135527a().length) {
            z = true;
        }
        if (z) {
            int i2 = xVar.mo135527a()[i];
            Object obj = get(i2);
            if (obj == null) {
                obj = aVar.invoke();
                synchronized (this.f283932b) {
                    this.f283932b.put(i2, obj);
                    C13598b0 b0Var = C13598b0.f38549a;
                }
            }
            if (xVar.mo135527a().length - 1 > i) {
                ((C96976z) obj).mo135512a(xVar, i + 1, aVar);
            } else {
                ((C96976z) obj).mo135513b(xVar);
            }
        }
    }

    /* renamed from: b */
    public void mo135513b(C96974x xVar) {
        this.f283931a = xVar;
    }

    /* renamed from: c */
    public abstract C96925b mo135514c();

    public C96976z get(int i) {
        C96976z zVar;
        synchronized (this.f283932b) {
            zVar = this.f283932b.get(i);
        }
        return zVar;
    }

    public C96974x getData() {
        return this.f283931a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C96925b(int i, int i2, C8480h hVar) {
        this((i2 & 1) != 0 ? 1 : i);
    }
}
