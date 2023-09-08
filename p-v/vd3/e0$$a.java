package vd3;

import com.tencent.p014mm.pluginsdk.p133ui.VoiceInputFooter;

public final /* synthetic */ class e0$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ VoiceInputFooter f65445d;

    public /* synthetic */ e0$$a(VoiceInputFooter voiceInputFooter) {
        this.f65445d = voiceInputFooter;
    }

    public final void run() {
        VoiceInputFooter voiceInputFooter = this.f65445d;
        voiceInputFooter.f55015v = true;
        voiceInputFooter.f55008o.mo100197i();
        voiceInputFooter.f55008o.setVisibility(0);
    }
}
