package com.tencent.p014mm.plugin.profile.p088ui;

import android.text.TextUtils;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import p773yy.C79168k;
import su0.C13781a;

/* renamed from: com.tencent.mm.plugin.profile.ui.ContactInfoUI$$g */
public class ContactInfoUI$$g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ContactInfoUI f115326d;

    public ContactInfoUI$$g(ContactInfoUI contactInfoUI) {
        this.f115326d = contactInfoUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/ContactInfoUI$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.ContactInfoUI", "onClick: actionBarClick action_bar_root2");
        if (TextUtils.equals(this.f115326d.getIntent().getStringExtra("Contact_User"), C13781a.m13082a())) {
            ((C79168k) C86312j.m106911c(C79168k.class)).mo74129nj(this.f115326d);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/ContactInfoUI$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
