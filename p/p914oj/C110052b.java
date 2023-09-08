package p914oj;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.ParcelFileDescriptor;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.stubs.logger.Log;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;

/* renamed from: oj.b */
public final class C110052b {

    /* renamed from: a */
    public final MediaExtractor f329324a = new MediaExtractor();

    /* renamed from: a */
    public boolean mo161382a() {
        return this.f329324a.advance();
    }

    /* renamed from: b */
    public long mo161383b() {
        return this.f329324a.getSampleTime();
    }

    /* renamed from: c */
    public int mo161384c() {
        return this.f329324a.getSampleTrackIndex();
    }

    /* renamed from: d */
    public final int mo161385d() {
        return this.f329324a.getTrackCount();
    }

    /* renamed from: e */
    public MediaFormat mo161386e(int i) {
        return this.f329324a.getTrackFormat(i);
    }

    /* renamed from: f */
    public int mo161387f(ByteBuffer byteBuffer, int i) {
        return this.f329324a.readSampleData(byteBuffer, i);
    }

    /* renamed from: g */
    public final void mo161388g() {
        this.f329324a.release();
    }

    /* renamed from: h */
    public void mo161389h(long j, int i) {
        this.f329324a.seekTo(j, i);
    }

    /* renamed from: i */
    public void mo161390i(int i) {
        this.f329324a.selectTrack(i);
    }

    /* renamed from: j */
    public final void mo161391j(FileDescriptor fileDescriptor, long j, long j2) {
        this.f329324a.setDataSource(fileDescriptor, j, j2);
    }

    /* renamed from: k */
    public final void mo161392k(String str) {
        ParcelFileDescriptor z;
        if (C86013q1.m106448i(str, false) != null) {
            try {
                this.f329324a.setDataSource(str, (Map) null);
                return;
            } catch (IOException e) {
                Log.m106513w("MicroMsg.VFSMediaExtractor", "Cannot open by path: " + str + ", " + e.getMessage());
            }
        }
        try {
            z = C86013q1.m106465z(str, "r");
            this.f329324a.setDataSource(z.getFileDescriptor());
            z.close();
            return;
        } catch (IOException e2) {
            Log.m106513w("MicroMsg.VFSMediaExtractor", "Cannot open by fd: " + str + ", " + e2.getMessage());
            this.f329324a.setDataSource(str, (Map) null);
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
