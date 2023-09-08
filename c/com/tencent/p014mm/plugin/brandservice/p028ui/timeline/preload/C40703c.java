package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload;

import android.webkit.ValueCallback;
import gy3.C87412m;
import r73.C47945s;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.c */
public final class C40703c implements C47945s {

    /* renamed from: d */
    public final String f109350d;

    /* renamed from: e */
    public final /* synthetic */ C40698a f109351e;

    public C40703c(String str, C40698a aVar) {
        this.f109351e = aVar;
        this.f109350d = str;
    }

    /* renamed from: I0 */
    public void mo60865I0(String str, String str2, ValueCallback<String> valueCallback) {
        C87412m.m108594g(str, "eventType");
        C87412m.m108594g(str2, "event");
        this.f109351e.mo73188e().mo60865I0(str, str2, valueCallback);
    }

    public String getId() {
        return this.f109350d;
    }

    /* renamed from: x0 */
    public void mo63605x0(int i) {
    }
}
