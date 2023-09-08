package com.tencent.p014mm.plugin.appbrand.appcache;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.appcache.pkg.WxaPkgBaseImpl;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81412d0;
import com.tencent.p014mm.plugin.appbrand.appstorage.FileStat;
import com.tencent.p014mm.plugin.appbrand.appstorage.FileStructStat;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import fi0.C86867a;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import p225rc.C89912a;
import s24.C90125c;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.WxaPkg */
public final class WxaPkg implements C40427l0, Closeable {

    /* renamed from: o */
    public static final ByteOrder f238560o = ByteOrder.BIG_ENDIAN;

    /* renamed from: d */
    public final C86009m1 f238561d;

    /* renamed from: e */
    public volatile RandomAccessFile f238562e;

    /* renamed from: f */
    public volatile FileChannel f238563f;

    /* renamed from: g */
    public volatile boolean f238564g;

    /* renamed from: h */
    public volatile Map<String, Info> f238565h;

    /* renamed from: i */
    public volatile FileStructStat f238566i;

    /* renamed from: j */
    public volatile int f238567j;

    /* renamed from: n */
    public volatile C86867a f238568n;

    public WxaPkg(C86009m1 m1Var) {
        this.f238563f = null;
        this.f238564g = true;
        this.f238565h = null;
        this.f238567j = -1;
        this.f238561d = m1Var;
        mo113432e();
    }

    /* renamed from: d */
    public static int m99509d(String str) {
        WxaPkg wxaPkg;
        C86009m1 m1Var = new C86009m1(str);
        int i = -1;
        if (!m1Var.mo119967g()) {
            return -1;
        }
        long currentTicks = Util.currentTicks();
        try {
            wxaPkg = new WxaPkg(m1Var);
            if (wxaPkg.f238564g) {
                i = wxaPkg.mo113436j();
            }
            wxaPkg.close();
            Log.m105925i("MicroMsg.WxaPkg", "getPkgInnerVersion(%s) cost:%dms", str, Long.valueOf(Util.currentTicks() - currentTicks));
            return i;
        } catch (Throwable th) {
            Log.m105925i("MicroMsg.WxaPkg", "getPkgInnerVersion(%s) cost:%dms", str, Long.valueOf(Util.currentTicks() - currentTicks));
            throw th;
        }
        throw th;
    }

