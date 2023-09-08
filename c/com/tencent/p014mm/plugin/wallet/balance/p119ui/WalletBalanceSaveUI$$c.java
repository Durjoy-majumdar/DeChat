package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import di3.C86312j;
import h81.C32735h;
import j20.C117292a;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import k53.C76492a;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI$$c */
public class WalletBalanceSaveUI$$c extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ WalletBalanceSaveUI f207855g;

    public WalletBalanceSaveUI$$c(WalletBalanceSaveUI walletBalanceSaveUI) {
        this.f207855g = walletBalanceSaveUI;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        WalletBalanceSaveUI walletBalanceSaveUI = this.f207855g;
        walletBalanceSaveUI.f207851z.clear();
        C76492a aVar = walletBalanceSaveUI.f207845t;
        if (aVar == null || !aVar.mo106726a()) {
            walletBalanceSaveUI.f207845t = new C76492a(walletBalanceSaveUI);
            List list = walletBalanceSaveUI.f207833e;
            if (list == null) {
                list = new LinkedList();
            }
            int size = list.size();
            for (int i = 0; i < list.size(); i++) {
                Bankcard bankcard = (Bankcard) list.get(i);
                if (walletBalanceSaveUI.f207834f != null && !Util.isNullOrNil(bankcard.field_bindSerial) && walletBalanceSaveUI.f207834f.field_bindSerial.equals(bankcard.field_bindSerial)) {
                    size = i;
                }
            }
            if (walletBalanceSaveUI.f207834f == null) {
                size = -1;
            }
            boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_payment_select_remove_confirm_button_android, false);
            walletBalanceSaveUI.f207845t.f223923c = new C71858w(walletBalanceSaveUI, list);
            C76874e0 e0Var = new C76874e0(walletBalanceSaveUI);
            e0Var.mo107156p(0, walletBalanceSaveUI.getString(C0966R.string.km8), (CharSequence) null, walletBalanceSaveUI.getResources().getDrawable(C0966R.raw.icons_outlined_pay_cards), walletBalanceSaveUI.getResources().getColor(C0966R.color.FG_2), false);
            if (wf) {
                e0Var.mo107160r(1, "", true);
            }
            C76492a aVar2 = walletBalanceSaveUI.f207845t;
            C71862x xVar = new C71862x(walletBalanceSaveUI);
            aVar2.f223927g = e0Var;
            aVar2.f223925e = xVar;
            if (wf) {
                aVar2.f223924d = new C71863y(walletBalanceSaveUI, list);
            } else {
                aVar2.f223921a.f296375F = new C71864z(walletBalanceSaveUI, list);
            }
            View inflate = View.inflate(walletBalanceSaveUI, C0966R.C0971layout.b98, (ViewGroup) null);
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0966R.C0970id.g9o);
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.gbk);
            textView.setText(C0966R.string.kkp);
            C85875k4.m106189j0(textView.getPaint(), 0.8f);
            View findViewById = inflate.findViewById(C0966R.C0970id.c4p);
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view2 = findViewById;
            C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceSaveUI", "showBankcardList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceSaveUI", "showBankcardList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate.findViewById(C0966R.C0970id.gal).setOnClickListener(new C71699a0(walletBalanceSaveUI));
            inflate.findViewById(C0966R.C0970id.gal).setContentDescription(walletBalanceSaveUI.getString(C0966R.string.kk5));
            C76492a aVar4 = walletBalanceSaveUI.f207845t;
            aVar4.f223921a.mo140673s(inflate);
            aVar4.f223930j = inflate;
            C76492a aVar5 = walletBalanceSaveUI.f207845t;
            aVar5.f223933m = size;
            aVar5.f223932l = true;
            if (wf) {
                aVar5.f223931k = false;
            } else {
                aVar5.f223931k = true;
            }
            aVar5.f223921a.mo140677w(walletBalanceSaveUI.getResources().getString(C0966R.string.kse));
            walletBalanceSaveUI.f207845t.mo106729d();
            MMHandlerThread.postToMainThreadDelayed(new C71703b0(walletBalanceSaveUI, textView), 500);
            walletBalanceSaveUI.showCircleStWcKb();
            return;
        }
        Log.m105924i("MicroMsg.WalletBalanceSaveUI", "mmBottomSheet != null && mmBottomSheet.isShowing(),dont show bottomSheet");
    }
}
