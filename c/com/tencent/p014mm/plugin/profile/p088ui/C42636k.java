package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.Context;
import android.view.View;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import kr0.C76633z0;
import p248ug.C52558c;

/* renamed from: com.tencent.mm.plugin.profile.ui.k */
public class C42636k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BizBindWxaInfoPreference f115414d;

    public C42636k(BizBindWxaInfoPreference bizBindWxaInfoPreference) {
        this.f115414d = bizBindWxaInfoPreference;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/BizBindWxaInfoPreference$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        BizBindWxaInfoPreference bizBindWxaInfoPreference = this.f115414d;
        Context context = bizBindWxaInfoPreference.f121274d;
        C52558c cVar = bizBindWxaInfoPreference.f115293M;
        ((C76633z0) C86312j.m106911c(C76633z0.class)).mo94226Ay(context, cVar.field_username, cVar.field_appId, bizBindWxaInfoPreference.f115292L);
        C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/BizBindWxaInfoPreference$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
