package ob0;

import bp3.C79755l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.PeriodRecorder;
import com.tencent.p014mm.storage.C72963f4;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p261wl.C38166b;
import p261wl.C38174i;
import te3.C77949j3;

/* renamed from: ob0.m */
public interface C35136m {

    /* renamed from: ob0.m$b */
    public static class C35139b {

        /* renamed from: a */
        public C72963f4 f94255a;

        /* renamed from: b */
        public boolean f94256b;

        public C35139b(C72963f4 f4Var, boolean z) {
            this.f94255a = f4Var;
            this.f94256b = z;
        }
    }

    /* renamed from: ob0.m$d */
    public static class C35140d {

        /* renamed from: a */
        public static ConcurrentHashMap<Object, C35136m> f94257a = new ConcurrentHashMap<>();

        /* renamed from: a */
        public static C35136m m40570a(Object obj) {
            C35136m mVar = f94257a.get(obj);
            if (mVar == null) {
                C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C35141t.class);
                C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
                while (bVar.hasNext()) {
                    C38174i iVar = (C38174i) bVar.next();
                    if (iVar.hasKey(obj)) {
                        mVar = (C35136m) iVar.get();
                    }
                }
            }
            if (mVar == null) {
                String processName = MMApplicationContext.getProcessName();
                PeriodRecorder periodRecorder = C79755l.f233752a;
                if (obj != null) {
                    try {
                        Set<Object> set = C79755l.f233756e;
                        if (!((HashSet) set).contains(obj)) {
                            synchronized (set) {
                                if (!((HashSet) set).contains(obj)) {
                                    ((HashSet) set).add(obj);
                                    if (C79755l.f233752a.isExpired("reportMissingIMessageExtension")) {
                                        C79755l.m96892b(11001, processName, String.format("%s;%s", new Object[]{"IMessageExtension", obj}));
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.MissingMessageListenerReporter", th, "fail to call reportMissingIMessageExtension(%s,%s)", processName, obj);
                    }
                }
            }
            return mVar;
        }
    }

    /* renamed from: Fg */
    C35139b mo56403Fg(C35137a aVar);

    /* renamed from: ld */
    void mo56404ld(C35138c cVar);

    /* renamed from: ob0.m$c */
    public static class C35138c {

        /* renamed from: a */
        public C72963f4 f94250a;

        /* renamed from: b */
        public Object f94251b;

        /* renamed from: c */
        public Object f94252c;

        /* renamed from: d */
        public String f94253d;

        /* renamed from: e */
        public String f94254e;

        public C35138c(C72963f4 f4Var) {
            this.f94250a = f4Var;
        }

        public C35138c(C77949j3 j3Var, Object obj, Object obj2) {
            this.f94251b = obj;
            this.f94252c = obj2;
        }
    }

    /* renamed from: ob0.m$a */
    public static class C35137a {

        /* renamed from: a */
        public C77949j3 f94242a;

        /* renamed from: b */
        public boolean f94243b;

        /* renamed from: c */
        public boolean f94244c;

        /* renamed from: d */
        public boolean f94245d;

        /* renamed from: e */
        public boolean f94246e;

        /* renamed from: f */
        public long f94247f;

        /* renamed from: g */
        public Object f94248g;

        /* renamed from: h */
        public int f94249h;

        public C35137a(C77949j3 j3Var, boolean z, boolean z2, boolean z3) {
            this.f94246e = false;
            this.f94247f = 0;
            this.f94242a = j3Var;
            this.f94243b = z;
            this.f94244c = z2;
            this.f94245d = z3;
        }

        public String toString() {
            return String.format("AddMsgInfo(%d), get[%b], fault[%b], up[%b] fixTime[%s]", new Object[]{Integer.valueOf(hashCode()), Boolean.valueOf(this.f94243b), Boolean.valueOf(this.f94244c), Boolean.valueOf(this.f94245d), Long.valueOf(this.f94247f)});
        }

        public C35137a(C77949j3 j3Var, boolean z, boolean z2, boolean z3, long j) {
            this.f94246e = false;
            this.f94242a = j3Var;
            this.f94243b = z;
            this.f94244c = z2;
            this.f94245d = z3;
            this.f94247f = j;
        }

        public C35137a(C77949j3 j3Var, Object obj) {
            this.f94243b = false;
            this.f94244c = false;
            this.f94245d = false;
            this.f94246e = false;
            this.f94247f = 0;
            this.f94242a = j3Var;
            this.f94248g = obj;
        }

        public C35137a(C77949j3 j3Var, boolean z, Object obj) {
            this.f94243b = false;
            this.f94244c = false;
            this.f94245d = false;
            this.f94246e = false;
            this.f94247f = 0;
            this.f94242a = j3Var;
            this.f94248g = obj;
        }

        public C35137a(C77949j3 j3Var, boolean z, long j) {
            this.f94243b = false;
            this.f94244c = false;
            this.f94245d = false;
            this.f94242a = j3Var;
            this.f94246e = z;
            this.f94247f = j;
        }
    }
}
