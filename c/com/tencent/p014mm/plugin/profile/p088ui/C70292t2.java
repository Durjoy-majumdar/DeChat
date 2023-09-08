package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.profile.ui.t2 */
public class C70292t2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SayHiWithSnsPermissionUI2 f203060d;

    public C70292t2(SayHiWithSnsPermissionUI2 sayHiWithSnsPermissionUI2) {
        this.f203060d = sayHiWithSnsPermissionUI2;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI2$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SayHiWithSnsPermissionUI2 sayHiWithSnsPermissionUI2 = this.f203060d;
        int i = SayHiWithSnsPermissionUI2.f202806c1;
        sayHiWithSnsPermissionUI2.getClass();
        Log.m105924i("MicroMsg.SayHiWithSnsPermissionUI2", "cpan[All startContactLabelUI].");
        Intent intent = new Intent();
        ArrayList<String> arrayList2 = sayHiWithSnsPermissionUI2.f202814H;
        if (arrayList2 != null) {
            intent.putStringArrayListExtra("label_str_list", arrayList2);
        }
        sayHiWithSnsPermissionUI2.f202830U = true;
        intent.putExtra("save_label_to_contact_on_prepage", false);
        intent.putExtra("label_username", sayHiWithSnsPermissionUI2.f202858t);
        intent.putExtra("is_stranger", true);
        C88144b.m109795m(sayHiWithSnsPermissionUI2, "label", ".ui.ContactLabelUI", intent, 600);
        C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI2$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
