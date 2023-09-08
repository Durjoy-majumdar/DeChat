package j33;

import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import gy3.C87412m;

/* renamed from: j33.a */
public final class C108550a extends MMHandler {

    /* renamed from: a */
    public final /* synthetic */ C108551b f324934a;

    public C108550a(C108551b bVar) {
        this.f324934a = bVar;
    }

    public void handleMessage(Message message) {
        C87412m.m108594g(message, "msg");
        Log.m105918d("MicroMsg.VoicePrintRecorderAudioManager", " Recorder handleMessage");
        C108551b bVar = this.f324934a;
        if (!bVar.f324937n) {
            bVar.mo161477T("record");
            this.f324934a.mo18021R(200);
        }
    }
}
