package com.tencent.p014mm.plugin.appbrand.appusage;

import com.tencent.p014mm.plugin.appbrand.appusage.C81526t1;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import pe3.C47465a;
import rx3.C13598b0;
import te3.C49268ed2;
import te3.C49962j90;

/* renamed from: com.tencent.mm.plugin.appbrand.appusage.u1 */
public final class C81530u1 implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ C81526t1 f239142d;

    public C81530u1(C81526t1 t1Var) {
        this.f239142d = t1Var;
    }

    /* renamed from: a */
    public final int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        C81526t1.C81527a aVar;
        List<C81526t1.C81528b> list;
        C47465a aVar2 = cVar.f127056b.f127083a;
        Log.m105925i("WxaDesktopEntranceShowLogic", "CGI[getwxadesktopentrance] errType %d, errCode %d, errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (i != 0 || i2 != 0 || aVar2 == null || !(aVar2 instanceof C49268ed2)) {
            Log.m105921e("WxaDesktopEntranceShowLogic", "refresh() cgi return errType %d, errCode %d, errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        } else {
            C81526t1 t1Var = this.f239142d;
            LinkedList<C49962j90> linkedList = ((C49268ed2) aVar2).f132873e;
            C87412m.m108593f(linkedList, "resp.entrance_info");
            synchronized (t1Var.f239137a) {
                for (C49962j90 j902 : linkedList) {
                    int i3 = j902.f135936d;
                    C81526t1.C81527a[] values = C81526t1.C81527a.values();
                    int length = values.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            aVar = null;
                            break;
                        }
                        aVar = values[i4];
                        if (i3 == aVar.ordinal()) {
                            break;
                        }
                        i4++;
                    }
                    if (!(aVar == null || (list = (List) ((LinkedHashMap) t1Var.f239137a).get(aVar)) == null)) {
                        for (C81526t1.C81528b a : list) {
                            a.mo113805a(j902);
                        }
                    }
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
        return 0;
    }
}
