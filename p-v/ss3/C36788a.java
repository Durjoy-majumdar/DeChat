package ss3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import eb0.C75592q0;
import f40.C86709a0;
import gy3.C8480h;
import java.util.HashMap;

/* renamed from: ss3.a */
public final class C36788a {

    /* renamed from: i */
    public static MultiProcessMMKV f97694i;

    /* renamed from: a */
    public long f97695a;

    /* renamed from: b */
    public long f97696b;

    /* renamed from: c */
    public long f97697c = -1;

    /* renamed from: d */
    public int f97698d;

    /* renamed from: e */
    public long f97699e;

    /* renamed from: f */
    public HashMap<Long, C36790b> f97700f = new HashMap<>();

    /* renamed from: g */
    public boolean f97701g;

    /* renamed from: h */
    public long f97702h;

    /* renamed from: ss3.a$a */
    public static final class C36789a {
        public C36789a(C8480h hVar) {
        }
    }

    /* renamed from: ss3.a$b */
    public static final class C36790b {

        /* renamed from: a */
        public long f97703a;

        public C36790b() {
            this(0, 1, (C8480h) null);
        }

        public C36790b(long j, int i, C8480h hVar) {
            this.f97703a = (i & 1) != 0 ? 0 : j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C36790b) && this.f97703a == ((C36790b) obj).f97703a;
        }

        public int hashCode() {
            long j = this.f97703a;
            return (int) (j ^ (j >>> 32));
        }

        public String toString() {
            return "FrameDecodeCostInfo(cost=" + this.f97703a + ')';
        }
    }

    static {
        new C36789a((C8480h) null);
        try {
            boolean a = C86709a0.m107522a();
            if (a && f97694i == null) {
                f97694i = MultiProcessMMKV.getMMKV(C75592q0.m90789s() + "_scan_cost_mmkv");
            }
            Log.m105925i("MicroMsg.ScanCostManager", "initMMKV %s, mmkv: %s", Boolean.valueOf(a), f97694i);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ScanCostManager", e, "checkInitMMKV exception", new Object[0]);
        }
    }
}
