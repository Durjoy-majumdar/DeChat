package com.tencent.p014mm.plugin.appbrand.jsapi.picker;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.appbrand.widget.picker.AppBrandOptionsPickerV3;
import java.util.HashMap;
import java.util.Map;
import vt0.C22778a;
import vt0.C22784g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.picker.p */
public class C17953p implements C22784g.C22787c<String> {

    /* renamed from: a */
    public final /* synthetic */ C22778a f49471a;

    /* renamed from: b */
    public final /* synthetic */ AppBrandOptionsPickerV3 f49472b;

    /* renamed from: c */
    public final /* synthetic */ C17947n f49473c;

    public C17953p(C17947n nVar, C22778a aVar, AppBrandOptionsPickerV3 appBrandOptionsPickerV3) {
        this.f49473c = nVar;
        this.f49471a = aVar;
        this.f49472b = appBrandOptionsPickerV3;
    }

    /* renamed from: a */
    public void mo22193a(boolean z, Object obj) {
        String str = (String) obj;
        this.f49471a.mo35924d(true);
        if (!z) {
            this.f49473c.mo22194c("fail cancel", (Map<String, Object>) null);
            return;
        }
        HashMap hashMap = new HashMap(2);
        AppBrandOptionsPickerV3 appBrandOptionsPickerV3 = this.f49472b;
        appBrandOptionsPickerV3.f49961e.mo35385f();
        hashMap.put("value", appBrandOptionsPickerV3.f49960d[appBrandOptionsPickerV3.f49963g]);
        AppBrandOptionsPickerV3 appBrandOptionsPickerV32 = this.f49472b;
        appBrandOptionsPickerV32.f49961e.mo35385f();
        hashMap.put(FirebaseAnalytics.C113379b.INDEX, Integer.valueOf(appBrandOptionsPickerV32.f49963g));
        this.f49473c.mo22194c("ok", hashMap);
    }
}
