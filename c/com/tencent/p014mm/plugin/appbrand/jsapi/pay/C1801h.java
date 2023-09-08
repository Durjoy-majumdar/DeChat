package com.tencent.p014mm.plugin.appbrand.jsapi.pay;

import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.pluginsdk.wallet.WalletJsapiData;
import di3.C86312j;
import fy3.C32226l;
import p275xz.C15919f;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.h */
public class C1801h implements C32226l<MMActivity, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ WalletJsapiData f11598d;

    /* renamed from: e */
    public final /* synthetic */ MMActivity.C6739d f11599e;

    public C1801h(C1803i iVar, WalletJsapiData walletJsapiData, MMActivity.C6739d dVar) {
        this.f11598d = walletJsapiData;
        this.f11599e = dVar;
    }

    public Object invoke(Object obj) {
        ((C15919f) C86312j.m106911c(C15919f.class)).Q50((MMActivity) obj, this.f11598d, 1, this.f11599e);
        return C13598b0.f38549a;
    }
}
