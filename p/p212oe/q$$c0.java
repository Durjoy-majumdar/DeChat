package p212oe;

import java.util.Map;
import p1195ge.C116947b;
import p1195ge.C116951c;
import p329d3.C86165a;

/* renamed from: oe.q$$c0 */
public final /* synthetic */ class q$$c0 implements C86165a {

    /* renamed from: a */
    public final /* synthetic */ double f352225a;

    /* renamed from: b */
    public final /* synthetic */ C116947b.C116948a f352226b;

    public /* synthetic */ q$$c0(double d, C116947b.C116948a aVar) {
        this.f352225a = d;
        this.f352226b = aVar;
    }

    public final void accept(Object obj) {
        double d = this.f352225a;
        C116947b.C116948a aVar = this.f352226b;
        Map map = (Map) obj;
        if (((Long) aVar.f350482l0.f343211a).longValue() < 0 || ((Long) aVar.f350484m0.f343211a).longValue() < 0 || (((Long) aVar.f350482l0.f343211a).longValue() == 0 && ((Long) aVar.f350484m0.f343211a).longValue() == 0)) {
            d = 0.0d;
        }
        map.put("power", Double.valueOf(C116951c.m165015p(d, 2)));
        map.put("jobsMs", aVar.f350482l0.f343211a);
        map.put("syncMs", aVar.f350484m0.f343211a);
    }
}
