package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import al3.C0086a;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C43290f0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75197d0;
import ep3.C97688c;
import qo3.C77389a;
import qo3.C77398g;
import v53.C78350l0;
import v53.C78351m0;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI$$f */
public class WalletBalanceSaveUI$$f extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ WalletBalanceSaveUI f207861g;

    public WalletBalanceSaveUI$$f(WalletBalanceSaveUI walletBalanceSaveUI) {
        this.f207861g = walletBalanceSaveUI;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        C43290f0.C43292b bVar;
        Log.m105925i("MicroMsg.WalletBalanceSaveUI", "click lqt entrance: %s", Boolean.valueOf(this.f207861g.f207843r.f229601c));
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo160131h(17084, 5);
        WalletBalanceSaveUI walletBalanceSaveUI = this.f207861g;
        C78351m0 m0Var = walletBalanceSaveUI.f207843r;
        if (m0Var.f229601c) {
            walletBalanceSaveUI.hideWcKb();
            WalletBalanceSaveUI walletBalanceSaveUI2 = this.f207861g;
            walletBalanceSaveUI2.getClass();
            C43290f0 f0Var = (C43290f0) new C97688c().mo136940b(walletBalanceSaveUI2, C43290f0.class);
            Dialog d = C75197d0.m90163d(walletBalanceSaveUI2, false, false, (DialogInterface.OnCancelListener) null);
            if (f0Var == null || (bVar = f0Var.f117126b) == null) {
                Log.m105924i("MicroMsg.WalletBalanceSaveUI", "fetchDetail() interactorGlueApi == null || interactorGlueApi.fetchLqtDetail == null");
            } else {
                bVar.mo67528b().mo123062e(new C71709e0(walletBalanceSaveUI2, f0Var, d)).mo123065b(new C71705c0(walletBalanceSaveUI2, d));
            }
        } else if (m0Var.f229602d != null) {
            nVar.mo160131h(17084, 6);
            C78350l0 l0Var = walletBalanceSaveUI.f207843r.f229602d;
            Log.m105924i("MicroMsg.WalletBalanceSaveUI", "show open lqt alert");
            AppCompatActivity context = walletBalanceSaveUI.getContext();
            C77389a aVar = new C77389a();
            aVar.f225660q = l0Var.f229595a;
            aVar.f225664u = C0086a.m38a(context).getString(C0966R.string.f361577kz3);
            aVar.f225663t = C0086a.m38a(context).getString(C0966R.string.kxf);
            aVar.f225620C = new C71711f0(walletBalanceSaveUI, l0Var);
            aVar.f225641X = true;
            aVar.f225621D = new C71713g0(walletBalanceSaveUI);
            C77398g gVar = new C77398g(context, C0966R.style.a66);
            gVar.mo107525e(aVar);
            gVar.show();
        }
    }
}
