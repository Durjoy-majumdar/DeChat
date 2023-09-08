package com.tencent.p014mm.memory;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import com.tencent.p014mm.graphics.C80876b;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.tencent.mm.memory.m */
public class C92713m extends C92712l {
    /* renamed from: b */
    public Bitmap mo126911b(String str, BitmapFactory.Options options) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            inputStream = C86013q1.m106423E(str);
            try {
                Bitmap h = mo126919h(inputStream, (Rect) null, options);
                Util.qualityClose(inputStream);
                return h;
            } catch (Exception e) {
                e = e;
                try {
                    Log.m105921e("MicroMsg.PurgeableBitmapFactory", "decode error: %s", e.getMessage());
                    Util.qualityClose(inputStream);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    Util.qualityClose(inputStream2);
                    throw th;
                }
            }
        } catch (Exception e2) {
            e = e2;
            inputStream = null;
            Log.m105921e("MicroMsg.PurgeableBitmapFactory", "decode error: %s", e.getMessage());
            Util.qualityClose(inputStream);
            return null;
        } catch (Throwable th4) {
            th = th4;
            Util.qualityClose(inputStream2);
            throw th;
        }
    }

    /* renamed from: d */
    public void mo126912d(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    Log.m105925i("MicroMsg.PurgeableBitmapFactory", "bitmap recycle %s", bitmap.toString());
                    bitmap.recycle();
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.PurgeableBitmapFactory", "recycle error: %s", e.getMessage());
            }
        }
    }

    /* renamed from: e */
    public Bitmap mo126913e(String str, Rect rect, BitmapFactory.Options options) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            inputStream = C86013q1.m106423E(str);
            try {
                Bitmap h = mo126919h(inputStream, rect, options);
                Util.qualityClose(inputStream);
                return h;
            } catch (Exception e) {
                e = e;
                try {
                    Log.m105921e("MicroMsg.PurgeableBitmapFactory", "decode error: %s", e.getMessage());
                    Util.qualityClose(inputStream);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    Util.qualityClose(inputStream2);
                    throw th;
                }
            }
        } catch (Exception e2) {
            e = e2;
            inputStream = null;
            Log.m105921e("MicroMsg.PurgeableBitmapFactory", "decode error: %s", e.getMessage());
            Util.qualityClose(inputStream);
            return null;
        } catch (Throwable th4) {
            th = th4;
            Util.qualityClose(inputStream2);
            throw th;
        }
    }

    /* renamed from: g */
    public final Bitmap mo126918g(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        byte[] bArr;
        byte[] bArr2 = null;
        if (inputStream != null) {
            int i = -1;
            try {
                i = inputStream.available();
                C92708g gVar = C92708g.f266813d;
                bArr = (byte[]) gVar.mo126904l(Integer.valueOf(i));
                if (bArr == null) {
                    try {
                        bArr = new byte[i];
                    } catch (Exception e) {
                        e = e;
                        try {
                            Log.m105921e("MicroMsg.PurgeableBitmapFactory", "decodeByByteArray error: %s", e.getMessage());
                            Util.qualityClose(inputStream);
                            C92708g.f266813d.mo126908n(bArr);
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            bArr2 = bArr;
                            Util.qualityClose(inputStream);
                            if (i > 0 && bArr2 != null) {
                                C92708g.f266813d.mo126908n(bArr2);
                            }
                            throw th;
                        }
                    }
                }
                inputStream.read(bArr);
                Bitmap h = MMBitmapFactory.m98739h(rect == null ? MMBitmapFactory.m98733b(bArr, 0, i, options) : C80876b.m98743b(bArr, 0, i, rect, options));
                Util.qualityClose(inputStream);
                if (i > 0) {
                    gVar.mo126908n(bArr);
                }
                return h;
            } catch (Exception e2) {
                e = e2;
                bArr = null;
                Log.m105921e("MicroMsg.PurgeableBitmapFactory", "decodeByByteArray error: %s", e.getMessage());
                Util.qualityClose(inputStream);
                if (i > 0 && bArr != null) {
                    C92708g.f266813d.mo126908n(bArr);
                }
                return null;
            } catch (Throwable th4) {
                th = th4;
                Util.qualityClose(inputStream);
                C92708g.f266813d.mo126908n(bArr2);
                throw th;
            }
        } else {
            Util.qualityClose(inputStream);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005b  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap mo126919h(java.io.InputStream r5, android.graphics.Rect r6, android.graphics.BitmapFactory.Options r7) {
        /*
            r4 = this;
            r0 = 0
            com.tencent.mm.memory.h r1 = com.tencent.p014mm.memory.C40337h.f108423a     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            java.lang.Object r1 = r1.acquire()     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            android.graphics.BitmapFactory$Options r7 = r4.mo126920i(r5, r7, r1)     // Catch:{ Exception -> 0x0023 }
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.bindlowMemeryOption(r7)     // Catch:{ Exception -> 0x0023 }
            boolean r2 = r5.markSupported()     // Catch:{ Exception -> 0x0023 }
            if (r2 == 0) goto L_0x0017
            goto L_0x002b
        L_0x0017:
            boolean r2 = r5 instanceof java.io.FileInputStream     // Catch:{ Exception -> 0x0023 }
            if (r2 == 0) goto L_0x0025
            com.tencent.mm.sdk.platformtools.FileSeekingInputStream r2 = new com.tencent.mm.sdk.platformtools.FileSeekingInputStream     // Catch:{ Exception -> 0x0023 }
            java.io.FileInputStream r5 = (java.io.FileInputStream) r5     // Catch:{ Exception -> 0x0023 }
            r2.<init>(r5)     // Catch:{ Exception -> 0x0023 }
            goto L_0x002a
        L_0x0023:
            r5 = move-exception
            goto L_0x003e
        L_0x0025:
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x0023 }
            r2.<init>(r5)     // Catch:{ Exception -> 0x0023 }
        L_0x002a:
            r5 = r2
        L_0x002b:
            r4.mo126917f(r5)     // Catch:{ Exception -> 0x0023 }
            android.graphics.Bitmap r5 = r4.mo126918g(r5, r6, r7)     // Catch:{ Exception -> 0x0023 }
            if (r1 == 0) goto L_0x0039
            com.tencent.mm.memory.h r6 = com.tencent.p014mm.memory.C40337h.f108423a
            r6.release(r1)
        L_0x0039:
            return r5
        L_0x003a:
            r5 = move-exception
            goto L_0x0059
        L_0x003c:
            r5 = move-exception
            r1 = r0
        L_0x003e:
            java.lang.String r6 = "MicroMsg.PurgeableBitmapFactory"
            java.lang.String r7 = "error decode bitmap %s"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0057 }
            r3 = 0
            java.lang.String r5 = r5.getMessage()     // Catch:{ all -> 0x0057 }
            r2[r3] = r5     // Catch:{ all -> 0x0057 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r7, r2)     // Catch:{ all -> 0x0057 }
            if (r1 == 0) goto L_0x0056
            com.tencent.mm.memory.h r5 = com.tencent.p014mm.memory.C40337h.f108423a
            r5.release(r1)
        L_0x0056:
            return r0
        L_0x0057:
            r5 = move-exception
            r0 = r1
        L_0x0059:
            if (r0 == 0) goto L_0x0060
            com.tencent.mm.memory.h r6 = com.tencent.p014mm.memory.C40337h.f108423a
            r6.release(r0)
        L_0x0060:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.memory.C92713m.mo126919h(java.io.InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    /* renamed from: i */
    public final BitmapFactory.Options mo126920i(InputStream inputStream, BitmapFactory.Options options, ByteBuffer byteBuffer) {
        if (options == null) {
            options = new BitmapFactory.Options();
        }
        if (byteBuffer != null) {
            options.inTempStorage = byteBuffer.array();
        }
        options.inJustDecodeBounds = true;
        MMBitmapFactory.m98738g(inputStream, (Rect) null, options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            throw new IllegalArgumentException("cannot get the bitmap size!");
        }
        Log.m105925i("MicroMsg.PurgeableBitmapFactory", "mimetype: %s", options.outMimeType);
        options.inDither = true;
        options.inMutable = true;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inJustDecodeBounds = false;
        return options;
    }
}
