package uf0;

import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;

/* renamed from: uf0.e */
public class C90657e {

    /* renamed from: a */
    public static final int f260472a = m113640d(new byte[]{109, 100, 97, 116});

    /* renamed from: b */
    public static final int f260473b = m113640d(new byte[]{109, 111, 111, 118});

    /* renamed from: c */
    public static final int f260474c = m113640d(new byte[]{102, 116, 121, 112});

    /* renamed from: d */
    public static final int f260475d = m113640d(new byte[]{99, 109, 111, 118});

    /* renamed from: e */
    public static final int f260476e = m113640d(new byte[]{115, 116, 99, 111});

    /* renamed from: f */
    public static final int f260477f = m113640d(new byte[]{99, 111, 54, 52});

    static {
        m113640d(new byte[]{102, 114, 101, 101});
        m113640d(new byte[]{106, 117, 110, 107});
        m113640d(new byte[]{112, 110, 111, 116});
        m113640d(new byte[]{115, 107, 105, 112});
        m113640d(new byte[]{119, 105, 100, 101});
        m113640d(new byte[]{80, 73, 67, 84});
        m113640d(new byte[]{117, 117, 105, 100});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0059, code lost:
        r5 = r3.f348991a.mo119945q(r3.f348992b);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m113637a(java.lang.String r14, java.lang.String r15) {
        /*
            android.net.Uri r0 = com.tencent.p014mm.vfs.C116299g2.m163858n(r14)
            java.lang.String r1 = r0.getPath()
            r2 = 0
            if (r1 == 0) goto L_0x0025
            java.lang.String r1 = com.tencent.p014mm.vfs.C116299g2.m163855k(r1, r2, r2)
            java.lang.String r3 = r0.getPath()
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0025
            android.net.Uri$Builder r0 = r0.buildUpon()
            android.net.Uri$Builder r0 = r0.path(r1)
            android.net.Uri r0 = r0.build()
        L_0x0025:
            android.net.Uri r1 = com.tencent.p014mm.vfs.C116299g2.m163858n(r15)
            java.lang.String r3 = r1.getPath()
            if (r3 == 0) goto L_0x0049
            java.lang.String r3 = com.tencent.p014mm.vfs.C116299g2.m163855k(r3, r2, r2)
            java.lang.String r4 = r1.getPath()
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L_0x0049
            android.net.Uri$Builder r1 = r1.buildUpon()
            android.net.Uri$Builder r1 = r1.path(r3)
            android.net.Uri r1 = r1.build()
        L_0x0049:
            com.tencent.mm.vfs.f0 r3 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r4 = 0
            com.tencent.mm.vfs.f0$h r3 = r3.mo177799l(r0, r4)
            boolean r5 = r3.mo177810a()
            r6 = 0
            if (r5 != 0) goto L_0x0059
            goto L_0x0063
        L_0x0059:
            com.tencent.mm.vfs.FileSystem$c r5 = r3.f348991a
            java.lang.String r8 = r3.f348992b
            com.tencent.mm.vfs.b0 r5 = r5.mo119945q(r8)
            if (r5 != 0) goto L_0x0065
        L_0x0063:
            r8 = r6
            goto L_0x0067
        L_0x0065:
            long r8 = r5.f250473c
        L_0x0067:
            com.tencent.mm.vfs.f0 r5 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r5 = r5.mo177799l(r1, r4)
            boolean r10 = r5.mo177810a()
            if (r10 != 0) goto L_0x0074
            goto L_0x0081
        L_0x0074:
            com.tencent.mm.vfs.FileSystem$c r10 = r5.f348991a
            java.lang.String r11 = r5.f348992b
            com.tencent.mm.vfs.b0 r10 = r10.mo119945q(r11)
            if (r10 != 0) goto L_0x007f
            goto L_0x0081
        L_0x007f:
            long r6 = r10.f250473c
        L_0x0081:
            java.lang.String r10 = "MicroMsg.FastStart"
            int r11 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r11 == 0) goto L_0x008d
            java.lang.String r14 = "check size not right"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r14)
            return r2
        L_0x008d:
            uf0.b r6 = new uf0.b
            r6.<init>()
            long r6 = r6.mo141510a(r14)
            uf0.j r8 = new uf0.j
            r8.<init>()
            r8.mo89446a(r14, r6)
            int r14 = r8.f300429f
            uf0.b r6 = new uf0.b
            r6.<init>()
            long r6 = r6.mo141510a(r15)
            uf0.j r9 = new uf0.j
            r9.<init>()
            r9.mo89446a(r15, r6)
            int r15 = r9.f300429f
            if (r15 == r14) goto L_0x00bb
            java.lang.String r14 = "check duration not right"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r14)
            return r2
        L_0x00bb:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "old duration:"
            r6.append(r7)
            r6.append(r14)
            java.lang.String r14 = " new duration: "
            r6.append(r14)
            r6.append(r15)
            java.lang.String r14 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r14)
            java.util.Random r14 = new java.util.Random
            r14.<init>()
            int r6 = r15 + -1
            int r14 = r14.nextInt(r6)
            r6 = 1
            int r14 = r14 + r6
            int r7 = r14 + 1
            if (r7 <= r15) goto L_0x00e9
            goto L_0x00ea
        L_0x00e9:
            r15 = r7
        L_0x00ea:
            com.tencent.mm.pointers.PInt r7 = new com.tencent.mm.pointers.PInt
            r7.<init>()
            com.tencent.mm.pointers.PInt r11 = new com.tencent.mm.pointers.PInt
            r11.<init>()
            r8.mo89449d(r14, r15, r7, r11)
            com.tencent.mm.pointers.PInt r8 = new com.tencent.mm.pointers.PInt
            r8.<init>()
            com.tencent.mm.pointers.PInt r12 = new com.tencent.mm.pointers.PInt
            r12.<init>()
            r9.mo89449d(r14, r15, r8, r12)
            int r14 = r12.value
            int r15 = r11.value
            if (r14 == r15) goto L_0x0110
            java.lang.String r14 = "check len not right"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r14)
            return r2
        L_0x0110:
            com.tencent.mm.vfs.f0 r14 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x0162, all -> 0x015f }
            com.tencent.mm.vfs.f0$h r14 = r14.mo177799l(r0, r3)     // Catch:{ Exception -> 0x0162, all -> 0x015f }
            java.io.InputStream r14 = com.tencent.p014mm.vfs.C86013q1.m106421C(r0, r14)     // Catch:{ Exception -> 0x0162, all -> 0x015f }
            int r15 = r7.value     // Catch:{ Exception -> 0x015a, all -> 0x0155 }
            long r11 = (long) r15     // Catch:{ Exception -> 0x015a, all -> 0x0155 }
            r14.skip(r11)     // Catch:{ Exception -> 0x015a, all -> 0x0155 }
            r15 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r15]     // Catch:{ Exception -> 0x015a, all -> 0x0155 }
            r14.read(r0)     // Catch:{ Exception -> 0x015a, all -> 0x0155 }
            com.tencent.mm.vfs.f0 r3 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x015a, all -> 0x0155 }
            com.tencent.mm.vfs.f0$h r3 = r3.mo177799l(r1, r5)     // Catch:{ Exception -> 0x015a, all -> 0x0155 }
            java.io.InputStream r4 = com.tencent.p014mm.vfs.C86013q1.m106421C(r1, r3)     // Catch:{ Exception -> 0x015a, all -> 0x0155 }
            int r1 = r8.value     // Catch:{ Exception -> 0x015a, all -> 0x0155 }
            long r7 = (long) r1     // Catch:{ Exception -> 0x015a, all -> 0x0155 }
            r4.skip(r7)     // Catch:{ Exception -> 0x015a, all -> 0x0155 }
            byte[] r15 = new byte[r15]     // Catch:{ Exception -> 0x015a, all -> 0x0155 }
            r14.read(r15)     // Catch:{ Exception -> 0x015a, all -> 0x0155 }
            boolean r15 = java.util.Arrays.equals(r0, r15)     // Catch:{ Exception -> 0x015a, all -> 0x0155 }
            if (r15 == 0) goto L_0x014e
            java.lang.String r15 = "check data not right"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r15)     // Catch:{ Exception -> 0x015a, all -> 0x0155 }
            m113641e(r14)
            m113641e(r4)
            return r2
        L_0x014e:
            m113641e(r14)
            m113641e(r4)
            goto L_0x0186
        L_0x0155:
            r15 = move-exception
            r13 = r4
            r4 = r14
            r14 = r13
            goto L_0x0188
        L_0x015a:
            r15 = move-exception
            r13 = r4
            r4 = r14
            r14 = r13
            goto L_0x0168
        L_0x015f:
            r14 = move-exception
            r15 = r14
            goto L_0x0165
        L_0x0162:
            r14 = move-exception
            r15 = r14
            goto L_0x0167
        L_0x0165:
            r14 = r4
            goto L_0x0188
        L_0x0167:
            r14 = r4
        L_0x0168:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            r0.<init>()     // Catch:{ all -> 0x0187 }
            java.lang.String r1 = "fast start error: "
            r0.append(r1)     // Catch:{ all -> 0x0187 }
            java.lang.String r15 = r15.toString()     // Catch:{ all -> 0x0187 }
            r0.append(r15)     // Catch:{ all -> 0x0187 }
            java.lang.String r15 = r0.toString()     // Catch:{ all -> 0x0187 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r15)     // Catch:{ all -> 0x0187 }
            m113641e(r4)
            m113641e(r14)
        L_0x0186:
            return r6
        L_0x0187:
            r15 = move-exception
        L_0x0188:
            m113641e(r4)
            m113641e(r14)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: uf0.C90657e.m113637a(java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0077, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007b, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007e, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007f, code lost:
        r4 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0077 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:13:0x0056] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ab  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m113638b(java.lang.String r6, java.lang.String r7, com.tencent.p014mm.pointers.PInt r8) {
        /*
            android.net.Uri r0 = com.tencent.p014mm.vfs.C116299g2.m163858n(r6)
            java.lang.String r1 = r0.getPath()
            r2 = 0
            if (r1 == 0) goto L_0x0025
            java.lang.String r1 = com.tencent.p014mm.vfs.C116299g2.m163855k(r1, r2, r2)
            java.lang.String r3 = r0.getPath()
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0025
            android.net.Uri$Builder r0 = r0.buildUpon()
            android.net.Uri$Builder r0 = r0.path(r1)
            android.net.Uri r0 = r0.build()
        L_0x0025:
            android.net.Uri r1 = com.tencent.p014mm.vfs.C116299g2.m163858n(r7)
            java.lang.String r3 = r1.getPath()
            if (r3 == 0) goto L_0x0049
            java.lang.String r3 = com.tencent.p014mm.vfs.C116299g2.m163855k(r3, r2, r2)
            java.lang.String r4 = r1.getPath()
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L_0x0049
            android.net.Uri$Builder r1 = r1.buildUpon()
            android.net.Uri$Builder r1 = r1.path(r3)
            android.net.Uri r1 = r1.build()
        L_0x0049:
            r3 = 0
            com.tencent.mm.vfs.f0 r4 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x0085, all -> 0x0083 }
            com.tencent.mm.vfs.f0$h r4 = r4.mo177799l(r0, r3)     // Catch:{ Exception -> 0x0085, all -> 0x0083 }
            java.nio.channels.ReadableByteChannel r0 = com.tencent.p014mm.vfs.C86013q1.m106424F(r0, r4)     // Catch:{ Exception -> 0x0085, all -> 0x0083 }
            java.nio.channels.FileChannel r0 = (java.nio.channels.FileChannel) r0     // Catch:{ Exception -> 0x0085, all -> 0x0083 }
            com.tencent.mm.vfs.f0 r4 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x007e, all -> 0x0077 }
            com.tencent.mm.vfs.f0$h r4 = r4.mo177799l(r1, r3)     // Catch:{ Exception -> 0x007e, all -> 0x0077 }
            java.nio.channels.WritableByteChannel r5 = com.tencent.p014mm.vfs.C86013q1.m106430L(r1, r4, r2)     // Catch:{ Exception -> 0x0079, all -> 0x0077 }
            java.nio.channels.FileChannel r5 = (java.nio.channels.FileChannel) r5     // Catch:{ Exception -> 0x0079, all -> 0x0077 }
            boolean r2 = m113639c(r0, r5, r8)     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
            if (r2 == 0) goto L_0x006c
            boolean r2 = m113637a(r6, r7)     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
        L_0x006c:
            m113641e(r0)
        L_0x006f:
            m113641e(r5)
            goto L_0x00a9
        L_0x0073:
            r6 = move-exception
            goto L_0x007c
        L_0x0075:
            r6 = move-exception
            goto L_0x0081
        L_0x0077:
            r6 = move-exception
            goto L_0x007b
        L_0x0079:
            r6 = move-exception
            goto L_0x0080
        L_0x007b:
            r5 = r3
        L_0x007c:
            r3 = r0
            goto L_0x00c0
        L_0x007e:
            r6 = move-exception
            r4 = r3
        L_0x0080:
            r5 = r3
        L_0x0081:
            r3 = r0
            goto L_0x008b
        L_0x0083:
            r6 = move-exception
            goto L_0x0087
        L_0x0085:
            r6 = move-exception
            goto L_0x0089
        L_0x0087:
            r5 = r3
            goto L_0x00c0
        L_0x0089:
            r4 = r3
            r5 = r4
        L_0x008b:
            java.lang.String r7 = "MicroMsg.FastStart"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bf }
            r8.<init>()     // Catch:{ all -> 0x00bf }
            java.lang.String r0 = "fast start error: "
            r8.append(r0)     // Catch:{ all -> 0x00bf }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00bf }
            r8.append(r6)     // Catch:{ all -> 0x00bf }
            java.lang.String r6 = r8.toString()     // Catch:{ all -> 0x00bf }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r6)     // Catch:{ all -> 0x00bf }
            m113641e(r3)
            goto L_0x006f
        L_0x00a9:
            if (r2 != 0) goto L_0x00be
            com.tencent.mm.vfs.f0 r6 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r6 = r6.mo177799l(r1, r4)
            boolean r7 = r6.mo177810a()
            if (r7 == 0) goto L_0x00be
            com.tencent.mm.vfs.FileSystem$c r7 = r6.f348991a
            java.lang.String r6 = r6.f348992b
            r7.mo119933c(r6)
        L_0x00be:
            return r2
        L_0x00bf:
            r6 = move-exception
        L_0x00c0:
            m113641e(r3)
            m113641e(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: uf0.C90657e.m113638b(java.lang.String, java.lang.String, com.tencent.mm.pointers.PInt):boolean");
    }

    /* renamed from: c */
    public static boolean m113639c(FileChannel fileChannel, FileChannel fileChannel2, PInt pInt) {
        boolean z;
        String str;
        long j;
        ByteBuffer byteBuffer;
        FileChannel fileChannel3 = fileChannel;
        FileChannel fileChannel4 = fileChannel2;
        int i = 8;
        ByteBuffer order = ByteBuffer.allocate(8).order(ByteOrder.BIG_ENDIAN);
        boolean z2 = false;
        ByteBuffer byteBuffer2 = null;
        long j2 = 0;
        boolean z3 = false;
        boolean z4 = false;
        int i2 = 0;
        long j3 = 0;
        while (true) {
            order.clear();
            int read = fileChannel3.read(order);
            order.flip();
            z = true;
            boolean z5 = read == order.capacity();
            str = "MicroMsg.FastStart";
            if (!z5) {
                break;
            }
            j3 = ((long) order.getInt()) & Util.MAX_32BIT_VALUE;
            i2 = order.getInt();
            if (i2 == f260474c) {
                int f = m113642f(j3);
                byteBuffer2 = ByteBuffer.allocate(f).order(ByteOrder.BIG_ENDIAN);
                order.rewind();
                byteBuffer2.put(order);
                if (fileChannel3.read(byteBuffer2) < f - i) {
                    j = -1;
                    z = false;
                    z4 = true;
                    break;
                }
                byteBuffer2.flip();
                j2 = fileChannel.position();
                PInt pInt2 = pInt;
                z4 = true;
            } else if (i2 == f260473b) {
                long position = fileChannel.position() - 8;
                if (!z3) {
                    Log.m105918d(str, "it moov before mdat, needn't fast start");
                    pInt.value = 1;
                    return z2;
                }
                Log.m105918d(str, "it moov after mdat, need fast start");
                j = position;
            } else {
                PInt pInt3 = pInt;
                if (i2 == f260472a) {
                    z3 = true;
                }
                if (j3 == 1) {
                    order.clear();
                    order.clear();
                    int read2 = fileChannel3.read(order);
                    order.flip();
                    if (!(read2 == order.capacity())) {
                        break;
                    }
                    j3 = order.getLong();
                    if (j3 >= 0) {
                        byteBuffer = byteBuffer2;
                        fileChannel3.position((fileChannel.position() + j3) - 16);
                    } else {
                        throw new Exception("uint64 value is too large");
                    }
                } else {
                    byteBuffer = byteBuffer2;
                    fileChannel3.position((fileChannel.position() + j3) - 8);
                }
                byteBuffer2 = byteBuffer;
            }
            if (j3 < 8) {
                Log.m105928w(str, "atom size less 8, it error mp4.");
                return false;
            }
            i = 8;
            z2 = false;
        }
        byteBuffer2 = byteBuffer2;
        j = -1;
        z = false;
        if (!z4 || !z) {
            Log.m105928w(str, "it can not find moov or ftyp");
            return false;
        } else if (i2 != f260473b || j < 0) {
            Log.m105928w(str, "it can not find moov atom");
            return false;
        } else {
            int f2 = m113642f(j3);
            ByteBuffer order2 = ByteBuffer.allocate(f2).order(ByteOrder.BIG_ENDIAN);
            order2.clear();
            int read3 = fileChannel3.read(order2, j);
            order2.flip();
            if (!(read3 == order2.capacity())) {
                Log.m105928w(str, "failed to read moov atom");
                return false;
            } else if (order2.getInt(12) == f260475d) {
                Log.m105928w(str, "this utility does not support compressed moov atoms yet");
                return false;
            } else {
                while (order2.remaining() >= 8) {
                    int position2 = order2.position();
                    int i3 = order2.getInt(position2 + 4);
                    int i4 = f260476e;
                    if (i3 == i4 || i3 == f260477f) {
                        int i5 = i3;
                        String str2 = str;
                        if ((((long) order2.getInt(position2)) & Util.MAX_32BIT_VALUE) > ((long) order2.remaining())) {
                            Log.m105928w(str2, "bad atom size");
                            return false;
                        }
                        String str3 = str2;
                        boolean z6 = false;
                        order2.position(position2 + 12);
                        if (order2.remaining() < 4) {
                            Log.m105928w(str3, "malformed atom");
                            return false;
                        }
                        int f3 = m113642f((long) order2.getInt());
                        int i6 = i5;
                        if (i6 == i4) {
                            if (order2.remaining() < f3 * 4) {
                                Log.m105928w(str3, "bad atom size/element count");
                                return false;
                            }
                            int i7 = 0;
                            while (i7 < f3) {
                                int i8 = order2.getInt(order2.position());
                                int i9 = i8 + f2;
                                if (i8 < 0 && i9 >= 0) {
                                    return z6;
                                }
                                order2.putInt(i9);
                                i7++;
                                z6 = false;
                            }
                        } else if (i6 == f260477f) {
                            if (order2.remaining() < f3 * 8) {
                                Log.m105928w(str3, "bad atom size/element count");
                                return false;
                            }
                            int i15 = 0;
                            while (i15 < f3) {
                                order2.putLong(order2.getLong(order2.position()) + ((long) f2));
                                i15++;
                                j = j;
                            }
                        }
                        j = j;
                        str = str3;
                    } else {
                        order2.position(order2.position() + 1);
                    }
                }
                long j4 = j;
                fileChannel3.position(j2);
                if (byteBuffer2 != null) {
                    byteBuffer2.rewind();
                    fileChannel4.write(byteBuffer2);
                }
                order2.rewind();
                fileChannel4.write(order2);
                long j5 = j4;
                fileChannel.transferTo(j2, j4 - j2, fileChannel2);
                long j6 = (long) f2;
                fileChannel.transferTo(j5 + j6, (fileChannel.size() - j5) - j6, fileChannel2);
                return true;
            }
        }
    }

    /* renamed from: d */
    public static int m113640d(byte[] bArr) {
        return ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).getInt();
    }

    /* renamed from: e */
    public static void m113641e(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                Log.m105928w("MicroMsg.FastStart", "Failed to close file: ");
            }
        }
    }

    /* renamed from: f */
    public static int m113642f(long j) {
        if (j <= 2147483647L && j >= 0) {
            return (int) j;
        }
        throw new Exception("uint32 value is too large");
    }
}
