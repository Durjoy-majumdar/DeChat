package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload;

import android.webkit.ValueCallback;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40480g;
import fy3.C32226l;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.b */
public final class C40702b<T> implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ C40698a f109346a;

    /* renamed from: b */
    public final /* synthetic */ String f109347b;

    /* renamed from: c */
    public final /* synthetic */ C40480g f109348c;

    /* renamed from: d */
    public final /* synthetic */ C32226l<C40480g, C13598b0> f109349d;

    public C40702b(C40698a aVar, String str, C40480g gVar, C32226l<? super C40480g, C13598b0> lVar) {
        this.f109346a = aVar;
        this.f109347b = str;
        this.f109348c = gVar;
        this.f109349d = lVar;
    }

    public void onReceiveValue(Object obj) {
        String str = (String) obj;
        this.f109346a.mo73187d().put(this.f109347b, Integer.valueOf(this.f109348c.getContextId()));
        C32226l<C40480g, C13598b0> lVar = this.f109349d;
        C40480g gVar = this.f109348c;
        C87412m.m108593f(gVar, "this@apply");
        lVar.invoke(gVar);
    }
}
