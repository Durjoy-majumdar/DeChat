package com.tencent.p014mm.plugin.finder.view;

import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.p136ui.widget.MMProcessBar;
import com.tencent.p014mm.plugin.finder.webview.C41647w;
import com.tencent.p014mm.plugin.finder.webview.RelativeInterceptScrollLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.finder.view.h */
public final class C41582h implements C41647w.C41649b {

    /* renamed from: a */
    public final /* synthetic */ C41592j f111927a;

    public C41582h(C41592j jVar) {
        this.f111927a = jVar;
    }

    /* renamed from: a */
    public void mo64676a() {
        Log.m105924i("Finder.AnnounceWebViewDialogWrapper", "onError");
        C41592j jVar = this.f111927a;
        jVar.f111957e = true;
        C41569c cVar = jVar.f111959g;
        cVar.getClass();
        Log.m105924i("Finder.AnnounceWebViewDialogHelper", "showRetry");
        RelativeInterceptScrollLayout relativeInterceptScrollLayout = cVar.f111889b;
        if (relativeInterceptScrollLayout != null) {
            relativeInterceptScrollLayout.setVisibility(4);
            View view = cVar.f111892e;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/AnnounceWebViewDialogHelper", "showRetry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/AnnounceWebViewDialogHelper", "showRetry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                MMProcessBar mMProcessBar = cVar.f111891d;
                if (mMProcessBar != null) {
                    mMProcessBar.mo82304d();
                }
                MMProcessBar mMProcessBar2 = cVar.f111891d;
                if (mMProcessBar2 != null) {
                    mMProcessBar2.setVisibility(8);
                    return;
                }
                return;
            }
            C87412m.m108603p("mRetryContainer");
            throw null;
        }
        C87412m.m108603p("mWebViewContainer");
        throw null;
    }

    /* renamed from: b */
    public void mo64677b(boolean z, boolean z2, boolean z3) {
        Log.m105924i("Finder.AnnounceWebViewDialogWrapper", "onCreateBoxWebViewEnd");
    }

    /* renamed from: c */
    public void mo64678c() {
        Log.m105924i("Finder.AnnounceWebViewDialogWrapper", "onInitWebViewEnd");
    }

    /* renamed from: d */
    public void mo64679d() {
        Log.m105924i("Finder.AnnounceWebViewDialogWrapper", "onCreateBoxWebViewStart");
    }

    /* renamed from: e */
    public void mo64680e() {
        Log.m105924i("Finder.AnnounceWebViewDialogWrapper", "onInitWebViewStart");
    }

    /* renamed from: f */
    public void mo64681f(int i, Bundle bundle) {
        Log.m105924i("Finder.AnnounceWebViewDialogWrapper", "onExecuteActionCode : actionCode:" + i);
    }

    /* renamed from: g */
    public void mo64682g() {
        C41592j jVar = this.f111927a;
        if (!jVar.f111955c && !jVar.f111957e) {
            jVar.f111955c = true;
            jVar.getClass();
            Log.m105925i("Finder.AnnounceWebViewDialogWrapper", "onWebViewReady showAfterWebViewReady: %b, pendingShow: %b", Boolean.FALSE, Boolean.valueOf(this.f111927a.f111956d));
            this.f111927a.getClass();
            C41569c cVar = this.f111927a.f111959g;
            cVar.getClass();
            Log.m105924i("Finder.AnnounceWebViewDialogHelper", "showWebView");
            RelativeInterceptScrollLayout relativeInterceptScrollLayout = cVar.f111889b;
            if (relativeInterceptScrollLayout != null) {
                relativeInterceptScrollLayout.setVisibility(0);
                View view = cVar.f111892e;
                if (view != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/AnnounceWebViewDialogHelper", "showWebView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/AnnounceWebViewDialogHelper", "showWebView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    MMProcessBar mMProcessBar = cVar.f111891d;
                    if (mMProcessBar != null) {
                        mMProcessBar.mo82304d();
                    }
                    MMProcessBar mMProcessBar2 = cVar.f111891d;
                    if (mMProcessBar2 != null) {
                        mMProcessBar2.setVisibility(8);
                        return;
                    }
                    return;
                }
                C87412m.m108603p("mRetryContainer");
                throw null;
            }
            C87412m.m108603p("mWebViewContainer");
            throw null;
        }
    }
}
