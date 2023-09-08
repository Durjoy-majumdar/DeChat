package com.tencent.p014mm.plugin.subapp.p109ui.voicetranstext;

import com.tencent.p014mm.plugin.subapp.p109ui.voicetranstext.VoiceTransTextUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: com.tencent.mm.plugin.subapp.ui.voicetranstext.f */
public class C71304f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ VoiceTransTextUI.C712955 f206432d;

    public C71304f(VoiceTransTextUI.C712955 r1) {
        this.f206432d = r1;
    }

    public void run() {
        Log.m105924i("MicroMsg.VoiceTransTextUI", "notify has new trans, so pull");
        MTimerHandler mTimerHandler = VoiceTransTextUI.this.f206405r;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
        VoiceTransTextUI.this.mo98157M7(VoiceTransTextUI.C71301f.GET);
    }
}
