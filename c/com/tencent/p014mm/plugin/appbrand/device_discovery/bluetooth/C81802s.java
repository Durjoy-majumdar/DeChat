package com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;

/* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.s */
public final class C81802s extends C81781e0 {

    /* renamed from: a */
    public final String f240026a;

    /* renamed from: b */
    public final String f240027b;

    public C81802s(AppBrandRuntimeWC appBrandRuntimeWC) {
        AppBrandInitConfigWC M1 = appBrandRuntimeWC.mo113210l1();
        String str = null;
        String str2 = M1 != null ? M1.f234838r : null;
        String str3 = "";
        this.f240026a = str2 == null ? str3 : str2;
        AppBrandInitConfigWC M12 = appBrandRuntimeWC.mo113210l1();
        str = M12 != null ? M12.f234837q : str;
        this.f240027b = str != null ? str : str3;
    }

    /* renamed from: a */
    public String mo114162a() {
        return this.f240027b;
    }

    /* renamed from: b */
    public Integer mo114163b() {
        return 0;
    }

    /* renamed from: d */
    public String mo114165d() {
        return this.f240026a;
    }
}
