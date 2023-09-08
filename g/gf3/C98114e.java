package gf3;

/* renamed from: gf3.e */
public final class C98114e extends C98108b {
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x000c A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo126328c(b62.C92178b r17, b62.C92179c r18, wx3.C15601d<? super com.tencent.p014mm.plugin.mediabasic.data.MediaErrorInfo> r19) {
        /*
            r16 = this;
            r0 = r17
            b62.d r1 = b62.C92180d.MediaRemuxIgnore
            java.util.ArrayList<com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo> r2 = r0.f263829a
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
            r4 = 0
        L_0x000c:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x00b8
            java.lang.Object r5 = r2.next()
            com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo r5 = (com.tencent.p014mm.plugin.mediabasic.data.MediaSingleInfo) r5
            b62.a r6 = r5.f272123d
            b62.a r7 = b62.C92177a.VIDEO
            java.lang.String r8 = "MicroMsg.VideoJumpRemuxChain"
            if (r6 == r7) goto L_0x0033
            java.lang.String r0 = "refuse by audio or image"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo r7 = new com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 12
            r6 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
        L_0x0033:
            if (r6 != r7) goto L_0x00b4
            int r4 = r4 + 1
            r6 = 1
            if (r4 <= r6) goto L_0x004d
            java.lang.String r0 = "refuse by multi video"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo r7 = new com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 12
            r6 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
        L_0x004d:
            r7 = r18
            com.tencent.mm.modelcontrol.VideoTransPara r9 = r7.f263831a
            com.tencent.mm.plugin.mediabasic.data.MediaDurationInfo r10 = r5.f272125f
            long r10 = r10.f272114d
            r12 = 0
            java.lang.String r14 = "refuse by video crop"
            int r15 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r15 <= 0) goto L_0x0063
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r14)
        L_0x0061:
            r6 = 0
            goto L_0x00a5
        L_0x0063:
            java.lang.String r5 = r5.f272124e
            com.tencent.mm.plugin.sight.base.a r5 = com.tencent.p014mm.plugin.sight.base.C94555d.m119567c(r5, r6)
            int r10 = r5.f273443a
            int r11 = r9.f267170h
            int r11 = r11 * 1000
            if (r10 <= r11) goto L_0x0075
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r14)
            goto L_0x0061
        L_0x0075:
            int r10 = r5.f273445c
            int r11 = r9.f267166d
            int r11 = r11 + 50
            if (r10 > r11) goto L_0x009e
            int r10 = r5.f273446d
            int r11 = r9.f267167e
            int r11 = r11 + 50
            if (r10 <= r11) goto L_0x0086
            goto L_0x009e
        L_0x0086:
            int r5 = r5.f273444b
            double r10 = (double) r5
            int r5 = r9.f267169g
            double r12 = (double) r5
            r14 = 4608083138725491507(0x3ff3333333333333, double:1.2)
            double r12 = r12 * r14
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r5 <= 0) goto L_0x00a5
            java.lang.String r5 = "refuse by video bitrate limit"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r5)
            goto L_0x0061
        L_0x009e:
            java.lang.String r5 = "refuse by video size limit"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r5)
            goto L_0x0061
        L_0x00a5:
            if (r6 != 0) goto L_0x000c
            com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo r7 = new com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 12
            r6 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
        L_0x00b4:
            r7 = r18
            goto L_0x000c
        L_0x00b8:
            r7 = r18
            java.util.ArrayList<com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo> r0 = r0.f263829a
            java.lang.Object r0 = sx3.C110818d0.m150914L(r0)
            com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo r0 = (com.tencent.p014mm.plugin.mediabasic.data.MediaSingleInfo) r0
            java.lang.String r0 = r0.f272124e
            java.lang.String r1 = r18.mo126140b()
            com.tencent.p014mm.vfs.C86013q1.m106442c(r0, r1)
            r4 = 0
            com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo r0 = new com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo
            b62.d r3 = b62.C92180d.MediaRemuxSuccess
            r6 = 0
            r7 = 8
            r8 = 0
            java.lang.String r5 = "jump remux"
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gf3.C98114e.mo126328c(b62.b, b62.c, wx3.d):java.lang.Object");
    }
}
