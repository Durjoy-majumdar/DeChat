package p175j0;

import com.tencent.p014mm.plugin.appbrand.AppBrandFileCleaner;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p241t0.C110849h;
import p241t0.C110851h0;
import p241t0.C110856i0;
import p241t0.C110865n;
import p603m0.C109451j;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C64187h0;

/* renamed from: j0.a0 */
public final class C108491a0<T> implements C110851h0, C24660b0<T> {

    /* renamed from: d */
    public final C32224a<T> f324810d;

    /* renamed from: e */
    public C108492a<T> f324811e = new C108492a<>();

    /* renamed from: j0.a0$a */
    public static final class C108492a<T> extends C110856i0 {

        /* renamed from: f */
        public static final Object f324812f = new Object();

        /* renamed from: c */
        public HashSet<C110851h0> f324813c;

        /* renamed from: d */
        public Object f324814d = f324812f;

        /* renamed from: e */
        public int f324815e;

        /* renamed from: a */
        public void mo159361a(C110856i0 i0Var) {
            C87412m.m108594g(i0Var, "value");
            C108492a aVar = (C108492a) i0Var;
            this.f324813c = aVar.f324813c;
            this.f324814d = aVar.f324814d;
            this.f324815e = aVar.f324815e;
        }

        /* renamed from: b */
        public C110856i0 mo159362b() {
            return new C108492a();
        }

        /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: c */
        public final int mo159363c(p175j0.C24660b0<?> r8, p241t0.C110849h r9) {
            /*
                r7 = this;
                java.lang.String r0 = "derivedState"
                gy3.C87412m.m108594g(r8, r0)
                java.lang.String r0 = "snapshot"
                gy3.C87412m.m108594g(r9, r0)
                java.lang.Object r0 = p241t0.C110865n.f331651c
                monitor-enter(r0)
                java.util.HashSet<t0.h0> r1 = r7.f324813c     // Catch:{ all -> 0x008d }
                monitor-exit(r0)
                r0 = 7
                if (r1 == 0) goto L_0x008c
                j0.i2<l0.c<rx3.l<fy3.l<j0.b0<?>, rx3.b0>, fy3.l<j0.b0<?>, rx3.b0>>>> r2 = p175j0.C108503g2.f324826a
                java.lang.Object r2 = r2.mo159371a()
                l0.c r2 = (p854l0.C109072c) r2
                if (r2 != 0) goto L_0x001f
                m0.j r2 = p603m0.C109451j.f327609f
            L_0x001f:
                int r3 = r2.size()
                r4 = 0
                r5 = 0
            L_0x0025:
                if (r5 >= r3) goto L_0x0037
                java.lang.Object r6 = r2.get(r5)
                rx3.l r6 = (rx3.C13604l) r6
                A r6 = r6.f38555d
                fy3.l r6 = (fy3.C32226l) r6
                r6.invoke(r8)
                int r5 = r5 + 1
                goto L_0x0025
            L_0x0037:
                java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0074 }
            L_0x003b:
                boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0074 }
                if (r3 == 0) goto L_0x005c
                java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0074 }
                t0.h0 r3 = (p241t0.C110851h0) r3     // Catch:{ all -> 0x0074 }
                t0.i0 r5 = r3.mo159357f()     // Catch:{ all -> 0x0074 }
                t0.i0 r3 = p241t0.C110865n.m151155r(r5, r3, r9)     // Catch:{ all -> 0x0074 }
                int r0 = r0 * 31
                int r5 = java.lang.System.identityHashCode(r3)     // Catch:{ all -> 0x0074 }
                int r0 = r0 + r5
                int r0 = r0 * 31
                int r3 = r3.f331618a     // Catch:{ all -> 0x0074 }
                int r0 = r0 + r3
                goto L_0x003b
            L_0x005c:
                rx3.b0 r9 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0074 }
                int r9 = r2.size()
            L_0x0062:
                if (r4 >= r9) goto L_0x008c
                java.lang.Object r1 = r2.get(r4)
                rx3.l r1 = (rx3.C13604l) r1
                B r1 = r1.f38556e
                fy3.l r1 = (fy3.C32226l) r1
                r1.invoke(r8)
                int r4 = r4 + 1
                goto L_0x0062
            L_0x0074:
                r9 = move-exception
                int r0 = r2.size()
            L_0x0079:
                if (r4 >= r0) goto L_0x008b
                java.lang.Object r1 = r2.get(r4)
                rx3.l r1 = (rx3.C13604l) r1
                B r1 = r1.f38556e
                fy3.l r1 = (fy3.C32226l) r1
                r1.invoke(r8)
                int r4 = r4 + 1
                goto L_0x0079
            L_0x008b:
                throw r9
            L_0x008c:
                return r0
            L_0x008d:
                r8 = move-exception
                monitor-exit(r0)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p175j0.C108491a0.C108492a.mo159363c(j0.b0, t0.h):int");
        }
    }

    /* renamed from: j0.a0$b */
    public static final class C108493b extends C87413o implements C32226l<Object, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108491a0<T> f324816d;

        /* renamed from: e */
        public final /* synthetic */ HashSet<C110851h0> f324817e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108493b(C108491a0<T> a0Var, HashSet<C110851h0> hashSet) {
            super(1);
            this.f324816d = a0Var;
            this.f324817e = hashSet;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g(obj, LocaleUtil.ITALIAN);
            if (obj != this.f324816d) {
                if (obj instanceof C110851h0) {
                    this.f324817e.add(obj);
                }
                return C13598b0.f38549a;
            }
            throw new IllegalStateException("A derived state calculation cannot read itself".toString());
        }
    }

