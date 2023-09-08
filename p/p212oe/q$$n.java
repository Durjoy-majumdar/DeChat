package p212oe;

import java.util.Map;
import p1195ge.C116947b;
import p1195ge.C116951c;
import p329d3.C86165a;

/* renamed from: oe.q$$n */
public final /* synthetic */ class q$$n implements C86165a {

    /* renamed from: a */
    public final /* synthetic */ double f352248a;

    /* renamed from: b */
    public final /* synthetic */ C116947b.C116948a f352249b;

    public /* synthetic */ q$$n(double d, C116947b.C116948a aVar) {
        this.f352248a = d;
        this.f352249b = aVar;
    }

    public final void accept(Object obj) {
        double d = this.f352248a;
        C116947b.C116948a aVar = this.f352249b;
        Map map = (Map) obj;
        map.put("power", Double.valueOf(C116951c.m165015p(d, 2)));
        map.put("time", aVar.f350470f0.f343211a);
    }
}
