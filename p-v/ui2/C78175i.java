package ui2;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.remittance.bankcard.p096ui.BankRemitMoneyInputUI;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import si2.C77715m;
import te3.C77971o4;
import te3.C77980pt3;

/* renamed from: ui2.i */
public class C78175i implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C77971o4 f229025d;

    /* renamed from: e */
    public final /* synthetic */ C77715m f229026e;

    /* renamed from: f */
    public final /* synthetic */ BankRemitMoneyInputUI f229027f;

    public C78175i(BankRemitMoneyInputUI bankRemitMoneyInputUI, C77971o4 o4Var, C77715m mVar) {
        this.f229027f = bankRemitMoneyInputUI;
        this.f229025d = o4Var;
        this.f229026e = mVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (Util.isNullOrNil(this.f229025d.f227905h)) {
            BankRemitMoneyInputUI bankRemitMoneyInputUI = this.f229027f;
            int i2 = BankRemitMoneyInputUI.f203789R;
            if (bankRemitMoneyInputUI.mKindaEnable) {
                bankRemitMoneyInputUI.showLoading();
            }
            BankRemitMoneyInputUI bankRemitMoneyInputUI2 = this.f229027f;
            C77980pt3 pt32 = this.f229026e.f226502s;
            BankRemitMoneyInputUI.m83042J7(bankRemitMoneyInputUI2, pt32.f228040f, pt32.f228043i, pt32.f228044j, pt32.f228042h);
        } else if (!Util.isNullOrNil(this.f229025d.f227905h)) {
            C75228t.m90219L(this.f229027f.getContext(), this.f229025d.f227905h, false);
        }
    }
}
