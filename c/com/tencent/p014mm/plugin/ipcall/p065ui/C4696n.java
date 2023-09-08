package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import eb0.C97625j3;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import q12.C12033h;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.n */
public class C4696n implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C4725w f19686d;

    public C4696n(C4725w wVar) {
        this.f19686d = wVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/IPCallAddressController$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C85801v1 u = C97625j3.m125812b().mo105906u();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_IPCALL_ADDRESS_ACCOUNT_SHOW_REDDOT_BOOLEAN;
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) u.mo119685f(aVar, bool)).booleanValue();
        if (booleanValue) {
            C85801v1 u2 = C97625j3.m125812b().mo105906u();
            C72994y1.C72995a aVar2 = C72994y1.C72995a.USERFINO_IPCALL_ADDRESS_ACCOUNT_SHOW_REDDOT_TYPE_INT;
            int intValue = ((Integer) u2.mo119685f(aVar2, -1)).intValue();
            C12033h.m11735a(2, intValue, -1);
            C97625j3.m125812b().mo105906u().mo119677K(aVar2, -1);
            Log.m105925i("MicroMsg.IPCallAddressController", "set red dot type from %d to -1", Integer.valueOf(intValue));
        }
        String str = booleanValue ? "true" : "false";
        C85801v1 u3 = C97625j3.m125812b().mo105906u();
        C72994y1.C72995a aVar3 = C72994y1.C72995a.USERFINO_IPCALL_ADDRESS_ACCOUNT_STRING;
        Log.m105925i("MicroMsg.IPCallAddressController", "set show red dot from %s to false, set account string from %s to null", str, (String) u3.mo119685f(aVar3, ""));
        C97625j3.m125812b().mo105906u().mo119677K(aVar, bool);
        C97625j3.m125812b().mo105906u().mo119677K(aVar3, "");
        if (((Integer) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_IPCALL_ADDRESS_ACCOUNT_ACTIVITY_CLEAR_TYPE_INT, 0)).intValue() != 1) {
            C85801v1 u4 = C97625j3.m125812b().mo105906u();
            C72994y1.C72995a aVar4 = C72994y1.C72995a.USERFINO_IPCALL_ADDRESS_ACCOUNT_ACTIVITY_STRING;
            Log.m105925i("MicroMsg.IPCallAddressController", "set account activity string from %s to null", (String) u4.mo119685f(aVar4, ""));
            C97625j3.m125812b().mo105906u().mo119677K(aVar4, "");
        }
        C115669n.INSTANCE.mo160131h(12061, 0, 0, 1, 0, 0, 0);
        C4725w wVar = this.f19686d;
        wVar.getClass();
        MMHandlerThread.postToMainThread(new C4714s(wVar));
        Intent intent = new Intent();
        intent.setClass(this.f19686d.f19734d, IPCallShareCouponUI.class);
        IPCallAddressUI iPCallAddressUI = this.f19686d.f19734d;
        C9556a aVar5 = new C9556a();
        aVar5.mo10233c(intent);
        IPCallAddressUI iPCallAddressUI2 = iPCallAddressUI;
        C117292a.m165358d(iPCallAddressUI2, aVar5.mo10232b(), "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        iPCallAddressUI.startActivity((Intent) aVar5.mo10231a(0));
        C117292a.m165359e(iPCallAddressUI2, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
