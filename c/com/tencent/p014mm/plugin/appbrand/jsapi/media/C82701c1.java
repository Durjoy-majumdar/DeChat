package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.vfs.C86009m1;
import hp3.C87581a;
import lp3.C88643g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.c1 */
public final class C82701c1<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C82381f f241994a;

    /* renamed from: b */
    public final /* synthetic */ boolean f241995b;

    public C82701c1(C82381f fVar, boolean z) {
        this.f241994a = fVar;
        this.f241995b = z;
    }

    public Object call(Object obj) {
        C86009m1 m1Var = (C86009m1) obj;
        if (!this.f241994a.isRunning()) {
            C88643g.m110544b().mo72091a(new Exception("component not running"));
        } else if (!this.f241995b) {
            return m1Var;
        } else {
            try {
                return new C86009m1(C82713f2.m101487e(m1Var.mo119971i()));
            } catch (Exception e) {
                if (!WeChatEnvironment.hasDebugger()) {
                    C88643g.m110544b().mo72091a(e);
                } else {
                    throw e;
                }
            }
        }
        return null;
    }
}
