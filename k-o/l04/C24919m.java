package l04;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import qz3.C26041i;
import sz3.C26243c;
import sz3.C26247g;
import sz3.C26248h;
import vz3.C22830f;
import wy3.C26436b;
import wy3.C26469k;
import wy3.C26516w;
import wy3.C26520x0;
import wy3.C26521y0;
import xy3.C26571h;
import xz3.C26607p;
import zy3.C26755k0;
import zy3.C26777s;

/* renamed from: l04.m */
public final class C24919m extends C26755k0 implements C24872b {

    /* renamed from: K */
    public final C26041i f70993K;

    /* renamed from: L */
    public final C26243c f70994L;

    /* renamed from: M */
    public final C26247g f70995M;

    /* renamed from: N */
    public final C26248h f70996N;

    /* renamed from: P */
    public final C24893h f70997P;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24919m(C26469k kVar, C26520x0 x0Var, C26571h hVar, C22830f fVar, C26436b.C26437a aVar, C26041i iVar, C26243c cVar, C26247g gVar, C26248h hVar2, C24893h hVar3, C26521y0 y0Var) {
        super(kVar, x0Var, hVar, fVar, aVar, y0Var == null ? C26521y0.f73808a : y0Var);
        C26041i iVar2 = iVar;
        C26243c cVar2 = cVar;
        C26247g gVar2 = gVar;
        C26248h hVar4 = hVar2;
        C26469k kVar2 = kVar;
        C87412m.m108594g(kVar, "containingDeclaration");
        C26571h hVar5 = hVar;
        C87412m.m108594g(hVar, "annotations");
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(aVar, "kind");
        C87412m.m108594g(iVar2, TPReportKeys.Common.COMMON_PROTO);
        C87412m.m108594g(cVar2, "nameResolver");
        C87412m.m108594g(gVar2, "typeTable");
        C87412m.m108594g(hVar4, "versionRequirementTable");
        this.f70993K = iVar2;
        this.f70994L = cVar2;
        this.f70995M = gVar2;
        this.f70996N = hVar4;
        this.f70997P = hVar3;
    }

    /* renamed from: F */
    public C26243c mo51882F() {
        return this.f70994L;
    }

    /* renamed from: G */
    public C24893h mo51883G() {
        return this.f70997P;
    }

    /* renamed from: J0 */
    public C26777s mo51316J0(C26469k kVar, C26516w wVar, C26436b.C26437a aVar, C22830f fVar, C26571h hVar, C26521y0 y0Var) {
        C22830f fVar2;
        C26469k kVar2 = kVar;
        C87412m.m108594g(kVar, "newOwner");
        C87412m.m108594g(aVar, "kind");
        C87412m.m108594g(hVar, "annotations");
        C87412m.m108594g(y0Var, FirebaseAnalytics.C113379b.SOURCE);
        C26520x0 x0Var = (C26520x0) wVar;
        if (fVar == null) {
            C22830f name = getName();
            C87412m.m108593f(name, "name");
            fVar2 = name;
        } else {
            fVar2 = fVar;
        }
        C24919m mVar = new C24919m(kVar, x0Var, hVar, fVar2, aVar, this.f70993K, this.f70994L, this.f70995M, this.f70996N, this.f70997P, y0Var);
        mVar.f74450C = this.f74450C;
        return mVar;
    }

    /* renamed from: a0 */
    public C26247g mo51886a0() {
        return this.f70995M;
    }

    /* renamed from: z */
    public C26607p mo51890z() {
        return this.f70993K;
    }
}
