package com.tencent.p014mm.plugin.webview.p128ui.tools.fts;

import android.animation.Animator;
import com.tencent.p014mm.plugin.webview.p128ui.tools.fts.C72603r;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.s */
public class C72612s implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ C72615v f211257d;

    public C72612s(C72615v vVar) {
        this.f211257d = vVar;
    }

    public void onAnimationCancel(Animator animator) {
        this.f211257d.f211239r = false;
    }

    public void onAnimationEnd(Animator animator) {
        C72615v vVar = this.f211257d;
        vVar.f211239r = false;
        C72603r.C72611h hVar = vVar.f211240s;
        if (hVar != null) {
            hVar.onAnimationEnd();
        }
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        C72615v vVar = this.f211257d;
        vVar.f211239r = true;
        C72603r.C72611h hVar = vVar.f211240s;
        if (hVar != null) {
            hVar.onAnimationStart();
        }
    }
}
