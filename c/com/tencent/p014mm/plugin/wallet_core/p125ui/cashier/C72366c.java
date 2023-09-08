package com.tencent.p014mm.plugin.wallet_core.p125ui.cashier;

import android.view.View;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72400m;
import com.tencent.p014mm.plugin.wallet_core.p125ui.cashier.C72362a;
import com.tencent.p014mm.plugin.wallet_core.p125ui.cashier.WcPayCashierDialog;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75155x0;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import java.util.ArrayList;
import java.util.Iterator;
import y43.C79028b;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.cashier.c */
public class C72366c extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ Bankcard f210502g;

    /* renamed from: h */
    public final /* synthetic */ C72362a f210503h;

    public C72366c(C72362a aVar, Bankcard bankcard) {
        this.f210503h = aVar;
        this.f210502g = bankcard;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        Log.m105919d("MicroMsg.WcPayCashierBankcardDialog", "click bankcard: %s", this.f210502g.field_bindSerial);
        Iterator it = ((ArrayList) this.f210503h.f210487h).iterator();
        while (it.hasNext()) {
            WcPayCashierBankcardItemLayout wcPayCashierBankcardItemLayout = (WcPayCashierBankcardItemLayout) it.next();
            if (wcPayCashierBankcardItemLayout == view) {
                wcPayCashierBankcardItemLayout.f210396g.setChecked(true);
            } else {
                wcPayCashierBankcardItemLayout.f210396g.setChecked(false);
            }
        }
        this.f210503h.dismiss();
        C72362a.C72364b bVar = this.f210503h.f210498v;
        if (bVar != null) {
            Bankcard bankcard = this.f210502g;
            WcPayCashierDialog.C72352e eVar = (WcPayCashierDialog.C72352e) bVar;
            if (bankcard != null) {
                Log.m105925i("MicroMsg.WcPayCashierDialog", "on select bankcard: %s, %s", bankcard.field_bankName, bankcard.field_bindSerial);
                Bankcard bankcard2 = WcPayCashierDialog.this.f210424P;
                if (bankcard2 == null || !bankcard.field_bindSerial.equals(bankcard2.field_bindSerial)) {
                    PayInfo payInfo = WcPayCashierDialog.this.f210421L;
                    C75155x0.m90135a(payInfo == null ? 0 : payInfo.f212587e, payInfo == null ? "" : payInfo.f212592j, 13, bankcard.field_bindSerial);
                    WcPayCashierDialog wcPayCashierDialog = WcPayCashierDialog.this;
                    wcPayCashierDialog.f210424P = bankcard;
                    wcPayCashierDialog.f210423N = eVar.f210462a;
                    wcPayCashierDialog.mo99701n();
                    WcPayCashierDialog.this.mo99706q();
                    WcPayCashierDialog.this.mo99711u();
                    WcPayCashierDialog.this.mo99710t();
                    WcPayCashierDialog.this.mo99712v();
                    WcPayCashierDialog wcPayCashierDialog2 = WcPayCashierDialog.this;
                    if (wcPayCashierDialog2.f210427S) {
                        Orders orders = wcPayCashierDialog2.f210422M;
                        C79028b bVar2 = orders.f209543N.f232084w;
                        if (!(bVar2 == null || bVar2.f232035e != 1 || bVar2.f232034d == null)) {
                            FavorPayInfo g = C72400m.INSTANCE.mo99776a(orders).mo99771g(wcPayCashierDialog2.f210422M.f209543N.f232084w.f232036f);
                            if (wcPayCashierDialog2.f210424P == null || g.f209524d.equals("0") || !g.f209529i.contains(wcPayCashierDialog2.f210424P.field_bindSerial)) {
                                wcPayCashierDialog2.mo99713y(0);
                            } else {
                                wcPayCashierDialog2.mo99713y(8);
                            }
                        }
                    }
                    wcPayCashierDialog2.mo99713y(8);
                }
                WcPayCashierDialog wcPayCashierDialog3 = WcPayCashierDialog.this;
                ((ArrayList) wcPayCashierDialog3.f210454x0).remove(wcPayCashierDialog3.f210415F.f210499w);
                WcPayCashierDialog wcPayCashierDialog4 = WcPayCashierDialog.this;
                wcPayCashierDialog4.f210415F = null;
                wcPayCashierDialog4.show();
            }
        }
    }
}
