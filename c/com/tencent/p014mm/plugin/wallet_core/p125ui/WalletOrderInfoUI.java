package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.content.DialogInterface;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import eb0.C31519v2;
import eb0.C75597w2;
import f40.C86709a0;
import f62.C75700k0;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;
import v53.C78343f0;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoUI */
public class WalletOrderInfoUI extends WalletBaseUI {

    /* renamed from: d */
    public Orders f210253d;

    /* renamed from: e */
    public String f210254e;

    /* renamed from: f */
    public C75597w2.C31525a f210255f = new C5787a();

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoUI$a */
    public class C5787a implements C75597w2.C31525a {
        public C5787a() {
        }

        /* renamed from: a */
        public void mo1109a(String str, boolean z) {
            C86709a0.m107528h();
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
            Log.m105918d("MicroMsg.WalletOrderInfoUI", "call back from contactServer " + str + " succ: " + z);
            WalletOrderInfoUI.this.mo99607N7(z1Var);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoUI$b */
    public class C72300b implements DialogInterface.OnClickListener {
        public C72300b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            WalletOrderInfoUI.this.finish();
        }
    }

    /* renamed from: H7 */
    public String mo99629H7(String str, String str2, String str3, String str4, String str5) {
        try {
            String encode = URLEncoder.encode(URLEncoder.encode(str5, "utf-8"), "utf-8");
            if (str.indexOf("%7Breqkey%7D") <= 0) {
                if (str.indexOf("%7Btransid%7D") <= 0 && str.indexOf("%7Bphone%7D") <= 0) {
                    if (str.indexOf("%7Bremark%7D") <= 0) {
                        if (str.indexOf("{reqkey}") <= 0) {
                            if (str.indexOf("{transid}") <= 0 && str.indexOf("{phone}") <= 0) {
                                if (str.indexOf("{remark}") <= 0) {
                                    Log.m105924i("MicroMsg.WalletOrderInfoUI", "concat url 3: ");
                                    return str + String.format("?reqkey=%s&transid=%s&phone=%s&remark=%s", new Object[]{str2, str3, str4, encode});
                                }
                            }
                        }
                        Log.m105924i("MicroMsg.WalletOrderInfoUI", "concat url 2: ");
                        return str.replace("{reqkey}", str2).replace("{transid}", str3).replace("{phone}", str4).replace("{remark}", encode);
                    }
                }
            }
            Log.m105924i("MicroMsg.WalletOrderInfoUI", "concat url 1: ");
            return str.replace("%7Breqkey%7D", str2).replace("%7Btransid%7D", str3).replace("%7Bphone%7D", str4).replace("%7Bremark%7D", encode);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WalletOrderInfoUI", e, "", new Object[0]);
            return str;
        }
    }

    /* renamed from: I7 */
    public void mo99605I7(String str) {
        doSceneProgress(new C78343f0(str));
    }

    /* renamed from: J7 */
    public void mo99606J7(String str, int i) {
        doSceneProgress(new C78343f0(str, i));
    }

    /* renamed from: K7 */
    public Orders mo99582K7() {
        return (Orders) getInput().getParcelable("key_orders");
    }

    /* renamed from: L7 */
    public void mo99630L7(Orders orders) {
        Log.printInfoStack("MicroMsg.WalletOrderInfoUI", "goToOrderInfoUI, is_use_new_paid_succ_page: %d", Integer.valueOf(orders.f209555V));
        if (orders.f209555V == 1) {
            getProcess().mo109103B(this, WalletOrderInfoNewUI.class, getInput());
        } else {
            getProcess().mo109103B(this, WalletOrderInfoOldUI.class, getInput());
        }
        finish();
    }

    /* renamed from: M7 */
    public boolean mo99591M7() {
        return true;
    }

    /* renamed from: N7 */
    public void mo99607N7(C72996z1 z1Var) {
        if (z1Var != null && ((int) z1Var.f108320R1) != 0) {
            String j3 = z1Var.mo62909j3();
            Log.m105918d("MicroMsg.WalletOrderInfoUI", "call back from contactServer nickName " + j3 + " username: " + z1Var.getUsername());
            List<Orders.Commodity> list = this.f210253d.f209542M;
            if (list != null && ((ArrayList) list).size() > 0) {
                Iterator it = ((ArrayList) this.f210253d.f209542M).iterator();
                while (it.hasNext()) {
                    ((Orders.Commodity) it.next()).f209609u = j3;
                }
            }
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cat;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (mo99591M7()) {
            this.f210253d = mo99582K7();
            this.f210254e = getInput().getString("key_trans_id");
            int i = getInput().getInt("key_pay_type", -1);
            Log.m105925i("MicroMsg.WalletOrderInfoUI", "mTransId %s", this.f210254e);
            String str = this.f210254e;
            if (str == null) {
                Orders orders = this.f210253d;
                if (orders != null) {
                    mo99630L7(orders);
                }
            } else if (i == -1) {
                mo99605I7(str);
            } else {
                mo99606J7(str, i);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        Orders orders = this.f210253d;
        if (orders != null && !Util.isNullOrNil(orders.f209577u)) {
            C31519v2.m39436a().mo55989f(this.f210253d.f209577u);
        }
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (!(yVar instanceof C78343f0) || i != 0 || i2 != 0) {
            return false;
        }
        Orders orders = ((C78343f0) yVar).f229577d;
        this.f210253d = orders;
        if (orders != null) {
            List<Orders.Commodity> list = orders.f209542M;
            if (!(list == null || ((ArrayList) list).size() == 0)) {
                Orders.Commodity commodity = (Orders.Commodity) ((ArrayList) this.f210253d.f209542M).get(0);
                this.f210254e = commodity.f209606r;
                Log.m105918d("MicroMsg.WalletOrderInfoUI", "Coomdity:" + commodity.toString());
                C86709a0.m107528h();
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(commodity.f209609u);
                if (z1Var == null || ((int) z1Var.f108320R1) == 0) {
                    C31519v2.m39436a().mo55988e(commodity.f209609u, "", this.f210255f);
                } else {
                    mo99607N7(z1Var);
                }
            }
            mo99630L7(this.f210253d);
            return true;
        }
        Log.m105920e("MicroMsg.WalletOrderInfoUI", "cannot get orders");
        C76879j.m92742m(getContext(), C0966R.string.l0d, 0, new C72300b());
        return true;
    }
}
