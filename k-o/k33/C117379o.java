package k33;

import com.tencent.p014mm.autogen.events.VoicePrintNoiseDetectResultEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: k33.o */
public class C117379o implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C117380p f351410d;

    public C117379o(C117380p pVar) {
        this.f351410d = pVar;
    }

    public boolean onTimerExpired() {
        C117380p pVar = this.f351410d;
        pVar.f351413c += 100;
        pVar.f351414d += (pVar.f351411a.mo107471d() * 100) / 100;
        C117380p pVar2 = this.f351410d;
        if (pVar2.f351413c < 3000) {
            return true;
        }
        pVar2.getClass();
        Log.m105918d("MicroMsg.VoicePrintNoiseDetector", "onDetectFinish");
        pVar2.f351411a.stopRecord();
        pVar2.f351412b.stopTimer();
        int i = pVar2.f351414d / 30;
        pVar2.f351414d = i;
        boolean z = i >= 30;
        Log.m105919d("MicroMsg.VoicePrintNoiseDetector", "average amplitude: %d, hasNoise:%b", Integer.valueOf(i), Boolean.valueOf(z));
        VoicePrintNoiseDetectResultEvent voicePrintNoiseDetectResultEvent = new VoicePrintNoiseDetectResultEvent();
        voicePrintNoiseDetectResultEvent.f343640d.f343641a = z;
        voicePrintNoiseDetectResultEvent.publish();
        return false;
    }
}
