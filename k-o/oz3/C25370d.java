package oz3;

import b04.C23641a;
import b04.C23643b;
import b04.C23648f;
import b04.C23649g;
import b04.C23650h;
import b04.C23651i;
import b04.C23654k;
import b04.C23655l;
import b04.C23663s;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import gy3.C87412m;
import gz3.C24577a;
import j04.C24742e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import m04.C24980n;
import n04.C25143j0;
import oz3.C25395q;
import sx3.C110818d0;
import sy3.C26237b;
import vz3.C22830f;
import vz3.C26408b;
import w04.C26412a;
import wy3.C26447e;
import wy3.C26448e0;
import wy3.C26458h0;
import wy3.C26463h1;
import wy3.C26510v;
import wy3.C26521y0;
import xy3.C26566c;
import xy3.C26567d;

/* renamed from: oz3.d */
public final class C25370d extends C25356a<C26566c, C23649g<?>> {

    /* renamed from: c */
    public final C26448e0 f71891c;

    /* renamed from: d */
    public final C26458h0 f71892d;

    /* renamed from: e */
    public final C24742e f71893e;

    /* renamed from: oz3.d$a */
    public abstract class C25371a implements C25395q.C25396a {

        /* renamed from: oz3.d$a$a */
        public static final class C25372a implements C25395q.C25396a {

            /* renamed from: a */
            public final /* synthetic */ C25395q.C25396a f71895a;

            /* renamed from: b */
            public final /* synthetic */ C25395q.C25396a f71896b;

            /* renamed from: c */
            public final /* synthetic */ C25371a f71897c;

            /* renamed from: d */
            public final /* synthetic */ C22830f f71898d;

            /* renamed from: e */
            public final /* synthetic */ ArrayList<C26566c> f71899e;

            public C25372a(C25395q.C25396a aVar, C25371a aVar2, C22830f fVar, ArrayList<C26566c> arrayList) {
                this.f71896b = aVar;
                this.f71897c = aVar2;
                this.f71898d = fVar;
                this.f71899e = arrayList;
                this.f71895a = aVar;
            }

            /* renamed from: a */
            public void mo52566a() {
                this.f71896b.mo52566a();
                this.f71897c.mo52565g(this.f71898d, new C23641a((C26566c) C110818d0.m150938j0(this.f71899e)));
            }

            /* renamed from: b */
            public void mo52560b(C22830f fVar, C26408b bVar, C22830f fVar2) {
                C87412m.m108594g(bVar, "enumClassId");
                C87412m.m108594g(fVar2, "enumEntryName");
                this.f71895a.mo52560b(fVar, bVar, fVar2);
            }

            /* renamed from: c */
            public void mo52561c(C22830f fVar, C23648f fVar2) {
                C87412m.m108594g(fVar2, "value");
                this.f71895a.mo52561c(fVar, fVar2);
            }

            /* renamed from: d */
            public void mo52562d(C22830f fVar, Object obj) {
                this.f71895a.mo52562d(fVar, obj);
            }

            /* renamed from: e */
            public C25395q.C25396a mo52563e(C22830f fVar, C26408b bVar) {
                C87412m.m108594g(bVar, "classId");
                return this.f71895a.mo52563e(fVar, bVar);
            }

            /* renamed from: f */
            public C25395q.C25397b mo52564f(C22830f fVar) {
                return this.f71895a.mo52564f(fVar);
            }
        }

        /* renamed from: oz3.d$a$b */
        public static final class C25373b implements C25395q.C25397b {

            /* renamed from: a */
            public final ArrayList<C23649g<?>> f71900a = new ArrayList<>();

            /* renamed from: b */
            public final /* synthetic */ C25370d f71901b;

            /* renamed from: c */
            public final /* synthetic */ C22830f f71902c;

            /* renamed from: d */
            public final /* synthetic */ C25371a f71903d;

            /* renamed from: oz3.d$a$b$a */
            public static final class C25374a implements C25395q.C25396a {

                /* renamed from: a */
                public final /* synthetic */ C25395q.C25396a f71904a;

                /* renamed from: b */
                public final /* synthetic */ C25395q.C25396a f71905b;

                /* renamed from: c */
                public final /* synthetic */ C25373b f71906c;

                /* renamed from: d */
                public final /* synthetic */ ArrayList<C26566c> f71907d;

                public C25374a(C25395q.C25396a aVar, C25373b bVar, ArrayList<C26566c> arrayList) {
                    this.f71905b = aVar;
                    this.f71906c = bVar;
                    this.f71907d = arrayList;
                    this.f71904a = aVar;
                }

