package com.tencent.p014mm.p136ui.widget.cedit.edit;

import android.animation.ValueAnimator;
import android.os.Build;
import com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a;

/* renamed from: com.tencent.mm.ui.widget.cedit.edit.b */
public class C106799b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C106778a.C106793m f319533d;

    public C106799b(C106778a.C106793m mVar) {
        this.f319533d = mVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        C106778a.C106793m mVar = this.f319533d;
        float f = mVar.f319491d;
        mVar.f319493f = f + ((mVar.f319495h - f) * valueAnimator.getAnimatedFraction());
        C106778a.C106793m mVar2 = this.f319533d;
        float f2 = mVar2.f319492e;
        mVar2.f319494g = f2 + ((mVar2.f319496i - f2) * valueAnimator.getAnimatedFraction());
        if (Build.VERSION.SDK_INT >= 28) {
            C106778a.C106793m mVar3 = this.f319533d;
            mVar3.f319488a.show(mVar3.f319493f, mVar3.f319494g);
        }
    }
}
