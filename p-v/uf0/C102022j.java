package uf0;

import android.util.Pair;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/* renamed from: uf0.j */
public class C102022j implements C65339f {

    /* renamed from: a */
    public String f300424a;

    /* renamed from: b */
    public long f300425b;

    /* renamed from: c */
    public long f300426c;

    /* renamed from: d */
    public long f300427d;

    /* renamed from: e */
    public long[] f300428e;

    /* renamed from: f */
    public int f300429f;

    /* renamed from: g */
    public List<C102024m> f300430g;

    /* renamed from: h */
    public List<Pair> f300431h;

    /* renamed from: i */
    public int f300432i = 0;

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006f A[Catch:{ Exception -> 0x011e, all -> 0x00d8 }] */
    /* renamed from: a */
    public boolean mo89446a(java.lang.String r13, long r14) {
        /*
            r12 = this;
            java.lang.String r0 = "start to find trak atom."
            java.lang.String r1 = "MicroMsg.Mp4Parser"
            java.lang.String r2 = ""
            r12.mo141523h()
            r12.f300424a = r13
            r12.f300425b = r14
            android.net.Uri r13 = com.tencent.p014mm.vfs.C116299g2.m163858n(r13)
            java.lang.String r14 = r13.getPath()
            r15 = 0
            if (r14 == 0) goto L_0x0033
            java.lang.String r14 = com.tencent.p014mm.vfs.C116299g2.m163855k(r14, r15, r15)
            java.lang.String r3 = r13.getPath()
            boolean r3 = r3.equals(r14)
            if (r3 != 0) goto L_0x0033
            android.net.Uri$Builder r13 = r13.buildUpon()
            android.net.Uri$Builder r13 = r13.path(r14)
            android.net.Uri r13 = r13.build()
        L_0x0033:
            com.tencent.mm.vfs.f0 r14 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r3 = 0
            com.tencent.mm.vfs.f0$h r13 = r14.mo177799l(r13, r3)
            boolean r14 = r13.mo177810a()
            if (r14 != 0) goto L_0x0042
            r13 = 0
            goto L_0x004a
        L_0x0042:
            com.tencent.mm.vfs.FileSystem$c r14 = r13.f348991a
            java.lang.String r13 = r13.f348992b
            boolean r13 = r14.mo119948x(r13)
        L_0x004a:
            if (r13 != 0) goto L_0x004d
            return r15
        L_0x004d:
            r13 = 8
            byte[] r13 = new byte[r13]     // Catch:{ Exception -> 0x0123 }
            java.lang.String r14 = r12.f300424a     // Catch:{ Exception -> 0x0123 }
            java.io.RandomAccessFile r14 = com.tencent.p014mm.vfs.C86013q1.m106420B(r14, r15)     // Catch:{ Exception -> 0x0123 }
            long r4 = r12.f300425b     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            boolean r4 = uf0.C102016c.m134346h(r14, r4)     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            if (r4 != 0) goto L_0x0064
            goto L_0x0110
        L_0x0064:
            int r4 = uf0.C102014a.f300378h     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            uf0.a r4 = uf0.C102016c.m134340b(r14, r13, r4)     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            uf0.o r4 = (uf0.C102026o) r4     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
        L_0x006c:
            r5 = 1
            if (r4 == 0) goto L_0x0113
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            r6.<init>()     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            java.lang.String r7 = "last trak atom file pos : "
            r6.append(r7)     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            long r7 = r4.f300396d     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            r6.append(r7)     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r6)     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            int r6 = uf0.C102014a.f300379i     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            uf0.a r6 = uf0.C102016c.m134340b(r14, r13, r6)     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            uf0.g r6 = (uf0.C102018g) r6     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            if (r6 == 0) goto L_0x010a
            boolean r7 = r6.mo141513b(r14, r13)     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            if (r7 == 0) goto L_0x010a
            long r7 = r6.f300406y     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            int r9 = uf0.C102018g.f300402A     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            long r9 = (long) r9     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x00a1
            r7 = 1
            goto L_0x00a2
        L_0x00a1:
            r7 = 0
        L_0x00a2:
            if (r7 != 0) goto L_0x00db
            long r5 = r4.f300396d     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            long r7 = r4.mo141508a()     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            long r5 = r5 + r7
            long r7 = r14.getFilePointer()     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            long r5 = r5 - r7
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            r4.<init>()     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            java.lang.String r7 = "this trak atom is not video trak skip: "
            r4.append(r7)     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            r4.append(r5)     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r4)     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            boolean r4 = uf0.C102016c.m134346h(r14, r5)     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            if (r4 != 0) goto L_0x00cf
            goto L_0x0110
        L_0x00cf:
            int r4 = uf0.C102014a.f300378h     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            uf0.a r4 = uf0.C102016c.m134340b(r14, r13, r4)     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            uf0.o r4 = (uf0.C102026o) r4     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            goto L_0x006c
        L_0x00d8:
            r13 = move-exception
            goto L_0x0150
        L_0x00db:
            long r3 = r6.f300404w     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            r12.f300426c = r3     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            long r3 = r6.f300405x     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            r12.f300427d = r3     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            r0.<init>()     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            java.lang.String r3 = "this trak atom is video trak. timeScale: "
            r0.append(r3)     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            long r3 = r12.f300426c     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            r0.append(r3)     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            java.lang.String r3 = " duration: "
            r0.append(r3)     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            long r3 = r12.f300427d     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            r0.append(r3)     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            long r3 = r6.f300407z     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            r12.mo141522g(r14, r3, r13)     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
            goto L_0x0113
        L_0x010a:
            java.lang.String r4 = "mdia atom parser fail."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r4)     // Catch:{ Exception -> 0x011e, all -> 0x00d8 }
        L_0x0110:
            r4 = r3
            goto L_0x006c
        L_0x0113:
            r14.close()     // Catch:{ IOException -> 0x0117 }
            goto L_0x011d
        L_0x0117:
            r13 = move-exception
            java.lang.Object[] r14 = new java.lang.Object[r15]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r13, r2, r14)
        L_0x011d:
            return r5
        L_0x011e:
            r13 = move-exception
            r3 = r14
            goto L_0x0124
        L_0x0121:
            r13 = move-exception
            goto L_0x014f
        L_0x0123:
            r13 = move-exception
        L_0x0124:
            java.lang.Object[] r14 = new java.lang.Object[r15]     // Catch:{ all -> 0x0121 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r13, r2, r14)     // Catch:{ all -> 0x0121 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0121 }
            r14.<init>()     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = "parser mp4 error. e: "
            r14.append(r0)     // Catch:{ all -> 0x0121 }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x0121 }
            r14.append(r13)     // Catch:{ all -> 0x0121 }
            java.lang.String r13 = r14.toString()     // Catch:{ all -> 0x0121 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r13)     // Catch:{ all -> 0x0121 }
            if (r3 == 0) goto L_0x014e
            r3.close()     // Catch:{ IOException -> 0x0148 }
            goto L_0x014e
        L_0x0148:
            r13 = move-exception
            java.lang.Object[] r14 = new java.lang.Object[r15]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r13, r2, r14)
        L_0x014e:
            return r15
        L_0x014f:
            r14 = r3
        L_0x0150:
            if (r14 == 0) goto L_0x015c
            r14.close()     // Catch:{ IOException -> 0x0156 }
            goto L_0x015c
        L_0x0156:
            r14 = move-exception
            java.lang.Object[] r15 = new java.lang.Object[r15]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r14, r2, r15)
        L_0x015c:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: uf0.C102022j.mo89446a(java.lang.String, long):boolean");
    }

    /* renamed from: b */
    public int mo89447b() {
        return this.f300429f;
    }

    /* renamed from: c */
    public int mo89448c(int i, int i2) {
        int i3 = 0;
        if (this.f300428e == null) {
            return 0;
        }
        long j = (long) (i + i2);
        int i4 = 0;
        while (true) {
            long[] jArr = this.f300428e;
            if (i3 >= jArr.length) {
                break;
            }
            long j2 = jArr[i3];
            if (j2 == j) {
                return i3;
            }
            if (j2 < j) {
                i4 = i3;
            } else if (j2 > j) {
                break;
            }
            i3++;
        }
        return i4;
    }

    /* renamed from: d */
    public boolean mo89449d(int i, int i2, PInt pInt, PInt pInt2) {
        long[] jArr = this.f300428e;
        if (jArr == null) {
            return false;
        }
        if (i < 0) {
            i = 0;
        }
        int length = jArr.length;
        if (i >= length || i2 >= length) {
            i = length - 2;
            i2 = length - 1;
        }
        long j = jArr[i];
        long j2 = jArr[i2];
        if (i == 0) {
            pInt.value = 0;
            pInt2.value = (int) j2;
        } else {
            int i3 = (int) j;
            pInt.value = i3;
            pInt2.value = ((int) j2) - i3;
        }
        return true;
    }

    /* renamed from: e */
    public boolean mo89450e(int i, PInt pInt, PInt pInt2) {
        boolean z;
        int i2 = i;
        PInt pInt3 = pInt;
        PInt pInt4 = pInt2;
        try {
            List<Pair> list = this.f300431h;
            if (list == null) {
                return false;
            }
            int size = ((ArrayList) list).size();
            long j = ((long) i2) * 1000 * 1000;
            pInt4.value = 0;
            pInt3.value = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    z = false;
                    break;
                }
                Pair pair = (Pair) ((ArrayList) this.f300431h).get(i3);
                if (((Long) pair.second).longValue() > j) {
                    pInt4.value = (int) ((((Long) pair.second).longValue() / 1000) / 1000);
                    z = true;
                    break;
                }
                pInt3.value = (int) ((((Long) pair.second).longValue() / 1000) / 1000);
                i3++;
            }
            if (!z) {
                try {
                    pInt3.value = (int) ((((Long) ((Pair) ((ArrayList) this.f300431h).get(size - 1)).second).longValue() / 1000) / 1000);
                    pInt4.value = i2;
                    z = true;
                } catch (Exception e) {
                    e = e;
                    Log.printErrStackTrace("MicroMsg.Mp4Parser", e, "seekVFrame seekTime[%d]", Integer.valueOf(i));
                    Log.m105925i("MicroMsg.Mp4Parser", "seek key Frame seekTime[%d] pre[%d] next[%d]", Integer.valueOf(i), Integer.valueOf(pInt3.value), Integer.valueOf(pInt4.value));
                    return z;
                }
            }
            Log.m105925i("MicroMsg.Mp4Parser", "seek key Frame seekTime[%d] pre[%d] next[%d]", Integer.valueOf(i), Integer.valueOf(pInt3.value), Integer.valueOf(pInt4.value));
            return z;
        } catch (Exception e2) {
            e = e2;
            z = false;
            Log.printErrStackTrace("MicroMsg.Mp4Parser", e, "seekVFrame seekTime[%d]", Integer.valueOf(i));
            Log.m105925i("MicroMsg.Mp4Parser", "seek key Frame seekTime[%d] pre[%d] next[%d]", Integer.valueOf(i), Integer.valueOf(pInt3.value), Integer.valueOf(pInt4.value));
            return z;
        }
    }

    /* renamed from: f */
    public int mo89451f() {
        try {
            List<Pair> list = this.f300431h;
            if (list == null) {
                return 0;
            }
            if (this.f300432i == 0) {
                this.f300432i = (int) ((((Long) ((Pair) ((ArrayList) list).get(((ArrayList) list).size() - 1)).second).longValue() / 1000) / 1000);
            }
            return this.f300432i;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Mp4Parser", e, "get last key frame error.", new Object[0]);
            return 0;
        }
    }

    /* renamed from: g */
    public final void mo141522g(RandomAccessFile randomAccessFile, long j, byte[] bArr) {
        randomAccessFile.seek(j);
        C102025n nVar = (C102025n) C102016c.m134340b(randomAccessFile, bArr, C102014a.f300381k);
        if (nVar != null) {
            nVar.f300458x = this.f300427d;
            nVar.f300457w = this.f300426c;
            nVar.mo141538n(randomAccessFile);
            long[] jArr = nVar.f300442D;
            this.f300428e = jArr;
            this.f300429f = jArr.length - 2;
            this.f300430g = nVar.f300439A;
            this.f300431h = nVar.f300440B;
        }
    }

    /* renamed from: h */
    public void mo141523h() {
        this.f300424a = null;
        this.f300428e = null;
        this.f300429f = 0;
        long j = (long) 0;
        this.f300427d = j;
        this.f300426c = j;
        this.f300425b = j;
        List<C102024m> list = this.f300430g;
        if (list != null) {
            ((ArrayList) list).clear();
        }
        List<Pair> list2 = this.f300431h;
        if (list2 != null) {
            ((ArrayList) list2).clear();
        }
        this.f300432i = 0;
    }

    public void release() {
        mo141523h();
    }
}
