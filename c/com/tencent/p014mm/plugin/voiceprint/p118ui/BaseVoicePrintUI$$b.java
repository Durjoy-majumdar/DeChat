package com.tencent.p014mm.plugin.voiceprint.p118ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import k33.C117381q;
import kd0.C99125s;

/* renamed from: com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI$$b */
public class BaseVoicePrintUI$$b implements C117381q.C117383b {

    /* renamed from: a */
    public final /* synthetic */ BaseVoicePrintUI f347502a;

    public BaseVoicePrintUI$$b(BaseVoicePrintUI baseVoicePrintUI) {
        this.f347502a = baseVoicePrintUI;
    }

    /* renamed from: a */
    public void mo176329a() {
        C117381q qVar = this.f347502a.f347491i;
        C99125s sVar = qVar.f351416a;
        if (sVar != null) {
            sVar.stopRecord();
            Log.m105920e("MicroMsg.VoicePrintRecoder", "Reset recorder.stopReocrd");
        }
        qVar.f351418c = "";
        qVar.f351420e = 0;
        qVar.f351419d = 0;
        qVar.f351422g.mo159435d0(true);
        Log.m105920e("MicroMsg.BaseVoicePrintUI", "record stop on error");
        BaseVoicePrintUI baseVoicePrintUI = this.f347502a;
        baseVoicePrintUI.f347493n = null;
        MMHandlerThread.postToMainThread(new C115837a(baseVoicePrintUI));
    }
}
