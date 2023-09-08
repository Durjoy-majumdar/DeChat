package com.tencent.p014mm.p136ui.conversation;

/* renamed from: com.tencent.mm.ui.conversation.i */
public final class C74693i {

    /* renamed from: a */
    public static final C74693i f219589a = new C74693i();

    /* renamed from: b */
    public static int f219590b = -1;

    /* renamed from: c */
    public static int f219591c = -1;

    /* renamed from: d */
    public static boolean f219592d = true;

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b3 A[Catch:{ Exception -> 0x00d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d3 A[Catch:{ Exception -> 0x00d1 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo103854a(android.widget.ListView r8, com.tencent.p014mm.p136ui.conversation.C74720p r9, boolean r10, boolean r11) {
        /*
            r7 = this;
            com.tencent.mm.storage.c0 r0 = com.tencent.p014mm.storage.C19601c0.f55446a
            rx3.g r0 = com.tencent.p014mm.storage.C19601c0.f55458m
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0013
            return
        L_0x0013:
            if (r9 == 0) goto L_0x00ef
            if (r8 != 0) goto L_0x0019
            goto L_0x00ef
        L_0x0019:
            int r0 = r8.getFirstVisiblePosition()
            int r1 = r8.getLastVisiblePosition()
            int r8 = r8.getHeaderViewsCount()
            if (r11 == 0) goto L_0x0030
            int r2 = f219590b
            if (r0 != r2) goto L_0x0030
            int r2 = f219591c
            if (r2 != r1) goto L_0x0030
            return
        L_0x0030:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "checkOfficialAccountShow headerCount="
            r2.append(r3)
            r2.append(r8)
            java.lang.String r3 = ", firstPos="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = ", lastPos="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r3 = ", visible="
            r2.append(r3)
            r2.append(r10)
            java.lang.String r3 = ", scroll="
            r2.append(r3)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MicroMsg.ConvExposeHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r3, r2)
            java.lang.String r2 = ""
            java.lang.String r4 = "MicroMsg.BizMainCellExposeHelper"
            r5 = 0
            if (r10 != 0) goto L_0x007a
            zt3.t r8 = zt3.C119157j.f356862d
            com.tencent.mm.storage.f0 r9 = new com.tencent.mm.storage.f0
            r9.<init>(r2, r5, r5)
            zt3.j r8 = (zt3.C119157j) r8
            r8.mo183876g(r9, r4)
            return
        L_0x007a:
            f219590b = r0
            f219591c = r1
            r10 = 1
            if (r0 <= r8) goto L_0x0084
            int r0 = r0 - r8
            int r0 = r0 + r10
            goto L_0x0085
        L_0x0084:
            r0 = 0
        L_0x0085:
            if (r1 < r8) goto L_0x008a
            int r1 = r1 - r8
            int r1 = r1 - r10
            goto L_0x008b
        L_0x008a:
            r1 = 0
        L_0x008b:
            r8 = 0
            if (r0 > r1) goto L_0x00ad
        L_0x008e:
            ai3.a r6 = r9.getItem(r0)     // Catch:{ Exception -> 0x00d1 }
            com.tencent.mm.storage.h2 r6 = (com.tencent.p014mm.storage.C72976h2) r6     // Catch:{ Exception -> 0x00d1 }
            if (r6 != 0) goto L_0x0097
            goto L_0x00a8
        L_0x0097:
            java.lang.String r8 = r6.getUsername()     // Catch:{ Exception -> 0x00d1 }
            boolean r8 = com.tencent.p014mm.storage.C72996z1.m85841l5(r8)     // Catch:{ Exception -> 0x00d1 }
            if (r8 == 0) goto L_0x00a7
            java.lang.String r8 = r6.mo108822p2()     // Catch:{ Exception -> 0x00d1 }
            r9 = 1
            goto L_0x00b1
        L_0x00a7:
            r8 = r6
        L_0x00a8:
            if (r0 == r1) goto L_0x00ad
            int r0 = r0 + 1
            goto L_0x008e
        L_0x00ad:
            r6 = r8
            r8 = r2
            r9 = 0
            r0 = 0
        L_0x00b1:
            if (r9 == 0) goto L_0x00d3
            if (r11 == 0) goto L_0x00bb
            com.tencent.mm.storage.c0 r9 = com.tencent.p014mm.storage.C19601c0.f55446a     // Catch:{ Exception -> 0x00d1 }
            boolean r9 = com.tencent.p014mm.storage.C19601c0.f55454i     // Catch:{ Exception -> 0x00d1 }
            if (r9 != 0) goto L_0x00ef
        L_0x00bb:
            com.tencent.mm.storage.c0 r9 = com.tencent.p014mm.storage.C19601c0.f55446a     // Catch:{ Exception -> 0x00d1 }
            if (r6 != 0) goto L_0x00c0
            goto L_0x00ef
        L_0x00c0:
            int r9 = r6.mo108786G2()     // Catch:{ Exception -> 0x00d1 }
            zt3.t r11 = zt3.C119157j.f356862d     // Catch:{ Exception -> 0x00d1 }
            com.tencent.mm.storage.e0 r1 = new com.tencent.mm.storage.e0     // Catch:{ Exception -> 0x00d1 }
            r1.<init>(r8, r0, r6, r9)     // Catch:{ Exception -> 0x00d1 }
            zt3.j r11 = (zt3.C119157j) r11     // Catch:{ Exception -> 0x00d1 }
            r11.mo183876g(r1, r4)     // Catch:{ Exception -> 0x00d1 }
            goto L_0x00ef
        L_0x00d1:
            r8 = move-exception
            goto L_0x00e2
        L_0x00d3:
            com.tencent.mm.storage.c0 r8 = com.tencent.p014mm.storage.C19601c0.f55446a     // Catch:{ Exception -> 0x00d1 }
            zt3.t r8 = zt3.C119157j.f356862d     // Catch:{ Exception -> 0x00d1 }
            com.tencent.mm.storage.f0 r9 = new com.tencent.mm.storage.f0     // Catch:{ Exception -> 0x00d1 }
            r9.<init>(r2, r5, r5)     // Catch:{ Exception -> 0x00d1 }
            zt3.j r8 = (zt3.C119157j) r8     // Catch:{ Exception -> 0x00d1 }
            r8.mo183876g(r9, r4)     // Catch:{ Exception -> 0x00d1 }
            goto L_0x00ef
        L_0x00e2:
            java.lang.Object[] r9 = new java.lang.Object[r10]
            java.lang.String r8 = r8.getMessage()
            r9[r5] = r8
            java.lang.String r8 = "checkOfficialAccountShow ex %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r8, r9)
        L_0x00ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.conversation.C74693i.mo103854a(android.widget.ListView, com.tencent.mm.ui.conversation.p, boolean, boolean):void");
    }
}
