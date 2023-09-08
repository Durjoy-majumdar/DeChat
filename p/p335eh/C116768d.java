package p335eh;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import p213oh.C11412b;
import p339fh.C116867h;
import p339fh.C116868i;

/* renamed from: eh.d */
public class C116768d {

    /* renamed from: a */
    public ArrayList<C107275e> f350072a = new ArrayList<>();

    /* renamed from: b */
    public boolean f350073b;

    /* renamed from: c */
    public String f350074c;

    /* renamed from: d */
    public long f350075d;

    /* renamed from: e */
    public boolean f350076e;

    /* renamed from: f */
    public int f350077f = 0;

    /* renamed from: g */
    public int f350078g = 0;

    /* renamed from: h */
    public long f350079h = 0;

    /* renamed from: i */
    public boolean f350080i = false;

    /* renamed from: j */
    public C116767a f350081j;

    /* renamed from: k */
    public String f350082k;

    /* renamed from: l */
    public String f350083l;

    /* renamed from: m */
    public int f350084m = 44100;

    /* renamed from: n */
    public int f350085n = 2;

    /* renamed from: o */
    public int f350086o = 2;

    public C116768d(String str) {
        this.f350074c = str;
    }

    /* renamed from: a */
    public void mo180735a() {
        this.f350073b = true;
        this.f350078g = mo180745k();
        Object[] objArr = {this.f350074c};
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.PcmBufferProvider", "src:%s is complete cache", objArr);
    }

    /* renamed from: b */
    public void mo180736b() {
        C116767a aVar = this.f350081j;
        if (aVar != null) {
            aVar.mo180733a();
            C116767a aVar2 = this.f350081j;
            aVar2.getClass();
            int i = C11412b.f33577a;
            Log.m105925i("MicroMsg.Mix.AudioPcmCacheFile", "deleteFile", (Object[]) null);
            String str = aVar2.f350071c;
            Log.m105925i("MicroMsg.Mix.AudioPcmCacheFile", "deleteFile, fileName:" + str, (Object[]) null);
            C86009m1 m1Var = new C86009m1(str);
            if (m1Var.mo119967g()) {
                Log.m105925i("MicroMsg.Mix.AudioPcmCacheFile", "delete the piece File", (Object[]) null);
                m1Var.mo119966f();
            } else {
                Log.m105921e("MicroMsg.Mix.AudioPcmCacheFile", "file not exist, delete piece File fail", (Object[]) null);
            }
            this.f350081j = null;
        }
    }

