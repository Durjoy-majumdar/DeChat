package cn0;

import java.io.IOException;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;

/* renamed from: cn0.f */
public class C80080f extends Reader {

    /* renamed from: d */
    public C80079e f234515d;

    /* renamed from: e */
    public boolean f234516e = false;

    /* renamed from: f */
    public CharsetDecoder f234517f;

    /* renamed from: g */
    public final ByteBuffer f234518g;

    public C80080f(C80079e eVar, String str) {
        super(eVar);
        ByteBuffer allocate = ByteBuffer.allocate(8192);
        this.f234518g = allocate;
        str.getClass();
        this.f234515d = eVar;
        try {
            this.f234517f = Charset.forName(str).newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
            allocate.limit(0);
        } catch (IllegalArgumentException e) {
            throw ((UnsupportedEncodingException) new UnsupportedEncodingException(str).initCause(e));
        }
    }

    /* renamed from: a */
    public static void m97367a(int i, int i2, int i3) {
        if ((i2 | i3) < 0 || i2 > i || i - i2 < i3) {
            throw new ArrayIndexOutOfBoundsException("arrayLength=" + i + ",offset=" + i2 + ",count=" + i3);
        }
    }

    public void close() {
        synchronized (this.lock) {
            CharsetDecoder charsetDecoder = this.f234517f;
            if (charsetDecoder != null) {
                charsetDecoder.reset();
            }
            this.f234517f = null;
            C80079e eVar = this.f234515d;
            if (eVar != null) {
                eVar.close();
                this.f234515d = null;
            }
        }
    }

