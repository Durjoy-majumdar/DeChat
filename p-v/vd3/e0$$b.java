package vd3;

import com.tencent.p014mm.pluginsdk.p133ui.VoiceInputFooter;
import com.tencent.p014mm.pluginsdk.p133ui.chat.VoiceInputPanel;

public final /* synthetic */ class e0$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ VoiceInputFooter f65446d;

    public /* synthetic */ e0$$b(VoiceInputFooter voiceInputFooter) {
        this.f65446d = voiceInputFooter;
    }

    public final void run() {
        VoiceInputPanel voiceInputPanel = this.f65446d.f55009p;
        if (voiceInputPanel != null) {
            voiceInputPanel.setVisibility(0);
        }
    }
}
