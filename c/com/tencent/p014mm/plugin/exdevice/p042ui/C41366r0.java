package com.tencent.p014mm.plugin.exdevice.p042ui;

import com.tencent.p014mm.C0966R;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.r0 */
public class C41366r0 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ ExdeviceProfileUI f111362d;

    public C41366r0(ExdeviceProfileUI exdeviceProfileUI) {
        this.f111362d = exdeviceProfileUI;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        ExdeviceProfileUI exdeviceProfileUI = this.f111362d;
        if (exdeviceProfileUI.f111161A) {
            e0Var.mo107142f(6, exdeviceProfileUI.getString(C0966R.string.cet));
        } else {
            e0Var.mo107142f(4, exdeviceProfileUI.getString(C0966R.string.cez));
        }
    }
}
