package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.z */
public class C42505z implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C115538c0 f115046d;

    public C42505z(C115538c0 c0Var) {
        this.f115046d = c0Var;
    }

    public void run() {
        Log.m105919d("MicroMsg.MMPoiMapUI", "pennqin, collapseBtnLayoutHeight: %d.", Integer.valueOf(this.f115046d.f346517T0));
        C115538c0 c0Var = this.f115046d;
        c0Var.f346517T0 = c0Var.f346515S0.getHeight();
        View view = this.f115046d.f346515S0;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$13", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$13", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
