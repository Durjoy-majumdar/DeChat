package bd1;

import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import zc1.C66785b;

/* renamed from: bd1.c */
public final class C54447c extends C54446b {

    /* renamed from: g1 */
    public static final AtomicLong f152698g1 = new AtomicLong(1);

    /* renamed from: f1 */
    public final long f152699f1 = f152698g1.get();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54447c(String str) {
        super(str);
        C87412m.m108594g(str, "finderUsername");
        C54446b N1 = C66785b.f191882e.mo90661N1(str, true);
        convertFrom(new C54450j((N1 == null ? new C54446b(str) : N1).convertTo(), C54446b.f152697e1, (List) null, 4, (C8480h) null));
    }
}
