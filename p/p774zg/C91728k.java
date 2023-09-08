package p774zg;

import com.eclipsesource.mmv8.SharedV8ArrayBuffer;
import com.tencent.p014mm.appbrand.p942v8.C80669j;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: zg.k */
public class C91728k implements C91689d {

    /* renamed from: a */
    public final AtomicInteger f262748a = new AtomicInteger(0);

    /* renamed from: b */
    public final Map<Integer, C91729a> f262749b = new HashMap();

    /* renamed from: c */
    public final C80669j f262750c;

    /* renamed from: zg.k$a */
    public static final class C91729a {

        /* renamed from: a */
        public final C80669j f262751a;

        /* renamed from: b */
        public ByteBuffer f262752b;

        /* renamed from: c */
        public SharedV8ArrayBuffer f262753c = null;

        public C91729a(int i, C80669j jVar) {
            this.f262751a = jVar;
            this.f262752b = ByteBuffer.allocateDirect(i);
        }
    }

    public C91728k(C80669j jVar) {
        this.f262750c = jVar;
    }
}
