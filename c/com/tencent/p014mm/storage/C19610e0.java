package com.tencent.p014mm.storage;

/* renamed from: com.tencent.mm.storage.e0 */
public final class C19610e0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f55483d;

    /* renamed from: e */
    public final /* synthetic */ int f55484e;

    /* renamed from: f */
    public final /* synthetic */ C72976h2 f55485f;

    /* renamed from: g */
    public final /* synthetic */ int f55486g;

    public C19610e0(String str, int i, C72976h2 h2Var, int i2) {
        this.f55483d = str;
        this.f55484e = i;
        this.f55485f = h2Var;
        this.f55486g = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x02f2 A[Catch:{ all -> 0x0445 }] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0432 A[Catch:{ all -> 0x0443 }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ce A[Catch:{ all -> 0x044b }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cf A[Catch:{ all -> 0x044b }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02c0 A[Catch:{ all -> 0x0445 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r29 = this;
            r1 = r29
            java.lang.Class<rn.c0> r0 = p227rn.C22240c0.class
            java.lang.String r2 = "MicroMsg.BizMainCellExposeHelper"
            di3.d r3 = di3.C86312j.m106911c(r0)
            rn.c0 r3 = (p227rn.C22240c0) r3
            boolean r3 = r3.mo35407eG()
            if (r3 == 0) goto L_0x0020
            com.tencent.mm.storage.c0 r0 = com.tencent.p014mm.storage.C19601c0.f55446a
            java.lang.String r2 = r1.f55483d
            int r3 = r1.f55484e
            com.tencent.mm.storage.h2 r4 = r1.f55485f
            int r5 = r1.f55486g
            r0.mo25727p(r2, r3, r4, r5)
            return
        L_0x0020:
            com.tencent.mm.pluginsdk.model.d r3 = com.tencent.p014mm.pluginsdk.model.C19428d.f54856a
            r3.mo25152E()
            com.tencent.mm.storage.h2 r3 = r1.f55485f
            r4 = 128(0x80, float:1.794E-43)
            boolean r3 = r3.mo108372k3(r4)
            r4 = 0
            if (r3 == 0) goto L_0x003e
            com.tencent.mm.storage.c0 r0 = com.tencent.p014mm.storage.C19601c0.f55446a
            java.lang.String r2 = r1.f55483d
            int r3 = r1.f55484e
            com.tencent.mm.storage.h2 r5 = r1.f55485f
            r0.mo25725n(r2, r3, r5)
            com.tencent.p014mm.storage.C19601c0.f55452g = r4
            return
        L_0x003e:
            long r5 = java.lang.System.currentTimeMillis()
            com.tencent.mm.storage.c0 r3 = com.tencent.p014mm.storage.C19601c0.f55446a
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r13 = com.tencent.p014mm.storage.C19601c0.f55455j
            java.lang.String r7 = "BizLastMsgId"
            long r14 = r13.decodeLong(r7)
            r11 = 0
            int r16 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r16 != 0) goto L_0x0053
            return
        L_0x0053:
            boolean r7 = com.tencent.p014mm.storage.C19601c0.f55454i
            if (r7 == 0) goto L_0x005e
            long r7 = com.tencent.p014mm.storage.C19601c0.f55459n
            int r9 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x005e
            return
        L_0x005e:
            di3.d r0 = di3.C86312j.m106911c(r0)
            rn.c0 r0 = (p227rn.C22240c0) r0
            r0.mo35403G8()
            rb0.f r0 = rb0.C22221f.f62962a
            java.lang.Object r7 = r0.getSlotForWrite()
            r10 = r7
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r10 = (com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV) r10
            boolean r7 = com.tencent.p014mm.storage.C19601c0.f55454i
            if (r7 == 0) goto L_0x008e
            long r17 = com.tencent.p014mm.storage.C19601c0.f55459n
            int r7 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r7 == 0) goto L_0x008e
            r9 = 0
            r19 = 0
            java.lang.String r8 = ""
            r7 = r3
            r4 = r10
            r10 = r19
            r19 = r3
            r21 = r4
            r3 = r11
            r11 = r17
            r7.mo25722k(r8, r9, r10, r11)
            goto L_0x0093
        L_0x008e:
            r19 = r3
            r21 = r10
            r3 = r11
        L_0x0093:
            r7 = 0
            com.tencent.p014mm.storage.C19601c0.f55457l = r7
            java.lang.String r8 = ""
            com.tencent.p014mm.storage.C19601c0.f55460o = r8
            com.tencent.p014mm.storage.C19601c0.f55459n = r14
            r9 = 1
            com.tencent.p014mm.storage.C19601c0.f55454i = r9
            java.lang.String r10 = java.lang.String.valueOf(r14)
            int r11 = r0.decodeInt(r10, r7)
            if (r11 != r9) goto L_0x00ab
            r11 = 0
            goto L_0x00ac
        L_0x00ab:
            r11 = 1
        L_0x00ac:
            int r12 = com.tencent.p014mm.storage.C19615i1.m21065l()
            com.tencent.p014mm.storage.C19601c0.f55462q = r12
            java.lang.String r12 = r1.f55483d
            int r3 = r1.f55486g
            com.tencent.p014mm.storage.C19601c0.f55461p = r7
            com.tencent.mm.storage.p0 r4 = rb0.C48009v0.Jx0()     // Catch:{ all -> 0x044b }
            com.tencent.mm.storage.o0 r4 = r4.mo25806kD(r14)     // Catch:{ all -> 0x044b }
            if (r4 != 0) goto L_0x00cc
            if (r16 >= 0) goto L_0x00cc
            com.tencent.mm.storage.d1 r4 = rb0.C48009v0.Kx0()     // Catch:{ all -> 0x044b }
            com.tencent.mm.storage.o0 r4 = r4.mo25733Ow(r14)     // Catch:{ all -> 0x044b }
        L_0x00cc:
            if (r4 != 0) goto L_0x00cf
            return
        L_0x00cf:
            com.tencent.mm.storage.z0 r14 = com.tencent.p014mm.storage.C19641z0.f55645a     // Catch:{ all -> 0x044b }
            boolean r15 = r14.mo25865h()     // Catch:{ all -> 0x044b }
            if (r15 == 0) goto L_0x010b
            te3.lp3 r15 = new te3.lp3     // Catch:{ all -> 0x044b }
            r15.<init>()     // Catch:{ all -> 0x044b }
            int r7 = r1.f55484e     // Catch:{ all -> 0x044b }
            te3.zi2 r9 = new te3.zi2     // Catch:{ all -> 0x044b }
            r9.<init>()     // Catch:{ all -> 0x044b }
            r22 = r3
            java.lang.String r3 = r4.field_rankSessionId     // Catch:{ all -> 0x044b }
            r9.f64835h = r3     // Catch:{ all -> 0x044b }
            java.lang.String r3 = r4.field_resortBuffer     // Catch:{ all -> 0x044b }
            r9.f64837j = r3     // Catch:{ all -> 0x044b }
            rx3.b0 r3 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x044b }
            r15.f64187e = r9     // Catch:{ all -> 0x044b }
            te3.cj r3 = new te3.cj     // Catch:{ all -> 0x044b }
            r3.<init>()     // Catch:{ all -> 0x044b }
            r3.f182523d = r5     // Catch:{ all -> 0x044b }
            r3.f182524e = r7     // Catch:{ all -> 0x044b }
            int r7 = com.tencent.p014mm.storage.C19601c0.f55462q     // Catch:{ all -> 0x044b }
            r9 = 1
            if (r7 != r9) goto L_0x0101
            r7 = 1
            goto L_0x0102
        L_0x0101:
            r7 = 0
        L_0x0102:
            r3.f182525f = r7     // Catch:{ all -> 0x044b }
            r15.f64186d = r3     // Catch:{ all -> 0x044b }
            r15.f64188f = r9     // Catch:{ all -> 0x044b }
            com.tencent.p014mm.storage.C19601c0.f55452g = r15     // Catch:{ all -> 0x044b }
            goto L_0x010d
        L_0x010b:
            r22 = r3
        L_0x010d:
            te3.lp3 r3 = com.tencent.p014mm.storage.C19601c0.f55452g     // Catch:{ all -> 0x044b }
            if (r3 == 0) goto L_0x0114
            te3.zi2 r3 = r3.f64187e     // Catch:{ all -> 0x044b }
            goto L_0x0115
        L_0x0114:
            r3 = 0
        L_0x0115:
            int r7 = com.tencent.p014mm.storage.C19613h1.m21029b(r4)     // Catch:{ all -> 0x044b }
            com.tencent.p014mm.storage.C19601c0.f55461p = r7     // Catch:{ all -> 0x044b }
            boolean r7 = r4.mo25754B2()     // Catch:{ all -> 0x044b }
            if (r7 == 0) goto L_0x01cb
            java.lang.Class<gw0.b> r7 = gw0.C76073b.class
            di3.d r7 = di3.C86312j.m106911c(r7)     // Catch:{ all -> 0x044b }
            gw0.b r7 = (gw0.C76073b) r7     // Catch:{ all -> 0x044b }
            r15 = r10
            long r9 = r4.field_msgId     // Catch:{ all -> 0x044b }
            r23 = r12
            java.lang.String r12 = r4.field_content     // Catch:{ all -> 0x044b }
            s90.f r7 = r7.mo94597JZ(r9, r12)     // Catch:{ all -> 0x044b }
            if (r7 == 0) goto L_0x01b7
            java.util.LinkedList<s90.j> r9 = r7.f226295i     // Catch:{ all -> 0x044b }
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r9)     // Catch:{ all -> 0x044b }
            if (r9 != 0) goto L_0x01b7
            java.util.LinkedList<s90.j> r7 = r7.f226295i     // Catch:{ all -> 0x044b }
            r9 = 0
            java.lang.Object r7 = r7.get(r9)     // Catch:{ all -> 0x044b }
            s90.j r7 = (s90.C77630j) r7     // Catch:{ all -> 0x044b }
            java.lang.String r9 = r7.f226326e     // Catch:{ all -> 0x044b }
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)     // Catch:{ all -> 0x044b }
            if (r9 != 0) goto L_0x01a6
            java.lang.String r9 = r7.f226326e     // Catch:{ all -> 0x044b }
            android.net.Uri r9 = android.net.Uri.parse(r9)     // Catch:{ all -> 0x044b }
            java.lang.String r10 = "mid"
            java.lang.String r10 = r9.getQueryParameter(r10)     // Catch:{ all -> 0x044b }
            r25 = r13
            r26 = r14
            r24 = r15
            r14 = 0
            long r12 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r10, r14)     // Catch:{ all -> 0x044b }
            if (r3 != 0) goto L_0x016a
            goto L_0x016d
        L_0x016a:
            int r10 = (int) r12     // Catch:{ all -> 0x044b }
            r3.f64832e = r10     // Catch:{ all -> 0x044b }
        L_0x016d:
            rx3.b0 r10 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x044b }
            java.lang.String r10 = "idx"
            java.lang.String r10 = r9.getQueryParameter(r10)     // Catch:{ all -> 0x044b }
            r14 = 0
            int r10 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r10, (int) r14)     // Catch:{ all -> 0x044b }
            if (r3 != 0) goto L_0x017d
            goto L_0x017f
        L_0x017d:
            r3.f64833f = r10     // Catch:{ all -> 0x044b }
        L_0x017f:
            if (r3 != 0) goto L_0x0183
            r15 = r10
            goto L_0x01a4
        L_0x0183:
            java.lang.String r14 = "__biz"
            java.lang.String r9 = r9.getQueryParameter(r14)     // Catch:{ all -> 0x044b }
            r14 = 2
            byte[] r9 = android.util.Base64.decode(r9, r14)     // Catch:{ all -> 0x044b }
            java.lang.String r14 = "decode(uri.getQueryParam…\"__biz\"), Base64.NO_WRAP)"
            gy3.C87412m.m108593f(r9, r14)     // Catch:{ all -> 0x044b }
            java.lang.String r14 = new java.lang.String     // Catch:{ all -> 0x044b }
            java.nio.charset.Charset r15 = z04.C119027c.f356488a     // Catch:{ all -> 0x044b }
            r14.<init>(r9, r15)     // Catch:{ all -> 0x044b }
            r15 = r10
            r9 = 0
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r14, r9)     // Catch:{ all -> 0x044b }
            int r10 = (int) r9     // Catch:{ all -> 0x044b }
            r3.f64831d = r10     // Catch:{ all -> 0x044b }
        L_0x01a4:
            r9 = r12
            goto L_0x01af
        L_0x01a6:
            r25 = r13
            r26 = r14
            r24 = r15
            r9 = 0
            r15 = 0
        L_0x01af:
            if (r3 != 0) goto L_0x01b2
            goto L_0x01c0
        L_0x01b2:
            java.lang.String r7 = r7.f226315G     // Catch:{ all -> 0x044b }
            r3.f64834g = r7     // Catch:{ all -> 0x044b }
            goto L_0x01c0
        L_0x01b7:
            r25 = r13
            r26 = r14
            r24 = r15
            r9 = 0
            r15 = 0
        L_0x01c0:
            java.lang.String r3 = r4.field_talker     // Catch:{ all -> 0x044b }
            java.lang.String r7 = "info.field_talker"
            gy3.C87412m.m108593f(r3, r7)     // Catch:{ all -> 0x044b }
            r12 = r23
            r7 = 0
            goto L_0x020e
        L_0x01cb:
            r24 = r10
            r23 = r12
            r25 = r13
            r26 = r14
            r9 = 0
            boolean r7 = r4.mo25755C2()     // Catch:{ all -> 0x044b }
            if (r7 == 0) goto L_0x0223
            java.lang.String r3 = com.tencent.p014mm.storage.C19615i1.m21063j(r4)     // Catch:{ all -> 0x044b }
            int r7 = com.tencent.p014mm.storage.C19615i1.m21062i(r4)     // Catch:{ all -> 0x044b }
            java.lang.String r12 = com.tencent.p014mm.storage.C19615i1.m21057d(r4)     // Catch:{ all -> 0x044b }
            com.tencent.mm.storage.d1 r13 = rb0.C48009v0.Kx0()     // Catch:{ all -> 0x044b }
            int r13 = r13.mo25734SE()     // Catch:{ all -> 0x044b }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x044b }
            r14.<init>()     // Catch:{ all -> 0x044b }
            java.lang.String r15 = "reportMainCellExpose dyeing template bizUsername = "
            r14.append(r15)     // Catch:{ all -> 0x044b }
            r14.append(r3)     // Catch:{ all -> 0x044b }
            java.lang.String r15 = ", msgType = "
            r14.append(r15)     // Catch:{ all -> 0x044b }
            r14.append(r7)     // Catch:{ all -> 0x044b }
            java.lang.String r14 = r14.toString()     // Catch:{ all -> 0x044b }
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r2, r14)     // Catch:{ all -> 0x044b }
            r22 = r13
            r15 = 0
        L_0x020e:
            r18 = r2
            r20 = r8
            r23 = r12
            r14 = r15
            r2 = r24
            r15 = 1
            r17 = 0
            r12 = r9
            r10 = r21
            r9 = r7
            r7 = r19
            r19 = r20
            goto L_0x0282
        L_0x0223:
            boolean r7 = r4.mo25758F2()     // Catch:{ all -> 0x044b }
            if (r7 == 0) goto L_0x0259
            r7 = r19
            com.tencent.mm.storage.o4 r9 = r7.mo25718g(r4)     // Catch:{ all -> 0x044b }
            int r10 = r9.f55542c     // Catch:{ all -> 0x044b }
            long r12 = r9.f55540a     // Catch:{ all -> 0x044b }
            int r14 = r9.f55541b     // Catch:{ all -> 0x044b }
            java.lang.String r15 = r9.f55543d     // Catch:{ all -> 0x044b }
            r17 = r10
            java.lang.String r10 = r9.f55544e     // Catch:{ all -> 0x044b }
            if (r10 == 0) goto L_0x0247
            if (r3 != 0) goto L_0x0240
            goto L_0x0242
        L_0x0240:
            r3.f64836i = r10     // Catch:{ all -> 0x044b }
        L_0x0242:
            rx3.b0 r3 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x044b }
            r20 = r10
            goto L_0x0249
        L_0x0247:
            r20 = 0
        L_0x0249:
            java.lang.String r3 = r9.f55545f     // Catch:{ all -> 0x044b }
            if (r3 != 0) goto L_0x024e
            r3 = r8
        L_0x024e:
            r18 = r2
            r19 = r15
            r10 = r21
            r2 = r24
            r9 = 0
            r15 = 1
            goto L_0x0282
        L_0x0259:
            r7 = r19
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x044b }
            r3.<init>()     // Catch:{ all -> 0x044b }
            java.lang.String r12 = "reportMainCellExpose unknown type "
            r3.append(r12)     // Catch:{ all -> 0x044b }
            int r12 = r4.field_type     // Catch:{ all -> 0x044b }
            r3.append(r12)     // Catch:{ all -> 0x044b }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x044b }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r3)     // Catch:{ all -> 0x044b }
            r18 = r2
            r3 = r8
            r19 = r3
            r20 = r19
            r12 = r9
            r10 = r21
            r2 = r24
            r9 = 0
            r14 = 0
            r15 = 1
            r17 = 0
        L_0x0282:
            r10.encode((java.lang.String) r2, (int) r15)     // Catch:{ all -> 0x0447 }
            java.lang.String r15 = r7.mo25712a(r2)     // Catch:{ all -> 0x0447 }
            r10.encode((java.lang.String) r15, (long) r5)     // Catch:{ all -> 0x0447 }
            java.lang.String r15 = r7.mo25714c(r2)     // Catch:{ all -> 0x0447 }
            r21 = r14
            java.lang.String r14 = r7.mo25714c(r2)     // Catch:{ all -> 0x0445 }
            r24 = r9
            r9 = 0
            int r14 = r0.decodeInt(r14, r9)     // Catch:{ all -> 0x0445 }
            r9 = 1
            int r14 = r14 + r9
            r10.encode((java.lang.String) r15, (int) r14)     // Catch:{ all -> 0x0445 }
            java.lang.String r9 = r7.mo25713b(r2)     // Catch:{ all -> 0x0445 }
            java.lang.String r2 = r7.mo25713b(r2)     // Catch:{ all -> 0x0445 }
            int r14 = r1.f55484e     // Catch:{ all -> 0x0445 }
            int r0 = r0.decodeInt(r2, r14)     // Catch:{ all -> 0x0445 }
            int r2 = r1.f55484e     // Catch:{ all -> 0x0445 }
            int r0 = java.lang.Math.min(r0, r2)     // Catch:{ all -> 0x0445 }
            r10.encode((java.lang.String) r9, (int) r0)     // Catch:{ all -> 0x0445 }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.WebViewUtilities.doUrlEncode(r23)     // Catch:{ all -> 0x0445 }
            r2 = 1
            if (r11 != r2) goto L_0x02e1
            wc3.c r9 = wc3.C22881c.f65777a     // Catch:{ all -> 0x0445 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r10 = r9.mo36059d()     // Catch:{ all -> 0x0445 }
            java.lang.String r14 = "biz_time_preload_at_biz_box_expose"
            r15 = 0
            boolean r10 = r10.getBoolean(r14, r15)     // Catch:{ all -> 0x0445 }
            java.lang.Object[] r14 = new java.lang.Object[r2]     // Catch:{ all -> 0x0445 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)     // Catch:{ all -> 0x0445 }
            r14[r15] = r2     // Catch:{ all -> 0x0445 }
            java.lang.String r2 = "MicroMsg.BizImagePreloadStrategy"
            java.lang.String r15 = "ImageStrategy chatListPreloadEnable %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r15, r14)     // Catch:{ all -> 0x0445 }
            if (r10 == 0) goto L_0x02e1
            r9.mo36064i()     // Catch:{ all -> 0x0445 }
        L_0x02e1:
            jw0.a r2 = jw0.C21287a.f60143a     // Catch:{ all -> 0x0445 }
            rx3.l r2 = r2.mo33265f(r4)     // Catch:{ all -> 0x0445 }
            com.tencent.mm.storage.t r9 = com.tencent.p014mm.storage.C19627t.f55586a     // Catch:{ all -> 0x0445 }
            r9.mo25848v()     // Catch:{ all -> 0x0445 }
            boolean r9 = r4.mo25758F2()     // Catch:{ all -> 0x0445 }
            if (r9 == 0) goto L_0x030d
            com.tencent.mm.storage.l0 r9 = rb0.C48009v0.Ix0()     // Catch:{ all -> 0x0445 }
            com.tencent.mm.storage.k0 r10 = new com.tencent.mm.storage.k0     // Catch:{ all -> 0x0445 }
            r10.<init>()     // Catch:{ all -> 0x0445 }
            long r14 = r4.field_msgId     // Catch:{ all -> 0x0445 }
            r10.field_msgId = r14     // Catch:{ all -> 0x0445 }
            r14 = 1
            r10.field_exposeType = r14     // Catch:{ all -> 0x0445 }
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0445 }
            r10.field_exposeTime = r14     // Catch:{ all -> 0x0445 }
            rx3.b0 r14 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0445 }
            r9.mo57657Lo(r10)     // Catch:{ all -> 0x0445 }
        L_0x030d:
            java.lang.String r9 = "BizLastRecCardId"
            r10 = r25
            java.lang.String r9 = r10.decodeString(r9, r8)     // Catch:{ all -> 0x0445 }
            java.lang.String r10 = r4.field_rankSessionId     // Catch:{ all -> 0x0445 }
            com.tencent.mm.plugin.report.service.n r14 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x0445 }
            r15 = 23
            java.lang.Object[] r15 = new java.lang.Object[r15]     // Catch:{ all -> 0x0445 }
            r23 = r7
            r7 = 1000(0x3e8, float:1.401E-42)
            r25 = r8
            long r7 = (long) r7     // Catch:{ all -> 0x0445 }
            long r7 = r5 / r7
            int r8 = (int) r7     // Catch:{ all -> 0x0445 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0445 }
            r8 = 0
            r15[r8] = r7     // Catch:{ all -> 0x0445 }
            r7 = 1
            r15[r7] = r3     // Catch:{ all -> 0x0445 }
            java.lang.Long r7 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0445 }
            r8 = 2
            r15[r8] = r7     // Catch:{ all -> 0x0445 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0445 }
            r8 = 3
            r15[r8] = r7     // Catch:{ all -> 0x0445 }
            int r7 = r1.f55484e     // Catch:{ all -> 0x0445 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0445 }
            r27 = 4
            r15[r27] = r7     // Catch:{ all -> 0x0445 }
            r7 = 5
            r15[r7] = r0     // Catch:{ all -> 0x0445 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r22)     // Catch:{ all -> 0x0445 }
            r7 = 6
            r15[r7] = r0     // Catch:{ all -> 0x0445 }
            r0 = 7
            r16 = 0
            java.lang.Integer r28 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x0445 }
            r15[r0] = r28     // Catch:{ all -> 0x0445 }
            r0 = 8
            java.lang.Long r28 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0445 }
            r15[r0] = r28     // Catch:{ all -> 0x0445 }
            r0 = 9
            java.lang.Long r28 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0445 }
            r15[r0] = r28     // Catch:{ all -> 0x0445 }
            r0 = 10
            r16 = 0
            java.lang.Integer r28 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x0445 }
            r15[r0] = r28     // Catch:{ all -> 0x0445 }
            r0 = 11
            java.lang.Integer r28 = java.lang.Integer.valueOf(r24)     // Catch:{ all -> 0x0445 }
            r15[r0] = r28     // Catch:{ all -> 0x0445 }
            r0 = 12
            int r28 = com.tencent.p014mm.storage.C19601c0.f55462q     // Catch:{ all -> 0x0445 }
            java.lang.Integer r28 = java.lang.Integer.valueOf(r28)     // Catch:{ all -> 0x0445 }
            r15[r0] = r28     // Catch:{ all -> 0x0445 }
            r0 = 13
            A r8 = r2.f38555d     // Catch:{ all -> 0x0445 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0445 }
            r15[r0] = r8     // Catch:{ all -> 0x0445 }
            r0 = 14
            B r2 = r2.f38556e     // Catch:{ all -> 0x0445 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0445 }
            r15[r0] = r2     // Catch:{ all -> 0x0445 }
            r0 = 15
            int r2 = com.tencent.p014mm.storage.C19601c0.f55461p     // Catch:{ all -> 0x0445 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0445 }
            r15[r0] = r2     // Catch:{ all -> 0x0445 }
            r0 = 16
            java.lang.Integer r2 = java.lang.Integer.valueOf(r17)     // Catch:{ all -> 0x0445 }
            r15[r0] = r2     // Catch:{ all -> 0x0445 }
            r0 = 17
            java.lang.Integer r2 = java.lang.Integer.valueOf(r21)     // Catch:{ all -> 0x0445 }
            r15[r0] = r2     // Catch:{ all -> 0x0445 }
            r0 = 18
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.WebViewUtilities.doUrlEncode(r19)     // Catch:{ all -> 0x0445 }
            r15[r0] = r2     // Catch:{ all -> 0x0445 }
            r0 = 19
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.WebViewUtilities.doUrlEncode(r20)     // Catch:{ all -> 0x0445 }
            r15[r0] = r2     // Catch:{ all -> 0x0445 }
            r0 = 20
            r15[r0] = r9     // Catch:{ all -> 0x0445 }
            r0 = 21
            r15[r0] = r25     // Catch:{ all -> 0x0445 }
            r0 = 22
            r15[r0] = r10     // Catch:{ all -> 0x0445 }
            r0 = 18218(0x472a, float:2.5529E-41)
            r14.mo160131h(r0, r15)     // Catch:{ all -> 0x0445 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0445 }
            r0.<init>()     // Catch:{ all -> 0x0445 }
            java.lang.String r2 = "reportMainCellExpose username %s, mid %d, firstTimeExpose %d, pos %d, unReadCountReport %d, currentTime %d, msgId="
            r0.append(r2)     // Catch:{ all -> 0x0445 }
            long r14 = r4.field_msgId     // Catch:{ all -> 0x0445 }
            r0.append(r14)     // Catch:{ all -> 0x0445 }
            java.lang.String r2 = ", lastRecCardId="
            r0.append(r2)     // Catch:{ all -> 0x0445 }
            r0.append(r9)     // Catch:{ all -> 0x0445 }
            java.lang.String r2 = ", rankSessionId="
            r0.append(r2)     // Catch:{ all -> 0x0445 }
            r0.append(r10)     // Catch:{ all -> 0x0445 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0445 }
            java.lang.Object[] r2 = new java.lang.Object[r7]     // Catch:{ all -> 0x0445 }
            r4 = 0
            r2[r4] = r3     // Catch:{ all -> 0x0445 }
            java.lang.Long r4 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0445 }
            r7 = 1
            r2[r7] = r4     // Catch:{ all -> 0x0445 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0445 }
            r7 = 2
            r2[r7] = r4     // Catch:{ all -> 0x0445 }
            int r4 = r1.f55484e     // Catch:{ all -> 0x0445 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0445 }
            r7 = 3
            r2[r7] = r4     // Catch:{ all -> 0x0445 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r22)     // Catch:{ all -> 0x0445 }
            r2[r27] = r4     // Catch:{ all -> 0x0445 }
            java.lang.Long r4 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0445 }
            r7 = 5
            r2[r7] = r4     // Catch:{ all -> 0x0445 }
            r4 = r18
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r0, r2)     // Catch:{ all -> 0x0443 }
            com.tencent.p014mm.storage.C19601c0.f55447b = r5     // Catch:{ all -> 0x0443 }
            com.tencent.p014mm.storage.C19601c0.f55449d = r24     // Catch:{ all -> 0x0443 }
            com.tencent.p014mm.storage.C19601c0.f55450e = r3     // Catch:{ all -> 0x0443 }
            com.tencent.p014mm.storage.C19601c0.f55448c = r12     // Catch:{ all -> 0x0443 }
            boolean r0 = r26.mo25865h()     // Catch:{ all -> 0x0443 }
            if (r0 == 0) goto L_0x045c
            te3.lp3 r0 = com.tencent.p014mm.storage.C19601c0.f55452g     // Catch:{ all -> 0x0443 }
            if (r0 == 0) goto L_0x043b
            java.util.LinkedList<te3.lp3> r2 = com.tencent.p014mm.storage.C19601c0.f55453h     // Catch:{ all -> 0x0443 }
            r2.add(r0)     // Catch:{ all -> 0x0443 }
        L_0x043b:
            com.tencent.mm.storage.c0$a r0 = com.tencent.p014mm.storage.C19601c0.C19602a.REDDOT_REPORT_ACT_TYPE_EXPOSE_BOX     // Catch:{ all -> 0x0443 }
            r2 = r23
            r2.mo25724m(r0)     // Catch:{ all -> 0x0443 }
            goto L_0x045c
        L_0x0443:
            r0 = move-exception
            goto L_0x044d
        L_0x0445:
            r0 = move-exception
            goto L_0x0448
        L_0x0447:
            r0 = move-exception
        L_0x0448:
            r4 = r18
            goto L_0x044d
        L_0x044b:
            r0 = move-exception
            r4 = r2
        L_0x044d:
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r0 = r0.getMessage()
            r3 = 0
            r2[r3] = r0
            java.lang.String r0 = "reportMainCellExpose exp %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r0, r2)
        L_0x045c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C19610e0.run():void");
    }
}
