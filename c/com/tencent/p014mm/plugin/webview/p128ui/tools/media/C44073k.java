package com.tencent.p014mm.plugin.webview.p128ui.tools.media;

import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.tencent.p014mm.p136ui.tools.C45059m0;
import com.tencent.p014mm.p136ui.tools.C45072n0;
import com.tencent.p014mm.p136ui.tools.C45073o0;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.k */
public final class C44073k implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public final /* synthetic */ MPVideoPlayFullScreenView f119415d;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.k$a */
    public static final class C44074a implements C45059m0.C45068i {

        /* renamed from: a */
        public final /* synthetic */ MPVideoPlayFullScreenView f119416a;

        public C44074a(MPVideoPlayFullScreenView mPVideoPlayFullScreenView) {
            this.f119416a = mPVideoPlayFullScreenView;
        }

        public void onAnimationEnd() {
            MPVideoPlayFullScreenView.m48335c(this.f119416a);
        }

        public void onAnimationStart() {
        }
    }

    public C44073k(MPVideoPlayFullScreenView mPVideoPlayFullScreenView) {
        this.f119415d = mPVideoPlayFullScreenView;
    }

    public void onGlobalLayout() {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        Log.m105918d(this.f119415d.f119353d, "runEnterAnimation");
        ViewGroup viewGroup = this.f119415d.f119357h;
        if (!(viewGroup == null || (viewTreeObserver2 = viewGroup.getViewTreeObserver()) == null)) {
            viewTreeObserver2.removeOnGlobalLayoutListener(this);
        }
        ViewGroup viewGroup2 = this.f119415d.f119357h;
        Integer valueOf = viewGroup2 != null ? Integer.valueOf(viewGroup2.getHeight()) : null;
        C87412m.m108591d(valueOf);
        if (valueOf.intValue() <= 0) {
            MPVideoPlayFullScreenView mPVideoPlayFullScreenView = this.f119415d;
            ViewGroup viewGroup3 = mPVideoPlayFullScreenView.f119357h;
            if (viewGroup3 != null && (viewTreeObserver = viewGroup3.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnGlobalLayoutListener(new C44073k(mPVideoPlayFullScreenView));
                return;
            }
            return;
        }
        MPVideoPlayFullScreenView mPVideoPlayFullScreenView2 = this.f119415d;
        C45059m0 m0Var = mPVideoPlayFullScreenView2.f119333C;
        if (m0Var != null) {
            View view = mPVideoPlayFullScreenView2.f119360n;
            C87412m.m108591d(view);
            View view2 = mPVideoPlayFullScreenView2.f119354e;
            ViewGroup viewGroup4 = mPVideoPlayFullScreenView2.f119357h;
            C87412m.m108591d(viewGroup4);
            view.setOnTouchListener(new C45073o0(m0Var, new GestureDetector(m0Var.f122221a, new C45072n0(m0Var)), view, view2, viewGroup4, (C45059m0.C45068i) null));
        }
        C45059m0 m0Var2 = mPVideoPlayFullScreenView2.f119333C;
        if (m0Var2 != null) {
            m0Var2.f122220H = new C44069f(mPVideoPlayFullScreenView2);
        }
        if (m0Var2 != null) {
            m0Var2.f122217E = new C44070g(mPVideoPlayFullScreenView2);
        }
        if (m0Var2 != null) {
            m0Var2.f122218F = new C44071h(mPVideoPlayFullScreenView2);
        }
        if (m0Var2 != null) {
            m0Var2.f122219G = new C44072i(mPVideoPlayFullScreenView2);
        }
        View view3 = mPVideoPlayFullScreenView2.f119360n;
        if (view3 != null) {
            view3.setOnClickListener(C6359j.f23274d);
        }
        MPVideoPlayFullScreenView mPVideoPlayFullScreenView3 = this.f119415d;
        C45059m0 m0Var3 = mPVideoPlayFullScreenView3.f119333C;
        if (m0Var3 != null) {
            ViewGroup viewGroup5 = mPVideoPlayFullScreenView3.f119357h;
            C87412m.m108591d(viewGroup5);
            m0Var3.mo70408c(viewGroup5, (View) null, new C44074a(this.f119415d));
        }
    }
}
