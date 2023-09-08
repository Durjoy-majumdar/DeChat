package com.tencent.p014mm.plugin.scanner.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;

/* renamed from: com.tencent.mm.plugin.scanner.model.k */
public final class C57319k extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f164195d;

    /* renamed from: e */
    public final C47350c f164196e;

    /* renamed from: f */
    public long f164197f;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0065, code lost:
        r15 = r9.pHash;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C57319k(byte[] r17, long r18, int r20, int r21, int r22, te3.C64421he r23, te3.C64852yd r24, com.tencent.p014mm.plugin.scanner.api.ScanImagePHashInfo r25, hl2.C8596a.C8598b r26, hl2.C8596a.C8597a r27, java.util.ArrayList<te3.C101856vd> r28) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r28
            r16.<init>()
            r0.f164197f = r2
            ob0.c$b r12 = new ob0.c$b
            r12.<init>()
            te3.fe r13 = new te3.fe
            r13.<init>()
            r12.f127066a = r13
            te3.ge r13 = new te3.ge
            r13.<init>()
            r12.f127067b = r13
            java.lang.String r13 = "/cgi-bin/mmbiz-bin/usrmsg/aiscan_image_scene"
            r12.f127068c = r13
            r13 = 1100(0x44c, float:1.541E-42)
            r12.f127069d = r13
            r13 = 0
            r12.f127070e = r13
            r12.f127071f = r13
            ob0.c r12 = r12.mo72403a()
            r0.f164196e = r12
            ob0.c$c r12 = r12.f127055a
            pe3.a r12 = r12.f127080a
            java.lang.String r14 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BizAiScanImageSceneRequest"
            gy3.C87412m.m108592e(r12, r14)
            te3.fe r12 = (te3.C64363fe) r12
            r12.f183112e = r4
            r12.f183113f = r5
            r12.f183116i = r6
            if (r1 == 0) goto L_0x005b
            pe3.b r14 = pe3.C89349b.m111674a(r17)
            r12.f183111d = r14
        L_0x005b:
            r12.f183114g = r2
            r12.f183117j = r7
            r12.f183118n = r8
            java.lang.String r14 = ""
            if (r9 == 0) goto L_0x0069
            java.lang.String r15 = r9.pHash
            if (r15 != 0) goto L_0x006a
        L_0x0069:
            r15 = r14
        L_0x006a:
            r12.f183120p = r15
            if (r9 == 0) goto L_0x0074
            java.lang.String r15 = r9.pHashVersion
            if (r15 != 0) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            r14 = r15
        L_0x0074:
            r12.f183121q = r14
            if (r10 == 0) goto L_0x0080
            int r14 = r10.f27691a
            r12.f183125u = r14
            int r10 = r10.f27692b
            r12.f183126v = r10
        L_0x0080:
            if (r11 == 0) goto L_0x0087
            java.util.LinkedList<te3.vd> r10 = r12.f183127w
            r10.addAll(r11)
        L_0x0087:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "alvinluo NetSceneAiScanImageScene imageSize: "
            r10.append(r12)
            r12 = 0
            if (r1 == 0) goto L_0x009a
            int r1 = r1.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x009b
        L_0x009a:
            r1 = r12
        L_0x009b:
            r10.append(r1)
            java.lang.String r1 = ", type: "
            r10.append(r1)
            r10.append(r4)
            java.lang.String r1 = ", mode: "
            r10.append(r1)
            r10.append(r5)
            java.lang.String r1 = ", sessionId: "
            r10.append(r1)
            r10.append(r2)
            java.lang.String r1 = ", seqNum: "
            r10.append(r1)
            r10.append(r6)
            java.lang.String r1 = ", cdnUploadResult: "
            r10.append(r1)
            r1 = r27
            r10.append(r1)
            java.lang.String r1 = ", cdnInfoList: "
            r10.append(r1)
            if (r11 == 0) goto L_0x00d8
            int r1 = r28.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x00d9
        L_0x00d8:
            r1 = r12
        L_0x00d9:
            r10.append(r1)
            java.lang.String r1 = r10.toString()
            java.lang.String r2 = "MicroMsg.NetSceneAiScanImageScene"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            r1 = 6
            java.lang.Object[] r1 = new java.lang.Object[r1]
            if (r7 == 0) goto L_0x00f1
            int r3 = r7.f183478d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x00f2
        L_0x00f1:
            r3 = r12
        L_0x00f2:
            r1[r13] = r3
            r3 = 1
            if (r8 == 0) goto L_0x00fe
            float r4 = r8.f186490d
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            goto L_0x00ff
        L_0x00fe:
            r4 = r12
        L_0x00ff:
            r1[r3] = r4
            r3 = 2
            if (r8 == 0) goto L_0x010b
            float r4 = r8.f186491e
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            goto L_0x010c
        L_0x010b:
            r4 = r12
        L_0x010c:
            r1[r3] = r4
            r3 = 3
            if (r8 == 0) goto L_0x0118
            float r4 = r8.f186492f
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            goto L_0x0119
        L_0x0118:
            r4 = r12
        L_0x0119:
            r1[r3] = r4
            r3 = 4
            if (r9 == 0) goto L_0x0121
            java.lang.String r4 = r9.pHash
            goto L_0x0122
        L_0x0121:
            r4 = r12
        L_0x0122:
            r1[r3] = r4
            r3 = 5
            if (r9 == 0) goto L_0x0129
            java.lang.String r12 = r9.pHashVersion
        L_0x0129:
            r1[r3] = r12
            java.lang.String r3 = "alvinluo NetSceneAiScanImageScene %s, %s, %s, %s, pHash: %s, pHashVersion: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r2, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.scanner.model.C57319k.<init>(byte[], long, int, int, int, te3.he, te3.yd, com.tencent.mm.plugin.scanner.api.ScanImagePHashInfo, hl2.a$b, hl2.a$a, java.util.ArrayList):void");
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C87412m.m108594g(gVar, "dispatcher");
        C87412m.m108594g(nVar, "callback");
        this.f164195d = nVar;
        return dispatch(gVar, this.f164196e, this);
    }

    public int getType() {
        return 1100;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneAiScanImageScene", "alvinluo onGYNetEnd errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C11385n nVar = this.f164195d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
