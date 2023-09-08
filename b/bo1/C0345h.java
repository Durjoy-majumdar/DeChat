package bo1;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import di3.C86312j;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import p749xh.C66261f3;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C50676og0;
import te3.C50824pg0;

/* renamed from: bo1.h */
public final class C0345h {

    /* renamed from: c */
    public static final C0348c f930c = new C0348c((C8480h) null);

    /* renamed from: d */
    public static final C13601g<ConcurrentHashMap<String, C0345h>> f931d = C36568h.m40985a(C0347b.f935d);

    /* renamed from: a */
    public final int f932a = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_search_h5_preload_max_time, 50);

    /* renamed from: b */
    public final LinkedList<C0346a> f933b = new LinkedList<>();

    /* renamed from: bo1.h$a */
    public static final class C0346a {

        /* renamed from: a */
        public final LinkedList<C0349d> f934a = new LinkedList<>();

        public C0346a(LinkedList<C50676og0> linkedList, C50824pg0 pg02) {
            C87412m.m108594g(linkedList, "objectIds");
            C87412m.m108594g(pg02, "resp");
            LinkedList<FinderObject> linkedList2 = pg02.f139748d;
            C87412m.m108593f(linkedList2, "resp.objects");
            for (FinderObject finderObject : linkedList2) {
                Iterator<C50676og0> it = linkedList.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (it.next().f139150d == finderObject.f164794id) {
                        break;
                    }
                    i++;
                }
                if (i != -1) {
                    String str = linkedList.get(i).f139151e;
                    if (str != null) {
                        LinkedList<C0349d> linkedList3 = this.f934a;
                        C87412m.m108593f(finderObject, C66261f3.COL_FINDEROBJECT);
                        linkedList3.add(new C0349d(str, finderObject));
                    }
                    linkedList.remove(i);
                }
            }
        }
    }

    /* renamed from: bo1.h$b */
    public static final class C0347b extends C87413o implements C32224a<ConcurrentHashMap<String, C0345h>> {

        /* renamed from: d */
        public static final C0347b f935d = new C0347b();

        public C0347b() {
            super(0);
        }

        public Object invoke() {
            return new ConcurrentHashMap();
        }
    }

    /* renamed from: bo1.h$c */
    public static final class C0348c {
        public C0348c(C8480h hVar) {
        }

        /* renamed from: a */
        public final synchronized C0345h mo387a(int i, boolean z) {
            C0345h hVar;
            String str = "8755+" + i;
            C13601g<ConcurrentHashMap<String, C0345h>> gVar = C0345h.f931d;
            hVar = (C0345h) ((ConcurrentHashMap) ((C36570n) gVar).getValue()).get(str);
            if (hVar == null && z) {
                hVar = new C0345h(str);
                ((ConcurrentHashMap) ((C36570n) gVar).getValue()).put(str, hVar);
            }
            return hVar;
        }
    }

    /* renamed from: bo1.h$d */
    public static final class C0349d {

        /* renamed from: a */
        public final String f936a;

        /* renamed from: b */
        public final FinderObject f937b;

        public C0349d(String str, FinderObject finderObject) {
            C87412m.m108594g(str, "exportId");
            C87412m.m108594g(finderObject, C66261f3.COL_FINDEROBJECT);
            this.f936a = str;
            this.f937b = finderObject;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0349d)) {
                return false;
            }
            C0349d dVar = (C0349d) obj;
            return C87412m.m108589b(this.f936a, dVar.f936a) && C87412m.m108589b(this.f937b, dVar.f937b);
        }

        public int hashCode() {
            return (this.f936a.hashCode() * 31) + this.f937b.hashCode();
        }

        public String toString() {
            return "FinderExportObject(exportId=" + this.f936a + ", finderObject=" + this.f937b + ')';
        }
    }

    public C0345h(String str) {
        C87412m.m108594g(str, "key");
    }
}