                /* renamed from: a */
                public void mo52566a() {
                    this.f71905b.mo52566a();
                    this.f71906c.f71900a.add(new C23641a((C26566c) C110818d0.m150938j0(this.f71907d)));
                }

                /* renamed from: b */
                public void mo52560b(C22830f fVar, C26408b bVar, C22830f fVar2) {
                    C87412m.m108594g(bVar, "enumClassId");
                    C87412m.m108594g(fVar2, "enumEntryName");
                    this.f71904a.mo52560b(fVar, bVar, fVar2);
                }

                /* renamed from: c */
                public void mo52561c(C22830f fVar, C23648f fVar2) {
                    C87412m.m108594g(fVar2, "value");
                    this.f71904a.mo52561c(fVar, fVar2);
                }

                /* renamed from: d */
                public void mo52562d(C22830f fVar, Object obj) {
                    this.f71904a.mo52562d(fVar, obj);
                }

                /* renamed from: e */
                public C25395q.C25396a mo52563e(C22830f fVar, C26408b bVar) {
                    C87412m.m108594g(bVar, "classId");
                    return this.f71904a.mo52563e(fVar, bVar);
                }

                /* renamed from: f */
                public C25395q.C25397b mo52564f(C22830f fVar) {
                    return this.f71904a.mo52564f(fVar);
                }
            }

            public C25373b(C25370d dVar, C22830f fVar, C25371a aVar) {
                this.f71901b = dVar;
                this.f71902c = fVar;
                this.f71903d = aVar;
            }

            /* renamed from: a */
            public void mo52567a() {
                C25371a aVar = this.f71903d;
                C22830f fVar = this.f71902c;
                ArrayList<C23649g<?>> arrayList = this.f71900a;
                C25375b bVar = (C25375b) aVar;
                bVar.getClass();
                C87412m.m108594g(arrayList, "elements");
                if (fVar != null) {
                    C26463h1 b = C24577a.m30756b(fVar, bVar.f71910d);
                    if (b != null) {
                        HashMap<C22830f, C23649g<?>> hashMap = bVar.f71908b;
                        List<T> b2 = C26412a.m34009b(arrayList);
                        C25143j0 type = b.getType();
                        C87412m.m108593f(type, "parameter.type");
                        hashMap.put(fVar, new C23643b(b2, new C23650h(type)));
                    } else if (bVar.f71909c.mo52556s(bVar.f71911e) && C87412m.m108589b(fVar.mo35995b(), "value")) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<C23649g<?>> it = arrayList.iterator();
                        while (it.hasNext()) {
                            C23649g<?> next = it.next();
                            if (next instanceof C23641a) {
                                arrayList2.add(next);
                            }
                        }
                        List<C26566c> list = bVar.f71912f;
                        Iterator it4 = arrayList2.iterator();
                        while (it4.hasNext()) {
                            list.add((C26566c) ((C23641a) it4.next()).f67839a);
                        }
                    }
                }
            }

            /* renamed from: b */
            public void mo52568b(Object obj) {
                this.f71900a.add(C25370d.m32512x(this.f71901b, this.f71902c, obj));
            }

            /* renamed from: c */
            public void mo52569c(C23648f fVar) {
                C87412m.m108594g(fVar, "value");
                this.f71900a.add(new C23663s(fVar));
            }

            /* renamed from: d */
            public void mo52570d(C26408b bVar, C22830f fVar) {
                C87412m.m108594g(bVar, "enumClassId");
                C87412m.m108594g(fVar, "enumEntryName");
                this.f71900a.add(new C23654k(bVar, fVar));
            }

            /* renamed from: e */
            public C25395q.C25396a mo52571e(C26408b bVar) {
                C87412m.m108594g(bVar, "classId");
                ArrayList arrayList = new ArrayList();
                return new C25374a(this.f71901b.mo52557t(bVar, C26521y0.f73808a, arrayList), this, arrayList);
            }
        }

        public C25371a() {
        }

        /* renamed from: b */
        public void mo52560b(C22830f fVar, C26408b bVar, C22830f fVar2) {
            C87412m.m108594g(bVar, "enumClassId");
            C87412m.m108594g(fVar2, "enumEntryName");
            mo52565g(fVar, new C23654k(bVar, fVar2));
        }

        /* renamed from: c */
        public void mo52561c(C22830f fVar, C23648f fVar2) {
            C87412m.m108594g(fVar2, "value");
            mo52565g(fVar, new C23663s(fVar2));
        }

