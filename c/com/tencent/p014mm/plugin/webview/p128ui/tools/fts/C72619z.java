package com.tencent.p014mm.plugin.webview.p128ui.tools.fts;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import com.tencent.p014mm.plugin.webview.p128ui.tools.fts.C72603r;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.z */
public class C72619z extends C72603r {

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.z$a */
    public class C72620a implements Animator.AnimatorListener {
        public C72620a() {
        }

        public void onAnimationCancel(Animator animator) {
            C72619z.this.f211239r = false;
        }

        public void onAnimationEnd(Animator animator) {
            C72619z zVar = C72619z.this;
            zVar.f211239r = false;
            C72603r.C72611h hVar = zVar.f211240s;
            if (hVar != null) {
                hVar.onAnimationEnd();
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            C72619z zVar = C72619z.this;
            zVar.f211239r = true;
            C72603r.C72611h hVar = zVar.f211240s;
            if (hVar != null) {
                hVar.onAnimationStart();
            }
        }
    }

    public C72619z(Context context, View view, View view2, View view3, View view4, View view5, View view6, View view7, View view8, View view9, View view10) {
        super(context, view, view2, view3, view4, view5, view6, view7, view8, view9, view10);
    }

    /* renamed from: a */
    public void mo100046a() {
        Log.m105924i("MicroMsg.WebSearch.SosAnimatorController", "search to init");
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        if (this.f211236o[0][0] - ((float) this.f211224c) >= 0.0f) {
            ofFloat.addUpdateListener(this.f211244w);
        } else {
            ofFloat.addUpdateListener(this.f211245x);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat});
        animatorSet.setDuration(300);
        animatorSet.addListener(new C72620a());
        animatorSet.start();
    }
}
