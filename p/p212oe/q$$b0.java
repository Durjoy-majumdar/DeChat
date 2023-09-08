package p212oe;

import java.util.Map;
import p1195ge.C116947b;
import p1195ge.C116951c;
import p329d3.C86165a;

/* renamed from: oe.q$$b0 */
public final /* synthetic */ class q$$b0 implements C86165a {

    /* renamed from: a */
    public final /* synthetic */ double f352222a;

    /* renamed from: b */
    public final /* synthetic */ C116947b.C116948a f352223b;

    public /* synthetic */ q$$b0(double d, C116947b.C116948a aVar) {
        this.f352222a = d;
        this.f352223b = aVar;
    }

    public final void accept(Object obj) {
        double d = this.f352222a;
        C116947b.C116948a aVar = this.f352223b;
        Map map = (Map) obj;
        map.put("power", Double.valueOf(C116951c.m165015p(d, 2)));
        map.put("topMs", aVar.f350488o0.f343211a);
        map.put("fgActMs", aVar.f350486n0.f343211a);
        map.put("procFgMs", aVar.f350492q0.f343211a);
        map.put("procBgMs", aVar.f350496s0.f343211a);
    }
}
