package mx0;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import ac2.C39534d;
import ac2.C53996a;
import ac2.C53998c;
import c14.C54624g;
import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import d14.C45252f;
import d14.C58017a1;
import d14.C58085t0;
import fy3.C32227p;
import gy3.C87412m;
import rx3.C13598b0;
import te3.C48976ca2;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: mx0.f */
public final class C47112f extends C53996a<C47111e> {

    /* renamed from: d */
    public MvvmList<C47111e> f126590d;

    /* renamed from: e */
    public C48976ca2 f126591e;

    /* renamed from: f */
    public boolean f126592f;

    /* renamed from: g */
    public int f126593g = ((int) (System.currentTimeMillis() / ((long) 1000)));

    /* renamed from: h */
    public final C47110d f126594h = new C47110d();

    /* renamed from: i */
    public final C47117l f126595i = new C47117l();

    @C91590f(mo125468c = "com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.data.BizPCRecentReadDataSource$getData$1", mo125469f = "BizPCRecentReadDataSource.kt", mo125470l = {39, 45, 65}, mo125471m = "invokeSuspend")
    /* renamed from: mx0.f$a */
    public static final class C47113a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f126596d;

        /* renamed from: e */
        public Object f126597e;

        /* renamed from: f */
        public int f126598f;

        /* renamed from: g */
        public final /* synthetic */ C53998c<C47111e> f126599g;

        /* renamed from: h */
        public final /* synthetic */ C47112f f126600h;

