package com.tencent.p014mm.plugin.appbrand.appcache;

import android.content.res.AssetManager;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkg;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81412d0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Map;
import p1042u.C111055b;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.h */
public class C81255h implements C40427l0, Closeable {

    /* renamed from: d */
    public volatile boolean f238655d = true;

    /* renamed from: e */
    public volatile AssetManager f238656e;

    /* renamed from: f */
    public volatile ByteArrayOutputStream f238657f;

    /* renamed from: g */
    public volatile int f238658g = 0;

    /* renamed from: h */
    public volatile int f238659h = 0;

    /* renamed from: i */
    public volatile int f238660i = -1;

    /* renamed from: j */
    public volatile String f238661j = null;

    /* renamed from: n */
    public volatile Map<String, WxaPkg.Info> f238662n = null;

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0090, code lost:
        if (r6 == false) goto L_0x0093;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C81255h(android.content.Context r6, java.lang.String r7) {
        /*
            r5 = this;
            r5.<init>()
            r0 = 1
            r5.f238655d = r0
            r1 = 0
            r5.f238658g = r1
            r5.f238659h = r1
            r2 = -1
            r5.f238660i = r2
            r3 = 0
            r5.f238661j = r3
            r5.f238662n = r3
            android.content.res.AssetManager r6 = r6.getAssets()
            r5.f238656e = r6
            r5.f238661j = r7
            android.content.res.AssetManager r6 = r5.f238656e     // Catch:{ IOException -> 0x003b }
            java.io.InputStream r6 = r6.open(r7)     // Catch:{ IOException -> 0x003b }
            if (r6 != 0) goto L_0x0024
            goto L_0x0042
        L_0x0024:
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x003b }
            r7.<init>()     // Catch:{ IOException -> 0x003b }
            r5.f238657f = r7     // Catch:{ IOException -> 0x003b }
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]     // Catch:{ IOException -> 0x003b }
        L_0x002f:
            int r3 = r6.read(r7)     // Catch:{ IOException -> 0x003b }
            if (r3 <= r2) goto L_0x003d
            java.io.ByteArrayOutputStream r4 = r5.f238657f     // Catch:{ IOException -> 0x003b }
            r4.write(r7, r1, r3)     // Catch:{ IOException -> 0x003b }
            goto L_0x002f
        L_0x003b:
            goto L_0x0045
        L_0x003d:
            java.io.ByteArrayOutputStream r7 = r5.f238657f     // Catch:{ IOException -> 0x003b }
            r7.flush()     // Catch:{ IOException -> 0x003b }
        L_0x0042:
            r6.close()     // Catch:{ IOException -> 0x003b }
        L_0x0045:
            java.io.ByteArrayOutputStream r6 = r5.f238657f
            if (r6 == 0) goto L_0x0096
            java.io.ByteArrayOutputStream r6 = r5.f238657f
            if (r6 == 0) goto L_0x0057
            java.io.ByteArrayOutputStream r6 = r5.f238657f
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x0057
            r6 = 1
            goto L_0x0058
        L_0x0057:
            r6 = 0
        L_0x0058:
            if (r6 == 0) goto L_0x0093
            java.io.ByteArrayOutputStream r6 = r5.f238657f
            if (r6 != 0) goto L_0x0060
        L_0x005e:
            r6 = 0
            goto L_0x0090
        L_0x0060:
            r6 = 14
            byte[] r7 = new byte[r6]
            java.io.ByteArrayOutputStream r2 = r5.f238657f
            byte[] r2 = r2.toByteArray()
            java.lang.System.arraycopy(r2, r1, r7, r1, r6)
            r6 = -66
            byte r2 = r7[r1]
            if (r6 != r2) goto L_0x005e
            r6 = -19
            r2 = 13
            byte r2 = r7[r2]
            if (r6 == r2) goto L_0x007c
            goto L_0x005e
        L_0x007c:
            r6 = 4
            m99572d(r7, r0, r6)
            r2 = 5
            int r2 = m99572d(r7, r2, r6)
            r5.f238658g = r2
            r2 = 9
            int r6 = m99572d(r7, r2, r6)
            r5.f238659h = r6
            r6 = 1
        L_0x0090:
            if (r6 == 0) goto L_0x0093
            goto L_0x0094
        L_0x0093:
            r0 = 0
        L_0x0094:
            r5.f238655d = r0
        L_0x0096:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appcache.C81255h.<init>(android.content.Context, java.lang.String):void");
    }

    /* renamed from: d */
    public static int m99572d(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return 0;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, i2);
        wrap.order(ByteOrder.BIG_ENDIAN);
        return wrap.getInt();
    }

