package com.tencent.p014mm.plugin.profile.p088ui.tab;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.p136ui.vas.VASActivity;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.profile.ui.tab.k */
public class C42720k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ContactWidgetTabBizHeaderController f115688d;

    public C42720k(ContactWidgetTabBizHeaderController contactWidgetTabBizHeaderController) {
        this.f115688d = contactWidgetTabBizHeaderController;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderController$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ContactWidgetTabBizHeaderController contactWidgetTabBizHeaderController = this.f115688d;
        contactWidgetTabBizHeaderController.getClass();
        Intent intent = new Intent(contactWidgetTabBizHeaderController.f115556g.getIntent());
        intent.removeExtra(VASActivity.KEY_IS_FRAGMENT_MODE);
        intent.removeExtra(VASActivity.KEY_LAUNCH_MODE);
        intent.removeExtra(VASActivity.KEY_CLS);
        intent.removeExtra(VASActivity.KEY_DISABLE_COMMON_AREA_CONTROL);
        intent.putExtra("Contact_Scene", 232);
        C88144b.m109791i(contactWidgetTabBizHeaderController.f115556g, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderController$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
