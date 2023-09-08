package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import hp3.C87581a;
import j20.C117292a;
import java.math.RoundingMode;
import k20.C9556a;
import te3.C78014xp3;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.o2 */
public class C71816o2 implements C87581a<Void, C78014xp3> {

    /* renamed from: a */
    public final /* synthetic */ int f208353a;

    /* renamed from: b */
    public final /* synthetic */ WalletLqtSaveFetchUI f208354b;

    public C71816o2(WalletLqtSaveFetchUI walletLqtSaveFetchUI, int i) {
        this.f208354b = walletLqtSaveFetchUI;
        this.f208353a = i;
    }

    public Object call(Object obj) {
        C78014xp3 xp32 = (C78014xp3) obj;
        Log.m105925i("MicroMsg.WalletLqtSaveFetchUI", "redeem succ: %s, is_realtime_arrivial: %s, is_redeem_into_pocket: %s", xp32, Boolean.valueOf(xp32.f228523f), Boolean.valueOf(xp32.f228524g));
        this.f208354b.mo98981T7();
        if (!xp32.f228523f || !xp32.f228524g) {
            Intent intent = new Intent(this.f208354b, WalletLqtSaveFetchFinishProgressNewUI.class);
            try {
                intent.putExtra("key_redeem_res", xp32.toByteArray());
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.WalletLqtSaveFetchUI", e, "pass redeemFundRes error: %s", e.getMessage());
            }
            WalletLqtSaveFetchUI walletLqtSaveFetchUI = this.f208354b;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            WalletLqtSaveFetchUI walletLqtSaveFetchUI2 = walletLqtSaveFetchUI;
            C117292a.m165358d(walletLqtSaveFetchUI2, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchUI$53", "call", "(Lcom/tencent/mm/protocal/protobuf/RedeemFundRes;)Ljava/lang/Void;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            walletLqtSaveFetchUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(walletLqtSaveFetchUI2, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchUI$53", "call", "(Lcom/tencent/mm/protocal/protobuf/RedeemFundRes;)Ljava/lang/Void;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            Intent intent2 = new Intent(this.f208354b, WalletLqtSaveFetchFinishUI.class);
            intent2.putExtra("key_amount", C75228t.m90250i("" + this.f208353a, "100", 2, RoundingMode.HALF_UP));
            intent2.putExtra("key_mode", 2);
            WalletLqtSaveFetchUI walletLqtSaveFetchUI3 = this.f208354b;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent2);
            WalletLqtSaveFetchUI walletLqtSaveFetchUI4 = walletLqtSaveFetchUI3;
            C117292a.m165358d(walletLqtSaveFetchUI4, aVar2.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchUI$53", "call", "(Lcom/tencent/mm/protocal/protobuf/RedeemFundRes;)Ljava/lang/Void;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            walletLqtSaveFetchUI3.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(walletLqtSaveFetchUI4, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchUI$53", "call", "(Lcom/tencent/mm/protocal/protobuf/RedeemFundRes;)Ljava/lang/Void;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        this.f208354b.finish();
        return null;
    }
}
