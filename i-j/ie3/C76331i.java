package ie3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.pluginsdk.wallet.WalletJsapiData;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import eb0.C75592q0;
import java.util.Map;
import ke3.C88144b;
import q43.C77302a;

/* renamed from: ie3.i */
public class C76331i {
    /* renamed from: a */
    public static PayInfo m91757a(String str, String str2, String str3, String str4, int i, int i2) {
        PayInfo payInfo = new PayInfo();
        payInfo.f212592j = str;
        payInfo.f212594o = str2;
        payInfo.f212595p = str3;
        payInfo.f212587e = i;
        payInfo.f212599t = str4;
        payInfo.f212589g = i2;
        return payInfo;
    }

    /* renamed from: b */
    public static boolean m91758b(Context context, int i) {
        Intent intent = new Intent();
        intent.putExtra("key_scene_balance_manager", i);
        if (C75592q0.m90763K()) {
            C88144b.m109791i(context, "wallet_payu", ".balance.ui.WalletPayUBalanceManagerUI", intent, (Bundle) null);
            return true;
        } else if (((C76324c) C86312j.m106911c(C76324c.class)).startWalletBalanceEntryUseCase(context)) {
            return true;
        } else {
            C88144b.m109791i(context, "wallet", ".balance.ui.WalletBalanceManagerUI", intent, (Bundle) null);
            return true;
        }
    }

    /* renamed from: c */
    public static boolean m91759c(Context context, int i) {
        Intent intent = new Intent();
        intent.putExtra("key_req_bind_scene", 5);
        intent.putExtra("key_offline_add_fee", i);
        C88144b.m109791i(context, "wallet", ".bind.ui.WalletBindUI", intent, (Bundle) null);
        return true;
    }

    /* renamed from: d */
    public static boolean m91760d(MMActivity mMActivity, WalletJsapiData walletJsapiData, int i, MMActivity.C6739d dVar) {
        if (walletJsapiData == null) {
            return false;
        }
        Intent intent = new Intent();
        intent.putExtra("WalletJsapiData", walletJsapiData);
        intent.putExtra("requestCode", i);
        if (dVar != null) {
            mMActivity.mmSetOnActivityResultCallback(dVar);
        }
        Log.m105925i("MicroMsg.WalletManager", "startJsapiPay MMActivity %s from %s", mMActivity, Util.getStack());
        C88144b.m109796n(mMActivity, "wallet_index", ".ui.WalletBrandUI", intent, i, false);
        return true;
    }

    /* renamed from: e */
    public static boolean m91761e(Context context, PayInfo payInfo, int i) {
        m91762f(context, false, "", payInfo, (String) null, new Intent(), i);
        return true;
    }

    /* renamed from: f */
    public static boolean m91762f(Context context, boolean z, String str, PayInfo payInfo, String str2, Intent intent, int i) {
        int i2 = payInfo.f212587e;
        if (2 == i2 || 1 == i2 || 4 == i2 || 36 == i2) {
            payInfo.f212590h = false;
        } else {
            payInfo.f212590h = true;
        }
        if (i2 == 4 || i2 == 1 || 36 == i2 || 8 == i2) {
            payInfo.f212591i = true;
        } else {
            payInfo.f212591i = false;
        }
        payInfo.f212585Q = str2;
        intent.putExtra("key_pay_info", payInfo);
        intent.putExtra("key_force_use_bind_serail", Util.nullAsNil(str));
        intent.putExtra("key_is_force_use_given_card", z);
        if (context instanceof Activity) {
            intent.putExtra("key_context_hashcode", context.hashCode());
            Log.m105925i("MicroMsg.WalletManager", "startPay context %s %s", context, Integer.valueOf(context.hashCode()));
        }
        if (!Util.isNullOrNil("")) {
            intent.putExtra("key_is_use_default_card", "");
        }
        Log.m105925i("MicroMsg.WalletManager", "startPay context %s from %s", context, Util.getStack());
        intent.putExtra("key_receiver_true_name", str2);
        if (C75592q0.m90763K()) {
            C88144b.m109795m(context, "wallet_payu", ".pay.ui.WalletPayUPayUI", intent, i);
        } else {
            C88144b.m109795m(context, "wallet", ".pay.ui.WalletPayUI", intent, i);
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m91763g(MMActivity mMActivity, String str, Map<String, String> map, int i, MMActivity.C6739d dVar) {
        WalletJsapiData walletJsapiData = new WalletJsapiData();
        walletJsapiData.f24058A = 4;
        walletJsapiData.f24073Q = str;
        walletJsapiData.f24072P = map;
        Intent intent = new Intent();
        intent.putExtra("WalletJsapiData", walletJsapiData);
        intent.putExtra("requestCode", i);
        if (dVar != null) {
            mMActivity.mmSetOnActivityResultCallback(dVar);
        }
        Log.m105925i("MicroMsg.WalletManager", "startPayComponent context %s from %s", mMActivity, Util.getStack());
        C88144b.m109796n(mMActivity, "wallet_index", ".ui.WalletBrandUI", intent, i, false);
        return true;
    }

    /* renamed from: h */
    public static boolean m91764h(Context context, int i, String str, int i2, C77302a aVar, Bundle bundle) {
        Intent intent = new Intent();
        intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i);
        intent.putExtra("receiver_name", str);
        if (i2 > 0) {
            intent.putExtra("pay_channel", i2);
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        C77302a.m93125e(aVar, intent);
        if (C75592q0.m90763K()) {
            C88144b.m109791i(context, "wallet_payu", ".remittance.ui.PayURemittanceAdapterUI", intent, (Bundle) null);
        } else if (C75592q0.m90753A()) {
            C88144b.m109791i(context, "remittance", ".ui.RemittanceAdapterUI", intent, (Bundle) null);
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo160131h(12097, 12, 0, Long.valueOf(System.currentTimeMillis()));
            nVar.mo160131h(11850, 7, 1);
        } else {
            C88144b.m109791i(context, "remittance", ".ui.RemittanceAdapterUI", intent, (Bundle) null);
            C115669n nVar2 = C115669n.INSTANCE;
            nVar2.mo160131h(12097, 12, 0, Long.valueOf(System.currentTimeMillis()));
            nVar2.mo160131h(11850, 3, 1);
        }
        return true;
    }

    /* renamed from: i */
    public static void m91765i(Context context, int i) {
        Intent intent = new Intent();
        intent.putExtra("key_from_scene", i);
        C88144b.m109791i(context, "collect", ".ui.CollectAdapterUI", intent, (Bundle) null);
    }
}
