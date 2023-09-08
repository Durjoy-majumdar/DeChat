package com.tencent.p014mm.plugin.voiceprint.p118ui;

import android.view.animation.Animation;
import com.tencent.p014mm.plugin.voiceprint.p118ui.C115843s;

/* renamed from: com.tencent.mm.plugin.voiceprint.ui.u */
public class C115849u implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ C115843s.C115847c f347574a;

    public C115849u(C115843s.C115847c cVar) {
        this.f347574a = cVar;
    }

    public void onAnimationEnd(Animation animation) {
        C115843s.C115847c cVar = this.f347574a;
        if (cVar != null) {
            cVar.mo176340a();
        }
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
        C115843s.C115847c cVar = this.f347574a;
        if (cVar != null) {
            cVar.mo176341b();
        }
    }
}
