package p746wz;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.opensdk.constants.ConstantsAPI;
import com.tencent.p014mm.opensdk.modelpay.PayReq;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$f;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.pluginsdk.wallet.WalletJsapiData;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86301e;
import ei3.C86522b;
import ie3.C76331i;
import java.util.Map;
import ke3.C88144b;
import p275xz.C15919f;
import q43.C77302a;

@C86522b
/* renamed from: wz.h */
public class C78739h extends C86301e implements C15919f {
    /* renamed from: Du */
    public void mo14561Du(Context context) {
        Intent intent = new Intent();
        intent.putExtra("key_from_scene", 2);
        C88144b.m109791i(context, "offline", ".ui.WalletOfflineEntranceUI", intent, (Bundle) null);
    }

    /* renamed from: Mo */
    public boolean mo14562Mo(MMActivity mMActivity, WalletJsapiData walletJsapiData) {
        if (walletJsapiData == null) {
            return false;
        }
        Intent intent = new Intent();
        intent.putExtra("appId", walletJsapiData.f24075d);
        intent.putExtra("timeStamp", walletJsapiData.f24079h);
        intent.putExtra("nonceStr", walletJsapiData.f24078g);
        intent.putExtra("packageExt", walletJsapiData.f24080i);
        intent.putExtra("reqKey", walletJsapiData.f24081j);
        intent.putExtra("signtype", walletJsapiData.f24077f);
        intent.putExtra("paySignature", walletJsapiData.f24084p);
        intent.putExtra("payScene", walletJsapiData.f24082n);
        intent.putExtra("is_jsapi_offline_pay", true);
        C88144b.m109792j(mMActivity, "wallet_core", ".ui.WalletMixOrderInfoUI", intent, true);
        return true;
    }

    public void Mv0(Context context, int i) {
        C76331i.m91765i(context, i);
    }

    public boolean Q50(MMActivity mMActivity, WalletJsapiData walletJsapiData, int i, MMActivity.C6739d dVar) {
        return C76331i.m91760d(mMActivity, walletJsapiData, i, dVar);
    }

    public void Zt0(Context context, Intent intent, int i, String str) {
        Log.m105919d("MicroMsg.WalletManager", "start offline from sdk: %s", str);
        if (WeChatBrands.Business.Entries.PaymentOpenSdk.checkAvailable(context)) {
            intent.putExtra("key_from_scene", 8);
            intent.putExtra("key_appid", str);
            C88144b.m109795m(context, "offline", ".ui.WalletOfflineEntranceUI", intent, i);
        }
    }

    public boolean b60(Context context, Bundle bundle, boolean z, String str) {
        Intent intent = new Intent();
        intent.putExtra("orderhandlerui_checkapp_result", z);
        if (!Util.isNullOrNil(str)) {
            intent.putExtra(ConstantsAPI.APP_PACKAGE, str);
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        PayReq payReq = new PayReq();
        payReq.fromBundle(intent.getExtras());
        Util.isNullOrNil(payReq.prepayId);
        C88144b.m109791i(context, "wallet_index", ".ui.OrderHandlerUI", intent, (Bundle) null);
        return true;
    }

    public boolean ci0(MMActivity mMActivity, String str, Map<String, String> map, int i, MMActivity.C6739d dVar) {
        C76331i.m91763g(mMActivity, str, map, i, dVar);
        return true;
    }

    /* renamed from: d9 */
    public boolean mo14568d9(Context context, int i, String str, int i2, C77302a aVar) {
        C76331i.m91764h(context, i, str, i2, aVar, (Bundle) null);
        return true;
    }

    /* renamed from: ew */
    public void mo14569ew(Context context, Intent intent, int i) {
        intent.putExtra("key_from_scene", 7);
        C88144b.m109795m(context, "offline", ".ui.WalletOfflineEntranceUI", intent, i);
    }

    public boolean fu0(Context context, int i, int i2, Bundle bundle) {
        Intent intent = new Intent();
        intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 7);
        intent.putExtra("pay_channel", i);
        intent.putExtra("ScanScene", i2);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        C88144b.m109791i(context, "remittance", ".ui.RemittanceAdapterUI", intent, (Bundle) null);
        return true;
    }

    /* renamed from: gX */
    public boolean mo14571gX(MMActivity mMActivity, WalletJsapiData walletJsapiData, int i, MMActivity.C6739d dVar) {
        if (walletJsapiData == null) {
            return false;
        }
        Intent intent = new Intent();
        intent.putExtra("appId", walletJsapiData.f24075d);
        intent.putExtra("timeStamp", walletJsapiData.f24079h);
        intent.putExtra("nonceStr", walletJsapiData.f24078g);
        intent.putExtra("packageExt", walletJsapiData.f24080i);
        intent.putExtra("signtype", walletJsapiData.f24077f);
        intent.putExtra("paySignature", walletJsapiData.f24084p);
        intent.putExtra("url", walletJsapiData.f24086r);
        mMActivity.mmSetOnActivityResultCallback(dVar);
        Log.m105925i("MicroMsg.WalletManager", "startIbgOrderResult context %s from %s", mMActivity, Util.getStack());
        C88144b.m109796n(mMActivity, "wallet_core", ".ui.ibg.WalletIbgOrderInfoUI", intent, i, true);
        return true;
    }

