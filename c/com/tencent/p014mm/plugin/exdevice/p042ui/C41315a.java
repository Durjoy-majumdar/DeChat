package com.tencent.p014mm.plugin.exdevice.p042ui;

import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.a */
public class C41315a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ExdeviceAddDataSourceUI f111288d;

    public C41315a(ExdeviceAddDataSourceUI exdeviceAddDataSourceUI) {
        this.f111288d = exdeviceAddDataSourceUI;
    }

    public void run() {
        C89779i0 i0Var = this.f111288d.f110989p;
        if (i0Var != null && i0Var.isShowing()) {
            this.f111288d.f110989p.dismiss();
        }
    }
}
