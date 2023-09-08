package com.tencent.p014mm.plugin.appbrand.keylogger;

import com.tencent.p014mm.plugin.appbrand.keylogger.C83224m;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import uo0.C90709a;
import uo0.C90712d;

/* renamed from: com.tencent.mm.plugin.appbrand.keylogger.o */
public final class C83227o {

    /* renamed from: a */
    public static final C83228a f243075a = new C83228a();

    /* renamed from: com.tencent.mm.plugin.appbrand.keylogger.o$a */
    public static final class C83228a {

        /* renamed from: a */
        public final Map<String, Long> f243076a = new ConcurrentHashMap();

        /* renamed from: a */
        public long mo115469a(String str, String str2, C90709a aVar) {
            Long l;
            String format = String.format("%s#%s#%s", new Object[]{str, str2, aVar.name()});
            if (!((ConcurrentHashMap) this.f243076a).containsKey(format) || (l = (Long) ((ConcurrentHashMap) this.f243076a).get(format)) == null) {
                return -1;
            }
            long currentTimeMillis = System.currentTimeMillis() - l.longValue();
            ((ConcurrentHashMap) this.f243076a).remove(format);
            return currentTimeMillis;
        }
    }

    /* renamed from: a */
    public static void m102134a(String str, C90709a aVar, String str2, String str3) {
        C83224m mVar = C83224m.C83225a.f243072a;
        String a = aVar.mo124834a();
        long a2 = f243075a.mo115469a(aVar.mo124834a(), str, aVar);
        List list = (List) ((HashMap) mVar.f243071a).get(a);
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                ((C90712d) list.get(i)).mo116880d(str, aVar, a2);
            }
        }
    }
}
