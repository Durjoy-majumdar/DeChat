package com.tencent.p014mm.plugin.remittance.p098ui;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.F2fPayCheckEvent;
import com.tencent.p014mm.plugin.remittance.model.C70609r;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import java.util.ArrayList;
import nj3.C88989a;
import ob0.C117747y;
import p910lj.C76701a;
import te3.C50158kp;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceResultUI */
public class RemittanceResultUI extends WalletBaseUI {

    /* renamed from: d */
    public Orders f205195d;

    /* renamed from: H7 */
    public boolean mo97509H7() {
        return !(this instanceof RemittanceResultNewUI);
    }

    /* renamed from: I7 */
    public final void mo97513I7(Class<?> cls) {
        if (getProcess() == null) {
            startActivity(cls, getIntent());
        } else {
            getProcess().mo109103B(this, cls, getInput());
        }
    }

    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        Class<RemittanceResultNewUI> cls = RemittanceResultNewUI.class;
        super.onCreate(bundle);
        if (mo97509H7()) {
            setContentViewVisibility(4);
            getWindow().setBackgroundDrawableResource(C0966R.color.ahf);
            this.f205195d = (Orders) getInput().getParcelable("key_orders");
            PayInfo payInfo = (PayInfo) getInput().getParcelable("key_pay_info");
            int i = payInfo != null ? payInfo.f212587e : 0;
            boolean z = (i == 31 || i == 5) ? false : true;
            Object[] objArr = new Object[3];
            objArr[0] = Boolean.valueOf(this.f205195d == null);
            objArr[1] = Integer.valueOf(i);
            objArr[2] = Boolean.valueOf(z);
            Log.m105925i("MicroMsg.RemittanceResultUI", "orders==null:%s, paysScene: %s, needFetchF2fData: %s", objArr);
            Orders orders = this.f205195d;
            if (orders != null) {
                Log.m105925i("MicroMsg.RemittanceResultUI", "is_use_new_paid_succ_page: %s", Integer.valueOf(orders.f209555V));
                Orders orders2 = this.f205195d;
                if (orders2.f209555V != 1) {
                    mo97513I7(RemittanceResultOldUI.class);
                } else if (!z) {
                    mo97513I7(cls);
                    finish();
                } else if (payInfo == null || payInfo.f212600u == null) {
                    mo97513I7(cls);
                    finish();
                } else {
                    Log.m105924i("MicroMsg.RemittanceResultUI", "fetch f2f data");
                    String string = payInfo.f212600u.getString("extinfo_key_11");
                    String str = (orders2 == null || ((ArrayList) orders2.f209542M).size() <= 0) ? "" : ((Orders.Commodity) ((ArrayList) orders2.f209542M).get(0)).f209606r;
                    int i2 = payInfo.f212600u.getInt("extinfo_key_15", 0);
                    String string2 = payInfo.f212600u.getString("extinfo_key_7");
                    String string3 = payInfo.f212600u.getString("extinfo_key_3");
                    int i3 = payInfo.f212600u.getInt("extinfo_key_12", 0);
                    String string4 = payInfo.f212600u.getString("extinfo_key_13");
                    String string5 = payInfo.f212600u.getString("extinfo_key_14");
                    String string6 = payInfo.f212600u.getString("extinfo_key_16");
                    String str2 = Util.isNullOrNil(string6) ? str : string6;
                    Log.m105925i("MicroMsg.RemittanceResultUI", "fetchF2fData, f2fid: %s, transid: %s, amount: %s, payerDesc: %s, recvDesc: %s, scanScene: %s, paySuccSign: %s, paySuccExtend: %s, channel: %s, payscene: %s", string, str2, Integer.valueOf(i2), string2, string3, Integer.valueOf(i3), string4, string5, Integer.valueOf(payInfo.f212589g), Integer.valueOf(payInfo.f212587e));
                    addSceneEndListener(2773);
                    doSceneProgress(new C70609r(string, str2, i2, string2, string3, payInfo.f212589g, i3, string4, string5, payInfo.f212587e));
                }
            } else {
                mo97513I7(cls);
                finish();
            }
            PayInfo payInfo2 = (PayInfo) getInput().getParcelable("key_pay_info");
            int i4 = payInfo2 != null ? payInfo2.f212587e : 0;
            if (i4 == 33 || i4 == 32 || i4 == 48 || i4 == 31) {
                F2fPayCheckEvent f2fPayCheckEvent = new F2fPayCheckEvent();
                F2fPayCheckEvent.C67693a aVar = f2fPayCheckEvent.f193594d;
                aVar.f193595a = payInfo2.f212592j;
                if (i4 == 31) {
                    aVar.f193596b = 0;
                } else if (i4 == 32 || i4 == 33) {
                    aVar.f193596b = 1;
                }
                Orders orders3 = this.f205195d;
                if (orders3 != null && !((ArrayList) orders3.f209542M).isEmpty()) {
                    f2fPayCheckEvent.f193594d.f193597c = ((Orders.Commodity) ((ArrayList) this.f205195d.f209542M).get(0)).f209606r;
                }
                f2fPayCheckEvent.publish();
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(2773);
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Class<RemittanceResultNewUI> cls = RemittanceResultNewUI.class;
        if (!(yVar instanceof C70609r)) {
            return false;
        }
        Log.m105925i("MicroMsg.RemittanceResultUI", "on f2f succpage scene end, errType: %s, errCode: %s", Integer.valueOf(i), Integer.valueOf(i2));
        C70609r rVar = (C70609r) yVar;
        if (i == 0 && i2 == 0) {
            C50158kp kpVar = rVar.f204281d;
            Log.m105925i("MicroMsg.RemittanceResultUI", "on f2f succpage scene end, retcode: %s, retmsg: %s, exposesureInfo: %s", Integer.valueOf(kpVar.f136921d), kpVar.f136922e, kpVar.f136924g);
            if (kpVar.f136921d == 0) {
                try {
                    getInput().putByteArray("key_succpage_resp", kpVar.toByteArray());
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.RemittanceResultUI", e, "pass succ page resp error: %s", e.getMessage());
                }
                mo97513I7(cls);
            } else {
                C76701a.makeText((Context) this, (CharSequence) kpVar.f136922e, 1).show();
                mo97513I7(cls);
            }
        } else {
            mo97513I7(cls);
        }
        finish();
        return true;
    }
}
