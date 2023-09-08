package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.profile.ui.x2 */
public class C70303x2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SayHiWithSnsPermissionUI3 f203081d;

    public C70303x2(SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3) {
        this.f203081d = sayHiWithSnsPermissionUI3;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3 = this.f203081d;
        int i = SayHiWithSnsPermissionUI3.f202888l1;
        sayHiWithSnsPermissionUI3.getClass();
        Log.m105924i("MicroMsg.SayHiWithSnsPermissionUI3", "cpan[All startContactLabelUI].");
        Intent intent = new Intent();
        ArrayList<String> arrayList2 = sayHiWithSnsPermissionUI3.f202904Q;
        if (arrayList2 != null) {
            intent.putStringArrayListExtra("label_str_list", arrayList2);
        }
        sayHiWithSnsPermissionUI3.f202905Q0 = true;
        intent.putExtra("save_label_to_contact_on_prepage", false);
        intent.putExtra("label_username", sayHiWithSnsPermissionUI3.f202950u);
        intent.putExtra("is_stranger", true);
        C88144b.m109795m(sayHiWithSnsPermissionUI3, "label", ".ui.ContactLabelUI", intent, 600);
        C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
