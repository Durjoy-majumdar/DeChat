package g10;

import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: g10.e */
public final class C59344e {

    @C91590f(mo125468c = "com.tencent.mm.flutter.plugin.data_sources.finder.FinderDataSource", mo125469f = "FinderDataSource.kt", mo125470l = {49}, mo125471m = "getLatestFinders")
    /* renamed from: g10.e$a */
    public static final class C59345a extends C66704d {

        /* renamed from: d */
        public long f169641d;

        /* renamed from: e */
        public Object f169642e;

        /* renamed from: f */
        public /* synthetic */ Object f169643f;

        /* renamed from: g */
        public final /* synthetic */ C59344e f169644g;

        /* renamed from: h */
        public int f169645h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59345a(C59344e eVar, C15601d<? super C59345a> dVar) {
            super(dVar);
            this.f169644g = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f169643f = obj;
            this.f169645h |= Integer.MIN_VALUE;
            return this.f169644g.mo84455a((String) null, 0, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00fc A[LOOP:1: B:33:0x00f6->B:35:0x00fc, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo84455a(java.lang.String r17, long r18, wx3.C15601d<? super l10.C61185d> r20) {
        /*
            r16 = this;
            r0 = r20
            boolean r1 = r0 instanceof g10.C59344e.C59345a
            if (r1 == 0) goto L_0x0017
            r1 = r0
            g10.e$a r1 = (g10.C59344e.C59345a) r1
            int r2 = r1.f169645h
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.f169645h = r2
            r2 = r16
            goto L_0x001e
        L_0x0017:
            g10.e$a r1 = new g10.e$a
            r2 = r16
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r0 = r1.f169643f
            xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
            int r4 = r1.f169645h
            r5 = 1
            if (r4 == 0) goto L_0x003b
            if (r4 != r5) goto L_0x0033
            long r3 = r1.f169641d
            java.lang.Object r1 = r1.f169642e
            l10.d r1 = (l10.C61185d) r1
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x009c
        L_0x0033:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003b:
            kotlin.ResultKt.throwOnFailure(r0)
            l10.d r0 = new l10.d
            r0.<init>()
            boolean r4 = f10.C45736a.m51015a(r17)
            if (r4 == 0) goto L_0x0051
            java.lang.String r1 = "MicroMsg.FinderDataSource"
            java.lang.String r3 = "do not show finder cause in black list!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
            return r0
        L_0x0051:
            r1.f169642e = r0
            r6 = r18
            r1.f169641d = r6
            r1.f169645h = r5
            a14.m r4 = new a14.m
            wx3.d r1 = xx3.C66447b.m78392b(r1)
            r4.<init>(r1, r5)
            r4.mo74609p()
            jp3.c r10 = new jp3.c
            r10.<init>()
            g10.a r1 = new g10.a
            r1.<init>(r10)
            r4.mo74599v(r1)
            java.lang.Class<ht1.t1> r1 = ht1.C60200t1.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            java.lang.String r8 = "getService(IFinderCommon…atureService::class.java)"
            gy3.C87412m.m108593f(r1, r8)
            r8 = r1
            ht1.t1 r8 = (ht1.C60200t1) r8
            g10.b r11 = new g10.b
            r11.<init>(r4)
            g10.c r12 = new g10.c
            r12.<init>(r4)
            r13 = 0
            r14 = 0
            r9 = r17
            r8.sv0(r9, r10, r11, r12, r13, r14)
            java.lang.Object r1 = r4.mo74608o()
            if (r1 != r3) goto L_0x0098
            return r3
        L_0x0098:
            r3 = r6
            r15 = r1
            r1 = r0
            r0 = r15
        L_0x009c:
            te3.fp4 r0 = (te3.fp4) r0
            r6 = 0
            r1.f174179d = r6
            com.tencent.mm.protocal.protobuf.FinderContact r7 = r0.f133628d
            if (r7 == 0) goto L_0x00bc
            l10.a r8 = new l10.a
            r8.<init>()
            java.lang.String r9 = r7.nickname
            r8.f174161d = r9
            java.lang.String r9 = r7.username
            r8.f174162e = r9
            java.lang.String r9 = r7.headUrl
            r8.f174163f = r9
            java.lang.String r7 = r7.signature
            r8.f174164g = r7
            r1.f174180e = r8
        L_0x00bc:
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r3
            r3 = 1000(0x3e8, float:1.401E-42)
            long r3 = (long) r3
            long r7 = r7 / r3
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r0 = r0.f133630f
            java.lang.String r3 = "profile.objects"
            gy3.C87412m.m108593f(r0, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x00d5:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x00f2
            java.lang.Object r4 = r0.next()
            r9 = r4
            com.tencent.mm.protocal.protobuf.FinderObject r9 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r9
            int r9 = r9.createtime
            long r9 = (long) r9
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 <= 0) goto L_0x00eb
            r9 = 1
            goto L_0x00ec
        L_0x00eb:
            r9 = 0
        L_0x00ec:
            if (r9 == 0) goto L_0x00d5
            r3.add(r4)
            goto L_0x00d5
        L_0x00f2:
            java.util.Iterator r0 = r3.iterator()
        L_0x00f6:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0111
            java.lang.Object r3 = r0.next()
            com.tencent.mm.protocal.protobuf.FinderObject r3 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r3
            java.lang.String r4 = "finderObject"
            gy3.C87412m.m108593f(r3, r4)
            l10.b r3 = g10.C59346f.m69264a(r3)
            java.util.LinkedList<l10.b> r4 = r1.f174181f
            r4.add(r3)
            goto L_0x00f6
        L_0x0111:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g10.C59344e.mo84455a(java.lang.String, long, wx3.d):java.lang.Object");
    }
}
