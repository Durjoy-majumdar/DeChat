package com.tencent.p014mm.plugin.appbrand.keylogger;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import uo0.C90709a;
import uo0.C90712d;

/* renamed from: com.tencent.mm.plugin.appbrand.keylogger.m */
public final class C83224m {

    /* renamed from: a */
    public final Map<String, List<C90712d>> f243071a = new HashMap();

    /* renamed from: com.tencent.mm.plugin.appbrand.keylogger.m$a */
    public static final class C83225a {

        /* renamed from: a */
        public static final C83224m f243072a = new C83224m((C83223l) null);
    }

    public C83224m(C83223l lVar) {
    }

    /* renamed from: a */
    public void mo115468a(String str, String str2, C90709a aVar, long j) {
        List list = (List) ((HashMap) this.f243071a).get(str);
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                ((C90712d) list.get(i)).mo116880d(str2, aVar, j);
            }
        }
    }
}
