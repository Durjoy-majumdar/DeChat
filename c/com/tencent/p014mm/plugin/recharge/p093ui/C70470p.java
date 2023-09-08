package com.tencent.p014mm.plugin.recharge.p093ui;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import qe3.C77329i;
import y43.C79036x;

/* renamed from: com.tencent.mm.plugin.recharge.ui.p */
public class C70470p implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ PhoneRechargeUI f203663d;

    public C70470p(PhoneRechargeUI phoneRechargeUI) {
        this.f203663d = phoneRechargeUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/recharge/ui/PhoneRechargeUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f203663d.f203528K != null) {
            C77329i.m93195a(6, 1);
            PhoneRechargeUI phoneRechargeUI = this.f203663d;
            C79036x xVar = phoneRechargeUI.f203528K;
            if (!PhoneRechargeUI.m82986J7(phoneRechargeUI, xVar.f232099g, xVar.f232100h, xVar.f232097e, "") && !Util.isNullOrNil(this.f203663d.f203528K.f232098f)) {
                try {
                    String decode = URLDecoder.decode(this.f203663d.f203528K.f232098f, "utf-8");
                    PhoneRechargeUI phoneRechargeUI2 = this.f203663d;
                    PhoneRechargeUI.m82988L7(phoneRechargeUI2, decode, phoneRechargeUI2.f203528K.f232097e, "");
                } catch (UnsupportedEncodingException e) {
                    Log.printErrStackTrace("MicroMsg.PhoneRechargeUI", e, "", new Object[0]);
                }
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/recharge/ui/PhoneRechargeUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
