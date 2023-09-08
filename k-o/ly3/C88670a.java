package ly3;

import gy3.C87412m;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import ky3.C88331a;

/* renamed from: ly3.a */
public final class C88670a extends C88331a {
    /* renamed from: h */
    public int mo122723h(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    /* renamed from: j */
    public Random mo122720j() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        C87412m.m108593f(current, "current()");
        return current;
    }
}
