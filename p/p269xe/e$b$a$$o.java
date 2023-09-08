package p269xe;

import java.util.List;
import java.util.Map;
import p212oe.C117762j;
import p329d3.C58104c;
import p329d3.C86165a;

/* renamed from: xe.e$b$a$$o */
public final /* synthetic */ class e$b$a$$o implements C86165a {
    public final void accept(Object obj) {
        Map map = (Map) obj;
        List<List<C58104c<Integer, String>>> list = C117762j.f352169g;
        for (int i = 0; i < list.size(); i++) {
            List list2 = list.get(i);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                C58104c cVar = (C58104c) list2.get(i2);
                map.put("net-info-type-" + i + "-" + i2, cVar.f166179a);
                map.put("net-info-name-" + i + "-" + i2, cVar.f166180b);
            }
        }
    }
}
