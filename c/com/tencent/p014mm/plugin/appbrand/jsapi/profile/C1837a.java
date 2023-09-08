package com.tencent.p014mm.plugin.appbrand.jsapi.profile;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.profile.a */
public final class C1837a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C82381f f11644d;

    /* renamed from: e */
    public final /* synthetic */ Intent f11645e;

    public C1837a(C82381f fVar, Intent intent) {
        this.f11644d = fVar;
        this.f11645e = intent;
    }

    public final void run() {
        C88144b.m109791i(this.f11644d.getContext(), Scopes.PROFILE, ".ui.ContactInfoUI", this.f11645e, (Bundle) null);
    }
}
