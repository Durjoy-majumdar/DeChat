package a14;

import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Result;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C66447b;

/* renamed from: a14.c */
public final class C53862c<T> {

    /* renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f151103b = AtomicIntegerFieldUpdater.newUpdater(C53862c.class, "notCompletedCount");

    /* renamed from: a */
    public final C53953u0<T>[] f151104a;
    public volatile /* synthetic */ int notCompletedCount;

    /* renamed from: a14.c$a */
    public final class C53863a extends C53879e2 {
        private volatile /* synthetic */ Object _disposer = null;

        /* renamed from: h */
        public final C53916l<List<? extends T>> f151105h;

        /* renamed from: i */
        public C53883f1 f151106i;

        public C53863a(C53916l<? super List<? extends T>> lVar) {
            this.f151105h = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74474t((Throwable) obj);
            return C13598b0.f38549a;
        }

        /* renamed from: t */
        public void mo74474t(Throwable th) {
            if (th != null) {
                Object V = this.f151105h.mo74595V(th);
                if (V != null) {
                    this.f151105h.mo74592K(V);
                    C53864b bVar = (C53864b) this._disposer;
                    if (bVar != null) {
                        bVar.mo74491b();
                        return;
                    }
                    return;
                }
                return;
            }
            if (C53862c.f151103b.decrementAndGet(C53862c.this) == 0) {
                C53916l<List<? extends T>> lVar = this.f151105h;
                C53953u0<T>[] u0VarArr = C53862c.this.f151104a;
                ArrayList arrayList = new ArrayList(u0VarArr.length);
                for (C53953u0<T> i : u0VarArr) {
                    arrayList.add(i.mo74635i());
                }
                lVar.resumeWith(Result.m168114constructorimpl(arrayList));
            }
        }

        /* renamed from: v */
        public final void mo74489v(C53862c<T>.b bVar) {
            this._disposer = bVar;
        }
    }

    /* renamed from: a14.c$b */
    public final class C53864b extends C53904j {

        /* renamed from: d */
        public final C53862c<T>.a[] f151108d;

        public C53864b(C53862c cVar, C53862c<T>.a[] aVarArr) {
            this.f151108d = aVarArr;
        }

        /* renamed from: a */
        public void mo74490a(Throwable th) {
            mo74491b();
        }

        /* renamed from: b */
        public final void mo74491b() {
            C53862c<T>.a[] aVarArr = this.f151108d;
            int length = aVarArr.length;
            int i = 0;
            while (i < length) {
                C53883f1 f1Var = aVarArr[i].f151106i;
                if (f1Var != null) {
                    f1Var.dispose();
                    i++;
                } else {
                    C87412m.m108603p("handle");
                    throw null;
                }
            }
        }

        public Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            mo74491b();
            return C13598b0.f38549a;
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f151108d + ']';
        }
    }

    public C53862c(C53953u0<? extends T>[] u0VarArr) {
        this.f151104a = u0VarArr;
        this.notCompletedCount = u0VarArr.length;
    }

    /* renamed from: a */
    public final Object mo74488a(C15601d<? super List<? extends T>> dVar) {
        C53921m mVar = new C53921m(C66447b.m78392b(dVar), 1);
        mVar.mo74609p();
        int length = this.f151104a.length;
        C53863a[] aVarArr = new C53863a[length];
        for (int i = 0; i < length; i++) {
            C53953u0<T> u0Var = this.f151104a[i];
            u0Var.start();
            C53863a aVar = new C53863a(mVar);
            aVar.f151106i = u0Var.mo74515E(aVar);
            C13598b0 b0Var = C13598b0.f38549a;
            aVarArr[i] = aVar;
        }
        C53864b bVar = new C53864b(this, aVarArr);
        for (int i2 = 0; i2 < length; i2++) {
            aVarArr[i2].mo74489v(bVar);
        }
        if (mVar.mo74598c()) {
            bVar.mo74491b();
        } else {
            mVar.mo74599v(bVar);
        }
        return mVar.mo74608o();
    }
}
