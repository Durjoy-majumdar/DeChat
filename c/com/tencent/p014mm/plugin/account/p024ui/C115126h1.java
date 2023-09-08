package com.tencent.p014mm.plugin.account.p024ui;

import android.view.View;
import com.tencent.p014mm.autogen.mmdata.rpt.ThirdAppRegisterStruct;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import nj3.C76875f0;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.account.ui.h1 */
public class C115126h1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C77407n f345151d;

    /* renamed from: e */
    public final /* synthetic */ List f345152e;

    /* renamed from: f */
    public final /* synthetic */ C76875f0 f345153f;

    /* renamed from: g */
    public final /* synthetic */ C115132k1 f345154g;

    public C115126h1(C115132k1 k1Var, C77407n nVar, List list, C76875f0 f0Var) {
        this.f345154g = k1Var;
        this.f345151d = nVar;
        this.f345152e = list;
        this.f345153f = f0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/account/ui/MobileInputLoginLogic$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f345154g.f345157d.hideVKB();
        this.f345151d.mo107573q();
        if (this.f345152e.contains(this.f345153f)) {
            ThirdAppRegisterStruct thirdAppRegisterStruct = this.f345154g.f345158e;
            thirdAppRegisterStruct.f343856d = 1;
            thirdAppRegisterStruct.f343857e = 9;
            thirdAppRegisterStruct.mo86054n();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/MobileInputLoginLogic$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
