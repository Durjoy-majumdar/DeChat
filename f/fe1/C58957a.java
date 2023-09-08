package fe1;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: fe1.a */
public final class C58957a {

    /* renamed from: a */
    public static int f168667a;

    /* renamed from: b */
    public static long f168668b;

    /* renamed from: c */
    public static C58958a f168669c = new C58958a();

    /* renamed from: fe1.a$a */
    public static final class C58958a {

        /* renamed from: a */
        public final Map<String, C58969q> f168670a;

        public C58958a() {
            if (!BuildInfo.DEBUG && !BuildInfo.IS_FLAVOR_RED) {
                boolean z = BuildInfo.IS_FLAVOR_PURPLE;
            }
            this.f168670a = Collections.synchronizedMap(new HashMap());
        }
    }
}
