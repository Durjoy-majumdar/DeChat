package pl1;

/* renamed from: pl1.s */
public final class C11989s {

    /* renamed from: a */
    public static final C11989s f34981a = new C11989s();

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b6 A[SYNTHETIC, Splitter:B:26:0x00b6] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap mo11860a(android.graphics.Bitmap r12, int r13, int r14) {
        /*
            r11 = this;
            java.lang.String r0 = "RSInvalidStateException "
            java.lang.String r1 = "FinderCoverBlurUtils"
            java.lang.String r2 = "coverBitmap"
            gy3.C87412m.m108594g(r12, r2)
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r13, r14, r2)
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r2)
            int r4 = r14 / 20
            int r5 = r13 / 20
            r6 = 1
            r7 = 0
            android.graphics.Bitmap r4 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.extractThumbNail(r12, r4, r5, r6, r7)
            if (r4 != 0) goto L_0x002b
            android.graphics.Bitmap$Config r4 = r12.getConfig()
            android.graphics.Bitmap r4 = r12.copy(r4, r6)
            if (r4 != 0) goto L_0x002b
            return r12
        L_0x002b:
            int r12 = r4.getWidth()
            int r5 = r4.getHeight()
            int r6 = r12 * r14
            int r7 = r13 * r5
            r8 = 1056964608(0x3f000000, float:0.5)
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 0
            if (r6 <= r7) goto L_0x004d
            float r14 = (float) r14
            float r14 = r14 * r9
            float r5 = (float) r5
            float r14 = r14 / r5
            float r13 = (float) r13
            float r12 = (float) r12
            float r12 = r12 * r14
            float r13 = r13 - r12
            float r13 = r13 * r8
            r10 = r13
            r13 = 0
            goto L_0x005b
        L_0x004d:
            float r13 = (float) r13
            float r13 = r13 * r9
            float r12 = (float) r12
            float r12 = r13 / r12
            float r13 = (float) r14
            float r14 = (float) r5
            float r14 = r14 * r12
            float r13 = r13 - r14
            float r13 = r13 * r8
            r14 = r12
        L_0x005b:
            android.graphics.Matrix r12 = new android.graphics.Matrix
            r12.<init>()
            r12.postScale(r14, r14)
            r12.postTranslate(r10, r13)
            r13 = 0
            tj3.i r14 = new tj3.i     // Catch:{ all -> 0x0093 }
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0093 }
            r14.<init>(r5)     // Catch:{ all -> 0x0093 }
            r5 = 1101004800(0x41a00000, float:20.0)
            r14.mo162692b(r4, r5)     // Catch:{ all -> 0x0091 }
            r14.destroy()     // Catch:{ RSInvalidStateException -> 0x0079 }
            goto L_0x00c1
        L_0x0079:
            r14 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
        L_0x007f:
            r5.append(r0)
            java.lang.String r14 = r14.getMessage()
            r5.append(r14)
            java.lang.String r14 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r14)
            goto L_0x00c1
        L_0x0091:
            r5 = move-exception
            goto L_0x0095
        L_0x0093:
            r5 = move-exception
            r14 = r13
        L_0x0095:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00dc }
            r6.<init>()     // Catch:{ all -> 0x00dc }
            java.lang.String r7 = "setBlurBitmap error:"
            r6.append(r7)     // Catch:{ all -> 0x00dc }
            java.lang.String r5 = r5.getMessage()     // Catch:{ all -> 0x00dc }
            r6.append(r5)     // Catch:{ all -> 0x00dc }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x00dc }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r5)     // Catch:{ all -> 0x00dc }
            r5 = 20
            android.graphics.Bitmap r4 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.fastblur(r4, r5)     // Catch:{ all -> 0x00dc }
            if (r14 == 0) goto L_0x00c1
            r14.destroy()     // Catch:{ RSInvalidStateException -> 0x00ba }
            goto L_0x00c1
        L_0x00ba:
            r14 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            goto L_0x007f
        L_0x00c1:
            r3.drawBitmap(r4, r12, r13)
            java.lang.String r12 = "#14000000"
            int r12 = android.graphics.Color.parseColor(r12)
            r3.drawColor(r12)
            java.lang.String r12 = "#60D2D2D2"
            int r12 = android.graphics.Color.parseColor(r12)
            r3.drawColor(r12)
            java.lang.String r12 = "resultBitmap"
            gy3.C87412m.m108593f(r2, r12)
            return r2
        L_0x00dc:
            r12 = move-exception
            if (r14 == 0) goto L_0x00fa
            r14.destroy()     // Catch:{ RSInvalidStateException -> 0x00e3 }
            goto L_0x00fa
        L_0x00e3:
            r13 = move-exception
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r0)
            java.lang.String r13 = r13.getMessage()
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r13)
        L_0x00fa:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: pl1.C11989s.mo11860a(android.graphics.Bitmap, int, int):android.graphics.Bitmap");
    }
}
