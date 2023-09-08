package pw2;

import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import gy3.C87412m;

/* renamed from: pw2.a */
public final class C77293a extends MMHandler {

    /* renamed from: a */
    public final /* synthetic */ C77294b f225405a;

    public C77293a(C77294b bVar) {
        this.f225405a = bVar;
    }

    public void handleMessage(Message message) {
        C87412m.m108594g(message, "msg");
        Log.m105918d("MicroMsg.VoiceRemindRecordAudioManager", " Recorder handleMessage");
        C77294b bVar = this.f225405a;
        if (!bVar.f225407m) {
            bVar.mo18021R(200);
            this.f225405a.mo161477T("record");
        }
    }
}
