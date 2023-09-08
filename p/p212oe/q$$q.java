package p212oe;

import java.util.Map;
import p1195ge.C116947b;
import p1195ge.C116951c;
import p329d3.C86165a;

/* renamed from: oe.q$$q */
public final /* synthetic */ class q$$q implements C86165a {

    /* renamed from: a */
    public final /* synthetic */ double f352254a;

    /* renamed from: b */
    public final /* synthetic */ C116947b.C116948a f352255b;

    public /* synthetic */ q$$q(double d, C116947b.C116948a aVar) {
        this.f352254a = d;
        this.f352255b = aVar;
    }

    public final void accept(Object obj) {
        double d = this.f352254a;
        C116947b.C116948a aVar = this.f352255b;
        Map map = (Map) obj;
        map.put("power", Double.valueOf(C116951c.m165015p(d, 2)));
        map.put("time", aVar.f350476i0.f343211a);
    }
}
