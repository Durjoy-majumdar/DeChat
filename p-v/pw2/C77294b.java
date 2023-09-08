package pw2;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import ou0.C77040d;
import rx3.C13598b0;

/* renamed from: pw2.b */
public final class C77294b extends C77040d {

    /* renamed from: l */
    public C32226l<? super Boolean, C13598b0> f225406l;

    /* renamed from: m */
    public boolean f225407m;

    public C77294b(C32226l<? super Boolean, C13598b0> lVar) {
        C87412m.m108594g(lVar, "onStartRecord");
        this.f225406l = lVar;
    }

    /* renamed from: R */
    public void mo18021R(int i) {
        super.mo18021R(i);
        Log.m105918d("MicroMsg.VoiceRemindRecordAudioManager", " Recorder onAudioDeviceStateChange :" + i);
        if (!this.f225407m) {
            this.f225407m = true;
            this.f225406l.invoke(Boolean.TRUE);
        }
    }
}
