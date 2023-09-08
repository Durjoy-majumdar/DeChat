package cy0;

import gy3.C87412m;
import java.util.HashMap;
import java.util.LinkedList;
import te3.C51645v5;
import te3.C52069y5;

/* renamed from: cy0.b */
public final class C45224b {

    /* renamed from: a */
    public static final C45224b f122558a = new C45224b();

    /* renamed from: b */
    public static final HashMap<String, C45225a> f122559b = new HashMap<>();

    /* renamed from: cy0.b$a */
    public static final class C45225a {

        /* renamed from: a */
        public final LinkedList<C51645v5> f122560a = new LinkedList<>();

        /* renamed from: b */
        public final HashMap<String, C51645v5> f122561b = new HashMap<>();

        /* renamed from: a */
        public final C51645v5 mo70716a(String str) {
            C87412m.m108594g(str, "event");
            C51645v5 v5Var = this.f122561b.get(str);
            if (v5Var != null) {
                return v5Var;
            }
            C51645v5 v5Var2 = new C51645v5();
            v5Var2.f143301d = 5;
            LinkedList<C52069y5> linkedList = v5Var2.f143302e;
            C52069y5 y5Var = new C52069y5();
            y5Var.f145118d = "EventType";
            y5Var.f145119e = str;
            linkedList.add(y5Var);
            LinkedList<C52069y5> linkedList2 = v5Var2.f143302e;
            C52069y5 y5Var2 = new C52069y5();
            y5Var2.f145118d = "StartTime";
            y5Var2.f145119e = String.valueOf(System.currentTimeMillis());
            linkedList2.add(y5Var2);
            this.f122561b.put(str, v5Var2);
            return v5Var2;
        }
    }

    static {
        new HashMap();
    }

    /* renamed from: a */
    public static void m50020a(C45224b bVar, C51645v5 v5Var, C45225a aVar, String str, int i, Object obj) {
        HashMap<String, C51645v5> hashMap;
        LinkedList<C51645v5> linkedList;
        if ((i & 2) != 0) {
            str = "";
        }
        bVar.getClass();
        C87412m.m108594g(v5Var, "<this>");
        C87412m.m108594g(str, "endTime");
        LinkedList<C52069y5> linkedList2 = v5Var.f143302e;
        C87412m.m108593f(linkedList2, "item");
        String str2 = "";
        for (C52069y5 y5Var : linkedList2) {
            if (C87412m.m108589b(y5Var.f145118d, "EventType")) {
                str2 = y5Var.f145119e;
                C87412m.m108593f(str2, "it.`val`");
            }
        }
        if (!C87412m.m108589b(str2, "")) {
            LinkedList<C52069y5> linkedList3 = v5Var.f143302e;
            C52069y5 y5Var2 = new C52069y5();
            y5Var2.f145118d = "EndTime";
            if (C87412m.m108589b(str, "")) {
                str = String.valueOf(System.currentTimeMillis());
            }
            y5Var2.f145119e = str;
            linkedList3.add(y5Var2);
            if (!(aVar == null || (linkedList = aVar.f122560a) == null)) {
                linkedList.add(v5Var);
            }
            if (aVar != null && (hashMap = aVar.f122561b) != null) {
                C51645v5 remove = hashMap.remove(str2);
            }
        }
    }
}
