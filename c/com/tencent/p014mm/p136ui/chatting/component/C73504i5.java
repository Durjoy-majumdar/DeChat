package com.tencent.p014mm.p136ui.chatting.component;

import android.animation.ValueAnimator;
import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: com.tencent.mm.ui.chatting.component.i5 */
public final class C73504i5 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ TranslateControllerView f215947d;

    public C73504i5(TranslateControllerView translateControllerView) {
        this.f215947d = translateControllerView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        TranslateControllerView translateControllerView = this.f215947d;
        Object animatedValue = valueAnimator.getAnimatedValue();
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) animatedValue).intValue();
        String str = translateControllerView.f215707e;
        Log.m105924i(str, "updateTextViewWidth() called with: w = " + intValue);
        translateControllerView.f215708f = intValue;
        TextView textView = translateControllerView.f215706d;
        if (textView != null) {
            textView.setWidth(intValue);
        }
    }
}
