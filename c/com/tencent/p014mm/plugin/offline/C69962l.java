package com.tencent.p014mm.plugin.offline;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletOrderInfoUI;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import id2.C76304h;
import java.util.ArrayList;
import java.util.List;
import kd2.C76559f;
import yq3.C79148e;

/* renamed from: com.tencent.mm.plugin.offline.l */
public class C69962l extends C79148e {
    /* renamed from: A */
    public C79148e mo91260A(Activity activity, Bundle bundle) {
        List<Orders.Commodity> list;
        String str = "key_trans_id";
        if (bundle != null) {
            if (Util.isNullOrNil(bundle.getString(str))) {
                Orders orders = (Orders) bundle.getParcelable("key_orders");
                if (!(orders == null || (list = orders.f209542M) == null || ((ArrayList) list).size() < 1)) {
                    str = ((Orders.Commodity) ((ArrayList) orders.f209542M).get(0)).f209606r;
                }
            }
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123460f(new C76304h("offlineshowpage", "push", str));
            mo109103B(activity, WalletOrderInfoUI.class, bundle);
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_ADDRESS_HAS_SHOW_WALLETOFFLINE2_DIALOG_BOOLEAN_SYNC, Boolean.TRUE);
            return this;
        }
        str = "";
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(new C76304h("offlineshowpage", "push", str));
        mo109103B(activity, WalletOrderInfoUI.class, bundle);
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_ADDRESS_HAS_SHOW_WALLETOFFLINE2_DIALOG_BOOLEAN_SYNC, Boolean.TRUE);
        return this;
    }

    /* renamed from: c */
    public void mo91257c(Activity activity, int i) {
        mo96262m(activity);
    }

    /* renamed from: e */
    public String mo91258e() {
        return "ShowOrderSuccessProcess";
    }

    /* renamed from: f */
    public void mo91259f(Activity activity, Bundle bundle) {
        mo109109g(activity);
        if (this.f232423c.getInt("key_from_scene") == 8) {
            C76559f.m92112h(this.f232423c.getString("key_appid"));
        }
    }

    /* renamed from: o */
    public void mo91264o(Activity activity, int i, Bundle bundle) {
        if (activity instanceof WalletOrderInfoUI) {
            mo96262m(activity);
            mo91259f(activity, (Bundle) null);
        }
    }

    /* renamed from: t */
    public boolean mo91267t(Activity activity, Bundle bundle) {
        return false;
    }
}
