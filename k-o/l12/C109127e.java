package l12;

import com.tencent.p014mm.plugin.ipcall.model.C105385g;
import com.tencent.p014mm.sdk.platformtools.Log;
import m12.C109470c;

/* renamed from: l12.e */
public class C109127e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C109124d f326771d;

    public C109127e(C109124d dVar) {
        this.f326771d = dVar;
    }

    public void run() {
        try {
            C109124d.m148167a(this.f326771d);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.IPCallRecorder", "start record error: %s", e.getMessage());
            C109470c Dx0 = C105385g.Dx0();
            if (Dx0.f327651F == 0) {
                Dx0.f327651F = 1;
            }
        }
    }
}
