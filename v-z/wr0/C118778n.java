package wr0;

import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.p026ui.autofill.AppBrandIDCardUI;
import com.tencent.p014mm.plugin.appbrand.phonenumber.PhoneNumberManagerUI;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import rx3.C13598b0;

/* renamed from: wr0.n */
public class C118778n implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ AppBrandIDCardUI f355364d;

    public C118778n(AppBrandIDCardUI appBrandIDCardUI) {
        this.f355364d = appBrandIDCardUI;
    }

    public Object invoke() {
        Intent intent = new Intent(this.f355364d.getContext(), PhoneNumberManagerUI.class);
        intent.putExtra("APPID", this.f355364d.f345442e);
        this.f355364d.getClass();
        intent.putExtra("PAGEPATH", Util.nullAsNil((String) null));
        this.f355364d.startActivityForResult(intent, 10001);
        return null;
    }
}
