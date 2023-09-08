package p212oe;

import java.util.Map;
import p1195ge.C116951c;
import p329d3.C86165a;

/* renamed from: oe.q$$b */
public final /* synthetic */ class q$$b implements C86165a {

    /* renamed from: a */
    public final /* synthetic */ double f352220a;

    /* renamed from: b */
    public final /* synthetic */ boolean f352221b;

    public /* synthetic */ q$$b(double d, boolean z) {
        this.f352220a = d;
        this.f352221b = z;
    }

    public final void accept(Object obj) {
        double d = this.f352220a;
        boolean z = this.f352221b;
        Map map = (Map) obj;
        map.put("power", Double.valueOf(C116951c.m165015p(d, 2)));
        map.put("negative", Boolean.valueOf(z));
    }
}