        /* renamed from: d */
        public void mo52562d(C22830f fVar, Object obj) {
            mo52565g(fVar, C25370d.m32512x(C25370d.this, fVar, obj));
        }

        /* renamed from: e */
        public C25395q.C25396a mo52563e(C22830f fVar, C26408b bVar) {
            C87412m.m108594g(bVar, "classId");
            ArrayList arrayList = new ArrayList();
            return new C25372a(C25370d.this.mo52557t(bVar, C26521y0.f73808a, arrayList), this, fVar, arrayList);
        }

        /* renamed from: f */
        public C25395q.C25397b mo52564f(C22830f fVar) {
            return new C25373b(C25370d.this, fVar, this);
        }

        /* renamed from: g */
        public abstract void mo52565g(C22830f fVar, C23649g<?> gVar);
    }

    /* renamed from: oz3.d$b */
    public static final class C25375b extends C25371a {

        /* renamed from: b */
        public final HashMap<C22830f, C23649g<?>> f71908b = new HashMap<>();

        /* renamed from: c */
        public final /* synthetic */ C25370d f71909c;

        /* renamed from: d */
        public final /* synthetic */ C26447e f71910d;

        /* renamed from: e */
        public final /* synthetic */ C26408b f71911e;

        /* renamed from: f */
        public final /* synthetic */ List<C26566c> f71912f;

        /* renamed from: g */
        public final /* synthetic */ C26521y0 f71913g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25375b(C25370d dVar, C26447e eVar, C26408b bVar, List<C26566c> list, C26521y0 y0Var) {
            super();
            this.f71909c = dVar;
            this.f71910d = eVar;
            this.f71911e = bVar;
            this.f71912f = list;
            this.f71913g = y0Var;
        }

        /* renamed from: a */
        public void mo52566a() {
            C25370d dVar = this.f71909c;
            C26408b bVar = this.f71911e;
            HashMap<C22830f, C23649g<?>> hashMap = this.f71908b;
            dVar.getClass();
            C87412m.m108594g(bVar, "annotationClassId");
            C87412m.m108594g(hashMap, "arguments");
            boolean z = false;
            if (C87412m.m108589b(bVar, C26237b.f73137b)) {
                C23649g<?> gVar = hashMap.get(C22830f.m26794f("value"));
                C23663s.C23664a.C23666b bVar2 = null;
                C23663s sVar = gVar instanceof C23663s ? (C23663s) gVar : null;
                if (sVar != null) {
                    T t = sVar.f67839a;
                    if (t instanceof C23663s.C23664a.C23666b) {
                        bVar2 = (C23663s.C23664a.C23666b) t;
                    }
                    if (bVar2 != null) {
                        z = dVar.mo52556s(bVar2.f67853a.f67837a);
                    }
                }
            }
            if (!z && !this.f71909c.mo52556s(this.f71911e)) {
                this.f71912f.add(new C26567d(this.f71910d.mo36111s(), this.f71908b, this.f71913g));
            }
        }

        /* renamed from: g */
        public void mo52565g(C22830f fVar, C23649g<?> gVar) {
            C87412m.m108594g(gVar, "value");
            if (fVar != null) {
                this.f71908b.put(fVar, gVar);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25370d(C26448e0 e0Var, C26458h0 h0Var, C24980n nVar, C25390o oVar) {
        super(nVar, oVar);
        C87412m.m108594g(e0Var, "module");
        C87412m.m108594g(h0Var, "notFoundClasses");
        C87412m.m108594g(nVar, "storageManager");
        C87412m.m108594g(oVar, "kotlinClassFinder");
        this.f71891c = e0Var;
        this.f71892d = h0Var;
        this.f71893e = new C24742e(e0Var, h0Var);
    }

    /* renamed from: x */
    public static final C23649g m32512x(C25370d dVar, C22830f fVar, Object obj) {
        dVar.getClass();
        C23649g<?> b = C23651i.f67841a.mo37200b(obj);
        if (b != null) {
            return b;
        }
        String str = "Unsupported annotation argument: " + fVar;
        C87412m.m108594g(str, StateEvent.Name.MESSAGE);
        return new C23655l.C23656a(str);
    }

    /* renamed from: t */
    public C25395q.C25396a mo52557t(C26408b bVar, C26521y0 y0Var, List<C26566c> list) {
        C87412m.m108594g(bVar, "annotationClassId");
        C87412m.m108594g(y0Var, FirebaseAnalytics.C113379b.SOURCE);
        C87412m.m108594g(list, "result");
        return new C25375b(this, C26510v.m34218c(this.f71891c, bVar, this.f71892d), bVar, list, y0Var);
    }
}
