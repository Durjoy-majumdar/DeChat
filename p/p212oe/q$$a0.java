package p212oe;

import java.util.Map;
import p1195ge.C116947b;
import p1195ge.C116951c;
import p329d3.C86165a;

/* renamed from: oe.q$$a0 */
public final /* synthetic */ class q$$a0 implements C86165a {

    /* renamed from: a */
    public final /* synthetic */ double f352218a;

    /* renamed from: b */
    public final /* synthetic */ C116947b.C116948a f352219b;

    public /* synthetic */ q$$a0(double d, C116947b.C116948a aVar) {
        this.f352218a = d;
        this.f352219b = aVar;
    }

    public final void accept(Object obj) {
        double d = this.f352218a;
        C116947b.C116948a aVar = this.f352219b;
        Map map = (Map) obj;
        map.put("power", Double.valueOf(C116951c.m165015p(d, 2)));
        map.put("time", aVar.f350480k0.f343211a);
    }
}
