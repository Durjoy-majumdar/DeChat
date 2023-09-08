package com.tencent.p014mm.plugin.webview.p128ui.tools.fts;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.tencent.p014mm.plugin.webview.p128ui.tools.fts.C72603r;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.y */
public class C72618y extends C72603r {
    public C72618y(Context context, View view, View view2, View view3, View view4, View view5, View view6, View view7, View view8, View view9, View view10) {
        super(context, view, view2, view3, view4, view5, view6, view7, view8, view9, view10);
    }

    /* renamed from: a */
    public void mo100045a(C72603r.C43975i iVar) {
        if (iVar != this.f211238q) {
            int ordinal = iVar.ordinal();
            if (ordinal == 0) {
                Log.m105924i("MicroMsg.WebSearch.SosAnimatorController", "searchToInit");
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                if (this.f211236o[0][0] - ((float) this.f211224c) >= 0.0f) {
                    ofFloat.addUpdateListener(this.f211244w);
                } else {
                    ofFloat.addUpdateListener(this.f211245x);
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f211233l, "alpha", new float[]{0.0f, 1.0f});
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.setDuration(300);
                animatorSet.addListener(new C72616w(this));
                animatorSet.start();
            } else if (ordinal == 1) {
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                if (this.f211236o[0][0] - ((float) this.f211224c) >= 0.0f) {
                    ofFloat3.addUpdateListener(this.f211242u);
                } else {
                    ofFloat3.addUpdateListener(this.f211243v);
                }
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f211233l, "alpha", new float[]{1.0f, 0.0f});
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(new Animator[]{ofFloat3, ofFloat4});
                animatorSet2.setInterpolator(new DecelerateInterpolator());
                animatorSet2.setDuration(300);
                animatorSet2.addListener(new C72617x(this));
                animatorSet2.start();
            }
        }
    }
}
