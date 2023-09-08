package com.tencent.p014mm.plugin.profile.p088ui;

import android.app.Activity;
import android.content.DialogInterface;
import di3.C86312j;
import p248ug.C37468y;
import p248ug.C52557b0;
import p248ug.C52558c;

/* renamed from: com.tencent.mm.plugin.profile.ui.l1 */
public class C42641l1 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C42643m1 f115420d;

    public C42641l1(C42643m1 m1Var) {
        this.f115420d = m1Var;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C52558c v = ((C52557b0) C86312j.m106911c(C52557b0.class)).mo71152v(this.f115420d.f115423e.getUsername());
        C42643m1 m1Var = this.f115420d;
        ((C37468y) C86312j.m106911c(C37468y.class)).mo61116ee(v, (Activity) m1Var.f115422d, m1Var.f115423e, false);
        this.f115420d.mo66773b();
    }
}
