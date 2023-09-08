package t43;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.wallet_core.model.C75133p0;
import t53.C77866b;
import yq3.C79148e;

/* renamed from: t43.a */
public class C77854a extends C77866b {
    /* renamed from: A */
    public C79148e mo91260A(Activity activity, Bundle bundle) {
        C75133p0.m90118b(14);
        return super.mo91260A(activity, bundle);
    }

    /* renamed from: c */
    public void mo91257c(Activity activity, int i) {
        C75133p0.m90117a();
        if (activity != null) {
            activity.finish();
        }
    }

    /* renamed from: e */
    public String mo91258e() {
        return "BalanceFetchCardProcess";
    }

    /* renamed from: f */
    public void mo91259f(Activity activity, Bundle bundle) {
        C75133p0.m90117a();
        if (bundle == null || !bundle.getBoolean("intent_bind_end", false)) {
            activity.finish();
            return;
        }
        Intent intent = new Intent();
        intent.putExtras(bundle);
        if (bundle.getInt("from_bind_ui", 2) == 1) {
            intent.putExtra("from_bind_ui", 1);
            mo109113k(activity, "wallet", ".balance.ui.WalletBalanceManagerUI", -1, intent, true);
            return;
        }
        intent.putExtra("from_bind_ui", 2);
        mo109113k(activity, "wallet", ".balance.ui.WalletBalanceFetchUI", -1, intent, true);
    }
}
