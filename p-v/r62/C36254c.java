package r62;

import ob0.C117747y;

/* renamed from: r62.c */
public class C36254c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C117747y f96539d;

    /* renamed from: e */
    public final /* synthetic */ int f96540e;

    /* renamed from: f */
    public final /* synthetic */ int f96541f;

    /* renamed from: g */
    public final /* synthetic */ C118225d f96542g;

    public C36254c(C118225d dVar, C117747y yVar, int i, int i2) {
        this.f96542g = dVar;
        this.f96539d = yVar;
        this.f96540e = i;
        this.f96541f = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        r2 = r2.getUri();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r28 = this;
            r1 = r28
            ob0.y r0 = r1.f96539d
            int r0 = r0.getType()
            ob0.y r2 = r1.f96539d
            com.tencent.mm.network.u r2 = r2.getReqResp()
            r3 = 0
            r4 = 1
            r5 = 1616(0x650, float:2.264E-42)
            if (r0 == r5) goto L_0x0030
            r5 = 1518(0x5ee, float:2.127E-42)
            if (r0 == r5) goto L_0x0030
            r5 = 385(0x181, float:5.4E-43)
            if (r0 != r5) goto L_0x001d
            goto L_0x0030
        L_0x001d:
            if (r2 == 0) goto L_0x002e
            java.lang.String r2 = r2.getUri()
            if (r2 == 0) goto L_0x002e
            java.lang.String r5 = "/cgi-bin/mmpay-bin/"
            boolean r2 = r2.startsWith(r5)
            if (r2 == 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r2 = 0
            goto L_0x0031
        L_0x0030:
            r2 = 1
        L_0x0031:
            if (r2 != r4) goto L_0x015f
            r62.d r5 = r1.f96542g
            int r6 = r1.f96540e
            int r7 = r1.f96541f
            r5.getClass()
            java.lang.String r5 = "MicroMsg.NetworkOptReport"
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0150 }
            boolean r8 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isMobile(r8)     // Catch:{ Exception -> 0x0150 }
            if (r8 != 0) goto L_0x004a
            goto L_0x015f
        L_0x004a:
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0150 }
            java.lang.String r9 = "android.permission.ACCESS_FINE_LOCATION"
            int r8 = p385u2.C111105a.m151499a(r8, r9)     // Catch:{ Exception -> 0x0150 }
            if (r8 == 0) goto L_0x0058
            goto L_0x015f
        L_0x0058:
            if (r6 != 0) goto L_0x005e
            if (r7 != 0) goto L_0x005e
            r8 = 1
            goto L_0x005f
        L_0x005e:
            r8 = 0
        L_0x005f:
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0150 }
            java.util.List r9 = r62.C118225d.vx0(r9)     // Catch:{ Exception -> 0x0150 }
            java.util.LinkedList r9 = (java.util.LinkedList) r9     // Catch:{ Exception -> 0x0150 }
            int r10 = r9.size()     // Catch:{ Exception -> 0x0150 }
            if (r10 != 0) goto L_0x0071
            goto L_0x015f
        L_0x0071:
            java.lang.Object r10 = r9.get(r3)     // Catch:{ Exception -> 0x0150 }
            r62.d$a r10 = (r62.C118225d.C36255a) r10     // Catch:{ Exception -> 0x0150 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ Exception -> 0x0150 }
        L_0x007b:
            boolean r11 = r9.hasNext()     // Catch:{ Exception -> 0x0150 }
            if (r11 == 0) goto L_0x008c
            java.lang.Object r11 = r9.next()     // Catch:{ Exception -> 0x0150 }
            r62.d$a r11 = (r62.C118225d.C36255a) r11     // Catch:{ Exception -> 0x0150 }
            boolean r12 = r11.f96549g     // Catch:{ Exception -> 0x0150 }
            if (r12 == 0) goto L_0x007b
            r10 = r11
        L_0x008c:
            java.lang.String r9 = r10.f96543a     // Catch:{ Exception -> 0x0150 }
            java.lang.String r11 = r10.f96544b     // Catch:{ Exception -> 0x0150 }
            java.lang.String r12 = r10.f96546d     // Catch:{ Exception -> 0x0150 }
            java.lang.String r13 = r10.f96545c     // Catch:{ Exception -> 0x0150 }
            java.lang.String r14 = r10.f96547e     // Catch:{ Exception -> 0x0150 }
            int r10 = r10.f96548f     // Catch:{ Exception -> 0x0150 }
            r16 = 3
            if (r2 != r4) goto L_0x009f
            r19 = 3
            goto L_0x00a6
        L_0x009f:
            if (r8 != 0) goto L_0x00a4
            r19 = 2
            goto L_0x00a6
        L_0x00a4:
            r19 = 1
        L_0x00a6:
            java.lang.String r15 = "reportCellInfo mcc[%s] mnc[%s] lac[%s] cellid[%s] netType[%s] dbm[%d] type[%d] success[%s] errType[%d] errCode[%d] cmdid[%d] reportType[%d]"
            r4 = 12
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0150 }
            r1[r3] = r9     // Catch:{ Exception -> 0x0150 }
            r18 = 1
            r1[r18] = r11     // Catch:{ Exception -> 0x0150 }
            r17 = 2
            r1[r17] = r12     // Catch:{ Exception -> 0x0150 }
            r1[r16] = r13     // Catch:{ Exception -> 0x0150 }
            r18 = 4
            r1[r18] = r14     // Catch:{ Exception -> 0x0150 }
            java.lang.Integer r20 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x0150 }
            r21 = 5
            r1[r21] = r20     // Catch:{ Exception -> 0x0150 }
            java.lang.Integer r20 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0150 }
            r22 = 6
            r1[r22] = r20     // Catch:{ Exception -> 0x0150 }
            java.lang.Boolean r20 = java.lang.Boolean.valueOf(r8)     // Catch:{ Exception -> 0x0150 }
            r23 = 7
            r1[r23] = r20     // Catch:{ Exception -> 0x0150 }
            java.lang.Integer r20 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0150 }
            r24 = 8
            r1[r24] = r20     // Catch:{ Exception -> 0x0150 }
            java.lang.Integer r20 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x0150 }
            r25 = 9
            r1[r25] = r20     // Catch:{ Exception -> 0x0150 }
            java.lang.Integer r20 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0150 }
            r26 = 10
            r1[r26] = r20     // Catch:{ Exception -> 0x0150 }
            java.lang.Integer r20 = java.lang.Integer.valueOf(r19)     // Catch:{ Exception -> 0x0150 }
            r27 = 11
            r1[r27] = r20     // Catch:{ Exception -> 0x0150 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r15, r1)     // Catch:{ Exception -> 0x0150 }
            kj2.d r1 = kj2.C117407d.INSTANCE     // Catch:{ Exception -> 0x0150 }
            r15 = 13
            java.lang.Object[] r15 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x0150 }
            r15[r3] = r9     // Catch:{ Exception -> 0x0150 }
            r9 = 1
            r15[r9] = r11     // Catch:{ Exception -> 0x0150 }
            r9 = 2
            r15[r9] = r12     // Catch:{ Exception -> 0x0150 }
            r15[r16] = r13     // Catch:{ Exception -> 0x0150 }
            r15[r18] = r14     // Catch:{ Exception -> 0x0150 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0150 }
            r15[r21] = r2     // Catch:{ Exception -> 0x0150 }
            if (r8 == 0) goto L_0x0114
            r18 = 0
            goto L_0x0116
        L_0x0114:
            r18 = 1
        L_0x0116:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r18)     // Catch:{ Exception -> 0x0150 }
            r15[r22] = r2     // Catch:{ Exception -> 0x0150 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0150 }
            r15[r23] = r2     // Catch:{ Exception -> 0x0150 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x0150 }
            r15[r24] = r2     // Catch:{ Exception -> 0x0150 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0150 }
            r15[r25] = r2     // Catch:{ Exception -> 0x0150 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x0150 }
            r15[r26] = r2     // Catch:{ Exception -> 0x0150 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0150 }
            r15[r27] = r0     // Catch:{ Exception -> 0x0150 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r19)     // Catch:{ Exception -> 0x0150 }
            r15[r4] = r0     // Catch:{ Exception -> 0x0150 }
            java.lang.String r20 = r1.mo182087p(r15)     // Catch:{ Exception -> 0x0150 }
            r21 = 0
            r22 = 0
            r18 = 15608(0x3cf8, float:2.1871E-41)
            r17 = r1
            r17.mo160132i(r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x0150 }
            goto L_0x015f
        L_0x0150:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r1[r3] = r0
            java.lang.String r0 = "getNetType : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r0, r1)
        L_0x015f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r62.C36254c.run():void");
    }
}
