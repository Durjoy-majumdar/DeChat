package xx0;

import a14.C0000n0;
import fy3.C32224a;
import fy3.C32227p;
import rx3.C13598b0;
import te3.zg4;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.brandservice.ui.timeline.preload.resdownload.LocalTmplInfoManager$downloadTmpl$1", mo125469f = "LocalTmplInfoManager.kt", mo125470l = {641}, mo125471m = "invokeSuspend")
/* renamed from: xx0.e */
public final class C53463e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f150375d;

    /* renamed from: e */
    public int f150376e;

    /* renamed from: f */
    public final /* synthetic */ zg4 f150377f;

    /* renamed from: g */
    public final /* synthetic */ int f150378g;

    /* renamed from: h */
    public final /* synthetic */ C32224a<C13598b0> f150379h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53463e(zg4 zg4, int i, C32224a<C13598b0> aVar, C15601d<? super C53463e> dVar) {
        super(2, dVar);
        this.f150377f = zg4;
        this.f150378g = i;
        this.f150379h = aVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C53463e(this.f150377f, this.f150378g, this.f150379h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C53463e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x04a2  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x06ad  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x06bd  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x06c0  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x071f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x022b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            r26 = this;
            r1 = r26
            xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
            int r0 = r1.f150376e
            r3 = 0
            r4 = 1
            java.lang.String r5 = ""
            java.lang.String r6 = "MicroMsg.Preload.TmplInfoManager"
            if (r0 == 0) goto L_0x0024
            if (r0 != r4) goto L_0x001c
            java.lang.Object r0 = r1.f150375d
            java.util.HashMap r0 = (java.util.HashMap) r0
            kotlin.ResultKt.throwOnFailure(r27)
            r7 = r0
            r0 = r27
            goto L_0x0102
        L_0x001c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0024:
            kotlin.ResultKt.throwOnFailure(r27)
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            te3.zg4 r0 = r1.f150377f
            java.lang.String r9 = r0.f145939f
            java.util.LinkedList<te3.yg4> r0 = r0.f145943j
            java.lang.String r8 = "tmplInfo.HttpHeaderList"
            gy3.C87412m.m108593f(r0, r8)
            java.util.Iterator r0 = r0.iterator()
        L_0x003c:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x007a
            java.lang.Object r8 = r0.next()
            te3.yg4 r8 = (te3.yg4) r8
            java.lang.String r10 = r8.f145293d
            if (r10 == 0) goto L_0x0055
            int r10 = r10.length()
            if (r10 != 0) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r10 = 0
            goto L_0x0056
        L_0x0055:
            r10 = 1
        L_0x0056:
            if (r10 != 0) goto L_0x003c
            java.lang.String r10 = r8.f145294e
            if (r10 == 0) goto L_0x0065
            int r10 = r10.length()
            if (r10 != 0) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r10 = 0
            goto L_0x0066
        L_0x0065:
            r10 = 1
        L_0x0066:
            if (r10 != 0) goto L_0x003c
            java.lang.String r10 = r8.f145293d
            java.lang.String r11 = "it.Key"
            gy3.C87412m.m108593f(r10, r11)
            java.lang.String r8 = r8.f145294e
            java.lang.String r11 = "it.Value"
            gy3.C87412m.m108593f(r8, r11)
            r7.put(r10, r8)
            goto L_0x003c
        L_0x007a:
            te3.zg4 r0 = r1.f150377f
            boolean r0 = r0.f145944n
            if (r0 == 0) goto L_0x0105
            xx0.b r0 = xx0.C53458b.f150358a
            java.lang.String r0 = "downloadUrl"
            gy3.C87412m.m108593f(r9, r0)
            r1.f150375d = r7
            r1.f150376e = r4
            wx3.h r15 = new wx3.h
            wx3.d r0 = xx3.C66447b.m78392b(r26)
            r15.<init>(r0)
            java.lang.Class<vs.d> r0 = p728vs.C52990d.class
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x00e2 }
            r8 = r0
            vs.d r8 = (p728vs.C52990d) r8     // Catch:{ Exception -> 0x00e2 }
            java.lang.String r10 = ""
            r11 = 0
            r12 = 8
            int r13 = qe3.C12212g.m11775a()     // Catch:{ Exception -> 0x00e2 }
            byte[] r14 = new byte[r3]     // Catch:{ Exception -> 0x00e2 }
            vs.e r0 = r8.mo73579xD(r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x00e2 }
            java.lang.String r8 = "null cannot be cast to non-null type com.tencent.mm.modelbase.NetSceneBase"
            gy3.C87412m.m108592e(r0, r8)     // Catch:{ Exception -> 0x00e2 }
            ob0.y r0 = (ob0.C117747y) r0     // Catch:{ Exception -> 0x00e2 }
            f40.g r8 = f40.C86709a0.m107529k()     // Catch:{ Exception -> 0x00e2 }
            ob0.b0 r8 = r8.f251779b     // Catch:{ Exception -> 0x00e2 }
            com.tencent.mm.network.g r8 = r8.f256809d     // Catch:{ Exception -> 0x00e2 }
            xx0.f r9 = new xx0.f     // Catch:{ Exception -> 0x00e2 }
            r9.<init>(r15, r7)     // Catch:{ Exception -> 0x00e2 }
            int r0 = r0.doScene(r8, r9)     // Catch:{ Exception -> 0x00e2 }
            if (r0 >= 0) goto L_0x00fb
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e2 }
            r8.<init>()     // Catch:{ Exception -> 0x00e2 }
            java.lang.String r9 = "NetSceneGetA8Key dispatch fail "
            r8.append(r9)     // Catch:{ Exception -> 0x00e2 }
            r8.append(r0)     // Catch:{ Exception -> 0x00e2 }
            java.lang.String r0 = r8.toString()     // Catch:{ Exception -> 0x00e2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)     // Catch:{ Exception -> 0x00e2 }
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r5)     // Catch:{ Exception -> 0x00e2 }
            r15.resumeWith(r0)     // Catch:{ Exception -> 0x00e2 }
            goto L_0x00fb
        L_0x00e2:
            r0 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "getUrlWithA8key ex:"
            r8.append(r9)
            java.lang.String r0 = r0.getMessage()
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
        L_0x00fb:
            java.lang.Object r0 = r15.mo90314b()
            if (r0 != r2) goto L_0x0102
            return r2
        L_0x0102:
            r9 = r0
            java.lang.String r9 = (java.lang.String) r9
        L_0x0105:
            te3.zg4 r2 = r1.f150377f
            int r8 = r1.f150378g
            fy3.a<rx3.b0> r10 = r1.f150379h
            if (r9 == 0) goto L_0x0116
            int r0 = r9.length()
            if (r0 != 0) goto L_0x0114
            goto L_0x0116
        L_0x0114:
            r0 = 0
            goto L_0x0117
        L_0x0116:
            r0 = 1
        L_0x0117:
            if (r0 != 0) goto L_0x071f
            xx0.b r11 = xx0.C53458b.f150358a
            java.lang.String r0 = "fullUrl"
            gy3.C87412m.m108593f(r9, r0)
            boolean r0 = z04.C112551y.m153811k(r9)
            if (r0 == 0) goto L_0x0128
            goto L_0x073a
        L_0x0128:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r0 != 0) goto L_0x0137
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
            if (r0 != 0) goto L_0x0137
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r0 == 0) goto L_0x0135
            goto L_0x0137
        L_0x0135:
            r0 = 0
            goto L_0x0138
        L_0x0137:
            r0 = 1
        L_0x0138:
            java.lang.Class<h81.h> r12 = h81.C32735h.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            h81.h r12 = (h81.C32735h) r12
            h81.h$c r13 = h81.C32735h.C32737c.clicfg_webview_mp_template_fallback_cache
            int r12 = r12.mo58779Qe(r13, r3)
            if (r12 != r4) goto L_0x014a
            r12 = 1
            goto L_0x014b
        L_0x014a:
            r12 = 0
        L_0x014b:
            r0 = r0 | r12
            java.lang.String r12 = "/origin.zip"
            java.lang.String r13 = "uid"
            if (r0 != 0) goto L_0x015b
            java.lang.String r0 = "template fall back not enable"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            goto L_0x01fc
        L_0x015b:
            java.lang.String r0 = r2.f145945o
            int r14 = r2.f145937d
            gy3.C87412m.m108593f(r0, r13)
            java.lang.String r15 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40715i0.m43972b(r14, r0, r5)
            java.lang.String r3 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40715i0.m43971a(r14, r0)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r15)
            r4.append(r12)
            java.lang.String r4 = r4.toString()
            boolean r15 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40716j0.m43980h(r4)
            if (r15 != 0) goto L_0x018b
            boolean r15 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40716j0.m43980h(r3)
            if (r15 != 0) goto L_0x018b
            r0 = 211(0xd3, float:2.96E-43)
            g93.C32355a.m39691c(r0)
            goto L_0x01fc
        L_0x018b:
            r15 = 212(0xd4, float:2.97E-43)
            g93.C32355a.m39691c(r15)
            boolean r15 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40716j0.m43980h(r3)
            if (r15 == 0) goto L_0x01bd
            java.lang.String r15 = r2.f145940g
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
            r1.<init>((java.lang.String) r3)
            boolean r1 = r11.mo74097p(r15, r1)
            if (r1 == 0) goto L_0x01bd
            r0 = 213(0xd5, float:2.98E-43)
            g93.C32355a.m39691c(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "hit cache single file:"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            goto L_0x01f5
        L_0x01bd:
            java.lang.String r1 = "index.html"
            java.lang.String r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40715i0.m43972b(r14, r0, r1)
            boolean r1 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40716j0.m43980h(r4)
            if (r1 == 0) goto L_0x01f7
            java.lang.String r1 = r2.f145940g
            com.tencent.mm.vfs.m1 r3 = new com.tencent.mm.vfs.m1
            r3.<init>((java.lang.String) r4)
            boolean r1 = r11.mo74097p(r1, r3)
            if (r1 == 0) goto L_0x01f7
            boolean r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40716j0.m43980h(r0)
            if (r0 == 0) goto L_0x01f7
            r0 = 214(0xd6, float:3.0E-43)
            g93.C32355a.m39691c(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "hit cache zip file:"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
        L_0x01f5:
            r0 = 1
            goto L_0x01fd
        L_0x01f7:
            r0 = 215(0xd7, float:3.01E-43)
            g93.C32355a.m39691c(r0)
        L_0x01fc:
            r0 = 0
        L_0x01fd:
            if (r0 == 0) goto L_0x022b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "local file valid, "
            r0.append(r1)
            int r1 = r2.f145938e
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.String r1 = r2.f145945o
            r0.append(r1)
            java.lang.String r1 = ",  "
            r0.append(r1)
            int r1 = r2.f145937d
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            goto L_0x073a
        L_0x022b:
            java.lang.String r1 = r2.f145945o
            int r3 = r2.f145942i
            int r4 = r2.f145937d
            int r14 = r2.f145938e
            long r18 = java.lang.System.currentTimeMillis()
            r15 = 3
            r27 = r10
            r10 = 1
            g93.C32355a.m39690b(r3, r15, r10, r10)
            gy3.C87412m.m108593f(r1, r13)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r10 = xx0.C53458b.m59915j()
            r0.append(r10)
            r0.append(r4)
            r10 = 95
            r0.append(r10)
            r0.append(r1)
            java.lang.String r10 = ".fd"
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            rx3.g r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40716j0.f109362a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r13 = "genTmplPath() genTmplFDPath:"
            r0.append(r13)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.String r13 = "MicroMsg.TmplInfoEx"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r13, r0)
            xx0.b$a r0 = r11.mo74091f(r3, r9, r7, r10)     // Catch:{ Exception -> 0x027f }
        L_0x027d:
            r7 = r0
            goto L_0x028f
        L_0x027f:
            r0 = move-exception
            r7 = r0
            xx0.b$a r0 = new xx0.b$a
            r0.<init>()
            r9 = 0
            java.lang.Object[] r13 = new java.lang.Object[r9]
            java.lang.String r9 = "downloadTmpl"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r7, r9, r13)
            goto L_0x027d
        L_0x028f:
            java.lang.String r0 = r7.f150368b
            if (r0 == 0) goto L_0x029e
            boolean r0 = z04.C112551y.m153811k(r0)
            if (r0 == 0) goto L_0x029a
            goto L_0x029e
        L_0x029a:
            r9 = 1
            r17 = 0
            goto L_0x02a1
        L_0x029e:
            r9 = 1
            r17 = 1
        L_0x02a1:
            r13 = r17 ^ 1
            boolean r0 = r7.f150370d
            if (r0 == 0) goto L_0x02b3
            boolean r0 = r7.f150367a
            if (r0 == 0) goto L_0x02ae
            r0 = 234(0xea, float:3.28E-43)
            goto L_0x02b0
        L_0x02ae:
            r0 = 235(0xeb, float:3.3E-43)
        L_0x02b0:
            g93.C32355a.m39690b(r3, r0, r9, r9)
        L_0x02b3:
            boolean r0 = r7.f150367a
            if (r0 == 0) goto L_0x06cb
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
            r0.<init>((java.lang.String) r10)
            long r20 = r0.mo119980r()
            java.lang.String r9 = r7.f150368b
            if (r9 == 0) goto L_0x02cd
            boolean r9 = z04.C112551y.m153811k(r9)
            if (r9 == 0) goto L_0x02cb
            goto L_0x02cd
        L_0x02cb:
            r9 = 0
            goto L_0x02ce
        L_0x02cd:
            r9 = 1
        L_0x02ce:
            if (r9 != 0) goto L_0x046e
            java.lang.String r9 = r7.f150369c
            if (r9 == 0) goto L_0x02dd
            boolean r9 = z04.C112551y.m153811k(r9)
            if (r9 == 0) goto L_0x02db
            goto L_0x02dd
        L_0x02db:
            r9 = 0
            goto L_0x02de
        L_0x02dd:
            r9 = 1
        L_0x02de:
            if (r9 != 0) goto L_0x044a
            boolean r9 = r7.f150370d
            if (r9 == 0) goto L_0x02ea
            r9 = 237(0xed, float:3.32E-43)
            r15 = 1
            g93.C32355a.m39690b(r3, r9, r15, r15)
        L_0x02ea:
            java.lang.String r9 = r7.f150369c
            boolean r9 = r11.mo74097p(r9, r0)
            if (r9 == 0) goto L_0x0432
            boolean r9 = r7.f150370d
            if (r9 == 0) goto L_0x0303
            java.lang.String r9 = r7.f150368b
            gy3.C87412m.m108591d(r9)
            java.lang.String r15 = "origin.zip"
            java.lang.String r9 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40715i0.m43972b(r4, r9, r15)
            goto L_0x030c
        L_0x0303:
            java.lang.String r9 = r7.f150368b
            gy3.C87412m.m108591d(r9)
            java.lang.String r9 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40715i0.m43971a(r4, r9)
        L_0x030c:
            android.net.Uri r15 = com.tencent.p014mm.vfs.C116299g2.m163858n(r9)
            r22 = r8
            java.lang.String r8 = r15.getPath()
            r23 = r13
            if (r8 == 0) goto L_0x0335
            r13 = 0
            java.lang.String r8 = com.tencent.p014mm.vfs.C116299g2.m163855k(r8, r13, r13)
            java.lang.String r13 = r15.getPath()
            boolean r13 = r13.equals(r8)
            if (r13 != 0) goto L_0x0335
            android.net.Uri$Builder r13 = r15.buildUpon()
            android.net.Uri$Builder r8 = r13.path(r8)
            android.net.Uri r15 = r8.build()
        L_0x0335:
            com.tencent.mm.vfs.f0 r8 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r13 = 0
            com.tencent.mm.vfs.f0$h r15 = r8.mo177799l(r15, r13)
            boolean r13 = r15.mo177810a()
            if (r13 != 0) goto L_0x0344
            r13 = 0
            goto L_0x034c
        L_0x0344:
            com.tencent.mm.vfs.FileSystem$c r13 = r15.f348991a
            java.lang.String r15 = r15.f348992b
            boolean r13 = r13.mo119948x(r15)
        L_0x034c:
            if (r13 == 0) goto L_0x0417
            java.lang.String r13 = r2.f145940g
            java.lang.String r15 = "tmplInfo.Md5"
            gy3.C87412m.m108593f(r13, r15)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r9)
            r24 = r14
            java.lang.String r14 = ".patch"
            r15.append(r14)
            java.lang.String r14 = r15.toString()
            java.lang.Class<com.tencent.mm.plugin.appbrand.service.IBSPatchJNIService> r15 = com.tencent.p014mm.plugin.appbrand.service.IBSPatchJNIService.class
            di3.d r15 = di3.C86312j.m106911c(r15)
            com.tencent.mm.plugin.appbrand.service.IBSPatchJNIService r15 = (com.tencent.p014mm.plugin.appbrand.service.IBSPatchJNIService) r15
            r25 = r12
            java.lang.String r12 = r0.mo119971i()
            int r12 = r15.bspatch(r9, r14, r12)
            if (r12 != 0) goto L_0x03fb
            java.lang.String r12 = "[checkTmplVer] patch download success"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r12)
            android.net.Uri r12 = com.tencent.p014mm.vfs.C116299g2.m163858n(r14)
            java.lang.String r14 = r12.getPath()
            if (r14 == 0) goto L_0x03a7
            r15 = 0
            java.lang.String r14 = com.tencent.p014mm.vfs.C116299g2.m163855k(r14, r15, r15)
            java.lang.String r15 = r12.getPath()
            boolean r15 = r15.equals(r14)
            if (r15 != 0) goto L_0x03a7
            android.net.Uri$Builder r12 = r12.buildUpon()
            android.net.Uri$Builder r12 = r12.path(r14)
            android.net.Uri r12 = r12.build()
        L_0x03a7:
            java.lang.String r14 = com.tencent.p014mm.vfs.C116299g2.m163865u(r12)
            java.lang.String r14 = com.tencent.p014mm.vfs.C86013q1.m106456q(r14)
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r15 != 0) goto L_0x03cf
            boolean r13 = gy3.C87412m.m108589b(r14, r13)
            if (r13 == 0) goto L_0x03cf
            java.lang.String r8 = "[checkTmplVer] patch MD5 verify success"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r8)
            java.lang.String r8 = com.tencent.p014mm.vfs.C116299g2.m163865u(r12)
            java.lang.String r0 = r0.mo119976n()
            com.tencent.p014mm.vfs.C86013q1.m106463x(r8, r0)
            r8 = 1
            r17 = 1
            goto L_0x0408
        L_0x03cf:
            r0 = 0
            com.tencent.mm.vfs.f0$h r8 = r8.mo177799l(r12, r0)
            boolean r0 = r8.mo177810a()
            if (r0 == 0) goto L_0x03e1
            com.tencent.mm.vfs.FileSystem$c r0 = r8.f348991a
            java.lang.String r8 = r8.f348992b
            r0.mo119933c(r8)
        L_0x03e1:
            r0 = 228(0xe4, float:3.2E-43)
            r8 = 1
            g93.C32355a.m39690b(r3, r0, r8, r8)
            boolean r0 = r7.f150370d
            if (r0 == 0) goto L_0x03f0
            r0 = 240(0xf0, float:3.36E-43)
            g93.C32355a.m39690b(r3, r0, r8, r8)
        L_0x03f0:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r12 = 0
            r0[r12] = r9
            java.lang.String r9 = "checkTmpl %s MD5 not match after patch"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r9, r0)
            goto L_0x0406
        L_0x03fb:
            r8 = 1
            r0 = 222(0xde, float:3.11E-43)
            g93.C32355a.m39690b(r3, r0, r8, r8)
            java.lang.String r0 = "[checkTmplVer] patch fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
        L_0x0406:
            r17 = 0
        L_0x0408:
            boolean r0 = r7.f150370d
            if (r0 == 0) goto L_0x0413
            if (r17 != 0) goto L_0x0413
            r0 = 239(0xef, float:3.35E-43)
            g93.C32355a.m39690b(r3, r0, r8, r8)
        L_0x0413:
            r8 = r17
            goto L_0x049f
        L_0x0417:
            r25 = r12
            r24 = r14
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r12 = 0
            r0[r12] = r9
            java.lang.String r9 = "patch origin file not found:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r9, r0)
            boolean r0 = r7.f150370d
            if (r0 == 0) goto L_0x049e
            r0 = 238(0xee, float:3.34E-43)
            g93.C32355a.m39690b(r3, r0, r8, r8)
            goto L_0x049e
        L_0x0432:
            r22 = r8
            r25 = r12
            r23 = r13
            r24 = r14
            r8 = 1
            r0 = 220(0xdc, float:3.08E-43)
            g93.C32355a.m39690b(r3, r0, r8, r8)
            boolean r0 = r7.f150370d
            if (r0 == 0) goto L_0x049e
            r0 = 236(0xec, float:3.31E-43)
            g93.C32355a.m39690b(r3, r0, r8, r8)
            goto L_0x049e
        L_0x044a:
            r22 = r8
            r25 = r12
            r23 = r13
            r24 = r14
            r8 = 1
            r9 = 2
            java.lang.Object[] r0 = new java.lang.Object[r9]
            int r9 = r2.f145937d
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r12 = 0
            r0[r12] = r9
            java.lang.String r9 = r2.f145945o
            r0[r8] = r9
            java.lang.String r9 = "checkTmpl %d,%s, no patch MD5"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r9, r0)
            r0 = 229(0xe5, float:3.21E-43)
            g93.C32355a.m39690b(r3, r0, r8, r8)
            goto L_0x049e
        L_0x046e:
            r22 = r8
            r25 = r12
            r23 = r13
            r24 = r14
            r8 = 1
            java.lang.String r9 = r2.f145940g
            boolean r0 = r11.mo74097p(r9, r0)
            if (r0 == 0) goto L_0x0485
            java.lang.String r0 = "[checkTmplVer] download & MD5 verify success"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            goto L_0x049f
        L_0x0485:
            r9 = 6
            g93.C32355a.m39690b(r3, r9, r8, r8)
            r9 = 2
            java.lang.Object[] r0 = new java.lang.Object[r9]
            int r9 = r2.f145937d
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r12 = 0
            r0[r12] = r9
            java.lang.String r9 = r2.f145945o
            r0[r8] = r9
            java.lang.String r8 = "checkTmpl %d,%s MD5 not match"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r8, r0)
        L_0x049e:
            r8 = 0
        L_0x049f:
            r9 = 4
            if (r8 == 0) goto L_0x06ad
            boolean r0 = r7.f150370d
            if (r0 == 0) goto L_0x0555
            java.lang.String r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40715i0.m43972b(r4, r1, r5)     // Catch:{ Exception -> 0x052e }
            r11.mo74095n(r10, r0)     // Catch:{ Exception -> 0x052e }
            android.net.Uri r5 = com.tencent.p014mm.vfs.C116299g2.m163858n(r10)     // Catch:{ Exception -> 0x052e }
            java.lang.String r10 = r5.getPath()     // Catch:{ Exception -> 0x052e }
            if (r10 == 0) goto L_0x04d2
            r11 = 0
            java.lang.String r10 = com.tencent.p014mm.vfs.C116299g2.m163855k(r10, r11, r11)     // Catch:{ Exception -> 0x052e }
            java.lang.String r11 = r5.getPath()     // Catch:{ Exception -> 0x052e }
            boolean r11 = r11.equals(r10)     // Catch:{ Exception -> 0x052e }
            if (r11 != 0) goto L_0x04d2
            android.net.Uri$Builder r5 = r5.buildUpon()     // Catch:{ Exception -> 0x052e }
            android.net.Uri$Builder r5 = r5.path(r10)     // Catch:{ Exception -> 0x052e }
            android.net.Uri r5 = r5.build()     // Catch:{ Exception -> 0x052e }
        L_0x04d2:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x052e }
            r10.<init>()     // Catch:{ Exception -> 0x052e }
            r10.append(r0)     // Catch:{ Exception -> 0x052e }
            r11 = r25
            r10.append(r11)     // Catch:{ Exception -> 0x052e }
            java.lang.String r0 = r10.toString()     // Catch:{ Exception -> 0x052e }
            android.net.Uri r0 = com.tencent.p014mm.vfs.C116299g2.m163858n(r0)     // Catch:{ Exception -> 0x052e }
            java.lang.String r10 = r0.getPath()     // Catch:{ Exception -> 0x052e }
            if (r10 == 0) goto L_0x0508
            r11 = 0
            java.lang.String r10 = com.tencent.p014mm.vfs.C116299g2.m163855k(r10, r11, r11)     // Catch:{ Exception -> 0x052e }
            java.lang.String r11 = r0.getPath()     // Catch:{ Exception -> 0x052e }
            boolean r11 = r11.equals(r10)     // Catch:{ Exception -> 0x052e }
            if (r11 != 0) goto L_0x0508
            android.net.Uri$Builder r0 = r0.buildUpon()     // Catch:{ Exception -> 0x052e }
            android.net.Uri$Builder r0 = r0.path(r10)     // Catch:{ Exception -> 0x052e }
            android.net.Uri r0 = r0.build()     // Catch:{ Exception -> 0x052e }
        L_0x0508:
            com.tencent.mm.vfs.f0 r10 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x052e }
            r11 = 0
            com.tencent.mm.vfs.f0$h r5 = r10.mo177799l(r5, r11)     // Catch:{ Exception -> 0x052e }
            com.tencent.mm.vfs.f0$h r0 = r10.mo177799l(r0, r11)     // Catch:{ Exception -> 0x052e }
            boolean r10 = r5.mo177810a()     // Catch:{ Exception -> 0x052e }
            if (r10 == 0) goto L_0x05c8
            boolean r10 = r0.mo177810a()     // Catch:{ Exception -> 0x052e }
            if (r10 != 0) goto L_0x0521
            goto L_0x05c8
        L_0x0521:
            com.tencent.mm.vfs.FileSystem$c r10 = r0.f348991a     // Catch:{ IOException -> 0x05c7 }
            java.lang.String r0 = r0.f348992b     // Catch:{ IOException -> 0x05c7 }
            com.tencent.mm.vfs.FileSystem$c r11 = r5.f348991a     // Catch:{ IOException -> 0x05c7 }
            java.lang.String r5 = r5.f348992b     // Catch:{ IOException -> 0x05c7 }
            r10.mo119946t(r0, r11, r5)     // Catch:{ IOException -> 0x05c7 }
            goto L_0x05c8
        L_0x052e:
            r0 = move-exception
            r5 = 241(0xf1, float:3.38E-43)
            r10 = 1
            g93.C32355a.m39690b(r3, r5, r10, r10)
            java.lang.String r5 = r7.f150368b
            if (r5 == 0) goto L_0x0542
            boolean r5 = z04.C112551y.m153811k(r5)
            if (r5 == 0) goto L_0x0540
            goto L_0x0542
        L_0x0540:
            r5 = 0
            goto L_0x0543
        L_0x0542:
            r5 = 1
        L_0x0543:
            if (r5 != 0) goto L_0x054a
            r5 = 242(0xf2, float:3.39E-43)
            g93.C32355a.m39690b(r3, r5, r10, r10)
        L_0x054a:
            r5 = 0
            java.lang.Object[] r10 = new java.lang.Object[r5]
            java.lang.String r11 = "zip"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r11, r10)
            goto L_0x05c9
        L_0x0555:
            r5 = 0
            java.lang.String r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40715i0.m43971a(r4, r1)
            android.net.Uri r10 = com.tencent.p014mm.vfs.C116299g2.m163858n(r10)
            java.lang.String r11 = r10.getPath()
            if (r11 == 0) goto L_0x057e
            java.lang.String r11 = com.tencent.p014mm.vfs.C116299g2.m163855k(r11, r5, r5)
            java.lang.String r5 = r10.getPath()
            boolean r5 = r5.equals(r11)
            if (r5 != 0) goto L_0x057e
            android.net.Uri$Builder r5 = r10.buildUpon()
            android.net.Uri$Builder r5 = r5.path(r11)
            android.net.Uri r10 = r5.build()
        L_0x057e:
            android.net.Uri r0 = com.tencent.p014mm.vfs.C116299g2.m163858n(r0)
            java.lang.String r5 = r0.getPath()
            if (r5 == 0) goto L_0x05a3
            r11 = 0
            java.lang.String r5 = com.tencent.p014mm.vfs.C116299g2.m163855k(r5, r11, r11)
            java.lang.String r11 = r0.getPath()
            boolean r11 = r11.equals(r5)
            if (r11 != 0) goto L_0x05a3
            android.net.Uri$Builder r0 = r0.buildUpon()
            android.net.Uri$Builder r0 = r0.path(r5)
            android.net.Uri r0 = r0.build()
        L_0x05a3:
            com.tencent.mm.vfs.f0 r5 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r11 = 0
            com.tencent.mm.vfs.f0$h r10 = r5.mo177799l(r10, r11)
            com.tencent.mm.vfs.f0$h r0 = r5.mo177799l(r0, r11)
            boolean r5 = r10.mo177810a()
            if (r5 == 0) goto L_0x05c8
            boolean r5 = r0.mo177810a()
            if (r5 != 0) goto L_0x05bb
            goto L_0x05c8
        L_0x05bb:
            com.tencent.mm.vfs.FileSystem$c r5 = r0.f348991a     // Catch:{  }
            java.lang.String r0 = r0.f348992b     // Catch:{  }
            com.tencent.mm.vfs.FileSystem$c r11 = r10.f348991a     // Catch:{  }
            java.lang.String r10 = r10.f348992b     // Catch:{  }
            r5.mo119946t(r0, r11, r10)     // Catch:{  }
            goto L_0x05c8
        L_0x05c7:
        L_0x05c8:
            r5 = 1
        L_0x05c9:
            long r10 = java.lang.System.currentTimeMillis()
            long r10 = r10 - r18
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifi((android.content.Context) r0)
            if (r0 == 0) goto L_0x05dd
            java.lang.String r0 = "wifi"
            goto L_0x0613
        L_0x05dd:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is5G(r0)
            if (r0 == 0) goto L_0x05ea
            java.lang.String r0 = "5g"
            goto L_0x0613
        L_0x05ea:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is4G(r0)
            if (r0 == 0) goto L_0x05f7
            java.lang.String r0 = "4g"
            goto L_0x0613
        L_0x05f7:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is3G(r0)
            if (r0 == 0) goto L_0x0604
            java.lang.String r0 = "3g"
            goto L_0x0613
        L_0x0604:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is2G(r0)
            if (r0 == 0) goto L_0x0611
            java.lang.String r0 = "2g"
            goto L_0x0613
        L_0x0611:
            java.lang.String r0 = "none"
        L_0x0613:
            r12 = 7
            java.lang.Object[] r13 = new java.lang.Object[r12]
            java.lang.Integer r14 = java.lang.Integer.valueOf(r24)
            r15 = 0
            r13[r15] = r14
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r23)
            r15 = 1
            r13[r15] = r14
            java.lang.Long r14 = java.lang.Long.valueOf(r10)
            r15 = 2
            r13[r15] = r14
            java.lang.Long r14 = java.lang.Long.valueOf(r20)
            r15 = 3
            r13[r15] = r14
            r13[r9] = r0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r4)
            r15 = 5
            r13[r15] = r14
            r14 = 6
            r13[r14] = r1
            java.lang.String r14 = "MicroMsg.Preload.Kv15870"
            java.lang.String r15 = "TemplateVersion:%d, IsDiffUpdate:%s, DownloadCostTime:%d, DownloadSize:%d NetworkType:%s tmplType:%d tmplUid:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r14, r15, r13)
            com.tencent.mm.plugin.report.service.n r13 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r14 = 15870(0x3dfe, float:2.2239E-41)
            r15 = 8
            java.lang.Object[] r15 = new java.lang.Object[r15]
            java.lang.Integer r18 = java.lang.Integer.valueOf(r24)
            r16 = 0
            r15[r16] = r18
            java.lang.Integer r18 = java.lang.Integer.valueOf(r23)
            r17 = 1
            r15[r17] = r18
            r19 = r13
            r12 = 3600000(0x36ee80, double:1.7786363E-317)
            long r10 = java.lang.Math.min(r10, r12)
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r11 = 2
            r15[r11] = r10
            java.lang.Long r10 = java.lang.Long.valueOf(r20)
            r11 = 3
            r15[r11] = r10
            r15[r9] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r10 = 5
            r15[r10] = r0
            r10 = 6
            r15[r10] = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r22)
            r10 = 7
            r15[r10] = r0
            r0 = r19
            r0.mo160131h(r14, r15)
            if (r5 == 0) goto L_0x06af
            te3.zg4 r0 = xx0.C53458b.m59913g(r4)
            int r0 = r0.f145938e
            if (r0 == 0) goto L_0x06a9
            int r2 = r2.f145938e
            if (r0 >= r2) goto L_0x06a1
            r0 = 12
            r5 = 1
            g93.C32355a.m39690b(r3, r0, r5, r5)
            goto L_0x06a9
        L_0x06a1:
            r5 = 1
            if (r0 <= r2) goto L_0x06a9
            r0 = 13
            g93.C32355a.m39690b(r3, r0, r5, r5)
        L_0x06a9:
            r27.invoke()
            goto L_0x06af
        L_0x06ad:
            r16 = 0
        L_0x06af:
            java.lang.String r0 = r7.f150368b
            if (r0 == 0) goto L_0x06b9
            boolean r0 = z04.C112551y.m153811k(r0)
            if (r0 == 0) goto L_0x06bb
        L_0x06b9:
            r16 = 1
        L_0x06bb:
            if (r16 != 0) goto L_0x06c0
            r0 = 224(0xe0, float:3.14E-43)
            goto L_0x06c2
        L_0x06c0:
            r0 = 226(0xe2, float:3.17E-43)
        L_0x06c2:
            r2 = 1
            g93.C32355a.m39690b(r3, r0, r2, r2)
            g93.C32355a.m39690b(r3, r9, r2, r2)
            r3 = r8
            goto L_0x06f0
        L_0x06cb:
            r16 = 0
            java.lang.String r0 = r7.f150368b
            if (r0 == 0) goto L_0x06da
            boolean r0 = z04.C112551y.m153811k(r0)
            if (r0 == 0) goto L_0x06d8
            goto L_0x06da
        L_0x06d8:
            r10 = 0
            goto L_0x06db
        L_0x06da:
            r10 = 1
        L_0x06db:
            if (r10 != 0) goto L_0x06e0
            r0 = 225(0xe1, float:3.15E-43)
            goto L_0x06e2
        L_0x06e0:
            r0 = 227(0xe3, float:3.18E-43)
        L_0x06e2:
            r2 = 1
            g93.C32355a.m39690b(r3, r0, r2, r2)
            r5 = 5
            g93.C32355a.m39690b(r3, r5, r2, r2)
            java.lang.String r0 = "[checkTmplVer] download fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            r3 = 0
        L_0x06f0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "isDownloadSuccess:"
            r0.append(r2)
            r0.append(r3)
            r2 = 32
            r0.append(r2)
            r0.append(r4)
            r2 = 44
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = " \n"
            r0.append(r1)
            java.lang.Exception r1 = r7.f150371e
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29770h0.m38873a(r6, r0)
            goto L_0x073a
        L_0x071f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "url is null or empty:"
            r0.append(r1)
            xx0.b r1 = xx0.C53458b.f150358a
            java.lang.String r1 = r1.mo74090e(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
        L_0x073a:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xx0.C53463e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
