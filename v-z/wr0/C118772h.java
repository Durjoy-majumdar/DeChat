package wr0;

import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.p026ui.autofill.AppBrandIDCardUI;
import com.tencent.p014mm.plugin.appbrand.phonenumber.PhoneNumberManagerUI;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import rx3.C13598b0;

/* renamed from: wr0.h */
public class C118772h implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ AppBrandIDCardUI f355358d;

    public C118772h(AppBrandIDCardUI appBrandIDCardUI) {
        this.f355358d = appBrandIDCardUI;
    }

    public Object invoke() {
        Intent intent = new Intent(this.f355358d.getContext(), PhoneNumberManagerUI.class);
        intent.putExtra("APPID", this.f355358d.f345442e);
        this.f355358d.getClass();
        intent.putExtra("PAGEPATH", Util.nullAsNil((String) null));
        this.f355358d.startActivityForResult(intent, 10001);
        return null;
    }
}