        /* renamed from: i */
        public final /* synthetic */ C58085t0<C39534d<C47111e>> f126601i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47113a(C53998c<C47111e> cVar, C47112f fVar, C58085t0<C39534d<C47111e>> t0Var, C15601d<? super C47113a> dVar) {
            super(2, dVar);
            this.f126599g = cVar;
            this.f126600h = fVar;
            this.f126601i = t0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C47113a(this.f126599g, this.f126600h, this.f126601i, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C47113a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:101:0x0278 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0092  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00c3  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00c6  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00ca  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                r18 = this;
                r0 = r18
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f126598f
                r3 = 0
                r4 = 3
                r5 = 0
                r6 = 1
                r7 = 2
                if (r2 == 0) goto L_0x0039
                if (r2 == r6) goto L_0x002b
                if (r2 == r7) goto L_0x0020
                if (r2 != r4) goto L_0x0018
                kotlin.ResultKt.throwOnFailure(r19)
                goto L_0x0279
            L_0x0018:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0020:
                java.lang.Object r2 = r0.f126596d
                ac2.d r2 = (ac2.C39534d) r2
                kotlin.ResultKt.throwOnFailure(r19)
                r7 = r19
                goto L_0x00c0
            L_0x002b:
                java.lang.Object r2 = r0.f126597e
                mx0.f r2 = (mx0.C47112f) r2
                java.lang.Object r8 = r0.f126596d
                ac2.d r8 = (ac2.C39534d) r8
                kotlin.ResultKt.throwOnFailure(r19)
                r9 = r19
                goto L_0x0077
            L_0x0039:
                kotlin.ResultKt.throwOnFailure(r19)
                ac2.d r8 = new ac2.d
                ac2.c<mx0.e> r2 = r0.f126599g
                r8.<init>(r2)
                ac2.c<mx0.e> r2 = r0.f126599g
                int r2 = r2.f151264a
                if (r2 != 0) goto L_0x008b
                mx0.f r2 = r0.f126600h
                mx0.l r9 = r2.f126595i
                r0.f126596d = r8
                r0.f126597e = r2
                r0.f126598f = r6
                r9.getClass()
                wx3.h r10 = new wx3.h
                wx3.d r11 = xx3.C66447b.m78392b(r18)
                r10.<init>(r11)
                mx0.a r11 = new mx0.a
                r11.<init>()
                nr3.e r11 = r11.mo9225i()
                mx0.j r12 = new mx0.j
                r12.<init>(r9, r10)
                r11.mo123420E(r12)
                java.lang.Object r9 = r10.mo90314b()
                if (r9 != r1) goto L_0x0077
                return r1
            L_0x0077:
                te3.ca2 r9 = (te3.C48976ca2) r9
                r2.f126591e = r9
                mx0.f r2 = r0.f126600h
                te3.ca2 r9 = r2.f126591e
                if (r9 == 0) goto L_0x0088
                int r9 = r9.f131594g
                if (r9 == r6) goto L_0x0086
                goto L_0x0088
            L_0x0086:
                r9 = 0
                goto L_0x0089
            L_0x0088:
                r9 = 1
            L_0x0089:
                r2.f126592f = r9
            L_0x008b:
                r2 = r8
                mx0.f r8 = r0.f126600h
                boolean r9 = r8.f126592f
                if (r9 != 0) goto L_0x00c3
                mx0.d r9 = r8.f126594h
                int r8 = r8.f126593g
                r0.f126596d = r2
                r0.f126597e = r3
                r0.f126598f = r7
                r9.getClass()
                wx3.h r7 = new wx3.h
                wx3.d r10 = xx3.C66447b.m78392b(r18)
                r7.<init>(r10)
                mx0.h r10 = new mx0.h
                r10.<init>(r8)
                nr3.e r8 = r10.mo9225i()
                mx0.c r10 = new mx0.c
                r10.<init>(r9, r7)
                r8.mo123420E(r10)
                java.lang.Object r7 = r7.mo90314b()
                if (r7 != r1) goto L_0x00c0
                return r1
            L_0x00c0:
                te3.lw1 r7 = (te3.C50318lw1) r7
                goto L_0x00c4
            L_0x00c3:
                r7 = r3
            L_0x00c4:
                if (r7 != 0) goto L_0x00ca
                r2.f106150a = r5
                goto L_0x0268
            L_0x00ca:
                int r8 = r7.f137679e
                if (r8 != r6) goto L_0x00d0
                r8 = 1
                goto L_0x00d1
            L_0x00d0:
                r8 = 0
            L_0x00d1:
                r2.f106150a = r8
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                java.util.LinkedList<te3.eg> r7 = r7.f137678d
                if (r7 == 0) goto L_0x0101
                java.util.Iterator r7 = r7.iterator()
            L_0x00e0:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L_0x0101
                java.lang.Object r9 = r7.next()
                r11 = r9
                te3.eg r11 = (te3.C49280eg) r11
                mx0.e r9 = new mx0.e
                java.lang.String r10 = "it"
                gy3.C87412m.m108593f(r11, r10)
                r12 = 0
                boolean r13 = r2.f106150a
                r14 = 2
                r15 = 0
                r10 = r9
                r10.<init>(r11, r12, r13, r14, r15)
                r8.add(r9)
                goto L_0x00e0
            L_0x0101:
                mx0.f r7 = r0.f126600h
                mx0.m r15 = mx0.C47118m.DATE
                com.tencent.mm.plugin.mvvmlist.MvvmList<mx0.e> r9 = r7.f126590d
                if (r9 == 0) goto L_0x024a
                boolean r9 = r8.isEmpty()
                if (r9 == 0) goto L_0x0111
                goto L_0x024a
            L_0x0111:
                boolean r9 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
                if (r9 != 0) goto L_0x011d
                boolean r9 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
                if (r9 != 0) goto L_0x011d
                boolean r9 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
                if (r9 == 0) goto L_0x01aa
            L_0x011d:
                java.lang.String r9 = "test_biz_pc"
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r9)
                java.lang.String r10 = "hardcode_date"
                boolean r9 = r9.decodeBool(r10)
                if (r9 == 0) goto L_0x01aa
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                java.util.Iterator r10 = r8.iterator()
            L_0x0135:
                boolean r11 = r10.hasNext()
                if (r11 == 0) goto L_0x0151
                java.lang.Object r11 = r10.next()
                r12 = r11
                mx0.e r12 = (mx0.C47111e) r12
                te3.eg r12 = r12.f126587d
                int r12 = r12.f132912h
                if (r12 == 0) goto L_0x014a
                r12 = 1
                goto L_0x014b
            L_0x014a:
                r12 = 0
            L_0x014b:
                if (r12 == 0) goto L_0x0135
                r9.add(r11)
                goto L_0x0135
            L_0x0151:
                java.util.Iterator r9 = r9.iterator()
                r10 = 0
            L_0x0156:
                boolean r11 = r9.hasNext()
                if (r11 == 0) goto L_0x01aa
                java.lang.Object r11 = r9.next()
                int r12 = r10 + 1
                if (r10 < 0) goto L_0x01a5
                mx0.e r11 = (mx0.C47111e) r11
                te3.eg r13 = r11.f126587d
                int r13 = r13.f132912h
                double r13 = (double) r13
                com.tencent.mm.plugin.mvvmlist.MvvmList<mx0.e> r4 = r7.f126590d
                gy3.C87412m.m108591d(r4)
                java.util.ArrayList<T> r4 = r4.f272353o
                int r4 = r4.size()
                int r4 = r4 + r10
                double r5 = (double) r4
                r16 = 4613937818241073152(0x4008000000000000, double:3.0)
                double r5 = r5 / r16
                r4 = 86400(0x15180, float:1.21072E-40)
                double r3 = (double) r4
                double r5 = r5 * r3
                double r13 = r13 - r5
                te3.eg r3 = r11.f126587d
                int r4 = (int) r13
                r3.f132912h = r4
                kx0.o r3 = kx0.C46786o.f125904a
                android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                java.lang.String r5 = "getContext()"
                gy3.C87412m.m108593f(r4, r5)
                long r5 = (long) r13
                r10 = 1000(0x3e8, float:1.401E-42)
                long r13 = (long) r10
                long r5 = r5 * r13
                java.lang.String r3 = r3.mo72010a(r4, r5)
                r11.f126589f = r3
                r10 = r12
                r3 = 0
                r4 = 3
                r5 = 0
                r6 = 1
                goto L_0x0156
            L_0x01a5:
                sx3.C64197v.m75542k()
                r1 = 0
                throw r1
            L_0x01aa:
                com.tencent.mm.plugin.mvvmlist.MvvmList<mx0.e> r3 = r7.f126590d
                gy3.C87412m.m108591d(r3)
                java.util.ArrayList<T> r3 = r3.f272353o
                boolean r3 = r3.isEmpty()
                com.tencent.mm.plugin.mvvmlist.MvvmList<mx0.e> r4 = r7.f126590d
                gy3.C87412m.m108591d(r4)
                java.util.ArrayList<T> r4 = r4.f272353o
                java.lang.Object r4 = sx3.C110818d0.m150925W(r4)
                mx0.e r4 = (mx0.C47111e) r4
                if (r4 == 0) goto L_0x01c7
                java.lang.String r4 = r4.f126589f
                goto L_0x01c8
            L_0x01c7:
                r4 = 0
            L_0x01c8:
                java.lang.Object r5 = sx3.C110818d0.m150914L(r8)
                mx0.e r5 = (mx0.C47111e) r5
                java.lang.String r5 = r5.f126589f
                boolean r4 = gy3.C87412m.m108589b(r4, r5)
                r5 = 1
                r4 = r4 ^ r5
                if (r3 != 0) goto L_0x01dd
                if (r4 == 0) goto L_0x01db
                goto L_0x01dd
            L_0x01db:
                r3 = 0
                goto L_0x01de
            L_0x01dd:
                r3 = 1
            L_0x01de:
                if (r3 == 0) goto L_0x0202
                mx0.e r3 = new mx0.e
                te3.eg r10 = new te3.eg
                r10.<init>()
                r12 = 0
                r13 = 4
                r14 = 0
                r9 = r3
                r11 = r15
                r9.<init>(r10, r11, r12, r13, r14)
                java.lang.Object r4 = sx3.C110818d0.m150914L(r8)
                mx0.e r4 = (mx0.C47111e) r4
                java.lang.String r4 = r4.f126589f
                if (r4 != 0) goto L_0x01fb
                java.lang.String r4 = ""
            L_0x01fb:
                r3.f126589f = r4
                r4 = 0
                r8.add(r4, r3)
                goto L_0x0203
            L_0x0202:
                r4 = 0
            L_0x0203:
                int r3 = r8.size()
                r6 = 1
            L_0x0208:
                if (r6 >= r3) goto L_0x024b
                int r5 = r6 + -1
                java.lang.Object r5 = r8.get(r5)
                java.lang.String r7 = "needEmitDataList[i - 1]"
                gy3.C87412m.m108593f(r5, r7)
                mx0.e r5 = (mx0.C47111e) r5
                java.lang.Object r7 = r8.get(r6)
                java.lang.String r9 = "needEmitDataList[i]"
                gy3.C87412m.m108593f(r7, r9)
                mx0.e r7 = (mx0.C47111e) r7
                java.lang.String r5 = r5.f126589f
                java.lang.String r9 = r7.f126589f
                boolean r5 = gy3.C87412m.m108589b(r5, r9)
                if (r5 != 0) goto L_0x0247
                mx0.e r5 = new mx0.e
                te3.eg r10 = new te3.eg
                r10.<init>()
                r12 = 0
                r13 = 4
                r14 = 0
                r9 = r5
                r11 = r15
                r9.<init>(r10, r11, r12, r13, r14)
                java.lang.String r7 = r7.f126589f
                java.lang.String r9 = "<set-?>"
                gy3.C87412m.m108594g(r7, r9)
                r5.f126589f = r7
                r8.add(r6, r5)
            L_0x0247:
                int r6 = r6 + 1
                goto L_0x0208
            L_0x024a:
                r4 = 0
            L_0x024b:
                java.util.ArrayList<T> r3 = r2.f106151b
                r3.addAll(r8)
                mx0.f r3 = r0.f126600h
                java.util.ArrayList<T> r5 = r2.f106151b
                java.lang.Object r5 = sx3.C110818d0.m150925W(r5)
                mx0.e r5 = (mx0.C47111e) r5
                if (r5 == 0) goto L_0x0265
                te3.eg r5 = r5.f126587d
                if (r5 == 0) goto L_0x0265
                int r4 = r5.f132912h
                int r5 = r4 + -1
                goto L_0x0266
            L_0x0265:
                r5 = 0
            L_0x0266:
                r3.f126593g = r5
            L_0x0268:
                d14.t0<ac2.d<mx0.e>> r3 = r0.f126601i
                r4 = 0
                r0.f126596d = r4
                r0.f126597e = r4
                r4 = 3
                r0.f126598f = r4
                java.lang.Object r2 = r3.emit(r2, r0)
                if (r2 != r1) goto L_0x0279
                return r1
            L_0x0279:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: mx0.C47112f.C47113a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: b */
    public C45252f<C39534d<C47111e>> mo70650e(LifecycleScope lifecycleScope, C53998c<C47111e> cVar) {
        C87412m.m108594g(lifecycleScope, "scope");
        C87412m.m108594g(cVar, "request");
        C58085t0 b = C58017a1.m67173b(0, 0, (C54624g) null, 7, (Object) null);
        C53895h.m60466d(lifecycleScope, (C66212f) null, (C53934p0) null, new C47113a(cVar, this, b, (C15601d<? super C47113a>) null), 3, (Object) null);
        return b;
    }
}
