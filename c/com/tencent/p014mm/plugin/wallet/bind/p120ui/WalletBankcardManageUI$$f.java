package com.tencent.p014mm.plugin.wallet.bind.p120ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import b63.C67185g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Date;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI$$f */
public class WalletBankcardManageUI$$f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletBankcardManageUI f208471d;

    public WalletBankcardManageUI$$f(WalletBankcardManageUI walletBankcardManageUI) {
        this.f208471d = walletBankcardManageUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getId() == C0966R.C0970id.lgn) {
            C67185g a = C67185g.m79463a();
            if (a.mo91288b()) {
                WalletBankcardManageUI walletBankcardManageUI = this.f208471d;
                C76879j.m92748s(walletBankcardManageUI, a.f192891b, walletBankcardManageUI.getString(C0966R.string.a3h));
                C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C75228t.m90243e0(19, 1);
            this.f208471d.mo99044H7((Bundle) null);
            C115669n.INSTANCE.mo160131h(14422, 2);
        } else if (view.getId() == C0966R.C0970id.lgs) {
            Object tag = view.getTag();
            long time = new Date().getTime();
            view.setTag(Long.valueOf(time));
            if (tag == null || time - ((Long) tag).longValue() >= 1000) {
                Intent intent = new Intent();
                intent.putExtra(C74928u.C45093i.f122326r, true);
                intent.putExtra("rawUrl", this.f208471d.f208455t.field_loan_jump_url);
                C75228t.m90217J(this.f208471d.getContext(), intent);
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_LOAN_ENTRANCE_RED_POINT_INT, Integer.valueOf(this.f208471d.f208455t.field_red_dot_index));
                C75228t.m90243e0(6, 1);
            } else {
                C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
