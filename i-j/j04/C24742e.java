package j04;

import b04.C23641a;
import b04.C23642a0;
import b04.C23643b;
import b04.C23645c;
import b04.C23646d;
import b04.C23647e;
import b04.C23649g;
import b04.C23653j;
import b04.C23654k;
import b04.C23655l;
import b04.C23657m;
import b04.C23658n;
import b04.C23663s;
import b04.C23667t;
import b04.C23669v;
import b04.C23670w;
import b04.C23671x;
import b04.C23672y;
import b04.C23673z;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import my3.C34690i;
import my3.C61594j;
import n04.C25143j0;
import n04.C25176s0;
import p04.C25417j;
import qz3.C26009b;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C36903g0;
import sx3.C36904l0;
import sx3.C36907w;
import sx3.C64197v;
import sx3.C90363p0;
import sx3.C90364q0;
import sz3.C26238b;
import sz3.C26243c;
import ty3.C26336h;
import ty3.C26343l;
import vz3.C22830f;
import wy3.C22935h;
import wy3.C26444d;
import wy3.C26447e;
import wy3.C26448e0;
import wy3.C26453f;
import wy3.C26458h0;
import wy3.C26463h1;
import wy3.C26510v;
import wy3.C26521y0;
import xy3.C26566c;
import xy3.C26567d;
import zz3.C26794h;

/* renamed from: j04.e */
public final class C24742e {

    /* renamed from: a */
    public final C26448e0 f70590a;

    /* renamed from: b */
    public final C26458h0 f70591b;

    /* renamed from: j04.e$a */
    public /* synthetic */ class C24743a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f70592a;

        static {
            int[] iArr = new int[C26009b.C26011b.C26014c.C26017c.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
            iArr[3] = 4;
            iArr[4] = 5;
            iArr[5] = 6;
            iArr[6] = 7;
            iArr[7] = 8;
            iArr[8] = 9;
            iArr[9] = 10;
            iArr[10] = 11;
            iArr[11] = 12;
            iArr[12] = 13;
            f70592a = iArr;
        }
    }

    public C24742e(C26448e0 e0Var, C26458h0 h0Var) {
        C87412m.m108594g(e0Var, "module");
        C87412m.m108594g(h0Var, "notFoundClasses");
        this.f70590a = e0Var;
        this.f70591b = h0Var;
    }

