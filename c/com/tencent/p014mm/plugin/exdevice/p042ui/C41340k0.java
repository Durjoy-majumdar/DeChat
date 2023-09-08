package com.tencent.p014mm.plugin.exdevice.p042ui;

import com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceProfileUI;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.k0 */
public class C41340k0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ExdeviceProfileUI.C41280e f111315d;

    public C41340k0(ExdeviceProfileUI.C41280e eVar) {
        this.f111315d = eVar;
    }

    public void run() {
        C89779i0 i0Var = ExdeviceProfileUI.this.f111192z;
        if (i0Var != null) {
            i0Var.dismiss();
        }
    }
}
