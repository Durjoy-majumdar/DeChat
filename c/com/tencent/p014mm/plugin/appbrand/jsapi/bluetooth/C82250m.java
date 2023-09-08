package com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82835n;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.m */
public interface C82250m extends C82835n {

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.m$a */
    public static final class C82251a {
        /* renamed from: a */
        public static /* synthetic */ void m101007a(C82250m mVar, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                mVar.mo114627t(z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: disable");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.m$b */
    public interface C82252b {
        /* renamed from: a */
        C82250m mo114628a(AppBrandRuntime appBrandRuntime);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.m$c */
    public interface C82253c {
        /* renamed from: a */
        void mo114243a(boolean z);

        /* renamed from: b */
        String mo114244b();
    }

    /* renamed from: P */
    boolean mo114618P();

    /* renamed from: T */
    void mo114619T(C82253c cVar);

    /* renamed from: a */
    void mo114620a();

    /* renamed from: b */
    String mo114621b();

    /* renamed from: j */
    void mo114624j();

    /* renamed from: n */
    void mo114626n(C82253c cVar);

    /* renamed from: t */
    void mo114627t(boolean z);
}
