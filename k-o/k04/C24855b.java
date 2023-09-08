package k04;

import ez3.C24474c;
import f04.C24478b;
import fy3.C32226l;
import gy3.C24560g0;
import gy3.C24563k;
import gy3.C8480h;
import gy3.C87412m;
import j04.C21150r;
import j04.C24739d;
import j04.C24760j;
import j04.C24763k;
import j04.C24764l;
import j04.C24769o;
import j04.C24774s;
import j04.C24777v;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import m04.C24980n;
import ny3.C109824f;
import o04.C25330k;
import sx3.C36907w;
import sx3.C64186f0;
import ty3.C26328a;
import ty3.C26343l;
import vz3.C22826c;
import wy3.C22936j0;
import wy3.C22937k0;
import wy3.C26448e0;
import wy3.C26458h0;
import xz3.C26589f;
import yy3.C26640a;
import yy3.C26642b;
import yy3.C26643c;
import yy3.C26647e;

/* renamed from: k04.b */
public final class C24855b implements C26328a {

    /* renamed from: b */
    public final C88048d f70842b = new C88048d();

    /* renamed from: k04.b$a */
    public /* synthetic */ class C24856a extends C24563k implements C32226l<String, InputStream> {
        public C24856a(Object obj) {
            super(1, obj);
        }

        public final String getName() {
            return "loadResource";
        }

        public final C109824f getOwner() {
            return C24560g0.m30725a(C88048d.class);
        }

        public final String getSignature() {
            return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, "p0");
            return ((C88048d) this.receiver).mo122496a(str);
        }
    }

    /* renamed from: a */
    public C22936j0 mo51860a(C24980n nVar, C26448e0 e0Var, Iterable<? extends C26642b> iterable, C26643c cVar, C26640a aVar, boolean z) {
        C24980n nVar2 = nVar;
        C26448e0 e0Var2 = e0Var;
        C87412m.m108594g(nVar2, "storageManager");
        C87412m.m108594g(e0Var2, "builtInsModule");
        C87412m.m108594g(iterable, "classDescriptorFactories");
        C87412m.m108594g(cVar, "platformDependentDeclarationFilter");
        C87412m.m108594g(aVar, "additionalClassPartsProvider");
        Set<C22826c> set = C26343l.f73380n;
        C24856a aVar2 = new C24856a(this.f70842b);
        C87412m.m108594g(set, "packageFqNames");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(set, 10));
        for (C22826c cVar2 : set) {
            String a = C24854a.f70841m.mo51859a(cVar2);
            InputStream inputStream = (InputStream) aVar2.invoke(a);
            if (inputStream != null) {
                arrayList.add(C24857c.f70843s.mo51861a(cVar2, nVar, e0Var, inputStream, z));
            } else {
                throw new IllegalStateException("Resource not found in classpath: " + a);
            }
        }
        C22937k0 k0Var = r2;
        C22937k0 k0Var2 = new C22937k0(arrayList);
        C26458h0 h0Var = r1;
        C26458h0 h0Var2 = new C26458h0(nVar2, e0Var2);
        C24764l.C24765a aVar3 = C24764l.C24765a.f70642a;
        C24769o oVar = r5;
        C24769o oVar2 = new C24769o(k0Var2);
        C22937k0 k0Var3 = k0Var2;
        C24854a aVar4 = C24854a.f70841m;
        C24739d dVar = new C24739d(e0Var2, h0Var2, aVar4);
        C24777v.C24778a aVar5 = C24777v.C24778a.f70664a;
        ArrayList arrayList2 = arrayList;
        C21150r rVar = C21150r.f59798a;
        C24474c.C24475a aVar6 = C24474c.C24475a.f69990a;
        C24774s.C24775a aVar7 = C24774s.C24775a.f70663a;
        int i = C24760j.f70620a;
        C24760j jVar = C24760j.C24761a.f70621a;
        C26589f fVar = aVar4.f70220a;
        C24478b bVar = r2;
        C24478b bVar2 = new C24478b(nVar2, C64186f0.f181907d);
        C24763k kVar = r0;
        C24763k kVar2 = new C24763k(nVar, e0Var, aVar3, oVar, dVar, k0Var, aVar5, rVar, aVar6, aVar7, iterable, h0Var, jVar, aVar, cVar, fVar, (C25330k) null, bVar, (C26647e) null, (List) null, 851968, (C8480h) null);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((C24857c) it.next()).mo51752J0(kVar);
        }
        return k0Var3;
    }
}
