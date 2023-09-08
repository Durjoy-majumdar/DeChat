package com.tencent.p014mm.plugin.wear.model;

import com.tencent.p014mm.plugin.wear.model.C43462g;
import java.util.HashMap;

/* renamed from: com.tencent.mm.plugin.wear.model.h */
public class C43464h {

    /* renamed from: b */
    public static int f117486b;

    /* renamed from: a */
    public HashMap<String, C43462g> f117487a = new HashMap<>();

    /* renamed from: a */
    public synchronized C43462g mo67628a(String str) {
        if (this.f117487a.containsKey(str)) {
            return (C43462g) this.f117487a.get(str).clone();
        }
        f117486b++;
        C43462g gVar = new C43462g();
        gVar.f117476a = str;
        gVar.f117477b = f117486b;
        gVar.f117480e = C43462g.C43463a.INIT;
        this.f117487a.put(str, gVar);
        return (C43462g) gVar.clone();
    }
}
