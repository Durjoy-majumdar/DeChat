package com.tencent.p014mm.wallet_core.model;

import ae2.C39550b;
import android.os.Bundle;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.wallet_core.p137ui.C75226r;
import ob0.C117747y;

/* renamed from: com.tencent.mm.wallet_core.model.k0 */
public abstract class C75123k0 extends C117747y implements C1311n {
    private Bundle mBundle;
    private int mCmdId = 0;
    private String mProcessName = "";
    private long mRequestTime;
    private int mScene = 0;
    public long sessionId = 0;

    /* JADX WARNING: Removed duplicated region for block: B:282:0x0508  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x050a  */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x0513  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0524  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long reportCostTime(int r23, int r24) {
        /*
            r22 = this;
            r0 = r22
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r0.mRequestTime
            long r1 = r1 - r3
            int r3 = r22.getCgicmdForKV()
            r0.mCmdId = r3
            long r3 = java.lang.System.currentTimeMillis()
            android.os.Bundle r5 = r0.mBundle
            java.lang.String r6 = ""
            if (r5 == 0) goto L_0x0048
            java.lang.String r6 = "key_TransId"
            java.lang.String r6 = r5.getString(r6)
            android.os.Bundle r5 = r0.mBundle
            java.lang.String r7 = "key_reqKey"
            java.lang.String r5 = r5.getString(r7)
            long r7 = r0.sessionId
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x0039
            android.os.Bundle r7 = r0.mBundle
            java.lang.String r8 = "key_SessionId"
            long r7 = r7.getLong(r8, r9)
            r0.sessionId = r7
        L_0x0039:
            int r7 = r0.mScene
            if (r7 != 0) goto L_0x0049
            android.os.Bundle r7 = r0.mBundle
            java.lang.String r8 = "key_scene"
            int r7 = r7.getInt(r8)
            r0.mScene = r7
            goto L_0x0049
        L_0x0048:
            r5 = r6
        L_0x0049:
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r8 = 11170(0x2ba2, float:1.5653E-41)
            r9 = 11
            java.lang.Object[] r9 = new java.lang.Object[r9]
            int r10 = r22.getType()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r11 = 0
            r9[r11] = r10
            int r10 = r0.mCmdId
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r12 = 1
            r9[r12] = r10
            java.lang.Long r10 = java.lang.Long.valueOf(r1)
            r13 = 2
            r9[r13] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r23)
            r14 = 3
            r9[r14] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r24)
            r15 = 4
            r9[r15] = r10
            android.content.Context r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r10 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.getNetType((android.content.Context) r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r14 = 5
            r9[r14] = r10
            java.lang.String r10 = r0.mProcessName
            r14 = 6
            r9[r14] = r10
            r10 = 7
            r9[r10] = r6
            r6 = 8
            r9[r6] = r5
            long r13 = r0.sessionId
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            r14 = 9
            r9[r14] = r13
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 10
            r9[r4] = r3
            r7.mo160131h(r8, r9)
            int r3 = r22.getType()
            int r8 = r22.getCgicmdForKV()
            int r9 = r0.mScene
            java.lang.String r13 = r0.mProcessName
            r5 = 112(0x70, float:1.57E-43)
            r4 = 385(0x181, float:5.4E-43)
            if (r3 != r4) goto L_0x00c1
            if (r8 != r5) goto L_0x00c1
            r16 = 1
            goto L_0x00c3
        L_0x00c1:
            r16 = 0
        L_0x00c3:
            r14 = 19
            r5 = 1
            r10 = 1558(0x616, float:2.183E-42)
            r15 = 1685(0x695, float:2.361E-42)
            r11 = 1581(0x62d, float:2.215E-42)
            if (r16 != 0) goto L_0x0131
            boolean r16 = com.tencent.p014mm.wallet_core.model.C75136r0.m90119a(r3, r8)
            if (r16 != 0) goto L_0x0131
            boolean r16 = com.tencent.p014mm.wallet_core.model.C75136r0.m90120b(r3, r8)
            if (r16 != 0) goto L_0x0131
            if (r3 == r11) goto L_0x00e3
            if (r3 != r15) goto L_0x00e0
            goto L_0x00e3
        L_0x00e0:
            r16 = 0
            goto L_0x00e5
        L_0x00e3:
            r16 = 1
        L_0x00e5:
            if (r16 != 0) goto L_0x0131
            if (r3 != r10) goto L_0x00f0
            if (r8 == 0) goto L_0x00ed
            if (r8 != r12) goto L_0x00f0
        L_0x00ed:
            r16 = 1
            goto L_0x00f2
        L_0x00f0:
            r16 = 0
        L_0x00f2:
            if (r16 == 0) goto L_0x00f5
            goto L_0x0131
        L_0x00f5:
            if (r3 != r4) goto L_0x00fb
            if (r8 != r14) goto L_0x00fb
            r3 = 1
            goto L_0x00fc
        L_0x00fb:
            r3 = 0
        L_0x00fc:
            if (r3 == 0) goto L_0x05e7
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            com.tencent.mars.smc.IDKey r4 = new com.tencent.mars.smc.IDKey
            r4.<init>()
            r8 = 136(0x88, float:1.9E-43)
            r4.SetID(r8)
            r4.SetValue(r5)
            r9 = 0
            r4.SetKey(r9)
            r3.add(r4)
            if (r23 != 0) goto L_0x011b
            if (r24 == 0) goto L_0x012c
        L_0x011b:
            com.tencent.mars.smc.IDKey r4 = new com.tencent.mars.smc.IDKey
            r4.<init>()
            r4.SetID(r8)
            r4.SetValue(r5)
            r4.SetKey(r12)
            r3.add(r4)
        L_0x012c:
            r7.mo160124a(r3, r12)
            goto L_0x05e7
        L_0x0131:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r5 = "reportIDKeyWalletPay the cmdType is for idkey report cmdType:"
            r14.append(r5)
            r14.append(r3)
            java.lang.String r6 = " cmdid:"
            r14.append(r6)
            r14.append(r8)
            java.lang.String r14 = r14.toString()
            java.lang.String r10 = "MicroMsg.WalletReportUtil"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r14)
            r14 = 21
            r18 = 134(0x86, float:1.88E-43)
            r19 = 139(0x8b, float:1.95E-43)
            r15 = -1
            r11 = 4
            if (r9 != r11) goto L_0x015d
            r11 = 132(0x84, float:1.85E-43)
            goto L_0x01b6
        L_0x015d:
            if (r9 != r12) goto L_0x0162
            r11 = 163(0xa3, float:2.28E-43)
            goto L_0x01b6
        L_0x0162:
            r11 = 2
            if (r9 == r11) goto L_0x01b4
            r11 = 36
            if (r9 != r11) goto L_0x016a
            goto L_0x01b4
        L_0x016a:
            r11 = 3
            if (r9 != r11) goto L_0x0170
            r11 = 130(0x82, float:1.82E-43)
            goto L_0x01b6
        L_0x0170:
            r11 = 5
            if (r9 != r11) goto L_0x0176
            r11 = 153(0x99, float:2.14E-43)
            goto L_0x01b6
        L_0x0176:
            r11 = 100
            if (r9 != r11) goto L_0x017d
            r11 = 133(0x85, float:1.86E-43)
            goto L_0x01b6
        L_0x017d:
            r11 = 6
            if (r9 == r11) goto L_0x01b1
            r11 = 1001(0x3e9, float:1.403E-42)
            if (r9 != r11) goto L_0x0185
            goto L_0x01b1
        L_0x0185:
            r11 = 11
            if (r9 != r11) goto L_0x018c
            r11 = 134(0x86, float:1.88E-43)
            goto L_0x01b6
        L_0x018c:
            if (r9 != r14) goto L_0x0191
            r11 = 139(0x8b, float:1.95E-43)
            goto L_0x01b6
        L_0x0191:
            r11 = 31
            if (r9 == r11) goto L_0x01ae
            r11 = 33
            if (r9 == r11) goto L_0x01ae
            r11 = 32
            if (r9 != r11) goto L_0x019e
            goto L_0x01ae
        L_0x019e:
            r11 = 37
            if (r9 != r11) goto L_0x01a5
            r11 = 117(0x75, float:1.64E-43)
            goto L_0x01b6
        L_0x01a5:
            r11 = 39
            if (r9 != r11) goto L_0x01ac
            r11 = 298(0x12a, float:4.18E-43)
            goto L_0x01b6
        L_0x01ac:
            r11 = -1
            goto L_0x01b6
        L_0x01ae:
            r11 = 118(0x76, float:1.65E-43)
            goto L_0x01b6
        L_0x01b1:
            r11 = 152(0x98, float:2.13E-43)
            goto L_0x01b6
        L_0x01b4:
            r11 = 131(0x83, float:1.84E-43)
        L_0x01b6:
            if (r11 != r15) goto L_0x0246
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r14 = "reportIDKeyWalletPay get ID by scene is -1, the scene is "
            r11.append(r14)
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r9)
            if (r3 != r4) goto L_0x01d5
            r9 = 74
            if (r8 != r9) goto L_0x01d5
            r9 = 134(0x86, float:1.88E-43)
            goto L_0x01d6
        L_0x01d5:
            r9 = -1
        L_0x01d6:
            if (r3 != r4) goto L_0x01e0
            r11 = 75
            if (r8 != r11) goto L_0x01e0
            r11 = 139(0x8b, float:1.95E-43)
            goto L_0x0246
        L_0x01e0:
            r11 = 1581(0x62d, float:2.215E-42)
            if (r3 == r11) goto L_0x01eb
            r11 = 1685(0x695, float:2.361E-42)
            if (r3 != r11) goto L_0x01e9
            goto L_0x01eb
        L_0x01e9:
            r11 = 0
            goto L_0x01ec
        L_0x01eb:
            r11 = 1
        L_0x01ec:
            if (r11 == 0) goto L_0x01ef
            goto L_0x023b
        L_0x01ef:
            r11 = 1558(0x616, float:2.183E-42)
            if (r3 != r11) goto L_0x01f9
            if (r8 == 0) goto L_0x01f7
            if (r8 != r12) goto L_0x01f9
        L_0x01f7:
            r11 = 1
            goto L_0x01fa
        L_0x01f9:
            r11 = 0
        L_0x01fa:
            if (r11 == 0) goto L_0x0201
            r9 = 145(0x91, float:2.03E-43)
            r11 = 145(0x91, float:2.03E-43)
            goto L_0x0246
        L_0x0201:
            r11 = 397(0x18d, float:5.56E-43)
            if (r3 != r11) goto L_0x020a
            r9 = 131(0x83, float:1.84E-43)
            r11 = 131(0x83, float:1.84E-43)
            goto L_0x0246
        L_0x020a:
            r11 = 398(0x18e, float:5.58E-43)
            if (r3 != r11) goto L_0x0213
            r9 = 130(0x82, float:1.82E-43)
            r11 = 130(0x82, float:1.82E-43)
            goto L_0x0246
        L_0x0213:
            r11 = 422(0x1a6, float:5.91E-43)
            if (r3 != r11) goto L_0x021c
            r9 = 153(0x99, float:2.14E-43)
            r11 = 153(0x99, float:2.14E-43)
            goto L_0x0246
        L_0x021c:
            r11 = 556(0x22c, float:7.79E-43)
            if (r3 != r11) goto L_0x0225
            r9 = 152(0x98, float:2.13E-43)
            r11 = 152(0x98, float:2.13E-43)
            goto L_0x0246
        L_0x0225:
            r11 = 498(0x1f2, float:6.98E-43)
            if (r3 != r11) goto L_0x022e
            r9 = 133(0x85, float:1.86E-43)
            r11 = 133(0x85, float:1.86E-43)
            goto L_0x0246
        L_0x022e:
            r11 = 1544(0x608, float:2.164E-42)
            if (r3 == r11) goto L_0x0242
            r11 = 1582(0x62e, float:2.217E-42)
            if (r3 != r11) goto L_0x0237
            goto L_0x0242
        L_0x0237:
            r11 = 1575(0x627, float:2.207E-42)
            if (r3 != r11) goto L_0x0240
        L_0x023b:
            r9 = 117(0x75, float:1.64E-43)
            r11 = 117(0x75, float:1.64E-43)
            goto L_0x0246
        L_0x0240:
            r11 = r9
            goto L_0x0246
        L_0x0242:
            r9 = 118(0x76, float:1.65E-43)
            r11 = 118(0x76, float:1.65E-43)
        L_0x0246:
            java.lang.String r9 = " , ID is -1"
            if (r11 != r15) goto L_0x0285
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r5)
            r11.append(r3)
            r11.append(r6)
            r11.append(r8)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r11)
            boolean r11 = android.text.TextUtils.isEmpty(r13)
            if (r11 == 0) goto L_0x026d
            r11 = -1
            goto L_0x0285
        L_0x026d:
            java.lang.String r11 = "BalanceFetchProcess"
            boolean r11 = r13.equals(r11)
            if (r11 == 0) goto L_0x0278
            r18 = 139(0x8b, float:1.95E-43)
            goto L_0x0283
        L_0x0278:
            java.lang.String r11 = "BalanceSaveProcess"
            boolean r11 = r13.equals(r11)
            if (r11 == 0) goto L_0x0281
            goto L_0x0283
        L_0x0281:
            r18 = -1
        L_0x0283:
            r11 = r18
        L_0x0285:
            if (r11 != r15) goto L_0x02a0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "reportIDKeyWalletPay the processName is for idkey report processName:"
            r3.append(r4)
            r3.append(r13)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r3)
            goto L_0x05e7
        L_0x02a0:
            com.tencent.mars.smc.IDKey r13 = new com.tencent.mars.smc.IDKey
            r13.<init>()
            r13.SetID(r11)
            r14 = 1
            r13.SetValue(r14)
            if (r3 != r4) goto L_0x02b5
            r14 = 112(0x70, float:1.57E-43)
            if (r8 != r14) goto L_0x02b5
            r14 = 1
            goto L_0x02b6
        L_0x02b5:
            r14 = 0
        L_0x02b6:
            if (r14 == 0) goto L_0x02be
            r5 = 26
            r13.SetKey(r5)
            goto L_0x030a
        L_0x02be:
            boolean r14 = com.tencent.p014mm.wallet_core.model.C75136r0.m90119a(r3, r8)
            if (r14 == 0) goto L_0x02ca
            r5 = 45
            r13.SetKey(r5)
            goto L_0x030a
        L_0x02ca:
            r14 = 1581(0x62d, float:2.215E-42)
            if (r3 == r14) goto L_0x02d5
            r15 = 1685(0x695, float:2.361E-42)
            if (r3 != r15) goto L_0x02d3
            goto L_0x02d5
        L_0x02d3:
            r15 = 0
            goto L_0x02d6
        L_0x02d5:
            r15 = 1
        L_0x02d6:
            if (r15 == 0) goto L_0x02e6
            if (r3 != r14) goto L_0x02e0
            r5 = 64
            r13.SetKey(r5)
            goto L_0x030a
        L_0x02e0:
            r5 = 83
            r13.SetKey(r5)
            goto L_0x030a
        L_0x02e6:
            r14 = 1558(0x616, float:2.183E-42)
            if (r3 != r14) goto L_0x02f0
            if (r8 == 0) goto L_0x02ee
            if (r8 != r12) goto L_0x02f0
        L_0x02ee:
            r14 = 1
            goto L_0x02f1
        L_0x02f0:
            r14 = 0
        L_0x02f1:
            if (r14 == 0) goto L_0x0300
            if (r8 != 0) goto L_0x02fa
            r14 = 7
            r13.SetKey(r14)
            goto L_0x030a
        L_0x02fa:
            r5 = 26
            r13.SetKey(r5)
            goto L_0x030a
        L_0x0300:
            r14 = 7
            boolean r15 = com.tencent.p014mm.wallet_core.model.C75136r0.m90120b(r3, r8)
            if (r15 == 0) goto L_0x05cc
            r13.SetKey(r14)
        L_0x030a:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            com.tencent.mars.smc.IDKey r6 = new com.tencent.mars.smc.IDKey
            r6.<init>()
            r6.SetID(r11)
            r9 = 1
            r6.SetValue(r9)
            com.tencent.mars.smc.IDKey r14 = new com.tencent.mars.smc.IDKey
            r14.<init>()
            r14.SetID(r11)
            r14.SetValue(r9)
            com.tencent.mars.smc.IDKey r9 = new com.tencent.mars.smc.IDKey
            r9.<init>()
            r9.SetID(r11)
            int r10 = (int) r1
            r17 = r13
            long r12 = (long) r10
            r9.SetValue(r12)
            if (r3 != r4) goto L_0x033e
            r10 = 112(0x70, float:1.57E-43)
            if (r8 != r10) goto L_0x033e
            r10 = 1
            goto L_0x033f
        L_0x033e:
            r10 = 0
        L_0x033f:
            r12 = 23
            r13 = 20
            r18 = 1000(0x3e8, double:4.94E-321)
            r20 = 3000(0xbb8, double:1.482E-320)
            if (r10 == 0) goto L_0x037b
            r10 = 19
            r6.SetKey(r10)
            int r10 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r10 > 0) goto L_0x035b
            r14.SetKey(r13)
            r9.SetKey(r12)
        L_0x0358:
            r12 = 0
            goto L_0x04ca
        L_0x035b:
            if (r10 <= 0) goto L_0x036c
            int r10 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r10 > 0) goto L_0x036c
            r10 = 21
            r14.SetKey(r10)
            r10 = 24
            r9.SetKey(r10)
            goto L_0x0358
        L_0x036c:
            int r10 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r10 <= 0) goto L_0x0358
            r10 = 22
            r14.SetKey(r10)
            r10 = 25
            r9.SetKey(r10)
            goto L_0x0358
        L_0x037b:
            boolean r10 = com.tencent.p014mm.wallet_core.model.C75136r0.m90119a(r3, r8)
            if (r10 == 0) goto L_0x03b5
            r10 = 38
            r6.SetKey(r10)
            int r10 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r10 > 0) goto L_0x0395
            r10 = 39
            r14.SetKey(r10)
            r10 = 42
            r9.SetKey(r10)
            goto L_0x0358
        L_0x0395:
            if (r10 <= 0) goto L_0x03a6
            int r10 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r10 > 0) goto L_0x03a6
            r10 = 40
            r14.SetKey(r10)
            r10 = 43
            r9.SetKey(r10)
            goto L_0x0358
        L_0x03a6:
            int r10 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r10 <= 0) goto L_0x0358
            r10 = 41
            r14.SetKey(r10)
            r10 = 44
            r9.SetKey(r10)
            goto L_0x0358
        L_0x03b5:
            r10 = 1581(0x62d, float:2.215E-42)
            if (r3 != r10) goto L_0x03ef
            r10 = 57
            r6.SetKey(r10)
            int r10 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r10 > 0) goto L_0x03cd
            r10 = 58
            r14.SetKey(r10)
            r10 = 61
            r9.SetKey(r10)
            goto L_0x0358
        L_0x03cd:
            if (r10 <= 0) goto L_0x03df
            int r10 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r10 > 0) goto L_0x03df
            r10 = 59
            r14.SetKey(r10)
            r10 = 62
            r9.SetKey(r10)
            goto L_0x0358
        L_0x03df:
            int r10 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r10 <= 0) goto L_0x0358
            r10 = 60
            r14.SetKey(r10)
            r10 = 63
            r9.SetKey(r10)
            goto L_0x0358
        L_0x03ef:
            r10 = 1685(0x695, float:2.361E-42)
            if (r3 != r10) goto L_0x042a
            r10 = 76
            r6.SetKey(r10)
            int r10 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r10 > 0) goto L_0x0408
            r10 = 77
            r14.SetKey(r10)
            r10 = 80
            r9.SetKey(r10)
            goto L_0x0358
        L_0x0408:
            if (r10 <= 0) goto L_0x041a
            int r10 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r10 > 0) goto L_0x041a
            r10 = 78
            r14.SetKey(r10)
            r10 = 81
            r9.SetKey(r10)
            goto L_0x0358
        L_0x041a:
            int r10 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r10 <= 0) goto L_0x0358
            r10 = 79
            r14.SetKey(r10)
            r10 = 82
            r9.SetKey(r10)
            goto L_0x0358
        L_0x042a:
            r10 = 1558(0x616, float:2.183E-42)
            if (r3 != r10) goto L_0x0460
            if (r8 != 0) goto L_0x0460
            r10 = 0
            r6.SetKey(r10)
            int r10 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r10 > 0) goto L_0x0442
            r12 = 1
            r14.SetKey(r12)
            r10 = 4
            r9.SetKey(r10)
            goto L_0x0358
        L_0x0442:
            if (r10 <= 0) goto L_0x0452
            int r10 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r10 > 0) goto L_0x0452
            r10 = 2
            r14.SetKey(r10)
            r10 = 5
            r9.SetKey(r10)
            goto L_0x0358
        L_0x0452:
            int r10 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r10 <= 0) goto L_0x0358
            r10 = 3
            r14.SetKey(r10)
            r10 = 6
            r9.SetKey(r10)
            goto L_0x0358
        L_0x0460:
            r12 = 1558(0x616, float:2.183E-42)
            if (r3 != r12) goto L_0x049e
            r12 = 1
            if (r8 != r12) goto L_0x049e
            r12 = 19
            r6.SetKey(r12)
            int r10 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r10 > 0) goto L_0x047c
            r10 = 20
            r14.SetKey(r10)
            r10 = 23
            r9.SetKey(r10)
            goto L_0x0358
        L_0x047c:
            if (r10 <= 0) goto L_0x048e
            int r10 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r10 > 0) goto L_0x048e
            r10 = 21
            r14.SetKey(r10)
            r10 = 24
            r9.SetKey(r10)
            goto L_0x0358
        L_0x048e:
            int r10 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r10 <= 0) goto L_0x0358
            r10 = 22
            r14.SetKey(r10)
            r10 = 25
            r9.SetKey(r10)
            goto L_0x0358
        L_0x049e:
            r12 = 0
            r6.SetKey(r12)
            int r13 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r13 > 0) goto L_0x04af
            r15 = 1
            r14.SetKey(r15)
            r10 = 4
            r9.SetKey(r10)
            goto L_0x04ca
        L_0x04af:
            if (r13 <= 0) goto L_0x04be
            int r13 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r13 > 0) goto L_0x04be
            r10 = 2
            r14.SetKey(r10)
            r10 = 5
            r9.SetKey(r10)
            goto L_0x04ca
        L_0x04be:
            int r10 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r10 <= 0) goto L_0x04ca
            r10 = 3
            r14.SetKey(r10)
            r10 = 6
            r9.SetKey(r10)
        L_0x04ca:
            r5.add(r6)
            r5.add(r14)
            r5.add(r9)
            r6 = 1
            r7.mo160124a(r5, r6)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            if (r23 != 0) goto L_0x04e5
            if (r24 == 0) goto L_0x04e1
            goto L_0x04e5
        L_0x04e1:
            r3 = r17
            goto L_0x05c4
        L_0x04e5:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            com.tencent.mars.smc.IDKey r9 = new com.tencent.mars.smc.IDKey
            r9.<init>()
            r9.SetID(r11)
            r13 = 1
            r9.SetValue(r13)
            com.tencent.mars.smc.IDKey r10 = new com.tencent.mars.smc.IDKey
            r10.<init>()
            r10.SetID(r11)
            r10.SetValue(r13)
            if (r3 != r4) goto L_0x050a
            r4 = 112(0x70, float:1.57E-43)
            if (r8 != r4) goto L_0x050a
            r11 = 1
            goto L_0x050b
        L_0x050a:
            r11 = 0
        L_0x050b:
            r4 = 29
            r12 = 28
            r13 = 27
            if (r11 == 0) goto L_0x0524
            r9.SetKey(r13)
            if (r24 >= 0) goto L_0x051d
            r10.SetKey(r12)
            goto L_0x05b9
        L_0x051d:
            if (r24 <= 0) goto L_0x05b9
            r10.SetKey(r4)
            goto L_0x05b9
        L_0x0524:
            boolean r11 = com.tencent.p014mm.wallet_core.model.C75136r0.m90119a(r3, r8)
            if (r11 == 0) goto L_0x0541
            r3 = 46
            r9.SetKey(r3)
            if (r24 >= 0) goto L_0x0538
            r3 = 47
            r10.SetKey(r3)
            goto L_0x05b9
        L_0x0538:
            if (r24 <= 0) goto L_0x05b9
            r3 = 48
            r10.SetKey(r3)
            goto L_0x05b9
        L_0x0541:
            r11 = 1581(0x62d, float:2.215E-42)
            if (r3 != r11) goto L_0x055b
            r3 = 65
            r9.SetKey(r3)
            if (r24 >= 0) goto L_0x0553
            r3 = 66
            r10.SetKey(r3)
            goto L_0x05b9
        L_0x0553:
            if (r24 <= 0) goto L_0x05b9
            r3 = 67
            r10.SetKey(r3)
            goto L_0x05b9
        L_0x055b:
            r11 = 1685(0x695, float:2.361E-42)
            if (r3 != r11) goto L_0x0574
            r3 = 84
            r9.SetKey(r3)
            if (r24 >= 0) goto L_0x056c
            r3 = 85
            r10.SetKey(r3)
            goto L_0x05b9
        L_0x056c:
            if (r24 <= 0) goto L_0x05b9
            r3 = 86
            r10.SetKey(r3)
            goto L_0x05b9
        L_0x0574:
            r11 = 1558(0x616, float:2.183E-42)
            if (r3 != r11) goto L_0x0591
            if (r8 != 0) goto L_0x058f
            r11 = 8
            r9.SetKey(r11)
            if (r24 >= 0) goto L_0x0587
            r3 = 9
            r10.SetKey(r3)
            goto L_0x05b9
        L_0x0587:
            if (r24 <= 0) goto L_0x05b9
            r3 = 10
            r10.SetKey(r3)
            goto L_0x05b9
        L_0x058f:
            r11 = 1558(0x616, float:2.183E-42)
        L_0x0591:
            if (r3 != r11) goto L_0x05a5
            r3 = 1
            if (r8 != r3) goto L_0x05a5
            r9.SetKey(r13)
            if (r24 >= 0) goto L_0x059f
            r10.SetKey(r12)
            goto L_0x05b9
        L_0x059f:
            if (r24 <= 0) goto L_0x05b9
            r10.SetKey(r4)
            goto L_0x05b9
        L_0x05a5:
            r3 = 8
            r9.SetKey(r3)
            if (r24 >= 0) goto L_0x05b2
            r3 = 9
            r10.SetKey(r3)
            goto L_0x05b9
        L_0x05b2:
            if (r24 <= 0) goto L_0x05b9
            r3 = 10
            r10.SetKey(r3)
        L_0x05b9:
            r6.add(r9)
            r6.add(r10)
            r5.addAll(r6)
            goto L_0x04e1
        L_0x05c4:
            r5.add(r3)
            r3 = 1
            r7.mo160124a(r5, r3)
            goto L_0x05e7
        L_0x05cc:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r5)
            r4.append(r3)
            r4.append(r6)
            r4.append(r8)
            r4.append(r9)
            java.lang.String r3 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r3)
        L_0x05e7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.wallet_core.model.C75123k0.reportCostTime(int, int):long");
    }

    public int dispatch(C114770g gVar, C114799u uVar, C1311n nVar) {
        this.mRequestTime = System.currentTimeMillis();
        C39550b.m42181a().mo62165pk(uVar, false);
        C75226r.m90205e(uVar.getType());
        return super.dispatch(gVar, uVar, nVar);
    }

    public int getCgicmdForKV() {
        return -1;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        onGYNetEnd(i, i2, i3, str, uVar, bArr, reportCostTime(i2, i3));
        uVar.getType();
    }

    public abstract void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j);

    public void setCmdId(int i) {
        this.mCmdId = i;
    }

    public void setProcessBundle(Bundle bundle) {
        this.mBundle = bundle;
    }

    public void setProcessName(String str) {
        this.mProcessName = str;
    }

    public void setProcessSessionId(long j) {
        this.sessionId = j;
    }

    public void setScene(int i) {
        this.mScene = i;
    }
}
