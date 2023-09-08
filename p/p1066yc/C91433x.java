package p1066yc;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.concurrent.atomic.AtomicInteger;
import p1066yc.C91415l;

/* renamed from: yc.x */
public final class C91433x implements C91415l.C91416a {

    /* renamed from: a */
    public final boolean f262150a;

    /* renamed from: b */
    public final String f262151b;

    /* renamed from: c */
    public final AtomicInteger f262152c = new AtomicInteger(0);

    public C91433x(boolean z, String str) {
        C87412m.m108594g(str, "namePrefix");
        this.f262150a = z;
        this.f262151b = str;
        Log.m105924i("MicroMsg.SameLayerPluginHandlerThreadProvider", "<init>, usePooledImpl: " + z);
    }

    /* renamed from: b */
    public static final C91415l.C91416a m114724b(C91434y yVar) {
        C87412m.m108594g(yVar, "type");
        boolean z = yVar != C91434y.Video;
        return new C91433x(z, yVar.name() + "Thread_");
    }

    /* renamed from: a */
    public C91415l mo125370a() {
        String str = this.f262151b + this.f262152c.getAndIncrement();
        Log.m105924i("MicroMsg.SameLayerPluginHandlerThreadProvider", "create, name: " + str);
        return this.f262150a ? new C91426v(str) : new C91430w(str);
    }
}
