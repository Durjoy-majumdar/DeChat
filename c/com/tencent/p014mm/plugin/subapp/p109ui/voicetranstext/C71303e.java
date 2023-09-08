package com.tencent.p014mm.plugin.subapp.p109ui.voicetranstext;

import com.tencent.p014mm.plugin.subapp.p109ui.voicetranstext.VoiceTransTextUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: com.tencent.mm.plugin.subapp.ui.voicetranstext.e */
public class C71303e implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ int f206430d;

    /* renamed from: e */
    public final /* synthetic */ VoiceTransTextUI f206431e;

    public C71303e(VoiceTransTextUI voiceTransTextUI, int i) {
        this.f206431e = voiceTransTextUI;
        this.f206430d = i;
    }

    public boolean onTimerExpired() {
        if (this.f206431e.f206407t) {
            return false;
        }
        Log.m105919d("MicroMsg.VoiceTransTextUI", "timmer get, delay:%d", Integer.valueOf(this.f206430d));
        this.f206431e.mo98157M7(VoiceTransTextUI.C71301f.GET);
        return false;
    }
}
