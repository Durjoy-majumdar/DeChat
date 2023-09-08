package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.DialogInterface;
import android.view.View;
import di3.C86312j;
import kb0.C76529i;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.c1 */
public class C68646c1 implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ String f197195d;

    /* renamed from: e */
    public final /* synthetic */ View f197196e;

    /* renamed from: f */
    public final /* synthetic */ AppBrandProcessShareMessageProxyUI f197197f;

    public C68646c1(AppBrandProcessShareMessageProxyUI appBrandProcessShareMessageProxyUI, String str, View view) {
        this.f197197f = appBrandProcessShareMessageProxyUI;
        this.f197195d = str;
        this.f197196e = view;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        ((C76529i) C86312j.m106911c(C76529i.class)).ks0(this.f197195d, this.f197196e);
        this.f197197f.finish();
    }
}
