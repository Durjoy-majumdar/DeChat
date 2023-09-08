package p212oe;

import java.util.Map;
import p1195ge.C116947b;
import p1195ge.C116951c;
import p329d3.C86165a;

/* renamed from: oe.q$$p */
public final /* synthetic */ class q$$p implements C86165a {

    /* renamed from: a */
    public final /* synthetic */ double f352252a;

    /* renamed from: b */
    public final /* synthetic */ C116947b.C116948a f352253b;

    public /* synthetic */ q$$p(double d, C116947b.C116948a aVar) {
        this.f352252a = d;
        this.f352253b = aVar;
    }

    public final void accept(Object obj) {
        double d = this.f352252a;
        C116947b.C116948a aVar = this.f352253b;
        Map map = (Map) obj;
        map.put("power", Double.valueOf(C116951c.m165015p(d, 2)));
        map.put("time", aVar.f350474h0.f343211a);
    }
}
