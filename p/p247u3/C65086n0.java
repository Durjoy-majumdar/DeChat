package p247u3;

import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import p247u3.C65060g0;
import sx3.C26236u;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: u3.n0 */
public abstract class C65086n0<T> {

    /* renamed from: u3.n0$a */
    public static final class C65087a<T> extends C65086n0<T> {

        /* renamed from: a */
        public final C65069i0 f187321a;

        /* renamed from: b */
        public final int f187322b;

        /* renamed from: c */
        public final int f187323c;

        /* renamed from: d */
        public final int f187324d;

        public C65087a(C65069i0 i0Var, int i, int i2, int i3) {
            C87412m.m108594g(i0Var, "loadType");
            this.f187321a = i0Var;
            this.f187322b = i;
            this.f187323c = i2;
            this.f187324d = i3;
            boolean z = true;
            if (i0Var != C65069i0.REFRESH) {
                if (mo89283b() > 0) {
                    if (!(i3 < 0 ? false : z)) {
                        throw new IllegalArgumentException(("Invalid placeholdersRemaining " + i3).toString());
                    }
                    return;
                }
                throw new IllegalArgumentException(("Drop count must be > 0, but was " + mo89283b()).toString());
            }
            throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND".toString());
        }

        /* renamed from: b */
        public final int mo89283b() {
            return (this.f187323c - this.f187322b) + 1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C65087a)) {
                return false;
            }
            C65087a aVar = (C65087a) obj;
            return C87412m.m108589b(this.f187321a, aVar.f187321a) && this.f187322b == aVar.f187322b && this.f187323c == aVar.f187323c && this.f187324d == aVar.f187324d;
        }

        public int hashCode() {
            C65069i0 i0Var = this.f187321a;
            return ((((((i0Var != null ? i0Var.hashCode() : 0) * 31) + this.f187322b) * 31) + this.f187323c) * 31) + this.f187324d;
        }

        public String toString() {
            return "Drop(loadType=" + this.f187321a + ", minPageOffset=" + this.f187322b + ", maxPageOffset=" + this.f187323c + ", placeholdersRemaining=" + this.f187324d + ")";
        }
    }

    /* renamed from: u3.n0$b */
    public static final class C65088b<T> extends C65086n0<T> {

        /* renamed from: f */
        public static final C65088b<Object> f187325f;

        /* renamed from: g */
        public static final C65089a f187326g;

        /* renamed from: a */
        public final C65069i0 f187327a;

        /* renamed from: b */
        public final List<C65048d2<T>> f187328b;

        /* renamed from: c */
        public final int f187329c;

        /* renamed from: d */
        public final int f187330d;

        /* renamed from: e */
        public final C65079m f187331e;

        /* renamed from: u3.n0$b$a */
        public static final class C65089a {
            public C65089a(C8480h hVar) {
            }

            /* renamed from: a */
            public final <T> C65088b<T> mo89290a(List<C65048d2<T>> list, int i, int i2, C65079m mVar) {
                C87412m.m108594g(list, "pages");
                C87412m.m108594g(mVar, "combinedLoadStates");
                return new C65088b(C65069i0.REFRESH, list, i, i2, mVar);
            }
        }

        @C91590f(mo125468c = "androidx.paging.PageEvent$Insert", mo125469f = "PageEvent.kt", mo125470l = {104}, mo125471m = "filter")
        /* renamed from: u3.n0$b$b */
        public static final class C65090b extends C66704d {

            /* renamed from: d */
            public /* synthetic */ Object f187332d;

            /* renamed from: e */
            public int f187333e;

            /* renamed from: f */
            public final /* synthetic */ C65088b f187334f;

            /* renamed from: g */
            public Object f187335g;

            /* renamed from: h */
            public Object f187336h;

            /* renamed from: i */
            public Object f187337i;

            /* renamed from: j */
            public Object f187338j;

            /* renamed from: n */
            public Object f187339n;

            /* renamed from: o */
            public Object f187340o;

            /* renamed from: p */
            public Object f187341p;

            /* renamed from: q */
            public Object f187342q;

            /* renamed from: r */
            public Object f187343r;

            /* renamed from: s */
            public Object f187344s;

            /* renamed from: t */
            public Object f187345t;

            /* renamed from: u */
            public int f187346u;

            /* renamed from: v */
            public int f187347v;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C65090b(C65088b bVar, C15601d dVar) {
                super(dVar);
                this.f187334f = bVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f187332d = obj;
                this.f187333e |= Integer.MIN_VALUE;
                return this.f187334f.mo89282a((C32227p) null, this);
            }
        }

        static {
            C65089a aVar = new C65089a((C8480h) null);
            f187326g = aVar;
            C65048d2<Object> d2Var = C65048d2.f187231e;
            List<Object> b = C26236u.m33719b(C65048d2.f187231e);
            C65060g0.C65063c cVar = C65060g0.C65063c.f187265c;
            C65060g0.C65063c cVar2 = C65060g0.C65063c.f187264b;
            f187325f = aVar.mo89290a(b, 0, 0, new C65079m(cVar, cVar2, cVar2, new C65066h0(cVar, cVar2, cVar2), (C65066h0) null, 16, (C8480h) null));
        }

        public C65088b(C65069i0 i0Var, List<C65048d2<T>> list, int i, int i2, C65079m mVar) {
            this.f187327a = i0Var;
            this.f187328b = list;
            this.f187329c = i;
            this.f187330d = i2;
            this.f187331e = mVar;
            boolean z = false;
            if (i0Var == C65069i0.APPEND || i >= 0) {
                if (i0Var == C65069i0.PREPEND || i2 >= 0) {
                    if (!((i0Var != C65069i0.REFRESH || (list.isEmpty() ^ true)) ? true : z)) {
                        throw new IllegalArgumentException("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.".toString());
                    }
                    return;
                }
                throw new IllegalArgumentException(("Append insert defining placeholdersAfter must be > 0, but was" + ' ' + i2).toString());
            }
            throw new IllegalArgumentException(("Prepend insert defining placeholdersBefore must be > 0, but was" + ' ' + i).toString());
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0067  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x008b  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x00b0  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x00b8  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00f6  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object mo89282a(fy3.C32227p<? super T, ? super wx3.C15601d<? super java.lang.Boolean>, ? extends java.lang.Object> r18, wx3.C15601d<? super p247u3.C65086n0<T>> r19) {
            /*
                r17 = this;
                r0 = r17
                r1 = r19
                boolean r2 = r1 instanceof p247u3.C65086n0.C65088b.C65090b
                if (r2 == 0) goto L_0x0017
                r2 = r1
                u3.n0$b$b r2 = (p247u3.C65086n0.C65088b.C65090b) r2
                int r3 = r2.f187333e
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                r5 = r3 & r4
                if (r5 == 0) goto L_0x0017
                int r3 = r3 - r4
                r2.f187333e = r3
                goto L_0x001c
            L_0x0017:
                u3.n0$b$b r2 = new u3.n0$b$b
                r2.<init>(r0, r1)
            L_0x001c:
                java.lang.Object r1 = r2.f187332d
                xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
                int r4 = r2.f187333e
                r5 = 1
                if (r4 == 0) goto L_0x0067
                if (r4 != r5) goto L_0x005f
                int r4 = r2.f187347v
                int r6 = r2.f187346u
                java.lang.Object r7 = r2.f187345t
                java.util.Collection r7 = (java.util.Collection) r7
                java.lang.Object r8 = r2.f187344s
                java.lang.Object r9 = r2.f187343r
                java.util.Iterator r9 = (java.util.Iterator) r9
                java.lang.Object r10 = r2.f187342q
                java.util.List r10 = (java.util.List) r10
                java.lang.Object r11 = r2.f187341p
                java.util.List r11 = (java.util.List) r11
                java.lang.Object r12 = r2.f187340o
                u3.d2 r12 = (p247u3.C65048d2) r12
                java.lang.Object r13 = r2.f187339n
                java.util.Iterator r13 = (java.util.Iterator) r13
                java.lang.Object r14 = r2.f187338j
                java.util.Collection r14 = (java.util.Collection) r14
                java.lang.Object r15 = r2.f187337i
                u3.i0 r15 = (p247u3.C65069i0) r15
                java.lang.Object r5 = r2.f187336h
                u3.n0$b r5 = (p247u3.C65086n0.C65088b) r5
                r16 = r3
                java.lang.Object r3 = r2.f187335g
                fy3.p r3 = (fy3.C32227p) r3
                kotlin.ResultKt.throwOnFailure(r1)
                r0 = r6
                r6 = r5
                r5 = r14
                goto L_0x00ee
            L_0x005f:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0067:
                r16 = r3
                kotlin.ResultKt.throwOnFailure(r1)
                u3.i0 r1 = r0.f187327a
                java.util.List<u3.d2<T>> r3 = r0.f187328b
                java.util.ArrayList r4 = new java.util.ArrayList
                r5 = 10
                int r5 = sx3.C36907w.m41090l(r3, r5)
                r4.<init>(r5)
                java.util.Iterator r3 = r3.iterator()
                r6 = r0
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r18
            L_0x0085:
                boolean r7 = r4.hasNext()
                if (r7 == 0) goto L_0x0131
                java.lang.Object r7 = r4.next()
                u3.d2 r7 = (p247u3.C65048d2) r7
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                java.util.List<T> r10 = r7.f187233b
                r11 = 0
                java.util.Iterator r10 = r10.iterator()
                r12 = r7
                r11 = r9
                r9 = r10
                r13 = r16
                r7 = r5
                r10 = r8
                r8 = 0
            L_0x00aa:
                boolean r14 = r9.hasNext()
                if (r14 == 0) goto L_0x011f
                java.lang.Object r14 = r9.next()
                int r15 = r8 + 1
                if (r8 < 0) goto L_0x011a
                java.lang.Integer r0 = new java.lang.Integer
                r0.<init>(r8)
                int r0 = r0.intValue()
                r2.f187335g = r1
                r2.f187336h = r6
                r2.f187337i = r3
                r2.f187338j = r5
                r2.f187339n = r4
                r2.f187340o = r12
                r2.f187341p = r11
                r2.f187342q = r10
                r2.f187343r = r9
                r2.f187344s = r14
                r2.f187345t = r7
                r2.f187346u = r15
                r2.f187347v = r0
                r8 = 1
                r2.f187333e = r8
                java.lang.Object r8 = r1.invoke(r14, r2)
                if (r8 != r13) goto L_0x00e5
                return r13
            L_0x00e5:
                r16 = r13
                r13 = r4
                r4 = r0
                r0 = r15
                r15 = r3
                r3 = r1
                r1 = r8
                r8 = r14
            L_0x00ee:
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L_0x0111
                r10.add(r8)
                java.util.List<java.lang.Integer> r1 = r12.f187235d
                if (r1 == 0) goto L_0x0109
                java.lang.Object r1 = r1.get(r4)
                java.lang.Integer r1 = (java.lang.Integer) r1
                if (r1 == 0) goto L_0x0109
                int r4 = r1.intValue()
            L_0x0109:
                java.lang.Integer r1 = new java.lang.Integer
                r1.<init>(r4)
                r11.add(r1)
            L_0x0111:
                r8 = r0
                r1 = r3
                r4 = r13
                r3 = r15
                r13 = r16
                r0 = r17
                goto L_0x00aa
            L_0x011a:
                sx3.C64197v.m75542k()
                r0 = 0
                throw r0
            L_0x011f:
                u3.d2 r0 = new u3.d2
                int[] r8 = r12.f187232a
                int r9 = r12.f187234c
                r0.<init>(r8, r10, r9, r11)
                r7.add(r0)
                r0 = r17
                r16 = r13
                goto L_0x0085
            L_0x0131:
                r4 = r5
                java.util.List r4 = (java.util.List) r4
                int r5 = r6.f187329c
                int r0 = r6.f187330d
                u3.m r7 = r6.f187331e
                u3.n0$b r1 = new u3.n0$b
                r2 = r1
                r6 = r0
                r2.<init>(r3, r4, r5, r6, r7)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p247u3.C65086n0.C65088b.mo89282a(fy3.p, wx3.d):java.lang.Object");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C65088b)) {
                return false;
            }
            C65088b bVar = (C65088b) obj;
            return C87412m.m108589b(this.f187327a, bVar.f187327a) && C87412m.m108589b(this.f187328b, bVar.f187328b) && this.f187329c == bVar.f187329c && this.f187330d == bVar.f187330d && C87412m.m108589b(this.f187331e, bVar.f187331e);
        }

        public int hashCode() {
            C65069i0 i0Var = this.f187327a;
            int i = 0;
            int hashCode = (i0Var != null ? i0Var.hashCode() : 0) * 31;
            List<C65048d2<T>> list = this.f187328b;
            int hashCode2 = (((((hashCode + (list != null ? list.hashCode() : 0)) * 31) + this.f187329c) * 31) + this.f187330d) * 31;
            C65079m mVar = this.f187331e;
            if (mVar != null) {
                i = mVar.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            return "Insert(loadType=" + this.f187327a + ", pages=" + this.f187328b + ", placeholdersBefore=" + this.f187329c + ", placeholdersAfter=" + this.f187330d + ", combinedLoadStates=" + this.f187331e + ")";
        }
    }

    /* renamed from: u3.n0$c */
    public static final class C65091c<T> extends C65086n0<T> {

        /* renamed from: d */
        public static final C65092a f187348d = new C65092a((C8480h) null);

        /* renamed from: a */
        public final C65069i0 f187349a;

        /* renamed from: b */
        public final boolean f187350b;

        /* renamed from: c */
        public final C65060g0 f187351c;

        /* renamed from: u3.n0$c$a */
        public static final class C65092a {
            public C65092a(C8480h hVar) {
            }

            /* renamed from: a */
            public final boolean mo89294a(C65060g0 g0Var, boolean z) {
                C87412m.m108594g(g0Var, "loadState");
                return (g0Var instanceof C65060g0.C65062b) || (g0Var instanceof C65060g0.C65061a) || z;
            }
        }

        public C65091c(C65069i0 i0Var, boolean z, C65060g0 g0Var) {
            C87412m.m108594g(i0Var, "loadType");
            C87412m.m108594g(g0Var, "loadState");
            this.f187349a = i0Var;
            this.f187350b = z;
            this.f187351c = g0Var;
            if (!(i0Var != C65069i0.REFRESH || z || !(g0Var instanceof C65060g0.C65063c) || !g0Var.f187261a)) {
                throw new IllegalArgumentException("LoadStateUpdate for local REFRESH may not set endOfPaginationReached = true".toString());
            } else if (!f187348d.mo89294a(g0Var, z)) {
                throw new IllegalArgumentException("LoadStateUpdates cannot be used to dispatch NotLoading unless it is from remote mediator and remote mediator reached end of pagination.".toString());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C65091c)) {
                return false;
            }
            C65091c cVar = (C65091c) obj;
            return C87412m.m108589b(this.f187349a, cVar.f187349a) && this.f187350b == cVar.f187350b && C87412m.m108589b(this.f187351c, cVar.f187351c);
        }

        public int hashCode() {
            C65069i0 i0Var = this.f187349a;
            int i = 0;
            int hashCode = (i0Var != null ? i0Var.hashCode() : 0) * 31;
            boolean z = this.f187350b;
            if (z) {
                z = true;
            }
            int i2 = (hashCode + (z ? 1 : 0)) * 31;
            C65060g0 g0Var = this.f187351c;
            if (g0Var != null) {
                i = g0Var.hashCode();
            }
            return i2 + i;
        }

        public String toString() {
            return "LoadStateUpdate(loadType=" + this.f187349a + ", fromMediator=" + this.f187350b + ", loadState=" + this.f187351c + ")";
        }
    }

    /* renamed from: a */
    public Object mo89282a(C32227p<? super T, ? super C15601d<? super Boolean>, ? extends Object> pVar, C15601d<? super C65086n0<T>> dVar) {
        return this;
    }
}
