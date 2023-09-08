package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.content.DialogInterface;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.c0 */
public class C41322c0 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ ExdeviceProfileUI f111297d;

    public C41322c0(ExdeviceProfileUI exdeviceProfileUI) {
        this.f111297d = exdeviceProfileUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C89779i0 i0Var = this.f111297d.f111192z;
        if (i0Var != null) {
            i0Var.dismiss();
            this.f111297d.f111192z = null;
        }
        this.f111297d.finish();
    }
}
