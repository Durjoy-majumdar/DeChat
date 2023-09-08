package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82914r1;
import fy3.C32226l;
import lp3.C88631d;
import rx3.C13598b0;
import te3.C49684hc;
import te3.C64391gc;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.t1 */
public final class C83036t1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C82914r1.C82918c f242763d;

    /* renamed from: e */
    public final /* synthetic */ C64391gc f242764e;

    /* renamed from: f */
    public final /* synthetic */ C32226l<C49684hc, C13598b0> f242765f;

    /* renamed from: g */
    public final /* synthetic */ C32226l<String, C13598b0> f242766g;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.t1$a */
    public static final class C83037a<T> implements C88631d.C76721a {

        /* renamed from: a */
        public final /* synthetic */ C32226l<String, C13598b0> f242767a;

        public C83037a(C32226l<? super String, C13598b0> lVar) {
            this.f242767a = lVar;
        }

        /* renamed from: a */
        public final void mo1720a(Object obj) {
            this.f242767a.invoke(obj == null ? null : obj instanceof Throwable ? ((Throwable) obj).getMessage() : obj.toString());
        }
    }

    public C83036t1(C82914r1.C82918c cVar, C64391gc gcVar, C32226l<? super C49684hc, C13598b0> lVar, C32226l<? super String, C13598b0> lVar2) {
        this.f242763d = cVar;
        this.f242764e = gcVar;
        this.f242765f = lVar;
        this.f242766g = lVar2;
    }

    public final void run() {
        C82914r1.C82918c cVar = this.f242763d;
        cVar.f242404d.mo14840YQ("/cgi-bin/mmbiz-bin/wxaattr/batchwxaattrsync", cVar.f242401a, this.f242764e, C49684hc.class).mo114038a(new C82914r1.C1847d(this.f242765f)).mo123065b(new C83037a(this.f242766g));
    }
}
