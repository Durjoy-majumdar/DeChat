package yj0;

import com.tencent.p014mm.sdk.platformtools.Log;
import ea2.C86468a;
import java.util.HashMap;
import yj0.C91465c;

public final /* synthetic */ class c$a$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C91465c.C91466a f262240d;

    /* renamed from: e */
    public final /* synthetic */ C86468a.C86469a f262241e;

    public /* synthetic */ c$a$$c(C91465c.C91466a aVar, C86468a.C86469a aVar2) {
        this.f262240d = aVar;
        this.f262241e = aVar2;
    }

    public final void run() {
        C91465c.C91466a aVar = this.f262240d;
        C86468a.C86469a aVar2 = this.f262241e;
        aVar.getClass();
        Log.m105924i("MicroMsg.GameRecordAudioLogic", "[hilive] AbstractAudioOutputListener onStop sessionId: " + aVar2.f251260a + " audioType: " + aVar2.f251261b + " audioId: " + aVar2.f251262c + " mStreams: " + ((HashMap) C91465c.this.f262214b).size());
        C91464b bVar = (C91464b) ((HashMap) C91465c.this.f262214b).remove(Short.valueOf(aVar2.f251260a));
        if (bVar == null) {
            Log.m105920e("MicroMsg.GameRecordAudioLogic", "[hilive] AbstractAudioOutputListener onStop, not found sessionId: " + aVar2.f251260a + " audioType: " + aVar2.f251261b + " audioId: " + aVar2.f251262c + " mStreams: " + ((HashMap) C91465c.this.f262214b).size());
            return;
        }
        bVar.mo125399c();
    }
}
