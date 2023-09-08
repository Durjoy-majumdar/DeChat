package com.tencent.p014mm.plugin.recharge.p093ui;

import android.content.Intent;
import android.provider.ContactsContract;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import p447aw.C103918d;

/* renamed from: com.tencent.mm.plugin.recharge.ui.l */
public class C5038l implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ PhoneRechargeUI f20370d;

    public C5038l(PhoneRechargeUI phoneRechargeUI) {
        this.f20370d = phoneRechargeUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/recharge/ui/PhoneRechargeUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(this.f20370d.getContext(), "android.permission.READ_CONTACTS", 48, (String) null, (String) null)) {
            Intent intent = new Intent("android.intent.action.PICK", ContactsContract.Contacts.CONTENT_URI);
            if (Util.isIntentAvailable(this.f20370d, intent, true)) {
                try {
                    this.f20370d.startActivityForResult(intent, 1);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.PhoneRechargeUI", e, "", new Object[0]);
                }
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/recharge/ui/PhoneRechargeUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
