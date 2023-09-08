package qq0;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import li0.C88508b;
import li0.C88509c;
import p170ic.C87692f;
import qq0.C89790a;
import qq0.C89816t;
import rx3.C13598b0;

/* renamed from: qq0.k */
public final class C89805k implements C89790a {

    /* renamed from: d */
    public final AppBrandRuntimeWC f258209d;

    /* renamed from: e */
    public final C89790a f258210e;

    /* renamed from: f */
    public C88509c.C88512b f258211f;

    /* renamed from: qq0.k$a */
    public static final class C89806a extends C87413o implements C32226l<C87692f, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C89805k f258212d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89806a(C89805k kVar) {
            super(1);
            this.f258212d = kVar;
        }

        public Object invoke(Object obj) {
            C87692f fVar = (C87692f) obj;
            C87412m.m108594g(fVar, "$this$lifecycle");
            C89804i iVar = new C89804i(this.f258212d);
            fVar.f253969d.put(C88508b.BACKGROUND, iVar);
            C12929j jVar = C12929j.f36953d;
            C87412m.m108594g(jVar, "callback");
            fVar.f253969d.put(C88508b.FOREGROUND, jVar);
            return C13598b0.f38549a;
        }
    }

    public C89805k(AppBrandRuntimeWC appBrandRuntimeWC, C89790a aVar) {
        C87412m.m108594g(appBrandRuntimeWC, "runtime");
        C87412m.m108594g(aVar, "hostCapsuleBarBlinkHelper");
        this.f258209d = appBrandRuntimeWC;
        this.f258210e = aVar;
        C89806a aVar2 = new C89806a(this);
        C87692f fVar = new C87692f();
        aVar2.invoke(fVar);
        appBrandRuntimeWC.f238113K.mo122978a(fVar);
        this.f258211f = fVar;
    }

    /* renamed from: b */
    public C89816t.C89818b mo124073b(C89790a.C89793b bVar, boolean z, String str) {
        return this.f258210e.mo124073b(bVar, z, str);
    }

    /* renamed from: c */
    public int mo124074c() {
        return this.f258210e.mo124074c();
    }

    /* renamed from: e */
    public void mo124075e(String str) {
        this.f258210e.mo124075e(str);
    }

    /* renamed from: f */
    public C89816t.C89818b mo124076f(C89790a.C89793b bVar) {
        C89816t.C89818b b = this.f258210e.mo124073b(bVar, true, "embed_wxa_blink_handler");
        C87412m.m108593f(b, "hostCapsuleBarBlinkHelpe… true, TAG_BLINK_HANDLER)");
        return b;
    }
}