    public int read() {
        char c;
        synchronized (this.lock) {
            if (this.f234515d != null) {
                char[] cArr = new char[1];
                c = 65535;
                if (read(cArr, 0, 1) != -1) {
                    c = cArr[0];
                }
            } else {
                throw new IOException("DataSourceReader is closed");
            }
        }
        return c;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:20|21|(1:23)|25|26|(2:29|(2:(1:33)(1:34)|33)(1:31))(1:28)) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0041, code lost:
        if (r12.position() > r13) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00eb, code lost:
        return r6;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0044 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read(char[] r12, int r13, int r14) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.lock
            monitor-enter(r0)
            cn0.e r1 = r11.f234515d     // Catch:{ all -> 0x00f6 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x000b
            r1 = 1
            goto L_0x000c
        L_0x000b:
            r1 = 0
        L_0x000c:
            if (r1 == 0) goto L_0x00ec
            int r1 = r12.length     // Catch:{ all -> 0x00f6 }
            m97367a(r1, r13, r14)     // Catch:{ all -> 0x00f6 }
            if (r14 != 0) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x00f6 }
            return r3
        L_0x0016:
            java.nio.CharBuffer r12 = java.nio.CharBuffer.wrap(r12, r13, r14)     // Catch:{ all -> 0x00f6 }
            java.nio.charset.CoderResult r14 = java.nio.charset.CoderResult.UNDERFLOW     // Catch:{ all -> 0x00f6 }
            java.nio.ByteBuffer r1 = r11.f234518g     // Catch:{ all -> 0x00f6 }
            boolean r1 = r1.hasRemaining()     // Catch:{ all -> 0x00f6 }
            r4 = r11
            if (r1 != 0) goto L_0x0027
            goto L_0x00b0
        L_0x0027:
            r1 = 0
        L_0x0028:
            boolean r5 = r12.hasRemaining()     // Catch:{ all -> 0x00f6 }
            r6 = -1
            if (r5 == 0) goto L_0x00b3
            if (r1 == 0) goto L_0x0081
            cn0.e r1 = r4.f234515d     // Catch:{ Exception -> 0x0044 }
            long r7 = r1.available()     // Catch:{ Exception -> 0x0044 }
            r9 = 0
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x0044
            int r1 = r12.position()     // Catch:{ Exception -> 0x0044 }
            if (r1 <= r13) goto L_0x0044
            goto L_0x00b3
        L_0x0044:
            boolean r1 = r4.f234516e     // Catch:{ all -> 0x00f6 }
            if (r1 == 0) goto L_0x0049
            goto L_0x00b3
        L_0x0049:
            java.nio.ByteBuffer r1 = r4.f234518g     // Catch:{ all -> 0x00f6 }
            int r1 = r1.capacity()     // Catch:{ all -> 0x00f6 }
            java.nio.ByteBuffer r5 = r4.f234518g     // Catch:{ all -> 0x00f6 }
            int r5 = r5.limit()     // Catch:{ all -> 0x00f6 }
            int r1 = r1 - r5
            java.nio.ByteBuffer r5 = r4.f234518g     // Catch:{ all -> 0x00f6 }
            int r5 = r5.arrayOffset()     // Catch:{ all -> 0x00f6 }
            java.nio.ByteBuffer r7 = r4.f234518g     // Catch:{ all -> 0x00f6 }
            int r7 = r7.limit()     // Catch:{ all -> 0x00f6 }
            int r5 = r5 + r7
            cn0.e r7 = r4.f234515d     // Catch:{ all -> 0x00f6 }
            java.nio.ByteBuffer r8 = r4.f234518g     // Catch:{ all -> 0x00f6 }
            byte[] r8 = r8.array()     // Catch:{ all -> 0x00f6 }
            int r1 = r7.mo109838c(r8, r5, r1)     // Catch:{ all -> 0x00f6 }
            if (r1 != r6) goto L_0x0074
            r4.f234516e = r2     // Catch:{ all -> 0x00f6 }
            goto L_0x00b3
        L_0x0074:
            if (r1 != 0) goto L_0x0077
            goto L_0x00b3
        L_0x0077:
            java.nio.ByteBuffer r14 = r4.f234518g     // Catch:{ all -> 0x00f6 }
            int r5 = r14.limit()     // Catch:{ all -> 0x00f6 }
            int r5 = r5 + r1
            r14.limit(r5)     // Catch:{ all -> 0x00f6 }
        L_0x0081:
            java.nio.charset.CharsetDecoder r14 = r4.f234517f     // Catch:{ all -> 0x00f6 }
            java.nio.ByteBuffer r1 = r4.f234518g     // Catch:{ all -> 0x00f6 }
            java.nio.charset.CoderResult r14 = r14.decode(r1, r12, r3)     // Catch:{ all -> 0x00f6 }
            boolean r1 = r14.isUnderflow()     // Catch:{ all -> 0x00f6 }
            if (r1 == 0) goto L_0x00b3
            java.nio.ByteBuffer r1 = r4.f234518g     // Catch:{ all -> 0x00f6 }
            int r1 = r1.limit()     // Catch:{ all -> 0x00f6 }
            java.nio.ByteBuffer r5 = r4.f234518g     // Catch:{ all -> 0x00f6 }
            int r5 = r5.capacity()     // Catch:{ all -> 0x00f6 }
            if (r1 != r5) goto L_0x00b0
            java.nio.ByteBuffer r1 = r4.f234518g     // Catch:{ all -> 0x00f6 }
            r1.compact()     // Catch:{ all -> 0x00f6 }
            java.nio.ByteBuffer r1 = r4.f234518g     // Catch:{ all -> 0x00f6 }
            int r5 = r1.position()     // Catch:{ all -> 0x00f6 }
            r1.limit(r5)     // Catch:{ all -> 0x00f6 }
            java.nio.ByteBuffer r1 = r4.f234518g     // Catch:{ all -> 0x00f6 }
            r1.position(r3)     // Catch:{ all -> 0x00f6 }
        L_0x00b0:
            r1 = 1
            goto L_0x0028
        L_0x00b3:
            java.nio.charset.CoderResult r1 = java.nio.charset.CoderResult.UNDERFLOW     // Catch:{ all -> 0x00f6 }
            if (r14 != r1) goto L_0x00cd
            boolean r1 = r4.f234516e     // Catch:{ all -> 0x00f6 }
            if (r1 == 0) goto L_0x00cd
            java.nio.charset.CharsetDecoder r14 = r4.f234517f     // Catch:{ all -> 0x00f6 }
            java.nio.ByteBuffer r1 = r4.f234518g     // Catch:{ all -> 0x00f6 }
            java.nio.charset.CoderResult r14 = r14.decode(r1, r12, r2)     // Catch:{ all -> 0x00f6 }
            java.nio.charset.CharsetDecoder r1 = r4.f234517f     // Catch:{ all -> 0x00f6 }
            r1.flush(r12)     // Catch:{ all -> 0x00f6 }
            java.nio.charset.CharsetDecoder r1 = r4.f234517f     // Catch:{ all -> 0x00f6 }
            r1.reset()     // Catch:{ all -> 0x00f6 }
        L_0x00cd:
            boolean r1 = r14.isMalformed()     // Catch:{ all -> 0x00f6 }
            if (r1 != 0) goto L_0x00d9
            boolean r1 = r14.isUnmappable()     // Catch:{ all -> 0x00f6 }
            if (r1 == 0) goto L_0x00dc
        L_0x00d9:
            r14.throwException()     // Catch:{ all -> 0x00f6 }
        L_0x00dc:
            int r14 = r12.position()     // Catch:{ all -> 0x00f6 }
            int r14 = r14 - r13
            if (r14 != 0) goto L_0x00e4
            goto L_0x00ea
        L_0x00e4:
            int r12 = r12.position()     // Catch:{ all -> 0x00f6 }
            int r6 = r12 - r13
        L_0x00ea:
            monitor-exit(r0)     // Catch:{ all -> 0x00f6 }
            return r6
        L_0x00ec:
            java.io.IOException r12 = new java.io.IOException     // Catch:{ all -> 0x00f6 }
            java.lang.String r13 = "DataSourceReader is closed"
            r12.<init>(r13)     // Catch:{ all -> 0x00f6 }
            throw r12     // Catch:{ all -> 0x00f6 }
        L_0x00f4:
            monitor-exit(r0)     // Catch:{ all -> 0x00f6 }
            throw r12
        L_0x00f6:
            r12 = move-exception
            goto L_0x00f4
        */
        throw new UnsupportedOperationException("Method not decompiled: cn0.C80080f.read(char[], int, int):int");
    }
}
