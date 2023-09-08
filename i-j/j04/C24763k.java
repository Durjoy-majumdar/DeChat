package j04;

import b04.C23649g;
import ez3.C24474c;
import f04.C24477a;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import java.util.Set;
import l04.C24893h;
import m04.C24980n;
import n04.C25120f1;
import n04.C25175s;
import o04.C25330k;
import o04.C25332l;
import sx3.C26236u;
import sx3.C64186f0;
import sz3.C110828a;
import sz3.C26243c;
import sz3.C26247g;
import sz3.C26248h;
import vz3.C26408b;
import wy3.C22936j0;
import wy3.C26447e;
import wy3.C26448e0;
import wy3.C26458h0;
import wy3.C26465i0;
import xy3.C26566c;
import xz3.C26589f;
import yy3.C26640a;
import yy3.C26642b;
import yy3.C26643c;
import yy3.C26647e;

/* renamed from: j04.k */
public final class C24763k {

    /* renamed from: a */
    public final C24980n f70622a;

    /* renamed from: b */
    public final C26448e0 f70623b;

    /* renamed from: c */
    public final C24764l f70624c;

    /* renamed from: d */
    public final C24755h f70625d;

    /* renamed from: e */
    public final C24735c<C26566c, C23649g<?>> f70626e;

    /* renamed from: f */
    public final C22936j0 f70627f;

    /* renamed from: g */
    public final C24777v f70628g;

    /* renamed from: h */
    public final C21150r f70629h;

    /* renamed from: i */
    public final C24474c f70630i;

    /* renamed from: j */
    public final C24774s f70631j;

    /* renamed from: k */
    public final Iterable<C26642b> f70632k;

    /* renamed from: l */
    public final C26458h0 f70633l;

    /* renamed from: m */
    public final C24760j f70634m;

    /* renamed from: n */
    public final C26640a f70635n;

    /* renamed from: o */
    public final C26643c f70636o;

    /* renamed from: p */
    public final C26589f f70637p;

    /* renamed from: q */
    public final C25330k f70638q;

    /* renamed from: r */
    public final C26647e f70639r;

    /* renamed from: s */
    public final List<C25120f1> f70640s;

    /* renamed from: t */
    public final C24757i f70641t;

    public C24763k(C24980n nVar, C26448e0 e0Var, C24764l lVar, C24755h hVar, C24735c cVar, C22936j0 j0Var, C24777v vVar, C21150r rVar, C24474c cVar2, C24774s sVar, Iterable iterable, C26458h0 h0Var, C24760j jVar, C26640a aVar, C26643c cVar3, C26589f fVar, C25330k kVar, C24477a aVar2, C26647e eVar, List list, int i, C8480h hVar2) {
        C25332l lVar2;
        C24980n nVar2 = nVar;
        C26448e0 e0Var2 = e0Var;
        C24764l lVar3 = lVar;
        C24755h hVar3 = hVar;
        C24735c cVar4 = cVar;
        C22936j0 j0Var2 = j0Var;
        C24777v vVar2 = vVar;
        C21150r rVar2 = rVar;
        C24474c cVar5 = cVar2;
        C24774s sVar2 = sVar;
        Iterable iterable2 = iterable;
        C26458h0 h0Var2 = h0Var;
        C24760j jVar2 = jVar;
        C26589f fVar2 = fVar;
        int i2 = i;
        C26640a aVar3 = (i2 & 8192) != 0 ? C26640a.C26641a.f74149a : aVar;
        C26643c cVar6 = (i2 & 16384) != 0 ? C26643c.C26644a.f74150a : cVar3;
        if ((i2 & 65536) != 0) {
            C25330k.f71840b.getClass();
            lVar2 = C25330k.C25331a.f71842b;
        } else {
            lVar2 = kVar;
        }
        C26647e.C26648a aVar4 = (i2 & 262144) != 0 ? C26647e.C26648a.f74153a : eVar;
        List b = (i2 & 524288) != 0 ? C26236u.m33719b(C25175s.f71622a) : list;
        C87412m.m108594g(nVar2, "storageManager");
        C87412m.m108594g(e0Var2, "moduleDescriptor");
        C87412m.m108594g(lVar3, "configuration");
        C87412m.m108594g(hVar3, "classDataFinder");
        C87412m.m108594g(cVar4, "annotationAndConstantLoader");
        C87412m.m108594g(j0Var2, "packageFragmentProvider");
        C87412m.m108594g(vVar2, "localClassifierTypeSettings");
        C87412m.m108594g(rVar2, "errorReporter");
        C87412m.m108594g(cVar5, "lookupTracker");
        C87412m.m108594g(sVar2, "flexibleTypeDeserializer");
        C87412m.m108594g(iterable2, "fictitiousClassDescriptorFactories");
        C87412m.m108594g(h0Var2, "notFoundClasses");
        C87412m.m108594g(jVar2, "contractDeserializer");
        C87412m.m108594g(aVar3, "additionalClassPartsProvider");
        C87412m.m108594g(cVar6, "platformDependentDeclarationFilter");
        C26643c cVar7 = cVar6;
        C87412m.m108594g(fVar, "extensionRegistryLite");
        C87412m.m108594g(lVar2, "kotlinTypeChecker");
        C87412m.m108594g(aVar2, "samConversionResolver");
        C87412m.m108594g(aVar4, "platformDependentTypeTransformer");
        List list2 = b;
        C87412m.m108594g(list2, "typeAttributeTranslators");
        this.f70622a = nVar2;
        this.f70623b = e0Var2;
        this.f70624c = lVar3;
        this.f70625d = hVar3;
        this.f70626e = cVar4;
        this.f70627f = j0Var2;
        this.f70628g = vVar2;
        this.f70629h = rVar2;
        this.f70630i = cVar5;
        this.f70631j = sVar2;
        this.f70632k = iterable2;
        this.f70633l = h0Var2;
        this.f70634m = jVar2;
        this.f70635n = aVar3;
        this.f70636o = cVar7;
        this.f70637p = fVar;
        this.f70638q = lVar2;
        this.f70639r = aVar4;
        this.f70640s = list2;
        this.f70641t = new C24757i(this);
    }

    /* renamed from: a */
    public final C24766m mo51742a(C26465i0 i0Var, C26243c cVar, C26247g gVar, C26248h hVar, C110828a aVar, C24893h hVar2) {
        C87412m.m108594g(i0Var, "descriptor");
        C26243c cVar2 = cVar;
        C87412m.m108594g(cVar, "nameResolver");
        C87412m.m108594g(gVar, "typeTable");
        C87412m.m108594g(hVar, "versionRequirementTable");
        C110828a aVar2 = aVar;
        C87412m.m108594g(aVar2, "metadataVersion");
        return new C24766m(this, cVar2, i0Var, gVar, hVar, aVar2, hVar2, (C24748g0) null, C64186f0.f181907d);
    }

    /* renamed from: b */
    public final C26447e mo51743b(C26408b bVar) {
        C87412m.m108594g(bVar, "classId");
        C24757i iVar = this.f70641t;
        Set<C26408b> set = C24757i.f70614c;
        return iVar.mo51738a(bVar, (C24747g) null);
    }
}
