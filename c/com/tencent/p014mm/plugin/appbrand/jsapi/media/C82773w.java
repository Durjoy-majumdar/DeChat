package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82739n;
import com.tencent.p014mm.plugin.mmsight.SightCaptureResult;
import com.tencent.p014mm.vfs.C86009m1;
import lp3.C46888b;
import p225rc.g$$e;
import sx3.C26236u;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.w */
public final class C82773w implements g$$e {

    /* renamed from: a */
    public final /* synthetic */ C46888b f242116a;

    public C82773w(C46888b bVar) {
        this.f242116a = bVar;
    }

    /* renamed from: a */
    public final void mo1626a(int i, Intent intent) {
        if (intent == null || i == 0) {
            this.f242116a.mo72093c(C82739n.C82740a.f242060a);
            return;
        }
        SightCaptureResult sightCaptureResult = (SightCaptureResult) intent.getParcelableExtra("key_req_result");
        if (sightCaptureResult == null) {
            this.f242116a.mo72093c(new C82739n.C82741b("get null sight capture result"));
            return;
        }
        C46888b bVar = this.f242116a;
        Object[] objArr = new Object[1];
        objArr[0] = new C82739n.C82742c(C26236u.m33719b(new C86009m1(sightCaptureResult.f201515e ? sightCaptureResult.f201523p : sightCaptureResult.f201517g)), 2);
        bVar.mo72093c(objArr);
    }
}
