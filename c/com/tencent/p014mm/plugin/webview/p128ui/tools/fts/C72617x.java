package com.tencent.p014mm.plugin.webview.p128ui.tools.fts;

import android.animation.Animator;
import com.tencent.p014mm.plugin.webview.p128ui.tools.fts.C72603r;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.x */
public class C72617x implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ C72618y f211261d;

    public C72617x(C72618y yVar) {
        this.f211261d = yVar;
    }

    public void onAnimationCancel(Animator animator) {
        this.f211261d.f211239r = false;
    }

    public void onAnimationEnd(Animator animator) {
        C72618y yVar = this.f211261d;
        yVar.f211239r = false;
        C72603r.C72611h hVar = yVar.f211240s;
        if (hVar != null) {
            hVar.onAnimationEnd();
        }
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        C72618y yVar = this.f211261d;
        yVar.f211239r = true;
        C72603r.C72611h hVar = yVar.f211240s;
        if (hVar != null) {
            hVar.onAnimationStart();
        }
    }
}
