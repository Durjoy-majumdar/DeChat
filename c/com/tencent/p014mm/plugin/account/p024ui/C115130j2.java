package com.tencent.p014mm.plugin.account.p024ui;

import android.content.Intent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.account.ui.j2 */
public class C115130j2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ RegAffiliateAccountUI f345155d;

    public C115130j2(RegAffiliateAccountUI regAffiliateAccountUI) {
        this.f345155d = regAffiliateAccountUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/account/ui/RegAffiliateAccountUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f345155d.hideVKB();
        Intent intent = new Intent(this.f345155d, RegAffiliateAccountUI.class);
        intent.putExtra("RegScene", this.f345155d.f344797o);
        intent.putExtra("RegTicket", this.f345155d.f344798p);
        intent.putExtra("sessionID", this.f345155d.f344799q);
        intent.putExtra("NickName", this.f345155d.f344800r);
        intent.putExtra("AvatarFileID", this.f345155d.f344801s);
        intent.putExtra("AvatarAESKey", this.f345155d.f344802t);
        intent.putExtra("STEP_ONE", false);
        this.f345155d.startActivityForResult(intent, 702);
        C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/RegAffiliateAccountUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
