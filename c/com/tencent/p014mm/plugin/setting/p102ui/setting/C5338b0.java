package com.tencent.p014mm.plugin.setting.p102ui.setting;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import nj3.C11182m0;
import nj3.C76874e0;
import p227rn.C48053v;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.b0 */
public class C5338b0 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ SelfQRCodeUI f20971d;

    public C5338b0(SelfQRCodeUI selfQRCodeUI) {
        this.f20971d = selfQRCodeUI;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        boolean U5 = C72996z1.m85820U5(this.f20971d.f20761i);
        boolean gl = ((C48053v) C86312j.m106911c(C48053v.class)).mo72617gl(this.f20971d.f20761i);
        if (!gl && !U5) {
            e0Var.mo107125a(2, C0966R.string.ikc);
        }
        e0Var.mo107125a(1, C0966R.string.ikg);
        if (!gl) {
            e0Var.mo107125a(3, C0966R.string.ikw);
        }
        if (this.f20971d.f20762j) {
            e0Var.mo107125a(4, C0966R.string.ikv);
        }
    }
}
