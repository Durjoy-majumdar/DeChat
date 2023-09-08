package p212oe;

import java.util.Map;
import p1195ge.C116947b;
import p1195ge.C116951c;
import p329d3.C86165a;

/* renamed from: oe.q$$y */
public final /* synthetic */ class q$$y implements C86165a {

    /* renamed from: a */
    public final /* synthetic */ double f352266a;

    /* renamed from: b */
    public final /* synthetic */ C116947b.C116948a f352267b;

    public /* synthetic */ q$$y(double d, C116947b.C116948a aVar) {
        this.f352266a = d;
        this.f352267b = aVar;
    }

    public final void accept(Object obj) {
        double d = this.f352266a;
        C116947b.C116948a aVar = this.f352267b;
        Map map = (Map) obj;
        if (((Long) aVar.f350501v.f343211a).longValue() < 0 || ((Long) aVar.f350503w.f343211a).longValue() < 0 || (((Long) aVar.f350501v.f343211a).longValue() == 0 && ((Long) aVar.f350503w.f343211a).longValue() == 0)) {
            d = 0.0d;
        }
        map.put("power", Double.valueOf(C116951c.m165015p(d, 2)));
        map.put("usr", aVar.f350501v.f343211a);
        map.put("sys", aVar.f350503w.f343211a);
    }
}
