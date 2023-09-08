package com.tencent.p014mm.plugin.appbrand.keylogger;

import com.tencent.p014mm.plugin.appbrand.keylogger.C83215c;
import java.util.Comparator;

/* renamed from: com.tencent.mm.plugin.appbrand.keylogger.b */
public class C83213b implements Comparator<C83215c.C83216a> {
    public C83213b(C83215c cVar) {
    }

    public int compare(Object obj, Object obj2) {
        int i = (((C83215c.C83216a) obj).f243059a.f243051d > ((C83215c.C83216a) obj2).f243059a.f243051d ? 1 : (((C83215c.C83216a) obj).f243059a.f243051d == ((C83215c.C83216a) obj2).f243059a.f243051d ? 0 : -1));
        if (i > 0) {
            return 1;
        }
        return i < 0 ? -1 : 0;
    }
}
