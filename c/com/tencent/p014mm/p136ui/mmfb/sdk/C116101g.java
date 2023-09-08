package com.tencent.p014mm.p136ui.mmfb.sdk;

import android.os.Bundle;
import com.tencent.p014mm.p136ui.mmfb.sdk.C116102h;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.CookieManager;

/* renamed from: com.tencent.mm.ui.mmfb.sdk.g */
public class C116101g implements C116102h.C116103a {

    /* renamed from: a */
    public final /* synthetic */ C116102h f348428a;

    public C116101g(C116102h hVar) {
        this.f348428a = hVar;
    }

    /* renamed from: b */
    public void mo1391b(Bundle bundle) {
        CookieManager.getInstance().flush();
        this.f348428a.mo177424h(bundle.getString("access_token"));
        this.f348428a.mo177423g(bundle.getString("expires_in"));
        if (bundle.getLong("data_access_expiration_time") > System.currentTimeMillis() / 1000) {
            this.f348428a.f348441b = bundle.getLong("data_access_expiration_time");
        } else {
            Log.m105924i("MicroMsg.FacebookLoginUI", "onComplete, onError, values.getLong(DATAACCESSEXPIRATIONTIME) = " + bundle.getLong("data_access_expiration_time") + ", System.currentTimeMillis() = " + System.currentTimeMillis());
        }
        if (this.f348428a.mo177421d()) {
            Log.m105918d("Facebook-authorize", "Login Success! access_token=" + this.f348428a.f348440a + " expires=" + this.f348428a.f348441b);
            this.f348428a.f348443d.mo1391b(bundle);
            return;
        }
        this.f348428a.f348443d.mo1392c(new C116105j("Failed to receive access token."));
    }

    /* renamed from: c */
    public void mo1392c(C116105j jVar) {
        Log.m105918d("Facebook-authorize", "Login failed: " + jVar);
        this.f348428a.f348443d.mo1392c(jVar);
    }

    /* renamed from: d */
    public void mo1393d(C116099e eVar) {
        Log.m105918d("Facebook-authorize", "Login failed: " + eVar);
        this.f348428a.f348443d.mo1393d(eVar);
    }

    public void onCancel() {
        Log.m105918d("Facebook-authorize", "Login canceled");
        this.f348428a.f348443d.onCancel();
    }
}
