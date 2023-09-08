package com.tencent.p014mm.plugin.appbrand.p026ui.autofill;

import androidx.fragment.app.C112919c0;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.autofill.o */
public class C115287o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandIDCardUI f345496d;

    public C115287o(AppBrandIDCardUI appBrandIDCardUI) {
        this.f345496d = appBrandIDCardUI;
    }

    public void run() {
        this.f345496d.f345441d = new AppBrandIDCardShowFrag();
        AppBrandIDCardUI appBrandIDCardUI = this.f345496d;
        ((AppBrandIDCardShowFrag) appBrandIDCardUI.f345441d).f345423d = appBrandIDCardUI.f345440B;
        C112919c0 beginTransaction = appBrandIDCardUI.getSupportFragmentManager().beginTransaction();
        int i = AppBrandIDCardUI.f345438C;
        beginTransaction.mo165200l(C0966R.C0970id.f5910s2, this.f345496d.f345441d);
        beginTransaction.mo165163e();
    }
}
