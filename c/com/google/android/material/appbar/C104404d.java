package com.google.android.material.appbar;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;
import com.tencent.p014mm.C0966R;

/* renamed from: com.google.android.material.appbar.d */
public class C104404d {

    /* renamed from: a */
    public static final int[] f309117a = {16843848};

    /* renamed from: a */
    public static void m139474a(View view, float f) {
        int integer = view.getResources().getInteger(C0966R.integer.f6215e);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = (long) integer;
        stateListAnimator.addState(new int[]{16842766, C0966R.attr.a26, -2130969692}, ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(j));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(view, "elevation", new float[]{f}).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(0));
        view.setStateListAnimator(stateListAnimator);
    }
}
