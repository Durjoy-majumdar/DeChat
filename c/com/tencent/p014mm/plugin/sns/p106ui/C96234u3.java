package com.tencent.p014mm.plugin.sns.p106ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.u3 */
public class C96234u3 extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ SnsBaseGalleryUI f281205d;

    public C96234u3(SnsBaseGalleryUI snsBaseGalleryUI) {
        this.f281205d = snsBaseGalleryUI;
    }

    public void onAnimationEnd(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$7");
        SnsBaseGalleryUI.m121912J7(this.f281205d).setAlpha(0.0f);
        SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$7");
    }

    public void onAnimationStart(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$7");
        SnsBaseGalleryUI.m121912J7(this.f281205d).setAlpha(0.0f);
        SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$7");
    }
}
