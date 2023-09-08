package ga0;

import com.tencent.p014mm.mj_template.sns.compose.widget.C28971l;
import gy3.C87412m;
import p247u3.C65145q1;
import p247u3.C65164r1;
import te3.o74;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: ga0.h */
public final class C59406h extends C65145q1<Integer, C28971l<o74>> {

    /* renamed from: c */
    public final String f169776c;

    /* renamed from: d */
    public final long f169777d;

    /* renamed from: e */
    public long f169778e;

    @C91590f(mo125468c = "com.tencent.mm.mj_template.compose_widget.model.MusicSearchFinderDataSource", mo125469f = "MusicSearchFinderDataSource.kt", mo125470l = {45}, mo125471m = "load")
    /* renamed from: ga0.h$a */
    public static final class C59407a extends C66704d {

        /* renamed from: d */
        public Object f169779d;

        /* renamed from: e */
        public int f169780e;

        /* renamed from: f */
        public /* synthetic */ Object f169781f;

        /* renamed from: g */
        public final /* synthetic */ C59406h f169782g;

        /* renamed from: h */
        public int f169783h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59407a(C59406h hVar, C15601d<? super C59407a> dVar) {
            super(dVar);
            this.f169782g = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f169781f = obj;
            this.f169783h |= Integer.MIN_VALUE;
            return this.f169782g.mo72456d((C65145q1.C65146a<Integer>) null, this);
        }
    }

    public C59406h(String str, long j) {
        C87412m.m108594g(str, "keyword");
        this.f169776c = str;
        this.f169777d = j;
    }

    /* renamed from: b */
    public Object mo72455b(C65164r1 r1Var) {
        int i;
        Integer num;
        Integer num2;
        C87412m.m108594g(r1Var, "state");
        Integer num3 = r1Var.f187591b;
        if (num3 == null) {
            return null;
        }
        C65145q1.C65150b.C65152b a = r1Var.mo89319a(num3.intValue());
        if (a != null && (num2 = (Integer) a.f187563b) != null) {
            i = num2.intValue() + 1;
        } else if (a == null || (num = (Integer) a.f187564c) == null) {
            return null;
        } else {
            i = num.intValue() - 1;
        }
        return Integer.valueOf(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo72456d(p247u3.C65145q1.C65146a<java.lang.Integer> r21, wx3.C15601d<? super p247u3.C65145q1.C65150b<java.lang.Integer, com.tencent.p014mm.mj_template.sns.compose.widget.C28971l<te3.o74>>> r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            boolean r2 = r1 instanceof ga0.C59406h.C59407a
            if (r2 == 0) goto L_0x0017
            r2 = r1
            ga0.h$a r2 = (ga0.C59406h.C59407a) r2
            int r3 = r2.f169783h
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f169783h = r3
            goto L_0x001c
        L_0x0017:
            ga0.h$a r2 = new ga0.h$a
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.f169781f
            xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
            int r4 = r2.f169783h
            r6 = 1
            if (r4 == 0) goto L_0x0039
            if (r4 != r6) goto L_0x0031
            int r3 = r2.f169780e
            java.lang.Object r2 = r2.f169779d
            ga0.h r2 = (ga0.C59406h) r2
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0071
        L_0x0031:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0039:
            kotlin.ResultKt.throwOnFailure(r1)
            java.lang.Object r1 = r21.mo89309a()
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L_0x0049
            int r1 = r1.intValue()
            goto L_0x004a
        L_0x0049:
            r1 = 0
        L_0x004a:
            long r8 = r0.f169778e
            java.lang.String r10 = r0.f169776c
            int r11 = r1 * 10
            r12 = 10
            long r13 = r0.f169777d
            r2.f169779d = r0
            r2.f169780e = r1
            r2.f169783h = r6
            a14.h0 r4 = a14.C53872d1.f151119c
            ga0.b r15 = new ga0.b
            r16 = 0
            r7 = r15
            r5 = r15
            r15 = r16
            r7.<init>(r8, r10, r11, r12, r13, r15)
            java.lang.Object r2 = a14.C53895h.m60469g(r4, r5, r2)
            if (r2 != r3) goto L_0x006e
            return r3
        L_0x006e:
            r3 = r1
            r1 = r2
            r2 = r0
        L_0x0071:
            te3.qc r1 = (te3.C64653qc) r1
            if (r1 != 0) goto L_0x0089
            java.lang.String r1 = "MicroMsg.MusicSearchFinderDataSource"
            java.lang.String r2 = "load: music cgi search error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
            u3.q1$b$a r1 = new u3.q1$b$a
            java.lang.Throwable r2 = new java.lang.Throwable
            java.lang.String r3 = "music search cgi error"
            r2.<init>(r3)
            r1.<init>(r2)
            return r1
        L_0x0089:
            long r4 = r1.f184994d
            r2.f169778e = r4
            java.util.LinkedList<te3.xt2> r4 = r1.f184995e
            r5 = 10
            if (r4 == 0) goto L_0x00e2
            java.util.ArrayList r7 = new java.util.ArrayList
            int r8 = sx3.C36907w.m41090l(r4, r5)
            r7.<init>(r8)
            java.util.Iterator r4 = r4.iterator()
        L_0x00a0:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x00e4
            java.lang.Object r8 = r4.next()
            te3.xt2 r8 = (te3.C64839xt2) r8
            te3.o74 r9 = new te3.o74
            r9.<init>()
            int r10 = r8.f186384d
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r9.f139006d = r10
            java.lang.String r10 = r8.f186387g
            r9.f139007e = r10
            java.lang.String r10 = r8.f186389i
            r9.f139009g = r10
            java.util.LinkedList<java.lang.String> r11 = r8.f186390j
            java.lang.String r8 = "item.singer_name"
            gy3.C87412m.m108593f(r11, r8)
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 63
            r19 = 0
            java.lang.String r8 = sx3.C110818d0.m150921S(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r9.f139010h = r8
            java.util.LinkedList<te3.p74> r8 = r9.f139011i
            r9.f139011i = r8
            r7.add(r9)
            goto L_0x00a0
        L_0x00e2:
            sx3.f0 r7 = sx3.C64186f0.f181907d
        L_0x00e4:
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = sx3.C36907w.m41090l(r7, r5)
            r4.<init>(r5)
            java.util.Iterator r5 = r7.iterator()
        L_0x00f1:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0108
            java.lang.Object r7 = r5.next()
            te3.o74 r7 = (te3.o74) r7
            com.tencent.mm.mj_template.sns.compose.widget.l r8 = new com.tencent.mm.mj_template.sns.compose.widget.l
            long r9 = r2.f169778e
            r8.<init>(r7, r9)
            r4.add(r8)
            goto L_0x00f1
        L_0x0108:
            java.util.LinkedList<te3.xt2> r1 = r1.f184995e
            if (r1 == 0) goto L_0x0111
            int r5 = r1.size()
            goto L_0x0112
        L_0x0111:
            r5 = 0
        L_0x0112:
            r1 = 0
            if (r5 <= 0) goto L_0x011c
            int r3 = r3 + r6
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r3)
            goto L_0x011d
        L_0x011c:
            r2 = r1
        L_0x011d:
            u3.q1$b$b r3 = new u3.q1$b$b
            r3.<init>(r4, r1, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ga0.C59406h.mo72456d(u3.q1$a, wx3.d):java.lang.Object");
    }
}
