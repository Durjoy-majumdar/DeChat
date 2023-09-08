package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;
import nj3.C76912y0;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.a0 */
public final class C40544a0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandCheckWxaShortLinkUI f108918d;

    /* renamed from: e */
    public final /* synthetic */ WeakReference<AppBrandCheckWxaShortLinkUI> f108919e;

    public C40544a0(AppBrandCheckWxaShortLinkUI appBrandCheckWxaShortLinkUI, WeakReference<AppBrandCheckWxaShortLinkUI> weakReference) {
        this.f108918d = appBrandCheckWxaShortLinkUI;
        this.f108919e = weakReference;
    }

    public final void run() {
        Log.m105924i("MicroMsg.AppBrandCheckWxaShortLinkUI", "check short link timeout");
        this.f108918d.f108876f.set(true);
        AppBrandCheckWxaShortLinkUI appBrandCheckWxaShortLinkUI = this.f108918d;
        C76912y0.makeText((Context) appBrandCheckWxaShortLinkUI, (CharSequence) appBrandCheckWxaShortLinkUI.getContext().getString(C0966R.string.a8z), 1).show();
        AppBrandCheckWxaShortLinkUI appBrandCheckWxaShortLinkUI2 = this.f108919e.get();
        if (appBrandCheckWxaShortLinkUI2 != null) {
            appBrandCheckWxaShortLinkUI2.finish();
        }
    }
}
