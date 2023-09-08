package wl2;

/* renamed from: wl2.e */
public final class C15516e {
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x010b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T extends wl2.C15518g> wl2.C15519h m14538a(T r14, wl2.C15520i<T> r15) {
        /*
            java.lang.String r0 = "request"
            gy3.C87412m.m108594g(r14, r0)
            java.lang.String r0 = "compressStrategy"
            gy3.C87412m.m108594g(r15, r0)
            long r0 = java.lang.System.currentTimeMillis()
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options
            r2.<init>()
            r3 = 1
            r2.inJustDecodeBounds = r3
            long r3 = r14.getSession()
            java.lang.String r5 = r14.mo14297c()
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFile(r5, r2)
            int r6 = r2.outWidth
            int r7 = r2.outHeight
            wl2.h r8 = new wl2.h
            r8.<init>()
            java.lang.String r9 = ", height: "
            java.lang.String r10 = "MicroMsg.ScanCompressImageUtils"
            if (r6 <= 0) goto L_0x010f
            if (r7 > 0) goto L_0x0035
            goto L_0x010f
        L_0x0035:
            boolean r11 = r15.mo12983c(r6, r7)
            if (r11 != 0) goto L_0x0057
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "compressImage isSizeValid false width: "
            r14.append(r15)
            r14.append(r6)
            r14.append(r9)
            r14.append(r7)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r14)
            goto L_0x0129
        L_0x0057:
            int r11 = r15.mo12981a(r14, r6, r7)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "compressImage inSampleSize: "
            r12.append(r13)
            r12.append(r11)
            java.lang.String r13 = ", origin size: "
            r12.append(r13)
            int r13 = r2.outWidth
            r12.append(r13)
            java.lang.String r13 = ", "
            r12.append(r13)
            int r13 = r2.outHeight
            r12.append(r13)
            java.lang.String r13 = ", strategy: "
            r12.append(r13)
            java.lang.String r13 = r15.name()
            r12.append(r13)
            java.lang.String r13 = ", session: "
            r12.append(r13)
            r12.append(r3)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r12)
            r12 = 0
            r13 = 0
            r2.inSampleSize = r11     // Catch:{ all -> 0x00a8 }
            r2.inJustDecodeBounds = r12     // Catch:{ all -> 0x00a8 }
            android.graphics.Bitmap r2 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFile(r5, r2)     // Catch:{ all -> 0x00a8 }
            android.graphics.Bitmap r14 = r15.mo12982b(r14, r2)     // Catch:{ all -> 0x00a6 }
            goto L_0x00bb
        L_0x00a6:
            r14 = move-exception
            goto L_0x00aa
        L_0x00a8:
            r14 = move-exception
            r2 = r13
        L_0x00aa:
            java.lang.Object[] r15 = new java.lang.Object[r12]
            java.lang.String r5 = "compressImage exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r14, r5, r15)
            com.tencent.mm.plugin.report.service.n r14 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r15 = 1259(0x4eb, float:1.764E-42)
            r5 = 170(0xaa, float:2.38E-43)
            r14.mo175911u(r15, r5)
            r14 = r2
        L_0x00bb:
            long r11 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r2 = "compressImage decode result, width: "
            r15.append(r2)
            if (r14 == 0) goto L_0x00d4
            int r2 = r14.getWidth()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x00d5
        L_0x00d4:
            r2 = r13
        L_0x00d5:
            r15.append(r2)
            r15.append(r9)
            if (r14 == 0) goto L_0x00e5
            int r2 = r14.getHeight()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r2)
        L_0x00e5:
            r15.append(r13)
            java.lang.String r2 = ", cost: "
            r15.append(r2)
            long r11 = r11 - r0
            r15.append(r11)
            java.lang.String r0 = " ms, session: "
            r15.append(r0)
            r15.append(r3)
            java.lang.String r15 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r15)
            android.graphics.Point r15 = new android.graphics.Point
            r15.<init>(r6, r7)
            r8.f42062b = r15
            r8.f42061a = r14
            if (r14 == 0) goto L_0x0129
            r14.isRecycled()
            goto L_0x0129
        L_0x010f:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "compressImage invalid width: "
            r14.append(r15)
            r14.append(r6)
            r14.append(r9)
            r14.append(r7)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r14)
        L_0x0129:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: wl2.C15516e.m14538a(wl2.g, wl2.i):wl2.h");
    }
}
