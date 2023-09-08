package k72;

import android.graphics.Point;
import com.tencent.p014mm.plugin.mmsight.segment.MP4MuxerJNI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: k72.d */
public class C108905d implements C108898a {

    /* renamed from: a */
    public C108913i f326223a;

    /* renamed from: b */
    public byte[] f326224b = null;

    /* renamed from: c */
    public boolean f326225c = false;

    /* renamed from: d */
    public int f326226d = 0;

    /* renamed from: e */
    public double f326227e;

    /* renamed from: a */
    public void mo160029a(int i) {
        this.f326227e = (double) i;
    }

    /* renamed from: b */
    public int mo160030b() {
        return 2;
    }

    /* renamed from: c */
    public Point mo160031c() {
        return new Point(MP4MuxerJNI.ffmpegGetVideoWidthLock(), MP4MuxerJNI.ffmpegGetVideoHeightLock());
    }

    /* renamed from: d */
    public void mo160032d(C108913i iVar) {
        this.f326223a = iVar;
    }

    /* renamed from: e */
    public void mo160033e() {
        Log.m105924i("MicroMsg.FFMpegTranscodeDecoder", "startDecodeBlockLoop");
        this.f326225c = true;
        this.f326226d = 0;
        while (this.f326225c) {
            long currentTicks = Util.currentTicks();
            this.f326224b = MP4MuxerJNI.ffmpegGetNextVideoFrameDataLock(this.f326224b);
            Log.m105919d("MicroMsg.FFMpegTranscodeDecoder", "ffmpegGetNextVideoFrameData used %sms", Long.valueOf(Util.ticksToNow(currentTicks)));
            boolean ffmpegCheckIfReachEndTimestampLock = MP4MuxerJNI.ffmpegCheckIfReachEndTimestampLock();
            int i = this.f326226d + 1;
            this.f326226d = i;
            C108913i iVar = this.f326223a;
            if (iVar != null) {
                byte[] bArr = this.f326224b;
                iVar.mo160036a(bArr, bArr == null || ffmpegCheckIfReachEndTimestampLock, (long) (((double) i) * this.f326227e * 1000.0d));
            }
            if (this.f326224b != null) {
                if (ffmpegCheckIfReachEndTimestampLock) {
                }
            }
            Log.m105921e("MicroMsg.FFMpegTranscodeDecoder", "ret buffer is null or reachEnd? %s", Boolean.valueOf(ffmpegCheckIfReachEndTimestampLock));
            Log.m105925i("MicroMsg.FFMpegTranscodeDecoder", "decode finish, frame count: %s", Integer.valueOf(this.f326226d));
            this.f326225c = false;
            return;
        }
    }

    /* renamed from: f */
    public int mo160034f(String str, long j, long j2, int i) {
        Log.m105925i("MicroMsg.FFMpegTranscodeDecoder", "initDecoder, srcFilePath: %s, start: %s, end: %s, videoFps: %s", str, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i));
        this.f326227e = 1000.0d / ((double) i);
        if (Util.isNullOrNil(str)) {
            return -1;
        }
        long currentTicks = Util.currentTicks();
        int ffmpegOpenAndSeekFileLock = MP4MuxerJNI.ffmpegOpenAndSeekFileLock(str, ((double) j) * 1000.0d, ((double) j2) * 1000.0d);
        Log.m105925i("MicroMsg.FFMpegTranscodeDecoder", "ffmpegOpenAndSeekFile used %sms", Long.valueOf(Util.ticksToNow(currentTicks)));
        return ffmpegOpenAndSeekFileLock;
    }
}
