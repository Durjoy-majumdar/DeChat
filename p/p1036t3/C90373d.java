package p1036t3;

import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.RandomAccessFile;
import java.util.zip.ZipException;

/* renamed from: t3.d */
public final class C90373d {

    /* renamed from: t3.d$a */
    public static class C90374a {

        /* renamed from: a */
        public long f259386a;

        /* renamed from: b */
        public long f259387b;
    }

    /* renamed from: a */
    public static C90374a m113170a(RandomAccessFile randomAccessFile) {
        long length = randomAccessFile.length() - 22;
        long j = 0;
        if (length >= 0) {
            long j2 = length - 65536;
            if (j2 >= 0) {
                j = j2;
            }
            int reverseBytes = Integer.reverseBytes(101010256);
            do {
                randomAccessFile.seek(length);
                if (randomAccessFile.readInt() == reverseBytes) {
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    C90374a aVar = new C90374a();
                    aVar.f259387b = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & Util.MAX_32BIT_VALUE;
                    aVar.f259386a = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & Util.MAX_32BIT_VALUE;
                    return aVar;
                }
                length--;
            } while (length >= j);
            throw new ZipException("End Of Central Directory signature not found");
        }
        throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
    }
}
