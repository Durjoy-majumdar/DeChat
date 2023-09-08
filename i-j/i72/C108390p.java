package i72;

import android.content.Context;
import android.hardware.Camera;
import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import p156gj.C107828e;
import p156gj.C107848z;

/* renamed from: i72.p */
public class C108390p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f324543d;

    /* renamed from: e */
    public final /* synthetic */ long f324544e;

    /* renamed from: f */
    public final /* synthetic */ Context f324545f;

    /* renamed from: g */
    public final /* synthetic */ int f324546g;

    /* renamed from: h */
    public final /* synthetic */ C108391q f324547h;

    public C108390p(C108391q qVar, long j, long j2, Context context, int i) {
        this.f324547h = qVar;
        this.f324543d = j;
        this.f324544e = j2;
        this.f324545f = context;
        this.f324546g = i;
    }

    public void run() {
        Log.m105925i("MicroMsg.SightCamera.OpenCameraThread", "Start Open Camera thread[parent:%d this:%d] time:%d", Long.valueOf(this.f324543d), Long.valueOf(Thread.currentThread().getId()), Long.valueOf(Util.nowMilliSecond() - this.f324544e));
        synchronized (this.f324547h.f324548a) {
            try {
                this.f324547h.f324550c = C107828e.m146101d(this.f324545f, this.f324546g, Looper.getMainLooper());
            } catch (Exception e) {
                Log.m105921e("MicroMsg.SightCamera.OpenCameraThread", "openCamera failed e:%s", e.getMessage());
                this.f324547h.f324550c = null;
            }
            C108391q qVar = this.f324547h;
            if (qVar.f324549b && qVar.f324550c != null) {
                Log.m105921e("MicroMsg.SightCamera.OpenCameraThread", "thread time out now, release camera :%d ", Long.valueOf(Util.nowMilliSecond() - this.f324544e));
                try {
                    C107848z zVar = this.f324547h.f324550c.f322839a;
                    zVar.mo158263g((Camera.PreviewCallback) null);
                    zVar.mo158268l();
                    zVar.mo158260d();
                    this.f324547h.f324550c = null;
                } catch (Exception e2) {
                    Log.m105921e("MicroMsg.SightCamera.OpenCameraThread", "realease Camera failed e:%s", e2.getMessage());
                }
            }
            this.f324547h.f324548a.notify();
        }
    }
}