    /* renamed from: a */
    public InputStream mo63188a(String str) {
        Throwable th;
        RandomAccessFile randomAccessFile;
        Exception e;
        Info openReadPartialInfo = openReadPartialInfo(str);
        RandomAccessFile randomAccessFile2 = null;
        if (this.f238568n == null || !this.f238568n.mo113573H(openReadPartialInfo)) {
            if (openReadPartialInfo == null) {
                Log.m105929w("MicroMsg.WxaPkg", "can't find info of file: %s", str);
                return null;
            } else if (Thread.currentThread().isInterrupted()) {
                try {
                    randomAccessFile = C86013q1.m106420B(this.f238561d.mo119976n(), false);
                    try {
                        byte[] bArr = new byte[openReadPartialInfo.f238572g];
                        randomAccessFile.seek((long) openReadPartialInfo.f238571f);
                        randomAccessFile.readFully(bArr);
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                        Util.qualityClose(randomAccessFile);
                        return byteArrayInputStream;
                    } catch (Exception e2) {
                        e = e2;
                        try {
                            Log.m105921e("MicroMsg.WxaPkg", "openReadOnThreadInterrupted pkgPath(%s) fileInfo.name(%s), e = %s", this.f238561d.mo119976n(), openReadPartialInfo.f238570e, e);
                            Util.qualityClose(randomAccessFile);
                            return null;
                        } catch (Throwable th4) {
                            randomAccessFile2 = randomAccessFile;
                            th = th4;
                            Util.qualityClose(randomAccessFile2);
                            throw th;
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    randomAccessFile = null;
                    Log.m105921e("MicroMsg.WxaPkg", "openReadOnThreadInterrupted pkgPath(%s) fileInfo.name(%s), e = %s", this.f238561d.mo119976n(), openReadPartialInfo.f238570e, e);
                    Util.qualityClose(randomAccessFile);
                    return null;
                } catch (Throwable th5) {
                    th = th5;
                    Util.qualityClose(randomAccessFile2);
                    throw th;
                }
            } else {
                try {
                    if (!this.f238563f.isOpen()) {
                        Log.m105920e("MicroMsg.WxaPkg", "file channel closed unexpectly!");
                        mo113432e();
                    }
                    MappedByteBuffer map = this.f238563f.map(FileChannel.MapMode.READ_ONLY, (long) openReadPartialInfo.f238571f, (long) openReadPartialInfo.f238572g);
                    map.order(f238560o);
                    map.limit(openReadPartialInfo.f238572g);
                    return new C89912a(map);
                } catch (Exception e4) {
                    Log.m105921e("MicroMsg.WxaPkg", "handleOpenReadFile, fileName = %s, fileOffset = %d, fileLength = %d, exp = %s", str, Integer.valueOf(openReadPartialInfo.f238571f), Integer.valueOf(openReadPartialInfo.f238572g), Util.stackTraceToString(e4));
                    return null;
                }
            }
        } else if (openReadPartialInfo != null) {
            return this.f238568n.mo113574a0(openReadPartialInfo);
        } else {
            Log.m105929w("MicroMsg.WxaPkg", "can't find info of file: %s", str);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0065  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo63189b() {
        /*
            r8 = this;
            boolean r0 = r8.f238564g
            java.lang.String r1 = "MicroMsg.WxaPkg"
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0019
            java.lang.Object[] r0 = new java.lang.Object[r2]
            com.tencent.mm.vfs.m1 r2 = r8.f238561d
            java.lang.String r2 = r2.mo119971i()
            r0[r3] = r2
            java.lang.String r2 = "readInfo, file(%s) valid==false"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r2, r0)
            return r3
        L_0x0019:
            fi0.a r0 = r8.f238568n
            if (r0 != 0) goto L_0x0076
            boolean r0 = r8.mo113435i()
            if (r0 != 0) goto L_0x0025
        L_0x0023:
            r0 = 0
            goto L_0x0063
        L_0x0025:
            int r0 = r8.mo113436j()
            if (r0 >= 0) goto L_0x002c
            goto L_0x0023
        L_0x002c:
            if (r0 == 0) goto L_0x0038
            if (r0 == r2) goto L_0x0032
            r0 = 0
            goto L_0x003d
        L_0x0032:
            com.tencent.mm.plugin.appbrand.appcache.pkg.WxaPkgMixedImpl r0 = new com.tencent.mm.plugin.appbrand.appcache.pkg.WxaPkgMixedImpl
            r0.<init>()
            goto L_0x003d
        L_0x0038:
            com.tencent.mm.plugin.appbrand.appcache.pkg.a r0 = new com.tencent.mm.plugin.appbrand.appcache.pkg.a
            r0.<init>()
        L_0x003d:
            r8.f238568n = r0
            fi0.a r0 = r8.f238568n
            if (r0 != 0) goto L_0x004a
            java.lang.String r0 = "parseHeader, mIWxaPkgAction is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            goto L_0x0023
        L_0x004a:
            fi0.a r0 = r8.f238568n     // Catch:{ IOException -> 0x0053 }
            java.nio.channels.FileChannel r4 = r8.f238563f     // Catch:{ IOException -> 0x0053 }
            boolean r0 = r0.mo113576t(r4)     // Catch:{ IOException -> 0x0053 }
            goto L_0x0063
        L_0x0053:
            r0 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r4[r3] = r0
            java.lang.String r0 = "parseHeader, exp = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r0, r4)
            goto L_0x0023
        L_0x0063:
            if (r0 != 0) goto L_0x0076
            java.lang.Object[] r0 = new java.lang.Object[r2]
            com.tencent.mm.vfs.m1 r2 = r8.f238561d
            java.lang.String r2 = r2.mo119971i()
            r0[r3] = r2
            java.lang.String r2 = "readInfo, file(%s) parseHeaderFully==false"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r2, r0)
            return r3
        L_0x0076:
            fi0.a r0 = r8.f238568n
            int r0 = r0.mo113572D0()
            r4 = 4
            r5 = 2
            if (r0 > r4) goto L_0x00aa
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.tencent.mm.vfs.m1 r4 = r8.f238561d
            java.lang.String r4 = r4.mo119971i()
            r0[r3] = r4
            com.tencent.mm.vfs.m1 r4 = r8.f238561d
            long r6 = r4.mo119980r()
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r0[r2] = r4
            com.tencent.mm.vfs.m1 r2 = r8.f238561d
            boolean r2 = r2.mo119967g()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0[r5] = r2
            java.lang.String r2 = "readInfo, file(%s) getBodyInfoLength<=4, fileLength:%d, fileExists:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r2, r0)
            return r3
        L_0x00aa:
            java.util.Map<java.lang.String, com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info> r0 = r8.f238565h
            if (r0 == 0) goto L_0x00c5
            fi0.a r0 = r8.f238568n
            int r0 = r0.mo113577u()
            if (r0 < 0) goto L_0x00c5
            fi0.a r0 = r8.f238568n
            int r0 = r0.mo113577u()
            java.util.Map<java.lang.String, com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info> r4 = r8.f238565h
            int r4 = r4.size()
            if (r0 != r4) goto L_0x00c5
            return r2
        L_0x00c5:
            fi0.a r0 = r8.f238568n     // Catch:{ Exception -> 0x00d8 }
            java.nio.channels.FileChannel r4 = r8.f238563f     // Catch:{ Exception -> 0x00d8 }
            com.tencent.mm.vfs.m1 r6 = r8.f238561d     // Catch:{ Exception -> 0x00d8 }
            java.util.Map r0 = r0.mo113578z(r4, r6)     // Catch:{ Exception -> 0x00d8 }
            r8.f238565h = r0     // Catch:{ Exception -> 0x00d8 }
            java.util.Map<java.lang.String, com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info> r0 = r8.f238565h
            if (r0 == 0) goto L_0x00d6
            goto L_0x00d7
        L_0x00d6:
            r2 = 0
        L_0x00d7:
            return r2
        L_0x00d8:
            r0 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r5]
            com.tencent.mm.vfs.m1 r5 = r8.f238561d
            java.lang.String r5 = r5.mo119971i()
            r4[r3] = r5
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r4[r2] = r0
            java.lang.String r0 = "readInfo, file(%s) getInfo failed exp = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r0, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appcache.WxaPkg.mo63189b():boolean");
    }

    /* renamed from: c */
    public String mo63190c() {
        return this.f238561d.mo119971i();
    }

    public void close() {
        C90125c.m112774a(this.f238563f);
        C90125c.m112774a(this.f238562e);
    }

    /* renamed from: e */
    public final void mo113432e() {
        C86009m1 m1Var = this.f238561d;
        boolean z = true;
        if (!(m1Var != null && m1Var.mo119967g() && this.f238561d.mo119980r() > 14) || mo113436j() < 0) {
            z = false;
        }
        this.f238564g = z;
    }

    public void finalize() {
        try {
            close();
            if (this.f238568n != null) {
                this.f238568n.close();
            }
        } finally {
            super.finalize();
        }
    }

    /* renamed from: g */
    public List<Info> mo113434g() {
        if (!mo63189b()) {
            Log.m105920e("MicroMsg.WxaPkg", "listInfos readInfo returns false");
        }
        return this.f238565h == null ? Collections.emptyList() : new LinkedList(this.f238565h.values());
    }

    /* renamed from: i */
    public final boolean mo113435i() {
        if (this.f238563f != null && this.f238563f.isOpen()) {
            return true;
        }
        try {
            C90125c.m112774a(this.f238563f);
            C90125c.m112774a(this.f238562e);
            RandomAccessFile B = C86013q1.m106420B(this.f238561d.mo119976n(), false);
            this.f238562e = B;
            this.f238563f = B.getChannel();
            return true;
        } catch (IOException e) {
            Log.m105921e("MicroMsg.WxaPkg", "open(), exp = %s", Util.stackTraceToString(e));
            return false;
        }
    }

    /* renamed from: j */
    public final int mo113436j() {
        int i = -1;
        if (!mo113435i()) {
            return -1;
        }
        if (this.f238567j >= 0) {
            return this.f238567j;
        }
        try {
            this.f238563f.position(1);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(f238560o);
            this.f238563f.read(allocate);
            i = WxaPkgBaseImpl.m99703a(allocate.array(), 0, 4);
            this.f238567j = i;
            Log.m105925i("MicroMsg.WxaPkg", "parsed header version:%d, path:%s", Integer.valueOf(i), this.f238561d.mo119971i());
            return i;
        } catch (IOException e) {
            Log.m105921e("MicroMsg.WxaPkg", "parseHeaderVersion, exp = %s", Util.stackTraceToString(e));
            return i;
        }
    }

    /* renamed from: k */
    public FileStructStat mo113437k() {
        FileStructStat fileStructStat = this.f238566i;
        if (fileStructStat != null) {
            return fileStructStat;
        }
        FileStructStat fileStructStat2 = new FileStructStat();
        FileStat.vfsStat(this.f238561d.mo119971i(), fileStructStat2);
        this.f238566i = fileStructStat2;
        return fileStructStat2;
    }

    public Info openReadPartialInfo(String str) {
        if (this.f238565h == null || Util.isNullOrNil(str)) {
            Object[] objArr = new Object[3];
            int i = 0;
            objArr[0] = Boolean.valueOf(this.f238565h == null);
            if (this.f238565h != null) {
                i = this.f238565h.size();
            }
            objArr[1] = Integer.valueOf(i);
            objArr[2] = str;
            Log.m105921e("MicroMsg.WxaPkg", "handleInterruptReadFile, mFileMap null = %b, mFileMap size = %d, fileName = %s", objArr);
            return null;
        }
        Info info = this.f238565h.get(str);
        if (info != null) {
            return info;
        }
        return this.f238565h.get(C81412d0.m99868b(str, true));
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info */
    public static class Info implements Parcelable {
        public static final Parcelable.Creator<Info> CREATOR = new C81219a();

        /* renamed from: d */
        public final String f238569d;

        /* renamed from: e */
        public final String f238570e;

        /* renamed from: f */
        public final int f238571f;

        /* renamed from: g */
        public final int f238572g;

        /* renamed from: com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info$a */
        public class C81219a implements Parcelable.Creator<Info> {
            public Object createFromParcel(Parcel parcel) {
                return new Info(parcel);
            }

            public Object[] newArray(int i) {
                return new Info[i];
            }
        }

        public Info(String str, String str2, int i, int i2) {
            this.f238569d = str;
            this.f238570e = str2;
            this.f238571f = i;
            this.f238572g = i2;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f238569d);
            parcel.writeString(this.f238570e);
            parcel.writeInt(this.f238571f);
            parcel.writeInt(this.f238572g);
        }

        public Info(Parcel parcel) {
            this.f238569d = parcel.readString();
            this.f238570e = parcel.readString();
            this.f238571f = parcel.readInt();
            this.f238572g = parcel.readInt();
        }
    }

    public WxaPkg(String str) {
        this(new C86009m1(str));
    }
}
