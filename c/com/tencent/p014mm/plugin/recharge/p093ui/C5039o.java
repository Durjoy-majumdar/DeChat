package com.tencent.p014mm.plugin.recharge.p093ui;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import y43.C79036x;

/* renamed from: com.tencent.mm.plugin.recharge.ui.o */
public class C5039o implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ PhoneRechargeUI f20371d;

    public C5039o(PhoneRechargeUI phoneRechargeUI) {
        this.f20371d = phoneRechargeUI;
    }

    public void onClick(View view) {
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/recharge/ui/PhoneRechargeUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        PhoneRechargeUI phoneRechargeUI = this.f20371d;
        C79036x xVar = phoneRechargeUI.f203528K;
        if (xVar == null) {
            Log.m105920e("MicroMsg.PhoneRechargeUI", "hy: no banner but show ad. should not happen");
        } else if (xVar != null) {
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_PHONE_RECHARGE_CLOSED_BANNER_STRING;
            String str2 = (String) i.mo119685f(aVar, "");
            if (Util.isNullOrNil(str2)) {
                str = String.valueOf(phoneRechargeUI.f203528K.f232096d);
            } else {
                str = str2 + ";" + phoneRechargeUI.f203528K.f232096d;
            }
            C86709a0.m107535s().mo121142i().mo119677K(aVar, str);
            C86709a0.m107535s().mo121142i().mo119681a(true);
        }
        View view2 = this.f20371d.f203533d;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar2.mo10233c(8);
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/recharge/ui/PhoneRechargeUI$6", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/recharge/ui/PhoneRechargeUI$6", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C117292a.m165361g(this, "com/tencent/mm/plugin/recharge/ui/PhoneRechargeUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
