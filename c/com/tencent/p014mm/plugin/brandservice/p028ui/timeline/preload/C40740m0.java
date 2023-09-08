package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload;

import ex0.C45696d;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C87413o;
import iy0.C46353a;
import java.util.Map;
import jy0.C46579a;
import rx3.C13598b0;
import rx3.C36570n;
import t73.C48555a;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.m0 */
public final class C40740m0 implements C46579a {

    /* renamed from: a */
    public final /* synthetic */ String f109448a;

    /* renamed from: b */
    public final /* synthetic */ C46353a f109449b;

    /* renamed from: c */
    public final /* synthetic */ String f109450c;

    /* renamed from: d */
    public final /* synthetic */ Map<String, String> f109451d;

    /* renamed from: e */
    public final /* synthetic */ C48555a f109452e;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.m0$a */
    public static final class C40741a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C46353a f109453d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40741a(C46353a aVar) {
            super(1);
            this.f109453d = aVar;
        }

        public Object invoke(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                ((C45696d) C86709a0.m107533q(C45696d.class)).mo70968P2(this.f109453d.mo71774p(), (String) ((C36570n) this.f109453d.f124933o).getValue(), "itemExpose", (String) null);
            }
            return C13598b0.f38549a;
        }
    }

    public C40740m0(String str, C46353a aVar, String str2, Map<String, String> map, C48555a aVar2) {
        this.f109448a = str;
        this.f109449b = aVar;
        this.f109450c = str2;
        this.f109451d = map;
        this.f109452e = aVar2;
    }

    /* JADX WARNING: type inference failed for: r5v25, types: [pe3.a] */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x031c, code lost:
        if (gy3.C87412m.m108589b(r8.f132428i, r0 != null ? r0.f138918f : null) == false) goto L_0x031e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x026a, code lost:
        if (gy3.C87412m.m108589b(r12.mo71775q(), r12.mo71761c()) != false) goto L_0x034b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0350  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo63641a(boolean r28, int r29, java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r30) {
        /*
            r27 = this;
            r1 = r27
            r0 = r29
            r2 = r30
            java.lang.String r3 = "headers"
            gy3.C87412m.m108594g(r2, r3)
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r28)
            r5 = 0
            r3[r5] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r29)
            r6 = 1
            r3[r6] = r4
            int r4 = r30.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7 = 2
            r3[r7] = r4
            java.lang.String r4 = r1.f109448a
            r7 = 3
            r3[r7] = r4
            java.lang.String r4 = "MicroMsg.WebPrefetcher"
            java.lang.String r7 = "fetchContent success: %s, responseCode: %s, header size: %s, url: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r7, r3)
            java.lang.String r3 = "fetchContent"
            com.tencent.p014mm.plugin.brandservice.webprefetcher.debug.C40819a.m44118d(r2, r3)
            r2 = 0
            if (r28 == 0) goto L_0x009f
            r3 = 302(0x12e, float:4.23E-43)
            if (r0 == r3) goto L_0x0043
            r3 = 301(0x12d, float:4.22E-43)
            if (r0 != r3) goto L_0x009f
        L_0x0043:
            iy0.a r0 = r1.f109449b
            java.lang.String r0 = r0.mo71771m()
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0051
            r0 = 1
            goto L_0x0052
        L_0x0051:
            r0 = 0
        L_0x0052:
            if (r0 == 0) goto L_0x009f
            java.lang.Object[] r0 = new java.lang.Object[r6]
            iy0.a r3 = r1.f109449b
            java.lang.String r3 = r3.mo71771m()
            r0[r5] = r3
            java.lang.String r3 = "fetchContent success redirect to %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r3, r0)
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0 r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0.f109363a
            ny0.b$a r3 = new ny0.b$a
            iy0.a r7 = r1.f109449b
            java.lang.String r8 = r7.mo71771m()
            r13 = 0
            iy0.a r7 = r1.f109449b
            int r14 = r7.mo71763e()
            iy0.a r7 = r1.f109449b
            int r15 = r7.mo71777s()
            java.lang.String r12 = r1.f109448a
            r17 = 0
            r18 = 0
            r19 = 1568(0x620, float:2.197E-42)
            r20 = 0
            java.lang.String r9 = ""
            java.lang.String r10 = ""
            java.lang.String r11 = ""
            java.lang.String r16 = ""
            r7 = r3
            r21 = r12
            r12 = r16
            r16 = r21
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            java.util.List r3 = sx3.C26236u.m33719b(r3)
            r7 = 0
            r0.mo63621n(r3, r7, r2)
        L_0x009f:
            if (r28 == 0) goto L_0x044e
            iy0.a r0 = r1.f109449b
            boolean r3 = r0.f124927i
            java.lang.String r7 = ""
            if (r3 == 0) goto L_0x03eb
            java.lang.String r0 = r0.mo71769k()
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x00b5
            r0 = 1
            goto L_0x00b6
        L_0x00b5:
            r0 = 0
        L_0x00b6:
            if (r0 == 0) goto L_0x03eb
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0 r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0.f109363a
            iy0.a r3 = new iy0.a
            iy0.a r8 = r1.f109449b
            java.lang.String r9 = r8.mo71769k()
            iy0.a r8 = r1.f109449b
            java.lang.String r8 = r8.mo71769k()
            java.lang.String r10 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40714i.m43960i(r8, r5)
            t73.b r11 = t73.C48558d.f129904Q
            r0.getClass()
            com.tencent.mm.sdk.platformtools.MMKVSlotManager r12 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0.f109366d
            r13 = 0
            iy0.a r0 = r1.f109449b
            java.lang.String r14 = r0.f124924f
            r15 = 0
            t73.a r0 = r0.f124926h
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 1872(0x750, float:2.623E-42)
            r21 = 0
            r8 = r3
            r16 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            iy0.a r12 = r1.f109449b
            java.lang.String r11 = r1.f109448a
            java.lang.String r15 = r1.f109450c
            java.util.Map<java.lang.String, java.lang.String> r9 = r1.f109451d
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.m0$a r10 = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.m0$a
            r10.<init>(r12)
            f93.d$a r13 = f93.C31962d.C31963a.ACTION_CACHE_VALID_NOT_NEED_DOWNLOAD
            t73.a r0 = r3.f124926h
            java.lang.String r8 = r3.f124924f
            if (r8 != 0) goto L_0x0101
            r8 = r7
        L_0x0101:
            if (r0 == 0) goto L_0x010b
            java.lang.String r14 = t73.C48572p.m53971b(r0)
            if (r14 != 0) goto L_0x010a
            goto L_0x010b
        L_0x010a:
            r7 = r14
        L_0x010b:
            java.lang.String r14 = r12.mo71775q()
            int r16 = r7.length()
            if (r16 != 0) goto L_0x0118
            r16 = 1
            goto L_0x011a
        L_0x0118:
            r16 = 0
        L_0x011a:
            if (r16 == 0) goto L_0x0159
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "fetchBizPkg key invalid, appId: "
            r3.append(r5)
            r3.append(r8)
            java.lang.String r5 = ", domain: "
            r3.append(r5)
            if (r0 == 0) goto L_0x0137
            te3.qt1 r5 = r0.f129887a
            if (r5 == 0) goto L_0x0137
            java.lang.String r5 = r5.f140537d
            goto L_0x0138
        L_0x0137:
            r5 = r2
        L_0x0138:
            r3.append(r5)
            java.lang.String r5 = ", path: "
            r3.append(r5)
            if (r0 == 0) goto L_0x0148
            te3.rt1 r0 = r0.f129888b
            if (r0 == 0) goto L_0x0148
            java.lang.String r2 = r0.f141126d
        L_0x0148:
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r10.invoke(r0)
            goto L_0x044e
        L_0x0159:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "fetchBizPkg appId: "
            r0.append(r2)
            r0.append(r8)
            java.lang.String r2 = ", pkgKey: "
            r0.append(r2)
            r0.append(r7)
            java.lang.String r2 = ", pkgVersion: "
            r0.append(r2)
            r0.append(r14)
            java.lang.String r8 = ", type: "
            r0.append(r8)
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0$b r8 = r3.mo71778t()
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0$b r0 = r3.mo71778t()
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0$b r8 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0.C40719b.WX_PREFETCH_CONFIG_FILE
            r14 = 95
            if (r0 != r8) goto L_0x01e4
            t73.b r0 = r3.f124921c
            if (r0 == 0) goto L_0x01de
            boolean r0 = r3.mo71781w()
            if (r0 == 0) goto L_0x01de
            java.lang.String r0 = "fetchBizPkg resConfigFile exist and not need download"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            f93.d$b r14 = f93.C31962d.C31964b.PKG_URL_RESOURCE_WX_PREFETCH_CONFIG_FILE
            int r16 = r12.mo71768j()
            int r17 = r12.mo71763e()
            int r18 = r12.mo71777s()
            java.lang.String r0 = r3.f124919a
            r19 = r11
            r20 = r0
            f93.C31962d.m39599a(r13, r14, r15, r16, r17, r18, r19, r20)
            r8 = 1
            r9 = 1
            t73.b r0 = r3.f124921c
            gy3.C87412m.m108591d(r0)
            java.lang.String r2 = r3.mo71762d()
            com.tencent.mm.vfs.m1 r0 = r0.mo73172B(r2)
            java.util.HashMap r14 = r3.mo71770l()
            r2 = r10
            r10 = r0
            r11 = r3
            r13 = r19
            boolean r0 = oy0.C47404c.m52736c(r8, r9, r10, r11, r12, r13, r14)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.invoke(r0)
            goto L_0x044e
        L_0x01de:
            r2 = r10
            r19 = r11
            r11 = r2
            goto L_0x0371
        L_0x01e4:
            r19 = r11
            r11 = r10
            oy0.b r0 = oy0.C35337b.f94642a
            q73.c0 r0 = q73.C35796c0.f95588a
            te3.dn r8 = r0.mo60405f(r7)
            java.lang.String r10 = "MicroMsg.WebPrefetcherPkgManager"
            if (r8 == 0) goto L_0x026e
            java.lang.String r0 = r12.mo71761c()
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x01ff
            r0 = 1
            goto L_0x0200
        L_0x01ff:
            r0 = 0
        L_0x0200:
            if (r0 == 0) goto L_0x026e
            java.lang.String r0 = r12.mo71761c()
            te3.o25 r0 = oy0.C35337b.m40643b(r7, r0)
            oy0.b r16 = oy0.C35337b.f94642a
            if (r0 == 0) goto L_0x0218
            java.lang.String r5 = r0.f138917e
            boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r5)
            if (r5 == 0) goto L_0x0218
            r5 = 1
            goto L_0x0219
        L_0x0218:
            r5 = 0
        L_0x0219:
            if (r5 == 0) goto L_0x026e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "checkNeedUpdatePkg basePkgVersion valid appId: "
            r5.append(r6)
            r5.append(r7)
            java.lang.String r6 = ", basePkgVersion: "
            r5.append(r6)
            java.lang.String r6 = r12.mo71761c()
            r5.append(r6)
            r5.append(r2)
            java.lang.String r6 = r12.mo71775q()
            r5.append(r6)
            java.lang.String r6 = ", current.pkgVersion: "
            r5.append(r6)
            java.lang.String r6 = r8.f132428i
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r5)
            java.lang.String r5 = r8.f132428i
            java.lang.String r6 = r12.mo71761c()
            boolean r5 = gy3.C87412m.m108589b(r5, r6)
            if (r5 != 0) goto L_0x025e
            oy0.C35337b.m40644e(r0)
        L_0x025e:
            java.lang.String r0 = r12.mo71775q()
            java.lang.String r5 = r12.mo71761c()
            boolean r0 = gy3.C87412m.m108589b(r0, r5)
            if (r0 == 0) goto L_0x026e
            goto L_0x034b
        L_0x026e:
            java.lang.String r0 = r12.mo71775q()
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x027a
            r0 = 1
            goto L_0x027b
        L_0x027a:
            r0 = 0
        L_0x027b:
            if (r0 == 0) goto L_0x0287
            java.lang.String r0 = r12.mo71775q()
            te3.o25 r0 = oy0.C35337b.m40643b(r7, r0)
            goto L_0x02fd
        L_0x0287:
            java.lang.String r0 = r12.mo71769k()
            int r5 = r0.length()
            if (r5 != 0) goto L_0x0293
            r5 = 1
            goto L_0x0294
        L_0x0293:
            r5 = 0
        L_0x0294:
            if (r5 != 0) goto L_0x02fc
            oy0.b r5 = oy0.C35337b.f94642a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r7)
            r6.append(r14)
            int r0 = r0.hashCode()
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r6 = 1
            java.lang.Object[] r14 = new java.lang.Object[r6]
            r6 = 0
            r14[r6] = r0
            java.lang.String r6 = "getPkgInfoByUrl pkgKey: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r6, r14)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r5 = r5.mo60211d()
            java.lang.String r6 = "pkgVersionManager"
            gy3.C87412m.m108593f(r5, r6)
            boolean r6 = r5.containsKey(r0)
            if (r6 == 0) goto L_0x02f7
            byte[] r0 = r5.decodeBytes(r0)
            if (r0 == 0) goto L_0x02f7
            int r5 = r0.length
            if (r5 != 0) goto L_0x02d6
            r5 = 1
            r17 = 1
            goto L_0x02d9
        L_0x02d6:
            r5 = 1
            r17 = 0
        L_0x02d9:
            r6 = r17 ^ 1
            if (r6 == 0) goto L_0x02f7
            java.lang.Class<te3.o25> r5 = te3.o25.class
            java.lang.Object r5 = r5.newInstance()     // Catch:{ Exception -> 0x02ec }
            r6 = r5
            pe3.a r6 = (pe3.C47465a) r6     // Catch:{ Exception -> 0x02ec }
            r6.parseFrom(r0)     // Catch:{ Exception -> 0x02ec }
            pe3.a r5 = (pe3.C47465a) r5     // Catch:{ Exception -> 0x02ec }
            goto L_0x02f8
        L_0x02ec:
            r0 = move-exception
            r6 = 0
            java.lang.Object[] r5 = new java.lang.Object[r6]
            java.lang.String r14 = "MultiProcessMMKV.decodeProtoBuffer"
            java.lang.String r6 = "decode ProtoBuffer"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r14, r0, r6, r5)
        L_0x02f7:
            r5 = 0
        L_0x02f8:
            r0 = r5
            te3.o25 r0 = (te3.o25) r0
            goto L_0x02fd
        L_0x02fc:
            r0 = 0
        L_0x02fd:
            oy0.b r5 = oy0.C35337b.f94642a
            if (r0 == 0) goto L_0x030b
            java.lang.String r5 = r0.f138917e
            boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r5)
            if (r5 == 0) goto L_0x030b
            r6 = 1
            goto L_0x030c
        L_0x030b:
            r6 = 0
        L_0x030c:
            if (r6 == 0) goto L_0x034d
            if (r8 == 0) goto L_0x031e
            java.lang.String r5 = r8.f132428i
            if (r0 == 0) goto L_0x0317
            java.lang.String r6 = r0.f138918f
            goto L_0x0318
        L_0x0317:
            r6 = 0
        L_0x0318:
            boolean r5 = gy3.C87412m.m108589b(r5, r6)
            if (r5 != 0) goto L_0x0321
        L_0x031e:
            oy0.C35337b.m40644e(r0)
        L_0x0321:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "checkNeedUpdatePkg pkg exists appId: "
            r0.append(r5)
            r0.append(r7)
            r0.append(r2)
            java.lang.String r2 = r12.mo71775q()
            r0.append(r2)
            java.lang.String r2 = ", pkgUrl: "
            r0.append(r2)
            java.lang.String r2 = r12.mo71769k()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
        L_0x034b:
            r5 = 0
            goto L_0x034e
        L_0x034d:
            r5 = 1
        L_0x034e:
            if (r5 != 0) goto L_0x0371
            java.lang.String r0 = "fetchBizPkg pkg not need to update"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            f93.d$b r14 = f93.C31962d.C31964b.PKG_URL_RESOURCE_WXA_PKG
            int r16 = r12.mo71768j()
            int r17 = r12.mo71763e()
            int r18 = r12.mo71777s()
            java.lang.String r0 = r3.f124919a
            r20 = r0
            f93.C31962d.m39599a(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r11.invoke(r0)
            goto L_0x044e
        L_0x0371:
            q73.c0 r0 = q73.C35796c0.f95588a
            r0.mo60401b(r7)
            r23 = 240(0xf0, double:1.186E-321)
            kj2.d r20 = kj2.C117407d.INSTANCE
            r21 = 1454(0x5ae, double:7.184E-321)
            r25 = 1
            r20.mo182089r(r21, r23, r25)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r12.mo71775q()
            r0.append(r2)
            r2 = 95
            r0.append(r2)
            long r4 = java.lang.System.currentTimeMillis()
            r0.append(r4)
            java.lang.String r14 = r0.toString()
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = q73.C35796c0.f95590c
            r4.append(r5)
            r5 = 47
            r4.append(r5)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            r2.append(r4)
            r2.append(r5)
            r2.append(r14)
            java.lang.String r4 = ".wspkg"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r0.<init>((java.lang.String) r2)
            my0.d r2 = new my0.d
            java.lang.String r4 = r3.f124919a
            r2.<init>(r4, r0)
            r4 = 1
            r2.f126658c = r4
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.l0 r0 = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.l0
            r8 = r0
            r10 = r15
            r4 = r11
            r11 = r12
            r12 = r19
            r13 = r3
            r15 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            ly0.C46904a.m52237a(r2, r0)
            goto L_0x044e
        L_0x03eb:
            r4 = 1
            iy0.a r0 = r1.f109449b
            java.util.HashMap r0 = r0.mo71770l()
            java.lang.String r2 = "x-wx-prefetch-res-list"
            java.lang.Object r0 = r0.get(r2)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0405
            java.lang.Object r0 = sx3.C110818d0.m150914L(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0406
        L_0x0405:
            r0 = r7
        L_0x0406:
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x040e
            r5 = 1
            goto L_0x040f
        L_0x040e:
            r5 = 0
        L_0x040f:
            if (r5 == 0) goto L_0x044e
            iy0.a r0 = r1.f109449b
            java.util.HashMap r0 = r0.mo71770l()
            java.lang.Object r0 = r0.get(r2)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x042a
            java.lang.Object r0 = sx3.C110818d0.m150914L(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0428
            goto L_0x042a
        L_0x0428:
            r8 = r0
            goto L_0x042b
        L_0x042a:
            r8 = r7
        L_0x042b:
            java.lang.String r0 = ";"
            java.lang.String[] r9 = new java.lang.String[]{r0}
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            java.util.List r0 = z04.C112550d0.m153785U(r8, r9, r10, r11, r12, r13)
            t73.a r2 = r1.f109452e
            if (r2 == 0) goto L_0x0444
            te3.qt1 r2 = r2.f129887a
            if (r2 == 0) goto L_0x0444
            java.lang.String r2 = r2.f140537d
            goto L_0x0445
        L_0x0444:
            r2 = 0
        L_0x0445:
            if (r2 != 0) goto L_0x0448
            goto L_0x0449
        L_0x0448:
            r7 = r2
        L_0x0449:
            java.lang.String r2 = r1.f109448a
            oy0.C47404c.m52734a(r0, r7, r2)
        L_0x044e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40740m0.mo63641a(boolean, int, java.util.HashMap):void");
    }
}
