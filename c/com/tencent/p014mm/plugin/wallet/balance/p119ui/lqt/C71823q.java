package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.app.Dialog;
import android.content.Intent;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C43290f0;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71648n1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import ep3.C97688c;
import hp3.C87581a;
import ie3.C76324c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C9556a;
import ob0.C89132b;
import te3.C64514l50;
import te3.C78023zk3;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.q */
public class C71823q implements C87581a<Void, C89132b.C89134c<C78023zk3>> {

    /* renamed from: a */
    public final /* synthetic */ Dialog f208365a;

    /* renamed from: b */
    public final /* synthetic */ WalletLqtBeforeSaveUI f208366b;

    public C71823q(WalletLqtBeforeSaveUI walletLqtBeforeSaveUI, Dialog dialog) {
        this.f208366b = walletLqtBeforeSaveUI;
        this.f208365a = dialog;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        boolean z = true;
        Log.m105925i("MicroMsg.WalletLqtBeforeSaveUI", "on qryusrfunddetail finish, errType: %s, errCode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
        this.f208365a.dismiss();
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            C78023zk3 zk32 = (C78023zk3) cVar.f256796d;
            Log.m105925i("MicroMsg.WalletLqtBeforeSaveUI", "on qryusrfunddetail finsih, retcode: %s, retmsg: %s", Integer.valueOf(zk32.f228723d), zk32.f228724e);
            if (zk32.f228723d == 0) {
                C71648n1.m84125c(zk32.f228715U0);
                ArrayList arrayList = new ArrayList();
                LinkedList<C64514l50> linkedList = zk32.f228734q;
                if (linkedList != null && linkedList.size() > 0) {
                    Iterator<C64514l50> it = zk32.f228734q.iterator();
                    while (it.hasNext()) {
                        C64514l50 next = it.next();
                        if (!Util.isNullOrNil(next.f184038d) && !Util.isNullOrNil(next.f184040f)) {
                            arrayList.add(String.format("%s||%s", new Object[]{next.f184038d, next.f184040f}));
                        }
                    }
                }
                ((C43290f0) new C97688c().mo136940b(this.f208366b.getContext(), C43290f0.class)).f117129e.mo67529b(zk32.f228693C, 1);
                Intent intent = new Intent(this.f208366b.getContext(), WalletLqtSaveFetchUI.class);
                intent.putExtra("lqt_save_fund_code", zk32.f228735r);
                intent.putExtra("lqt_save_fetch_mode", 1);
                intent.putExtra("lqt_is_show_protocol", zk32.f228731o == 1);
                if (zk32.f228732p != 1) {
                    z = false;
                }
                intent.putExtra("lqt_is_agree_protocol", z);
                intent.putStringArrayListExtra("lqt_protocol_list", arrayList);
                intent.putExtra("lqt_profile_wording", zk32.f228745z);
                intent.putExtra("lqt_account_type", zk32.f228693C);
                intent.putExtra("lqt_fund_spid", zk32.f228694D);
                if (!((C76324c) C86312j.m106911c(C76324c.class)).startLqtSaveUseCase(this.f208366b.getContext(), intent, new C71817p(this))) {
                    WalletLqtBeforeSaveUI walletLqtBeforeSaveUI = this.f208366b;
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    WalletLqtBeforeSaveUI walletLqtBeforeSaveUI2 = walletLqtBeforeSaveUI;
                    C117292a.m165358d(walletLqtBeforeSaveUI2, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtBeforeSaveUI$1", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Void;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    walletLqtBeforeSaveUI.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(walletLqtBeforeSaveUI2, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtBeforeSaveUI$1", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Void;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
                this.f208366b.setResult(-1);
            }
        }
        this.f208366b.finish();
        return null;
    }
}
