package com.tencent.p014mm.plugin.finder.service;

import android.app.Activity;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import gy3.C87412m;
import ht1.C60204t3;
import ht1.C98519c2;

@C86522b
/* renamed from: com.tencent.mm.plugin.finder.service.e0 */
public final class C29983e0 extends C86301e implements C98519c2 {
    /* renamed from: H5 */
    public void mo57045H5() {
        C60204t3 t3Var = (C60204t3) C86312j.m106911c(C60204t3.class);
        if (t3Var != null) {
            t3Var.mo78744H5();
        }
    }

    /* renamed from: b2 */
    public boolean mo57046b2(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C60204t3 t3Var = (C60204t3) C86312j.m106911c(C60204t3.class);
        if (t3Var != null) {
            return t3Var.mo78749b2(activity);
        }
        return false;
    }

    /* renamed from: w2 */
    public void mo57047w2() {
        C60204t3 t3Var = (C60204t3) C86312j.m106911c(C60204t3.class);
        if (t3Var != null) {
            t3Var.mo78759w2();
        }
    }
}
