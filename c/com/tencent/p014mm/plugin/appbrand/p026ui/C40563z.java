package com.tencent.p014mm.plugin.appbrand.p026ui;

import com.tencent.p014mm.plugin.appbrand.shortlink.WxaShortLinkLaunchErrorCode;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.z */
public final class C40563z extends C87413o implements C32226l<WxaShortLinkLaunchErrorCode, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ WeakReference<AppBrandCheckWxaShortLinkUI> f108959d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40563z(WeakReference<AppBrandCheckWxaShortLinkUI> weakReference) {
        super(1);
        this.f108959d = weakReference;
    }

    public Object invoke(Object obj) {
        C87412m.m108594g((WxaShortLinkLaunchErrorCode) obj, LocaleUtil.ITALIAN);
        AppBrandCheckWxaShortLinkUI appBrandCheckWxaShortLinkUI = this.f108959d.get();
        if (appBrandCheckWxaShortLinkUI != null) {
            appBrandCheckWxaShortLinkUI.finish();
        }
        return C13598b0.f38549a;
    }
}
