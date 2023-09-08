package b53;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import t53.C77866b;

/* renamed from: b53.a */
public class C67153a extends C77866b {
    /* renamed from: c */
    public void mo91257c(Activity activity, int i) {
        if (activity != null) {
            activity.finish();
        }
    }

    /* renamed from: e */
    public String mo91258e() {
        return "BindCardForPayProcess";
    }

    /* renamed from: f */
    public void mo91259f(Activity activity, Bundle bundle) {
        Intent intent = new Intent();
        intent.putExtras(bundle);
        mo109113k(activity, "wallet", ".pay.ui.WalletPayUI", -1, intent, false);
    }
}
