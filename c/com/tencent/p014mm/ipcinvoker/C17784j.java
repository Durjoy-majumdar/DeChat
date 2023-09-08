package com.tencent.p014mm.ipcinvoker;

import android.os.Bundle;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import r20.C22197b;

/* renamed from: com.tencent.mm.ipcinvoker.j */
class C17784j implements C80883e<Bundle, Bundle> {
    private C17784j() {
    }

    public void invoke(Object obj, C1256g gVar) {
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
        C17783i iVar = new C17783i(this, string, gVar);
        bVar.getClass();
        if (string2 != null && string2.length() != 0) {
            List list = (List) ((ConcurrentHashMap) bVar.f62834a).get(string2);
            if (list == null) {
                list = new LinkedList();
                ((ConcurrentHashMap) bVar.f62834a).put(string2, list);
            }
            if (!list.contains(iVar)) {
                synchronized (list) {
                    list.add(iVar);
                }
            }
        }
    }
}
