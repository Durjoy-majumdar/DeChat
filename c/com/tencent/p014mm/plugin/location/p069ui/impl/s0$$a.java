package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.s0$$a */
public final /* synthetic */ class s0$$a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C94167s0 f272026d;

    public /* synthetic */ s0$$a(C94167s0 s0Var) {
        this.f272026d = s0Var;
    }

    public final void onClick(View view) {
        C94167s0 s0Var = this.f272026d;
        s0Var.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/location/ui/impl/TrackMapUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", s0Var, array);
        Log.m105918d("MicroMsg.TrackMapUI", "newpoi old go back onclick");
        s0Var.mo129369B();
        C117292a.m165361g(s0Var, "com/tencent/mm/plugin/location/ui/impl/TrackMapUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
