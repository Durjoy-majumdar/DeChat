package l04;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import ez3.C24473b;
import fy3.C32224a;
import fy3.C32226l;
import g04.C24531d;
import g04.C24538j;
import gy3.C24560g0;
import gy3.C24575y;
import gy3.C87412m;
import gy3.C87413o;
import j04.C24732a0;
import j04.C24766m;
import j04.C24779w;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m04.C21479h;
import m04.C21480i;
import m04.C24959e;
import m04.C24975g;
import m04.C24976j;
import m04.C24979m;
import ny3.C89104m;
import qz3.C26041i;
import qz3.C26052n;
import qz3.C26072r;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C36903g0;
import sx3.C36907w;
import sx3.C48501y0;
import sx3.C64175a0;
import sx3.C64186f0;
import sx3.C77813z;
import sx3.C90363p0;
import vz3.C22830f;
import vz3.C26408b;
import w04.C26412a;
import wy3.C22935h;
import wy3.C26443c1;
import wy3.C26469k;
import wy3.C26504r0;
import wy3.C26520x0;
import xz3.C26583a;
import xz3.C26585b;
import xz3.C26587e;
import xz3.C26607p;
import xz3.C26610r;
import y04.C112349m;
import y04.C112354s;
import y04.C38945o;
import y04.C66483g;
import zz3.C26799k;

/* renamed from: l04.j */
public abstract class C24895j extends C24538j {

    /* renamed from: f */
    public static final /* synthetic */ C89104m<Object>[] f70931f;

    /* renamed from: b */
    public final C24766m f70932b;

    /* renamed from: c */
    public final C24896a f70933c;

    /* renamed from: d */
    public final C21480i f70934d;

    /* renamed from: e */
    public final C24976j f70935e;

    /* renamed from: l04.j$a */
    public interface C24896a {
        /* renamed from: a */
        Collection<C26520x0> mo51909a(C22830f fVar, C24473b bVar);

        /* renamed from: b */
        Collection<C26504r0> mo51910b(C22830f fVar, C24473b bVar);

        /* renamed from: c */
        Set<C22830f> mo51911c();

        /* renamed from: d */
        Set<C22830f> mo51912d();

        /* renamed from: e */
        C26443c1 mo51913e(C22830f fVar);

        /* renamed from: f */
        Set<C22830f> mo51914f();

        /* renamed from: g */
        void mo51915g(Collection<C26469k> collection, C24531d dVar, C32226l<? super C22830f, Boolean> lVar, C24473b bVar);
    }

    /* renamed from: l04.j$b */
    public final class C24897b implements C24896a {

        /* renamed from: o */
        public static final /* synthetic */ C89104m<Object>[] f70936o;

        /* renamed from: a */
        public final List<C26041i> f70937a;

        /* renamed from: b */
        public final List<C26052n> f70938b;

        /* renamed from: c */
        public final List<C26072r> f70939c;

        /* renamed from: d */
        public final C21480i f70940d;

        /* renamed from: e */
        public final C21480i f70941e;

        /* renamed from: f */
        public final C21480i f70942f;

        /* renamed from: g */
        public final C21480i f70943g;

        /* renamed from: h */
        public final C21480i f70944h;

        /* renamed from: i */
        public final C21480i f70945i;

        /* renamed from: j */
        public final C21480i f70946j;

        /* renamed from: k */
        public final C21480i f70947k;

        /* renamed from: l */
        public final C21480i f70948l;

        /* renamed from: m */
        public final C21480i f70949m;

        /* renamed from: n */
        public final /* synthetic */ C24895j f70950n;

        /* renamed from: l04.j$b$a */
        public static final class C24898a extends C87413o implements C32224a<List<? extends C26520x0>> {

            /* renamed from: d */
            public final /* synthetic */ C24897b f70951d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C24898a(C24897b bVar) {
                super(0);
                this.f70951d = bVar;
            }

            public Object invoke() {
                C24897b bVar = this.f70951d;
                List list = (List) C24979m.m31587a(bVar.f70940d, bVar, C24897b.f70936o[0]);
                C24897b bVar2 = this.f70951d;
                Set<C22830f> o = bVar2.f70950n.mo51900o();
                ArrayList arrayList = new ArrayList();
                for (C22830f fVar : o) {
                    C24895j jVar = bVar2.f70950n;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object next : (List) C24979m.m31587a(bVar2.f70940d, bVar2, C24897b.f70936o[0])) {
                        if (C87412m.m108589b(((C26469k) next).getName(), fVar)) {
                            arrayList2.add(next);
                        }
                    }
                    int size = arrayList2.size();
                    jVar.mo51896j(fVar, arrayList2);
                    C64175a0.m75508p(arrayList, arrayList2.subList(size, arrayList2.size()));
                }
                return C110818d0.m150933e0(list, arrayList);
            }
        }

