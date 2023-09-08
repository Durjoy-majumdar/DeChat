package com.tencent.p014mm.p136ui.chatting.component;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: com.tencent.mm.ui.chatting.component.j5 */
public final class C73508j5 extends C87413o implements C32224a<ValueAnimator> {

    /* renamed from: d */
    public final /* synthetic */ TranslateControllerView f215950d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73508j5(TranslateControllerView translateControllerView) {
        super(0);
        this.f215950d = translateControllerView;
    }

    public Object invoke() {
        ValueAnimator valueAnimator = new ValueAnimator();
        TranslateControllerView translateControllerView = this.f215950d;
        valueAnimator.setInterpolator(new DecelerateInterpolator());
        valueAnimator.setDuration(200);
        valueAnimator.addUpdateListener(new C73504i5(translateControllerView));
        return valueAnimator;
    }
}
