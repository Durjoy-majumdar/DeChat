package com.tencent.p014mm.plugin.p081mv.p082ui.shake;

import android.view.animation.Animation;

/* renamed from: com.tencent.mm.plugin.mv.ui.shake.h */
public class C56972h implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ MusicMainUINew f163178a;

    public C56972h(MusicMainUINew musicMainUINew) {
        this.f163178a = musicMainUINew;
    }

    public void onAnimationEnd(Animation animation) {
        this.f163178a.f163139B.dead();
        this.f163178a.finish();
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
