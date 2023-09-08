package p241t0;

import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p410k0.C108792d;
import p410k0.C108793e;
import p410k0.C60926c;
import rx3.C13598b0;

/* renamed from: t0.z */
public final class C110879z {

    /* renamed from: a */
    public final C32226l<C32224a<C13598b0>, C13598b0> f331672a;

    /* renamed from: b */
    public final C32227p<Set<? extends Object>, C110849h, C13598b0> f331673b = new C110881b(this);

    /* renamed from: c */
    public final C32226l<Object, C13598b0> f331674c = new C110882c(this);

    /* renamed from: d */
    public final C108793e<C110880a<?>> f331675d = new C108793e<>(new C110880a[16], 0);

    /* renamed from: e */
    public C64198e f331676e;

    /* renamed from: f */
    public boolean f331677f;

    /* renamed from: g */
    public C110880a<?> f331678g;

    /* renamed from: t0.z$a */
    public static final class C110880a<T> {

        /* renamed from: a */
        public final C32226l<T, C13598b0> f331679a;

        /* renamed from: b */
        public final C108792d<T> f331680b = new C108792d<>();

        /* renamed from: c */
        public final HashSet<Object> f331681c = new HashSet<>();

        /* renamed from: d */
        public T f331682d;

        public C110880a(C32226l<? super T, C13598b0> lVar) {
            C87412m.m108594g(lVar, "onChanged");
            this.f331679a = lVar;
        }
    }

    /* renamed from: t0.z$b */
    public static final class C110881b extends C87413o implements C32227p<Set<? extends Object>, C110849h, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C110879z f331683d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110881b(C110879z zVar) {
            super(2);
            this.f331683d = zVar;
        }

