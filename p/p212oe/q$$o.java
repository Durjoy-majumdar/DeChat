package p212oe;

import java.util.Map;
import p1195ge.C116947b;
import p1195ge.C116951c;
import p329d3.C86165a;

/* renamed from: oe.q$$o */
public final /* synthetic */ class q$$o implements C86165a {

    /* renamed from: a */
    public final /* synthetic */ double f352250a;

    /* renamed from: b */
    public final /* synthetic */ C116947b.C116948a f352251b;

    public /* synthetic */ q$$o(double d, C116947b.C116948a aVar) {
        this.f352250a = d;
        this.f352251b = aVar;
    }

    public final void accept(Object obj) {
        double d = this.f352250a;
        C116947b.C116948a aVar = this.f352251b;
        Map map = (Map) obj;
        map.put("power", Double.valueOf(C116951c.m165015p(d, 2)));
        map.put("mams", aVar.f350472g0.f343211a);
    }
}