    /* renamed from: a */
    public final C26566c mo51725a(C26009b bVar, C26243c cVar) {
        C87412m.m108594g(bVar, TPReportKeys.Common.COMMON_PROTO);
        C87412m.m108594g(cVar, "nameResolver");
        C26447e c = C26510v.m34218c(this.f70590a, C24732a0.m31109a(cVar, bVar.f72409f), this.f70591b);
        Map map = C36903g0.f97931d;
        if (bVar.f72410g.size() != 0 && !C25417j.m32699f(c) && C26794h.m35227o(c, C26453f.ANNOTATION_CLASS)) {
            Collection<C26444d> q = c.mo51804q();
            C87412m.m108593f(q, "annotationClass.constructors");
            C26444d dVar = (C26444d) C110818d0.m150939k0(q);
            if (dVar != null) {
                List<C26463h1> h = dVar.mo52639h();
                C87412m.m108593f(h, "constructor.valueParameters");
                int a = C90363p0.m113142a(C36907w.m41090l(h, 10));
                if (a < 16) {
                    a = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(a);
                for (T next : h) {
                    linkedHashMap.put(((C26463h1) next).getName(), next);
                }
                List<C26009b.C26011b> list = bVar.f72410g;
                C87412m.m108593f(list, "proto.argumentList");
                ArrayList arrayList = new ArrayList();
                for (C26009b.C26011b bVar2 : list) {
                    C87412m.m108593f(bVar2, LocaleUtil.ITALIAN);
                    C26463h1 h1Var = (C26463h1) linkedHashMap.get(C24732a0.m31110b(cVar, bVar2.f72417f));
                    C23649g<?> gVar = null;
                    if (h1Var != null) {
                        C22830f b = C24732a0.m31110b(cVar, bVar2.f72417f);
                        C25143j0 type = h1Var.getType();
                        C87412m.m108593f(type, "parameter.type");
                        C26009b.C26011b.C26014c cVar2 = bVar2.f72418g;
                        C87412m.m108593f(cVar2, "proto.value");
                        C23649g<?> c2 = mo51727c(type, cVar2, cVar);
                        if (mo51726b(c2, type, cVar2)) {
                            gVar = c2;
                        }
                        if (gVar == null) {
                            String str = "Unexpected argument value: actual type " + cVar2.f72428f + " != expected type " + type;
                            C87412m.m108594g(str, StateEvent.Name.MESSAGE);
                            gVar = new C23655l.C23656a(str);
                        }
                        gVar = new C13604l<>(b, gVar);
                    }
                    if (gVar != null) {
                        arrayList.add(gVar);
                    }
                }
                map = C90364q0.m113152k(arrayList);
            }
        }
        return new C26567d(c.mo36111s(), map, C26521y0.f73808a);
    }

    /* renamed from: b */
    public final boolean mo51726b(C23649g<?> gVar, C25143j0 j0Var, C26009b.C26011b.C26014c cVar) {
        C26009b.C26011b.C26014c.C26017c cVar2 = cVar.f72428f;
        int i = cVar2 == null ? -1 : C24743a.f70592a[cVar2.ordinal()];
        if (i == 10) {
            C22935h o = j0Var.mo37081K0().mo37094o();
            C26447e eVar = o instanceof C26447e ? (C26447e) o : null;
            if (eVar == null) {
                return true;
            }
            C22830f fVar = C26336h.f73354e;
            if (C26336h.m33838c(eVar, C26343l.C26344a.f73397Q)) {
                return true;
            }
        } else if (i != 13) {
            return C87412m.m108589b(gVar.mo37191a(this.f70590a), j0Var);
        } else {
            if ((gVar instanceof C23643b) && ((List) ((C23643b) gVar).f67839a).size() == cVar.f72436q.size()) {
                C25143j0 g = this.f70590a.mo52623m().mo53315g(j0Var);
                C87412m.m108593f(g, "builtIns.getArrayElementType(expectedType)");
                C23643b bVar = (C23643b) gVar;
                C61594j d = C64197v.m75535d((Collection) bVar.f67839a);
                if ((d instanceof Collection) && ((Collection) d).isEmpty()) {
                    return true;
                }
                C36904l0 i2 = d.iterator();
                while (((C34690i) i2).f93287f) {
                    int a = i2.mo59695a();
                    C26009b.C26011b.C26014c cVar3 = cVar.f72436q.get(a);
                    C87412m.m108593f(cVar3, "value.getArrayElement(i)");
                    if (!mo51726b((C23649g) ((List) bVar.f67839a).get(a), g, cVar3)) {
                    }
                }
                return true;
            }
            throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + gVar).toString());
        }
        return false;
    }

    /* renamed from: c */
    public final C23649g<?> mo51727c(C25143j0 j0Var, C26009b.C26011b.C26014c cVar, C26243c cVar2) {
        C23649g<?> gVar;
        C87412m.m108594g(j0Var, "expectedType");
        C87412m.m108594g(cVar, "value");
        C87412m.m108594g(cVar2, "nameResolver");
        Boolean d = C26238b.f73150M.mo53140c(cVar.f72438s);
        C87412m.m108593f(d, "IS_UNSIGNED.get(value.flags)");
        boolean booleanValue = d.booleanValue();
        C26009b.C26011b.C26014c.C26017c cVar3 = cVar.f72428f;
        switch (cVar3 == null ? -1 : C24743a.f70592a[cVar3.ordinal()]) {
            case 1:
                byte b = (byte) ((int) cVar.f72429g);
                return booleanValue ? new C23671x(b) : new C23646d(b);
            case 2:
                gVar = new C23647e((char) ((int) cVar.f72429g));
                break;
            case 3:
                short s = (short) ((int) cVar.f72429g);
                return booleanValue ? new C23642a0(s) : new C23669v(s);
            case 4:
                int i = (int) cVar.f72429g;
                if (!booleanValue) {
                    gVar = new C23658n(i);
                    break;
                } else {
                    gVar = new C23672y(i);
                    break;
                }
            case 5:
                long j = cVar.f72429g;
                return booleanValue ? new C23673z(j) : new C23667t(j);
            case 6:
                gVar = new C23657m(cVar.f72430h);
                break;
            case 7:
                gVar = new C23653j(cVar.f72431i);
                break;
            case 8:
                gVar = new C23645c(cVar.f72429g != 0);
                break;
            case 9:
                gVar = new C23670w(cVar2.getString(cVar.f72432j));
                break;
            case 10:
                gVar = new C23663s(C24732a0.m31109a(cVar2, cVar.f72433n), cVar.f72437r);
                break;
            case 11:
                gVar = new C23654k(C24732a0.m31109a(cVar2, cVar.f72433n), C24732a0.m31110b(cVar2, cVar.f72434o));
                break;
            case 12:
                C26009b bVar = cVar.f72435p;
                C87412m.m108593f(bVar, "value.annotation");
                gVar = new C23641a(mo51725a(bVar, cVar2));
                break;
            case 13:
                List<C26009b.C26011b.C26014c> list = cVar.f72436q;
                C87412m.m108593f(list, "value.arrayElementList");
                ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
                for (C26009b.C26011b.C26014c cVar4 : list) {
                    C25176s0 f = this.f70590a.mo52623m().mo53314f();
                    C87412m.m108593f(f, "builtIns.anyType");
                    C87412m.m108593f(cVar4, LocaleUtil.ITALIAN);
                    arrayList.add(mo51727c(f, cVar4, cVar2));
                }
                return new C24767n(arrayList, j0Var);
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported annotation argument type: ");
                sb.append(cVar.f72428f);
                sb.append(" (expected ");
                sb.append(j0Var);
                sb.append(')');
                throw new IllegalStateException(sb.toString().toString());
        }
        return gVar;
    }
}
