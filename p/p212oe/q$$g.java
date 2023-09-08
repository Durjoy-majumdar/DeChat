package p212oe;

import java.util.Map;
import p1195ge.C116951c;
import p210o.C11323a;
import p329d3.C86165a;

/* renamed from: oe.q$$g */
public final /* synthetic */ class q$$g implements C86165a {

    /* renamed from: a */
    public final /* synthetic */ C11323a f352230a;

    /* renamed from: b */
    public final /* synthetic */ double f352231b;

    public /* synthetic */ q$$g(C11323a aVar, double d) {
        this.f352230a = aVar;
        this.f352231b = d;
    }

    public final void accept(Object obj) {
        ((Map) obj).put("power", Double.valueOf(C116951c.m165015p(((Double) this.f352230a.apply(Double.valueOf(this.f352231b))).doubleValue(), 2)));
    }
}
