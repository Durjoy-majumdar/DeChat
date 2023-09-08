package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.content.DialogInterface;
import android.view.Window;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.finder.webview.C41646v;
import com.tencent.p014mm.plugin.finder.webview.FinderWebViewHelper;
import com.tencent.p014mm.plugin.finder.webview.RelativeInterceptScrollLayout;
import com.tencent.p014mm.plugin.scanner.MultiCodeMaskView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import java.util.UUID;
import o40.C61926c;
import rx3.C13598b0;
import te3.C52267zi;
import zs1.C53806d;
import zs1.C53812i;

/* renamed from: com.tencent.mm.plugin.finder.view.j */
public final class C41592j implements C41646v {

    /* renamed from: a */
    public final C53806d f111953a;

    /* renamed from: b */
    public MMWebView f111954b;

    /* renamed from: c */
    public boolean f111955c;

    /* renamed from: d */
    public boolean f111956d;

    /* renamed from: e */
    public boolean f111957e;

    /* renamed from: f */
    public DialogInterface.OnDismissListener f111958f;

    /* renamed from: g */
    public final C41569c f111959g;

    /* renamed from: h */
    public final FinderWebViewHelper f111960h;

    public C41592j(C53806d dVar, String str) {
        C87412m.m108594g(dVar, "dialog");
        C87412m.m108594g(str, "url");
        this.f111953a = dVar;
        C41569c cVar = new C41569c(dVar, dVar.mo74379e());
        this.f111959g = cVar;
        Context context = dVar.getContext();
        C87412m.m108593f(context, "dialog.context");
        C52267zi ziVar = new C52267zi();
        ziVar.f145967e = UUID.randomUUID().toString();
        ziVar.f145968f = str;
        C13598b0 b0Var = C13598b0.f38549a;
        FinderWebViewHelper finderWebViewHelper = new FinderWebViewHelper(context, ziVar, (Window) null, 0, 12, (C8480h) null);
        finderWebViewHelper.setDialogWindow(dVar.getWindow());
        MultiCodeMaskView multiCodeMaskView = cVar.f111895h;
        if (multiCodeMaskView != null) {
            finderWebViewHelper.setCodeMaskView(multiCodeMaskView);
            this.f111960h = finderWebViewHelper;
            finderWebViewHelper.addWebViewStateListener(new C41582h(this));
            this.f111954b = finderWebViewHelper.getWithInitWebView();
            C61926c.m72668M(new C41585i(this));
            Window window = dVar.getWindow();
            if (window != null) {
                window.setWindowAnimations(C0966R.style.a16);
            }
            dVar.setOnDismissListener(new C41578f(this));
            MMWebView mMWebView = this.f111954b;
            C87412m.m108591d(mMWebView);
            cVar.f111890c = mMWebView;
            mMWebView.f122362o.add(new C41567b(cVar));
            RelativeInterceptScrollLayout relativeInterceptScrollLayout = cVar.f111889b;
            if (relativeInterceptScrollLayout != null) {
                relativeInterceptScrollLayout.addView(cVar.f111890c, new RelativeLayout.LayoutParams(-1, -1));
                MMWebView mMWebView2 = cVar.f111890c;
                if (mMWebView2 != null) {
                    mMWebView2.setWebViewCallbackClient(cVar.f111898k);
                }
                cVar.f111897j = new C41580g(this);
                return;
            }
            C87412m.m108603p("mWebViewContainer");
            throw null;
        }
        C87412m.m108603p("codeMaskView");
        throw null;
    }

    /* renamed from: a */
    public C53812i mo64703a() {
        return this.f111953a;
    }

    /* renamed from: b */
    public void mo64704b() {
        Log.m105919d("Finder.AnnounceWebViewDialogWrapper", "dismissDialog isShowing: %b, isAttachedToWindow: %b, exitType: %s", Boolean.valueOf(this.f111953a.isShowing()), Boolean.FALSE, 1);
        if (this.f111953a.isShowing()) {
            this.f111953a.mo74373c();
        }
    }
}
