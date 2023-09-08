package com.tencent.p014mm.plugin.scanner.model;

import android.os.Bundle;
import com.tencent.p014mm.protocal.protobuf.GoodsObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import gy3.C87412m;
import ob0.C117747y;
import ob0.C89137b0;
import pe3.C47465a;
import te3.C51957xd;
import te3.C64230ae;
import te3.C64799wd;
import te3.C64852yd;

/* renamed from: com.tencent.mm.plugin.scanner.model.b */
public final class C19003b {

    /* renamed from: a */
    public int f53387a;

    /* renamed from: b */
    public long f53388b;

    /* renamed from: c */
    public boolean f53389c;

    /* renamed from: d */
    public boolean f53390d;

    /* renamed from: e */
    public C19004a f53391e;

    /* renamed from: f */
    public C64852yd f53392f;

    /* renamed from: g */
    public boolean f53393g;

    /* renamed from: h */
    public boolean f53394h;

    /* renamed from: i */
    public C19005b f53395i;

    /* renamed from: j */
    public C19005b f53396j;

    /* renamed from: com.tencent.mm.plugin.scanner.model.b$a */
    public interface C19004a {
        /* renamed from: a */
        void mo24249a(int i, long j, int i2, String str);

        /* renamed from: b */
        void mo24250b(int i, long j, int i2);

        /* renamed from: c */
        void mo24251c(C19030n0 n0Var);

        /* renamed from: d */
        void mo24252d(int i);
    }

    /* renamed from: com.tencent.mm.plugin.scanner.model.b$b */
    public final class C19005b {

        /* renamed from: a */
        public long f53397a;

        /* renamed from: b */
        public boolean f53398b;

        /* renamed from: c */
        public Bundle f53399c;

        /* renamed from: d */
        public C117747y f53400d;

        /* renamed from: e */
        public C64852yd f53401e;

        public C19005b(C19003b bVar) {
        }
    }

    public C19003b(int i, C19004a aVar) {
        C87412m.m108594g(aVar, "callback");
        this.f53387a = i;
        this.f53391e = aVar;
    }

