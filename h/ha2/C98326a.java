package ha2;

import com.tencent.p014mm.sdk.platformtools.Log;
import xa2.C102583a;

/* renamed from: ha2.a */
public class C98326a {

    /* renamed from: a */
    public C102583a f288211a;

    /* renamed from: b */
    public C98328d f288212b;

    /* renamed from: c */
    public C98330i f288213c;

    /* renamed from: d */
    public byte[] f288214d = new byte[81920];

    /* renamed from: e */
    public int f288215e = -1;

    /* renamed from: f */
    public int f288216f = 0;

    /* renamed from: g */
    public int f288217g = -1;

    /* renamed from: h */
    public int f288218h = 0;

    public C98326a(C102583a aVar) {
        this.f288211a = aVar;
    }

    /* renamed from: a */
    public final synchronized void mo137631a(byte[] bArr, int i, int i2) {
        int i3 = i - this.f288215e;
        this.f288216f = i3 + i2;
        System.arraycopy(bArr, 0, this.f288214d, i3, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0083  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo137632b() {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.f288215e     // Catch:{ all -> 0x00c6 }
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 < 0) goto L_0x00ad
            int r4 = r8.f288216f     // Catch:{ all -> 0x00c6 }
            if (r4 > 0) goto L_0x000e
            goto L_0x00ad
        L_0x000e:
            byte[] r0 = new byte[r4]     // Catch:{ all -> 0x00c6 }
            byte[] r5 = r8.f288214d     // Catch:{ all -> 0x00c6 }
            java.lang.System.arraycopy(r5, r2, r0, r2, r4)     // Catch:{ all -> 0x00c6 }
            ha2.i r4 = r8.f288213c     // Catch:{ all -> 0x00c6 }
            int r5 = r8.f288215e     // Catch:{ all -> 0x00c6 }
            long r5 = (long) r5     // Catch:{ all -> 0x00c6 }
            int r7 = r8.f288216f     // Catch:{ all -> 0x00c6 }
            r4.mo137662e(r0, r5, r7)     // Catch:{ all -> 0x00c6 }
            ha2.d r0 = r8.f288212b     // Catch:{ all -> 0x00c6 }
            int r4 = r8.f288215e     // Catch:{ all -> 0x00c6 }
            int r5 = r8.f288216f     // Catch:{ all -> 0x00c6 }
            int[] r0 = r0.mo137658c(r4, r5)     // Catch:{ all -> 0x00c6 }
            if (r0 != 0) goto L_0x0034
            java.lang.String r0 = "MicroMsg.Music.FileBytesCacheMgr"
            java.lang.String r1 = "flushBufferAll, range is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)     // Catch:{ all -> 0x00c6 }
            monitor-exit(r8)
            return r2
        L_0x0034:
            r4 = r0[r2]     // Catch:{ all -> 0x00c6 }
            r5 = -1
            if (r4 == r5) goto L_0x0094
            r6 = r0[r3]     // Catch:{ all -> 0x00c6 }
            if (r6 != r5) goto L_0x003e
            goto L_0x0094
        L_0x003e:
            r1 = r0[r3]     // Catch:{ all -> 0x00c6 }
            if (r4 > r1) goto L_0x004c
            ha2.d r1 = r8.f288212b     // Catch:{ all -> 0x00c6 }
            java.util.BitSet r1 = r1.f288219a     // Catch:{ all -> 0x00c6 }
            r1.set(r4)     // Catch:{ all -> 0x00c6 }
            int r4 = r4 + 1
            goto L_0x003e
        L_0x004c:
            r1 = r0[r2]     // Catch:{ all -> 0x00c6 }
            if (r1 > 0) goto L_0x0051
            goto L_0x0080
        L_0x0051:
            int r1 = r1 + r5
            ha2.d r4 = r8.f288212b     // Catch:{ all -> 0x00c6 }
            java.util.BitSet r4 = r4.f288219a     // Catch:{ all -> 0x00c6 }
            boolean r4 = r4.get(r1)     // Catch:{ all -> 0x00c6 }
            if (r4 == 0) goto L_0x005d
            goto L_0x0080
        L_0x005d:
            int r4 = r8.f288217g     // Catch:{ all -> 0x00c6 }
            int r5 = r8.f288218h     // Catch:{ all -> 0x00c6 }
            int r4 = r4 + r5
            int r6 = r8.f288215e     // Catch:{ all -> 0x00c6 }
            if (r4 != r6) goto L_0x0080
            int r4 = r8.f288216f     // Catch:{ all -> 0x00c6 }
            if (r4 <= 0) goto L_0x0080
            r4 = 8192(0x2000, float:1.14794E-41)
            if (r5 < r4) goto L_0x0080
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x00c6 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x00c6 }
            r4[r2] = r1     // Catch:{ all -> 0x00c6 }
            java.lang.String r1 = "MicroMsg.Music.FileBytesCacheMgr"
            java.lang.String r5 = "isCanSavePreviousIndex, save index :%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r5, r4)     // Catch:{ all -> 0x00c6 }
            r1 = 1
            goto L_0x0081
        L_0x0080:
            r1 = 0
        L_0x0081:
            if (r1 == 0) goto L_0x008d
            ha2.d r1 = r8.f288212b     // Catch:{ all -> 0x00c6 }
            r0 = r0[r2]     // Catch:{ all -> 0x00c6 }
            int r0 = r0 - r3
            java.util.BitSet r1 = r1.f288219a     // Catch:{ all -> 0x00c6 }
            r1.set(r0)     // Catch:{ all -> 0x00c6 }
        L_0x008d:
            ha2.d r0 = r8.f288212b     // Catch:{ all -> 0x00c6 }
            r0.mo137659d()     // Catch:{ all -> 0x00c6 }
            monitor-exit(r8)
            return r3
        L_0x0094:
            java.lang.String r5 = "MicroMsg.Music.FileBytesCacheMgr"
            java.lang.String r6 = "flushBufferAll range[0]:%d, range[1]:%d"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00c6 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x00c6 }
            r1[r2] = r4     // Catch:{ all -> 0x00c6 }
            r0 = r0[r3]     // Catch:{ all -> 0x00c6 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00c6 }
            r1[r3] = r0     // Catch:{ all -> 0x00c6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r6, r1)     // Catch:{ all -> 0x00c6 }
            monitor-exit(r8)
            return r2
        L_0x00ad:
            java.lang.String r4 = "MicroMsg.Music.FileBytesCacheMgr"
            java.lang.String r5 = "flushBufferAll(), mOffset:%d, mSize:%d"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00c6 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00c6 }
            r1[r2] = r0     // Catch:{ all -> 0x00c6 }
            int r0 = r8.f288216f     // Catch:{ all -> 0x00c6 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00c6 }
            r1[r3] = r0     // Catch:{ all -> 0x00c6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r5, r1)     // Catch:{ all -> 0x00c6 }
            monitor-exit(r8)
            return r2
        L_0x00c6:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ha2.C98326a.mo137632b():boolean");
    }

    /* renamed from: c */
    public long mo137633c() {
        return this.f288211a.getSize();
    }

    /* renamed from: d */
    public final synchronized boolean mo137634d(int i) {
        int i2;
        i2 = this.f288215e;
        return i2 <= i && i <= i2 + this.f288216f;
    }

    /* renamed from: e */
    public final synchronized boolean mo137635e(int i) {
        int i2;
        i2 = this.f288215e;
        return i2 <= i && i <= i2 + 81920;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0134 A[RETURN] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo137636f(byte[] r17, int r18, int r19) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            r3 = 1
            r4 = -1
            r5 = 0
            r6 = 2
            if (r0 == 0) goto L_0x0135
            if (r2 < 0) goto L_0x0135
            if (r19 >= 0) goto L_0x0012
            goto L_0x0135
        L_0x0012:
            long r7 = r16.mo137633c()
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 > 0) goto L_0x0038
            java.lang.String r0 = "MicroMsg.Music.FileBytesCacheMgr"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "read(), fileLength is error, file length is "
            r2.append(r3)
            long r5 = r16.mo137633c()
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
            return r4
        L_0x0038:
            int r7 = r2 + r19
            long r8 = (long) r7
            long r10 = r16.mo137633c()
            r12 = 3
            int r13 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r13 <= 0) goto L_0x006c
            java.lang.String r8 = "MicroMsg.Music.FileBytesCacheMgr"
            java.lang.String r9 = "read() endOffset is error,  startOffset %d, endOffset:%d, file length:%d "
            java.lang.Object[] r10 = new java.lang.Object[r12]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r18)
            r10[r5] = r11
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10[r3] = r7
            long r13 = r16.mo137633c()
            java.lang.Long r7 = java.lang.Long.valueOf(r13)
            r10[r6] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r9, r10)
            long r7 = r16.mo137633c()
            int r8 = (int) r7
            int r7 = r8 - r2
            goto L_0x006e
        L_0x006c:
            r7 = r19
        L_0x006e:
            ha2.d r8 = r1.f288212b
            r8.getClass()
            java.lang.String r9 = "MicroMsg.Music.IndexBitMgr"
            if (r2 < 0) goto L_0x00b0
            if (r7 < 0) goto L_0x00b0
            long r10 = (long) r2
            long r13 = r8.f288220b
            int r15 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r15 > 0) goto L_0x00b0
            int r10 = r2 + r7
            r19 = r7
            long r6 = (long) r10
            int r15 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r15 <= 0) goto L_0x008a
            goto L_0x00b2
        L_0x008a:
            int r6 = r8.mo137657b(r2)
            int r7 = r8.mo137657b(r10)
            r10 = r6
        L_0x0093:
            if (r10 > r7) goto L_0x00ae
            java.util.BitSet r13 = r8.f288219a
            boolean r13 = r13.get(r6)
            if (r13 != 0) goto L_0x00ab
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            r6[r5] = r7
            java.lang.String r7 = "index %d, indexBit 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r7, r6)
            goto L_0x00d3
        L_0x00ab:
            int r10 = r10 + 1
            goto L_0x0093
        L_0x00ae:
            r6 = 1
            goto L_0x00d4
        L_0x00b0:
            r19 = r7
        L_0x00b2:
            java.lang.Object[] r6 = new java.lang.Object[r12]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r18)
            r6[r5] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r19)
            r6[r3] = r7
            long r7 = r8.f288220b
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r8 = 2
            r6[r8] = r7
            java.lang.String r7 = "canReadFromCache offset %d, size %d, fileLength %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r7, r6)
            java.lang.String r6 = "canReadFromCache invalid parameter!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r6)
        L_0x00d3:
            r6 = 0
        L_0x00d4:
            if (r6 == 0) goto L_0x0134
            ha2.i r6 = r1.f288213c
            long r7 = (long) r2
            monitor-enter(r6)
            if (r19 != 0) goto L_0x00e6
            java.lang.String r0 = "MicroMsg.Music.PieceFileCache"
            java.lang.String r2 = "read error, length == 0"
            com.tencent.qqmusic.mediaplayer.util.Logger.m21787e((java.lang.String) r0, (java.lang.String) r2)     // Catch:{ all -> 0x0131 }
            monitor-exit(r6)
            goto L_0x0130
        L_0x00e6:
            java.io.RandomAccessFile r2 = r6.f288224a     // Catch:{ all -> 0x0131 }
            if (r2 != 0) goto L_0x00f4
            java.lang.String r0 = "MicroMsg.Music.PieceFileCache"
            java.lang.String r2 = "read error, randomAccessFile is null"
            com.tencent.qqmusic.mediaplayer.util.Logger.m21787e((java.lang.String) r0, (java.lang.String) r2)     // Catch:{ all -> 0x0131 }
            monitor-exit(r6)
            goto L_0x0130
        L_0x00f4:
            r2.seek(r7)     // Catch:{ IOException -> 0x0101 }
            java.io.RandomAccessFile r2 = r6.f288224a     // Catch:{ IOException -> 0x0101 }
            r9 = r19
            int r4 = r2.read(r0, r5, r9)     // Catch:{ IOException -> 0x0103 }
            monitor-exit(r6)
            goto L_0x0130
        L_0x0101:
            r9 = r19
        L_0x0103:
            java.lang.String r2 = "Error reading %d bytes with offset %d from file[%d bytes] to buffer[%d bytes]"
            java.lang.String r10 = "MicroMsg.Music.PieceFileCache"
            r13 = 4
            java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch:{ all -> 0x0131 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0131 }
            r13[r5] = r9     // Catch:{ all -> 0x0131 }
            java.lang.Long r5 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0131 }
            r13[r3] = r5     // Catch:{ all -> 0x0131 }
            int r3 = r6.mo137661d()     // Catch:{ all -> 0x0131 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0131 }
            r5 = 2
            r13[r5] = r3     // Catch:{ all -> 0x0131 }
            int r0 = r0.length     // Catch:{ all -> 0x0131 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0131 }
            r13[r12] = r0     // Catch:{ all -> 0x0131 }
            java.lang.String r0 = java.lang.String.format(r2, r13)     // Catch:{ all -> 0x0131 }
            com.tencent.qqmusic.mediaplayer.util.Logger.m21787e((java.lang.String) r10, (java.lang.String) r0)     // Catch:{ all -> 0x0131 }
            monitor-exit(r6)
        L_0x0130:
            return r4
        L_0x0131:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0134:
            return r4
        L_0x0135:
            java.lang.String r0 = "MicroMsg.Music.FileBytesCacheMgr"
            java.lang.String r6 = "read() params is invalid, offset:%d, size:%d"
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r18)
            r7[r5] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r19)
            r7[r3] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r6, r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ha2.C98326a.mo137636f(byte[], int, int):int");
    }

    /* renamed from: g */
    public final synchronized void mo137637g(int i) {
        this.f288217g = this.f288215e;
        this.f288218h = this.f288216f;
        this.f288215e = i;
        this.f288216f = 0;
    }

    /* renamed from: h */
    public int mo137638h(byte[] bArr, int i, int i2) {
        if (bArr == null || i < 0 || i2 < 0) {
            Log.m105921e("MicroMsg.Music.FileBytesCacheMgr", "write() params is invalid, offset:%d, size:%d", Integer.valueOf(i), Integer.valueOf(i2));
            return -1;
        } else if (mo137633c() <= 0) {
            Log.m105920e("MicroMsg.Music.FileBytesCacheMgr", "write() fileLength is error, file length is " + mo137633c());
            return -1;
        } else {
            int i3 = i + i2;
            long j = (long) i3;
            if (j > mo137633c()) {
                Log.m105921e("MicroMsg.Music.FileBytesCacheMgr", "write() endOffset is error, endOffset:%d, file length:%d", Integer.valueOf(i3), Long.valueOf(mo137633c()));
                return -1;
            }
            if (!mo137635e(i) || !mo137635e(i3)) {
                if (!mo137635e(i) || mo137635e(i3) || !mo137634d(i)) {
                    mo137632b();
                    mo137637g(i);
                    mo137631a(bArr, i, i2);
                } else {
                    int i4 = 81920 - this.f288216f;
                    int i5 = i2 - i4;
                    if (i4 > 0) {
                        mo137631a(bArr, i, i4);
                    }
                    mo137632b();
                    int i6 = i + i4;
                    mo137637g(i6);
                    if (i5 > 0) {
                        synchronized (this) {
                            int i7 = i6 - this.f288215e;
                            this.f288216f = i7 + i5;
                            System.arraycopy(bArr, i4, this.f288214d, i7, i5);
                        }
                    }
                }
            } else if (!mo137634d(i) || !mo137634d(i3)) {
                if (mo137634d(i)) {
                    mo137631a(bArr, i, i2);
                    if (this.f288216f == 81920) {
                        mo137632b();
                        mo137637g(i3);
                    }
                } else {
                    mo137632b();
                    mo137637g(i);
                    mo137631a(bArr, i, i2);
                }
            }
            if (j == mo137633c()) {
                mo137632b();
                mo137637g(i3);
            }
            return 1;
        }
    }
}
