package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.profile.ui.n2 */
public class C70287n2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SayHiWithSnsPermissionUI f203054d;

    public C70287n2(SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI) {
        this.f203054d = sayHiWithSnsPermissionUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI = this.f203054d;
        int i = SayHiWithSnsPermissionUI.f202707r1;
        sayHiWithSnsPermissionUI.getClass();
        Log.m105924i("MicroMsg.SayHiWithSnsPermissionUI", "cpan[All startContactLabelUI].");
        Intent intent = new Intent();
        ArrayList<String> arrayList2 = sayHiWithSnsPermissionUI.f202737X;
        if (arrayList2 != null) {
            intent.putStringArrayListExtra("label_str_list", arrayList2);
        }
        sayHiWithSnsPermissionUI.f202732U0 = true;
        intent.putExtra("save_label_to_contact_on_prepage", false);
        intent.putExtra("label_username", sayHiWithSnsPermissionUI.f202778x);
        intent.putExtra("is_stranger", true);
        C88144b.m109795m(sayHiWithSnsPermissionUI, "label", ".ui.ContactLabelUI", intent, 600);
        C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
