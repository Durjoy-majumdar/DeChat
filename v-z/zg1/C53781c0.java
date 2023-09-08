package zg1;

import cj1.C54847z3;
import fj1.C45795b;
import gy3.C87412m;
import te3.C50432mp2;
import te3.C52137ym1;
import yg1.C16006g;

/* renamed from: zg1.c0 */
public final class C53781c0 extends C16006g {

    /* renamed from: c */
    public final String f150946c = "LiveProductReplayUpdateInterceptor";

    /* renamed from: zg1.c0$a */
    public static final class C53782a extends C54847z3.C54849b<C52137ym1> {

        /* renamed from: b */
        public final /* synthetic */ C53781c0 f150947b;

        /* renamed from: c */
        public final /* synthetic */ C50432mp2 f150948c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53782a(C53781c0 c0Var, C50432mp2 mp22, Class<C52137ym1> cls) {
            super(cls);
            this.f150947b = c0Var;
            this.f150948c = mp22;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: te3.fp1} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: te3.fp1} */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0033, code lost:
            r8 = r4.f183160E;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo9116a(pe3.C47465a r22) {
            /*
                r21 = this;
                r0 = r21
                r1 = r22
                te3.ym1 r1 = (te3.C52137ym1) r1
                java.lang.Class<ak1.o> r2 = ak1.C54108o.class
                java.lang.Class<cl1.h1> r3 = cl1.C54979h1.class
                java.lang.String r4 = "result"
                gy3.C87412m.m108594g(r1, r4)
                zg1.c0 r4 = r0.f150947b
                java.lang.String r4 = r4.f150946c
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "[onPollingSuccess], result:"
                r5.append(r6)
                org.json.JSONObject r6 = o40.C61937h.m72709h(r1)
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
                te3.fp1 r4 = r1.f145400d
                r5 = 1000(0x3e8, float:1.401E-42)
                r6 = 1
                r7 = 0
                if (r4 == 0) goto L_0x003d
                te3.yh3 r8 = r4.f183160E
                if (r8 == 0) goto L_0x003d
                int r8 = r8.f186537i
                if (r8 != r5) goto L_0x003d
                r8 = 1
                goto L_0x003e
            L_0x003d:
                r8 = 0
            L_0x003e:
                if (r8 == 0) goto L_0x004b
                zg1.c0 r1 = r0.f150947b
                java.lang.String r1 = r1.f150946c
                java.lang.String r2 = "[onPollingSuccess], status is recording, return"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
                goto L_0x01fb
            L_0x004b:
                r8 = 2
                if (r4 == 0) goto L_0x0058
                te3.yh3 r9 = r4.f183160E
                if (r9 == 0) goto L_0x0058
                int r9 = r9.f186537i
                if (r9 != r8) goto L_0x0058
                r9 = 1
                goto L_0x0059
            L_0x0058:
                r9 = 0
            L_0x0059:
                if (r9 == 0) goto L_0x0099
                if (r4 == 0) goto L_0x0068
                te3.yh3 r4 = r4.f183160E
                if (r4 == 0) goto L_0x0068
                int r9 = r4.f186535g
                int r4 = r4.f186534f
                int r9 = r9 - r4
                r15 = r9
                goto L_0x0069
            L_0x0068:
                r15 = 0
            L_0x0069:
                di3.d r4 = di3.C86312j.m106911c(r2)
                r10 = r4
                ak1.o r10 = (ak1.C54108o) r10
                r11 = 3
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r4 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                androidx.lifecycle.i0 r4 = r4.mo77630e(r3)
                cl1.h1 r4 = (cl1.C54979h1) r4
                if (r4 == 0) goto L_0x0083
                te3.gj1 r4 = r4.f154113E
                if (r4 == 0) goto L_0x0083
                int r4 = r4.f183344e
                r12 = r4
                goto L_0x0084
            L_0x0083:
                r12 = 0
            L_0x0084:
                te3.fp1 r4 = r1.f145400d
                if (r4 == 0) goto L_0x008b
                long r13 = r4.f183176d
                goto L_0x008d
            L_0x008b:
                r13 = 0
            L_0x008d:
                r10.Tx0(r11, r12, r13, r15)
                cj1.z3 r4 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159383n
                te3.mp2 r9 = r0.f150948c
                int r9 = r9.f138144d
                r4.mo75800f(r9)
            L_0x0099:
                java.lang.String r4 = r1.f145401e
                if (r4 == 0) goto L_0x00d1
                zg1.c0 r9 = r0.f150947b
                int r10 = r4.length()
                if (r10 <= 0) goto L_0x00a7
                r10 = 1
                goto L_0x00a8
            L_0x00a7:
                r10 = 0
            L_0x00a8:
                if (r10 == 0) goto L_0x00d1
                java.lang.String r9 = r9.f150946c
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "update request id: "
                r10.append(r11)
                r10.append(r4)
                java.lang.String r10 = r10.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r9 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                java.lang.Class<cl1.o> r10 = cl1.C54991o.class
                androidx.lifecycle.i0 r9 = r9.mo77630e(r10)
                cl1.o r9 = (cl1.C54991o) r9
                if (r9 != 0) goto L_0x00ce
                goto L_0x00d1
            L_0x00ce:
                r9.mo75961G4(r4)
            L_0x00d1:
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r4 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                androidx.lifecycle.i0 r4 = r4.mo77630e(r3)
                cl1.h1 r4 = (cl1.C54979h1) r4
                java.lang.String r9 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.convert.ShopWindowShelfProductItem"
                r10 = 10
                if (r4 == 0) goto L_0x0138
                p40.a<cm1.i2> r4 = r4.f154140o
                if (r4 == 0) goto L_0x0138
                zg1.b0 r12 = zg1.C16167b0.f43358d
                java.util.List r4 = r4.mo87251b(r12)
                java.util.ArrayList r12 = new java.util.ArrayList
                int r13 = sx3.C36907w.m41090l(r4, r10)
                r12.<init>(r13)
                java.util.ArrayList r4 = (java.util.ArrayList) r4
                java.util.Iterator r4 = r4.iterator()
            L_0x00f8:
                boolean r13 = r4.hasNext()
                if (r13 == 0) goto L_0x010f
                java.lang.Object r13 = r4.next()
                cm1.i2 r13 = (cm1.C0740i2) r13
                gy3.C87412m.m108592e(r13, r9)
                sk1.x r13 = (sk1.C63965x) r13
                te3.fp1 r13 = r13.f181346s
                r12.add(r13)
                goto L_0x00f8
            L_0x010f:
                java.util.Iterator r4 = r12.iterator()
            L_0x0113:
                boolean r12 = r4.hasNext()
                if (r12 == 0) goto L_0x0134
                java.lang.Object r12 = r4.next()
                r13 = r12
                te3.fp1 r13 = (te3.C64370fp1) r13
                te3.fp1 r14 = r1.f145400d
                r15 = r12
                if (r14 == 0) goto L_0x012f
                long r11 = r13.f183176d
                long r13 = r14.f183176d
                int r16 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r16 != 0) goto L_0x012f
                r11 = 1
                goto L_0x0130
            L_0x012f:
                r11 = 0
            L_0x0130:
                if (r11 == 0) goto L_0x0113
                r12 = r15
                goto L_0x0135
            L_0x0134:
                r12 = 0
            L_0x0135:
                te3.fp1 r12 = (te3.C64370fp1) r12
                goto L_0x0139
            L_0x0138:
                r12 = 0
            L_0x0139:
                if (r12 == 0) goto L_0x019d
                te3.yh3 r4 = r12.f183160E
                if (r4 == 0) goto L_0x019d
                int r11 = r4.f186537i
                if (r11 != r5) goto L_0x0145
                r5 = 1
                goto L_0x0146
            L_0x0145:
                r5 = 0
            L_0x0146:
                if (r5 == 0) goto L_0x0149
                goto L_0x014a
            L_0x0149:
                r4 = 0
            L_0x014a:
                if (r4 == 0) goto L_0x019d
                te3.fp1 r4 = r1.f145400d
                if (r4 == 0) goto L_0x019d
                te3.yh3 r4 = r4.f183160E
                if (r4 == 0) goto L_0x019d
                r5 = 3
                java.lang.Integer[] r5 = new java.lang.Integer[r5]
                java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
                r5[r7] = r11
                java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
                r5[r6] = r7
                r6 = 100
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r5[r8] = r6
                java.util.List r5 = sx3.C64197v.m75537f(r5)
                int r6 = r4.f186537i
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                boolean r5 = r5.contains(r6)
                if (r5 == 0) goto L_0x017c
                goto L_0x017d
            L_0x017c:
                r4 = 0
            L_0x017d:
                if (r4 == 0) goto L_0x019d
                di3.d r2 = di3.C86312j.m106911c(r2)
                java.lang.String r4 = "getService(HellLiveReport::class.java)"
                gy3.C87412m.m108593f(r2, r4)
                r13 = r2
                ak1.o r13 = (ak1.C54108o) r13
                r14 = 7
                r15 = 0
                r16 = 0
                r18 = 0
                r19 = 12
                r20 = 0
                ak1.C54108o.Ux0(r13, r14, r15, r16, r18, r19, r20)
                zg1.a0 r2 = zg1.C16165a0.f43357d
                o40.C61926c.m72668M(r2)
            L_0x019d:
                if (r12 == 0) goto L_0x01a9
                te3.fp1 r1 = r1.f145400d
                if (r1 == 0) goto L_0x01a6
                te3.yh3 r1 = r1.f183160E
                goto L_0x01a7
            L_0x01a6:
                r1 = 0
            L_0x01a7:
                r12.f183160E = r1
            L_0x01a9:
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                androidx.lifecycle.i0 r1 = r1.mo77630e(r3)
                cl1.h1 r1 = (cl1.C54979h1) r1
                if (r1 == 0) goto L_0x01ec
                p40.a<cm1.i2> r2 = r1.f154140o
                java.lang.String r3 = "value"
                gy3.C87412m.m108594g(r2, r3)
                cl1.m1 r3 = cl1.C0672m1.f1583d
                java.util.List r3 = r2.mo87251b(r3)
                java.util.ArrayList r4 = new java.util.ArrayList
                int r5 = sx3.C36907w.m41090l(r3, r10)
                r4.<init>(r5)
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                java.util.Iterator r3 = r3.iterator()
            L_0x01d0:
                boolean r5 = r3.hasNext()
                if (r5 == 0) goto L_0x01e7
                java.lang.Object r5 = r3.next()
                cm1.i2 r5 = (cm1.C0740i2) r5
                gy3.C87412m.m108592e(r5, r9)
                sk1.x r5 = (sk1.C63965x) r5
                te3.fp1 r5 = r5.f181346s
                r4.add(r5)
                goto L_0x01d0
            L_0x01e7:
                r1.mo75942i3(r4)
                r1.f154140o = r2
            L_0x01ec:
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                r1.getClass()
                com.tencent.mm.plugin.finder.live.view.b r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159379g
                if (r1 == 0) goto L_0x01fb
                d60.b$b r2 = d60.C58124b.C58125b.FINDER_LIVE_SHOPPING_LIST_UPDATE
                r3 = 0
                r1.statusChange(r2, r3)
            L_0x01fb:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zg1.C53781c0.C53782a.mo9116a(pe3.a):void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53781c0(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14632d(java.util.LinkedList<te3.C52013xs0> r8) {
        /*
            r7 = this;
            java.lang.String r0 = "msgList"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.Object r8 = sx3.C110818d0.m150925W(r8)
            te3.xs0 r8 = (te3.C52013xs0) r8
            if (r8 == 0) goto L_0x0079
            te3.mp2 r0 = new te3.mp2
            r0.<init>()
            pe3.b r8 = r8.f144906h
            r1 = 0
            if (r8 == 0) goto L_0x001c
            byte[] r8 = r8.mo123703f()
            goto L_0x001d
        L_0x001c:
            r8 = r1
        L_0x001d:
            r2 = 0
            if (r8 != 0) goto L_0x0022
        L_0x0020:
            r0 = r1
            goto L_0x0034
        L_0x0022:
            r0.parseFrom(r8)     // Catch:{ Exception -> 0x0026 }
            goto L_0x0034
        L_0x0026:
            r8 = move-exception
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r8
            java.lang.String r8 = "safeParser"
            java.lang.String r3 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r8, r3, r0)
            goto L_0x0020
        L_0x0034:
            if (r0 == 0) goto L_0x0079
            te3.xm1 r8 = new te3.xm1
            r8.<init>()
            long r3 = r0.f138145e
            r8.f144748d = r3
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            java.lang.Class<cl1.o> r4 = cl1.C54991o.class
            androidx.lifecycle.i0 r4 = r3.mo77630e(r4)
            cl1.o r4 = (cl1.C54991o) r4
            if (r4 == 0) goto L_0x004d
            java.lang.String r1 = r4.f154318g2
        L_0x004d:
            r8.f144749e = r1
            java.lang.String r1 = r7.f150946c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "start SyncGoods "
            r4.append(r5)
            long r5 = r0.f138145e
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
            r3.getClass()
            cj1.z3 r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159383n
            int r3 = r0.f138144d
            java.lang.Class<te3.ym1> r4 = te3.C52137ym1.class
            zg1.c0$a r5 = new zg1.c0$a
            r5.<init>(r7, r0, r4)
            r1.mo75799e(r3, r8, r5, r2)
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zg1.C53781c0.mo14632d(java.util.LinkedList):void");
    }

    /* renamed from: g */
    public int[] mo14635g() {
        return new int[]{20054};
    }
}
