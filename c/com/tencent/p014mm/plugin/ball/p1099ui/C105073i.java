package com.tencent.p014mm.plugin.ball.p1099ui;

import com.tencent.p014mm.C0966R;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.ball.ui.i */
public class C105073i implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ FloatBallProxyUI f311853d;

    public C105073i(FloatBallProxyUI floatBallProxyUI) {
        this.f311853d = floatBallProxyUI;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.clear();
        e0Var.mo107140d(0, -65536, this.f311853d.getString(C0966R.string.evh));
        e0Var.mo107140d(1, -16777216, this.f311853d.getString(C0966R.string.evf));
    }
}
