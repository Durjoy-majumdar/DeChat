package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload;

import android.webkit.ValueCallback;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.x */
public final class C2133x<T> implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ C32226l<String, C13598b0> f12102a;

    public C2133x(C32226l<? super String, C13598b0> lVar) {
        this.f12102a = lVar;
    }

    public void onReceiveValue(Object obj) {
        String str = (String) obj;
        Log.m105918d("MicroMsg.MpWebPrefetcherJsEngineInterceptor", "inject callback:" + str);
        C32226l<String, C13598b0> lVar = this.f12102a;
        C87412m.m108593f(str, LocaleUtil.ITALIAN);
        lVar.invoke(str);
    }
}
