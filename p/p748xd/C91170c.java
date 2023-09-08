package p748xd;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import p416qd.C89598h;
import rx3.C13598b0;

/* renamed from: xd.c */
public final class C91170c<T> {

    /* renamed from: a */
    public final List<T> f261403a = new ArrayList();

    /* renamed from: xd.c$a */
    public static final class C91171a extends C87413o implements C32226l<T, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32226l<T, C13598b0> f261404d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C91171a(C32226l<? super T, C13598b0> lVar) {
            super(1);
            this.f261404d = lVar;
        }

        public Object invoke(Object obj) {
            try {
                this.f261404d.invoke(obj);
            } catch (Exception e) {
                C89598h.m112046c("MagicBrush", e, "dispatch failed", new Object[0]);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public final void mo125229a(T t) {
        synchronized (this.f261403a) {
            ((ArrayList) this.f261403a).add(t);
        }
    }

    /* renamed from: b */
    public final void mo125230b() {
        synchronized (this.f261403a) {
            ((ArrayList) this.f261403a).clear();
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: c */
    public final <R> List<R> mo125231c(C32226l<? super T, ? extends R> lVar) {
        C87412m.m108594g(lVar, "block");
        ArrayList<Object> arrayList = new ArrayList<>();
        synchronized (this.f261403a) {
            for (T add : this.f261403a) {
                arrayList.add(add);
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object invoke : arrayList) {
            arrayList2.add(lVar.invoke(invoke));
        }
        return arrayList2;
    }

    /* renamed from: d */
    public final void mo125232d(C32226l<? super T, C13598b0> lVar) {
        C87412m.m108594g(lVar, "block");
        mo125231c(new C91171a(lVar));
    }
}
