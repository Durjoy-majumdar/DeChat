package p247u3;

import a14.C0000n0;
import a14.C53895h;
import d14.C45252f;
import d14.C45253g;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8477a0;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.paging.PagingDataDiffer$collectFrom$2", mo125469f = "PagingDataDiffer.kt", mo125470l = {390}, mo125471m = "invokeSuspend")
/* renamed from: u3.o1 */
public final class C65109o1 extends C91594j implements C32226l<C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f187398d;

    /* renamed from: e */
    public final /* synthetic */ C65093n1 f187399e;

    /* renamed from: f */
    public final /* synthetic */ C65081m1 f187400f;

    /* renamed from: u3.o1$a */
    public static final class C65110a implements C45253g<C65086n0<Object>> {

        /* renamed from: d */
        public final /* synthetic */ C65109o1 f187401d;

        @C91590f(mo125468c = "androidx.paging.PagingDataDiffer$collectFrom$2$1$1", mo125469f = "PagingDataDiffer.kt", mo125470l = {142, 180}, mo125471m = "invokeSuspend")
        /* renamed from: u3.o1$a$a */
        public static final class C65111a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public Object f187402d;

            /* renamed from: e */
            public Object f187403e;

            /* renamed from: f */
            public int f187404f;

            /* renamed from: g */
            public final /* synthetic */ C65086n0 f187405g;

            /* renamed from: h */
            public final /* synthetic */ C65110a f187406h;

            /* renamed from: u3.o1$a$a$a */
            public static final class C65112a extends C87413o implements C32224a<C13598b0> {

                /* renamed from: d */
                public final /* synthetic */ C65111a f187407d;

                /* renamed from: e */
                public final /* synthetic */ C65007a1 f187408e;

                /* renamed from: f */
                public final /* synthetic */ C8477a0 f187409f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C65112a(C65111a aVar, C65007a1 a1Var, C8477a0 a0Var) {
                    super(0);
                    this.f187407d = aVar;
                    this.f187408e = a1Var;
                    this.f187409f = a0Var;
                }

                public Object invoke() {
                    this.f187407d.f187406h.f187401d.f187399e.f187352a = this.f187408e;
                    this.f187409f.f27482d = true;
                    return C13598b0.f38549a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C65111a(C65086n0 n0Var, C15601d dVar, C65110a aVar) {
                super(2, dVar);
                this.f187405g = n0Var;
                this.f187406h = aVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                C87412m.m108594g(dVar, "completion");
                return new C65111a(this.f187405g, dVar, this.f187406h);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C65111a) create(obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            /* JADX WARNING: Removed duplicated region for block: B:109:0x0372  */
            /* JADX WARNING: Removed duplicated region for block: B:110:0x037c  */
            /* JADX WARNING: Removed duplicated region for block: B:121:0x03b5  */
            /* JADX WARNING: Removed duplicated region for block: B:124:0x03cb  */
            /* JADX WARNING: Removed duplicated region for block: B:33:0x0164  */
            /* JADX WARNING: Removed duplicated region for block: B:56:0x025b  */
            /* JADX WARNING: Removed duplicated region for block: B:87:0x0317  */
            /* JADX WARNING: Removed duplicated region for block: B:90:0x0326  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r17) {
                /*
                    r16 = this;
                    r0 = r16
                    u3.i0 r1 = p247u3.C65069i0.REFRESH
                    int r2 = r0.f187404f
                    r3 = 1
                    r4 = 0
                    r5 = 2
                    if (r2 == 0) goto L_0x002a
                    if (r2 == r3) goto L_0x001c
                    if (r2 != r5) goto L_0x0014
                    kotlin.ResultKt.throwOnFailure(r17)
                    goto L_0x0143
                L_0x0014:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L_0x001c:
                    java.lang.Object r1 = r0.f187403e
                    gy3.a0 r1 = (gy3.C8477a0) r1
                    java.lang.Object r2 = r0.f187402d
                    u3.a1 r2 = (p247u3.C65007a1) r2
                    kotlin.ResultKt.throwOnFailure(r17)
                    r3 = r17
                    goto L_0x0075
                L_0x002a:
                    kotlin.ResultKt.throwOnFailure(r17)
                    u3.n0 r2 = r0.f187405g
                    boolean r6 = r2 instanceof p247u3.C65086n0.C65088b
                    if (r6 == 0) goto L_0x013a
                    u3.n0$b r2 = (p247u3.C65086n0.C65088b) r2
                    u3.i0 r2 = r2.f187327a
                    if (r2 != r1) goto L_0x013a
                    u3.o1$a r1 = r0.f187406h
                    u3.o1 r1 = r1.f187401d
                    u3.n1 r1 = r1.f187399e
                    r1.f187357f = r4
                    u3.a1 r2 = new u3.a1
                    u3.n0 r1 = r0.f187405g
                    u3.n0$b r1 = (p247u3.C65086n0.C65088b) r1
                    r2.<init>(r1)
                    gy3.a0 r1 = new gy3.a0
                    r1.<init>()
                    r1.f27482d = r4
                    u3.o1$a r4 = r0.f187406h
                    u3.o1 r4 = r4.f187401d
                    u3.n1 r4 = r4.f187399e
                    u3.a1<T> r6 = r4.f187352a
                    u3.n0 r6 = r0.f187405g
                    u3.n0$b r6 = (p247u3.C65086n0.C65088b) r6
                    u3.m r6 = r6.f187331e
                    u3.o1$a$a$a r6 = new u3.o1$a$a$a
                    r6.<init>(r0, r2, r1)
                    r0.f187402d = r2
                    r0.f187403e = r1
                    r0.f187404f = r3
                    androidx.paging.compose.c$b r4 = (androidx.paging.compose.C54222c.C54224b) r4
                    r6.invoke()
                    androidx.paging.compose.c<T> r3 = r4.f152191l
                    androidx.paging.compose.C54222c.m60907a(r3)
                    r3 = 0
                L_0x0075:
                    java.lang.Integer r3 = (java.lang.Integer) r3
                    boolean r1 = r1.f27482d
                    if (r1 == 0) goto L_0x012e
                    u3.o1$a r1 = r0.f187406h
                    u3.o1 r1 = r1.f187401d
                    u3.n1 r1 = r1.f187399e
                    u3.n0 r4 = r0.f187405g
                    u3.n0$b r4 = (p247u3.C65086n0.C65088b) r4
                    u3.m r4 = r4.f187331e
                    u3.m0 r6 = r1.f187354c
                    u3.m r6 = r6.mo89280c()
                    boolean r6 = gy3.C87412m.m108589b(r6, r4)
                    if (r6 == 0) goto L_0x0094
                    goto L_0x00c8
                L_0x0094:
                    u3.m0 r6 = r1.f187354c
                    r6.getClass()
                    java.lang.String r7 = "combinedLoadStates"
                    gy3.C87412m.m108594g(r4, r7)
                    u3.g0 r7 = r4.f187304a
                    r6.f187309a = r7
                    u3.g0 r7 = r4.f187305b
                    r6.f187310b = r7
                    u3.g0 r7 = r4.f187306c
                    r6.f187311c = r7
                    u3.h0 r7 = r4.f187307d
                    r6.f187312d = r7
                    u3.h0 r7 = r4.f187308e
                    r6.f187313e = r7
                    java.util.concurrent.CopyOnWriteArrayList<fy3.l<u3.m, rx3.b0>> r1 = r1.f187355d
                    java.util.Iterator r1 = r1.iterator()
                L_0x00b8:
                    boolean r6 = r1.hasNext()
                    if (r6 == 0) goto L_0x00c8
                    java.lang.Object r6 = r1.next()
                    fy3.l r6 = (fy3.C32226l) r6
                    r6.invoke(r4)
                    goto L_0x00b8
                L_0x00c8:
                    if (r3 != 0) goto L_0x010b
                    u3.o1$a r1 = r0.f187406h
                    u3.o1 r1 = r1.f187401d
                    u3.n1 r1 = r1.f187399e
                    u3.e2 r1 = r1.f187353b
                    if (r1 == 0) goto L_0x03d4
                    int r3 = r2.f187140b
                    u3.f2$b r4 = new u3.f2$b
                    int r3 = r3 / r5
                    java.util.List<u3.d2<T>> r5 = r2.f187139a
                    java.lang.Object r5 = sx3.C110818d0.m150914L(r5)
                    u3.d2 r5 = (p247u3.C65048d2) r5
                    int[] r5 = r5.f187232a
                    java.lang.Integer r5 = sx3.C110823p.m150991Q(r5)
                    gy3.C87412m.m108591d(r5)
                    int r5 = r5.intValue()
                    java.util.List<u3.d2<T>> r2 = r2.f187139a
                    java.lang.Object r2 = sx3.C110818d0.m150923U(r2)
                    u3.d2 r2 = (p247u3.C65048d2) r2
                    int[] r2 = r2.f187232a
                    java.lang.Integer r2 = sx3.C110823p.m150990P(r2)
                    gy3.C87412m.m108591d(r2)
                    int r2 = r2.intValue()
                    r4.<init>(r3, r3, r5, r2)
                    r1.mo89250b(r4)
                    goto L_0x03d4
                L_0x010b:
                    u3.o1$a r1 = r0.f187406h
                    u3.o1 r1 = r1.f187401d
                    u3.n1 r1 = r1.f187399e
                    int r4 = r3.intValue()
                    r1.f187358g = r4
                    u3.o1$a r1 = r0.f187406h
                    u3.o1 r1 = r1.f187401d
                    u3.n1 r1 = r1.f187399e
                    u3.e2 r1 = r1.f187353b
                    if (r1 == 0) goto L_0x03d4
                    int r3 = r3.intValue()
                    u3.f2$a r2 = r2.mo89219a(r3)
                    r1.mo89250b(r2)
                    goto L_0x03d4
                L_0x012e:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "Missing call to onListPresentable after new list was presented. If you are seeing this exception, it is generally an indication of an issue with Paging. Please file a bug so we can fix it at: https://issuetracker.google.com/issues/new?component=413106"
                    java.lang.String r2 = r2.toString()
                    r1.<init>(r2)
                    throw r1
                L_0x013a:
                    u3.o1$a r2 = r0.f187406h
                    u3.o1 r2 = r2.f187401d
                    u3.n1 r2 = r2.f187399e
                    r2.getClass()
                L_0x0143:
                    u3.o1$a r2 = r0.f187406h
                    u3.o1 r2 = r2.f187401d
                    u3.n1 r2 = r2.f187399e
                    u3.a1<T> r6 = r2.f187352a
                    u3.n0 r7 = r0.f187405g
                    u3.n1$b r2 = r2.f187359h
                    r6.getClass()
                    u3.i0 r8 = p247u3.C65069i0.APPEND
                    u3.i0 r9 = p247u3.C65069i0.PREPEND
                    java.lang.String r10 = "pageEvent"
                    gy3.C87412m.m108594g(r7, r10)
                    java.lang.String r10 = "callback"
                    gy3.C87412m.m108594g(r2, r10)
                    boolean r10 = r7 instanceof p247u3.C65086n0.C65088b
                    if (r10 == 0) goto L_0x025b
                    u3.n0$b r7 = (p247u3.C65086n0.C65088b) r7
                    java.util.List<u3.d2<T>> r10 = r7.f187328b
                    java.util.Iterator r10 = r10.iterator()
                    r11 = 0
                L_0x016d:
                    boolean r12 = r10.hasNext()
                    if (r12 == 0) goto L_0x0181
                    java.lang.Object r12 = r10.next()
                    u3.d2 r12 = (p247u3.C65048d2) r12
                    java.util.List<T> r12 = r12.f187233b
                    int r12 = r12.size()
                    int r11 = r11 + r12
                    goto L_0x016d
                L_0x0181:
                    int r10 = r6.mo89222d()
                    u3.i0 r12 = r7.f187327a
                    int r12 = r12.ordinal()
                    if (r12 == 0) goto L_0x0255
                    if (r12 == r3) goto L_0x01e2
                    if (r12 == r5) goto L_0x0193
                    goto L_0x0221
                L_0x0193:
                    int r5 = r6.f187142d
                    int r5 = java.lang.Math.min(r5, r11)
                    int r12 = r6.f187141c
                    int r13 = r6.f187140b
                    int r12 = r12 + r13
                    int r13 = r11 - r5
                    int r14 = r12 + r5
                    java.util.List<u3.d2<T>> r15 = r6.f187139a
                    java.util.ArrayList r15 = (java.util.ArrayList) r15
                    int r3 = r15.size()
                    java.util.List<u3.d2<T>> r4 = r7.f187328b
                    r15.addAll(r3, r4)
                    int r3 = r6.f187140b
                    int r3 = r3 + r11
                    r6.f187140b = r3
                    int r3 = r7.f187330d
                    r6.f187142d = r3
                    u3.n1 r3 = r2.f187364a
                    u3.s r3 = r3.f187361j
                    r3.mo75010c(r12, r5)
                    r2.mo89295b(r14, r13)
                    int r3 = r6.mo89222d()
                    int r3 = r3 - r10
                    int r3 = r3 - r13
                    if (r3 <= 0) goto L_0x01d3
                    int r4 = r6.mo89222d()
                    int r4 = r4 - r3
                    r2.mo89295b(r4, r3)
                    goto L_0x0221
                L_0x01d3:
                    if (r3 >= 0) goto L_0x0221
                    int r4 = r6.mo89222d()
                    int r3 = -r3
                    u3.n1 r5 = r2.f187364a
                    u3.s r5 = r5.f187361j
                    r5.mo75008a(r4, r3)
                    goto L_0x0221
                L_0x01e2:
                    int r3 = r6.f187141c
                    int r3 = java.lang.Math.min(r3, r11)
                    int r4 = r6.f187141c
                    int r4 = r4 - r3
                    int r5 = r11 - r3
                    java.util.List<u3.d2<T>> r12 = r6.f187139a
                    java.util.List<u3.d2<T>> r13 = r7.f187328b
                    java.util.ArrayList r12 = (java.util.ArrayList) r12
                    r14 = 0
                    r12.addAll(r14, r13)
                    int r12 = r6.f187140b
                    int r12 = r12 + r11
                    r6.f187140b = r12
                    int r11 = r7.f187329c
                    r6.f187141c = r11
                    u3.n1 r11 = r2.f187364a
                    u3.s r11 = r11.f187361j
                    r11.mo75010c(r4, r3)
                    r3 = 0
                    r2.mo89295b(r3, r5)
                    int r4 = r6.mo89222d()
                    int r4 = r4 - r10
                    int r4 = r4 - r5
                    if (r4 <= 0) goto L_0x0217
                    r2.mo89295b(r3, r4)
                    goto L_0x0221
                L_0x0217:
                    if (r4 >= 0) goto L_0x0221
                    int r4 = -r4
                    u3.n1 r5 = r2.f187364a
                    u3.s r5 = r5.f187361j
                    r5.mo75008a(r3, r4)
                L_0x0221:
                    u3.m r3 = r7.f187331e
                    u3.b1 r4 = new u3.b1
                    r4.<init>(r2)
                    r3.getClass()
                    u3.h0 r2 = r3.f187307d
                    u3.g0 r5 = r2.f187269a
                    java.lang.Boolean r6 = java.lang.Boolean.FALSE
                    r4.invoke(r1, r6, r5)
                    u3.g0 r5 = r2.f187270b
                    r4.invoke(r9, r6, r5)
                    u3.g0 r2 = r2.f187271c
                    r4.invoke(r8, r6, r2)
                    u3.h0 r2 = r3.f187308e
                    if (r2 == 0) goto L_0x0311
                    u3.g0 r3 = r2.f187269a
                    java.lang.Boolean r5 = java.lang.Boolean.TRUE
                    r4.invoke(r1, r5, r3)
                    u3.g0 r1 = r2.f187270b
                    r4.invoke(r9, r5, r1)
                    u3.g0 r1 = r2.f187271c
                    r4.invoke(r8, r5, r1)
                    goto L_0x0311
                L_0x0255:
                    java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                    r1.<init>()
                    throw r1
                L_0x025b:
                    boolean r1 = r7 instanceof p247u3.C65086n0.C65087a
                    if (r1 == 0) goto L_0x0302
                    u3.n0$a r7 = (p247u3.C65086n0.C65087a) r7
                    int r1 = r6.mo89222d()
                    u3.i0 r3 = r7.f187321a
                    if (r3 != r9) goto L_0x02b0
                    int r3 = r6.f187141c
                    int r4 = r7.f187322b
                    my3.j r5 = new my3.j
                    int r10 = r7.f187323c
                    r5.<init>(r4, r10)
                    int r4 = r6.mo89220b(r5)
                    int r5 = r6.f187140b
                    int r5 = r5 - r4
                    r6.f187140b = r5
                    int r4 = r7.f187324d
                    r6.f187141c = r4
                    int r4 = r6.mo89222d()
                    int r4 = r4 - r1
                    if (r4 <= 0) goto L_0x028d
                    r1 = 0
                    r2.mo89295b(r1, r4)
                    goto L_0x0298
                L_0x028d:
                    r1 = 0
                    if (r4 >= 0) goto L_0x0298
                    int r5 = -r4
                    u3.n1 r6 = r2.f187364a
                    u3.s r6 = r6.f187361j
                    r6.mo75008a(r1, r5)
                L_0x0298:
                    int r3 = r3 + r4
                    int r3 = java.lang.Math.max(r1, r3)
                    int r1 = r7.f187324d
                    int r1 = r1 - r3
                    if (r1 <= 0) goto L_0x02a9
                    u3.n1 r4 = r2.f187364a
                    u3.s r4 = r4.f187361j
                    r4.mo75010c(r3, r1)
                L_0x02a9:
                    u3.g0$c r1 = p247u3.C65060g0.C65063c.f187265c
                    r3 = 0
                    r2.mo89224a(r9, r3, r1)
                    goto L_0x0311
                L_0x02b0:
                    int r3 = r6.f187142d
                    int r4 = r7.f187322b
                    my3.j r5 = new my3.j
                    int r10 = r7.f187323c
                    r5.<init>(r4, r10)
                    int r4 = r6.mo89220b(r5)
                    int r5 = r6.f187140b
                    int r5 = r5 - r4
                    r6.f187140b = r5
                    int r4 = r7.f187324d
                    r6.f187142d = r4
                    int r4 = r6.mo89222d()
                    int r4 = r4 - r1
                    if (r4 <= 0) goto L_0x02d3
                    r2.mo89295b(r1, r4)
                    goto L_0x02de
                L_0x02d3:
                    if (r4 >= 0) goto L_0x02de
                    int r1 = r1 + r4
                    int r5 = -r4
                    u3.n1 r10 = r2.f187364a
                    u3.s r10 = r10.f187361j
                    r10.mo75008a(r1, r5)
                L_0x02de:
                    if (r4 >= 0) goto L_0x02e6
                    int r1 = -r4
                    int r1 = java.lang.Math.min(r3, r1)
                    goto L_0x02e7
                L_0x02e6:
                    r1 = 0
                L_0x02e7:
                    int r4 = r7.f187324d
                    int r3 = r3 - r1
                    int r4 = r4 - r3
                    if (r4 <= 0) goto L_0x02fb
                    int r1 = r6.mo89222d()
                    int r3 = r7.f187324d
                    int r1 = r1 - r3
                    u3.n1 r3 = r2.f187364a
                    u3.s r3 = r3.f187361j
                    r3.mo75010c(r1, r4)
                L_0x02fb:
                    u3.g0$c r1 = p247u3.C65060g0.C65063c.f187265c
                    r3 = 0
                    r2.mo89224a(r8, r3, r1)
                    goto L_0x0311
                L_0x0302:
                    boolean r1 = r7 instanceof p247u3.C65086n0.C65091c
                    if (r1 == 0) goto L_0x0311
                    u3.n0$c r7 = (p247u3.C65086n0.C65091c) r7
                    u3.i0 r1 = r7.f187349a
                    boolean r3 = r7.f187350b
                    u3.g0 r4 = r7.f187351c
                    r2.mo89224a(r1, r3, r4)
                L_0x0311:
                    u3.n0 r1 = r0.f187405g
                    boolean r1 = r1 instanceof p247u3.C65086n0.C65087a
                    if (r1 == 0) goto L_0x0320
                    u3.o1$a r1 = r0.f187406h
                    u3.o1 r1 = r1.f187401d
                    u3.n1 r1 = r1.f187399e
                    r2 = 0
                    r1.f187357f = r2
                L_0x0320:
                    u3.n0 r1 = r0.f187405g
                    boolean r2 = r1 instanceof p247u3.C65086n0.C65088b
                    if (r2 == 0) goto L_0x03d4
                    u3.n0$b r1 = (p247u3.C65086n0.C65088b) r1
                    u3.m r2 = r1.f187331e
                    u3.g0 r3 = r2.f187305b
                    boolean r3 = r3.f187261a
                    u3.g0 r2 = r2.f187306c
                    boolean r2 = r2.f187261a
                    u3.i0 r4 = r1.f187327a
                    if (r4 != r9) goto L_0x0338
                    if (r3 != 0) goto L_0x033d
                L_0x0338:
                    if (r4 != r8) goto L_0x033f
                    if (r2 != 0) goto L_0x033d
                    goto L_0x033f
                L_0x033d:
                    r2 = 0
                    goto L_0x0340
                L_0x033f:
                    r2 = 1
                L_0x0340:
                    java.util.List<u3.d2<T>> r1 = r1.f187328b
                    boolean r3 = r1 instanceof java.util.Collection
                    if (r3 == 0) goto L_0x034d
                    boolean r3 = r1.isEmpty()
                    if (r3 == 0) goto L_0x034d
                    goto L_0x036f
                L_0x034d:
                    java.util.Iterator r1 = r1.iterator()
                L_0x0351:
                    boolean r3 = r1.hasNext()
                    if (r3 == 0) goto L_0x036f
                    java.lang.Object r3 = r1.next()
                    u3.d2 r3 = (p247u3.C65048d2) r3
                    java.util.List<T> r3 = r3.f187233b
                    boolean r3 = r3.isEmpty()
                    java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                    boolean r3 = r3.booleanValue()
                    if (r3 != 0) goto L_0x0351
                    r14 = 0
                    goto L_0x0370
                L_0x036f:
                    r14 = 1
                L_0x0370:
                    if (r2 != 0) goto L_0x037c
                    u3.o1$a r1 = r0.f187406h
                    u3.o1 r1 = r1.f187401d
                    u3.n1 r1 = r1.f187399e
                    r2 = 0
                    r1.f187357f = r2
                    goto L_0x03d4
                L_0x037c:
                    u3.o1$a r1 = r0.f187406h
                    u3.o1 r1 = r1.f187401d
                    u3.n1 r1 = r1.f187399e
                    boolean r1 = r1.f187357f
                    if (r1 != 0) goto L_0x0388
                    if (r14 == 0) goto L_0x03d4
                L_0x0388:
                    if (r14 != 0) goto L_0x03b2
                    u3.o1$a r1 = r0.f187406h
                    u3.o1 r1 = r1.f187401d
                    u3.n1 r1 = r1.f187399e
                    int r1 = r1.f187358g
                    u3.o1$a r2 = r0.f187406h
                    u3.o1 r2 = r2.f187401d
                    u3.n1 r2 = r2.f187399e
                    u3.a1<T> r3 = r2.f187352a
                    int r3 = r3.f187141c
                    if (r1 < r3) goto L_0x03b2
                    int r1 = r2.f187358g
                    u3.o1$a r2 = r0.f187406h
                    u3.o1 r2 = r2.f187401d
                    u3.n1 r2 = r2.f187399e
                    u3.a1<T> r2 = r2.f187352a
                    int r3 = r2.f187141c
                    int r2 = r2.f187140b
                    int r3 = r3 + r2
                    if (r1 <= r3) goto L_0x03b0
                    goto L_0x03b2
                L_0x03b0:
                    r3 = 0
                    goto L_0x03b3
                L_0x03b2:
                    r3 = 1
                L_0x03b3:
                    if (r3 == 0) goto L_0x03cb
                    u3.o1$a r1 = r0.f187406h
                    u3.o1 r1 = r1.f187401d
                    u3.n1 r1 = r1.f187399e
                    u3.e2 r2 = r1.f187353b
                    if (r2 == 0) goto L_0x03d4
                    u3.a1<T> r3 = r1.f187352a
                    int r1 = r1.f187358g
                    u3.f2$a r1 = r3.mo89219a(r1)
                    r2.mo89250b(r1)
                    goto L_0x03d4
                L_0x03cb:
                    u3.o1$a r1 = r0.f187406h
                    u3.o1 r1 = r1.f187401d
                    u3.n1 r1 = r1.f187399e
                    r2 = 0
                    r1.f187357f = r2
                L_0x03d4:
                    rx3.b0 r1 = rx3.C13598b0.f38549a
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: p247u3.C65109o1.C65110a.C65111a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public C65110a(C65109o1 o1Var) {
            this.f187401d = o1Var;
        }

        public Object emit(Object obj, C15601d dVar) {
            Object g = C53895h.m60469g(this.f187401d.f187399e.f187362k, new C65111a((C65086n0) obj, (C15601d) null, this), dVar);
            return g == C15911a.COROUTINE_SUSPENDED ? g : C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65109o1(C65093n1 n1Var, C65081m1 m1Var, C15601d dVar) {
        super(1, dVar);
        this.f187399e = n1Var;
        this.f187400f = m1Var;
    }

    public final C15601d<C13598b0> create(C15601d<?> dVar) {
        C87412m.m108594g(dVar, "completion");
        return new C65109o1(this.f187399e, this.f187400f, dVar);
    }

    public final Object invoke(Object obj) {
        return ((C65109o1) create((C15601d) obj)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f187398d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C65093n1 n1Var = this.f187399e;
            C65081m1 m1Var = this.f187400f;
            n1Var.f187353b = m1Var.f187315b;
            C45252f<C65086n0<T>> fVar = m1Var.f187314a;
            C65110a aVar2 = new C65110a(this);
            this.f187398d = 1;
            if (fVar.mo31880a(aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
