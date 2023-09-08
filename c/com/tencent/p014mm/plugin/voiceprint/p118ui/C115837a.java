package com.tencent.p014mm.plugin.voiceprint.p118ui;

import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.plugin.voiceprint.ui.a */
public class C115837a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ BaseVoicePrintUI f347563d;

    public C115837a(BaseVoicePrintUI baseVoicePrintUI) {
        this.f347563d = baseVoicePrintUI;
    }

    public void run() {
        this.f347563d.f347490h.setErr((int) C0966R.string.kdk);
        this.f347563d.f347490h.mo176351c();
        VoicePrintVolumeMeter voicePrintVolumeMeter = this.f347563d.f347489g;
        voicePrintVolumeMeter.f347550q = false;
        voicePrintVolumeMeter.f347549p = -1.0f;
        voicePrintVolumeMeter.f347551r = false;
        voicePrintVolumeMeter.f347548o = 0.0f;
        voicePrintVolumeMeter.postInvalidate();
        voicePrintVolumeMeter.f347551r = false;
        voicePrintVolumeMeter.f347545i.stopTimer();
        voicePrintVolumeMeter.postInvalidate();
    }
}
