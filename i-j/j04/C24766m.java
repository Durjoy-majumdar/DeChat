package j04;

import gy3.C87412m;
import java.util.List;
import l04.C24893h;
import qz3.C26075s;
import sz3.C110828a;
import sz3.C26243c;
import sz3.C26247g;
import sz3.C26248h;
import wy3.C26469k;

/* renamed from: j04.m */
public final class C24766m {

    /* renamed from: a */
    public final C24763k f70643a;

    /* renamed from: b */
    public final C26243c f70644b;

    /* renamed from: c */
    public final C26469k f70645c;

    /* renamed from: d */
    public final C26247g f70646d;

    /* renamed from: e */
    public final C26248h f70647e;

    /* renamed from: f */
    public final C110828a f70648f;

    /* renamed from: g */
    public final C24893h f70649g;

    /* renamed from: h */
    public final C24748g0 f70650h;

    /* renamed from: i */
    public final C24779w f70651i;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0052, code lost:
        r2 = r8.mo51905b();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C24766m(j04.C24763k r2, sz3.C26243c r3, wy3.C26469k r4, sz3.C26247g r5, sz3.C26248h r6, sz3.C110828a r7, l04.C24893h r8, j04.C24748g0 r9, java.util.List<qz3.C26075s> r10) {
        /*
            r1 = this;
            java.lang.String r0 = "components"
            gy3.C87412m.m108594g(r2, r0)
            java.lang.String r0 = "nameResolver"
            gy3.C87412m.m108594g(r3, r0)
            java.lang.String r0 = "containingDeclaration"
            gy3.C87412m.m108594g(r4, r0)
            java.lang.String r0 = "typeTable"
            gy3.C87412m.m108594g(r5, r0)
            java.lang.String r0 = "versionRequirementTable"
            gy3.C87412m.m108594g(r6, r0)
            java.lang.String r0 = "metadataVersion"
            gy3.C87412m.m108594g(r7, r0)
            java.lang.String r0 = "typeParameters"
            gy3.C87412m.m108594g(r10, r0)
            r1.<init>()
            r1.f70643a = r2
            r1.f70644b = r3
            r1.f70645c = r4
            r1.f70646d = r5
            r1.f70647e = r6
            r1.f70648f = r7
            r1.f70649g = r8
            j04.g0 r0 = new j04.g0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Deserializer for \""
            r2.append(r3)
            vz3.f r3 = r4.getName()
            r2.append(r3)
            r3 = 34
            r2.append(r3)
            java.lang.String r6 = r2.toString()
            if (r8 == 0) goto L_0x0058
            java.lang.String r2 = r8.mo51905b()
            if (r2 != 0) goto L_0x005a
        L_0x0058:
            java.lang.String r2 = "[container not found]"
        L_0x005a:
            r7 = r2
            r2 = r0
            r3 = r1
            r4 = r9
            r5 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r1.f70650h = r0
            j04.w r2 = new j04.w
            r2.<init>(r1)
            r1.f70651i = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j04.C24766m.<init>(j04.k, sz3.c, wy3.k, sz3.g, sz3.h, sz3.a, l04.h, j04.g0, java.util.List):void");
    }

    /* renamed from: b */
    public static /* synthetic */ C24766m m31169b(C24766m mVar, C26469k kVar, List list, C26243c cVar, C26247g gVar, C26248h hVar, C110828a aVar, int i, Object obj) {
        if ((i & 4) != 0) {
            cVar = mVar.f70644b;
        }
        C26243c cVar2 = cVar;
        if ((i & 8) != 0) {
            gVar = mVar.f70646d;
        }
        C26247g gVar2 = gVar;
        if ((i & 16) != 0) {
            hVar = mVar.f70647e;
        }
        C26248h hVar2 = hVar;
        if ((i & 32) != 0) {
            aVar = mVar.f70648f;
        }
        return mVar.mo51750a(kVar, list, cVar2, gVar2, hVar2, aVar);
    }

    /* renamed from: a */
    public final C24766m mo51750a(C26469k kVar, List<C26075s> list, C26243c cVar, C26247g gVar, C26248h hVar, C110828a aVar) {
        C110828a aVar2 = aVar;
        C26469k kVar2 = kVar;
        C87412m.m108594g(kVar, "descriptor");
        List<C26075s> list2 = list;
        C87412m.m108594g(list, "typeParameterProtos");
        C87412m.m108594g(cVar, "nameResolver");
        C87412m.m108594g(gVar, "typeTable");
        C26248h hVar2 = hVar;
        C87412m.m108594g(hVar2, "versionRequirementTable");
        C87412m.m108594g(aVar2, "metadataVersion");
        C24763k kVar3 = this.f70643a;
        boolean z = true;
        if (aVar2.f331565b != 1 || aVar2.f331566c < 4) {
            z = false;
        }
        return new C24766m(kVar3, cVar, kVar, gVar, z ? hVar2 : this.f70647e, aVar, this.f70649g, this.f70650h, list);
    }
}
