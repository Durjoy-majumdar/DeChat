package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import android.app.Dialog;
import android.content.Intent;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C43290f0;
import com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt.WalletLqtSaveFetchUI;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import hp3.C87581a;
import ie3.C76324c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import te3.C64514l50;
import te3.C78023zk3;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.e0 */
public class C71709e0 implements C87581a<Void, C78023zk3> {

    /* renamed from: a */
    public final /* synthetic */ C43290f0 f207894a;

    /* renamed from: b */
    public final /* synthetic */ Dialog f207895b;

    /* renamed from: c */
    public final /* synthetic */ WalletBalanceSaveUI f207896c;

    public C71709e0(WalletBalanceSaveUI walletBalanceSaveUI, C43290f0 f0Var, Dialog dialog) {
        this.f207896c = walletBalanceSaveUI;
        this.f207894a = f0Var;
        this.f207895b = dialog;
    }

    public Object call(Object obj) {
        C78023zk3 zk32 = (C78023zk3) obj;
        if (zk32 != null) {
            boolean z = false;
            Log.m105925i("MicroMsg.WalletBalanceSaveUI", "fetch detail success, account_type: %s, is_hide_close_account_btn: %s", Integer.valueOf(zk32.f228693C), Boolean.valueOf(zk32.f228692B));
            this.f207894a.f117129e.mo67529b(zk32.f228693C, 8);
            Log.m105924i("MicroMsg.WalletBalanceSaveUI", "goWalletLqtSaveFetchUI()");
            Dialog dialog = this.f207895b;
            if (dialog != null) {
                dialog.dismiss();
            }
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
            Intent intent = new Intent(this.f207896c.getContext(), WalletLqtSaveFetchUI.class);
            intent.putExtra("lqt_save_fund_code", zk32.f228735r);
            intent.putExtra("lqt_account_type", zk32.f228693C);
            intent.putExtra("lqt_fund_spid", zk32.f228694D);
            intent.putExtra("lqt_save_fetch_mode", 1);
            intent.putExtra("lqt_is_show_protocol", zk32.f228731o == 1);
            if (zk32.f228732p == 1) {
                z = true;
            }
            intent.putExtra("lqt_is_agree_protocol", z);
            intent.putExtra("operate_id", this.f207896c.f207843r.f229603e);
            intent.putStringArrayListExtra("lqt_protocol_list", arrayList);
            intent.putExtra("lqt_profile_wording", zk32.f228745z);
            intent.putExtra("entrance_type", 8);
            intent.putExtra("fill_money", this.f207896c.f207836h.getText());
            Bankcard bankcard = this.f207896c.f207834f;
            if (bankcard != null) {
                intent.putExtra("card_serial", bankcard.field_bindSerial);
            }
            if (((C76324c) C86312j.m106911c(C76324c.class)).startLqtSaveUseCase(this.f207896c.getContext(), intent, new C71707d0(this))) {
                return null;
            }
            this.f207896c.startActivityForResult(intent, 3);
            return null;
        }
        Log.m105924i("MicroMsg.WalletBalanceSaveUI", "fetch detail failed");
        return null;
    }
}
