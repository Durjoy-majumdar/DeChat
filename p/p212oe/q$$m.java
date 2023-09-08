package p212oe;

import java.util.Map;
import p1195ge.C116947b;
import p1195ge.C116951c;
import p329d3.C86165a;

/* renamed from: oe.q$$m */
public final /* synthetic */ class q$$m implements C86165a {

    /* renamed from: a */
    public final /* synthetic */ double f352246a;

    /* renamed from: b */
    public final /* synthetic */ C116947b.C116948a f352247b;

    public /* synthetic */ q$$m(double d, C116947b.C116948a aVar) {
        this.f352246a = d;
        this.f352247b = aVar;
    }

    public final void accept(Object obj) {
        double d = this.f352246a;
        C116947b.C116948a aVar = this.f352247b;
        Map map = (Map) obj;
        map.put("power", Double.valueOf(C116951c.m165015p(d, 2)));
        map.put("mams", aVar.f350458W.f343211a);
        map.put("idle", aVar.f350459X.f343211a);
        map.put("rx", aVar.f350460Y.f343211a);
        map.put("tx", aVar.f350461Z.f343211a);
    }
}
