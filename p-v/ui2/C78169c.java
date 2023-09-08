package ui2;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.remittance.bankcard.model.TransferRecordParcel;
import com.tencent.p014mm.plugin.remittance.bankcard.p096ui.BankRemitBankcardInputUI;
import com.tencent.p014mm.plugin.remittance.bankcard.p096ui.BankRemitSelectPayeeUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import java.util.ArrayList;

/* renamed from: ui2.c */
public class C78169c extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ BankRemitBankcardInputUI f229018g;

    public C78169c(BankRemitBankcardInputUI bankRemitBankcardInputUI) {
        this.f229018g = bankRemitBankcardInputUI;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        Log.m105918d("MicroMsg.BankRemitBankcardInputUI", "name iv click");
        BankRemitBankcardInputUI bankRemitBankcardInputUI = this.f229018g;
        if (bankRemitBankcardInputUI.f203718L || !bankRemitBankcardInputUI.f203719M) {
            bankRemitBankcardInputUI.mo97157P7(true);
        } else {
            Intent intent = new Intent(this.f229018g.getContext(), BankRemitSelectPayeeUI.class);
            ArrayList<TransferRecordParcel> arrayList = this.f229018g.f203739s;
            if (arrayList != null) {
                intent.putParcelableArrayListExtra("key_self_transfer_record_list", arrayList);
            }
            ArrayList<TransferRecordParcel> arrayList2 = this.f229018g.f203740t;
            if (arrayList2 != null) {
                intent.putParcelableArrayListExtra("key_freq_transfer_record_list", arrayList2);
            }
            this.f229018g.startActivityForResult(intent, 1);
        }
        C115669n.INSTANCE.mo160131h(14673, 3);
    }
}
