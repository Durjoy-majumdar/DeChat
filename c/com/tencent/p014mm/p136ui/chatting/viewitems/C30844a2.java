package com.tencent.p014mm.p136ui.chatting.viewitems;

import com.tencent.p014mm.storage.C72963f4;
import hp3.C87581a;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.a2 */
public final class C30844a2<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ String f82864a;

    /* renamed from: b */
    public final /* synthetic */ C72963f4 f82865b;

    public C30844a2(String str, C72963f4 f4Var) {
        this.f82864a = str;
        this.f82865b = f4Var;
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [rx3.b0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call(java.lang.Object r13) {
        /*
            r12 = this;
            ob0.b$c r13 = (ob0.C89132b.C89134c) r13
            r0 = 0
            r1 = 1
            if (r13 == 0) goto L_0x000c
            int r2 = r13.f256793a
            if (r2 != 0) goto L_0x000c
            r2 = 1
            goto L_0x000d
        L_0x000c:
            r2 = 0
        L_0x000d:
            java.lang.String r3 = "MicroMsg.ChattingItemAppMsgFinderShopWindow"
            if (r2 == 0) goto L_0x0102
            int r2 = r13.f256794b
            if (r2 != 0) goto L_0x0102
            T r13 = r13.f256796d
            te3.ea1 r13 = (te3.C49255ea1) r13
            r2 = 0
            if (r13 == 0) goto L_0x00fa
            pe3.b r13 = r13.f132825d
            if (r13 == 0) goto L_0x00fa
            te3.dq0 r4 = new te3.dq0
            r4.<init>()
            byte[] r13 = r13.mo123703f()
            r4.parseFrom(r13)     // Catch:{ Exception -> 0x002d }
            goto L_0x003a
        L_0x002d:
            r13 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r13
            java.lang.String r13 = "safeParser"
            java.lang.String r0 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r13, r0, r1)
            r4 = r2
        L_0x003a:
            if (r4 == 0) goto L_0x00fa
            java.lang.String r13 = r12.f82864a
            com.tencent.mm.storage.f4 r0 = r12.f82865b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "updateStockCount userName:"
            r1.append(r5)
            r1.append(r13)
            java.lang.String r13 = ", count:"
            r1.append(r13)
            long r5 = r4.f132476d
            r1.append(r5)
            r13 = 33
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r13)
            long r4 = r4.f132476d
            java.lang.String r13 = "msg"
            gy3.C87412m.m108594g(r0, r13)
            java.lang.String r6 = r0.getContent()     // Catch:{ Exception -> 0x00df }
            r13 = -1
            if (r6 == 0) goto L_0x007c
            java.lang.String r7 = "<commodityInStockCount>"
            r8 = 0
            r9 = 0
            r10 = 6
            r11 = 0
            int r1 = z04.C112550d0.m153769E(r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x00df }
            goto L_0x007d
        L_0x007c:
            r1 = -1
        L_0x007d:
            java.lang.String r6 = r0.getContent()     // Catch:{ Exception -> 0x00df }
            if (r6 == 0) goto L_0x008e
            java.lang.String r7 = "</commodityInStockCount>"
            r8 = 0
            r9 = 0
            r10 = 6
            r11 = 0
            int r6 = z04.C112550d0.m153769E(r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x00df }
            goto L_0x008f
        L_0x008e:
            r6 = -1
        L_0x008f:
            if (r1 == r13) goto L_0x00c1
            if (r6 != r13) goto L_0x0094
            goto L_0x00c1
        L_0x0094:
            java.lang.String r13 = r0.getContent()     // Catch:{ Exception -> 0x00df }
            if (r13 == 0) goto L_0x00a8
            int r1 = r1 + 23
            java.lang.String r2 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x00df }
            java.lang.CharSequence r13 = z04.C112550d0.m153781Q(r13, r1, r6, r2)     // Catch:{ Exception -> 0x00df }
            java.lang.String r2 = r13.toString()     // Catch:{ Exception -> 0x00df }
        L_0x00a8:
            r0.mo108732L2(r2)     // Catch:{ Exception -> 0x00df }
            java.lang.Class<f62.k0> r13 = f62.C75700k0.class
            k40.a r13 = f40.C86709a0.m107533q(r13)     // Catch:{ Exception -> 0x00df }
            f62.k0 r13 = (f62.C75700k0) r13     // Catch:{ Exception -> 0x00df }
            g62.l r13 = r13.mo96095LE()     // Catch:{ Exception -> 0x00df }
            long r1 = r0.getMsgId()     // Catch:{ Exception -> 0x00df }
            com.tencent.mm.storage.g4 r13 = (com.tencent.p014mm.storage.C72972g4) r13     // Catch:{ Exception -> 0x00df }
            r13.xy0(r1, r0)     // Catch:{ Exception -> 0x00df }
            goto L_0x00f8
        L_0x00c1:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00df }
            r13.<init>()     // Catch:{ Exception -> 0x00df }
            java.lang.String r1 = "updateStockCount but content = "
            r13.append(r1)     // Catch:{ Exception -> 0x00df }
            java.lang.String r0 = r0.getContent()     // Catch:{ Exception -> 0x00df }
            r13.append(r0)     // Catch:{ Exception -> 0x00df }
            java.lang.String r0 = ",not commodityInStockCount"
            r13.append(r0)     // Catch:{ Exception -> 0x00df }
            java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x00df }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r13)     // Catch:{ Exception -> 0x00df }
            goto L_0x00f8
        L_0x00df:
            r13 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "updateStockCount error:"
            r0.append(r1)
            java.lang.String r13 = r13.getMessage()
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r13)
        L_0x00f8:
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x00fa:
            if (r2 != 0) goto L_0x0107
            java.lang.String r13 = "FinderGetWindowProductProfileCardInfo resp is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r13)
            goto L_0x0107
        L_0x0102:
            java.lang.String r13 = "FinderGetWindowProductProfileCardInfo Request Fail!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r13)
        L_0x0107:
            rx3.b0 r13 = rx3.C13598b0.f38549a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C30844a2.call(java.lang.Object):java.lang.Object");
    }
}
