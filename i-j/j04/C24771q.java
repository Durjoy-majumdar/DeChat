package j04;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fy3.C32224a;
import fy3.C32226l;
import g04.C20770i;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import l04.C24893h;
import l04.C24917k;
import m04.C24980n;
import qz3.C26046l;
import qz3.C26049m;
import qz3.C26055o;
import qz3.C26062p;
import sx3.C36907w;
import sz3.C110828a;
import sz3.C26244d;
import vz3.C22826c;
import vz3.C22830f;
import vz3.C26408b;
import wy3.C26448e0;
import wy3.C26521y0;

/* renamed from: j04.q */
public abstract class C24771q extends C24770p {

    /* renamed from: j */
    public final C110828a f70655j;

    /* renamed from: n */
    public final C24893h f70656n;

    /* renamed from: o */
    public final C26244d f70657o;

    /* renamed from: p */
    public final C24734b0 f70658p;

    /* renamed from: q */
    public C26049m f70659q;

    /* renamed from: r */
    public C20770i f70660r;

    /* renamed from: j04.q$a */
    public static final class C24772a extends C87413o implements C32226l<C26408b, C26521y0> {

        /* renamed from: d */
        public final /* synthetic */ C24771q f70661d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24772a(C24771q qVar) {
            super(1);
            this.f70661d = qVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C26408b) obj, LocaleUtil.ITALIAN);
            C24893h hVar = this.f70661d.f70656n;
            return hVar != null ? hVar : C26521y0.f73808a;
        }
    }

    /* renamed from: j04.q$b */
    public static final class C24773b extends C87413o implements C32224a<Collection<? extends C22830f>> {

        /* renamed from: d */
        public final /* synthetic */ C24771q f70662d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24773b(C24771q qVar) {
            super(0);
            this.f70662d = qVar;
        }

        public Object invoke() {
            Set keySet = ((LinkedHashMap) this.f70662d.f70658p.f70575d).keySet();
            ArrayList arrayList = new ArrayList();
            for (Object next : keySet) {
                C26408b bVar = (C26408b) next;
                if (!bVar.mo53396k() && !C24757i.f70614c.contains(bVar)) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C26408b) it.next()).mo53395j());
            }
            return arrayList2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24771q(C22826c cVar, C24980n nVar, C26448e0 e0Var, C26049m mVar, C110828a aVar, C24893h hVar) {
        super(cVar, nVar, e0Var);
        C87412m.m108594g(cVar, "fqName");
        C87412m.m108594g(nVar, "storageManager");
        C87412m.m108594g(e0Var, "module");
        C87412m.m108594g(mVar, TPReportKeys.Common.COMMON_PROTO);
        C87412m.m108594g(aVar, "metadataVersion");
        this.f70655j = aVar;
        this.f70656n = hVar;
        C26062p pVar = mVar.f72681g;
        C87412m.m108593f(pVar, "proto.strings");
        C26055o oVar = mVar.f72682h;
        C87412m.m108593f(oVar, "proto.qualifiedNames");
        C26244d dVar = new C26244d(pVar, oVar);
        this.f70657o = dVar;
        this.f70658p = new C24734b0(mVar, dVar, aVar, new C24772a(this));
        this.f70659q = mVar;
    }

    /* renamed from: I0 */
    public C24755h mo51751I0() {
        return this.f70658p;
    }

    /* renamed from: J0 */
    public void mo51752J0(C24763k kVar) {
        C87412m.m108594g(kVar, "components");
        C26049m mVar = this.f70659q;
        if (mVar != null) {
            this.f70659q = null;
            C26046l lVar = mVar.f72683i;
            C87412m.m108593f(lVar, "proto.`package`");
            C26244d dVar = this.f70657o;
            C110828a aVar = this.f70655j;
            C24893h hVar = this.f70656n;
            this.f70660r = new C24917k(this, lVar, dVar, aVar, hVar, kVar, "scope of " + this, new C24773b(this));
            return;
        }
        throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize".toString());
    }

    /* renamed from: n */
    public C20770i mo51753n() {
        C20770i iVar = this.f70660r;
        if (iVar != null) {
            return iVar;
        }
        C87412m.m108603p("_memberScope");
        throw null;
    }
}
