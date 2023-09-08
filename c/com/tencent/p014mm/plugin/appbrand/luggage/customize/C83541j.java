package com.tencent.p014mm.plugin.appbrand.luggage.customize;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import java.util.LinkedList;
import java.util.List;
import zi0.C91759b;

/* renamed from: com.tencent.mm.plugin.appbrand.luggage.customize.j */
public class C83541j implements C91759b {

    /* renamed from: d */
    public final List<C91759b> f244064d;

    public C83541j(AppBrandRuntime appBrandRuntime) {
        LinkedList linkedList = new LinkedList();
        this.f244064d = linkedList;
        linkedList.add(new C83547o(appBrandRuntime));
        linkedList.add(new C83538g());
        linkedList.add(new C83539h(appBrandRuntime));
        linkedList.add(new C83537f(appBrandRuntime));
    }

    /* renamed from: b3 */
    public boolean mo115836b3(C82381f fVar, String str) {
        if (!(fVar == null || str == null || str.length() == 0)) {
            for (C91759b b3 : this.f244064d) {
                if (b3.mo115836b3(fVar, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: nO */
    public String mo115838nO(C82381f fVar, String str) {
        if (!(fVar == null || str == null || str.length() == 0)) {
            for (C91759b next : this.f244064d) {
                if (next.mo115836b3(fVar, str)) {
                    return next.mo115838nO(fVar, str);
                }
            }
        }
        return str;
    }
}
