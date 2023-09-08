package mk0;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: mk0.a */
public class C88736a {

    /* renamed from: f */
    public static volatile C88736a f256124f = null;

    /* renamed from: g */
    public static volatile boolean f256125g = true;

    /* renamed from: a */
    public int f256126a;

    /* renamed from: b */
    public boolean f256127b;

    /* renamed from: c */
    public String f256128c;

    /* renamed from: d */
    public boolean f256129d;

    /* renamed from: e */
    public boolean f256130e;

    /* renamed from: mk0.a$a */
    public static class C88737a {

        /* renamed from: a */
        public int f256131a = 0;

        /* renamed from: b */
        public boolean f256132b = false;

        /* renamed from: c */
        public String f256133c = FirebaseAnalytics.C113379b.MEDIUM;

        /* renamed from: d */
        public boolean f256134d;

        /* renamed from: e */
        public boolean f256135e;

        public C88737a() {
            Log.m105924i("MicroMsg.Ble.BleConfig", "isDefaultRefreshCache, defaultRefreshCache: " + C88736a.f256125g);
            this.f256134d = C88736a.f256125g;
            this.f256135e = true;
        }
    }

    public C88736a(C88737a aVar) {
        this.f256126a = aVar.f256131a;
        this.f256127b = aVar.f256132b;
        this.f256128c = aVar.f256133c;
        this.f256129d = aVar.f256134d;
        this.f256130e = aVar.f256135e;
    }

    /* renamed from: a */
    public static synchronized C88736a m110767a() {
        C88736a aVar;
        synchronized (C88736a.class) {
            if (f256124f == null) {
                f256124f = new C88736a(new C88737a());
            }
            aVar = f256124f;
        }
        return aVar;
    }

    public String toString() {
        return "BleConfig{interval=" + this.f256126a + ", allowDuplicatesKey=" + this.f256127b + ", actionTimeOutTime=" + 33000 + ", debug=" + false + ", mainThread=" + true + ", serial=" + true + ", mode='" + this.f256128c + '\'' + ", actionDelayTime=" + 10 + ", scanWorkaround=" + this.f256130e + '}';
    }
}
