package com.tencent.p014mm.plugin.appbrand.p026ui.autofill;

import com.tencent.p014mm.plugin.appbrand.p026ui.autofill.AppBrandIDCardUI;
import com.tencent.p014mm.plugin.appbrand.phonenumber.PhoneItem;
import fy3.C32224a;
import gt0.C87362k;
import hk0.C76200a;
import java.util.Iterator;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.autofill.q */
public class C115289q implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ AppBrandIDCardUI f345498d;

    public C115289q(AppBrandIDCardUI appBrandIDCardUI) {
        this.f345498d = appBrandIDCardUI;
    }

    public Object invoke() {
        PhoneItem phoneItem;
        C76200a aVar;
        AppBrandIDCardUI appBrandIDCardUI = this.f345498d;
        Iterator<PhoneItem> it = appBrandIDCardUI.f345459y.f223234A.iterator();
        while (true) {
            if (!it.hasNext()) {
                phoneItem = null;
                break;
            }
            phoneItem = it.next();
            if (phoneItem.f245279o) {
                break;
            }
        }
        appBrandIDCardUI.f345439A = phoneItem;
        AppBrandIDCardUI appBrandIDCardUI2 = this.f345498d;
        C87362k kVar = appBrandIDCardUI2.f345458x;
        if (!(kVar == null || (aVar = appBrandIDCardUI2.f345459y) == null)) {
            kVar.mo121777a(aVar);
        }
        ((AppBrandIDCardUI.C115267a) this.f345498d.f345440B).mo175055b();
        return null;
    }
}
