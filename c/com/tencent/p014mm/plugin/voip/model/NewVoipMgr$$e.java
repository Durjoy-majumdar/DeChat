package com.tencent.p014mm.plugin.voip.model;

import com.tencent.p014mm.C0966R;
import nd3.C88930e;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.voip.model.NewVoipMgr$$e */
public final /* synthetic */ class NewVoipMgr$$e implements C88930e {

    /* renamed from: a */
    public final /* synthetic */ NewVoipMgr f317137a;

    public /* synthetic */ NewVoipMgr$$e(NewVoipMgr newVoipMgr) {
        this.f317137a = newVoipMgr;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        NewVoipMgr newVoipMgr = this.f317137a;
        newVoipMgr.getClass();
        if (iArr[0] != 0) {
            C76879j.m92709C(newVoipMgr.f317093h.mo152927i3(), newVoipMgr.f317093h.mo152927i3().getResources().getString(C0966R.string.hhq), newVoipMgr.f317093h.mo152927i3().getResources().getString(C0966R.string.muq), newVoipMgr.f317093h.mo152927i3().getResources().getString(C0966R.string.mzi), newVoipMgr.f317093h.mo152927i3().getResources().getString(C0966R.string.f8028zq), false, new NewVoipMgr$$g(newVoipMgr), new NewVoipMgr$$h(newVoipMgr));
        }
    }
}
