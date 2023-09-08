package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import b63.C67187h;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C43290f0;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C43308p;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71648n1;
import com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt.WalletLqtSaveFetchUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75197d0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di3.C86312j;
import ep3.C97688c;
import hp3.C87581a;
import ie3.C76324c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C9556a;
import ke3.C88144b;
import ob0.C89132b;
import te3.C64514l50;
import te3.C78023zk3;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.q */
public class C71851q extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ WalletBalanceManagerUI f208407g;

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.q$a */
    public class C71852a implements C87581a<Void, C89132b.C89134c<C78023zk3>> {

        /* renamed from: a */
        public final /* synthetic */ Dialog f208408a;

        /* renamed from: b */
        public final /* synthetic */ String f208409b;

        public C71852a(Dialog dialog, String str) {
            this.f208408a = dialog;
            this.f208409b = str;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            boolean z = true;
            Log.m105925i("MicroMsg.WalletBalanceManagerUI", "on qryusrfunddetail finish, errType: %s, errCode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
            Dialog dialog = this.f208408a;
            if (dialog != null) {
                dialog.dismiss();
            }
            if (C71851q.this.f208407g.isFinishing() || C71851q.this.f208407g.isDestroyed()) {
                Log.m105928w("MicroMsg.WalletBalanceManagerUI", "this activity has finished");
                return null;
            } else if (cVar.f256793a != 0 || cVar.f256794b != 0) {
                return null;
            } else {
                C78023zk3 zk32 = (C78023zk3) cVar.f256796d;
                Log.m105925i("MicroMsg.WalletBalanceManagerUI", "on qryusrfunddetail finsih, retcode: %s, retmsg: %s", Integer.valueOf(zk32.f228723d), zk32.f228724e);
                if (zk32.f228723d != 0) {
                    return null;
                }
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
                C43290f0 f0Var = (C43290f0) new C97688c().mo136940b(C71851q.this.f208407g.getContext(), C43290f0.class);
                if (f0Var == null || C71851q.this.f208407g.isFinishing() || C71851q.this.f208407g.isDestroyed()) {
                    return null;
                }
                f0Var.f117129e.mo67529b(zk32.f228693C, 3);
                Intent intent = new Intent(C71851q.this.f208407g.getContext(), WalletLqtSaveFetchUI.class);
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
                intent.putExtra("operate_id", this.f208409b);
                intent.putExtra("entrance_type", 3);
                if (((C76324c) C86312j.m106911c(C76324c.class)).startLqtSaveUseCase(C71851q.this.f208407g.getContext(), intent, new C71850p(this))) {
                    return null;
                }
                WalletBalanceManagerUI walletBalanceManagerUI = C71851q.this.f208407g;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                WalletBalanceManagerUI walletBalanceManagerUI2 = walletBalanceManagerUI;
                C117292a.m165358d(walletBalanceManagerUI2, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI$11$1", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Void;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                walletBalanceManagerUI.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(walletBalanceManagerUI2, "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI$11$1", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Void;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return null;
            }
        }
    }

    public C71851q(WalletBalanceManagerUI walletBalanceManagerUI) {
        this.f208407g = walletBalanceManagerUI;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        Log.m105924i("MicroMsg.WalletBalanceManagerUI", "click action entry");
        WalletBalanceManagerUI walletBalanceManagerUI = this.f208407g;
        C67187h hVar = walletBalanceManagerUI.f207798r;
        int i = hVar.f192895b;
        if (i == 1) {
            if (!Util.isNullOrNil(hVar.f192896c)) {
                if (this.f208407g.f207798r.f192896c.startsWith("weixin://wcpay/lqt/detail")) {
                    C71648n1.m84124b(this.f208407g.f207798r.f192896c);
                    Intent intent = new Intent();
                    intent.putExtra("key_account_type", 1);
                    if (!((C76324c) C86312j.m106911c(C76324c.class)).startLqtDetailUseCase(this.f208407g.getContext(), intent)) {
                        C88144b.m109791i(this.f208407g.getContext(), "wallet", ".balance.ui.lqt.WalletLqtDetailUI", intent, (Bundle) null);
                    }
                } else if (this.f208407g.f207798r.f192896c.startsWith("weixin://wcpay/lqt/save")) {
                    C71648n1.m84124b(this.f208407g.f207798r.f192896c);
                    String a = C71648n1.m84123a(this.f208407g.f207798r.f192896c);
                    new C43308p().mo9225i().mo123062e(new C71852a(C75197d0.m90163d(this.f208407g.getContext(), false, false, (DialogInterface.OnCancelListener) null), a));
                }
            }
        } else if (i == 2) {
            C75228t.m90221N(walletBalanceManagerUI.getContext(), this.f208407g.f207798r.f192897d, true);
        } else if (i == 3) {
            C75228t.m90224Q(hVar.f192898e, hVar.f192899f, 0, 1061);
        } else {
            Log.m105929w("MicroMsg.WalletBalanceManagerUI", "unknown type: %s", Integer.valueOf(i));
        }
    }
}
