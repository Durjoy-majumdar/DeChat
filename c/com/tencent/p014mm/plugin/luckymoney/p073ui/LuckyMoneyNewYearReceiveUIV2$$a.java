package com.tencent.p014mm.plugin.luckymoney.p073ui;

import com.tencent.p014mm.modelcdntran.C55384i;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2$$a */
public final /* synthetic */ class LuckyMoneyNewYearReceiveUIV2$$a implements C55384i {

    /* renamed from: a */
    public final /* synthetic */ LuckyMoneyNewYearReceiveUIV2 f200175a;

    public /* synthetic */ LuckyMoneyNewYearReceiveUIV2$$a(LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2) {
        this.f200175a = luckyMoneyNewYearReceiveUIV2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        if (r2 != 8) goto L_0x00b1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11363a(com.tencent.p014mm.modelcdntran.C92798v r13) {
        /*
            r12 = this;
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 r0 = r12.f200175a
            java.lang.String r1 = r0.f200128U0
            gi.g r2 = r13.f267133d
            if (r2 == 0) goto L_0x0012
            java.lang.String r3 = r2.field_fullpath
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0012
            java.lang.String r1 = r2.field_fullpath
        L_0x0012:
            com.tencent.mm.modelcdntran.v$a r2 = r13.f267130a
            com.tencent.mm.modelcdntran.v$a r3 = com.tencent.p014mm.modelcdntran.C92798v.C92799a.OnDownloadCallbackProgress
            r4 = 2
            r5 = 0
            r6 = 4
            r7 = 3
            r8 = 1
            java.lang.String r9 = "MicroMsg.LuckyMoneyNewYearReceiveUIV2"
            if (r2 == r3) goto L_0x0037
            java.lang.Object[] r3 = new java.lang.Object[r6]
            r3[r5] = r1
            java.lang.String r10 = r0.f200128U0
            r3[r8] = r10
            r3[r4] = r2
            int r2 = r13.f267132c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3[r7] = r2
            java.lang.String r2 = "voice download fullPath: %s, fileName:%s %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r2, r3)
        L_0x0037:
            com.tencent.mm.modelcdntran.v$a r2 = r13.f267130a
            int r2 = r2.ordinal()
            if (r2 == 0) goto L_0x00a9
            if (r2 == r8) goto L_0x006d
            if (r2 == r7) goto L_0x004f
            r13 = 11
            if (r2 == r13) goto L_0x00a9
            r13 = 7
            if (r2 == r13) goto L_0x00a9
            r13 = 8
            if (r2 == r13) goto L_0x00a9
            goto L_0x00b1
        L_0x004f:
            gi.c r1 = r13.f267134e
            if (r1 == 0) goto L_0x00b1
            java.lang.Object[] r2 = new java.lang.Object[r4]
            long r3 = r1.field_finishedLength
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2[r5] = r1
            gi.c r13 = r13.f267134e
            long r3 = r13.field_toltalLength
            java.lang.Long r13 = java.lang.Long.valueOf(r3)
            r2[r8] = r13
            java.lang.String r13 = "onDownloadVoiceProgress %s/%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r13, r2)
            goto L_0x00b1
        L_0x006d:
            gi.d r13 = r13.f267135f
            if (r13 == 0) goto L_0x009e
            long r2 = com.tencent.p014mm.vfs.C86013q1.m106451l(r1)
            long r10 = r0.f200134X0
            int r13 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r13 >= 0) goto L_0x0096
            java.lang.Object[] r13 = new java.lang.Object[r4]
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r13[r5] = r2
            long r2 = r0.f200134X0
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r13[r8] = r2
            java.lang.String r2 = "OnDownloadCallbackSuccess, but realLength:%s < voiceFileLength:%s, need to delete"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r2, r13)
            r0.f200142d1 = r6
            com.tencent.p014mm.vfs.C86013q1.m106447h(r1)
            goto L_0x00b1
        L_0x0096:
            java.lang.String r13 = "OnDownloadCallbackSuccess"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r13)
            r0.f200142d1 = r7
            goto L_0x00b1
        L_0x009e:
            java.lang.String r13 = "OnDownloadCallbackSuccess, but getSceneResult is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r13)
            r0.f200142d1 = r6
            r0.mo95626N7(r1)
            goto L_0x00b1
        L_0x00a9:
            java.lang.String r13 = "cdn download error"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r13)
            r0.mo95626N7(r1)
        L_0x00b1:
            android.view.View r13 = r0.f200147h
            com.tencent.mm.plugin.luckymoney.ui.a2 r1 = new com.tencent.mm.plugin.luckymoney.ui.a2
            r1.<init>(r0)
            r13.post(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyNewYearReceiveUIV2$$a.mo11363a(com.tencent.mm.modelcdntran.v):void");
    }
}
