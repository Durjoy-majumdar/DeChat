package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.DialogInterface;
import eb0.C97625j3;
import ef2.C45653c;

/* renamed from: com.tencent.mm.plugin.profile.ui.u0 */
public class C42778u0 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C45653c f115823d;

    /* renamed from: e */
    public final /* synthetic */ C42660o0 f115824e;

    public C42778u0(C42660o0 o0Var, C45653c cVar) {
        this.f115824e = o0Var;
        this.f115823d = cVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C97625j3.m125815e().mo123458d(this.f115823d);
        C97625j3.m125815e().mo123470p(1363, this.f115824e);
    }
}
