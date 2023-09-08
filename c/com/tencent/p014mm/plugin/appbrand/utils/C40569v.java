package com.tencent.p014mm.plugin.appbrand.utils;

import com.tencent.p014mm.plugin.appbrand.utils.C84795y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.v */
public class C40569v implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f108965d;

    /* renamed from: e */
    public final /* synthetic */ C84795y.C40572a f108966e;

    public C40569v(String str, C84795y.C40572a aVar) {
        this.f108965d = str;
        this.f108966e = aVar;
    }

    public void run() {
        if (!((HashMap) C84795y.f247224b).containsKey(this.f108965d)) {
            ((HashMap) C84795y.f247224b).put(this.f108965d, new ArrayList());
        }
        ((List) ((HashMap) C84795y.f247224b).get(this.f108965d)).add(this.f108966e);
    }
}
