package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.view.View;
import bh3.C113177k;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.v0 */
public class C115579v0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C94167s0 f346637d;

    /* renamed from: com.tencent.mm.plugin.location.ui.impl.v0$a */
    public class C115580a implements C113177k.C113181e {
        public C115580a() {
        }

        public void onOp(Boolean bool) {
            if (bool.booleanValue()) {
                C94167s0 s0Var = C115579v0.this.f346637d;
                s0Var.f272012R.mo183518a(s0Var.f271953i.f271972f);
                C115579v0.this.f346637d.f272014S.setSelected(true);
            }
        }
    }

    public C115579v0(C94167s0 s0Var) {
        this.f346637d = s0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/location/ui/impl/TrackMapUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!((C113177k) C86312j.m106911c(C113177k.class)).mo165704UG(C113177k.C113179b.LOCAION, new C115580a())) {
            C94167s0 s0Var = this.f346637d;
            s0Var.f272012R.mo183518a(s0Var.f271953i.f271972f);
            this.f346637d.f272014S.setSelected(true);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/location/ui/impl/TrackMapUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
