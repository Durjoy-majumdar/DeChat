package p212oe;

import java.util.Map;
import p1195ge.C116947b;
import p1195ge.C116951c;
import p329d3.C86165a;

/* renamed from: oe.q$$z */
public final /* synthetic */ class q$$z implements C86165a {

    /* renamed from: a */
    public final /* synthetic */ double f352268a;

    /* renamed from: b */
    public final /* synthetic */ C116947b.C116948a f352269b;

    public /* synthetic */ q$$z(double d, C116947b.C116948a aVar) {
        this.f352268a = d;
        this.f352269b = aVar;
    }

    public final void accept(Object obj) {
        double d = this.f352268a;
        C116947b.C116948a aVar = this.f352269b;
        Map map = (Map) obj;
        map.put("power", Double.valueOf(C116951c.m165015p(d, 2)));
        map.put("time", aVar.f350478j0.f343211a);
    }
}
