package eo3;

import java.util.ArrayList;
import java.util.List;

/* renamed from: eo3.c */
public class C75643c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ List f222228d;

    /* renamed from: e */
    public final /* synthetic */ C75635b f222229e;

    public C75643c(C75635b bVar, List list) {
        this.f222229e = bVar;
        this.f222228d = list;
    }

    public void run() {
        C75635b bVar = this.f222229e;
        if (bVar.f222211v == null) {
            bVar.f222211v = new ArrayList();
        }
        this.f222229e.f222211v.clear();
        this.f222229e.f222211v.addAll(this.f222228d);
        this.f222229e.f222211v.add("officialaccounts");
        this.f222229e.f222211v.add("helper_entry");
    }
}
