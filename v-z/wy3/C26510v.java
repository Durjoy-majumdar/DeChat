package wy3;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import ez3.C24476d;
import fy3.C32226l;
import g04.C20770i;
import gy3.C24560g0;
import gy3.C24563k;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.List;
import ny3.C109824f;
import sx3.C110818d0;
import vz3.C22826c;
import vz3.C22830f;
import vz3.C26408b;
import y04.C112349m;
import y04.C112354s;
import zz3.C26811u;
import zz3.C26812v;

/* renamed from: wy3.v */
public final class C26510v {

    /* renamed from: wy3.v$a */
    public /* synthetic */ class C26511a extends C24563k implements C32226l<C26408b, C26408b> {

        /* renamed from: d */
        public static final C26511a f73795d = new C26511a();

        public C26511a() {
            super(1);
        }

        public final String getName() {
            return "getOuterClassId";
        }

        public final C109824f getOwner() {
            return C24560g0.m30725a(C26408b.class);
        }

        public final String getSignature() {
            return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
        }

        public Object invoke(Object obj) {
            C26408b bVar = (C26408b) obj;
            C87412m.m108594g(bVar, "p0");
            return bVar.mo53391g();
        }
    }

    /* renamed from: wy3.v$b */
    public static final class C26512b extends C87413o implements C32226l<C26408b, Integer> {

        /* renamed from: d */
        public static final C26512b f73796d = new C26512b();

        public C26512b() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C26408b) obj, LocaleUtil.ITALIAN);
            return 0;
        }
    }

    /* renamed from: a */
    public static final C26447e m34216a(C26448e0 e0Var, C26408b bVar) {
        C87412m.m108594g(e0Var, "<this>");
        C87412m.m108594g(bVar, "classId");
        C22935h b = m34217b(e0Var, bVar);
        if (b instanceof C26447e) {
            return (C26447e) b;
        }
        return null;
    }

    /* renamed from: b */
    public static final C22935h m34217b(C26448e0 e0Var, C26408b bVar) {
        C22935h hVar;
        C24476d dVar = C24476d.FROM_DESERIALIZATION;
        C87412m.m108594g(e0Var, "<this>");
        C87412m.m108594g(bVar, "classId");
        C26811u uVar = (C26811u) e0Var.mo52619J(C26812v.f74555a);
        C26448e0 a = uVar != null ? uVar.mo53769a(e0Var) : null;
        if (a == null) {
            C22826c h = bVar.mo53392h();
            C87412m.m108593f(h, "classId.packageFqName");
            C26484n0 b0 = e0Var.mo52620b0(h);
            List<C22830f> g = bVar.mo53394i().f65628a.mo35990g();
            if (g != null) {
                C20770i n = b0.mo53462n();
                Object L = C110818d0.m150914L(g);
                C87412m.m108593f(L, "segments.first()");
                hVar = n.mo32462g((C22830f) L, dVar);
                if (hVar == null) {
                    return null;
                }
                for (C22830f next : g.subList(1, g.size())) {
                    if (!(hVar instanceof C26447e)) {
                        return null;
                    }
                    C20770i f0 = ((C26447e) hVar).mo51797f0();
                    C87412m.m108593f(next, "name");
                    C22935h g2 = f0.mo32462g(next, dVar);
                    if (g2 instanceof C26447e) {
                        hVar = (C26447e) g2;
                        continue;
                    } else {
                        hVar = null;
                        continue;
                    }
                    if (hVar == null) {
                        return null;
                    }
                }
            } else {
                C22826c.m26772a(11);
                throw null;
            }
        } else {
            C22826c h2 = bVar.mo53392h();
            C87412m.m108593f(h2, "classId.packageFqName");
            C26484n0 b05 = a.mo52620b0(h2);
            List<C22830f> g3 = bVar.mo53394i().f65628a.mo35990g();
            if (g3 != null) {
                C20770i n2 = b05.mo53462n();
                Object L2 = C110818d0.m150914L(g3);
                C87412m.m108593f(L2, "segments.first()");
                C22935h g4 = n2.mo32462g((C22830f) L2, dVar);
                if (g4 != null) {
                    Iterator<C22830f> it = g3.subList(1, g3.size()).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C22830f next2 = it.next();
                        if (g4 instanceof C26447e) {
                            C20770i f05 = ((C26447e) g4).mo51797f0();
                            C87412m.m108593f(next2, "name");
                            C22935h g5 = f05.mo32462g(next2, dVar);
                            if (g5 instanceof C26447e) {
                                g4 = (C26447e) g5;
                                continue;
                            } else {
                                g4 = null;
                                continue;
                            }
                            if (g4 == null) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                g4 = null;
                if (g4 != null) {
                    return g4;
                }
                C22826c h3 = bVar.mo53392h();
                C87412m.m108593f(h3, "classId.packageFqName");
                C26484n0 b06 = e0Var.mo52620b0(h3);
                List<C22830f> g6 = bVar.mo53394i().f65628a.mo35990g();
                if (g6 != null) {
                    C20770i n3 = b06.mo53462n();
                    Object L3 = C110818d0.m150914L(g6);
                    C87412m.m108593f(L3, "segments.first()");
                    C22935h g7 = n3.mo32462g((C22830f) L3, dVar);
                    if (g7 == null) {
                        return null;
                    }
                    for (C22830f next3 : g6.subList(1, g6.size())) {
                        if (!(hVar instanceof C26447e)) {
                            return null;
                        }
                        C20770i f06 = ((C26447e) hVar).mo51797f0();
                        C87412m.m108593f(next3, "name");
                        C22935h g8 = f06.mo32462g(next3, dVar);
                        if (g8 instanceof C26447e) {
                            g7 = (C26447e) g8;
                            continue;
                        } else {
                            g7 = null;
                            continue;
                        }
                        if (g7 == null) {
                            return null;
                        }
                    }
                } else {
                    C22826c.m26772a(11);
                    throw null;
                }
            } else {
                C22826c.m26772a(11);
                throw null;
            }
        }
        return hVar;
    }

    /* renamed from: c */
    public static final C26447e m34218c(C26448e0 e0Var, C26408b bVar, C26458h0 h0Var) {
        C87412m.m108594g(e0Var, "<this>");
        C87412m.m108594g(bVar, "classId");
        C87412m.m108594g(h0Var, "notFoundClasses");
        C26447e a = m34216a(e0Var, bVar);
        return a != null ? a : h0Var.mo53433a(bVar, C112354s.m153296s(C112354s.m153290m(C112349m.m153281d(bVar, C26511a.f73795d), C26512b.f73796d)));
    }
}
