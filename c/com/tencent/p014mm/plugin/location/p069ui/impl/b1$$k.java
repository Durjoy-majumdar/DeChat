package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.app.ProgressDialog;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.b1$$k */
public class b1$$k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C94163b1 f272006d;

    public b1$$k(C94163b1 b1Var) {
        this.f272006d = b1Var;
    }

    public void run() {
        C94163b1 b1Var = this.f272006d;
        if (b1Var.f271987J) {
            ProgressDialog progressDialog = b1Var.f271988K;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            this.f272006d.mo129375H();
        }
        this.f272006d.f271987J = false;
    }
}
