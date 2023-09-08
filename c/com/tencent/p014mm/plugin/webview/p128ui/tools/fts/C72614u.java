package com.tencent.p014mm.plugin.webview.p128ui.tools.fts;

import android.animation.Animator;
import com.tencent.p014mm.plugin.webview.p128ui.tools.fts.C72603r;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.u */
public class C72614u implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ C72615v f211259d;

    public C72614u(C72615v vVar) {
        this.f211259d = vVar;
    }

    public void onAnimationCancel(Animator animator) {
        this.f211259d.f211239r = false;
    }

    public void onAnimationEnd(Animator animator) {
        C72615v vVar = this.f211259d;
        vVar.f211239r = false;
        C72603r.C72611h hVar = vVar.f211240s;
        if (hVar != null) {
            hVar.onAnimationEnd();
        }
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        C72615v vVar = this.f211259d;
        vVar.f211239r = true;
        C72603r.C72611h hVar = vVar.f211240s;
        if (hVar != null) {
            hVar.onAnimationStart();
        }
    }
}
