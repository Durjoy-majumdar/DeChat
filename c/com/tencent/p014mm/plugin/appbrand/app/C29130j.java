package com.tencent.p014mm.plugin.appbrand.app;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import di3.C86301e;
import ei3.C86522b;
import kr0.C76626j0;

@C86522b(dependencies = {PluginAppBrand.class}, onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.appbrand.app.j */
public class C29130j extends C86301e implements C76626j0 {

    /* renamed from: d */
    public String f79717d;

    /* renamed from: e */
    public C76626j0.C76627a f79718e;

    /* renamed from: CJ */
    public String mo56475CJ(String str, String str2) {
        return C81161g2.m99451h1().mo61553Lo(str, str2);
    }

    /* renamed from: VX */
    public void mo56476VX(String str) {
        this.f79717d = MD5Util.getMD5String(str + String.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: bv */
    public C76626j0.C76627a mo56477bv() {
        return this.f79718e;
    }

    public void clear() {
        this.f79717d = null;
        this.f79718e = null;
    }

    public String hk0() {
        return this.f79717d;
    }

    public void t80(C76626j0.C76627a aVar) {
        this.f79718e = aVar;
    }
}
