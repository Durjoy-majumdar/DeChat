package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.t0 */
public class C94173t0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C94167s0 f272047d;

    public C94173t0(C94167s0 s0Var) {
        this.f272047d = s0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/location/ui/impl/TrackMapUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f272047d.mo129357j();
        this.f272047d.mo129363p();
        this.f272047d.f271948d.finish();
        C117292a.m165361g(this, "com/tencent/mm/plugin/location/ui/impl/TrackMapUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