        /* renamed from: l04.j$b$b */
        public static final class C24899b extends C87413o implements C32224a<List<? extends C26504r0>> {

            /* renamed from: d */
            public final /* synthetic */ C24897b f70952d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C24899b(C24897b bVar) {
                super(0);
                this.f70952d = bVar;
            }

            public Object invoke() {
                C24897b bVar = this.f70952d;
                List list = (List) C24979m.m31587a(bVar.f70941e, bVar, C24897b.f70936o[1]);
                C24897b bVar2 = this.f70952d;
                Set<C22830f> p = bVar2.f70950n.mo51901p();
                ArrayList arrayList = new ArrayList();
                for (C22830f fVar : p) {
                    C24895j jVar = bVar2.f70950n;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object next : (List) C24979m.m31587a(bVar2.f70941e, bVar2, C24897b.f70936o[1])) {
                        if (C87412m.m108589b(((C26469k) next).getName(), fVar)) {
                            arrayList2.add(next);
                        }
                    }
                    int size = arrayList2.size();
                    jVar.mo51897k(fVar, arrayList2);
                    C64175a0.m75508p(arrayList, arrayList2.subList(size, arrayList2.size()));
                }
                return C110818d0.m150933e0(list, arrayList);
            }
        }

        /* renamed from: l04.j$b$c */
        public static final class C24900c extends C87413o implements C32224a<List<? extends C26443c1>> {

            /* renamed from: d */
            public final /* synthetic */ C24897b f70953d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C24900c(C24897b bVar) {
                super(0);
                this.f70953d = bVar;
            }

            public Object invoke() {
                C24897b bVar = this.f70953d;
                List<C26072r> list = bVar.f70939c;
                C24895j jVar = bVar.f70950n;
                ArrayList arrayList = new ArrayList();
                for (C26607p pVar : list) {
                    arrayList.add(jVar.f70932b.f70651i.mo51762g((C26072r) pVar));
                }
                return arrayList;
            }
        }

        /* renamed from: l04.j$b$d */
        public static final class C24901d extends C87413o implements C32224a<List<? extends C26520x0>> {

            /* renamed from: d */
            public final /* synthetic */ C24897b f70954d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C24901d(C24897b bVar) {
                super(0);
                this.f70954d = bVar;
            }

            public Object invoke() {
                C24897b bVar = this.f70954d;
                List<C26041i> list = bVar.f70937a;
                C24895j jVar = bVar.f70950n;
                ArrayList arrayList = new ArrayList();
                for (C26607p pVar : list) {
                    C26520x0 e = jVar.f70932b.f70651i.mo51760e((C26041i) pVar);
                    if (!jVar.mo51902r(e)) {
                        e = null;
                    }
                    if (e != null) {
                        arrayList.add(e);
                    }
                }
                return arrayList;
            }
        }

        /* renamed from: l04.j$b$e */
        public static final class C24902e extends C87413o implements C32224a<List<? extends C26504r0>> {

            /* renamed from: d */
            public final /* synthetic */ C24897b f70955d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C24902e(C24897b bVar) {
                super(0);
                this.f70955d = bVar;
            }

            public Object invoke() {
                C24897b bVar = this.f70955d;
                List<C26052n> list = bVar.f70938b;
                C24895j jVar = bVar.f70950n;
                ArrayList arrayList = new ArrayList();
                for (C26607p pVar : list) {
                    arrayList.add(jVar.f70932b.f70651i.mo51761f((C26052n) pVar));
                }
                return arrayList;
            }
        }

        /* renamed from: l04.j$b$f */
        public static final class C24903f extends C87413o implements C32224a<Set<? extends C22830f>> {

            /* renamed from: d */
            public final /* synthetic */ C24897b f70956d;

            /* renamed from: e */
            public final /* synthetic */ C24895j f70957e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C24903f(C24897b bVar, C24895j jVar) {
                super(0);
                this.f70956d = bVar;
                this.f70957e = jVar;
            }

            public Object invoke() {
                C24897b bVar = this.f70956d;
                List<C26041i> list = bVar.f70937a;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                C24895j jVar = bVar.f70950n;
                for (C26607p pVar : list) {
                    linkedHashSet.add(C24732a0.m31110b(jVar.f70932b.f70644b, ((C26041i) pVar).f72626i));
                }
                return C48501y0.m53872g(linkedHashSet, this.f70957e.mo51900o());
            }
        }

        /* renamed from: l04.j$b$g */
        public static final class C24904g extends C87413o implements C32224a<Map<C22830f, ? extends List<? extends C26520x0>>> {

            /* renamed from: d */
            public final /* synthetic */ C24897b f70958d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C24904g(C24897b bVar) {
                super(0);
                this.f70958d = bVar;
            }

            public Object invoke() {
                C24897b bVar = this.f70958d;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object next : (List) C24979m.m31587a(bVar.f70943g, bVar, C24897b.f70936o[3])) {
                    C22830f name = ((C26520x0) next).getName();
                    C87412m.m108593f(name, "it.name");
                    Object obj = linkedHashMap.get(name);
                    if (obj == null) {
                        obj = new ArrayList();
                        linkedHashMap.put(name, obj);
                    }
                    ((List) obj).add(next);
                }
                return linkedHashMap;
            }
        }

        /* renamed from: l04.j$b$h */
        public static final class C24905h extends C87413o implements C32224a<Map<C22830f, ? extends List<? extends C26504r0>>> {

            /* renamed from: d */
            public final /* synthetic */ C24897b f70959d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C24905h(C24897b bVar) {
                super(0);
                this.f70959d = bVar;
            }

            public Object invoke() {
                C24897b bVar = this.f70959d;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object next : (List) C24979m.m31587a(bVar.f70944h, bVar, C24897b.f70936o[4])) {
                    C22830f name = ((C26504r0) next).getName();
                    C87412m.m108593f(name, "it.name");
                    Object obj = linkedHashMap.get(name);
                    if (obj == null) {
                        obj = new ArrayList();
                        linkedHashMap.put(name, obj);
                    }
                    ((List) obj).add(next);
                }
                return linkedHashMap;
            }
        }

        /* renamed from: l04.j$b$i */
        public static final class C24906i extends C87413o implements C32224a<Map<C22830f, ? extends C26443c1>> {

            /* renamed from: d */
            public final /* synthetic */ C24897b f70960d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C24906i(C24897b bVar) {
                super(0);
                this.f70960d = bVar;
            }

            public Object invoke() {
                C24897b bVar = this.f70960d;
                List list = (List) C24979m.m31587a(bVar.f70942f, bVar, C24897b.f70936o[2]);
                int a = C90363p0.m113142a(C36907w.m41090l(list, 10));
                if (a < 16) {
                    a = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(a);
                for (Object next : list) {
                    C22830f name = ((C26443c1) next).getName();
                    C87412m.m108593f(name, "it.name");
                    linkedHashMap.put(name, next);
                }
                return linkedHashMap;
            }
        }

        /* renamed from: l04.j$b$j */
        public static final class C24907j extends C87413o implements C32224a<Set<? extends C22830f>> {

            /* renamed from: d */
            public final /* synthetic */ C24897b f70961d;

            /* renamed from: e */
            public final /* synthetic */ C24895j f70962e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C24907j(C24897b bVar, C24895j jVar) {
                super(0);
                this.f70961d = bVar;
                this.f70962e = jVar;
            }

            public Object invoke() {
                C24897b bVar = this.f70961d;
                List<C26052n> list = bVar.f70938b;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                C24895j jVar = bVar.f70950n;
                for (C26607p pVar : list) {
                    linkedHashSet.add(C24732a0.m31110b(jVar.f70932b.f70644b, ((C26052n) pVar).f72698i));
                }
                return C48501y0.m53872g(linkedHashSet, this.f70962e.mo51901p());
            }
        }

        static {
            Class<C24897b> cls = C24897b.class;
            f70936o = new C89104m[]{C24560g0.m30727c(new C24575y(C24560g0.m30725a(cls), "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;")), C24560g0.m30727c(new C24575y(C24560g0.m30725a(cls), "declaredProperties", "getDeclaredProperties()Ljava/util/List;")), C24560g0.m30727c(new C24575y(C24560g0.m30725a(cls), "allTypeAliases", "getAllTypeAliases()Ljava/util/List;")), C24560g0.m30727c(new C24575y(C24560g0.m30725a(cls), "allFunctions", "getAllFunctions()Ljava/util/List;")), C24560g0.m30727c(new C24575y(C24560g0.m30725a(cls), "allProperties", "getAllProperties()Ljava/util/List;")), C24560g0.m30727c(new C24575y(C24560g0.m30725a(cls), "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;")), C24560g0.m30727c(new C24575y(C24560g0.m30725a(cls), "functionsByName", "getFunctionsByName()Ljava/util/Map;")), C24560g0.m30727c(new C24575y(C24560g0.m30725a(cls), "propertiesByName", "getPropertiesByName()Ljava/util/Map;")), C24560g0.m30727c(new C24575y(C24560g0.m30725a(cls), "functionNames", "getFunctionNames()Ljava/util/Set;")), C24560g0.m30727c(new C24575y(C24560g0.m30725a(cls), "variableNames", "getVariableNames()Ljava/util/Set;"))};
        }

        public C24897b(C24895j jVar, List<C26041i> list, List<C26052n> list2, List<C26072r> list3) {
            C87412m.m108594g(list, "functionList");
            C87412m.m108594g(list2, "propertyList");
            C87412m.m108594g(list3, "typeAliasList");
            this.f70950n = jVar;
            this.f70937a = list;
            this.f70938b = list2;
            this.f70939c = !jVar.f70932b.f70643a.f70624c.mo51748e() ? C64186f0.f181907d : list3;
            this.f70940d = jVar.f70932b.f70643a.f70622a.mo52006g(new C24901d(this));
            this.f70941e = jVar.f70932b.f70643a.f70622a.mo52006g(new C24902e(this));
            this.f70942f = jVar.f70932b.f70643a.f70622a.mo52006g(new C24900c(this));
            this.f70943g = jVar.f70932b.f70643a.f70622a.mo52006g(new C24898a(this));
            this.f70944h = jVar.f70932b.f70643a.f70622a.mo52006g(new C24899b(this));
            this.f70945i = jVar.f70932b.f70643a.f70622a.mo52006g(new C24906i(this));
            this.f70946j = jVar.f70932b.f70643a.f70622a.mo52006g(new C24904g(this));
            this.f70947k = jVar.f70932b.f70643a.f70622a.mo52006g(new C24905h(this));
            this.f70948l = jVar.f70932b.f70643a.f70622a.mo52006g(new C24903f(this, jVar));
            this.f70949m = jVar.f70932b.f70643a.f70622a.mo52006g(new C24907j(this, jVar));
        }

        /* renamed from: a */
        public Collection<C26520x0> mo51909a(C22830f fVar, C24473b bVar) {
            C87412m.m108594g(fVar, "name");
            C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
            if (!mo51911c().contains(fVar)) {
                return C64186f0.f181907d;
            }
            Collection<C26520x0> collection = (Collection) ((Map) C24979m.m31587a(this.f70946j, this, f70936o[6])).get(fVar);
            return collection == null ? C64186f0.f181907d : collection;
        }

        /* renamed from: b */
        public Collection<C26504r0> mo51910b(C22830f fVar, C24473b bVar) {
            C87412m.m108594g(fVar, "name");
            C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
            if (!mo51912d().contains(fVar)) {
                return C64186f0.f181907d;
            }
            Collection<C26504r0> collection = (Collection) ((Map) C24979m.m31587a(this.f70947k, this, f70936o[7])).get(fVar);
            return collection == null ? C64186f0.f181907d : collection;
        }

        /* renamed from: c */
        public Set<C22830f> mo51911c() {
            return (Set) C24979m.m31587a(this.f70948l, this, f70936o[8]);
        }

        /* renamed from: d */
        public Set<C22830f> mo51912d() {
            return (Set) C24979m.m31587a(this.f70949m, this, f70936o[9]);
        }

        /* renamed from: e */
        public C26443c1 mo51913e(C22830f fVar) {
            C87412m.m108594g(fVar, "name");
            return (C26443c1) ((Map) C24979m.m31587a(this.f70945i, this, f70936o[5])).get(fVar);
        }

        /* renamed from: f */
        public Set<C22830f> mo51914f() {
            List<C26072r> list = this.f70939c;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            C24895j jVar = this.f70950n;
            for (C26607p pVar : list) {
                linkedHashSet.add(C24732a0.m31110b(jVar.f70932b.f70644b, ((C26072r) pVar).f72821h));
            }
            return linkedHashSet;
        }

        /* renamed from: g */
        public void mo51915g(Collection<C26469k> collection, C24531d dVar, C32226l<? super C22830f, Boolean> lVar, C24473b bVar) {
            C87412m.m108594g(collection, "result");
            C87412m.m108594g(dVar, "kindFilter");
            C87412m.m108594g(lVar, "nameFilter");
            C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
            if (dVar.mo51213a(C24531d.f70101j)) {
                for (Object next : (List) C24979m.m31587a(this.f70944h, this, f70936o[4])) {
                    C22830f name = ((C26504r0) next).getName();
                    C87412m.m108593f(name, "it.name");
                    if (lVar.invoke(name).booleanValue()) {
                        collection.add(next);
                    }
                }
            }
            if (dVar.mo51213a(C24531d.f70100i)) {
                for (Object next2 : (List) C24979m.m31587a(this.f70943g, this, f70936o[3])) {
                    C22830f name2 = ((C26520x0) next2).getName();
                    C87412m.m108593f(name2, "it.name");
                    if (lVar.invoke(name2).booleanValue()) {
                        collection.add(next2);
                    }
                }
            }
        }
    }

    /* renamed from: l04.j$c */
    public final class C24908c implements C24896a {

        /* renamed from: j */
        public static final /* synthetic */ C89104m<Object>[] f70963j;

        /* renamed from: a */
        public final Map<C22830f, byte[]> f70964a;

        /* renamed from: b */
        public final Map<C22830f, byte[]> f70965b;

        /* renamed from: c */
        public final Map<C22830f, byte[]> f70966c;

        /* renamed from: d */
        public final C24975g<C22830f, Collection<C26520x0>> f70967d;

        /* renamed from: e */
        public final C24975g<C22830f, Collection<C26504r0>> f70968e;

        /* renamed from: f */
        public final C21479h<C22830f, C26443c1> f70969f;

        /* renamed from: g */
        public final C21480i f70970g;

        /* renamed from: h */
        public final C21480i f70971h;

        /* renamed from: i */
        public final /* synthetic */ C24895j f70972i;

        /* renamed from: l04.j$c$a */
        public static final class C24909a extends C87413o implements C32224a {

            /* renamed from: d */
            public final /* synthetic */ C26610r f70973d;

            /* renamed from: e */
            public final /* synthetic */ ByteArrayInputStream f70974e;

            /* renamed from: f */
            public final /* synthetic */ C24895j f70975f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C24909a(C26610r rVar, ByteArrayInputStream byteArrayInputStream, C24895j jVar) {
                super(0);
                this.f70973d = rVar;
                this.f70974e = byteArrayInputStream;
                this.f70975f = jVar;
            }

            public Object invoke() {
                return (C26607p) ((C26585b) this.f70973d).mo53516c(this.f70974e, this.f70975f.f70932b.f70643a.f70637p);
            }
        }

        /* renamed from: l04.j$c$b */
        public static final class C24910b extends C87413o implements C32224a<Set<? extends C22830f>> {

            /* renamed from: d */
            public final /* synthetic */ C24908c f70976d;

            /* renamed from: e */
            public final /* synthetic */ C24895j f70977e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C24910b(C24908c cVar, C24895j jVar) {
                super(0);
                this.f70976d = cVar;
                this.f70977e = jVar;
            }

            public Object invoke() {
                return C48501y0.m53872g(((LinkedHashMap) this.f70976d.f70964a).keySet(), this.f70977e.mo51900o());
            }
        }

        /* renamed from: l04.j$c$c */
        public static final class C24911c extends C87413o implements C32226l<C22830f, Collection<? extends C26520x0>> {

            /* renamed from: d */
            public final /* synthetic */ C24908c f70978d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C24911c(C24908c cVar) {
                super(1);
                this.f70978d = cVar;
            }

            public Object invoke(Object obj) {
                Collection<C26041i> collection;
                C22830f fVar = (C22830f) obj;
                C87412m.m108594g(fVar, LocaleUtil.ITALIAN);
                C24908c cVar = this.f70978d;
                Map<C22830f, byte[]> map = cVar.f70964a;
                C26610r<C26041i> rVar = C26041i.f72621B;
                C87412m.m108593f(rVar, "PARSER");
                C24895j jVar = cVar.f70972i;
                byte[] bArr = (byte[]) ((LinkedHashMap) map).get(fVar);
                if (bArr != null) {
                    C24909a aVar = new C24909a(rVar, new ByteArrayInputStream(bArr), cVar.f70972i);
                    collection = C112354s.m153296s(C112349m.m153279b(new C66483g(aVar, new C38945o(aVar))));
                } else {
                    collection = C64186f0.f181907d;
                }
                ArrayList arrayList = new ArrayList(collection.size());
                for (C26041i iVar : collection) {
                    C24779w wVar = jVar.f70932b.f70651i;
                    C87412m.m108593f(iVar, LocaleUtil.ITALIAN);
                    C26520x0 e = wVar.mo51760e(iVar);
                    if (!jVar.mo51902r(e)) {
                        e = null;
                    }
                    if (e != null) {
                        arrayList.add(e);
                    }
                }
                jVar.mo51896j(fVar, arrayList);
                return C26412a.m34009b(arrayList);
            }
        }

        /* renamed from: l04.j$c$d */
        public static final class C24912d extends C87413o implements C32226l<C22830f, Collection<? extends C26504r0>> {

            /* renamed from: d */
            public final /* synthetic */ C24908c f70979d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C24912d(C24908c cVar) {
                super(1);
                this.f70979d = cVar;
            }

            public Object invoke(Object obj) {
                Collection<C26052n> collection;
                C22830f fVar = (C22830f) obj;
                C87412m.m108594g(fVar, LocaleUtil.ITALIAN);
                C24908c cVar = this.f70979d;
                Map<C22830f, byte[]> map = cVar.f70965b;
                C26610r<C26052n> rVar = C26052n.f72693B;
                C87412m.m108593f(rVar, "PARSER");
                C24895j jVar = cVar.f70972i;
                byte[] bArr = (byte[]) ((LinkedHashMap) map).get(fVar);
                if (bArr != null) {
                    C24909a aVar = new C24909a(rVar, new ByteArrayInputStream(bArr), cVar.f70972i);
                    collection = C112354s.m153296s(C112349m.m153279b(new C66483g(aVar, new C38945o(aVar))));
                } else {
                    collection = C64186f0.f181907d;
                }
                ArrayList arrayList = new ArrayList(collection.size());
                for (C26052n nVar : collection) {
                    C24779w wVar = jVar.f70932b.f70651i;
                    C87412m.m108593f(nVar, LocaleUtil.ITALIAN);
                    arrayList.add(wVar.mo51761f(nVar));
                }
                jVar.mo51897k(fVar, arrayList);
                return C26412a.m34009b(arrayList);
            }
        }

        /* renamed from: l04.j$c$e */
        public static final class C24913e extends C87413o implements C32226l<C22830f, C26443c1> {

            /* renamed from: d */
            public final /* synthetic */ C24908c f70980d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C24913e(C24908c cVar) {
                super(1);
                this.f70980d = cVar;
            }

            public Object invoke(Object obj) {
                C22830f fVar = (C22830f) obj;
                C87412m.m108594g(fVar, LocaleUtil.ITALIAN);
                C24908c cVar = this.f70980d;
                byte[] bArr = cVar.f70966c.get(fVar);
                if (bArr == null) {
                    return null;
                }
                C26072r rVar = (C26072r) ((C26585b) C26072r.f72817v).mo53516c(new ByteArrayInputStream(bArr), cVar.f70972i.f70932b.f70643a.f70637p);
                if (rVar == null) {
                    return null;
                }
                return cVar.f70972i.f70932b.f70651i.mo51762g(rVar);
            }
        }

        /* renamed from: l04.j$c$f */
        public static final class C24914f extends C87413o implements C32224a<Set<? extends C22830f>> {

            /* renamed from: d */
            public final /* synthetic */ C24908c f70981d;

            /* renamed from: e */
            public final /* synthetic */ C24895j f70982e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C24914f(C24908c cVar, C24895j jVar) {
                super(0);
                this.f70981d = cVar;
                this.f70982e = jVar;
            }

            public Object invoke() {
                return C48501y0.m53872g(((LinkedHashMap) this.f70981d.f70965b).keySet(), this.f70982e.mo51901p());
            }
        }

        static {
            Class<C24908c> cls = C24908c.class;
            f70963j = new C89104m[]{C24560g0.m30727c(new C24575y(C24560g0.m30725a(cls), "functionNames", "getFunctionNames()Ljava/util/Set;")), C24560g0.m30727c(new C24575y(C24560g0.m30725a(cls), "variableNames", "getVariableNames()Ljava/util/Set;"))};
        }

        public C24908c(C24895j jVar, List<C26041i> list, List<C26052n> list2, List<C26072r> list3) {
            Map<C22830f, byte[]> map;
            C87412m.m108594g(list, "functionList");
            C87412m.m108594g(list2, "propertyList");
            C87412m.m108594g(list3, "typeAliasList");
            this.f70972i = jVar;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (T next : list) {
                C22830f b = C24732a0.m31110b(jVar.f70932b.f70644b, ((C26041i) ((C26607p) next)).f72626i);
                Object obj = linkedHashMap.get(b);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(b, obj);
                }
                ((List) obj).add(next);
            }
            this.f70964a = mo51916h(linkedHashMap);
            C24895j jVar2 = this.f70972i;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (T next2 : list2) {
                C22830f b2 = C24732a0.m31110b(jVar2.f70932b.f70644b, ((C26052n) ((C26607p) next2)).f72698i);
                Object obj2 = linkedHashMap2.get(b2);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap2.put(b2, obj2);
                }
                ((List) obj2).add(next2);
            }
            this.f70965b = mo51916h(linkedHashMap2);
            if (this.f70972i.f70932b.f70643a.f70624c.mo51748e()) {
                C24895j jVar3 = this.f70972i;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (T next3 : list3) {
                    C22830f b3 = C24732a0.m31110b(jVar3.f70932b.f70644b, ((C26072r) ((C26607p) next3)).f72821h);
                    Object obj3 = linkedHashMap3.get(b3);
                    if (obj3 == null) {
                        obj3 = new ArrayList();
                        linkedHashMap3.put(b3, obj3);
                    }
                    ((List) obj3).add(next3);
                }
                map = mo51916h(linkedHashMap3);
            } else {
                map = C36903g0.f97931d;
            }
            this.f70966c = map;
            this.f70967d = this.f70972i.f70932b.f70643a.f70622a.mo52007h(new C24911c(this));
            this.f70968e = this.f70972i.f70932b.f70643a.f70622a.mo52007h(new C24912d(this));
            this.f70969f = this.f70972i.f70932b.f70643a.f70622a.mo52004e(new C24913e(this));
            C24895j jVar4 = this.f70972i;
            this.f70970g = jVar4.f70932b.f70643a.f70622a.mo52006g(new C24910b(this, jVar4));
            C24895j jVar5 = this.f70972i;
            this.f70971h = jVar5.f70932b.f70643a.f70622a.mo52006g(new C24914f(this, jVar5));
        }

        /* renamed from: a */
        public Collection<C26520x0> mo51909a(C22830f fVar, C24473b bVar) {
            C87412m.m108594g(fVar, "name");
            C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
            return !mo51911c().contains(fVar) ? C64186f0.f181907d : (Collection) ((C24959e.C24972m) this.f70967d).invoke(fVar);
        }

        /* renamed from: b */
        public Collection<C26504r0> mo51910b(C22830f fVar, C24473b bVar) {
            C87412m.m108594g(fVar, "name");
            C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
            return !mo51912d().contains(fVar) ? C64186f0.f181907d : (Collection) ((C24959e.C24972m) this.f70968e).invoke(fVar);
        }

        /* renamed from: c */
        public Set<C22830f> mo51911c() {
            return (Set) C24979m.m31587a(this.f70970g, this, f70963j[0]);
        }

        /* renamed from: d */
        public Set<C22830f> mo51912d() {
            return (Set) C24979m.m31587a(this.f70971h, this, f70963j[1]);
        }

        /* renamed from: e */
        public C26443c1 mo51913e(C22830f fVar) {
            C87412m.m108594g(fVar, "name");
            return this.f70969f.invoke(fVar);
        }

        /* renamed from: f */
        public Set<C22830f> mo51914f() {
            return this.f70966c.keySet();
        }

        /* renamed from: g */
        public void mo51915g(Collection<C26469k> collection, C24531d dVar, C32226l<? super C22830f, Boolean> lVar, C24473b bVar) {
            C87412m.m108594g(collection, "result");
            C87412m.m108594g(dVar, "kindFilter");
            C87412m.m108594g(lVar, "nameFilter");
            C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
            C24531d.C24532a aVar = C24531d.f70094c;
            if (dVar.mo51213a(C24531d.f70101j)) {
                Set<C22830f> d = mo51912d();
                ArrayList arrayList = new ArrayList();
                for (C22830f next : d) {
                    if (lVar.invoke(next).booleanValue()) {
                        arrayList.addAll(mo51910b(next, bVar));
                    }
                }
                C77813z.m93909o(arrayList, C26799k.f74532d);
                collection.addAll(arrayList);
            }
            C24531d.C24532a aVar2 = C24531d.f70094c;
            if (dVar.mo51213a(C24531d.f70100i)) {
                Set<C22830f> c = mo51911c();
                ArrayList arrayList2 = new ArrayList();
                for (C22830f next2 : c) {
                    if (lVar.invoke(next2).booleanValue()) {
                        arrayList2.addAll(mo51909a(next2, bVar));
                    }
                }
                C77813z.m93909o(arrayList2, C26799k.f74532d);
                collection.addAll(arrayList2);
            }
        }

        /* renamed from: h */
        public final Map<C22830f, byte[]> mo51916h(Map<C22830f, ? extends Collection<? extends C26583a>> map) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C90363p0.m113142a(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable<C26583a> iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(C36907w.m41090l(iterable, 10));
                for (C26583a aVar : iterable) {
                    int serializedSize = aVar.getSerializedSize();
                    int f = C26587e.m34409f(serializedSize) + serializedSize;
                    if (f > 4096) {
                        f = 4096;
                    }
                    C26587e j = C26587e.m34412j(byteArrayOutputStream, f);
                    j.mo53548v(serializedSize);
                    aVar.mo52855a(j);
                    j.mo53536i();
                    arrayList.add(C13598b0.f38549a);
                }
                linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap;
        }
    }

    /* renamed from: l04.j$d */
    public static final class C24915d extends C87413o implements C32224a<Set<? extends C22830f>> {

        /* renamed from: d */
        public final /* synthetic */ C32224a<Collection<C22830f>> f70983d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24915d(C32224a<? extends Collection<C22830f>> aVar) {
            super(0);
            this.f70983d = aVar;
        }

        public Object invoke() {
            return C110818d0.m150904D0(this.f70983d.invoke());
        }
    }

    /* renamed from: l04.j$e */
    public static final class C24916e extends C87413o implements C32224a<Set<? extends C22830f>> {

        /* renamed from: d */
        public final /* synthetic */ C24895j f70984d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24916e(C24895j jVar) {
            super(0);
            this.f70984d = jVar;
        }

        public Object invoke() {
            Set<C22830f> n = this.f70984d.mo51899n();
            if (n == null) {
                return null;
            }
            return C48501y0.m53872g(C48501y0.m53872g(this.f70984d.mo51907m(), this.f70984d.f70933c.mo51914f()), n);
        }
    }

    static {
        Class<C24895j> cls = C24895j.class;
        f70931f = new C89104m[]{C24560g0.m30727c(new C24575y(C24560g0.m30725a(cls), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), C24560g0.m30727c(new C24575y(C24560g0.m30725a(cls), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};
    }

    public C24895j(C24766m mVar, List<C26041i> list, List<C26052n> list2, List<C26072r> list3, C32224a<? extends Collection<C22830f>> aVar) {
        C87412m.m108594g(mVar, "c");
        C87412m.m108594g(list, "functionList");
        C87412m.m108594g(list2, "propertyList");
        C87412m.m108594g(list3, "typeAliasList");
        C87412m.m108594g(aVar, "classNames");
        this.f70932b = mVar;
        this.f70933c = mVar.f70643a.f70624c.mo51744a() ? new C24897b(this, list, list2, list3) : new C24908c(this, list, list2, list3);
        this.f70934d = mVar.f70643a.f70622a.mo52006g(new C24915d(aVar));
        this.f70935e = mVar.f70643a.f70622a.mo52005f(new C24916e(this));
    }

    /* renamed from: a */
    public Collection<C26520x0> mo32456a(C22830f fVar, C24473b bVar) {
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
        return this.f70933c.mo51909a(fVar, bVar);
    }

    /* renamed from: b */
    public Collection<C26504r0> mo32457b(C22830f fVar, C24473b bVar) {
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
        return this.f70933c.mo51910b(fVar, bVar);
    }

    /* renamed from: c */
    public Set<C22830f> mo32458c() {
        return this.f70933c.mo51911c();
    }

    /* renamed from: d */
    public Set<C22830f> mo32459d() {
        return this.f70933c.mo51912d();
    }

    /* renamed from: f */
    public Set<C22830f> mo32461f() {
        C24976j jVar = this.f70935e;
        C89104m<Object> mVar = f70931f[1];
        C87412m.m108594g(jVar, "<this>");
        C87412m.m108594g(mVar, "p");
        return (Set) jVar.invoke();
    }

    /* renamed from: g */
    public C22935h mo32462g(C22830f fVar, C24473b bVar) {
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
        if (mo51908q(fVar)) {
            return this.f70932b.f70643a.mo51743b(mo51898l(fVar));
        }
        if (this.f70933c.mo51914f().contains(fVar)) {
            return this.f70933c.mo51913e(fVar);
        }
        return null;
    }

    /* renamed from: h */
    public abstract void mo51895h(Collection<C26469k> collection, C32226l<? super C22830f, Boolean> lVar);

    /* renamed from: i */
    public final Collection<C26469k> mo51906i(C24531d dVar, C32226l<? super C22830f, Boolean> lVar, C24473b bVar) {
        C87412m.m108594g(dVar, "kindFilter");
        C87412m.m108594g(lVar, "nameFilter");
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
        ArrayList arrayList = new ArrayList(0);
        if (dVar.mo51213a(C24531d.f70097f)) {
            mo51895h(arrayList, lVar);
        }
        this.f70933c.mo51915g(arrayList, dVar, lVar, bVar);
        if (dVar.mo51213a(C24531d.f70103l)) {
            for (C22830f next : mo51907m()) {
                if (lVar.invoke(next).booleanValue()) {
                    C26412a.m34008a(arrayList, this.f70932b.f70643a.mo51743b(mo51898l(next)));
                }
            }
        }
        if (dVar.mo51213a(C24531d.f70098g)) {
            for (C22830f next2 : this.f70933c.mo51914f()) {
                if (lVar.invoke(next2).booleanValue()) {
                    C26412a.m34008a(arrayList, this.f70933c.mo51913e(next2));
                }
            }
        }
        return C26412a.m34009b(arrayList);
    }

    /* renamed from: j */
    public void mo51896j(C22830f fVar, List<C26520x0> list) {
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(list, "functions");
    }

    /* renamed from: k */
    public void mo51897k(C22830f fVar, List<C26504r0> list) {
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(list, "descriptors");
    }

    /* renamed from: l */
    public abstract C26408b mo51898l(C22830f fVar);

    /* renamed from: m */
    public final Set<C22830f> mo51907m() {
        return (Set) C24979m.m31587a(this.f70934d, this, f70931f[0]);
    }

    /* renamed from: n */
    public abstract Set<C22830f> mo51899n();

    /* renamed from: o */
    public abstract Set<C22830f> mo51900o();

    /* renamed from: p */
    public abstract Set<C22830f> mo51901p();

    /* renamed from: q */
    public boolean mo51908q(C22830f fVar) {
        C87412m.m108594g(fVar, "name");
        return mo51907m().contains(fVar);
    }

    /* renamed from: r */
    public boolean mo51902r(C26520x0 x0Var) {
        C87412m.m108594g(x0Var, "function");
        return true;
    }
}
