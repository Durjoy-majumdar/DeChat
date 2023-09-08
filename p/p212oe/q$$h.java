package p212oe;

import java.util.Map;
import p1195ge.C116947b;
import p1195ge.C116951c;
import p329d3.C86165a;

/* renamed from: oe.q$$h */
public final /* synthetic */ class q$$h implements C86165a {

    /* renamed from: a */
    public final /* synthetic */ double f352232a;

    /* renamed from: b */
    public final /* synthetic */ C116947b.C116948a f352233b;

    public /* synthetic */ q$$h(double d, C116947b.C116948a aVar) {
        this.f352232a = d;
        this.f352233b = aVar;
    }

    public final void accept(Object obj) {
        double d = this.f352232a;
        C116947b.C116948a aVar = this.f352233b;
        Map map = (Map) obj;
        map.put("power", Double.valueOf(C116951c.m165015p(d, 2)));
        map.put("realMs", aVar.f350505x.f343211a);
        map.put("upMs", aVar.f350507y.f343211a);
        map.put("offRealMs", aVar.f350509z.f343211a);
        map.put("offUpMs", aVar.f350436A.f343211a);
    }
}
