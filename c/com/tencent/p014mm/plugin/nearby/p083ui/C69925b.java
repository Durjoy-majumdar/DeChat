package com.tencent.p014mm.plugin.nearby.p083ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import f40.C86709a0;
import uc3.C78146a;

/* renamed from: com.tencent.mm.plugin.nearby.ui.b */
public class C69925b implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C69920a f201735d;

    public C69925b(C69920a aVar) {
        this.f201735d = aVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C86709a0.m107535s().mo121142i().mo119676J(4104, Boolean.FALSE);
        C78146a.m94352a(this.f201735d.f201724e, new Intent());
        ((Activity) this.f201735d.f201724e).finish();
    }
}
