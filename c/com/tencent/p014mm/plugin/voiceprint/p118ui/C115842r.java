package com.tencent.p014mm.plugin.voiceprint.p118ui;

import android.view.animation.Animation;
import com.tencent.p014mm.plugin.voiceprint.p118ui.C115843s;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.voiceprint.ui.r */
public class C115842r implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ C115843s.C115847c f347567a;

    public C115842r(C115843s.C115847c cVar) {
        this.f347567a = cVar;
    }

    public void onAnimationEnd(Animation animation) {
        C115843s.C115847c cVar = this.f347567a;
        if (cVar != null) {
            cVar.mo176340a();
        }
        Log.m105918d("MicroMsg.VoiceViewAnimationHelper", "playTipAnim end");
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
