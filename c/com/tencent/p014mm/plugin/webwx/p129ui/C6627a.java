package com.tencent.p014mm.plugin.webwx.p129ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import eb0.C97625j3;
import fa3.C8004f;

/* renamed from: com.tencent.mm.plugin.webwx.ui.a */
public class C6627a implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C8004f f23908d;

    /* renamed from: e */
    public final /* synthetic */ ExtDeviceWXLoginUI f23909e;

    public C6627a(ExtDeviceWXLoginUI extDeviceWXLoginUI, C8004f fVar) {
        this.f23909e = extDeviceWXLoginUI;
        this.f23908d = fVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C97625j3.m125815e().mo123458d(this.f23908d);
        ProgressDialog progressDialog = this.f23909e.f23879j;
        if (progressDialog != null) {
            progressDialog.cancel();
        }
    }
}
