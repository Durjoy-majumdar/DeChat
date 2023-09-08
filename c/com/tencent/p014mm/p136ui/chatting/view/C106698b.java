package com.tencent.p014mm.p136ui.chatting.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.ui.chatting.view.b */
public final class C106698b implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ FoldableCellLayout f318997d;

    /* renamed from: e */
    public final /* synthetic */ C32224a<C13598b0> f318998e;

    /* renamed from: f */
    public final /* synthetic */ AnimatorSet f318999f;

    /* renamed from: com.tencent.mm.ui.chatting.view.b$a */
    public static final class C106699a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FoldableCellLayout f319000d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f319001e;

        public C106699a(FoldableCellLayout foldableCellLayout, C32224a<C13598b0> aVar) {
            this.f319000d = foldableCellLayout;
            this.f319001e = aVar;
        }

        public final void run() {
            FoldableCellLayout foldableCellLayout = this.f319000d;
            if (foldableCellLayout.f318984h && !foldableCellLayout.f318985i) {
                Log.m105924i(foldableCellLayout.f318980d, "reset anim params by post delay");
                this.f319000d.f318991r.clear();
                this.f319000d.f318992s.clear();
                FoldableCellLayout foldableCellLayout2 = this.f319000d;
                foldableCellLayout2.f318984h = false;
                foldableCellLayout2.f318985i = true;
                C32224a<C13598b0> aVar = this.f319001e;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
        }
    }

    public C106698b(FoldableCellLayout foldableCellLayout, C32224a<C13598b0> aVar, AnimatorSet animatorSet) {
        this.f318997d = foldableCellLayout;
        this.f318998e = aVar;
        this.f318999f = animatorSet;
    }

    public void onAnimationCancel(Animator animator) {
        Log.m105924i(this.f318997d.f318980d, "onAnimationCancel");
        FoldableCellLayout foldableCellLayout = this.f318997d;
        foldableCellLayout.f318984h = false;
        foldableCellLayout.f318985i = true;
    }

    public void onAnimationEnd(Animator animator) {
        Log.m105924i(this.f318997d.f318980d, "onAnimationEnd");
        this.f318997d.f318991r.clear();
        this.f318997d.f318992s.clear();
        FoldableCellLayout foldableCellLayout = this.f318997d;
        foldableCellLayout.f318984h = false;
        foldableCellLayout.f318985i = true;
        C32224a<C13598b0> aVar = this.f318998e;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        Log.m105924i(this.f318997d.f318980d, "onAnimationStart");
        Iterator it = ((ArrayList) this.f318997d.f318992s).iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            FoldableCellLayout foldableCellLayout = this.f318997d;
            PorterDuff.Mode mode = PorterDuff.Mode.DST;
            foldableCellLayout.getClass();
            C87412m.m108594g(view, "<this>");
            C87412m.m108594g(mode, "tintMode");
            Drawable background = view.getBackground();
            if (background != null) {
                background.setTintMode(mode);
            }
        }
        FoldableCellLayout foldableCellLayout2 = this.f318997d;
        foldableCellLayout2.f318984h = true;
        foldableCellLayout2.f318985i = false;
        foldableCellLayout2.postDelayed(new C106699a(foldableCellLayout2, this.f318998e), this.f318999f.getDuration() + ((long) 100));
    }
}
