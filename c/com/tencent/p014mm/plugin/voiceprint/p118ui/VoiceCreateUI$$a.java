package com.tencent.p014mm.plugin.voiceprint.p118ui;

import android.view.MenuItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import k33.C117380p;

/* renamed from: com.tencent.mm.plugin.voiceprint.ui.VoiceCreateUI$$a */
public final /* synthetic */ class VoiceCreateUI$$a implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ VoiceCreateUI f347526d;

    public /* synthetic */ VoiceCreateUI$$a(VoiceCreateUI voiceCreateUI) {
        this.f347526d = voiceCreateUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        VoiceCreateUI voiceCreateUI = this.f347526d;
        int i = VoiceCreateUI.f347516E;
        voiceCreateUI.mo176336P7();
        C117380p pVar = voiceCreateUI.f347522x;
        pVar.getClass();
        Log.m105918d("MicroMsg.VoicePrintNoiseDetector", "stopDetect");
        pVar.f351411a.stopRecord();
        pVar.f351412b.stopTimer();
        voiceCreateUI.finish();
        return true;
    }
}
