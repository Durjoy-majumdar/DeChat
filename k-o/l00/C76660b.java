package l00;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyBaseUI;
import com.tencent.p014mm.plugin.remittance.mobile.p097ui.BankMobileRemittanceChooseUI;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.p014mm.wallet_core.p137ui.WalletPreferenceUI;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import java.util.HashMap;
import m00.C10700d;
import m00.C76739c;
import p533ga.C32360e;
import ub3.C78144b;

@C86522b
/* renamed from: l00.b */
public class C76660b extends C86301e implements C10700d, C76739c {
    /* renamed from: A0 */
    public void mo10952A0(Context context, Bundle bundle, C68070l.C68072b bVar) {
        ((C78144b) C86312j.m106911c(C78144b.class)).mo107977A0(context, bundle, bVar);
    }

    /* renamed from: C0 */
    public void mo10953C0() {
        ((C78144b) C86312j.m106911c(C78144b.class)).mo107978C0();
    }

    /* renamed from: FJ */
    public boolean mo10954FJ(Activity activity) {
        return activity != null && ((activity instanceof WalletBaseUI) || ((C32360e) C86312j.m106911c(C32360e.class)).mo58438cI(activity) || (activity instanceof WalletPreferenceUI) || (activity instanceof LuckyMoneyBaseUI) || (activity instanceof BankMobileRemittanceChooseUI));
    }

    /* renamed from: P3 */
    public void mo10955P3(Intent intent) {
        ((C78144b) C86312j.m106911c(C78144b.class)).mo107981P3(intent);
    }

    public void fw0() {
        ((C78144b) C86312j.m106911c(C78144b.class)).mo107980OI().mo119993e(C72994y1.C72995a.USERINFO_WALLET_REMITTANCE_FIRST_RELIEF_DIALOG_BOOLEAN_SYNC, Boolean.TRUE);
    }

    /* renamed from: l2 */
    public void mo10956l2(Context context, HashMap<String, String> hashMap) {
        ((C78144b) C86312j.m106911c(C78144b.class)).mo107984l2(context, hashMap);
    }
}
