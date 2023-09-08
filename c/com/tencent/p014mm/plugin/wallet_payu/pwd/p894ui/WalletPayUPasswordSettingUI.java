package com.tencent.p014mm.plugin.wallet_payu.pwd.p894ui;

import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet.pwd.p122ui.WalletPasswordSettingUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import x63.C78775g;
import x63.C78776h;
import yq3.C79143a;
import yq3.C79148e;

/* renamed from: com.tencent.mm.plugin.wallet_payu.pwd.ui.WalletPayUPasswordSettingUI */
public class WalletPayUPasswordSettingUI extends WalletPasswordSettingUI {
    /* renamed from: J7 */
    public void mo99222J7() {
        Log.m105918d("MicroMsg.WalletPayUPasswordSettingUI", "hy: start payu do forgot pwd");
        C79143a.m95771j(this, C78775g.class, (Bundle) null, (C79148e.C79149a) null);
    }

    /* renamed from: L7 */
    public void mo99224L7() {
        Log.m105918d("MicroMsg.WalletPayUPasswordSettingUI", "hy: start payu reset pwd");
        C79143a.m95771j(this, C78776h.class, (Bundle) null, (C79148e.C79149a) null);
    }

    /* renamed from: M7 */
    public int mo99225M7() {
        return C0966R.xml.f8990dc;
    }

    /* renamed from: U7 */
    public void mo99233U7() {
        getPreferenceScreen().mo72529n("wallet_modify_gesture_password", true);
        getPreferenceScreen().mo72529n("wallet_open_gesture_password", true);
    }
}
