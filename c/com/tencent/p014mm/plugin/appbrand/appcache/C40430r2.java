package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.vfs.C86016v1;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.r2 */
public class C40430r2 {
    /* renamed from: a */
    public final void mo63192a(String str, C86016v1 v1Var) {
        C86009m1[] w;
        C86009m1 m1Var = new C86009m1(str);
        if (m1Var.mo119967g() && m1Var.mo119977o() && (w = m1Var.mo119986w(v1Var)) != null && w.length > 0) {
            for (C86009m1 m1Var2 : w) {
                C86013q1.m106445f(m1Var2.mo119976n());
                Log.m105925i("WxaJsCacheStorage", "clear file:%s", m1Var2.getName());
            }
        }
    }
}
