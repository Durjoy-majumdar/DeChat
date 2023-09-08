package l04;

import com.google.firebase.analytics.FirebaseAnalytics;
import gy3.C87412m;
import qz3.C26052n;
import sz3.C26238b;
import sz3.C26243c;
import sz3.C26247g;
import sz3.C26248h;
import vz3.C22830f;
import wy3.C26436b;
import wy3.C26442c0;
import wy3.C26469k;
import wy3.C26504r0;
import wy3.C26505s;
import wy3.C26521y0;
import xy3.C26571h;
import xz3.C26607p;
import zy3.C26746g0;

/* renamed from: l04.l */
public final class C24918l extends C26746g0 implements C24872b {

    /* renamed from: H */
    public final C26052n f70988H;

    /* renamed from: I */
    public final C26243c f70989I;

    /* renamed from: J */
    public final C26247g f70990J;

    /* renamed from: K */
    public final C26248h f70991K;

    /* renamed from: L */
    public final C24893h f70992L;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C24918l(wy3.C26469k r18, wy3.C26504r0 r19, xy3.C26571h r20, wy3.C26442c0 r21, wy3.C26505s r22, boolean r23, vz3.C22830f r24, wy3.C26436b.C26437a r25, boolean r26, boolean r27, boolean r28, boolean r29, boolean r30, qz3.C26052n r31, sz3.C26243c r32, sz3.C26247g r33, sz3.C26248h r34, l04.C24893h r35) {
        /*
            r17 = this;
            r15 = r17
            r14 = r31
            r13 = r32
            r12 = r33
            r11 = r34
            java.lang.String r0 = "containingDeclaration"
            r1 = r18
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "annotations"
            r3 = r20
            gy3.C87412m.m108594g(r3, r0)
            java.lang.String r0 = "modality"
            r4 = r21
            gy3.C87412m.m108594g(r4, r0)
            java.lang.String r0 = "visibility"
            r5 = r22
            gy3.C87412m.m108594g(r5, r0)
            java.lang.String r0 = "name"
            r7 = r24
            gy3.C87412m.m108594g(r7, r0)
            java.lang.String r0 = "kind"
            r8 = r25
            gy3.C87412m.m108594g(r8, r0)
            java.lang.String r0 = "proto"
            gy3.C87412m.m108594g(r14, r0)
            java.lang.String r0 = "nameResolver"
            gy3.C87412m.m108594g(r13, r0)
            java.lang.String r0 = "typeTable"
            gy3.C87412m.m108594g(r12, r0)
            java.lang.String r0 = "versionRequirementTable"
            gy3.C87412m.m108594g(r11, r0)
            wy3.y0 r9 = wy3.C26521y0.f73808a
            r16 = 0
            r0 = r17
            r2 = r19
            r6 = r23
            r10 = r26
            r11 = r27
            r12 = r30
            r13 = r16
            r14 = r28
            r15 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = r31
            r0.f70988H = r1
            r1 = r32
            r0.f70989I = r1
            r1 = r33
            r0.f70990J = r1
            r1 = r34
            r0.f70991K = r1
            r1 = r35
            r0.f70992L = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l04.C24918l.<init>(wy3.k, wy3.r0, xy3.h, wy3.c0, wy3.s, boolean, vz3.f, wy3.b$a, boolean, boolean, boolean, boolean, boolean, qz3.n, sz3.c, sz3.g, sz3.h, l04.h):void");
    }

    /* renamed from: F */
    public C26243c mo51882F() {
        return this.f70989I;
    }

    /* renamed from: G */
    public C24893h mo51883G() {
        return this.f70992L;
    }

    /* renamed from: K0 */
    public C26746g0 mo51324K0(C26469k kVar, C26442c0 c0Var, C26505s sVar, C26504r0 r0Var, C26436b.C26437a aVar, C22830f fVar, C26521y0 y0Var) {
        C87412m.m108594g(kVar, "newOwner");
        C87412m.m108594g(c0Var, "newModality");
        C87412m.m108594g(sVar, "newVisibility");
        C87412m.m108594g(aVar, "kind");
        C87412m.m108594g(fVar, "newName");
        C87412m.m108594g(y0Var, FirebaseAnalytics.C113379b.SOURCE);
        C26571h annotations = getAnnotations();
        boolean z = this.f74445i;
        boolean z2 = this.f74373t;
        boolean z3 = this.f74374u;
        boolean isExternal = isExternal();
        boolean z4 = this.f74378y;
        boolean z5 = this.f74375v;
        C26052n nVar = this.f70988H;
        C26243c cVar = this.f70989I;
        boolean z6 = z5;
        C26247g gVar = this.f70990J;
        C26248h hVar = this.f70991K;
        C26248h hVar2 = hVar;
        return new C24918l(kVar, r0Var, annotations, c0Var, sVar, z, fVar, aVar, z2, z3, isExternal, z4, z6, nVar, cVar, gVar, hVar2, this.f70992L);
    }

    /* renamed from: a0 */
    public C26247g mo51886a0() {
        return this.f70990J;
    }

    public boolean isExternal() {
        Boolean d = C26238b.f73141D.mo53140c(this.f70988H.f72696g);
        C87412m.m108593f(d, "IS_EXTERNAL_PROPERTY.get(proto.flags)");
        return d.booleanValue();
    }

    /* renamed from: z */
    public C26607p mo51890z() {
        return this.f70988H;
    }
}
