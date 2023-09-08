package com.tencent.p014mm.plugin.wallet_payu.bind.p892ui;

import android.os.Bundle;
import com.tencent.p014mm.plugin.wallet.bind.p120ui.C71882b;
import com.tencent.p014mm.plugin.wallet.bind.p120ui.WalletBankcardManageUI;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_payu.bind.model.C72574a;
import nj3.C88989a;
import ob0.C117747y;
import r63.C77488c;
import s63.C77621a;
import x53.C78770a;
import yq3.C79143a;
import yq3.C79148e;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.wallet_payu.bind.ui.WalletPayUBankcardManageUI */
public class WalletPayUBankcardManageUI extends WalletBankcardManageUI {
    /* renamed from: H7 */
    public void mo99044H7(Bundle bundle) {
        C79143a.m95771j(this, C72574a.class, bundle, (C79148e.C79149a) null);
    }

    /* renamed from: I7 */
    public void mo99045I7(boolean z) {
        if (z) {
            doSceneProgress(new C78770a(), false);
        } else {
            doSceneForceProgress(new C78770a());
        }
    }

    /* renamed from: J7 */
    public C71882b mo99046J7() {
        return new C77621a(this, this.f208442d);
    }

    /* renamed from: L7 */
    public void mo99048L7(Bankcard bankcard) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("key_bankcard", bankcard);
        C79143a.m95771j(this, C77488c.class, bundle, (C79148e.C79149a) null);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (!(yVar instanceof C78770a)) {
            return false;
        }
        setContentViewVisibility(0);
        this.f208444f.mo91327i(this.f208442d, this.f208443e);
        mo99050N7();
        mo99049M7();
        return true;
    }
}
