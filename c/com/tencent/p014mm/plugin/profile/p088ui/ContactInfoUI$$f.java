package com.tencent.p014mm.plugin.profile.p088ui;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.profile.ui.ContactInfoUI$$f */
public class ContactInfoUI$$f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ContactInfoUI f202552d;

    public ContactInfoUI$$f(ContactInfoUI contactInfoUI) {
        this.f202552d = contactInfoUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/ContactInfoUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.ContactInfoUI", "onClick: actionBarClick action_bar_root");
        ContactInfoUI contactInfoUI = this.f202552d;
        int i = ContactInfoUI.f202514P;
        contactInfoUI.mo96582L7();
        C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/ContactInfoUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