    /* renamed from: a */
    public final void mo24243a(long j) {
        Log.m105925i("MicroMsg.AiScanImageUploader", "alvinluo cancelResult session: %d", Long.valueOf(j));
        if (this.f53388b == j) {
            this.f53390d = true;
            this.f53393g = false;
            C89137b0 d = C86709a0.m107524d();
            C19005b bVar = this.f53396j;
            d.mo123458d(bVar != null ? bVar.f53400d : null);
            this.f53395i = null;
            this.f53396j = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0139  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24244b(long r22, android.os.Bundle r24) {
        /*
            r21 = this;
            r15 = r21
            r2 = r22
            r1 = r24
            java.lang.String r4 = "MicroMsg.AiScanImageUploader"
            if (r1 != 0) goto L_0x000b
            return
        L_0x000b:
            long r5 = r15.f53388b
            r7 = 0
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0016
            r15.f53389c = r7
            r15.f53388b = r2
        L_0x0016:
            java.lang.String r0 = "scan_source"
            int r8 = r1.getInt(r0, r7)
            java.lang.String r0 = "result_best_img"
            byte[] r5 = r1.getByteArray(r0)
            java.lang.String r0 = "key_scan_goods_mode"
            int r6 = r1.getInt(r0, r7)
            java.lang.String r0 = "key_scan_request"
            android.os.Parcelable r0 = r1.getParcelable(r0)     // Catch:{ Exception -> 0x0034 }
            com.tencent.mm.plugin.scanner.api.ScanGoodsRequest r0 = (com.tencent.p014mm.plugin.scanner.api.ScanGoodsRequest) r0     // Catch:{ Exception -> 0x0034 }
            r10 = r0
            goto L_0x003d
        L_0x0034:
            r0 = move-exception
            java.lang.Object[] r10 = new java.lang.Object[r7]
            java.lang.String r11 = "getScanGoodsRequest exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r11, r10)
            r10 = 0
        L_0x003d:
            r11 = 1
            if (r10 != 0) goto L_0x0041
            goto L_0x005e
        L_0x0041:
            te3.xd r0 = new te3.xd     // Catch:{ Exception -> 0x0056 }
            r0.<init>()     // Catch:{ Exception -> 0x0056 }
            java.lang.String r12 = r10.f248912w     // Catch:{ Exception -> 0x0056 }
            r0.f144598f = r12     // Catch:{ Exception -> 0x0056 }
            java.lang.String r13 = "getJsApiInfo %s"
            java.lang.Object[] r14 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x0056 }
            r14[r7] = r12     // Catch:{ Exception -> 0x0056 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r13, r14)     // Catch:{ Exception -> 0x0056 }
            r16 = r0
            goto L_0x0060
        L_0x0056:
            r0 = move-exception
            java.lang.Object[] r12 = new java.lang.Object[r7]
            java.lang.String r13 = "getJsApiInfo exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r13, r12)
        L_0x005e:
            r16 = 0
        L_0x0060:
            if (r10 == 0) goto L_0x0066
            int r0 = r10.f248903n
            r12 = r0
            goto L_0x0067
        L_0x0066:
            r12 = 0
        L_0x0067:
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Long r13 = java.lang.Long.valueOf(r22)
            r0[r7] = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            r0[r11] = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r6)
            r14 = 2
            r0[r14] = r13
            java.lang.String r13 = "alvinluo AiScanImage doHandleResult session: %d, source: %d, mode: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r13, r0)
            if (r8 == r11) goto L_0x00b6
            if (r8 == r14) goto L_0x0090
            com.tencent.mm.plugin.scanner.model.b$a r0 = r15.f53391e
            if (r0 == 0) goto L_0x008d
            r0.mo24252d(r14)
        L_0x008d:
            r1 = r15
            goto L_0x0159
        L_0x0090:
            if (r5 == 0) goto L_0x00ac
            r14 = 0
            r0 = 0
            r4 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r17 = 0
            r1 = r21
            r2 = r22
            r7 = r12
            r12 = r13
            r13 = r17
            r15 = r16
            r16 = r0
            r1.mo24248f(r2, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0159
        L_0x00ac:
            r15 = r21
            com.tencent.mm.plugin.scanner.model.b$a r0 = r15.f53391e
            if (r0 == 0) goto L_0x008d
            r0.mo24252d(r14)
            goto L_0x008d
        L_0x00b6:
            java.lang.String r0 = "result_best_img_id"
            int r13 = r1.getInt(r0, r7)
            java.lang.String r0 = "result_img_origin_width"
            int r17 = r1.getInt(r0, r7)
            java.lang.String r0 = "result_img_origin_height"
            int r18 = r1.getInt(r0, r7)
            com.tencent.mm.protocal.protobuf.GoodsObject r11 = new com.tencent.mm.protocal.protobuf.GoodsObject
            r11.<init>()
            java.lang.String r0 = "result_crop_object"
            byte[] r0 = r1.getByteArray(r0)     // Catch:{ Exception -> 0x00db }
            r11.parseFrom(r0)     // Catch:{ Exception -> 0x00db }
            goto L_0x00e3
        L_0x00db:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r9 = "alvinluo handleResult cropObject parseFrom exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r9, r1)
        L_0x00e3:
            if (r5 == 0) goto L_0x0150
            java.lang.String r0 = ""
            if (r10 != 0) goto L_0x00ea
            goto L_0x012b
        L_0x00ea:
            te3.wd r1 = new te3.wd     // Catch:{ Exception -> 0x0122 }
            r1.<init>()     // Catch:{ Exception -> 0x0122 }
            java.lang.String r9 = "key_sns_ad_ux_info"
            android.os.Bundle r7 = r10.f248901i     // Catch:{ Exception -> 0x0122 }
            if (r7 == 0) goto L_0x00fa
            java.lang.String r7 = r7.getString(r9, r0)     // Catch:{ Exception -> 0x0122 }
            goto L_0x00fb
        L_0x00fa:
            r7 = r0
        L_0x00fb:
            r1.f186079d = r7     // Catch:{ Exception -> 0x0122 }
            java.lang.String r7 = "key_gesture_id"
            android.os.Bundle r9 = r10.f248901i     // Catch:{ Exception -> 0x0122 }
            if (r9 == 0) goto L_0x0107
            java.lang.String r0 = r9.getString(r7, r0)     // Catch:{ Exception -> 0x0122 }
        L_0x0107:
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)     // Catch:{ Exception -> 0x0122 }
            r1.f186080e = r0     // Catch:{ Exception -> 0x0122 }
            java.lang.String r7 = "getAdInfo uxInfo: %s, gestureId: %s"
            java.lang.Object[] r9 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x0122 }
            java.lang.String r10 = r1.f186079d     // Catch:{ Exception -> 0x0122 }
            r14 = 0
            r9[r14] = r10     // Catch:{ Exception -> 0x0122 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0122 }
            r10 = 1
            r9[r10] = r0     // Catch:{ Exception -> 0x0122 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r7, r9)     // Catch:{ Exception -> 0x0122 }
            r14 = r1
            goto L_0x012c
        L_0x0122:
            r0 = move-exception
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r7 = "getAdInfo exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r7, r1)
        L_0x012b:
            r14 = 0
        L_0x012c:
            boolean r0 = com.tencent.p014mm.plugin.scanner.model.C19021i0.f53464j
            boolean r19 = com.tencent.p014mm.plugin.scanner.model.C19021i0.f53465k
            com.tencent.mm.plugin.scanner.model.b$b r1 = r15.f53396j
            if (r1 == 0) goto L_0x0139
            te3.yd r1 = r1.f53401e
            r20 = r1
            goto L_0x013b
        L_0x0139:
            r20 = 0
        L_0x013b:
            r1 = r21
            r2 = r22
            r4 = r13
            r7 = r12
            r9 = r17
            r10 = r18
            r12 = r0
            r13 = r19
            r15 = r16
            r16 = r20
            r1.mo24248f(r2, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0159
        L_0x0150:
            r1 = r21
            com.tencent.mm.plugin.scanner.model.b$a r0 = r1.f53391e
            if (r0 == 0) goto L_0x0159
            r0.mo24252d(r14)
        L_0x0159:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.scanner.model.C19003b.mo24244b(long, android.os.Bundle):void");
    }

    /* renamed from: c */
    public final void mo24245c(long j, boolean z) {
        Log.m105925i("MicroMsg.AiScanImageUploader", "alvinluo finishResult current: %d, session: %d, success: %b", Long.valueOf(this.f53388b), Long.valueOf(j), Boolean.valueOf(z));
        if (this.f53388b == j) {
            this.f53393g = false;
            this.f53389c = true;
            C89137b0 d = C86709a0.m107524d();
            C19005b bVar = this.f53396j;
            d.mo123458d(bVar != null ? bVar.f53400d : null);
            this.f53395i = null;
            this.f53396j = null;
        }
    }

    /* renamed from: d */
    public final void mo24246d(long j, Bundle bundle) {
        if (bundle != null) {
            bundle.getInt("scan_source", 0);
            C19005b bVar = this.f53396j;
            if (bVar != null) {
                boolean z = true;
                if (bVar == null || !bVar.f53398b) {
                    z = false;
                }
                if (!z) {
                    Log.m105924i("MicroMsg.AiScanImageUploader", "alvinluo handleResult replace waiting request");
                    if (this.f53395i == null) {
                        this.f53395i = new C19005b(this);
                    }
                    C19005b bVar2 = this.f53395i;
                    if (bVar2 != null) {
                        bVar2.f53397a = j;
                        bVar2.f53398b = false;
                        bVar2.f53399c = bundle;
                        return;
                    }
                    return;
                }
            }
            C19005b bVar3 = new C19005b(this);
            bVar3.f53397a = j;
            bVar3.f53398b = false;
            bVar3.f53399c = bundle;
            bVar3.f53401e = this.f53392f;
            this.f53396j = bVar3;
            mo24244b(j, bundle);
        }
    }

    /* renamed from: e */
    public final void mo24247e(int i, int i2, String str, C117747y yVar) {
        boolean z;
        C19005b bVar;
        int i3 = i2;
        C117747y yVar2 = yVar;
        if (yVar2 != null && yVar.getType() == 2580) {
            if (i == 0 && i3 == 0) {
                C87412m.m108592e(yVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.scanner.model.NetSceneAiScanImage");
                C57317j jVar = (C57317j) yVar2;
                C47465a aVar = jVar.f164191e.f127056b.f127083a;
                C64230ae aeVar = aVar != null ? (C64230ae) aVar : null;
                if ((aeVar != null && aeVar.f182078r) && aeVar.f182078r != this.f53393g) {
                    this.f53393g = true;
                    int i4 = this.f53387a;
                    long j = aeVar.f182074n;
                    if (this.f53389c || this.f53390d) {
                        Log.m105928w("MicroMsg.AiScanImageUploader", "alvinluo notifyEvent isFinished and ignore");
                    } else {
                        Log.m105919d("MicroMsg.AiScanImageUploader", "alvinluo AiScanImage notifyEvent source: %d, session: %d, event: %d", Integer.valueOf(i4), Long.valueOf(j), 1);
                        C19004a aVar2 = this.f53391e;
                        if (aVar2 != null) {
                            aVar2.mo24250b(i4, j, 1);
                        }
                    }
                }
                if (aeVar != null && aeVar.f182074n == jVar.f164193g) {
                    Log.m105919d("MicroMsg.AiScanImageUploader", "alvinluo AiScanImage onSceneEnd sessionId: %s, scanId: %s, needLocation: %s", Long.valueOf(aeVar.f182074n), Integer.valueOf(aeVar.f182075o), Boolean.valueOf(this.f53393g));
                    int i5 = this.f53387a;
                    Log.m105925i("MicroMsg.AiScanImageUploader", "alvinluo onScanSuccess source: %d, isFinished: %b, isCancelled: %b", Integer.valueOf(i5), Boolean.valueOf(this.f53389c), Boolean.valueOf(this.f53390d));
                    if (this.f53389c || this.f53390d) {
                        Log.m105928w("MicroMsg.AiScanImageUploader", "alvinluo onScanSuccess isFinished and ignore");
                    } else {
                        C19005b bVar2 = this.f53396j;
                        if (bVar2 != null) {
                            if (!(bVar2.f53398b)) {
                                if (i5 != 1 || this.f53394h || bVar2.f53401e != null || !aeVar.f182078r) {
                                    C19021i0.m20105l(new C19009c(aeVar, i5, this));
                                } else {
                                    Log.m105928w("MicroMsg.AiScanImageUploader", "alvinluo onScanSuccess need_poi and ignore current success result");
                                    this.f53394h = true;
                                }
                            }
                        }
                        Object[] objArr = new Object[2];
                        objArr[0] = Boolean.valueOf(bVar2 == null);
                        C19005b bVar3 = this.f53396j;
                        objArr[1] = bVar3 != null ? Boolean.valueOf(bVar3.f53398b) : null;
                        Log.m105929w("MicroMsg.AiScanImageUploader", "alvinluo onScanSuccess runningRequest invalid and ignore isNull: %b, isFinished: %s", objArr);
                    }
                } else {
                    Log.m105928w("MicroMsg.AiScanImageUploader", "alvinluo AiScanImage onSceneEnd success sessionId not the same");
                }
                z = true;
            } else {
                z = i3 != 1003;
                if (!this.f53390d && !this.f53389c) {
                    int i6 = this.f53387a;
                    C87412m.m108592e(yVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.scanner.model.NetSceneAiScanImage");
                    long j2 = ((C57317j) yVar2).f164193g;
                    Log.m105921e("MicroMsg.AiScanImageUploader", "alvinluo onScanFailed source: %d, errCode: %d, errMsg: %s", Integer.valueOf(i6), Integer.valueOf(i2), str);
                    if (i6 == 1 && C19021i0.f53462h != 0) {
                        C19021i0.m20105l(new C19025k0(0));
                    }
                    C19004a aVar3 = this.f53391e;
                    if (aVar3 != null) {
                        aVar3.mo24249a(i6, j2, i2, str);
                    }
                }
            }
            this.f53396j = null;
            if (z) {
                Log.m105919d("MicroMsg.AiScanImageUploader", "alvinluo uploadNext: %b, isCancelled: %b", Boolean.valueOf(this.f53389c), Boolean.valueOf(this.f53390d));
                C19005b bVar4 = this.f53396j;
                if (bVar4 != null) {
                    bVar4.f53398b = true;
                }
                this.f53396j = null;
                if (!this.f53389c && !this.f53390d && (bVar = this.f53395i) != null && !bVar.f53398b) {
                    C19005b bVar5 = this.f53395i;
                    this.f53396j = bVar5;
                    if (bVar5 != null) {
                        bVar5.f53401e = this.f53392f;
                    }
                    C87412m.m108591d(bVar5);
                    long j3 = bVar5.f53397a;
                    C19005b bVar6 = this.f53395i;
                    C87412m.m108591d(bVar6);
                    Bundle bundle = bVar6.f53399c;
                    this.f53395i = null;
                    mo24244b(j3, bundle);
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo24248f(long j, int i, byte[] bArr, int i2, int i3, int i4, int i5, int i6, GoodsObject goodsObject, boolean z, boolean z2, C64799wd wdVar, C51957xd xdVar, C64852yd ydVar) {
        byte[] bArr2 = bArr;
        Log.m105925i("MicroMsg.AiScanImageUploader", "alvinluo uploadImage imageData: %d, mode: %d", Integer.valueOf(bArr2.length), Integer.valueOf(i2));
        C57317j jVar = new C57317j(bArr2, i4, i2, i3, j, i, z, z2, i5, i6, goodsObject, wdVar, xdVar, ydVar);
        C19005b bVar = this.f53396j;
        if (bVar != null) {
            bVar.f53400d = jVar;
        }
        C86709a0.m107524d().mo123460f(jVar);
    }
}
