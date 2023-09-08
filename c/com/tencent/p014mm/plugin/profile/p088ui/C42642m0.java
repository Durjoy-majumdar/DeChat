package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.Intent;
import android.os.Bundle;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.profile.ui.m0 */
public class C42642m0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C42660o0 f115421d;

    public C42642m0(C42660o0 o0Var) {
        this.f115421d = o0Var;
    }

    public void run() {
        this.f115421d.mo66804m(4, (String) null);
        if (this.f115421d.f115487d.getIntent().getIntExtra("Kdel_from", -1) == 1) {
            Intent intent = new Intent();
            intent.addFlags(67108864);
            C88144b.m109791i(this.f115421d.f115487d, "shake", ".ui.ShakeReportUI", intent, (Bundle) null);
        }
    }
}
