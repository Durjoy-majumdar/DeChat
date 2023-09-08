package com.tencent.p014mm.plugin.luckymoney.p073ui;

import com.tencent.p014mm.modelcdntran.C55384i;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2$$a */
public final /* synthetic */ class LuckyMoneyNewYearSendUIV2$$a implements C55384i {

    /* renamed from: a */
    public final /* synthetic */ LuckyMoneyNewYearSendUIV2 f200369a;

    public /* synthetic */ LuckyMoneyNewYearSendUIV2$$a(LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2) {
        this.f200369a = luckyMoneyNewYearSendUIV2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0051, code lost:
        if (r2 != 17) goto L_0x00fd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11363a(com.tencent.p014mm.modelcdntran.C92798v r11) {
        /*
            r10 = this;
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 r0 = r10.f200369a
            int r1 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyNewYearSendUIV2.f200265V1
            r0.getClass()
            r1 = 3
            java.lang.Object[] r2 = new java.lang.Object[r1]
            gi.g r3 = r11.f267133d
            java.lang.String r3 = r3.field_fullpath
            r4 = 0
            r2[r4] = r3
            com.tencent.mm.modelcdntran.v$a r3 = r11.f267130a
            r5 = 1
            r2[r5] = r3
            int r3 = r11.f267132c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6 = 2
            r2[r6] = r3
            java.lang.String r3 = "MicroMsg.LuckyMoneyNewYearSendUIV2"
            java.lang.String r7 = "CdnPLCJavaHelperListener:%s %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r7, r2)
            java.lang.String r2 = r0.f200362x1
            gi.g r7 = r11.f267133d
            java.lang.String r7 = r7.field_fullpath
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L_0x010a
            int r2 = r0.f200273D1
            if (r2 != r5) goto L_0x0038
            goto L_0x010a
        L_0x0038:
            com.tencent.mm.modelcdntran.v$a r2 = r11.f267130a
            int r2 = r2.ordinal()
            r7 = 4
            if (r2 == r7) goto L_0x00ec
            r8 = 5
            if (r2 == r8) goto L_0x0074
            r1 = 6
            if (r2 == r1) goto L_0x0055
            r1 = 13
            if (r2 == r1) goto L_0x00ec
            r1 = 15
            if (r2 == r1) goto L_0x00ec
            r1 = 17
            if (r2 == r1) goto L_0x00ec
            goto L_0x00fd
        L_0x0055:
            gi.c r1 = r11.f267134e
            if (r1 == 0) goto L_0x00fd
            java.lang.Object[] r2 = new java.lang.Object[r6]
            long r6 = r1.field_finishedLength
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            r2[r4] = r1
            gi.c r11 = r11.f267134e
            long r6 = r11.field_toltalLength
            java.lang.Long r11 = java.lang.Long.valueOf(r6)
            r2[r5] = r11
            java.lang.String r11 = "onUploadVoiceProgress %s/%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r11, r2)
            goto L_0x00fd
        L_0x0074:
            gi.d r11 = r11.f267135f
            if (r11 == 0) goto L_0x00e4
            r0.f200273D1 = r1
            java.lang.String r2 = r11.field_aesKey
            r0.f200275E1 = r2
            java.lang.String r7 = r11.field_fileId
            r0.f200277F1 = r7
            long r8 = r11.field_fileLength
            r0.f200279G1 = r8
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r11[r4] = r2
            r11[r5] = r7
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r11[r6] = r1
            java.lang.String r1 = "onUploadVoiceSuccess cdnAesKey:%s cdnVoiceUrl:%s cdnFileLength:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r1, r11)
            java.lang.String r11 = r0.f200362x1
            java.lang.String r1 = r0.f200275E1
            java.lang.String r2 = com.tencent.p014mm.plugin.luckymoney.model.C69218g1.f199176a
            com.tencent.mm.vfs.m1 r2 = new com.tencent.mm.vfs.m1
            r2.<init>((java.lang.String) r11)
            com.tencent.mm.vfs.m1 r11 = r2.mo119969h()
            java.lang.String r11 = r11.mo119973k()
            java.lang.String r3 = "/"
            boolean r4 = r11.endsWith(r3)
            if (r4 != 0) goto L_0x00c1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r11)
            r4.append(r3)
            java.lang.String r11 = r4.toString()
        L_0x00c1:
            com.tencent.mm.vfs.m1 r2 = r2.mo119969h()
            java.lang.String r2 = r2.getName()
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106435Q(r11, r2, r1)
            if (r2 == 0) goto L_0x00df
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            r2.append(r1)
            java.lang.String r11 = r2.toString()
            goto L_0x00e1
        L_0x00df:
            java.lang.String r11 = ""
        L_0x00e1:
            r0.f200362x1 = r11
            goto L_0x00fd
        L_0x00e4:
            r0.f200273D1 = r7
            java.lang.String r11 = "error:onUploadVoiceSuccess, but getSceneResult is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r11)
            goto L_0x00fd
        L_0x00ec:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            com.tencent.mm.modelcdntran.v$a r11 = r11.f267130a
            java.lang.String r11 = r11.name()
            r1[r4] = r11
            java.lang.String r11 = "cdn upload failed, fallback to cgi %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r11, r1)
            r0.f200273D1 = r7
        L_0x00fd:
            android.view.View r11 = r0.f200330h
            if (r11 == 0) goto L_0x010f
            com.tencent.mm.plugin.luckymoney.ui.s2 r1 = new com.tencent.mm.plugin.luckymoney.ui.s2
            r1.<init>(r0)
            r11.post(r1)
            goto L_0x010f
        L_0x010a:
            java.lang.String r11 = "no need this upload result"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r11)
        L_0x010f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyNewYearSendUIV2$$a.mo11363a(com.tencent.mm.modelcdntran.v):void");
    }
}
