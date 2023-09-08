package w41;

/* renamed from: w41.b */
public class C118747b {
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001d A[SYNTHETIC, Splitter:B:14:0x001d] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0027 A[Catch:{ Exception -> 0x0021 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m167439a(com.tencent.p014mm.vfs.C86009m1 r11) {
        /*
            java.lang.String r0 = "MicroMsg.Channel.ChannelReader"
            r1 = 0
            if (r11 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.String r2 = r11.mo119971i()
            r3 = 0
            r4 = 1
            java.io.RandomAccessFile r5 = com.tencent.p014mm.vfs.C86013q1.m106420B(r2, r3)     // Catch:{ c -> 0x0023, all -> 0x0019 }
            w41.C118743a.m167434b(r5)     // Catch:{ c -> 0x0017, all -> 0x0015 }
            r6 = 1
            goto L_0x0028
        L_0x0015:
            r6 = move-exception
            goto L_0x001b
        L_0x0017:
            goto L_0x0025
        L_0x0019:
            r6 = move-exception
            r5 = r1
        L_0x001b:
            if (r5 == 0) goto L_0x0020
            r5.close()     // Catch:{ Exception -> 0x0021 }
        L_0x0020:
            throw r6     // Catch:{ Exception -> 0x0021 }
        L_0x0021:
            r5 = move-exception
            goto L_0x002c
        L_0x0023:
            r5 = r1
        L_0x0025:
            if (r5 == 0) goto L_0x0039
            r6 = 0
        L_0x0028:
            r5.close()     // Catch:{ Exception -> 0x0021 }
            goto L_0x003a
        L_0x002c:
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.String r5 = r5.getMessage()
            r6[r3] = r5
            java.lang.String r5 = "isV2ChannelApk error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r5, r6)
        L_0x0039:
            r6 = 0
        L_0x003a:
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r3] = r2
            if (r6 == 0) goto L_0x0045
            java.lang.String r2 = "v2"
            goto L_0x0048
        L_0x0045:
            java.lang.String r2 = "v1"
        L_0x0048:
            r5[r4] = r2
            java.lang.String r2 = "MicroMsg.Channel.GameChannelUtil"
            java.lang.String r7 = "apkPath:%s, this is %s signature"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r7, r5)
            java.lang.String r5 = "channelId"
            if (r6 == 0) goto L_0x00ee
            java.lang.String r7 = "get channel by v2"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)
            boolean r7 = r11.mo119967g()
            if (r7 == 0) goto L_0x00db
            boolean r7 = r11.mo119978p()
            if (r7 != 0) goto L_0x0068
            goto L_0x00db
        L_0x0068:
            boolean r7 = r11.mo119967g()
            if (r7 == 0) goto L_0x00bd
            boolean r7 = r11.mo119978p()
            if (r7 != 0) goto L_0x0075
            goto L_0x00bd
        L_0x0075:
            boolean r7 = r11.mo119967g()
            if (r7 == 0) goto L_0x00ac
            boolean r7 = r11.mo119978p()
            if (r7 != 0) goto L_0x0082
            goto L_0x00ac
        L_0x0082:
            java.nio.ByteBuffer r7 = w41.C118749e.m167442b(r11)     // Catch:{ IOException -> 0x00ab, c -> 0x008b }
            java.util.Map r7 = w41.C118749e.m167441a(r7)     // Catch:{ IOException -> 0x00ab, c -> 0x008b }
            goto L_0x00ad
        L_0x008b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "APK : "
            r7.append(r8)
            java.lang.String r8 = r11.mo119971i()
            r7.append(r8)
            java.lang.String r8 = " not have apk signature block"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "MicroMsg.Channel.IdValueReader"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r7)
            goto L_0x00ac
        L_0x00ab:
        L_0x00ac:
            r7 = r1
        L_0x00ad:
            if (r7 == 0) goto L_0x00bd
            r8 = 1903261812(0x71717874, float:1.1957041E30)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object r7 = r7.get(r8)
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7
            goto L_0x00be
        L_0x00bd:
            r7 = r1
        L_0x00be:
            if (r7 == 0) goto L_0x00db
            byte[] r8 = r7.array()
            int r9 = r7.arrayOffset()
            int r10 = r7.position()
            int r9 = r9 + r10
            int r10 = r7.arrayOffset()
            int r7 = r7.limit()
            int r10 = r10 + r7
            byte[] r7 = java.util.Arrays.copyOfRange(r8, r9, r10)
            goto L_0x00dc
        L_0x00db:
            r7 = r1
        L_0x00dc:
            if (r7 != 0) goto L_0x00df
            goto L_0x00ee
        L_0x00df:
            w41.c r8 = new w41.c
            r8.<init>()
            r8.mo183476a(r7)
            java.util.Properties r7 = r8.f355284a
            java.lang.String r7 = r7.getProperty(r5)
            goto L_0x00ef
        L_0x00ee:
            r7 = r1
        L_0x00ef:
            if (r7 != 0) goto L_0x0124
            java.lang.String r7 = "get channel by v1"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)     // Catch:{ Exception -> 0x010c }
            byte[] r7 = w41.C15036d.m14203a(r11)     // Catch:{ Exception -> 0x010c }
            if (r7 != 0) goto L_0x00fd
            goto L_0x0119
        L_0x00fd:
            w41.c r8 = new w41.c     // Catch:{ Exception -> 0x010c }
            r8.<init>()     // Catch:{ Exception -> 0x010c }
            r8.mo183476a(r7)     // Catch:{ Exception -> 0x010c }
            java.util.Properties r7 = r8.f355284a     // Catch:{ Exception -> 0x010c }
            java.lang.String r1 = r7.getProperty(r5)     // Catch:{ Exception -> 0x010c }
            goto L_0x0119
        L_0x010c:
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r11 = r11.mo119971i()
            r5[r3] = r11
            java.lang.String r11 = "APK : %s not have channel info from zip comment"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r11, r5)
        L_0x0119:
            if (r6 == 0) goto L_0x0123
            if (r1 == 0) goto L_0x0123
            java.lang.String r11 = "you are use v2 signature but use v1 channel modle, this apk will can't install in 7.0system"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r11)
        L_0x0123:
            r7 = r1
        L_0x0124:
            java.lang.Object[] r11 = new java.lang.Object[r4]
            r11[r3] = r7
            java.lang.String r0 = "readChannel, channelId = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r11)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: w41.C118747b.m167439a(com.tencent.mm.vfs.m1):java.lang.String");
    }
}
