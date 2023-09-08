package com.tencent.p014mm.p136ui.conversation;

import android.animation.ValueAnimator;
import android.view.View;
import lt0.C76723a;

/* renamed from: com.tencent.mm.ui.conversation.q */
public class C74738q implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C76723a f219770d;

    /* renamed from: e */
    public final /* synthetic */ View f219771e;

    /* renamed from: f */
    public final /* synthetic */ C74720p f219772f;

    public C74738q(C74720p pVar, C76723a aVar, View view) {
        this.f219772f = pVar;
        this.f219770d = aVar;
        this.f219771e = view;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int a = this.f219770d.mo107002a(((Float) valueAnimator.getAnimatedValue("ratio")).floatValue());
        this.f219771e.setBackgroundColor(a);
        this.f219772f.f219707U.setColor(a);
    }
}
