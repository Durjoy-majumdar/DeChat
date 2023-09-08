package wr0;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.p026ui.autofill.AppBrandIDCardUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import rx3.C13598b0;

/* renamed from: wr0.i */
public class C118773i implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ AppBrandIDCardUI f355359d;

    public C118773i(AppBrandIDCardUI appBrandIDCardUI) {
        this.f355359d = appBrandIDCardUI;
    }

    public Object invoke() {
        AppBrandIDCardUI appBrandIDCardUI = this.f355359d;
        int i = AppBrandIDCardUI.f345438C;
        appBrandIDCardUI.mo175054J7(16);
        if (TextUtils.isEmpty(this.f355359d.f345443f)) {
            Log.m105920e("MicroMsg.AppBrandIDCardUI", "wecoin protocol url is null");
            return null;
        }
        AppBrandIDCardUI appBrandIDCardUI2 = this.f355359d;
        AppBrandIDCardUI.m162021H7(appBrandIDCardUI2, appBrandIDCardUI2.f345443f);
        return null;
    }
}
