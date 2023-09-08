package l04;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import qz3.C26023d;
import sz3.C26243c;
import sz3.C26247g;
import sz3.C26248h;
import vz3.C22830f;
import wy3.C26436b;
import wy3.C26447e;
import wy3.C26467j;
import wy3.C26469k;
import wy3.C26516w;
import wy3.C26521y0;
import xy3.C26571h;
import xz3.C26607p;
import zy3.C26750i;

/* renamed from: l04.c */
public final class C24873c extends C26750i implements C24872b {

    /* renamed from: L */
    public final C26023d f70880L;

    /* renamed from: M */
    public final C26243c f70881M;

    /* renamed from: N */
    public final C26247g f70882N;

    /* renamed from: P */
    public final C26248h f70883P;

    /* renamed from: Q */
    public final C24893h f70884Q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24873c(C26447e eVar, C26467j jVar, C26571h hVar, boolean z, C26436b.C26437a aVar, C26023d dVar, C26243c cVar, C26247g gVar, C26248h hVar2, C24893h hVar3, C26521y0 y0Var) {
        super(eVar, jVar, hVar, z, aVar, y0Var == null ? C26521y0.f73808a : y0Var);
        C26023d dVar2 = dVar;
        C26243c cVar2 = cVar;
        C26247g gVar2 = gVar;
        C26248h hVar4 = hVar2;
        C26447e eVar2 = eVar;
        C87412m.m108594g(eVar, "containingDeclaration");
        C26571h hVar5 = hVar;
        C87412m.m108594g(hVar, "annotations");
        C87412m.m108594g(aVar, "kind");
        C87412m.m108594g(dVar2, TPReportKeys.Common.COMMON_PROTO);
        C87412m.m108594g(cVar2, "nameResolver");
        C87412m.m108594g(gVar2, "typeTable");
        C87412m.m108594g(hVar4, "versionRequirementTable");
        this.f70880L = dVar2;
        this.f70881M = cVar2;
        this.f70882N = gVar2;
        this.f70883P = hVar4;
        this.f70884Q = hVar3;
    }

    /* renamed from: F */
    public C26243c mo51882F() {
        return this.f70881M;
    }

    /* renamed from: G */
    public C24893h mo51883G() {
        return this.f70884Q;
    }

    /* renamed from: W0 */
    public C24873c mo51320S0(C26469k kVar, C26516w wVar, C26436b.C26437a aVar, C22830f fVar, C26571h hVar, C26521y0 y0Var) {
        C26469k kVar2 = kVar;
        C87412m.m108594g(kVar2, "newOwner");
        C87412m.m108594g(aVar, "kind");
        C87412m.m108594g(hVar, "annotations");
        C87412m.m108594g(y0Var, FirebaseAnalytics.C113379b.SOURCE);
        C24873c cVar = new C24873c((C26447e) kVar2, (C26467j) wVar, hVar, this.f74394K, aVar, this.f70880L, this.f70881M, this.f70882N, this.f70883P, this.f70884Q, y0Var);
        cVar.f74450C = this.f74450C;
        return cVar;
    }

    /* renamed from: Z */
    public boolean mo51885Z() {
        return false;
    }

    /* renamed from: a0 */
    public C26247g mo51886a0() {
        return this.f70882N;
    }

    public boolean isExternal() {
        return false;
    }

    public boolean isInline() {
        return false;
    }

    public boolean isSuspend() {
        return false;
    }

    /* renamed from: z */
    public C26607p mo51890z() {
        return this.f70880L;
    }
}
