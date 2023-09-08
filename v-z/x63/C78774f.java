package x63;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet_payu.pwd.p894ui.WalletPayUPwdConfirmUI;
import com.tencent.p014mm.plugin.wallet_payu.pwd.p894ui.WalletPayUSetPasswordUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C76912y0;
import yq3.C79148e;

/* renamed from: x63.f */
public abstract class C78774f extends C79148e {
    /* renamed from: c */
    public void mo91257c(Activity activity, int i) {
        if (activity instanceof WalletPayUPwdConfirmUI) {
            mo109108d(activity, WalletPayUSetPasswordUI.class, (Bundle) null, i);
        }
    }

    /* renamed from: f */
    public void mo91259f(Activity activity, Bundle bundle) {
        if (this.f232423c.getInt("key_errcode_payu", -1) == 0) {
            C76912y0.makeText((Context) activity, (int) C0966R.string.l0y, 0).show();
        } else {
            C76912y0.makeText((Context) activity, (int) C0966R.string.kso, 0).show();
        }
        Log.m105925i("MicroMsg.PayUBaseChangePwdProcess", " walletMallV2 switch is ：%s", Boolean.TRUE);
        mo109112j(activity, "mall", ".ui.MallIndexUIv2");
    }

    /* renamed from: t */
    public boolean mo91267t(Activity activity, Bundle bundle) {
        return false;
    }
}
