package com.tencent.p014mm.plugin.appbrand.p026ui.autofill;

import com.tencent.p014mm.plugin.appbrand.p026ui.autofill.AppBrandIDCardUI;
import com.tencent.p014mm.plugin.appbrand.phonenumber.PhoneItem;
import fy3.C32224a;
import gt0.C87362k;
import hk0.C76200a;
import java.util.Iterator;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.autofill.n */
public class C115286n implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ AppBrandIDCardUI f345495d;

    public C115286n(AppBrandIDCardUI appBrandIDCardUI) {
        this.f345495d = appBrandIDCardUI;
    }

    public Object invoke() {
        PhoneItem phoneItem;
        C76200a aVar;
        AppBrandIDCardUI appBrandIDCardUI = this.f345495d;
        int i = AppBrandIDCardUI.f345438C;
        appBrandIDCardUI.mo175054J7(17);
        AppBrandIDCardUI appBrandIDCardUI2 = this.f345495d;
        Iterator<PhoneItem> it = appBrandIDCardUI2.f345459y.f223234A.iterator();
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
        appBrandIDCardUI2.f345439A = phoneItem;
        AppBrandIDCardUI appBrandIDCardUI3 = this.f345495d;
        C87362k kVar = appBrandIDCardUI3.f345458x;
        if (!(kVar == null || (aVar = appBrandIDCardUI3.f345459y) == null)) {
            kVar.mo121777a(aVar);
        }
        ((AppBrandIDCardUI.C115267a) this.f345495d.f345440B).mo175055b();
        return null;
    }
}
