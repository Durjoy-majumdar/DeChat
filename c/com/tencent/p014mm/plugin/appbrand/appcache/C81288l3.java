package com.tencent.p014mm.plugin.appbrand.appcache;

import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import or3.C89286a;
import sx3.C110818d0;
import z04.C66725r;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.l3 */
public final class C81288l3 {
    /* renamed from: a */
    public static final String m99661a(String str, int i) {
        C87412m.m108594g(str, "appId");
        int[] iArr = C89286a.f257215d;
        ArrayList arrayList = new ArrayList(3);
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr[i2];
            arrayList.add("appId='" + new C81273j1(str, "", i3) + '\'');
        }
        String S = C110818d0.m150921S(arrayList, " or ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null);
        return '(' + S + ") and debugType=" + i;
    }

    /* renamed from: b */
    public static final String m99662b(String str, int i) {
        C87412m.m108594g(str, "appId");
        int[] iArr = C89286a.f257215d;
        ArrayList arrayList = new ArrayList(3);
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr[i2];
            arrayList.add("appId!='" + new C81273j1(str, "", i3) + '\'');
        }
        String S = C110818d0.m150921S(arrayList, " and ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null);
        return C66725r.m78728b("\n            appId like '" + str + "$%' and " + S + " and debugType=" + i + "\n        ");
    }
}
