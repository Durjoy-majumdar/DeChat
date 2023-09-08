package w41;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: w41.g */
public abstract class C118751g {
    /* renamed from: a */
    public static void m167444a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.nio.ByteBuffer, java.lang.Long> m167445b(java.io.RandomAccessFile r10, int r11) {
        /*
            if (r11 < 0) goto L_0x0085
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r11 > r0) goto L_0x0085
            long r1 = r10.length()
            r3 = 0
            r4 = 22
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0013
            return r3
        L_0x0013:
            long r6 = (long) r11
            long r4 = r1 - r4
            long r4 = java.lang.Math.min(r6, r4)
            int r11 = (int) r4
            r4 = 22
            int r11 = r11 + r4
            java.nio.ByteBuffer r11 = java.nio.ByteBuffer.allocate(r11)
            java.nio.ByteOrder r5 = java.nio.ByteOrder.LITTLE_ENDIAN
            r11.order(r5)
            int r5 = r11.capacity()
            long r5 = (long) r5
            long r1 = r1 - r5
            r10.seek(r1)
            byte[] r5 = r11.array()
            int r6 = r11.arrayOffset()
            int r7 = r11.capacity()
            r10.readFully(r5, r6, r7)
            m167444a(r11)
            int r10 = r11.capacity()
            r5 = -1
            if (r10 >= r4) goto L_0x004b
        L_0x0049:
            r7 = -1
            goto L_0x006b
        L_0x004b:
            int r10 = r10 - r4
            int r4 = java.lang.Math.min(r10, r0)
            r6 = 0
        L_0x0051:
            if (r6 >= r4) goto L_0x0049
            int r7 = r10 - r6
            int r8 = r11.getInt(r7)
            r9 = 101010256(0x6054b50, float:2.506985E-35)
            if (r8 != r9) goto L_0x0068
            int r8 = r7 + 20
            short r8 = r11.getShort(r8)
            r8 = r8 & r0
            if (r8 != r6) goto L_0x0068
            goto L_0x006b
        L_0x0068:
            int r6 = r6 + 1
            goto L_0x0051
        L_0x006b:
            if (r7 != r5) goto L_0x006e
            return r3
        L_0x006e:
            r11.position(r7)
            java.nio.ByteBuffer r10 = r11.slice()
            java.nio.ByteOrder r11 = java.nio.ByteOrder.LITTLE_ENDIAN
            r10.order(r11)
            long r3 = (long) r7
            long r1 = r1 + r3
            java.lang.Long r11 = java.lang.Long.valueOf(r1)
            android.util.Pair r10 = android.util.Pair.create(r10, r11)
            return r10
        L_0x0085:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "maxCommentSize: "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: w41.C118751g.m167445b(java.io.RandomAccessFile, int):android.util.Pair");
    }

    /* renamed from: c */
    public static final boolean m167446c(RandomAccessFile randomAccessFile, long j) {
        long j2 = j - 20;
        if (j2 < 0) {
            return false;
        }
        randomAccessFile.seek(j2);
        return randomAccessFile.readInt() == 1347094023;
    }
}
