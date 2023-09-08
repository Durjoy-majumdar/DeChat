package com.tencent.p014mm.plugin.appbrand.jsapi.advertise;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import gy3.C87412m;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.advertise.a */
public final class C1586a extends JsApiOpenAdCanvas<C82381f> {
    /* renamed from: w */
    public void mo1620w(int i) {
    }

    /* renamed from: x */
    public void mo1621x(C82381f fVar) {
    }

    /* renamed from: y */
    public void mo1622y(C82381f fVar, Intent intent, int i) {
        C87412m.m108594g(fVar, "service");
        C87412m.m108594g(intent, "intent");
        C88144b.m109791i(fVar.getContext(), "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", intent, (Bundle) null);
        fVar.mo109647a(i, mo115109j("ok"));
    }
}
