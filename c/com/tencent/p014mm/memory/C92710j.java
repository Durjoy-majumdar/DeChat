package com.tencent.p014mm.memory;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.InputStream;
import java.nio.ByteBuffer;
import oa1.C117731d;
import p206nj.C11171e;

/* renamed from: com.tencent.mm.memory.j */
public class C92710j extends C92712l {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.graphics.Bitmap} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap mo126911b(java.lang.String r7, android.graphics.BitmapFactory.Options r8) {
        /*
            r6 = this;
            r0 = 0
            java.io.InputStream r7 = com.tencent.p014mm.vfs.C86013q1.m106423E(r7)     // Catch:{ Exception -> 0x0014, all -> 0x0012 }
            android.graphics.Bitmap r0 = r6.mo126914g(r7, r8)     // Catch:{ Exception -> 0x0010 }
        L_0x0009:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r7)
            goto L_0x0028
        L_0x000d:
            r8 = move-exception
            r0 = r7
            goto L_0x0029
        L_0x0010:
            r8 = move-exception
            goto L_0x0016
        L_0x0012:
            r8 = move-exception
            goto L_0x0029
        L_0x0014:
            r8 = move-exception
            r7 = r0
        L_0x0016:
            java.lang.String r1 = "MicroMsg.InBitmapFactory"
            java.lang.String r2 = "error decode bitmap %s"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x000d }
            r4 = 0
            java.lang.String r5 = r8.getMessage()     // Catch:{ all -> 0x000d }
            r3[r4] = r5     // Catch:{ all -> 0x000d }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r8, r2, r3)     // Catch:{ all -> 0x000d }
            goto L_0x0009
        L_0x0028:
            return r0
        L_0x0029:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.memory.C92710j.mo126911b(java.lang.String, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    /* renamed from: d */
    public void mo126912d(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            C92704c cVar = C92704c.f266809e;
            synchronized (cVar) {
                if (bitmap.isMutable() && !bitmap.isRecycled()) {
                    Log.m105925i("MicroMsg.BitmapPool", "release: %s", bitmap);
                    cVar.mo126900k(bitmap);
                    try {
                        if (Util.getInt(C117731d.m166007c().mo182444f("clicfg_bitmap_pool_release_recycle", "0", false, true), 0) == 1) {
                            bitmap.recycle();
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.nio.ByteBuffer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.nio.ByteBuffer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.nio.ByteBuffer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.nio.ByteBuffer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.nio.ByteBuffer} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0045, code lost:
        if (r7 == 0) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r7 != 0) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        com.tencent.p014mm.memory.C40337h.f108423a.release(r7);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004d  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap mo126913e(java.lang.String r9, android.graphics.Rect r10, android.graphics.BitmapFactory.Options r11) {
        /*
            r8 = this;
            r0 = 0
            java.io.InputStream r9 = com.tencent.p014mm.vfs.C86013q1.m106423E(r9)     // Catch:{ Exception -> 0x0031, all -> 0x002e }
            com.tencent.mm.memory.h r1 = com.tencent.p014mm.memory.C40337h.f108423a     // Catch:{ Exception -> 0x002b, all -> 0x0029 }
            java.lang.Object r1 = r1.acquire()     // Catch:{ Exception -> 0x002b, all -> 0x0029 }
            r7 = r1
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7     // Catch:{ Exception -> 0x002b, all -> 0x0029 }
            r5 = 1
            r1 = r8
            r2 = r9
            r3 = r11
            r4 = r7
            r6 = r10
            android.graphics.BitmapFactory$Options r11 = r1.mo126916i(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0027 }
            android.graphics.Bitmap r0 = r8.mo126915h(r9, r10, r11)     // Catch:{ Exception -> 0x0027 }
            if (r7 == 0) goto L_0x0023
        L_0x001e:
            com.tencent.mm.memory.h r10 = com.tencent.p014mm.memory.C40337h.f108423a
            r10.release(r7)
        L_0x0023:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r9)
            goto L_0x0048
        L_0x0027:
            r10 = move-exception
            goto L_0x0034
        L_0x0029:
            r10 = move-exception
            goto L_0x004b
        L_0x002b:
            r10 = move-exception
            r7 = r0
            goto L_0x0034
        L_0x002e:
            r10 = move-exception
            r9 = r0
            goto L_0x004b
        L_0x0031:
            r10 = move-exception
            r9 = r0
            r7 = r9
        L_0x0034:
            java.lang.String r11 = "MicroMsg.InBitmapFactory"
            java.lang.String r1 = "error decode bitmap %s"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0049 }
            r3 = 0
            java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x0049 }
            r2[r3] = r10     // Catch:{ all -> 0x0049 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r1, r2)     // Catch:{ all -> 0x0049 }
            if (r7 == 0) goto L_0x0023
            goto L_0x001e
        L_0x0048:
            return r0
        L_0x0049:
            r10 = move-exception
            r0 = r7
        L_0x004b:
            if (r0 == 0) goto L_0x0052
            com.tencent.mm.memory.h r11 = com.tencent.p014mm.memory.C40337h.f108423a
            r11.release(r0)
        L_0x0052:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.memory.C92710j.mo126913e(java.lang.String, android.graphics.Rect, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        if (r1 != 0) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (r1 != 0) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        com.tencent.p014mm.memory.C40337h.f108423a.release(r1);
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003e  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap mo126914g(java.io.InputStream r9, android.graphics.BitmapFactory.Options r10) {
        /*
            r8 = this;
            r0 = 0
            com.tencent.mm.memory.h r1 = com.tencent.p014mm.memory.C40337h.f108423a     // Catch:{ Exception -> 0x0023, all -> 0x0021 }
            java.lang.Object r1 = r1.acquire()     // Catch:{ Exception -> 0x0023, all -> 0x0021 }
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1     // Catch:{ Exception -> 0x0023, all -> 0x0021 }
            r6 = 0
            r7 = 0
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r1
            android.graphics.BitmapFactory$Options r10 = r2.mo126916i(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x001f }
            android.graphics.Bitmap r0 = r8.mo126915h(r9, r0, r10)     // Catch:{ Exception -> 0x001f }
            if (r1 == 0) goto L_0x0039
        L_0x0019:
            com.tencent.mm.memory.h r9 = com.tencent.p014mm.memory.C40337h.f108423a
            r9.release(r1)
            goto L_0x0039
        L_0x001f:
            r9 = move-exception
            goto L_0x0025
        L_0x0021:
            r9 = move-exception
            goto L_0x003c
        L_0x0023:
            r9 = move-exception
            r1 = r0
        L_0x0025:
            java.lang.String r10 = "MicroMsg.InBitmapFactory"
            java.lang.String r2 = "error decode bitmap %s"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x003a }
            r4 = 0
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x003a }
            r3[r4] = r9     // Catch:{ all -> 0x003a }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r2, r3)     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0039
            goto L_0x0019
        L_0x0039:
            return r0
        L_0x003a:
            r9 = move-exception
            r0 = r1
        L_0x003c:
            if (r0 == 0) goto L_0x0043
            com.tencent.mm.memory.h r10 = com.tencent.p014mm.memory.C40337h.f108423a
            r10.release(r0)
        L_0x0043:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.memory.C92710j.mo126914g(java.io.InputStream, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x0106  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap mo126915h(java.io.InputStream r13, android.graphics.Rect r14, android.graphics.BitmapFactory.Options r15) {
        /*
            r12 = this;
            java.lang.String r0 = "MicroMsg.InBitmapFactory"
            r1 = 0
            r2 = 2
            r3 = 3
            r4 = 1
            r5 = 0
            boolean r6 = r13.markSupported()     // Catch:{ Exception -> 0x00f4 }
            if (r6 == 0) goto L_0x000e
            goto L_0x0020
        L_0x000e:
            boolean r6 = r13 instanceof java.io.FileInputStream     // Catch:{ Exception -> 0x00f4 }
            if (r6 == 0) goto L_0x001a
            com.tencent.mm.sdk.platformtools.FileSeekingInputStream r6 = new com.tencent.mm.sdk.platformtools.FileSeekingInputStream     // Catch:{ Exception -> 0x00f4 }
            java.io.FileInputStream r13 = (java.io.FileInputStream) r13     // Catch:{ Exception -> 0x00f4 }
            r6.<init>(r13)     // Catch:{ Exception -> 0x00f4 }
            goto L_0x001f
        L_0x001a:
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x00f4 }
            r6.<init>(r13)     // Catch:{ Exception -> 0x00f4 }
        L_0x001f:
            r13 = r6
        L_0x0020:
            r12.mo126917f(r13)     // Catch:{ Exception -> 0x00f4 }
            r6 = 1048576(0x100000, float:1.469368E-39)
            r13.mark(r6)     // Catch:{ Exception -> 0x00f4 }
            r6 = 4
            if (r14 != 0) goto L_0x0030
            android.graphics.Bitmap r7 = com.tencent.p014mm.graphics.MMBitmapFactory.m98738g(r13, r5, r15)     // Catch:{ Exception -> 0x0035 }
            goto L_0x007e
        L_0x0030:
            android.graphics.Bitmap r7 = com.tencent.p014mm.graphics.C80876b.m98742a(r13, r14, r15)     // Catch:{ Exception -> 0x0035 }
            goto L_0x007e
        L_0x0035:
            r7 = move-exception
            java.lang.String r8 = "decode with inBitmap error: %s, outWidth: %s, outHeight: %s, sampleSize: %s, reuseBitmapWidth: %s, reuseBitmapHeight: %s"
            r9 = 6
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r10 = r7.getMessage()     // Catch:{ Exception -> 0x00f4 }
            r9[r1] = r10     // Catch:{ Exception -> 0x00f4 }
            int r10 = r15.outWidth     // Catch:{ Exception -> 0x00f4 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x00f4 }
            r9[r4] = r10     // Catch:{ Exception -> 0x00f4 }
            int r10 = r15.outHeight     // Catch:{ Exception -> 0x00f4 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x00f4 }
            r9[r2] = r10     // Catch:{ Exception -> 0x00f4 }
            int r10 = r15.inSampleSize     // Catch:{ Exception -> 0x00f4 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x00f4 }
            r9[r3] = r10     // Catch:{ Exception -> 0x00f4 }
            android.graphics.Bitmap r10 = r15.inBitmap     // Catch:{ Exception -> 0x00f4 }
            if (r10 == 0) goto L_0x0062
            int r10 = r10.getWidth()     // Catch:{ Exception -> 0x00f4 }
            goto L_0x0063
        L_0x0062:
            r10 = 0
        L_0x0063:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x00f4 }
            r9[r6] = r10     // Catch:{ Exception -> 0x00f4 }
            r10 = 5
            android.graphics.Bitmap r11 = r15.inBitmap     // Catch:{ Exception -> 0x00f4 }
            if (r11 == 0) goto L_0x0073
            int r11 = r11.getHeight()     // Catch:{ Exception -> 0x00f4 }
            goto L_0x0074
        L_0x0073:
            r11 = 0
        L_0x0074:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x00f4 }
            r9[r10] = r11     // Catch:{ Exception -> 0x00f4 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r7, r8, r9)     // Catch:{ Exception -> 0x00f4 }
            r7 = r5
        L_0x007e:
            if (r7 != 0) goto L_0x0099
            java.lang.String r8 = "decode again"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r8)     // Catch:{ Exception -> 0x0097 }
            r12.mo126917f(r13)     // Catch:{ Exception -> 0x0097 }
            r15.inBitmap = r5     // Catch:{ Exception -> 0x0097 }
            if (r14 != 0) goto L_0x0091
            android.graphics.Bitmap r13 = com.tencent.p014mm.graphics.MMBitmapFactory.m98738g(r13, r5, r15)     // Catch:{ Exception -> 0x0097 }
            goto L_0x0095
        L_0x0091:
            android.graphics.Bitmap r13 = com.tencent.p014mm.graphics.C80876b.m98742a(r13, r14, r15)     // Catch:{ Exception -> 0x0097 }
        L_0x0095:
            r5 = r13
            goto L_0x009a
        L_0x0097:
            r13 = move-exception
            goto L_0x00f6
        L_0x0099:
            r5 = r7
        L_0x009a:
            if (r14 == 0) goto L_0x0104
            if (r5 == 0) goto L_0x0104
            int r13 = r5.getWidth()     // Catch:{ Exception -> 0x00f4 }
            int r15 = r14.right     // Catch:{ Exception -> 0x00f4 }
            int r7 = r14.left     // Catch:{ Exception -> 0x00f4 }
            int r15 = r15 - r7
            if (r13 <= r15) goto L_0x0104
            int r13 = r5.getHeight()     // Catch:{ Exception -> 0x00f4 }
            int r15 = r14.bottom     // Catch:{ Exception -> 0x00f4 }
            int r7 = r14.top     // Catch:{ Exception -> 0x00f4 }
            int r15 = r15 - r7
            if (r13 <= r15) goto L_0x0104
            java.lang.String r13 = "fuck region decode size not match, clip it, reqWidth: %s, reqHeight: %s, resultWidth: %s, resultHeight: %s"
            java.lang.Object[] r15 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x00f4 }
            int r6 = r14.right     // Catch:{ Exception -> 0x00f4 }
            int r7 = r14.left     // Catch:{ Exception -> 0x00f4 }
            int r6 = r6 - r7
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x00f4 }
            r15[r1] = r6     // Catch:{ Exception -> 0x00f4 }
            int r6 = r14.bottom     // Catch:{ Exception -> 0x00f4 }
            int r7 = r14.top     // Catch:{ Exception -> 0x00f4 }
            int r6 = r6 - r7
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x00f4 }
            r15[r4] = r6     // Catch:{ Exception -> 0x00f4 }
            int r6 = r5.getWidth()     // Catch:{ Exception -> 0x00f4 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x00f4 }
            r15[r2] = r6     // Catch:{ Exception -> 0x00f4 }
            int r6 = r5.getHeight()     // Catch:{ Exception -> 0x00f4 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x00f4 }
            r15[r3] = r6     // Catch:{ Exception -> 0x00f4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r13, r15)     // Catch:{ Exception -> 0x00f4 }
            int r13 = r14.right     // Catch:{ Exception -> 0x00f4 }
            int r15 = r14.left     // Catch:{ Exception -> 0x00f4 }
            int r13 = r13 - r15
            int r15 = r14.bottom     // Catch:{ Exception -> 0x00f4 }
            int r14 = r14.top     // Catch:{ Exception -> 0x00f4 }
            int r15 = r15 - r14
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r5, r1, r1, r13, r15)     // Catch:{ Exception -> 0x00f4 }
            goto L_0x0104
        L_0x00f4:
            r13 = move-exception
            r7 = r5
        L_0x00f6:
            java.lang.Object[] r14 = new java.lang.Object[r4]
            java.lang.String r13 = r13.getMessage()
            r14[r1] = r13
            java.lang.String r13 = "decodeInternal error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r13, r14)
            r5 = r7
        L_0x0104:
            if (r5 == 0) goto L_0x0123
            java.lang.Object[] r13 = new java.lang.Object[r3]
            r13[r1] = r5
            int r14 = r5.getWidth()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r13[r4] = r14
            int r14 = r5.getHeight()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r13[r2] = r14
            java.lang.String r14 = "finish decode, decodedBitmap: %s, width: %s, height: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r14, r13)
        L_0x0123:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.memory.C92710j.mo126915h(java.io.InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    /* renamed from: i */
    public final BitmapFactory.Options mo126916i(InputStream inputStream, BitmapFactory.Options options, ByteBuffer byteBuffer, boolean z, Rect rect) {
        int i;
        if (options == null) {
            options = new BitmapFactory.Options();
        }
        if (byteBuffer != null) {
            options.inTempStorage = byteBuffer.array();
        }
        options.inJustDecodeBounds = true;
        Bitmap bitmap = null;
        MMBitmapFactory.m98738g(inputStream, (Rect) null, options);
        int i2 = options.outWidth;
        if (i2 == -1 || (i = options.outHeight) == -1) {
            throw new IllegalArgumentException("cannot get the bitmap size!");
        }
        options.inJustDecodeBounds = false;
        options.inDither = true;
        if (rect == null) {
            Log.m105925i("MicroMsg.InBitmapFactory", "options.outWidth: %s, options.outHeight: %s, sampleSize: %s", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(options.inSampleSize));
        } else {
            i2 = rect.right - rect.left;
            i = rect.bottom - rect.top;
            Log.m105925i("MicroMsg.InBitmapFactory", "region decode, width: %s, height: %s, rect: %s", Integer.valueOf(i2), Integer.valueOf(i), rect);
        }
        if (z) {
            C92704c cVar = C92704c.f266809e;
            Integer valueOf = Integer.valueOf(i2 * i);
            cVar.getClass();
            bitmap = (Bitmap) cVar.mo126905m(Integer.valueOf(valueOf.intValue() * 4));
            if (bitmap != null && C11171e.m11046c(19)) {
                bitmap.reconfigure(i2, i, Bitmap.Config.ARGB_8888);
            }
        } else {
            C92704c cVar2 = C92704c.f266809e;
            Integer valueOf2 = Integer.valueOf(i2 * i);
            cVar2.getClass();
            Integer valueOf3 = Integer.valueOf(valueOf2.intValue() * 4);
            synchronized (cVar2) {
                Bitmap bitmap2 = (Bitmap) cVar2.mo126904l(valueOf3);
                if (bitmap2 != null && !bitmap2.isRecycled()) {
                    if (bitmap2.isMutable()) {
                        Log.m105919d("MicroMsg.BitmapPool", "get stored element: %s, width: %s, height: %s, size: %s, requireSize: %s", bitmap2, Integer.valueOf(bitmap2.getWidth()), Integer.valueOf(bitmap2.getHeight()), cVar2.mo126895f(bitmap2), valueOf3);
                        bitmap = bitmap2;
                    }
                }
            }
        }
        Object[] objArr = new Object[5];
        objArr[0] = bitmap;
        objArr[1] = Boolean.valueOf(bitmap == null || bitmap.isRecycled());
        objArr[2] = Boolean.valueOf(z);
        objArr[3] = Integer.valueOf(bitmap != null ? bitmap.getWidth() : 0);
        objArr[4] = Integer.valueOf(bitmap != null ? bitmap.getHeight() : 0);
        Log.m105925i("MicroMsg.InBitmapFactory", "bitmapToReuse: %s, isRecycle: %s, isRegionDecode: %s, width: %s, height: %s", objArr);
        if (bitmap != null && bitmap.isMutable() && !bitmap.isRecycled()) {
            options.inBitmap = bitmap;
        }
        options.inMutable = true;
        BitmapUtil.bindlowMemeryOption(options);
        Log.m105925i("MicroMsg.InBitmapFactory", "mimetype: %s", options.outMimeType);
        return options;
    }
}
