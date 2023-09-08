package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.o1 */
public class C72410o1 implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletSelectBankcardUI f210652d;

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.o1$a */
    public class C72411a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Bankcard f210653d;

        public C72411a(Bankcard bankcard) {
            this.f210653d = bankcard;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C72410o1.this.f210652d.getInput().putBoolean("key_balance_change_phone_need_confirm_phone", false);
            WalletSelectBankcardUI.m84648H7(C72410o1.this.f210652d, this.f210653d);
            C115669n.INSTANCE.mo160131h(11977, 0, 0, 0, 0, 1, 0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.o1$b */
    public class C72412b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Bankcard f210655d;

        public C72412b(Bankcard bankcard) {
            this.f210655d = bankcard;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C72410o1.this.f210652d.getInput().putBoolean("key_balance_change_phone_need_confirm_phone", true);
            WalletSelectBankcardUI.m84648H7(C72410o1.this.f210652d, this.f210655d);
        }
    }

    public C72410o1(WalletSelectBankcardUI walletSelectBankcardUI) {
        this.f210652d = walletSelectBankcardUI;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletSelectBankcardUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        Bankcard bankcard = (Bankcard) adapterView.getItemAtPosition(i);
        if (bankcard != null) {
            WalletSelectBankcardUI walletSelectBankcardUI = this.f210652d;
            C76879j.m92717K(walletSelectBankcardUI, true, walletSelectBankcardUI.getString(C0966R.string.l8j, new Object[]{bankcard.field_desc, bankcard.field_mobile}), this.f210652d.getString(C0966R.string.l8l), this.f210652d.getString(C0966R.string.l8i), this.f210652d.getString(C0966R.string.l8k), new C72411a(bankcard), new C72412b(bankcard));
        } else {
            this.f210652d.getInput().putBoolean("key_balance_change_phone_need_confirm_phone", false);
            WalletSelectBankcardUI.m84648H7(this.f210652d, (Bankcard) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletSelectBankcardUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
