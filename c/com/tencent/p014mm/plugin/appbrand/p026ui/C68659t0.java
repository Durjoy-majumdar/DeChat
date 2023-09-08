package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.DialogInterface;
import qo3.C77390c0;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.t0 */
public class C68659t0 implements DialogInterface.OnShowListener {

    /* renamed from: d */
    public final /* synthetic */ C77390c0 f197213d;

    public C68659t0(C77390c0 c0Var) {
        this.f197213d = c0Var;
    }

    public void onShow(DialogInterface dialogInterface) {
        if (this.f197213d.getWindow() != null) {
            this.f197213d.getWindow().setDimAmount(0.0f);
        }
    }
}
