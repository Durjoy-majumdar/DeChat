package e21;

import android.media.MediaPlayer;
import com.tencent.p014mm.sdk.platformtools.Log;
import p331dj.C97481g;

/* renamed from: e21.z */
public class C116676z implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MediaPlayer[] f349927d;

    /* renamed from: e */
    public final /* synthetic */ Object f349928e;

    public C116676z(MediaPlayer[] mediaPlayerArr, Object obj) {
        this.f349927d = mediaPlayerArr;
        this.f349928e = obj;
    }

    public void run() {
        this.f349927d[0] = new C97481g();
        try {
            synchronized (this.f349928e) {
                this.f349928e.notify();
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.F2fRcvVoiceListener", e, "", new Object[0]);
        }
    }
}