        public Object invoke(Object obj, Object obj2) {
            int i;
            Set<Object> set = (Set) obj;
            C87412m.m108594g(set, "applied");
            C87412m.m108594g((C110849h) obj2, "<anonymous parameter 1>");
            C110879z zVar = this.f331683d;
            synchronized (zVar.f331675d) {
                C108793e<C110880a<?>> eVar = zVar.f331675d;
                int i2 = eVar.f325786f;
                i = 0;
                if (i2 > 0) {
                    T[] tArr = eVar.f325784d;
                    int i3 = 0;
                    do {
                        C110880a aVar = (C110880a) tArr[i];
                        HashSet<Object> hashSet = aVar.f331681c;
                        C108792d<T> dVar = aVar.f331680b;
                        for (Object b : set) {
                            int b2 = dVar.mo159856b(b);
                            if (b2 >= 0) {
                                Iterator<T> it = dVar.mo159858d(b2).iterator();
                                while (true) {
                                    C60926c.C60927a aVar2 = (C60926c.C60927a) it;
                                    if (!aVar2.hasNext()) {
                                        break;
                                    }
                                    hashSet.add(aVar2.next());
                                    i3 = 1;
                                }
                            }
                        }
                        i++;
                    } while (i < i2);
                    i = i3;
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
            if (i != 0) {
                C110879z zVar2 = this.f331683d;
                zVar2.f331672a.invoke(new C110837a0(zVar2));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: t0.z$c */
    public static final class C110882c extends C87413o implements C32226l<Object, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C110879z f331684d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110882c(C110879z zVar) {
            super(1);
            this.f331684d = zVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g(obj, "state");
            C110879z zVar = this.f331684d;
            if (!zVar.f331677f) {
                synchronized (zVar.f331675d) {
                    C110880a<?> aVar = zVar.f331678g;
                    C87412m.m108591d(aVar);
                    C108792d<T> dVar = aVar.f331680b;
                    T t = aVar.f331682d;
                    C87412m.m108591d(t);
                    dVar.mo159855a(obj, t);
                    C13598b0 b0Var = C13598b0.f38549a;
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C110879z(C32226l<? super C32224a<C13598b0>, C13598b0> lVar) {
        C87412m.m108594g(lVar, "onChangedExecutor");
        this.f331672a = lVar;
    }

    /* renamed from: a */
    public final void mo162584a() {
        synchronized (this.f331675d) {
            C108793e<C110880a<?>> eVar = this.f331675d;
            int i = eVar.f325786f;
            if (i > 0) {
                T[] tArr = eVar.f325784d;
                int i2 = 0;
                do {
                    C108792d<T> dVar = ((C110880a) tArr[i2]).f331680b;
                    int length = dVar.f325782c.length;
                    for (int i3 = 0; i3 < length; i3++) {
                        C60926c<T> cVar = dVar.f325782c[i3];
                        if (cVar != null) {
                            cVar.clear();
                        }
                        dVar.f325780a[i3] = i3;
                        dVar.f325781b[i3] = null;
                    }
                    dVar.f325783d = 0;
                    i2++;
                } while (i2 < i);
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: b */
    public final <T> void mo162585b(T t, C32226l<? super T, C13598b0> lVar, C32224a<C13598b0> aVar) {
        int i;
        C110880a<?> aVar2;
        boolean z;
        T t2 = t;
        C32226l<? super T, C13598b0> lVar2 = lVar;
        C32224a<C13598b0> aVar3 = aVar;
        C87412m.m108594g(t2, "scope");
        C87412m.m108594g(lVar2, "onValueChangedForScope");
        C87412m.m108594g(aVar3, "block");
        C110880a<?> aVar4 = this.f331678g;
        boolean z2 = this.f331677f;
        synchronized (this.f331675d) {
            try {
                C108793e<C110880a<?>> eVar = this.f331675d;
                int i2 = eVar.f325786f;
                if (i2 > 0) {
                    T[] tArr = eVar.f325784d;
                    i = 0;
                    while (true) {
                        if (!(((C110880a) tArr[i]).f331679a == lVar2)) {
                            i++;
                            if (i >= i2) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i = -1;
                } else {
                    i = -1;
                }
                if (i == -1) {
                    aVar2 = new C110880a<>(lVar2);
                    this.f331675d.mo159860b(aVar2);
                } else {
                    aVar2 = (C110880a) this.f331675d.f325784d[i];
                }
            } finally {
            }
        }
        T t3 = aVar2.f331682d;
        aVar2.f331682d = t2;
        this.f331678g = aVar2;
        this.f331677f = false;
        synchronized (this.f331675d) {
            try {
                C108792d<T> dVar = aVar2.f331680b;
                int i3 = dVar.f325783d;
                int i4 = 0;
                int i5 = 0;
                while (i4 < i3) {
                    int i6 = dVar.f325780a[i4];
                    C60926c<T> cVar = dVar.f325782c[i6];
                    C87412m.m108591d(cVar);
                    int i7 = cVar.f173545d;
                    int i8 = i3;
                    int i9 = 0;
                    int i15 = 0;
                    while (i15 < i7) {
                        int i16 = i7;
                        T[] tArr2 = cVar.f173546e;
                        boolean z3 = z2;
                        T t4 = tArr2[i15];
                        if (t4 != null) {
                            if (!(t4 == t2)) {
                                if (i9 != i15) {
                                    tArr2[i9] = t4;
                                }
                                i9++;
                            }
                            i15++;
                            i7 = i16;
                            z2 = z3;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        }
                    }
                    boolean z4 = z2;
                    int i17 = cVar.f173545d;
                    for (int i18 = i9; i18 < i17; i18++) {
                        cVar.f173546e[i18] = null;
                    }
                    cVar.f173545d = i9;
                    if (i9 > 0) {
                        if (i5 != i4) {
                            int[] iArr = dVar.f325780a;
                            int i19 = iArr[i5];
                            iArr[i5] = i6;
                            iArr[i4] = i19;
                        }
                        i5++;
                    }
                    i4++;
                    i3 = i8;
                    z2 = z4;
                }
                z = z2;
                int i25 = dVar.f325783d;
                for (int i26 = i5; i26 < i25; i26++) {
                    dVar.f325781b[dVar.f325780a[i26]] = null;
                }
                dVar.f325783d = i5;
                C13598b0 b0Var = C13598b0.f38549a;
            } catch (Throwable th) {
                throw th;
            }
        }
        C110849h.f331612e.mo162469a(this.f331674c, (C32226l<Object, C13598b0>) null, aVar3);
        this.f331678g = aVar4;
        aVar2.f331682d = t3;
        this.f331677f = z;
    }

    /* renamed from: c */
    public final void mo162586c() {
        C32227p<Set<? extends Object>, C110849h, C13598b0> pVar = this.f331673b;
        C87412m.m108594g(pVar, "observer");
        C110865n.m151143f(C110865n.f331649a);
        synchronized (C110865n.f331651c) {
            ((ArrayList) C110865n.f331655g).add(pVar);
        }
        this.f331676e = new C64199g(pVar);
    }
}
