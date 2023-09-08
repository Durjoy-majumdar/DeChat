package lz1;

import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;

/* renamed from: lz1.f */
public class C88680f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C88672e f256028d;

    public C88680f(C88672e eVar) {
        this.f256028d = eVar;
    }

    public void run() {
        Looper.prepare();
        Log.m105924i("MicroMsg.GameLiveAppbrandAudioMgrService", "create handler");
        this.f256028d.f255990f = new MMHandler(Looper.myLooper());
        Looper.loop();
        Log.m105924i("MicroMsg.GameLiveAppbrandAudioMgrService", "handler thread quited");
    }
}
