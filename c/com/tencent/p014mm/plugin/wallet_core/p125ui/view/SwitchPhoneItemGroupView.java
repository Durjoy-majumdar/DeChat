package com.tencent.p014mm.plugin.wallet_core.p125ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletSwitchVerifyPhoneUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import te3.C77958k9;
import yq3.C79143a;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.SwitchPhoneItemGroupView */
public class SwitchPhoneItemGroupView extends LinearLayout {

    /* renamed from: d */
    public List<SwitchPhoneItemView> f210704d = new ArrayList();

    /* renamed from: e */
    public C72441b f210705e;

    /* renamed from: f */
    public View.OnClickListener f210706f = new C72440a();

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.SwitchPhoneItemGroupView$a */
    public class C72440a implements View.OnClickListener {
        public C72440a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/view/SwitchPhoneItemGroupView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Iterator it = ((ArrayList) SwitchPhoneItemGroupView.this.f210704d).iterator();
            while (it.hasNext()) {
                ((SwitchPhoneItemView) it.next()).f210710f.setImageResource(C0966R.raw.radio_off);
            }
            ((SwitchPhoneItemView) view).f210710f.setImageResource(C0966R.raw.radio_on);
            C72441b bVar = SwitchPhoneItemGroupView.this.f210705e;
            if (bVar != null) {
                WalletSwitchVerifyPhoneUI.C72314a aVar = (WalletSwitchVerifyPhoneUI.C72314a) bVar;
                aVar.getClass();
                if (view.getTag() != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    Log.m105919d("MicroMsg.WalletSwitchVerifyPhoneUI", "index: %d", Integer.valueOf(intValue));
                    if (intValue == -1) {
                        Log.m105924i("MicroMsg.WalletSwitchVerifyPhoneUI", "do bind new card");
                        WalletSwitchVerifyPhoneUI walletSwitchVerifyPhoneUI = WalletSwitchVerifyPhoneUI.this;
                        int i = WalletSwitchVerifyPhoneUI.f210294g;
                        walletSwitchVerifyPhoneUI.getInput().putBoolean("key_is_changing_balance_phone_num", true);
                        walletSwitchVerifyPhoneUI.getInput().putInt("key_pay_flag", 2);
                        C79143a.m95765d(walletSwitchVerifyPhoneUI, walletSwitchVerifyPhoneUI.getInput());
                    } else if (intValue == -2) {
                        Log.m105924i("MicroMsg.WalletSwitchVerifyPhoneUI", "do verify idcard tail");
                        WalletSwitchVerifyPhoneUI.this.getInput().putBoolean("key_forward_to_id_verify", true);
                        WalletSwitchVerifyPhoneUI walletSwitchVerifyPhoneUI2 = WalletSwitchVerifyPhoneUI.this;
                        C79143a.m95765d(walletSwitchVerifyPhoneUI2, walletSwitchVerifyPhoneUI2.getInput());
                    } else {
                        C77958k9 k9Var = (C77958k9) ((LinkedList) WalletSwitchVerifyPhoneUI.this.f210296e).get(intValue);
                        WalletSwitchVerifyPhoneUI.this.getInput().putBoolean("key_balance_change_phone_need_confirm_phone", false);
                        WalletSwitchVerifyPhoneUI.this.getInput().putBoolean("key_forward_to_id_verify", false);
                        Log.m105925i("MicroMsg.WalletSwitchVerifyPhoneUI", "select wx phone: %s", Boolean.valueOf(k9Var.f227734d.equals("wx")));
                        WalletSwitchVerifyPhoneUI.this.getNetController().mo91271d(k9Var);
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/view/SwitchPhoneItemGroupView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.SwitchPhoneItemGroupView$b */
    public interface C72441b {
    }

    public SwitchPhoneItemGroupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo99798a(SwitchPhoneItemView switchPhoneItemView, int i) {
        addView(switchPhoneItemView, i);
        this.f210704d.add(switchPhoneItemView);
        switchPhoneItemView.setOnClickListener(this.f210706f);
    }

    public void setOnItemSelectListener(C72441b bVar) {
        this.f210705e = bVar;
    }

    public SwitchPhoneItemGroupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
