package jz3;

import com.tencent.xweb.file.XVFSFile;
import e04.C24469d;
import fy3.C32224a;
import g04.C20770i;
import gy3.C24560g0;
import gy3.C24575y;
import gy3.C87412m;
import gy3.C87413o;
import iz3.C24641b;
import iz3.C24648f;
import iz3.C24651h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m04.C21480i;
import m04.C24979m;
import mz3.C25068t;
import mz3.C25073y;
import ny3.C89104m;
import oz3.C117906w;
import oz3.C25394p;
import oz3.C25395q;
import oz3.C25401r;
import pz3.C25505a;
import rx3.C13604l;
import sx3.C36907w;
import sx3.C64186f0;
import sx3.C90364q0;
import vz3.C22826c;
import vz3.C26408b;
import wy3.C26521y0;
import xy3.C26571h;
import zy3.C26733d0;

/* renamed from: jz3.j */
public final class C24821j extends C26733d0 {

    /* renamed from: s */
    public static final /* synthetic */ C89104m<Object>[] f70772s;

    /* renamed from: j */
    public final C25068t f70773j;

    /* renamed from: n */
    public final C24651h f70774n;

    /* renamed from: o */
    public final C21480i f70775o;

    /* renamed from: p */
    public final C24797d f70776p;

    /* renamed from: q */
    public final C21480i<List<C22826c>> f70777q;

    /* renamed from: r */
    public final C26571h f70778r;

    /* renamed from: jz3.j$a */
    public static final class C24822a extends C87413o implements C32224a<Map<String, ? extends C25395q>> {

        /* renamed from: d */
        public final /* synthetic */ C24821j f70779d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24822a(C24821j jVar) {
            super(0);
            this.f70779d = jVar;
        }

        public Object invoke() {
            C24821j jVar = this.f70779d;
            C117906w wVar = jVar.f70774n.f70290a.f70267l;
            String b = jVar.f74328h.mo35973b();
            C87412m.m108593f(b, "fqName.asString()");
            List<String> a = wVar.mo182653a(b);
            C24821j jVar2 = this.f70779d;
            ArrayList arrayList = new ArrayList();
            for (String str : a) {
                C25395q a2 = C25394p.m32569a(jVar2.f70774n.f70290a.f70258c, C26408b.m33992l(new C22826c(C24469d.m30614d(str).f69986a.replace(XVFSFile.SEPARATOR_CHAR, '.'))));
                C13604l lVar = a2 != null ? new C13604l(str, a2) : null;
                if (lVar != null) {
                    arrayList.add(lVar);
                }
            }
            return C90364q0.m113152k(arrayList);
        }
    }

    /* renamed from: jz3.j$b */
    public static final class C24823b extends C87413o implements C32224a<HashMap<C24469d, C24469d>> {

        /* renamed from: d */
        public final /* synthetic */ C24821j f70780d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24823b(C24821j jVar) {
            super(0);
            this.f70780d = jVar;
        }

        public Object invoke() {
            HashMap hashMap = new HashMap();
            C24821j jVar = this.f70780d;
            for (Map.Entry entry : ((Map) C24979m.m31587a(jVar.f70775o, jVar, C24821j.f70772s[0])).entrySet()) {
                C24469d d = C24469d.m30614d((String) entry.getKey());
                C25505a b = ((C25395q) entry.getValue()).mo37224b();
                int ordinal = b.f72189a.ordinal();
                if (ordinal == 2) {
                    hashMap.put(d, d);
                } else if (ordinal == 5) {
                    String str = b.f72194f;
                    if (!(b.f72189a == C25505a.C25506a.MULTIFILE_CLASS_PART)) {
                        str = null;
                    }
                    if (str != null) {
                        hashMap.put(d, C24469d.m30614d(str));
                    }
                }
            }
            return hashMap;
        }
    }

    /* renamed from: jz3.j$c */
    public static final class C24824c extends C87413o implements C32224a<List<? extends C22826c>> {

        /* renamed from: d */
        public final /* synthetic */ C24821j f70781d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24824c(C24821j jVar) {
            super(0);
            this.f70781d = jVar;
        }

        public Object invoke() {
            Collection<C25068t> k = this.f70781d.f70773j.mo51051k();
            ArrayList arrayList = new ArrayList(C36907w.m41090l(k, 10));
            for (C25068t d : k) {
                arrayList.add(d.mo51048d());
            }
            return arrayList;
        }
    }

    static {
        Class<C24821j> cls = C24821j.class;
        f70772s = new C89104m[]{C24560g0.m30727c(new C24575y(C24560g0.m30725a(cls), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), C24560g0.m30727c(new C24575y(C24560g0.m30725a(cls), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24821j(C24651h hVar, C25068t tVar) {
        super(hVar.f70290a.f70270o, tVar.mo51048d());
        C26571h hVar2;
        C87412m.m108594g(hVar, "outerContext");
        C87412m.m108594g(tVar, "jPackage");
        this.f70773j = tVar;
        C24651h a = C24641b.m30819a(hVar, this, (C25073y) null, 0, 6, (Object) null);
        this.f70774n = a;
        this.f70775o = a.f70290a.f70256a.mo52006g(new C24822a(this));
        this.f70776p = new C24797d(a, tVar, this);
        this.f70777q = a.f70290a.f70256a.mo52001b(new C24824c(this), C64186f0.f181907d);
        if (a.f70290a.f70277v.f70004c) {
            int i = C26571h.f73936P0;
            hVar2 = C26571h.C26572a.f73937a;
        } else {
            hVar2 = C24648f.m30829a(a, tVar);
        }
        this.f70778r = hVar2;
        a.f70290a.f70256a.mo52006g(new C24823b(this));
    }

    public C26571h getAnnotations() {
        return this.f70778r;
    }

    public C26521y0 getSource() {
        return new C25401r(this);
    }

    /* renamed from: n */
    public C20770i mo51753n() {
        return this.f70776p;
    }

    public String toString() {
        return "Lazy Java package fragment: " + this.f74328h + " of module " + this.f70774n.f70290a.f70270o;
    }
}
