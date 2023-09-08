package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import android.view.animation.Animation;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.c1 */
public final class C44244c1 implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ C44366w0 f119896a;

    public C44244c1(C44366w0 w0Var) {
        this.f119896a = w0Var;
    }

    public void onAnimationEnd(Animation animation) {
        C87412m.m108594g(animation, "ani");
        C44366w0 w0Var = this.f119896a.getWeakThis$plugin_webview_release().get();
        C87412m.m108592e(w0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.widget.MPWriteCommentLayout");
        w0Var.setVisibility(8);
        this.f119896a.f120235B.clearAnimation();
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
