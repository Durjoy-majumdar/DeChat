package yj0;

import com.tencent.p014mm.sdk.platformtools.Log;
import ea2.C86468a;
import java.util.HashMap;
import yj0.C91465c;

public final /* synthetic */ class c$a$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C91465c.C91466a f262238d;

    /* renamed from: e */
    public final /* synthetic */ C86468a.C86469a f262239e;

    public /* synthetic */ c$a$$b(C91465c.C91466a aVar, C86468a.C86469a aVar2) {
        this.f262238d = aVar;
        this.f262239e = aVar2;
    }

    public final void run() {
        C91465c.C91466a aVar = this.f262238d;
        C86468a.C86469a aVar2 = this.f262239e;
        ((HashMap) C91465c.this.f262214b).put(Short.valueOf(aVar2.f251260a), new C91464b(aVar2.f251260a, false));
        Log.m105924i("MicroMsg.GameRecordAudioLogic", "[hilive] onStart sessionId: " + aVar2.f251260a + " audioType: " + aVar2.f251261b + " audioId: " + aVar2.f251262c + " mStreams: " + ((HashMap) C91465c.this.f262214b).size());
    }
}
