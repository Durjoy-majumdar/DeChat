package w41;

import android.util.Pair;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: w41.a */
public class C118743a {

    /* renamed from: w41.a$b */
    public static class C118745b {
        public C118745b(ByteBuffer byteBuffer, long j, long j2, long j3, ByteBuffer byteBuffer2, C118744a aVar) {
        }
    }

    /* renamed from: w41.a$c */
    public static class C118746c extends Exception {
        public C118746c(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    public static Pair<ByteBuffer, Long> m167433a(RandomAccessFile randomAccessFile, long j) {
        if (j >= 32) {
            ByteBuffer allocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            allocate.order(byteOrder);
            randomAccessFile.seek(j - ((long) allocate.capacity()));
            randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
            if (allocate.getLong(8) == 2334950737559900225L && allocate.getLong(16) == 3617552046287187010L) {
                long j2 = allocate.getLong(0);
                if (j2 < ((long) allocate.capacity()) || j2 > 2147483639) {
                    throw new C118746c("APK Signing Block size out of range: " + j2);
                }
                int i = (int) (8 + j2);
                long j3 = j - ((long) i);
                if (j3 >= 0) {
                    ByteBuffer allocate2 = ByteBuffer.allocate(i);
                    allocate2.order(byteOrder);
                    randomAccessFile.seek(j3);
                    randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                    long j4 = allocate2.getLong(0);
                    if (j4 == j2) {
                        return Pair.create(allocate2, Long.valueOf(j3));
                    }
                    throw new C118746c("APK Signing Block sizes in header and footer do not match: " + j4 + " vs " + j2);
                }
                throw new C118746c("APK Signing Block offset out of range: " + j3);
            }
            throw new C118746c("No APK Signing Block before ZIP Central Directory");
        }
        throw new C118746c("APK too small for APK Signing Block. ZIP Central Directory offset: " + j);
    }

    /* renamed from: b */
    public static C118745b m167434b(RandomAccessFile randomAccessFile) {
        RandomAccessFile randomAccessFile2 = randomAccessFile;
        Pair<ByteBuffer, Long> e = m167437e(randomAccessFile);
        ByteBuffer byteBuffer = (ByteBuffer) e.first;
        long longValue = ((Long) e.second).longValue();
        if (!C118751g.m167446c(randomAccessFile2, longValue)) {
            long d = m167436d(byteBuffer, longValue);
            Pair<ByteBuffer, Long> a = m167433a(randomAccessFile2, d);
            ByteBuffer byteBuffer2 = (ByteBuffer) a.first;
            long longValue2 = ((Long) a.second).longValue();
            if (byteBuffer2.order() == ByteOrder.LITTLE_ENDIAN) {
                ByteBuffer f = m167438f(byteBuffer2, 8, byteBuffer2.capacity() - 24);
                int i = 0;
                while (f.hasRemaining()) {
                    i++;
                    if (f.remaining() >= 8) {
                        long j = f.getLong();
                        if (j < 4 || j > 2147483647L) {
                            throw new C118746c("APK Signing Block entry #" + i + " size out of range: " + j);
                        }
                        int i2 = (int) j;
                        int position = f.position() + i2;
                        if (i2 > f.remaining()) {
                            throw new C118746c("APK Signing Block entry #" + i + " size out of range: " + i2 + ", available: " + f.remaining());
                        } else if (f.getInt() == 1896449818) {
                            return new C118745b(m167435c(f, i2 - 4), longValue2, d, longValue, byteBuffer, (C118744a) null);
                        } else {
                            f.position(position);
                        }
                    } else {
                        throw new C118746c("Insufficient data to read size of APK Signing Block entry #" + i);
                    }
                }
                throw new C118746c("No APK Signature Scheme v2 block in APK Signing Block");
            }
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
        throw new C118746c("ZIP64 APK not supported");
    }

    /* renamed from: c */
    public static ByteBuffer m167435c(ByteBuffer byteBuffer, int i) {
        if (i >= 0) {
            int limit = byteBuffer.limit();
            int position = byteBuffer.position();
            int i2 = i + position;
            if (i2 < position || i2 > limit) {
                throw new BufferUnderflowException();
            }
            byteBuffer.limit(i2);
            try {
                ByteBuffer slice = byteBuffer.slice();
                slice.order(byteBuffer.order());
                byteBuffer.position(i2);
                return slice;
            } finally {
                byteBuffer.limit(limit);
            }
        } else {
            throw new IllegalArgumentException("size: " + i);
        }
    }

    /* renamed from: d */
    public static long m167436d(ByteBuffer byteBuffer, long j) {
        C118751g.m167444a(byteBuffer);
        long j2 = ((long) byteBuffer.getInt(byteBuffer.position() + 16)) & Util.MAX_32BIT_VALUE;
        if (j2 < j) {
            C118751g.m167444a(byteBuffer);
            if ((Util.MAX_32BIT_VALUE & ((long) byteBuffer.getInt(byteBuffer.position() + 12))) + j2 == j) {
                return j2;
            }
            throw new C118746c("ZIP Central Directory is not immediately followed by End of Central Directory");
        }
        throw new C118746c("ZIP Central Directory offset out of range: " + j2 + ". ZIP End of Central Directory offset: " + j);
    }

    /* renamed from: e */
    public static Pair<ByteBuffer, Long> m167437e(RandomAccessFile randomAccessFile) {
        Pair<ByteBuffer, Long> pair;
        if (randomAccessFile.length() < 22) {
            pair = null;
        } else {
            Pair<ByteBuffer, Long> b = C118751g.m167445b(randomAccessFile, 0);
            pair = b != null ? b : C118751g.m167445b(randomAccessFile, 65535);
        }
        if (pair != null) {
            return pair;
        }
        throw new C118746c("Not an APK file: ZIP End of Central Directory record not found");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: f */
    public static ByteBuffer m167438f(ByteBuffer byteBuffer, int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("start: " + i);
        } else if (i2 >= i) {
            int capacity = byteBuffer.capacity();
            if (i2 <= byteBuffer.capacity()) {
                int limit = byteBuffer.limit();
                int position = byteBuffer.position();
                try {
                    byteBuffer.position(0);
                    byteBuffer.limit(i2);
                    byteBuffer.position(i);
                    ByteBuffer slice = byteBuffer.slice();
                    slice.order(byteBuffer.order());
                    byteBuffer.position(0);
                    byteBuffer.limit(limit);
                    byteBuffer.position(position);
                    return slice;
                } catch (Throwable th) {
                    byteBuffer.position(0);
                    byteBuffer.limit(limit);
                    byteBuffer.position(position);
                    throw th;
                }
            } else {
                throw new IllegalArgumentException("end > capacity: " + i2 + " > " + capacity);
            }
        } else {
            throw new IllegalArgumentException("end < start: " + i2 + " < " + i);
        }
    }
}
