package gk3;

import fy3.C32226l;
import gk3.C98154l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: gk3.o */
public final class C98161o extends C87413o implements C32226l<C98154l.C98155a, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C98134c f287781d;

    /* renamed from: e */
    public final /* synthetic */ long f287782e;

    /* renamed from: f */
    public final /* synthetic */ long f287783f;

    /* renamed from: g */
    public final /* synthetic */ C98154l f287784g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98161o(C98134c cVar, long j, long j2, C98154l lVar) {
        super(1);
        this.f287781d = cVar;
        this.f287782e = j;
        this.f287783f = j2;
        this.f287784g = lVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r2 = r15.f287771a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r15) {
        /*
            r14 = this;
            gk3.l$a r15 = (gk3.C98154l.C98155a) r15
            if (r15 == 0) goto L_0x0008
            java.lang.String r0 = r15.f287772b
            if (r0 != 0) goto L_0x000a
        L_0x0008:
            java.lang.String r0 = ""
        L_0x000a:
            gk3.c r1 = r14.f287781d
            if (r1 == 0) goto L_0x0013
            long r2 = r14.f287782e
            r1.mo135808b(r2, r0)
        L_0x0013:
            r1 = 0
            if (r15 == 0) goto L_0x001d
            com.tencent.mm.plugin.scanner.api.ScanImagePHashInfo r2 = r15.f287771a
            if (r2 == 0) goto L_0x001d
            java.lang.String r2 = r2.pHash
            goto L_0x001e
        L_0x001d:
            r2 = r1
        L_0x001e:
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            long r5 = r14.f287782e
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = 0
            r4[r6] = r5
            r5 = 1
            r4[r5] = r0
            r7 = 2
            r4[r7] = r2
            java.lang.String r8 = "MicroMsg.ImageSearchPreviewManager"
            java.lang.String r9 = "alvinluo previewImage msgId: %d, imagePath: %s, pHash: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r9, r4)
            if (r2 == 0) goto L_0x0042
            int r4 = r2.length()
            if (r4 != 0) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r4 = 0
            goto L_0x0043
        L_0x0042:
            r4 = 1
        L_0x0043:
            if (r4 == 0) goto L_0x0075
            gk3.c r15 = r14.f287781d
            if (r15 == 0) goto L_0x022c
            long r0 = r14.f287783f
            gk3.b r2 = new gk3.b
            r2.<init>()
            long r8 = r14.f287782e
            long r10 = r14.f287783f
            r2.f287723b = r8
            r2.f287724c = r5
            sk2.f r4 = new sk2.f
            r4.<init>()
            r4.f297547a = r7
            r4.f297549c = r6
            r4.f297548b = r10
            r4.f297550d = r3
            java.lang.String r3 = "compute pHash failed"
            r4.f297552f = r3
            r3 = -1
            r4.f297551e = r3
            r2.f287722a = r4
            rx3.b0 r3 = rx3.C13598b0.f38549a
            r15.mo135807a(r0, r2)
            goto L_0x022c
        L_0x0075:
            gk3.l r4 = r14.f287784g
            gk3.l$b r4 = r4.f287767a
            r4.getClass()
            java.lang.String r9 = "pHash"
            gy3.C87412m.m108594g(r2, r9)
            java.util.HashMap<java.lang.String, te3.wh2> r9 = gk3.C98154l.f287765e
            java.lang.Object r9 = r9.get(r2)
            te3.wh2 r9 = (te3.C51834wh2) r9
            java.lang.Object[] r10 = new java.lang.Object[r7]
            r10[r6] = r2
            if (r9 == 0) goto L_0x0097
            int r11 = r9.f144054d
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L_0x0098
        L_0x0097:
            r11 = r1
        L_0x0098:
            r10[r5] = r11
            java.lang.String r11 = "alvinluo filterPreviewByMemory pHash: %s, previewResult: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r11, r10)
            if (r9 == 0) goto L_0x00a2
            goto L_0x00c9
        L_0x00a2:
            com.tencent.mm.sdk.platformtools.MMKVSlotManager r9 = r4.f287773a
            byte[] r9 = r9.decodeBytes(r2)
            java.lang.Object[] r10 = new java.lang.Object[r7]
            r10[r6] = r2
            r10[r5] = r9
            java.lang.String r11 = "alvinluo filterPreviewByMMKV pHash: %s, result: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r11, r10)
            if (r9 == 0) goto L_0x00c4
            te3.wh2 r10 = new te3.wh2
            r10.<init>()
            r10.parseFrom(r9)
            long r11 = r10.f144055e
            r4.mo137440a(r2, r11)
            r9 = r10
            goto L_0x00c5
        L_0x00c4:
            r9 = r1
        L_0x00c5:
            if (r9 == 0) goto L_0x00c8
            goto L_0x00c9
        L_0x00c8:
            r9 = r1
        L_0x00c9:
            gk3.l r2 = r14.f287784g
            r2.getClass()
            r10 = 0
            if (r9 == 0) goto L_0x00da
            long r12 = r9.f144055e
            int r2 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x00da
            r2 = 1
            goto L_0x00db
        L_0x00da:
            r2 = 0
        L_0x00db:
            if (r2 == 0) goto L_0x0145
            gk3.l r2 = r14.f287784g
            gy3.C87412m.m108591d(r9)
            r2.getClass()
            long r12 = r9.f144055e
            int r2 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x00fb
            long r10 = java.lang.System.currentTimeMillis()
            long r12 = r9.f144055e
            long r10 = r10 - r12
            r12 = 604800000(0x240c8400, double:2.988109026E-315)
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r2 <= 0) goto L_0x00fb
            r2 = 1
            goto L_0x00fc
        L_0x00fb:
            r2 = 0
        L_0x00fc:
            if (r2 != 0) goto L_0x0145
            gk3.c r15 = r14.f287781d
            if (r15 == 0) goto L_0x022c
            long r0 = r14.f287783f
            gk3.b r2 = new gk3.b
            r2.<init>()
            long r4 = r14.f287782e
            long r10 = r14.f287783f
            r2.f287723b = r4
            int r4 = r9.f144054d
            if (r4 != r7) goto L_0x0114
            r4 = 3
        L_0x0114:
            r2.f287724c = r4
            sk2.f r4 = new sk2.f
            r4.<init>()
            r4.f297547a = r7
            r4.f297549c = r6
            r4.f297548b = r10
            r4.f297550d = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "preview result: "
            r3.append(r5)
            int r5 = r2.f287724c
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r4.f297552f = r3
            r3 = -2
            r4.f297551e = r3
            r2.f287722a = r4
            rx3.b0 r3 = rx3.C13598b0.f38549a
            r15.mo135807a(r0, r2)
            goto L_0x022c
        L_0x0145:
            gk3.a r2 = new gk3.a
            r2.<init>()
            long r3 = r14.f287782e
            long r9 = r14.f287783f
            r2.f287721b = r3
            sk2.e r11 = new sk2.e
            r11.<init>()
            r11.f297535d = r0
            r11.f297532a = r9
            r11.f297533b = r7
            r11.f297534c = r3
            com.tencent.mm.plugin.scanner.api.ScanImagePHashInfo r15 = r15.f287771a
            r11.f297540i = r15
            r2.f287720a = r11
            gk3.l r15 = r14.f287784g
            gk3.c r0 = r14.f287781d
            r15.getClass()
            sk2.e r3 = r2.f287720a
            gy3.C87412m.m108591d(r3)
            long r3 = r3.f297532a
            java.lang.String r9 = r15.mo137438a(r2)
            java.util.HashMap<java.lang.String, java.util.ArrayList<gk3.c>> r10 = r15.f287768b
            boolean r10 = r10.containsKey(r9)
            if (r10 != 0) goto L_0x0187
            java.util.HashMap<java.lang.String, java.util.ArrayList<gk3.c>> r10 = r15.f287768b
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r10.put(r9, r11)
        L_0x0187:
            java.util.HashMap<java.lang.String, java.util.ArrayList<gk3.c>> r10 = r15.f287768b
            java.lang.Object r10 = r10.get(r9)
            gy3.C87412m.m108591d(r10)
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            boolean r10 = r10.contains(r0)
            if (r10 == 0) goto L_0x01ae
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "alvinluo previewImage is already running and ignore "
            r15.append(r0)
            r15.append(r9)
            java.lang.String r15 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r8, r15)
            goto L_0x022c
        L_0x01ae:
            java.util.HashMap<java.lang.String, java.util.ArrayList<gk3.c>> r10 = r15.f287768b
            java.lang.Object r9 = r10.get(r9)
            gy3.C87412m.m108591d(r9)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            r9.add(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            java.util.HashMap<java.lang.Long, gk3.a> r3 = r15.f287769c
            r3.put(r0, r2)
            gk3.l$b r0 = r15.f287767a
            sk2.e r3 = r2.f287720a
            if (r3 == 0) goto L_0x01d1
            com.tencent.mm.plugin.scanner.api.ScanImagePHashInfo r3 = r3.f297540i
            if (r3 == 0) goto L_0x01d1
            java.lang.String r1 = r3.pHash
        L_0x01d1:
            long r3 = java.lang.System.currentTimeMillis()
            r0.getClass()
            java.lang.Object[] r9 = new java.lang.Object[r7]
            r9[r6] = r1
            java.lang.Long r10 = java.lang.Long.valueOf(r3)
            r9[r5] = r10
            java.lang.String r10 = "alvinluo saveRequest pHash: %s, timestamp: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r10, r9)
            r0.mo137440a(r1, r3)
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r6] = r1
            java.lang.Long r9 = java.lang.Long.valueOf(r3)
            r7[r5] = r9
            java.lang.String r9 = "alvinluo saveRequestInMMKV pHash: %s, requestTime: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r9, r7)
            if (r1 == 0) goto L_0x0201
            int r7 = r1.length()
            if (r7 != 0) goto L_0x0202
        L_0x0201:
            r6 = 1
        L_0x0202:
            if (r6 == 0) goto L_0x0205
            goto L_0x021a
        L_0x0205:
            com.tencent.mm.sdk.platformtools.MMKVSlotManager r0 = r0.f287773a
            byte[] r0 = r0.decodeBytes(r1)
            te3.wh2 r1 = new te3.wh2
            r1.<init>()
            if (r0 == 0) goto L_0x0216
            r1.parseFrom(r0)
            goto L_0x0218
        L_0x0216:
            r1.f144054d = r5
        L_0x0218:
            r1.f144055e = r3
        L_0x021a:
            java.lang.Class<sk2.c> r0 = sk2.C101643c.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            sk2.c r0 = (sk2.C101643c) r0
            sk2.e r1 = r2.f287720a
            gy3.C87412m.m108591d(r1)
            sk2.g r15 = r15.f287770d
            r0.Ns0(r1, r15)
        L_0x022c:
            rx3.b0 r15 = rx3.C13598b0.f38549a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: gk3.C98161o.invoke(java.lang.Object):java.lang.Object");
    }
}
