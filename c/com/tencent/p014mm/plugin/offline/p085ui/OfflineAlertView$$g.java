package com.tencent.p014mm.plugin.offline.p085ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import di3.C86312j;
import ie3.C76324c;
import ke3.C88144b;
import yq3.C79144b;

/* renamed from: com.tencent.mm.plugin.offline.ui.OfflineAlertView$$g */
public class OfflineAlertView$$g extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ View f115254g;

    public OfflineAlertView$$g(OfflineAlertView offlineAlertView, View view) {
        this.f115254g = view;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        Intent intent = new Intent();
        intent.putExtra("wallet_lock_jsapi_scene", 2);
        if (C79144b.m95773a().mo109089d()) {
            ((C76324c) C86312j.m106911c(C76324c.class)).startPaySecurityUseCase(2, (C76324c.C76325a) null);
        } else {
            C88144b.m109791i(this.f115254g.getContext(), "wallet", ".pwd.ui.WalletSecuritySettingUI", intent, (Bundle) null);
        }
    }
}
