package lz1;

import android.net.LocalServerSocket;
import android.net.LocalSocket;
import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import ea2.C20561h;
import java.io.IOException;
import java.io.ObjectOutputStream;
import mj0.C88733c;

/* renamed from: lz1.g */
public class C88681g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C88733c f256029d;

    /* renamed from: e */
    public final /* synthetic */ C88672e f256030e;

    public C88681g(C88672e eVar, C88733c cVar) {
        this.f256030e = eVar;
        this.f256029d = cVar;
    }

    public void run() {
        Looper.prepare();
        Log.m105924i("MicroMsg.GameLiveAppbrandAudioMgrService", "create ipc handler");
        this.f256030e.f255991g = new MMHandler(Looper.myLooper());
        try {
            this.f256030e.f255992h = new LocalServerSocket(this.f256030e.f256005x);
            LocalSocket accept = this.f256030e.f255992h.accept();
            Log.m105924i("MicroMsg.GameLiveAppbrandAudioMgrService", "vira: got client");
            if (this.f256030e.f255990f == null) {
                Log.m105928w("MicroMsg.GameLiveAppbrandAudioMgrService", "handle is null!");
                return;
            }
            C20561h.m22332s().mo32156O(this.f256030e.f256007z);
            this.f256029d.mo123168z(this.f256030e.f256007z);
            C88672e eVar = this.f256030e;
            eVar.f255990f.post(eVar.f255987A);
            this.f256030e.kg0(false, false);
            this.f256030e.f255989e = new ObjectOutputStream(accept.getOutputStream());
            Looper.loop();
            Log.m105924i("MicroMsg.GameLiveAppbrandAudioMgrService", "ipcHandler thread quited");
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.GameLiveAppbrandAudioMgrService", e, "io exception", new Object[0]);
        }
    }
}