    public void lm0(Context context, String str, int i, String str2, int i2, Bundle bundle) {
        Intent intent = new Intent();
        intent.putExtra("key_qrcode_url", str);
        intent.putExtra("key_channel", i);
        intent.putExtra("key_web_url", str2);
        intent.putExtra("key_scene", i2);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        C88144b.m109791i(context, "collect", ".reward.ui.QrRewardSelectMoneyUI", intent, (Bundle) null);
    }

    /* renamed from: mq */
    public boolean mo14573mq(Context context, Intent intent) {
        if (intent == null) {
            return false;
        }
        Log.m105925i("MicroMsg.WalletManager", "startIbgOrder context %s from %s", context, Util.getStack());
        C88144b.m109792j(context, "wallet_core", ".ui.ibg.WalletIbgOrderInfoUI", intent, true);
        return true;
    }

    /* renamed from: qK */
    public void mo14574qK(Context context, WalletJsapiData walletJsapiData, int i) {
        Intent intent = new Intent();
        intent.putExtra("appId", walletJsapiData.f24075d);
        intent.putExtra("timeStamp", walletJsapiData.f24079h);
        intent.putExtra("nonceStr", walletJsapiData.f24078g);
        intent.putExtra("packageExt", walletJsapiData.f24080i);
        intent.putExtra("signtype", walletJsapiData.f24077f);
        intent.putExtra("paySignature", walletJsapiData.f24084p);
        intent.putExtra("url", walletJsapiData.f24086r);
        intent.putExtra("key_from_scene", 6);
        intent.putExtra("pay_channel", walletJsapiData.f24090v);
        C88144b.m109795m(context, "offline", ".ui.WalletOfflineEntranceUI", intent, i);
    }

    /* renamed from: sP */
    public boolean mo14575sP(Context context, String str, String str2, int i, int i2, Bundle bundle) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        PayInfo a = C76331i.m91757a(str, str2, (String) null, (String) null, i, 0);
        a.f212600u = bundle;
        C76331i.m91761e(context, a, i2);
        return true;
    }

    /* renamed from: uH */
    public boolean mo14576uH(MMFragmentActivity mMFragmentActivity, WalletJsapiData walletJsapiData, int i, MMFragmentActivity$$f mMFragmentActivity$$f) {
        if (walletJsapiData == null) {
            return false;
        }
        Intent intent = new Intent();
        intent.putExtra("WalletJsapiData", walletJsapiData);
        intent.putExtra("requestCode", i);
        if (mMFragmentActivity$$f != null) {
            mMFragmentActivity.setMMOnFragmentActivityResult(mMFragmentActivity$$f);
        }
        Log.m105925i("MicroMsg.WalletManager", "startJsapiPay MMFragmentActivity %s from %s", mMFragmentActivity, Util.getStack());
        C88144b.m109796n(mMFragmentActivity, "wallet_index", ".ui.WalletBrandUI", intent, i, false);
        return true;
    }

    /* renamed from: z8 */
    public boolean mo14577z8(MMActivity mMActivity, WalletJsapiData walletJsapiData, int i, MMActivity.C6739d dVar) {
        if (walletJsapiData == null) {
            return false;
        }
        Intent intent = new Intent();
        intent.putExtra("appId", walletJsapiData.f24075d);
        intent.putExtra("timeStamp", walletJsapiData.f24079h);
        intent.putExtra("nonceStr", walletJsapiData.f24078g);
        intent.putExtra("packageExt", walletJsapiData.f24080i);
        intent.putExtra("signtype", walletJsapiData.f24077f);
        intent.putExtra("paySignature", walletJsapiData.f24084p);
        intent.putExtra("url", walletJsapiData.f24086r);
        intent.putExtra("key_req_bind_scene", walletJsapiData.f24089u);
        intent.putExtra("pay_channel", walletJsapiData.f24090v);
        mMActivity.mmSetOnActivityResultCallback(dVar);
        C88144b.m109796n(mMActivity, "wallet", ".bind.ui.WalletBindUI", intent, i, false);
        return true;
    }

    /* renamed from: zh */
    public boolean mo14578zh(Context context, int i, String str, int i2, C77302a aVar, Bundle bundle) {
        C76331i.m91764h(context, i, str, i2, aVar, bundle);
        return true;
    }
}
