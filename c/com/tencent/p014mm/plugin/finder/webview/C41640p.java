package com.tencent.p014mm.plugin.finder.webview;

import android.content.DialogInterface;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.WebViewCallbackClient;

/* renamed from: com.tencent.mm.plugin.finder.webview.p */
public final class C41640p implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ FinderWebViewScrollViewWrapper f112085d;

    public C41640p(FinderWebViewScrollViewWrapper finderWebViewScrollViewWrapper) {
        this.f112085d = finderWebViewScrollViewWrapper;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C39623j lifecycle;
        FinderWebViewScrollViewWrapper finderWebViewScrollViewWrapper = this.f112085d;
        finderWebViewScrollViewWrapper.getClass();
        Log.m105924i("Finder.AdCenterDialog", "onDismiss");
        FinderWebViewScrollViewWrapper.f111982m = false;
        DialogInterface.OnDismissListener onDismissListener = finderWebViewScrollViewWrapper.f111991i;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(finderWebViewScrollViewWrapper.f111984b);
        }
        MMWebView mMWebView = finderWebViewScrollViewWrapper.f111992j.f151021d;
        if (mMWebView != null) {
            mMWebView.setWebViewCallbackClient((WebViewCallbackClient) null);
        }
        MMActivity mMActivity = finderWebViewScrollViewWrapper.f111989g;
        if (!(mMActivity == null || (lifecycle = mMActivity.getLifecycle()) == null)) {
            lifecycle.removeObserver(finderWebViewScrollViewWrapper.f111994l);
        }
        finderWebViewScrollViewWrapper.f111987e = false;
        C41647w wVar = finderWebViewScrollViewWrapper.f111993k;
        if (wVar != null) {
            wVar.release();
        }
    }
}
