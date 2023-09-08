package w41;

import android.util.Pair;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.LinkedHashMap;
import java.util.Map;
import w41.C118743a;

/* renamed from: w41.e */
public class C118749e {
    /* renamed from: a */
    public static Map<Integer, ByteBuffer> m167441a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
            ByteBuffer f = C118743a.m167438f(byteBuffer, 8, byteBuffer.capacity() - 24);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i = 0;
            while (f.hasRemaining()) {
                i++;
                if (f.remaining() >= 8) {
                    long j = f.getLong();
                    if (j < 4 || j > 2147483647L) {
                        throw new C118743a.C118746c("APK Signing Block entry #" + i + " size out of range: " + j);
                    }
                    int i2 = (int) j;
                    int position = f.position() + i2;
                    if (i2 <= f.remaining()) {
                        int i3 = f.getInt();
                        linkedHashMap.put(Integer.valueOf(i3), C118743a.m167435c(f, i2 - 4));
                        if (i3 == 1896449818) {
                            Log.m105924i("MicroMsg.Channel.V2SchemeUtil", "find V2 signature block Id : 1896449818");
                        }
                        f.position(position);
                    } else {
                        throw new C118743a.C118746c("APK Signing Block entry #" + i + " size out of range: " + i2 + ", available: " + f.remaining());
                    }
                } else {
                    throw new C118743a.C118746c("Insufficient data to read size of APK Signing Block entry #" + i);
                }
            }
            if (!linkedHashMap.isEmpty()) {
                return linkedHashMap;
            }
            throw new C118743a.C118746c("not have Id-Value Pair in APK Signing Block entry #" + i);
        }
        throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
    }

    /* renamed from: b */
    public static ByteBuffer m167442b(C86009m1 m1Var) {
        RandomAccessFile randomAccessFile = null;
        if (m1Var == null || !m1Var.mo119967g() || !m1Var.mo119978p()) {
            return null;
        }
        try {
            randomAccessFile = C86013q1.m106420B(m1Var.mo119976n(), false);
            Pair<ByteBuffer, Long> e = C118743a.m167437e(randomAccessFile);
            ByteBuffer byteBuffer = (ByteBuffer) e.first;
            long longValue = ((Long) e.second).longValue();
            if (!C118751g.m167446c(randomAccessFile, longValue)) {
                ByteBuffer byteBuffer2 = (ByteBuffer) C118743a.m167433a(randomAccessFile, C118743a.m167436d(byteBuffer, longValue)).first;
                randomAccessFile.close();
                return byteBuffer2;
            }
            throw new C118743a.C118746c("ZIP64 APK not supported");
        } catch (Throwable th) {
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            throw th;
        }
    }
}
