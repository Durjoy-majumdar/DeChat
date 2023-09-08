package ui2;

import android.view.View;
import com.tencent.p014mm.plugin.remittance.bankcard.p096ui.BankRemitMoneyInputUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import j20.C117292a;
import java.util.ArrayList;
import te3.cz4;
import te3.ez4;

/* renamed from: ui2.g */
public class C52583g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ez4 f146867d;

    /* renamed from: e */
    public final /* synthetic */ BankRemitMoneyInputUI f146868e;

    public C52583g(BankRemitMoneyInputUI bankRemitMoneyInputUI, ez4 ez4) {
        this.f146868e = bankRemitMoneyInputUI;
        this.f146867d = ez4;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitMoneyInputUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ez4 ez4 = this.f146867d;
        Log.m105925i("MicroMsg.BankRemitMoneyInputUI", " click option item : %s ,type:%s", ez4.f133210d, Integer.valueOf(ez4.f133211e.f132043d));
        cz4 cz4 = this.f146867d.f133211e;
        int i = cz4.f132043d;
        if (i == 1) {
            Log.m105925i("MicroMsg.BankRemitMoneyInputUI", " textInfo.jumpInfo.url ：%s", cz4.f132044e);
            C75228t.m90219L(this.f146868e.getContext(), this.f146867d.f133211e.f132044e, false);
        } else if (i == 2) {
            Log.m105925i("MicroMsg.BankRemitMoneyInputUI", " textInfo.jumpInfo.username ：%s", cz4.f132045f);
            cz4 cz42 = this.f146867d.f133211e;
            C75228t.m90224Q(cz42.f132045f, cz42.f132046g, 0, 1000);
        } else if (i != 3) {
            Log.m105920e("MicroMsg.BankRemitMoneyInputUI", "unknow text info type");
        } else {
            Log.m105920e("MicroMsg.BankRemitMoneyInputUI", " text info type is OPTIONS_MENU_ITEM_JUMP_TYPE_NATIVE");
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitMoneyInputUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
