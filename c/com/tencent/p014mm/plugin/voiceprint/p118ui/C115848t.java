package com.tencent.p014mm.plugin.voiceprint.p118ui;

import android.view.animation.Animation;
import com.tencent.p014mm.plugin.voiceprint.p118ui.C115843s;

/* renamed from: com.tencent.mm.plugin.voiceprint.ui.t */
public class C115848t implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ C115843s.C115847c f347573a;

    public C115848t(C115843s.C115847c cVar) {
        this.f347573a = cVar;
    }

    public void onAnimationEnd(Animation animation) {
        C115843s.C115847c cVar = this.f347573a;
        if (cVar != null) {
            cVar.mo176340a();
        }
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
