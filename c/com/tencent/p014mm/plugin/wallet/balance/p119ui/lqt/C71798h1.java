package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.content.Intent;
import b63.C67197o;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75097a;
import j20.C117292a;
import java.util.LinkedList;
import k20.C9556a;
import te3.C78012xd3;
import te3.C78017yd3;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.h1 */
public class C71798h1 implements C75097a.C75099b<C78012xd3> {

    /* renamed from: a */
    public final /* synthetic */ WalletLqtPlanBeforeHomeUI f208328a;

    public C71798h1(WalletLqtPlanBeforeHomeUI walletLqtPlanBeforeHomeUI) {
        this.f208328a = walletLqtPlanBeforeHomeUI;
    }

    /* renamed from: a */
    public void mo67542a(Object obj) {
        C78012xd3 xd32 = (C78012xd3) obj;
        Log.m105924i("MicroMsg.WalletLqtPlanBeforeHomeUI", "on index cache callback");
    }

    /* renamed from: b */
    public void mo67543b(Object obj, int i, int i2) {
        C78012xd3 xd32 = (C78012xd3) obj;
        Class<WalletLqtPlanHomeUI> cls = WalletLqtPlanHomeUI.class;
        Log.m105924i("MicroMsg.WalletLqtPlanBeforeHomeUI", "on index response callback");
        if (xd32 != null) {
            int i3 = xd32.f228407d;
            if (i3 == 0) {
                LinkedList<C78017yd3> linkedList = xd32.f228409f;
                if (linkedList == null || linkedList.isEmpty()) {
                    Log.m105924i("MicroMsg.WalletLqtPlanBeforeHomeUI", "go to WalletLqtPlanAddUI");
                    Intent intent = new Intent(this.f208328a, cls);
                    if (xd32.f228415o == 1) {
                        intent.putExtra("key_plan_go_scene_ui", 1);
                    } else {
                        intent.putExtra("key_plan_go_scene_ui", 2);
                    }
                    WalletLqtPlanBeforeHomeUI walletLqtPlanBeforeHomeUI = this.f208328a;
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    WalletLqtPlanBeforeHomeUI walletLqtPlanBeforeHomeUI2 = walletLqtPlanBeforeHomeUI;
                    C117292a.m165358d(walletLqtPlanBeforeHomeUI2, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanBeforeHomeUI$1", "netCallback", "(Lcom/tencent/mm/protocal/protobuf/PlanIndexResp;II)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    walletLqtPlanBeforeHomeUI.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(walletLqtPlanBeforeHomeUI2, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanBeforeHomeUI$1", "netCallback", "(Lcom/tencent/mm/protocal/protobuf/PlanIndexResp;II)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else {
                    Log.m105924i("MicroMsg.WalletLqtPlanBeforeHomeUI", "go to WalletLqtPlanHomeUI");
                    Intent intent2 = new Intent(this.f208328a, cls);
                    intent2.putExtra("key_plan_go_scene_ui", 3);
                    intent2.putExtra("key_plan_index_resp", CgiLqtPlanIndex.m84097k(xd32));
                    WalletLqtPlanBeforeHomeUI walletLqtPlanBeforeHomeUI3 = this.f208328a;
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(intent2);
                    WalletLqtPlanBeforeHomeUI walletLqtPlanBeforeHomeUI4 = walletLqtPlanBeforeHomeUI3;
                    C117292a.m165358d(walletLqtPlanBeforeHomeUI4, aVar2.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanBeforeHomeUI$1", "netCallback", "(Lcom/tencent/mm/protocal/protobuf/PlanIndexResp;II)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    walletLqtPlanBeforeHomeUI3.startActivity((Intent) aVar2.mo10231a(0));
                    C117292a.m165359e(walletLqtPlanBeforeHomeUI4, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanBeforeHomeUI$1", "netCallback", "(Lcom/tencent/mm/protocal/protobuf/PlanIndexResp;II)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            } else {
                C67197o.m79488c(i3, xd32.f228408e).mo91297a(this.f208328a, true);
            }
        } else {
            C67197o.m79487b(-1, -1).mo91297a(this.f208328a, true);
        }
        this.f208328a.finish();
    }
}
