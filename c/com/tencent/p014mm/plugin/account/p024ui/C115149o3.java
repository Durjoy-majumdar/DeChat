package com.tencent.p014mm.plugin.account.p024ui;

import android.view.View;
import com.tencent.p014mm.autogen.mmdata.rpt.ThirdAppRegisterStruct;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import nj3.C76875f0;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.account.ui.o3 */
public class C115149o3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C77407n f345186d;

    /* renamed from: e */
    public final /* synthetic */ List f345187e;

    /* renamed from: f */
    public final /* synthetic */ C76875f0 f345188f;

    /* renamed from: g */
    public final /* synthetic */ WelcomeActivity f345189g;

    public C115149o3(WelcomeActivity welcomeActivity, C77407n nVar, List list, C76875f0 f0Var) {
        this.f345189g = welcomeActivity;
        this.f345186d = nVar;
        this.f345187e = list;
        this.f345188f = f0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/account/ui/WelcomeActivity$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f345186d.mo107573q();
        if (this.f345187e.contains(this.f345188f)) {
            ThirdAppRegisterStruct thirdAppRegisterStruct = this.f345189g.f345075f;
            thirdAppRegisterStruct.f343856d = 1;
            thirdAppRegisterStruct.f343857e = 1;
            thirdAppRegisterStruct.mo86054n();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/WelcomeActivity$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
