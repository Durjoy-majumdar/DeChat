package r81;

import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import h81.C32735h;
import java.util.HashMap;
import java.util.Map;
import u24.C90599h;

/* renamed from: r81.a */
public class C118226a {

    /* renamed from: b */
    public static int f353380b = 1000;

    /* renamed from: c */
    public static int f353381c = 30000;

    /* renamed from: d */
    public static int f353382d = 10000;

    /* renamed from: e */
    public static int f353383e = 4;

    /* renamed from: f */
    public static long f353384f = 60000;

    /* renamed from: a */
    public Map<String, C118227a> f353385a;

    /* renamed from: r81.a$a */
    public class C118227a {

        /* renamed from: a */
        public long f353386a;

        /* renamed from: b */
        public int f353387b;

        public C118227a(C118226a aVar, long j, int i) {
            this.f353386a = j;
            this.f353387b = i;
        }
    }

    public C118226a() {
        String Y60 = ((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_edge_computing_threshold_controller, "");
        if (!C90599h.m113511d(Y60)) {
            String[] split = Y60.split(";");
            if (split.length > 0 && !C90599h.m113511d(split[0])) {
                f353380b = Util.getInt(split[0], 0);
            }
            if (split.length > 1 && !C90599h.m113511d(split[1])) {
                f353382d = Util.getInt(split[1], 0);
            }
            if (split.length > 2 && !C90599h.m113511d(split[2])) {
                f353381c = Util.getInt(split[2], 0);
            }
            if (split.length > 3 && !C90599h.m113511d(split[3])) {
                f353383e = Util.getInt(split[3], 0);
            }
            if (split.length > 4 && !C90599h.m113511d(split[4])) {
                f353384f = (long) Util.getInt(split[4], 0);
            }
        }
        this.f353385a = new HashMap();
    }
}
