package com.tencent.p014mm.ipcinvoker;

import android.os.Bundle;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import r20.C22197b;

/* renamed from: com.tencent.mm.ipcinvoker.l */
class C17786l implements C80883e<Bundle, Bundle> {
    private C17786l() {
    }

    public void invoke(Object obj, C1256g gVar) {
        List list;
        Bundle bundle = (Bundle) obj;
        String string = bundle.getString("Token");
        String string2 = bundle.getString("Event");
        if (C22197b.f62833b == null) {
            synchronized (C22197b.class) {
                if (C22197b.f62833b == null) {
                    C22197b.f62833b = new C22197b();
                }
            }
        }
        C22197b bVar = C22197b.f62833b;
        C17785k kVar = new C17785k(this, string);
        bVar.getClass();
        if (string2 != null && string2.length() != 0 && (list = (List) ((ConcurrentHashMap) bVar.f62834a).get(string2)) != null) {
            synchronized (list) {
                list.remove(kVar);
            }
            if (list.isEmpty()) {
                ((ConcurrentHashMap) bVar.f62834a).remove(string2);
            }
        }
    }
}
