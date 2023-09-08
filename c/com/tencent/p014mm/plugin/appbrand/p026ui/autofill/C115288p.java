package com.tencent.p014mm.plugin.appbrand.p026ui.autofill;

import androidx.fragment.app.C112919c0;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.autofill.p */
public class C115288p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandIDCardUI f345497d;

    public C115288p(AppBrandIDCardUI appBrandIDCardUI) {
        this.f345497d = appBrandIDCardUI;
    }

    public void run() {
        this.f345497d.f345441d = new AppBrandIDCardVerifyPwdFrag();
        AppBrandIDCardUI appBrandIDCardUI = this.f345497d;
        ((AppBrandIDCardVerifyPwdFrag) appBrandIDCardUI.f345441d).f345467d = appBrandIDCardUI.f345440B;
        C112919c0 beginTransaction = appBrandIDCardUI.getSupportFragmentManager().beginTransaction();
        int i = AppBrandIDCardUI.f345438C;
        beginTransaction.mo165200l(C0966R.C0970id.f5910s2, this.f345497d.f345441d);
        beginTransaction.mo165163e();
    }
}