    /* renamed from: a */
    public InputStream mo63188a(String str) {
        WxaPkg.Info openReadPartialInfo;
        int i;
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (this.f238657f == null || this.f238657f.size() <= 0 || (openReadPartialInfo = openReadPartialInfo(str)) == null) {
            return null;
        }
        if (!Thread.currentThread().isInterrupted()) {
            byte[] bArr = new byte[openReadPartialInfo.f238572g];
            System.arraycopy(this.f238657f.toByteArray(), openReadPartialInfo.f238571f, bArr, 0, openReadPartialInfo.f238572g);
            return new ByteArrayInputStream(bArr);
        } else if (this.f238656e == null || openReadPartialInfo.f238571f < 0 || (i = openReadPartialInfo.f238572g) <= 0) {
            return null;
        } else {
            try {
                byte[] bArr2 = new byte[i];
                inputStream = this.f238656e.open(this.f238661j);
                try {
                    if (inputStream.skip((long) openReadPartialInfo.f238571f) != ((long) openReadPartialInfo.f238571f)) {
                        Log.m105920e("MicroMsg.AssetsWxaPkgReader", "offset actual number != require");
                    } else if (inputStream.read(bArr2, 0, openReadPartialInfo.f238572g) != openReadPartialInfo.f238572g) {
                        Log.m105920e("MicroMsg.AssetsWxaPkgReader", "length actual number != require");
                    } else {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2);
                        Util.qualityClose(inputStream);
                        return byteArrayInputStream;
                    }
                } catch (Exception e) {
                    e = e;
                    try {
                        Log.m105921e("MicroMsg.AssetsWxaPkgReader", "openReadOnThreadInterrupted pkgPath(%s) fileInfo.name(%s), e = %s", this.f238661j, openReadPartialInfo.f238570e, e);
                        Util.qualityClose(inputStream);
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        inputStream2 = inputStream;
                    }
                }
            } catch (Exception e2) {
                e = e2;
                inputStream = null;
                Log.m105921e("MicroMsg.AssetsWxaPkgReader", "openReadOnThreadInterrupted pkgPath(%s) fileInfo.name(%s), e = %s", this.f238661j, openReadPartialInfo.f238570e, e);
                Util.qualityClose(inputStream);
                return null;
            } catch (Throwable th4) {
                th = th4;
                Util.qualityClose(inputStream2);
                throw th;
            }
            Util.qualityClose(inputStream);
            return null;
        }
    }

    /* renamed from: b */
    public boolean mo63189b() {
        if (!this.f238655d || this.f238657f == null || this.f238658g <= 4) {
            Log.m105921e("MicroMsg.AssetsWxaPkgReader", "readInfo, valid = %b, (null == mInputStream) = %b, mBodyInfoLength = %d, skip", Boolean.valueOf(this.f238655d), this.f238657f, Integer.valueOf(this.f238659h));
            return false;
        } else if (this.f238662n != null && this.f238660i >= 0 && this.f238660i == this.f238662n.size()) {
            return true;
        } else {
            byte[] bArr = new byte[this.f238658g];
            System.arraycopy(this.f238657f.toByteArray(), 14, bArr, 0, this.f238658g);
            this.f238660i = m99572d(bArr, 0, 4);
            C111055b bVar = new C111055b();
            WxaPkg.Info info = null;
            int i = 0;
            int i2 = 4;
            while (i < this.f238660i) {
                int d = m99572d(bArr, i2, 4);
                int i3 = i2 + 4;
                String str = new String(bArr, i3, d);
                int i4 = i3 + d;
                int d2 = m99572d(bArr, i4, 4);
                int i5 = i4 + 4;
                int d3 = m99572d(bArr, i5, 4);
                i2 = i5 + 4;
                WxaPkg.Info info2 = new WxaPkg.Info(this.f238661j, str, d2, d3);
                bVar.put(str, info2);
                i++;
                info = info2;
            }
            this.f238662n = bVar;
            int size = this.f238657f.size();
            if (info != null) {
                int i6 = info.f238571f;
                if (info.f238572g + i6 > size) {
                    Log.m105921e("MicroMsg.AssetsWxaPkgReader", "readInfo, lastFileOffset(%d) + lastFileLength(%d) > totalFileLength(%d)", Integer.valueOf(i6), Integer.valueOf(info.f238572g), Integer.valueOf(size));
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: c */
    public String mo63190c() {
        return "file:///android_asset/" + this.f238661j;
    }

    public void close() {
        if (this.f238657f != null && this.f238657f.size() > 0) {
            try {
                this.f238657f.close();
                this.f238657f = null;
            } catch (Exception unused) {
            }
        }
    }

    public void finalize() {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public WxaPkg.Info openReadPartialInfo(String str) {
        if (this.f238662n == null || Util.isNullOrNil(str)) {
            Object[] objArr = new Object[3];
            int i = 0;
            objArr[0] = Boolean.valueOf(this.f238662n == null);
            if (this.f238662n != null) {
                i = this.f238662n.size();
            }
            objArr[1] = Integer.valueOf(i);
            objArr[2] = str;
            Log.m105921e("MicroMsg.AssetsWxaPkgReader", "openReadFile, mFileMap null = %b, mFileMap size = %d, fileName = %s", objArr);
            return null;
        }
        return this.f238662n.get(C81412d0.m99868b(str, true));
    }
}
