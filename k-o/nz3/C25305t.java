package nz3;

import androidx.exifinterface.media.ExifInterface;
import e04.C20506e;
import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import oz3.C11795x;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C26234j0;
import sx3.C26235k0;
import sx3.C36906q;
import sx3.C36907w;
import sx3.C64188i0;
import sx3.C90363p0;

/* renamed from: nz3.t */
public final class C25305t {

    /* renamed from: a */
    public final Map<String, C25300m> f71797a = new LinkedHashMap();

    /* renamed from: nz3.t$a */
    public final class C25306a {

        /* renamed from: a */
        public final String f71798a;

        /* renamed from: b */
        public final /* synthetic */ C25305t f71799b;

        /* renamed from: nz3.t$a$a */
        public final class C25307a {

            /* renamed from: a */
            public final String f71800a;

            /* renamed from: b */
            public final List<C13604l<String, C25309w>> f71801b = new ArrayList();

            /* renamed from: c */
            public C13604l<String, C25309w> f71802c = new C13604l<>(ExifInterface.GPS_MEASUREMENT_INTERRUPTED, null);

            /* renamed from: d */
            public final /* synthetic */ C25306a f71803d;

            public C25307a(C25306a aVar, String str) {
                C87412m.m108594g(str, "functionName");
                this.f71803d = aVar;
                this.f71800a = str;
            }

            /* renamed from: a */
            public final void mo52390a(String str, C25267g... gVarArr) {
                C25309w wVar;
                C87412m.m108594g(str, "type");
                C87412m.m108594g(gVarArr, "qualifiers");
                List<C13604l<String, C25309w>> list = this.f71801b;
                if (gVarArr.length == 0) {
                    wVar = null;
                } else {
                    C26234j0 j0Var = new C26234j0(new C36906q(gVarArr));
                    int a = C90363p0.m113142a(C36907w.m41090l(j0Var, 10));
                    if (a < 16) {
                        a = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(a);
                    Iterator it = j0Var.iterator();
                    while (true) {
                        C26235k0 k0Var = (C26235k0) it;
                        if (!k0Var.hasNext()) {
                            break;
                        }
                        C64188i0 i0Var = (C64188i0) k0Var.next();
                        linkedHashMap.put(Integer.valueOf(i0Var.f181909a), (C25267g) i0Var.f181910b);
                    }
                    wVar = new C25309w(linkedHashMap);
                }
                ((ArrayList) list).add(new C13604l(str, wVar));
            }

            /* renamed from: b */
            public final void mo52391b(C20506e eVar) {
                C87412m.m108594g(eVar, "type");
                String c = eVar.mo32069c();
                C87412m.m108593f(c, "type.desc");
                this.f71802c = new C13604l<>(c, null);
            }

            /* renamed from: c */
            public final void mo52392c(String str, C25267g... gVarArr) {
                C87412m.m108594g(str, "type");
                C87412m.m108594g(gVarArr, "qualifiers");
                C26234j0 j0Var = new C26234j0(new C36906q(gVarArr));
                int a = C90363p0.m113142a(C36907w.m41090l(j0Var, 10));
                if (a < 16) {
                    a = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(a);
                Iterator it = j0Var.iterator();
                while (true) {
                    C26235k0 k0Var = (C26235k0) it;
                    if (k0Var.hasNext()) {
                        C64188i0 i0Var = (C64188i0) k0Var.next();
                        linkedHashMap.put(Integer.valueOf(i0Var.f181909a), (C25267g) i0Var.f181910b);
                    } else {
                        this.f71802c = new C13604l<>(str, new C25309w(linkedHashMap));
                        return;
                    }
                }
            }
        }

        public C25306a(C25305t tVar, String str) {
            C87412m.m108594g(str, "className");
            this.f71799b = tVar;
            this.f71798a = str;
        }

        /* renamed from: a */
        public final void mo52389a(String str, C32226l<? super C25307a, C13598b0> lVar) {
            String str2 = str;
            C32226l<? super C25307a, C13598b0> lVar2 = lVar;
            C87412m.m108594g(str2, "name");
            C87412m.m108594g(lVar2, "block");
            Map<String, C25300m> map = this.f71799b.f71797a;
            C25307a aVar = new C25307a(this, str2);
            lVar2.invoke(aVar);
            String str3 = aVar.f71803d.f71798a;
            String str4 = aVar.f71800a;
            List<C13604l<String, C25309w>> list = aVar.f71801b;
            ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                arrayList.add((String) ((C13604l) it.next()).f38555d);
            }
            String str5 = (String) aVar.f71802c.f38555d;
            C87412m.m108594g(str4, "name");
            C87412m.m108594g(str5, "ret");
            StringBuilder sb = new StringBuilder();
            sb.append(str4);
            sb.append('(');
            sb.append(C110818d0.m150921S(arrayList, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C11795x.f34508d, 30, (Object) null));
            sb.append(')');
            if (str5.length() > 1) {
                str5 = 'L' + str5 + ';';
            }
            sb.append(str5);
            String sb4 = sb.toString();
            C87412m.m108594g(str3, "internalName");
            C87412m.m108594g(sb4, "jvmDescriptor");
            String str6 = str3 + '.' + sb4;
            C25309w wVar = (C25309w) aVar.f71802c.f38556e;
            List<C13604l<String, C25309w>> list2 = aVar.f71801b;
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(list2, 10));
            Iterator it4 = ((ArrayList) list2).iterator();
            while (it4.hasNext()) {
                arrayList2.add((C25309w) ((C13604l) it4.next()).f38556e);
            }
            map.put(str6, new C25300m(wVar, arrayList2));
        }
    }
}
