package wa2;

import com.tencent.qqmusic.mediaplayer.AudioFormat;
import com.tencent.qqmusic.mediaplayer.formatdetector.FormatDetector;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import java.nio.ByteBuffer;

/* renamed from: wa2.a */
public class C90901a implements IDataSource {

    /* renamed from: d */
    public ByteBuffer f260889d;

    /* renamed from: e */
    public long f260890e;

    /* renamed from: f */
    public Object f260891f = new Object();

    public C90901a(ByteBuffer byteBuffer) {
        this.f260889d = byteBuffer;
    }

    public void close() {
        synchronized (this.f260891f) {
            this.f260889d = null;
        }
    }

    public AudioFormat.AudioType getAudioType() {
        return this.f260889d == null ? AudioFormat.AudioType.UNSUPPORT : FormatDetector.getAudioFormat((IDataSource) this, false);
    }

    public long getSize() {
        synchronized (this.f260891f) {
            ByteBuffer byteBuffer = this.f260889d;
            if (byteBuffer == null) {
                return -1;
            }
            long limit = (long) byteBuffer.limit();
            return limit;
        }
    }

    public void open() {
        synchronized (this.f260891f) {
            ByteBuffer byteBuffer = this.f260889d;
            if (byteBuffer != null) {
                byteBuffer.rewind();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d1, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int readAt(long r19, byte[] r21, int r22, int r23) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            r0 = r21
            r4 = r22
            r5 = r23
            java.nio.ByteBuffer r6 = r1.f260889d
            r7 = -1
            if (r6 != 0) goto L_0x0017
            java.lang.String r0 = "MicroMsg.Audio.InputStreamByteBufferDataSource"
            java.lang.String r2 = "buffer is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
            return r7
        L_0x0017:
            long r8 = r18.getSize()
            r10 = 0
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 > 0) goto L_0x0029
            java.lang.String r0 = "MicroMsg.Audio.InputStreamByteBufferDataSource"
            java.lang.String r2 = "getSize <= 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
            return r7
        L_0x0029:
            if (r0 == 0) goto L_0x00f2
            int r6 = r0.length
            if (r6 > 0) goto L_0x0030
            goto L_0x00f2
        L_0x0030:
            r6 = 2
            r8 = 1
            r9 = 0
            r12 = 3
            int r13 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r13 < 0) goto L_0x00d5
            if (r4 < 0) goto L_0x00d5
            if (r5 > 0) goto L_0x003e
            goto L_0x00d5
        L_0x003e:
            int r13 = r4 + r5
            int r14 = r0.length
            if (r13 <= r14) goto L_0x0060
            java.lang.String r2 = "MicroMsg.Audio.InputStreamByteBufferDataSource"
            java.lang.String r3 = "offset:%d, size:%d, bytes.length:%d"
            java.lang.Object[] r10 = new java.lang.Object[r12]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r22)
            r10[r9] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r23)
            r10[r8] = r4
            int r0 = r0.length
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10[r6] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r3, r10)
            return r7
        L_0x0060:
            long r13 = (long) r5
            long r13 = r13 + r2
            long r15 = r18.getSize()
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 <= 0) goto L_0x008a
            java.lang.String r13 = "MicroMsg.Audio.InputStreamByteBufferDataSource"
            java.lang.String r14 = "position:%d, size:%d, getSize():%d"
            java.lang.Object[] r12 = new java.lang.Object[r12]
            java.lang.Long r15 = java.lang.Long.valueOf(r19)
            r12[r9] = r15
            java.lang.Integer r9 = java.lang.Integer.valueOf(r23)
            r12[r8] = r9
            long r8 = r18.getSize()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r12[r6] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r13, r14, r12)
        L_0x008a:
            long r8 = r1.f260890e
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x0096
            long r8 = r18.getSize()
            r1.f260890e = r8
        L_0x0096:
            long r8 = r1.f260890e
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 <= 0) goto L_0x00a3
            int r6 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x00a3
            if (r5 <= 0) goto L_0x00a3
            return r7
        L_0x00a3:
            java.lang.Object r10 = r1.f260891f
            monitor-enter(r10)
            java.nio.ByteBuffer r6 = r1.f260889d     // Catch:{ all -> 0x00d2 }
            if (r6 == 0) goto L_0x00cf
            int r3 = (int) r2     // Catch:{ all -> 0x00d2 }
            r6.position(r3)     // Catch:{ all -> 0x00d2 }
            java.nio.ByteBuffer r2 = r1.f260889d     // Catch:{ all -> 0x00d2 }
            boolean r2 = r2.hasRemaining()     // Catch:{ all -> 0x00d2 }
            if (r2 != 0) goto L_0x00bf
            java.lang.String r0 = "MicroMsg.Audio.InputStreamByteBufferDataSource"
            java.lang.String r2 = "no remaining"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)     // Catch:{ all -> 0x00d2 }
            monitor-exit(r10)     // Catch:{ all -> 0x00d2 }
            return r7
        L_0x00bf:
            java.nio.ByteBuffer r2 = r1.f260889d     // Catch:{ all -> 0x00d2 }
            int r2 = r2.remaining()     // Catch:{ all -> 0x00d2 }
            int r2 = java.lang.Math.min(r5, r2)     // Catch:{ all -> 0x00d2 }
            java.nio.ByteBuffer r3 = r1.f260889d     // Catch:{ all -> 0x00d2 }
            r3.get(r0, r4, r2)     // Catch:{ all -> 0x00d2 }
            goto L_0x00d0
        L_0x00cf:
            r2 = r5
        L_0x00d0:
            monitor-exit(r10)     // Catch:{ all -> 0x00d2 }
            return r2
        L_0x00d2:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x00d2 }
            throw r0
        L_0x00d5:
            java.lang.String r0 = "MicroMsg.Audio.InputStreamByteBufferDataSource"
            java.lang.String r10 = "position:%d, offset:%d, size:%d"
            java.lang.Object[] r11 = new java.lang.Object[r12]
            java.lang.Long r2 = java.lang.Long.valueOf(r19)
            r11[r9] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r22)
            r11[r8] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r23)
            r11[r6] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r10, r11)
            return r7
        L_0x00f2:
            java.lang.String r0 = "MicroMsg.Audio.InputStreamByteBufferDataSource"
            java.lang.String r2 = "bytes is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: wa2.C90901a.readAt(long, byte[], int, int):int");
    }
}
