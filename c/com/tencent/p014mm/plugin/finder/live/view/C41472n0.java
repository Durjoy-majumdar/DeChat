package com.tencent.p014mm.plugin.finder.live.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.appbrand.utils.html.C84746b;
import ke3.C88144b;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.live.view.n0 */
public final class C41472n0 implements C84746b.C40567a {

    /* renamed from: a */
    public final /* synthetic */ FinderLiveGameWelfareTaskProgressItemView f111688a;

    public C41472n0(FinderLiveGameWelfareTaskProgressItemView finderLiveGameWelfareTaskProgressItemView) {
        this.f111688a = finderLiveGameWelfareTaskProgressItemView;
    }

    /* renamed from: a */
    public final void mo63415a(String str) {
        Context context = this.f111688a.getContext();
        Intent intent = new Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("forceHideShare", true);
        C13598b0 b0Var = C13598b0.f38549a;
        C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
    }
}
