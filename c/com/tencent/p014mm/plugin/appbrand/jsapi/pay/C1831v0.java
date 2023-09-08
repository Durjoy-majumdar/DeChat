package com.tencent.p014mm.plugin.appbrand.jsapi.pay;

import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import java.util.HashMap;
import kr0.C88267e;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.v0 */
public class C1831v0 implements C1796d {

    /* renamed from: a */
    public final /* synthetic */ C88267e f11635a;

    /* renamed from: b */
    public final /* synthetic */ int f11636b;

    /* renamed from: c */
    public final /* synthetic */ C1833w0 f11637c;

    public C1831v0(C1833w0 w0Var, C88267e eVar, int i) {
        this.f11637c = w0Var;
        this.f11635a = eVar;
        this.f11636b = i;
    }

    /* renamed from: a */
    public void mo1767a(boolean z, String str) {
        if (z) {
            HashMap hashMap = new HashMap(1);
            hashMap.put(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, str);
            this.f11635a.mo109647a(this.f11636b, this.f11637c.mo115112m("ok", hashMap));
            return;
        }
        this.f11635a.mo109647a(this.f11636b, this.f11637c.mo115109j("fail"));
    }
}
