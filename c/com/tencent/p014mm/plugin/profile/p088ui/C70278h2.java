package com.tencent.p014mm.plugin.profile.p088ui;

import android.view.View;
import com.tencent.p014mm.plugin.profile.p088ui.NormalUserFooterPreference;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.profile.ui.h2 */
public class C70278h2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ NormalUserFooterPreference.C70154c f203038d;

    public C70278h2(NormalUserFooterPreference.C70154c cVar) {
        this.f203038d = cVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$BaseHandler$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        NormalUserFooterPreference.C70154c.m82712d(this.f203038d);
        C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$BaseHandler$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
