package j72;

import android.media.MediaRecorder;
import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import j72.C108606e;
import p375qh.C110390f;
import p914oj.C100362d;

/* renamed from: j72.k */
public class C98919k implements C108606e {

    /* renamed from: a */
    public MediaRecorder f289956a;

    /* renamed from: b */
    public C108606e.C98917a f289957b;

    /* renamed from: c */
    public boolean f289958c = false;

    /* renamed from: d */
    public MMHandler f289959d = new C98920a();

    /* renamed from: e */
    public int f289960e;

    /* renamed from: f */
    public int f289961f;

    /* renamed from: g */
    public int f289962g;

    /* renamed from: j72.k$a */
    public class C98920a extends MMHandler {
        public C98920a() {
        }

        public void handleMessage(Message message) {
            C108606e.C98917a aVar = C98919k.this.f289957b;
            if (aVar != null) {
                aVar.mo138250a();
                C98919k.this.f289957b = null;
            }
        }
    }

    public C98919k(int i, int i2, int i3) {
        this.f289960e = i;
        this.f289961f = i2;
        this.f289962g = i3;
        if (i3 <= 0) {
            this.f289962g = 1;
        }
        Log.m105925i("MicroMsg.MMSightAACMediaRecorder", "MMSightAACMediaRecorder, sampleRate: %s, bitrate: %s, audioChannelCount: %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    /* renamed from: a */
    public int mo138252a(C108606e.C98918b bVar) {
        Log.m105925i("MicroMsg.MMSightAACMediaRecorder", "stop, mediaRecorder: %s, callback: %s", this.f289956a, bVar);
        MediaRecorder mediaRecorder = this.f289956a;
        if (mediaRecorder == null) {
            if (bVar != null) {
                bVar.mo138251a();
            }
            return 0;
        }
        try {
            if (!this.f289958c) {
                mediaRecorder.stop();
                this.f289956a.release();
            }
            this.f289956a = null;
            if (bVar != null) {
                bVar.mo138251a();
            }
            return 0;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MMSightAACMediaRecorder", e, "stop record aac.mp4 error:%s", e.getMessage());
            return -1;
        }
    }

    /* renamed from: b */
    public void mo138253b(boolean z) {
        this.f289958c = z;
    }

    /* renamed from: c */
    public int mo138254c(int i, String str) {
        Log.m105925i("MicroMsg.MMSightAACMediaRecorder", "MMSightAACMediaRecorder init tempPath[%s], sampleRate[%d]", str, Integer.valueOf(this.f289960e));
        C100362d dVar = new C100362d();
        this.f289956a = dVar;
        dVar.setAudioSource(1);
        this.f289956a.setOutputFormat(2);
        this.f289956a.setAudioEncoder(3);
        this.f289956a.setAudioChannels(this.f289962g);
        this.f289956a.setAudioEncodingBitRate(this.f289961f);
        this.f289956a.setAudioSamplingRate(this.f289960e);
        this.f289956a.setOutputFile(str);
        try {
            this.f289956a.prepare();
            return 0;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MMSightAACMediaRecorder", e, "mediaRecorder prepare error: %s", e.getMessage());
            return -1;
        }
    }

    public void clear() {
        try {
            MediaRecorder mediaRecorder = this.f289956a;
            if (mediaRecorder != null) {
                if (!this.f289958c) {
                    mediaRecorder.stop();
                    this.f289956a.release();
                }
                this.f289956a = null;
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MMSightAACMediaRecorder", e, "clear error: %s", e.getMessage());
        }
    }

    /* renamed from: d */
    public void mo138256d() {
    }

    /* renamed from: e */
    public C110390f.C89659b mo138257e() {
        return null;
    }

    /* renamed from: f */
    public int mo138258f(C108606e.C98917a aVar) {
        Log.m105925i("MicroMsg.MMSightAACMediaRecorder", "start, onPcmReady: %s", aVar);
        this.f289957b = aVar;
        try {
            MediaRecorder mediaRecorder = this.f289956a;
            if (mediaRecorder != null && !this.f289958c) {
                mediaRecorder.start();
            }
            return 0;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MMSightAACMediaRecorder", e, "start record aac.mp4 error:%s", e.getMessage());
            return -1;
        } finally {
            this.f289959d.sendEmptyMessage(0);
        }
    }
}