    public C108491a0(C32224a<? extends T> aVar) {
        C87412m.m108594g(aVar, "calculation");
        this.f324810d = aVar;
    }

    /* renamed from: a */
    public T mo51494a() {
        return mo159356e((C108492a) C110865n.m151145h(this.f324811e, C110865n.m151146i()), C110865n.m151146i(), this.f324810d).f324814d;
    }

    /* renamed from: b */
    public Set<C110851h0> mo51495b() {
        HashSet<C110851h0> hashSet = mo159356e((C108492a) C110865n.m151145h(this.f324811e, C110865n.m151146i()), C110865n.m151146i(), this.f324810d).f324813c;
        return hashSet != null ? hashSet : C64187h0.f181908d;
    }

    /* renamed from: e */
    public final C108492a<T> mo159356e(C108492a<T> aVar, C110849h hVar, C32224a<? extends T> aVar2) {
        C108492a<T> aVar3;
        aVar.getClass();
        C87412m.m108594g(hVar, AppBrandFileCleaner.f238098c);
        int i = 0;
        if (aVar.f324814d != C108492a.f324812f && aVar.f324815e == aVar.mo159363c(this, hVar)) {
            return aVar;
        }
        Boolean a = C108503g2.f324827b.mo159371a();
        boolean booleanValue = a != null ? a.booleanValue() : false;
        HashSet<C110851h0> hashSet = new HashSet<>();
        List a2 = C108503g2.f324826a.mo159371a();
        if (a2 == null) {
            a2 = C109451j.f327609f;
        }
        int size = a2.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C32226l) ((C13604l) a2.get(i2)).f38555d).invoke(this);
        }
        if (!booleanValue) {
            try {
                C108503g2.f324827b.mo159372b(Boolean.TRUE);
            } catch (Throwable th) {
                int size2 = a2.size();
                while (i < size2) {
                    ((C32226l) ((C13604l) a2.get(i)).f38556e).invoke(this);
                    i++;
                }
                throw th;
            }
        }
        Object a3 = C110849h.f331612e.mo162469a(new C108493b(this, hashSet), (C32226l<Object, C13598b0>) null, aVar2);
        if (!booleanValue) {
            C108503g2.f324827b.mo159372b(Boolean.FALSE);
        }
        int size3 = a2.size();
        while (i < size3) {
            ((C32226l) ((C13604l) a2.get(i)).f38556e).invoke(this);
            i++;
        }
        synchronized (C110865n.f331651c) {
            C110849h i3 = C110865n.m151146i();
            aVar3 = (C108492a) C110865n.m151149l(this.f324811e, this, i3);
            aVar3.f324813c = hashSet;
            aVar3.f324815e = aVar3.mo159363c(this, i3);
            aVar3.f324814d = a3;
        }
        if (!booleanValue) {
            C110865n.m151146i().mo162427l();
        }
        return aVar3;
    }

    /* renamed from: f */
    public C110856i0 mo159357f() {
        return this.f324811e;
    }

    public T getValue() {
        C32226l<Object, C13598b0> f = C110865n.m151146i().mo162432f();
        if (f != null) {
            f.invoke(this);
        }
        return mo51494a();
    }

    /* renamed from: i */
    public C110856i0 mo159358i(C110856i0 i0Var, C110856i0 i0Var2, C110856i0 i0Var3) {
        C110851h0.C110852a.m151097a(this, i0Var, i0Var2, i0Var3);
        return null;
    }

    /* renamed from: m */
    public void mo159359m(C110856i0 i0Var) {
        C87412m.m108594g(i0Var, "value");
        this.f324811e = (C108492a) i0Var;
    }

    public String toString() {
        C108492a aVar = (C108492a) C110865n.m151145h(this.f324811e, C110865n.m151146i());
        StringBuilder sb = new StringBuilder();
        sb.append("DerivedState(value=");
        C108492a aVar2 = (C108492a) C110865n.m151145h(this.f324811e, C110865n.m151146i());
        sb.append(aVar2.f324814d != C108492a.f324812f && aVar2.f324815e == aVar2.mo159363c(this, C110865n.m151146i()) ? String.valueOf(aVar2.f324814d) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
