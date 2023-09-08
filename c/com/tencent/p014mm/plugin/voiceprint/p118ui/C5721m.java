package com.tencent.p014mm.plugin.voiceprint.p118ui;

import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;

/* renamed from: com.tencent.mm.plugin.voiceprint.ui.m */
public final class C5721m implements MMSwitchBtn.C7041b {

    /* renamed from: a */
    public final /* synthetic */ VoicePrintStateSettingUI f21736a;

    public C5721m(VoicePrintStateSettingUI voicePrintStateSettingUI) {
        this.f21736a = voicePrintStateSettingUI;
    }

    public final void onStatusChange(boolean z) {
        VoicePrintStateSettingUI voicePrintStateSettingUI = this.f21736a;
        int i = VoicePrintStateSettingUI.f21709f;
        voicePrintStateSettingUI.mo6732I7(z ? 1 : 2);
    }
}
