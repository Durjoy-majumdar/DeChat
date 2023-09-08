package com.tencent.p014mm.plugin.finder.view;

import android.content.DialogInterface;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.WebViewCallbackClient;

/* renamed from: com.tencent.mm.plugin.finder.view.f */
public final class C41578f implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ C41592j f111920d;

    public C41578f(C41592j jVar) {
        this.f111920d = jVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C41592j jVar = this.f111920d;
        jVar.getClass();
        Log.m105924i("Finder.AnnounceWebViewDialogWrapper", "onDismiss");
        MMWebView mMWebView = jVar.f111959g.f111890c;
        if (mMWebView != null) {
            mMWebView.setWebViewCallbackClient((WebViewCallbackClient) null);
        }
        DialogInterface.OnDismissListener onDismissListener = jVar.f111958f;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(jVar.f111953a);
        }
        jVar.f111956d = false;
        jVar.f111960h.release();
    }
}
