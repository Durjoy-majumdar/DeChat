package com.tencent.p014mm.plugin.finder.webview;

import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.p136ui.widget.MMProcessBar;
import com.tencent.p014mm.plugin.finder.webview.C41647w;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import zs1.C53815m;

/* renamed from: com.tencent.mm.plugin.finder.webview.r */
public final class C41642r implements C41647w.C41649b {

    /* renamed from: a */
    public final /* synthetic */ FinderWebViewScrollViewWrapper f112087a;

    public C41642r(FinderWebViewScrollViewWrapper finderWebViewScrollViewWrapper) {
        this.f112087a = finderWebViewScrollViewWrapper;
    }

    /* renamed from: a */
    public void mo64676a() {
        Log.m105924i("Finder.AdCenterDialog", "onError");
        FinderWebViewScrollViewWrapper finderWebViewScrollViewWrapper = this.f112087a;
        finderWebViewScrollViewWrapper.f111990h = true;
        C53815m mVar = finderWebViewScrollViewWrapper.f111992j;
        mVar.getClass();
        Log.m105924i("Finder.DialogScrollViewHelper", "showRetry");
        RelativeInterceptScrollLayout relativeInterceptScrollLayout = mVar.f151020c;
        if (relativeInterceptScrollLayout != null) {
            relativeInterceptScrollLayout.setVisibility(4);
            View view = mVar.f151023f;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/webview/ad/ScrollWebViewDialogHelper", "showRetry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/webview/ad/ScrollWebViewDialogHelper", "showRetry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                MMProcessBar mMProcessBar = mVar.f151022e;
                if (mMProcessBar != null) {
                    mMProcessBar.mo82304d();
                }
                MMProcessBar mMProcessBar2 = mVar.f151022e;
                if (mMProcessBar2 != null) {
                    mMProcessBar2.setVisibility(8);
                }
                mVar.f151029l.setForceHandleEvent(true);
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
        Log.m105924i("Finder.AdCenterDialog", "onCreateBoxWebViewEnd");
    }

    /* renamed from: c */
    public void mo64678c() {
        Log.m105924i("Finder.AdCenterDialog", "onInitWebViewEnd");
    }

    /* renamed from: d */
    public void mo64679d() {
        Log.m105924i("Finder.AdCenterDialog", "onCreateBoxWebViewStart");
    }

    /* renamed from: e */
    public void mo64680e() {
        Log.m105924i("Finder.AdCenterDialog", "onInitWebViewStart");
    }

    /* renamed from: f */
    public void mo64681f(int i, Bundle bundle) {
        Log.m105924i("Finder.AdCenterDialog", "onExecuteActionCode : actionCode:" + i);
    }

    /* renamed from: g */
    public void mo64682g() {
        FinderWebViewScrollViewWrapper finderWebViewScrollViewWrapper = this.f112087a;
        if (!finderWebViewScrollViewWrapper.f111986d && !finderWebViewScrollViewWrapper.f111990h) {
            finderWebViewScrollViewWrapper.f111986d = true;
            Log.m105925i("Finder.AdCenterDialog", "onWebViewReady showAfterWebViewReady: %b, pendingShow: %b", Boolean.valueOf(finderWebViewScrollViewWrapper.f111988f), Boolean.valueOf(this.f112087a.f111987e));
            FinderWebViewScrollViewWrapper finderWebViewScrollViewWrapper2 = this.f112087a;
            if (!finderWebViewScrollViewWrapper2.f111988f) {
                C53815m mVar = finderWebViewScrollViewWrapper2.f111992j;
                mVar.getClass();
                Log.m105924i("Finder.DialogScrollViewHelper", "showWebView");
                RelativeInterceptScrollLayout relativeInterceptScrollLayout = mVar.f151020c;
                if (relativeInterceptScrollLayout != null) {
                    relativeInterceptScrollLayout.setVisibility(0);
                    View view = mVar.f151023f;
                    if (view != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(8);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/webview/ad/ScrollWebViewDialogHelper", "showWebView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/webview/ad/ScrollWebViewDialogHelper", "showWebView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        MMProcessBar mMProcessBar = mVar.f151022e;
                        if (mMProcessBar != null) {
                            mMProcessBar.mo82304d();
                        }
                        MMProcessBar mMProcessBar2 = mVar.f151022e;
                        if (mMProcessBar2 != null) {
                            mMProcessBar2.setVisibility(8);
                        }
                        mVar.f151029l.setForceHandleEvent(false);
                        return;
                    }
                    C87412m.m108603p("mRetryContainer");
                    throw null;
                }
                C87412m.m108603p("mWebViewContainer");
                throw null;
            } else if (finderWebViewScrollViewWrapper2.f111987e) {
                finderWebViewScrollViewWrapper2.f111987e = false;
                finderWebViewScrollViewWrapper2.mo64759c();
            }
        }
    }
}