    /* renamed from: c */
    public long mo180737c() {
        long j = this.f350079h;
        if (j > 0) {
            return j;
        }
        long k = (long) (mo180745k() * 3536);
        this.f350079h = k;
        return k;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0112  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo180738d() {
        /*
            r10 = this;
            eh.a r0 = r10.f350081j
            if (r0 != 0) goto L_0x0129
            eh.a r0 = new eh.a
            java.lang.String r1 = r10.f350082k
            java.lang.String r2 = r10.f350074c
            r0.<init>(r1, r2)
            r10.f350081j = r0
            boolean r1 = r10.f350080i
            java.lang.String r2 = "create RandomAccessFile file  %s  success"
            int r3 = p213oh.C11412b.f33577a
            java.lang.String r3 = "MicroMsg.Mix.AudioPcmCacheFile"
            java.lang.String r4 = "open"
            r5 = 0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r5)
            r4 = 1
            r6 = 0
            com.tencent.mm.vfs.m1 r7 = new com.tencent.mm.vfs.m1     // Catch:{ FileNotFoundException -> 0x0074, IOException -> 0x0060 }
            java.lang.String r8 = r0.f350071c     // Catch:{ FileNotFoundException -> 0x0074, IOException -> 0x0060 }
            r7.<init>((java.lang.String) r8)     // Catch:{ FileNotFoundException -> 0x0074, IOException -> 0x0060 }
            boolean r8 = r7.mo119967g()     // Catch:{ FileNotFoundException -> 0x0074, IOException -> 0x0060 }
            if (r8 != 0) goto L_0x003e
            boolean r1 = r7.mo119964e()     // Catch:{ FileNotFoundException -> 0x0074, IOException -> 0x0060 }
            java.lang.String r8 = "create file:%b"
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ FileNotFoundException -> 0x0074, IOException -> 0x0060 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ FileNotFoundException -> 0x0074, IOException -> 0x0060 }
            r9[r6] = r1     // Catch:{ FileNotFoundException -> 0x0074, IOException -> 0x0060 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r8, r9)     // Catch:{ FileNotFoundException -> 0x0074, IOException -> 0x0060 }
            goto L_0x0048
        L_0x003e:
            if (r1 != 0) goto L_0x0048
            java.lang.String r1 = "delete"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r1, r5)     // Catch:{ FileNotFoundException -> 0x0074, IOException -> 0x0060 }
            r7.mo119966f()     // Catch:{ FileNotFoundException -> 0x0074, IOException -> 0x0060 }
        L_0x0048:
            java.lang.String r1 = r7.mo119976n()     // Catch:{ FileNotFoundException -> 0x0074, IOException -> 0x0060 }
            java.io.RandomAccessFile r1 = com.tencent.p014mm.vfs.C86013q1.m106420B(r1, r4)     // Catch:{ FileNotFoundException -> 0x0074, IOException -> 0x0060 }
            r0.f350069a = r1     // Catch:{ FileNotFoundException -> 0x0074, IOException -> 0x0060 }
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = r0.f350071c
            r1[r6] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r2, r1)
            r0 = 1
            goto L_0x0088
        L_0x005d:
            r1 = move-exception
            goto L_0x011f
        L_0x0060:
            r1 = move-exception
            java.lang.String r7 = "io "
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ all -> 0x005d }
            r8[r6] = r1     // Catch:{ all -> 0x005d }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r7, r8)     // Catch:{ all -> 0x005d }
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = r0.f350071c
            r1[r6] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r2, r1)
            goto L_0x0087
        L_0x0074:
            r1 = move-exception
            java.lang.String r7 = "file not found"
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ all -> 0x005d }
            r8[r6] = r1     // Catch:{ all -> 0x005d }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r7, r8)     // Catch:{ all -> 0x005d }
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = r0.f350071c
            r1[r6] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r2, r1)
        L_0x0087:
            r0 = 0
        L_0x0088:
            if (r0 == 0) goto L_0x0112
            java.lang.String r0 = "MicroMsg.Mix.PcmBufferProvider"
            java.lang.String r1 = "openCacheFile success"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r5)
            eh.a r0 = r10.f350081j
            long r1 = r10.mo180737c()
            monitor-enter(r0)
            java.io.RandomAccessFile r3 = r0.f350069a     // Catch:{ all -> 0x010f }
            if (r3 != 0) goto L_0x00a8
            java.lang.String r1 = "MicroMsg.Mix.AudioPcmCacheFile"
            java.lang.String r2 = "setLength error, randomAccessFile is null"
            int r3 = p213oh.C11412b.f33577a     // Catch:{ all -> 0x010f }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r2, r5)     // Catch:{ all -> 0x010f }
            monitor-exit(r0)
            goto L_0x0129
        L_0x00a8:
            r7 = 0
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 > 0) goto L_0x00c8
            java.lang.String r3 = "MicroMsg.Mix.AudioPcmCacheFile"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x010f }
            r4.<init>()     // Catch:{ all -> 0x010f }
            java.lang.String r6 = "setLength error, length is "
            r4.append(r6)     // Catch:{ all -> 0x010f }
            r4.append(r1)     // Catch:{ all -> 0x010f }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x010f }
            int r2 = p213oh.C11412b.f33577a     // Catch:{ all -> 0x010f }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r1, r5)     // Catch:{ all -> 0x010f }
            monitor-exit(r0)
            goto L_0x0129
        L_0x00c8:
            java.lang.String r3 = "MicroMsg.Mix.AudioPcmCacheFile"
            java.lang.String r5 = "set file length %s "
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ all -> 0x010f }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x010f }
            r8.<init>()     // Catch:{ all -> 0x010f }
            java.lang.String r9 = ""
            r8.append(r9)     // Catch:{ all -> 0x010f }
            r8.append(r1)     // Catch:{ all -> 0x010f }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x010f }
            r7[r6] = r8     // Catch:{ all -> 0x010f }
            int r8 = p213oh.C11412b.f33577a     // Catch:{ all -> 0x010f }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r5, r7)     // Catch:{ all -> 0x010f }
            java.io.RandomAccessFile r3 = r0.f350069a     // Catch:{ IOException -> 0x00ec }
            r3.setLength(r1)     // Catch:{ IOException -> 0x00ec }
            goto L_0x010d
        L_0x00ec:
            r1 = move-exception
            java.lang.String r2 = "MicroMsg.Mix.AudioPcmCacheFile"
            java.lang.String r3 = "Error set length of file, err %s"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x010f }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x010f }
            r5.<init>()     // Catch:{ all -> 0x010f }
            java.lang.String r7 = ""
            r5.append(r7)     // Catch:{ all -> 0x010f }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x010f }
            r5.append(r1)     // Catch:{ all -> 0x010f }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x010f }
            r4[r6] = r1     // Catch:{ all -> 0x010f }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r3, r4)     // Catch:{ all -> 0x010f }
        L_0x010d:
            monitor-exit(r0)
            goto L_0x0129
        L_0x010f:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0112:
            java.lang.String r0 = "MicroMsg.Mix.PcmBufferProvider"
            java.lang.String r1 = "openCacheFile fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r5)
            r10.f350080i = r6
            r10.mo180736b()
            goto L_0x0129
        L_0x011f:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r0 = r0.f350071c
            r4[r6] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r2, r4)
            throw r1
        L_0x0129:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p335eh.C116768d.mo180738d():void");
    }

    /* renamed from: e */
    public C107275e mo180739e(int i) {
        boolean z = this.f350080i;
        if (z && this.f350081j != null) {
            return mo180740f(i);
        }
        if (!z || this.f350081j != null) {
            ArrayList<C107275e> arrayList = this.f350072a;
            if (arrayList == null || arrayList.size() == 0 || i >= this.f350072a.size()) {
                return null;
            }
            return this.f350072a.get(i);
        }
        synchronized (this) {
            mo180738d();
        }
        return mo180740f(i);
    }

    /* renamed from: f */
    public C107275e mo180740f(int i) {
        C116767a aVar;
        int i2;
        C107275e b;
        if (i >= this.f350078g || (aVar = this.f350081j) == null || (i2 = i * 3536) > aVar.mo180734b() || (b = C116867h.m164840a().mo180850b()) == null) {
            return null;
        }
        byte[] bArr = b.f320943f;
        int i3 = 0;
        if (bArr == null) {
            b.f320943f = new byte[3536];
        } else {
            Arrays.fill(bArr, 0, bArr.length, (byte) 0);
        }
        System.nanoTime();
        byte[] bArr2 = b.f320943f;
        long j = (long) i2;
        int length = bArr2.length;
        C116767a aVar2 = this.f350081j;
        if (aVar2 != null) {
            synchronized (aVar2) {
                if (length == 0) {
                    int i4 = C11412b.f33577a;
                    Log.m105921e("MicroMsg.Mix.AudioPcmCacheFile", "read error, length == 0", (Object[]) null);
                } else {
                    RandomAccessFile randomAccessFile = aVar2.f350069a;
                    if (randomAccessFile == null) {
                        int i5 = C11412b.f33577a;
                        Log.m105921e("MicroMsg.Mix.AudioPcmCacheFile", "read error, randomAccessFile is null", (Object[]) null);
                    } else {
                        try {
                            randomAccessFile.seek(j);
                            int read = aVar2.f350069a.read(bArr2, 0, length);
                            i3 = read;
                        } catch (IOException unused) {
                            String format = String.format("Error reading %d bytes with offset %d from file[%d bytes] to buffer[%d bytes]", new Object[]{Integer.valueOf(length), Long.valueOf(j), Integer.valueOf(aVar2.mo180734b()), Integer.valueOf(bArr2.length)});
                            int i6 = C11412b.f33577a;
                            Log.m105921e("MicroMsg.Mix.AudioPcmCacheFile", format, (Object[]) null);
                        }
                    }
                }
                i3 = -1;
            }
        }
        if (i3 <= 0) {
            C116867h.m164840a().mo180851c(b);
            return null;
        }
        b.f320938a = this.f350083l;
        b.f320939b = this.f350084m;
        b.f320940c = this.f350085n;
        b.f320941d = this.f350086o;
        b.f320942e = (long) (i * 20);
        return b;
    }

    /* renamed from: g */
    public synchronized void mo180741g() {
        int size = this.f350072a.size();
        for (int i = size - 1; i >= 0; i--) {
            C107275e remove = this.f350072a.remove(i);
            if (remove != null) {
                C116868i a = C116868i.m164843a();
                a.getClass();
                if (remove.f320943f != null) {
                    remove.mo157747a();
                    synchronized (a.f350292b) {
                        a.f350291a.add(0, remove);
                    }
                }
            }
        }
        mo180743i(size);
    }

    /* renamed from: h */
    public synchronized void mo180742h() {
        int size = this.f350072a.size();
        for (int i = size - 1; i >= 0; i--) {
            C107275e remove = this.f350072a.remove(i);
            if (remove != null) {
                remove.f320938a = null;
                remove.f320943f = null;
            }
        }
        mo180743i(size);
    }

    /* renamed from: i */
    public final void mo180743i(int i) {
        Object[] objArr = {this.f350074c, Integer.valueOf(i), Boolean.valueOf(this.f350073b), Long.valueOf(this.f350075d), Boolean.valueOf(this.f350076e), Long.valueOf(this.f350079h)};
        int i2 = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.PcmBufferProvider", "resetProvider src:%s, size:%d, complete:%b, duration:%d, supportMixPlay:%b, bufferSize:%d", objArr);
        this.f350072a.clear();
        this.f350073b = false;
        this.f350075d = 0;
        this.f350076e = false;
        this.f350077f = 0;
        this.f350079h = 0;
        this.f350080i = false;
        mo180736b();
    }

    /* renamed from: j */
    public synchronized boolean mo180744j(String str) {
        if (this.f350080i) {
            Object[] objArr = {this.f350074c};
            int i = C11412b.f33577a;
            Log.m105925i("MicroMsg.Mix.PcmBufferProvider", "cache to file has finish, file:%s", objArr);
            return true;
        }
        this.f350082k = str;
        int size = this.f350072a.size();
        if (size > 0) {
            mo180738d();
        }
        if (this.f350081j == null) {
            int i2 = C11412b.f33577a;
            Log.m105921e("MicroMsg.Mix.PcmBufferProvider", "cacheFile is null", (Object[]) null);
            this.f350080i = false;
            return false;
        }
        for (int i3 = 0; i3 < size; i3++) {
            C107275e eVar = this.f350072a.get(i3);
            if (i3 == 0) {
                this.f350083l = eVar.f320938a;
                this.f350084m = eVar.f320939b;
                this.f350086o = eVar.f320941d;
                this.f350085n = eVar.f320940c;
            }
            if (eVar != null) {
                byte[] bArr = eVar.f320943f;
                if (!mo180746l(bArr, (long) (i3 * 3536), bArr.length)) {
                    mo180736b();
                    int i4 = C11412b.f33577a;
                    Log.m105921e("MicroMsg.Mix.PcmBufferProvider", "setCacheToFile fail", (Object[]) null);
                    this.f350080i = false;
                    return false;
                }
            }
        }
        this.f350080i = true;
        for (int i5 = size - 1; i5 >= 0; i5--) {
            C107275e remove = this.f350072a.remove(i5);
            if (remove != null) {
                C116868i a = C116868i.m164843a();
                a.getClass();
                if (remove.f320943f != null) {
                    remove.mo157747a();
                    synchronized (a.f350292b) {
                        a.f350291a.add(0, remove);
                    }
                }
            }
        }
        Object[] objArr2 = {this.f350074c};
        int i6 = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.PcmBufferProvider", "setCacheToFile finish, src:%s", objArr2);
        return true;
    }

    /* renamed from: k */
    public int mo180745k() {
        int i = this.f350078g;
        return (i <= 0 || !this.f350073b) ? this.f350072a.size() : i;
    }

    /* renamed from: l */
    public boolean mo180746l(byte[] bArr, long j, int i) {
        C116767a aVar = this.f350081j;
        if (aVar == null) {
            return false;
        }
        synchronized (aVar) {
            if (i == 0) {
                int i2 = C11412b.f33577a;
                Log.m105921e("MicroMsg.Mix.AudioPcmCacheFile", "write error, length == 0", (Object[]) null);
                return false;
            }
            RandomAccessFile randomAccessFile = aVar.f350069a;
            if (randomAccessFile == null) {
                int i3 = C11412b.f33577a;
                Log.m105921e("MicroMsg.Mix.AudioPcmCacheFile", "write error, randomAccessFile is null", (Object[]) null);
                return false;
            }
            try {
                randomAccessFile.seek(j);
                aVar.f350069a.write(bArr, 0, i);
                return true;
            } catch (IOException unused) {
                String format = String.format("Error writing %d bytes to from buffer with size %d", new Object[]{Integer.valueOf(i), Integer.valueOf(bArr.length)});
                int i4 = C11412b.f33577a;
                Log.m105921e("MicroMsg.Mix.AudioPcmCacheFile", format, (Object[]) null);
                return false;
            }
        }
    }

    /* renamed from: m */
    public void mo180747m(C107275e eVar) {
        int i = this.f350077f + 1;
        this.f350077f = i;
        eVar.f320942e = (long) (i * 20);
        ArrayList<C107275e> arrayList = this.f350072a;
        if (arrayList != null) {
            arrayList.add(eVar);
        }
    }
}
