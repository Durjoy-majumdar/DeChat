package ep0;

import lb0.C88394b;

/* renamed from: ep0.a */
public class C86630a implements C88394b.C88405h {

    /* renamed from: d */
    public int f251595d;

    /* renamed from: e */
    public int f251596e;

    /* renamed from: f */
    public int f251597f;

    /* renamed from: g */
    public int f251598g;

    public C86630a(int i, int i2, int i3, int i4) {
        this.f251595d = i;
        this.f251596e = i2;
        this.f251597f = i3;
        this.f251598g = i4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006a, code lost:
        if (r13 == null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008b, code lost:
        if (r13 == null) goto L_0x008e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap mo94301a(java.io.InputStream r13) {
        /*
            r12 = this;
            java.lang.String r0 = "%s"
            java.lang.String r1 = "MicroMsg.AppBrand.BitmapRegionDecoderImpl"
            r2 = 0
            r3 = 0
            r4 = 1
            int r5 = r12.f251597f     // Catch:{ IOException -> 0x007f, IllegalArgumentException -> 0x0070, OutOfMemoryError -> 0x005e }
            if (r5 < 0) goto L_0x0056
            int r5 = r12.f251598g     // Catch:{ IOException -> 0x007f, IllegalArgumentException -> 0x0070, OutOfMemoryError -> 0x005e }
            if (r5 >= 0) goto L_0x0010
            goto L_0x0056
        L_0x0010:
            boolean r5 = r13.markSupported()     // Catch:{ IOException -> 0x007f, IllegalArgumentException -> 0x0070, OutOfMemoryError -> 0x005e }
            if (r5 == 0) goto L_0x0017
            goto L_0x0031
        L_0x0017:
            boolean r5 = r13 instanceof java.io.FileInputStream     // Catch:{ IOException -> 0x007f, IllegalArgumentException -> 0x0070, OutOfMemoryError -> 0x005e }
            if (r5 == 0) goto L_0x0025
            com.tencent.mm.sdk.platformtools.FileSeekingInputStream r5 = new com.tencent.mm.sdk.platformtools.FileSeekingInputStream     // Catch:{ IOException -> 0x007f, IllegalArgumentException -> 0x0070, OutOfMemoryError -> 0x005e }
            r6 = r13
            java.io.FileInputStream r6 = (java.io.FileInputStream) r6     // Catch:{ IOException -> 0x007f, IllegalArgumentException -> 0x0070, OutOfMemoryError -> 0x005e }
            r5.<init>(r6)     // Catch:{ IOException -> 0x007f, IllegalArgumentException -> 0x0070, OutOfMemoryError -> 0x005e }
        L_0x0023:
            r13 = r5
            goto L_0x0031
        L_0x0025:
            boolean r5 = r13.markSupported()     // Catch:{ IOException -> 0x007f, IllegalArgumentException -> 0x0070, OutOfMemoryError -> 0x005e }
            if (r5 != 0) goto L_0x0031
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x007f, IllegalArgumentException -> 0x0070, OutOfMemoryError -> 0x005e }
            r5.<init>(r13)     // Catch:{ IOException -> 0x007f, IllegalArgumentException -> 0x0070, OutOfMemoryError -> 0x005e }
            goto L_0x0023
        L_0x0031:
            android.graphics.BitmapFactory$Options r5 = new android.graphics.BitmapFactory$Options     // Catch:{ IOException -> 0x007f, IllegalArgumentException -> 0x0070, OutOfMemoryError -> 0x005e }
            r5.<init>()     // Catch:{ IOException -> 0x007f, IllegalArgumentException -> 0x0070, OutOfMemoryError -> 0x005e }
            r5.inMutable = r4     // Catch:{ IOException -> 0x007f, IllegalArgumentException -> 0x0070, OutOfMemoryError -> 0x005e }
            android.graphics.BitmapRegionDecoder r6 = android.graphics.BitmapRegionDecoder.newInstance(r13, r3)     // Catch:{ IOException -> 0x007f, IllegalArgumentException -> 0x0070, OutOfMemoryError -> 0x005e }
            android.graphics.Rect r7 = new android.graphics.Rect     // Catch:{ IOException -> 0x007f, IllegalArgumentException -> 0x0070, OutOfMemoryError -> 0x005e }
            int r8 = r12.f251595d     // Catch:{ IOException -> 0x007f, IllegalArgumentException -> 0x0070, OutOfMemoryError -> 0x005e }
            int r9 = r12.f251596e     // Catch:{ IOException -> 0x007f, IllegalArgumentException -> 0x0070, OutOfMemoryError -> 0x005e }
            int r10 = r12.f251597f     // Catch:{ IOException -> 0x007f, IllegalArgumentException -> 0x0070, OutOfMemoryError -> 0x005e }
            int r10 = r10 + r8
            int r11 = r12.f251598g     // Catch:{ IOException -> 0x007f, IllegalArgumentException -> 0x0070, OutOfMemoryError -> 0x005e }
            int r11 = r11 + r9
            r7.<init>(r8, r9, r10, r11)     // Catch:{ IOException -> 0x007f, IllegalArgumentException -> 0x0070, OutOfMemoryError -> 0x005e }
            android.graphics.Bitmap r5 = r6.decodeRegion(r7, r5)     // Catch:{ IOException -> 0x007f, IllegalArgumentException -> 0x0070, OutOfMemoryError -> 0x005e }
            r6.recycle()     // Catch:{ IOException -> 0x007f, IllegalArgumentException -> 0x0070, OutOfMemoryError -> 0x005e }
            r13.close()     // Catch:{ IOException -> 0x0055 }
        L_0x0055:
            return r5
        L_0x0056:
            if (r13 == 0) goto L_0x005b
            r13.close()     // Catch:{ IOException -> 0x005b }
        L_0x005b:
            return r2
        L_0x005c:
            r0 = move-exception
            goto L_0x008f
        L_0x005e:
            r5 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x005c }
            java.lang.String r5 = android.util.Log.getStackTraceString(r5)     // Catch:{ all -> 0x005c }
            r4[r3] = r5     // Catch:{ all -> 0x005c }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r0, r4)     // Catch:{ all -> 0x005c }
            if (r13 == 0) goto L_0x008e
        L_0x006c:
            r13.close()     // Catch:{ IOException -> 0x008e }
            goto L_0x008e
        L_0x0070:
            r5 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x005c }
            java.lang.String r5 = android.util.Log.getStackTraceString(r5)     // Catch:{ all -> 0x005c }
            r4[r3] = r5     // Catch:{ all -> 0x005c }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r0, r4)     // Catch:{ all -> 0x005c }
            if (r13 == 0) goto L_0x008e
            goto L_0x006c
        L_0x007f:
            r5 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x005c }
            java.lang.String r5 = android.util.Log.getStackTraceString(r5)     // Catch:{ all -> 0x005c }
            r4[r3] = r5     // Catch:{ all -> 0x005c }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r0, r4)     // Catch:{ all -> 0x005c }
            if (r13 == 0) goto L_0x008e
            goto L_0x006c
        L_0x008e:
            return r2
        L_0x008f:
            if (r13 == 0) goto L_0x0094
            r13.close()     // Catch:{ IOException -> 0x0094 }
        L_0x0094:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ep0.C86630a.mo94301a(java.io.InputStream):android.graphics.Bitmap");
    }

    public String key() {
        return String.format("Decoder_x%s_y%s_w%s_h%s", new Object[]{Integer.valueOf(this.f251595d), Integer.valueOf(this.f251596e), Integer.valueOf(this.f251597f), Integer.valueOf(this.f251598g)});
    }
}
