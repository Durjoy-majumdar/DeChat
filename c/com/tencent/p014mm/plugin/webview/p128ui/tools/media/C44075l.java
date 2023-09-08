package com.tencent.p014mm.plugin.webview.p128ui.tools.media;

import android.content.Context;
import android.view.ViewGroup;
import com.tencent.p014mm.p136ui.tools.C45059m0;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.l */
public final class C44075l implements C45059m0.C45068i {

    /* renamed from: a */
    public final /* synthetic */ MPVideoPlayFullScreenView f119417a;

    /* renamed from: b */
    public final /* synthetic */ C45059m0.C45068i f119418b;

    /* renamed from: c */
    public final /* synthetic */ ViewGroup.LayoutParams f119419c;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.l$a */
    public static final class C44076a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MPVideoPlayFullScreenView f119420d;

        /* renamed from: e */
        public final /* synthetic */ ViewGroup.LayoutParams f119421e;

        public C44076a(MPVideoPlayFullScreenView mPVideoPlayFullScreenView, ViewGroup.LayoutParams layoutParams) {
            this.f119420d = mPVideoPlayFullScreenView;
            this.f119421e = layoutParams;
        }

        public final void run() {
            Context context = this.f119420d.getContext();
            if ((context instanceof WebViewUI) && ((WebViewUI) context).f118523f != null) {
                Context context2 = this.f119420d.getContext();
                C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
                ((WebViewUI) context2).f118523f.leaveFullscreen();
            }
            this.f119420d.f119354e.setLayoutParams(this.f119421e);
        }
    }

    public C44075l(MPVideoPlayFullScreenView mPVideoPlayFullScreenView, C45059m0.C45068i iVar, ViewGroup.LayoutParams layoutParams) {
        this.f119417a = mPVideoPlayFullScreenView;
        this.f119418b = iVar;
        this.f119419c = layoutParams;
    }

    public void onAnimationEnd() {
        C45059m0.C45068i iVar = this.f119418b;
        if (iVar != null) {
            iVar.onAnimationEnd();
        }
        MPVideoPlayFullScreenView mPVideoPlayFullScreenView = this.f119417a;
        mPVideoPlayFullScreenView.f119354e.post(new C44076a(mPVideoPlayFullScreenView, this.f119419c));
        MPVideoPlayFullScreenView mPVideoPlayFullScreenView2 = this.f119417a;
        mPVideoPlayFullScreenView2.f119349T = false;
        mPVideoPlayFullScreenView2.mo68673n();
    }

    public void onAnimationStart() {
        this.f119417a.f119349T = true;
        C45059m0.C45068i iVar = this.f119418b;
        if (iVar != null) {
            iVar.onAnimationStart();
        }
    }
}
