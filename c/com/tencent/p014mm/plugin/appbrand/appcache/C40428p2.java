package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86016v1;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.p2 */
public class C40428p2 implements C86016v1 {

    /* renamed from: a */
    public final /* synthetic */ String f108652a;

    public C40428p2(C40430r2 r2Var, String str) {
        this.f108652a = str;
    }

    public boolean accept(C86009m1 m1Var, String str) {
        return str.endsWith("_" + this.f108652a);
    }
}
