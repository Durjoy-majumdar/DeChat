package p269xe;

import java.util.Map;
import p1177ce.C113287a;
import p1195ge.C116951c;
import p329d3.C86165a;

/* renamed from: xe.e$b$a$$e */
public final /* synthetic */ class e$b$a$$e implements C86165a {

    /* renamed from: a */
    public final /* synthetic */ C113287a f355669a;

    public /* synthetic */ e$b$a$$e(C113287a aVar) {
        this.f355669a = aVar;
    }

    public final void accept(Object obj) {
        C113287a aVar = this.f355669a;
        Map map = (Map) obj;
        Object obj2 = map.get("power");
        if (obj2 instanceof Double) {
            map.put("powerAvg", Double.valueOf(C116951c.m165015p((((Double) obj2).doubleValue() * 3600000.0d) / ((double) aVar.f338976n), 2)));
        }
    }
}
