package com.tencent.p014mm.view.drawer;

import android.animation.ValueAnimator;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawerSquares;

/* renamed from: com.tencent.mm.view.drawer.b */
public final class C57907b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ RecyclerViewDrawerSquares f165705d;

    public C57907b(RecyclerViewDrawerSquares recyclerViewDrawerSquares) {
        this.f165705d = recyclerViewDrawerSquares;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Log.m105924i("DrawerSquares", "[openDrawer] setUpdateListener height:" + this.f165705d.getHeight() + ", translationY:" + this.f165705d.getTranslationY());
        RecyclerViewDrawerSquares.C45117c onOpenDrawerListener = this.f165705d.getOnOpenDrawerListener();
        if (onOpenDrawerListener != null) {
            onOpenDrawerListener.mo9497e((this.f165705d.getTranslationY() * 1.0f) / ((float) this.f165705d.getHeight()));
        }
    }
}
