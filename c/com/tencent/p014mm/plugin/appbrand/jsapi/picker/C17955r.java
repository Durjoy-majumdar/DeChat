package com.tencent.p014mm.plugin.appbrand.jsapi.picker;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.appbrand.widget.picker.AppBrandOptionsPicker;
import java.util.HashMap;
import java.util.Map;
import vt0.C22778a;
import vt0.C22784g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.picker.r */
public class C17955r implements C22784g.C22787c<String> {

    /* renamed from: a */
    public final /* synthetic */ C22778a f49475a;

    /* renamed from: b */
    public final /* synthetic */ AppBrandOptionsPicker f49476b;

    /* renamed from: c */
    public final /* synthetic */ C17947n f49477c;

    public C17955r(C17947n nVar, C22778a aVar, AppBrandOptionsPicker appBrandOptionsPicker) {
        this.f49477c = nVar;
        this.f49475a = aVar;
        this.f49476b = appBrandOptionsPicker;
    }

    /* renamed from: a */
    public void mo22193a(boolean z, Object obj) {
        String str = (String) obj;
        this.f49475a.mo35924d(true);
        if (!z) {
            this.f49477c.mo22194c("fail cancel", (Map<String, Object>) null);
            return;
        }
        HashMap hashMap = new HashMap(2);
        AppBrandOptionsPicker appBrandOptionsPicker = this.f49476b;
        String[] strArr = appBrandOptionsPicker.f49956d;
        hashMap.put("value", (strArr == null || strArr.length <= 0) ? "" : strArr[appBrandOptionsPicker.getValue()]);
        hashMap.put(FirebaseAnalytics.C113379b.INDEX, Integer.valueOf(this.f49476b.getValue()));
        this.f49477c.mo22194c("ok", hashMap);
    }
}
