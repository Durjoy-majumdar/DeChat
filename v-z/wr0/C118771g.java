package wr0;

import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.p026ui.autofill.AppBrandIDCardUI;
import com.tencent.p014mm.plugin.appbrand.phonenumber.PhoneNumberAddUI;
import fy3.C32224a;
import rx3.C13598b0;

/* renamed from: wr0.g */
public class C118771g implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ AppBrandIDCardUI f355357d;

    public C118771g(AppBrandIDCardUI appBrandIDCardUI) {
        this.f355357d = appBrandIDCardUI;
    }

    public Object invoke() {
        Intent intent = new Intent(this.f355357d.getContext(), PhoneNumberAddUI.class);
        intent.putExtra("APPID", this.f355357d.f345442e);
        this.f355357d.startActivityForResult(intent, 10000);
        return null;
    }
}
