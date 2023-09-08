package bd1;

import java.util.concurrent.atomic.AtomicLong;
import zc1.C66785b;

/* renamed from: bd1.f */
public final class C39758f extends C39757e implements Cloneable {

    /* renamed from: n */
    public static final AtomicLong f106680n = new AtomicLong(1);

    /* renamed from: j */
    public final long f106681j = f106680n.get();

    public C39758f() {
        parseFrom(C66785b.f191882e.mo90673n0().toByteArray());
    }

    public Object clone() {
        C39757e eVar = new C39757e();
        eVar.parseFrom(toByteArray());
        return eVar;
    }
}
