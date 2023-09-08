package k63;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletBankcardIdUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCardImportUI;
import com.tencent.p014mm.plugin.wallet_core.utils.C72517z;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75133p0;
import com.tencent.p014mm.wallet_core.model.C75136r0;
import com.tencent.xweb.IXWebBroadcastListener;
import di3.C86312j;
import p281yz.C79173v;
import t53.C77866b;
import yq3.C79148e;

/* renamed from: k63.a */
public class C76500a extends C77866b {
    /* renamed from: A */
    public C79148e mo91260A(Activity activity, Bundle bundle) {
        mo109107a(IXWebBroadcastListener.STAGE_START, activity, bundle);
        Log.m105918d("MicroMsg.BindCardProcess", "start Process : BindCardProcess");
        if (bundle != null) {
            C75136r0.m90122d(6, bundle.getInt("key_bind_scene"));
            C75133p0.m90118b(bundle.getInt("key_bind_scene"));
        } else {
            C75136r0.m90122d(6, 0);
            C75133p0.m90118b(0);
        }
        if (!((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91341w()) {
            if (bundle != null) {
                C72517z.m84854b(activity, bundle.getInt("key_bind_scene", 0), 1);
            }
            if (bundle == null || !bundle.getBoolean("key_is_import_bind", false)) {
                return super.mo91260A(activity, bundle);
            }
            mo109103B(activity, WalletCardImportUI.class, bundle);
            return this;
        } else if (bundle == null) {
            return super.mo91260A(activity, bundle);
        } else {
            if (bundle.getBoolean("key_is_import_bind", false)) {
                mo109103B(activity, WalletCardImportUI.class, bundle);
            } else {
                mo109103B(activity, WalletBankcardIdUI.class, bundle);
            }
            return this;
        }
    }

    /* renamed from: e */
    public String mo91258e() {
        return "OpenECardBindCardProcess";
    }

    /* renamed from: f */
    public void mo91259f(Activity activity, Bundle bundle) {
        Bundle bundle2 = bundle;
        if (bundle2 == null || !bundle2.getBoolean("intent_bind_end", false)) {
            mo109113k(activity, "wallet_ecard", ".ui.WalletECardBindCardListUI", 0, new Intent(), true);
            activity.finish();
            return;
        }
        mo109113k(activity, "wallet_ecard", ".ui.WalletECardBindCardListUI", -1, new Intent(), true);
    }
}
