package com.tencent.p014mm.storage;

import java.util.LinkedList;
import ob0.l0$$e;

/* renamed from: com.tencent.mm.storage.v */
public final class C85800v implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ LinkedList<String> f249891d;

    public C85800v(LinkedList<String> linkedList) {
        this.f249891d = linkedList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e1 A[Catch:{ Exception -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e3 A[Catch:{ Exception -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f3 A[Catch:{ Exception -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f6 A[Catch:{ Exception -> 0x01cb }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo1488a(int r27, int r28, java.lang.String r29, ob0.C47350c r30, ob0.C117747y r31) {
        /*
            r26 = this;
            r0 = r27
            r1 = r28
            java.lang.String r2 = "MicroMsg.BizCardLogic"
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            if (r0 != 0) goto L_0x01e7
            if (r1 == 0) goto L_0x0011
            goto L_0x01e7
        L_0x0011:
            r0 = r30
            ob0.c$d r0 = r0.f127056b
            pe3.a r0 = r0.f127083a
            boolean r1 = r0 instanceof te3.ig4
            if (r1 == 0) goto L_0x001e
            te3.ig4 r0 = (te3.ig4) r0
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            if (r0 != 0) goto L_0x0022
            return r3
        L_0x0022:
            java.lang.String r1 = r0.f135333g
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x003b
            java.lang.String r0 = "checkAd callback resp.Data is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            r7 = 18
            kj2.d r4 = kj2.C117407d.INSTANCE
            r5 = 1454(0x5ae, double:7.184E-321)
            r9 = 1
            r4.mo182089r(r5, r7, r9)
            return r3
        L_0x003b:
            r14 = 19
            kj2.d r11 = kj2.C117407d.INSTANCE
            r12 = 1454(0x5ae, double:7.184E-321)
            r16 = 1
            r11.mo182089r(r12, r14, r16)
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x01cb }
            java.lang.String r0 = r0.f135333g     // Catch:{ Exception -> 0x01cb }
            r1.<init>(r0)     // Catch:{ Exception -> 0x01cb }
            java.lang.String r0 = "aid"
            java.lang.String r0 = r1.optString(r0)     // Catch:{ Exception -> 0x01cb }
            java.lang.String r5 = "del_aid"
            org.json.JSONArray r1 = r1.optJSONArray(r5)     // Catch:{ Exception -> 0x01cb }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01cb }
            r5.<init>()     // Catch:{ Exception -> 0x01cb }
            java.lang.String r6 = "checkAd callback chooseAid="
            r5.append(r6)     // Catch:{ Exception -> 0x01cb }
            r5.append(r0)     // Catch:{ Exception -> 0x01cb }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x01cb }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r5)     // Catch:{ Exception -> 0x01cb }
            if (r1 == 0) goto L_0x0074
            int r5 = r1.length()     // Catch:{ Exception -> 0x01cb }
            goto L_0x0075
        L_0x0074:
            r5 = 0
        L_0x0075:
            r6 = 3
            r7 = 4
            r10 = 1
            if (r5 <= 0) goto L_0x0111
            int r5 = r1.length()     // Catch:{ Exception -> 0x01cb }
            r11 = 0
        L_0x007f:
            if (r11 >= r5) goto L_0x0111
            java.lang.String r12 = r1.optString(r11)     // Catch:{ Exception -> 0x01cb }
            if (r12 == 0) goto L_0x0090
            boolean r13 = z04.C112551y.m153811k(r12)     // Catch:{ Exception -> 0x01cb }
            if (r13 == 0) goto L_0x008e
            goto L_0x0090
        L_0x008e:
            r13 = 0
            goto L_0x0091
        L_0x0090:
            r13 = 1
        L_0x0091:
            if (r13 != 0) goto L_0x010d
            java.util.HashMap<java.lang.String, java.lang.Long> r13 = com.tencent.p014mm.storage.C19627t.f55588c     // Catch:{ Exception -> 0x01cb }
            java.lang.Object r13 = r13.get(r12)     // Catch:{ Exception -> 0x01cb }
            java.lang.Long r13 = (java.lang.Long) r13     // Catch:{ Exception -> 0x01cb }
            if (r13 == 0) goto L_0x010d
            com.tencent.mm.storage.p0 r14 = rb0.C48009v0.Jx0()     // Catch:{ Exception -> 0x01cb }
            long r8 = r13.longValue()     // Catch:{ Exception -> 0x01cb }
            com.tencent.mm.storage.o0 r8 = r14.mo25806kD(r8)     // Catch:{ Exception -> 0x01cb }
            if (r8 == 0) goto L_0x010d
            com.tencent.mm.storage.p0 r9 = rb0.C48009v0.Jx0()     // Catch:{ Exception -> 0x01cb }
            long r13 = r13.longValue()     // Catch:{ Exception -> 0x01cb }
            r9.mo25785Lo(r13)     // Catch:{ Exception -> 0x01cb }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01cb }
            r9.<init>()     // Catch:{ Exception -> 0x01cb }
            java.lang.String r13 = "checkAd force delete ad "
            r9.append(r13)     // Catch:{ Exception -> 0x01cb }
            r9.append(r12)     // Catch:{ Exception -> 0x01cb }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x01cb }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r9)     // Catch:{ Exception -> 0x01cb }
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x01cb }
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x01cb }
            r13[r3] = r12     // Catch:{ Exception -> 0x01cb }
            java.lang.String r12 = r8.mo25775y2()     // Catch:{ Exception -> 0x01cb }
            r13[r10] = r12     // Catch:{ Exception -> 0x01cb }
            r12 = 2
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x01cb }
            r13[r12] = r14     // Catch:{ Exception -> 0x01cb }
            int r12 = r8.field_isRead     // Catch:{ Exception -> 0x01cb }
            if (r12 != r10) goto L_0x00e3
            r12 = 1
            goto L_0x00e4
        L_0x00e3:
            r12 = 0
        L_0x00e4:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x01cb }
            r13[r6] = r12     // Catch:{ Exception -> 0x01cb }
            r12 = 20635(0x509b, float:2.8916E-41)
            r9.mo160131h(r12, r13)     // Catch:{ Exception -> 0x01cb }
            int r8 = r8.field_isRead     // Catch:{ Exception -> 0x01cb }
            if (r8 != r10) goto L_0x00f6
            r8 = 21
            goto L_0x00f8
        L_0x00f6:
            r8 = 20
        L_0x00f8:
            r15 = r8
            kj2.d r12 = kj2.C117407d.INSTANCE     // Catch:{ Exception -> 0x01cb }
            r13 = 1454(0x5ae, double:7.184E-321)
            r17 = 1
            r12.mo182089r(r13, r15, r17)     // Catch:{ Exception -> 0x01cb }
            r22 = 23
            kj2.d r19 = kj2.C117407d.INSTANCE     // Catch:{ Exception -> 0x01cb }
            r20 = 1454(0x5ae, double:7.184E-321)
            r24 = 1
            r19.mo182089r(r20, r22, r24)     // Catch:{ Exception -> 0x01cb }
        L_0x010d:
            int r11 = r11 + 1
            goto L_0x007f
        L_0x0111:
            r5 = r26
            java.util.LinkedList<java.lang.String> r1 = r5.f249891d     // Catch:{ Exception -> 0x01c9 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x01c9 }
        L_0x0119:
            boolean r8 = r1.hasNext()     // Catch:{ Exception -> 0x01c9 }
            if (r8 == 0) goto L_0x01e6
            java.lang.Object r8 = r1.next()     // Catch:{ Exception -> 0x01c9 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x01c9 }
            java.util.HashSet<java.lang.String> r9 = com.tencent.p014mm.storage.C19627t.f55589d     // Catch:{ Exception -> 0x01c9 }
            r9.add(r8)     // Catch:{ Exception -> 0x01c9 }
            boolean r9 = gy3.C87412m.m108589b(r8, r0)     // Catch:{ Exception -> 0x01c9 }
            if (r9 != 0) goto L_0x01c4
            java.util.HashMap<java.lang.String, java.lang.Long> r9 = com.tencent.p014mm.storage.C19627t.f55588c     // Catch:{ Exception -> 0x01c9 }
            java.lang.Object r8 = r9.get(r8)     // Catch:{ Exception -> 0x01c9 }
            java.lang.Long r8 = (java.lang.Long) r8     // Catch:{ Exception -> 0x01c9 }
            if (r8 == 0) goto L_0x01c4
            com.tencent.mm.storage.p0 r9 = rb0.C48009v0.Jx0()     // Catch:{ Exception -> 0x01c9 }
            long r11 = r8.longValue()     // Catch:{ Exception -> 0x01c9 }
            com.tencent.mm.storage.o0 r9 = r9.mo25806kD(r11)     // Catch:{ Exception -> 0x01c9 }
            if (r9 == 0) goto L_0x01c4
            int r11 = r9.field_isRead     // Catch:{ Exception -> 0x01c9 }
            if (r11 != 0) goto L_0x0199
            com.tencent.mm.storage.p0 r11 = rb0.C48009v0.Jx0()     // Catch:{ Exception -> 0x01c9 }
            long r12 = r8.longValue()     // Catch:{ Exception -> 0x01c9 }
            r11.mo25785Lo(r12)     // Catch:{ Exception -> 0x01c9 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01c9 }
            r8.<init>()     // Catch:{ Exception -> 0x01c9 }
            java.lang.String r11 = "checkAd delete ad "
            r8.append(r11)     // Catch:{ Exception -> 0x01c9 }
            java.lang.String r11 = r9.mo25764n2()     // Catch:{ Exception -> 0x01c9 }
            r8.append(r11)     // Catch:{ Exception -> 0x01c9 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x01c9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r8)     // Catch:{ Exception -> 0x01c9 }
            com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x01c9 }
            java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x01c9 }
            java.lang.String r12 = r9.mo25764n2()     // Catch:{ Exception -> 0x01c9 }
            r11[r3] = r12     // Catch:{ Exception -> 0x01c9 }
            java.lang.String r9 = r9.mo25775y2()     // Catch:{ Exception -> 0x01c9 }
            r11[r10] = r9     // Catch:{ Exception -> 0x01c9 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x01c9 }
            r12 = 2
            r11[r12] = r9     // Catch:{ Exception -> 0x01c9 }
            r11[r6] = r4     // Catch:{ Exception -> 0x01c9 }
            r9 = 20635(0x509b, float:2.8916E-41)
            r8.mo160131h(r9, r11)     // Catch:{ Exception -> 0x01c9 }
            r15 = 22
            kj2.d r12 = kj2.C117407d.INSTANCE     // Catch:{ Exception -> 0x01c9 }
            r13 = 1454(0x5ae, double:7.184E-321)
            r17 = 1
            r12.mo182089r(r13, r15, r17)     // Catch:{ Exception -> 0x01c9 }
            goto L_0x01c4
        L_0x0199:
            r14 = 24
            kj2.d r11 = kj2.C117407d.INSTANCE     // Catch:{ Exception -> 0x01c9 }
            r12 = 1454(0x5ae, double:7.184E-321)
            r16 = 1
            r11.mo182089r(r12, r14, r16)     // Catch:{ Exception -> 0x01c9 }
            com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x01c9 }
            java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x01c9 }
            java.lang.String r12 = r9.mo25764n2()     // Catch:{ Exception -> 0x01c9 }
            r11[r3] = r12     // Catch:{ Exception -> 0x01c9 }
            java.lang.String r9 = r9.mo25775y2()     // Catch:{ Exception -> 0x01c9 }
            r11[r10] = r9     // Catch:{ Exception -> 0x01c9 }
            r9 = 2
            r11[r9] = r4     // Catch:{ Exception -> 0x01c9 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x01c9 }
            r11[r6] = r12     // Catch:{ Exception -> 0x01c9 }
            r12 = 20635(0x509b, float:2.8916E-41)
            r8.mo160131h(r12, r11)     // Catch:{ Exception -> 0x01c9 }
            goto L_0x0119
        L_0x01c4:
            r9 = 2
            r12 = 20635(0x509b, float:2.8916E-41)
            goto L_0x0119
        L_0x01c9:
            r0 = move-exception
            goto L_0x01ce
        L_0x01cb:
            r0 = move-exception
            r5 = r26
        L_0x01ce:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "checkAd callback ex "
            r1.append(r4)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
        L_0x01e6:
            return r3
        L_0x01e7:
            r5 = r26
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "checkAd callback errType="
            r4.append(r6)
            r4.append(r0)
            java.lang.String r0 = ", errCode="
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            r9 = 17
            kj2.d r6 = kj2.C117407d.INSTANCE
            r7 = 1454(0x5ae, double:7.184E-321)
            r11 = 1
            r6.mo182089r(r7, r9, r11)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C85800v.mo1488a(int, int, java.lang.String, ob0.c, ob0.y):int");
    }
}
