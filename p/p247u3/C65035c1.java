package p247u3;

import a14.C0000n0;
import a14.C53896h0;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import sx3.C64175a0;

/* renamed from: u3.c1 */
public abstract class C65035c1<T> extends AbstractList<T> {

    /* renamed from: j */
    public static final /* synthetic */ int f187202j = 0;

    /* renamed from: d */
    public final List<WeakReference<C65037b>> f187203d = new ArrayList();

    /* renamed from: e */
    public final C65145q1<?, T> f187204e;

    /* renamed from: f */
    public final C0000n0 f187205f;

    /* renamed from: g */
    public final C53896h0 f187206g;

    /* renamed from: h */
    public final C65067h1<T> f187207h;

    /* renamed from: i */
    public final C65038c f187208i;

    /* renamed from: u3.c1$a */
    public static abstract class C65036a<T> {
        /* renamed from: a */
        public abstract void mo79080a(T t);

        /* renamed from: b */
        public abstract void mo79081b(T t);

        /* renamed from: c */
        public abstract void mo79082c();
    }

    /* renamed from: u3.c1$b */
    public static abstract class C65037b {
        /* renamed from: a */
        public abstract void mo89227a(int i, int i2);

        /* renamed from: b */
        public abstract void mo89228b(int i, int i2);

        /* renamed from: c */
        public abstract void mo89229c(int i, int i2);
    }

    /* renamed from: u3.c1$c */
    public static final class C65038c {

        /* renamed from: a */
        public final int f187209a;

        /* renamed from: b */
        public final int f187210b;

        /* renamed from: c */
        public final boolean f187211c;

        /* renamed from: d */
        public final int f187212d;

        /* renamed from: e */
        public final int f187213e;

        /* renamed from: u3.c1$c$a */
        public static final class C65039a {

            /* renamed from: a */
            public int f187214a = -1;

            /* renamed from: b */
            public int f187215b = -1;

            /* renamed from: c */
            public int f187216c = Integer.MAX_VALUE;
        }

        public C65038c(int i, int i2, boolean z, int i3, int i4) {
            this.f187209a = i;
            this.f187210b = i2;
            this.f187211c = z;
            this.f187212d = i3;
            this.f187213e = i4;
        }
    }

    /* renamed from: u3.c1$d */
    public static abstract class C65040d {
    }

    public C65035c1(C65145q1<?, T> q1Var, C0000n0 n0Var, C53896h0 h0Var, C65067h1<T> h1Var, C65038c cVar) {
        C87412m.m108594g(q1Var, "pagingSource");
        C87412m.m108594g(n0Var, "coroutineScope");
        C87412m.m108594g(h0Var, "notifyDispatcher");
        C87412m.m108594g(h1Var, "storage");
        C87412m.m108594g(cVar, "config");
        this.f187204e = q1Var;
        this.f187205f = n0Var;
        this.f187206g = h0Var;
        this.f187207h = h1Var;
        this.f187208i = cVar;
        new ArrayList();
    }

    public T get(int i) {
        return this.f187207h.get(i);
    }

    /* renamed from: h */
    public final void mo89235h(List<? extends T> list, C65037b bVar) {
        C87412m.m108594g(bVar, "callback");
        if (!(list == null || list == this)) {
            int size = size();
            int size2 = list.size();
            if (size2 < size) {
                if (size2 > 0) {
                    bVar.mo89227a(0, size2);
                }
                int i = size - size2;
                if (i > 0) {
                    bVar.mo89228b(size2, i);
                }
            } else {
                if (size > 0) {
                    bVar.mo89227a(0, size);
                }
                int i2 = size2 - size;
                if (i2 != 0) {
                    bVar.mo89229c(size, i2);
                }
            }
        }
        C64175a0.m75512t(this.f187203d, C14112e1.f39511d);
        ((ArrayList) this.f187203d).add(new WeakReference(bVar));
    }

    /* renamed from: i */
    public abstract Object mo89236i();

    /* renamed from: k */
    public C65145q1<?, T> mo89237k() {
        return this.f187204e;
    }

    /* renamed from: l */
    public abstract boolean mo89238l();

    /* renamed from: m */
    public boolean mo89239m() {
        return mo89238l();
    }

    public final /* bridge */ T remove(int i) {
        return super.remove(i);
    }

    public final int size() {
        return this.f187207h.size();
    }
}
