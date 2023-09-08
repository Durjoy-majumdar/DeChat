package p212oe;

import java.util.Map;
import p1195ge.C116947b;
import p1195ge.C116951c;
import p329d3.C86165a;

/* renamed from: oe.q$$i */
public final /* synthetic */ class q$$i implements C86165a {

    /* renamed from: a */
    public final /* synthetic */ double f352234a;

    /* renamed from: b */
    public final /* synthetic */ C116947b.C116948a f352235b;

    public /* synthetic */ q$$i(double d, C116947b.C116948a aVar) {
        this.f352234a = d;
        this.f352235b = aVar;
    }

    public final void accept(Object obj) {
        double d = this.f352234a;
        C116947b.C116948a aVar = this.f352235b;
        Map map = (Map) obj;
        map.put("power", Double.valueOf(C116951c.m165015p(d, 2)));
        map.put("full", aVar.f350463b0.f343211a);
        map.put("partial", aVar.f350462a0.f343211a);
        map.put("window", aVar.f350464c0.f343211a);
        map.put("draw", aVar.f350466d0.f343211a);
        map.put("pidSum", aVar.f350468e0.f343211a);
    }
}
