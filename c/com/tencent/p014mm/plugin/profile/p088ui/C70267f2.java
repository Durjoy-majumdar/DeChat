package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.plugin.profile.p088ui.NormalUserFooterPreference;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.profile.ui.f2 */
public class C70267f2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ NormalUserFooterPreference.C70154c f203022d;

    public C70267f2(NormalUserFooterPreference.C70154c cVar) {
        this.f203022d = cVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$BaseHandler$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        intent.putExtra("sns_permission_userName", NormalUserFooterPreference.this.f202624J.getUsername());
        intent.putExtra("sns_permission_anim", true);
        intent.putExtra("sns_permission_block_scene", 4);
        C88144b.m109791i(NormalUserFooterPreference.this.f202653d1, "sns", ".ui.SnsPermissionUI", intent, (Bundle) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$BaseHandler$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
