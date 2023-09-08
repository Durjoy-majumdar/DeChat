package wr0;

import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.p026ui.autofill.AppBrandIDCardUI;
import com.tencent.p014mm.plugin.appbrand.phonenumber.PhoneNumberAddUI;
import fy3.C32224a;
import rx3.C13598b0;

/* renamed from: wr0.m */
public class C118777m implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ AppBrandIDCardUI f355363d;

    public C118777m(AppBrandIDCardUI appBrandIDCardUI) {
        this.f355363d = appBrandIDCardUI;
    }

    public Object invoke() {
        Intent intent = new Intent(this.f355363d.getContext(), PhoneNumberAddUI.class);
        intent.putExtra("APPID", this.f355363d.f345442e);
        this.f355363d.startActivityForResult(intent, 10000);
        return null;
    }
}
