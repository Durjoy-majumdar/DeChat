package ct3;

import android.content.Context;
import android.os.Build;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import dt3.C86397a;
import dt3.C86398b;
import dt3.C86399c;
import dt3.C86400d;
import dt3.C86401e;
import dt3.C86402f;
import dt3.C86403g;
import dt3.C86404h;
import et3.C86679a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import lu3.C88656g;
import zt3.C119157j;

/* renamed from: ct3.b */
public class C86135b {

    /* renamed from: a */
    public static Map<String, C86138b> f250658a;

    /* renamed from: b */
    public static final C86139c[] f250659b = {null};

    /* renamed from: c */
    public static final boolean[] f250660c = {false};

    /* renamed from: d */
    public static String f250661d;

    /* renamed from: ct3.b$a */
    public class C86136a implements C88656g {

        /* renamed from: d */
        public final /* synthetic */ C86138b f250662d;

        /* renamed from: e */
        public final /* synthetic */ Context f250663e;

        /* renamed from: ct3.b$a$a */
        public class C86137a implements C88656g {
            public C86137a() {
            }

            public String getKey() {
                return "msa-init-fetcher";
            }

            public void run() {
                Log.m105924i("MicroMsg.MsaIdManager", "[+] do initialize in sep thread now.");
                C86136a aVar = C86136a.this;
                C86139c a = aVar.f250662d.f250665a.mo120551a(aVar.f250663e);
                C86139c[] cVarArr = C86135b.f250659b;
                synchronized (cVarArr) {
                    cVarArr[0] = a;
                }
                C86135b.m106650c();
                Log.m105924i("MicroMsg.MsaIdManager", "[+] initialize done.");
            }
        }

        public C86136a(C86138b bVar, Context context) {
            this.f250662d = bVar;
            this.f250663e = context;
        }

        public String getKey() {
            return "msa-init-waiter";
        }

        public void run() {
            try {
                ((C119157j) C119157j.f356862d).mo183877h(new C86137a(), "sn-msa-init-fetcher").get(10, TimeUnit.SECONDS);
            } catch (TimeoutException unused) {
                C86135b.m106650c();
                Log.m105928w("MicroMsg.MsaIdManager", "[!] asyncInit, timeout.");
            } catch (Throwable th) {
                C86135b.m106650c();
                Log.printErrStackTrace("MicroMsg.MsaIdManager", th, "[-] asyncInit failure.", new Object[0]);
            }
        }
    }

    /* renamed from: ct3.b$b */
    public static class C86138b {

        /* renamed from: a */
        public C86134a f250665a;

        /* renamed from: b */
        public int f250666b = 0;

        public C86138b(C86134a aVar) {
            this.f250665a = aVar;
        }
    }

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        f250658a = concurrentHashMap;
        concurrentHashMap.put("FF5E66B", new C86138b(new C86404h()));
        f250658a.put("C1AAFC7", new C86138b(new C86398b()));
        f250658a.put("B2F39F1", new C86138b(new C86398b()));
        f250658a.put("E389A21", new C86138b(new C86399c()));
        f250658a.put("750379B", new C86138b(new C86399c()));
        f250658a.put("C892BA2", new C86138b(new C86401e()));
        f250658a.put("C1F2239", new C86138b(new C86397a()));
        f250658a.put("B09207F", new C86138b(new C86403g()));
        f250658a.put("43780D5", new C86138b(new C86403g()));
        f250658a.put("22C4185", new C86138b(new C86400d()));
        f250658a.put("FE54627", new C86138b(new C86402f()));
        f250661d = "";
        try {
            f250661d = C86679a.m107499a(Build.MANUFACTURER.toLowerCase().getBytes()).substring(0, 7);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static synchronized void m106648a(Context context) {
        boolean z;
        synchronized (C86135b.class) {
            Log.m105924i("MicroMsg.MsaIdManager", "[+] asyncInit called.");
            boolean[] zArr = f250660c;
            synchronized (zArr) {
                z = zArr[0];
            }
            if (z) {
                Log.m105929w("MicroMsg.MsaIdManager", "[!] Initializing before, ignore this invocation. call_stack: %s", Util.getStack());
                return;
            }
            synchronized (zArr) {
                zArr[0] = true;
            }
            C86138b bVar = (C86138b) ((ConcurrentHashMap) f250658a).get(f250661d);
            if (bVar == null) {
                Log.m105920e("MicroMsg.MsaIdManager", "[-] asyncInit, Unsupport device.");
                C86139c[] cVarArr = f250659b;
                synchronized (cVarArr) {
                    cVarArr[0] = C86139c.m106651a(-10);
                }
                m106650c();
                return;
            }
            ((C119157j) C119157j.f356862d).mo183877h(new C86136a(bVar, context), "sn-msa-init-waiter");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r3 = f250660c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r6 = r3[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0033, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0034, code lost:
        if (r6 == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105928w("MicroMsg.MsaIdManager", "[!] still initializing, skip rest logic.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003d, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r8 = ct3.C86139c.m106651a(-12);
        r1[0] = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0044, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0046, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x004a, code lost:
        r3 = (ct3.C86135b.C86138b) ((java.util.concurrent.ConcurrentHashMap) f250658a).get(f250661d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0056, code lost:
        if (r3 == null) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0058, code lost:
        r6 = r3.f250666b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x005b, code lost:
        if (r6 > 5) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x005d, code lost:
        r3.f250666b = r6 + 1;
        com.tencent.p014mm.sdk.platformtools.Log.m105928w("MicroMsg.MsaIdManager", "[!] getOAID, no cached res, trigger async init now.");
        m106648a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x006a, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r8 = ct3.C86139c.m106651a(-12);
        r1[0] = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0071, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0073, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0077, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r1[0] = ct3.C86139c.m106651a(-13);
        com.tencent.p014mm.sdk.platformtools.Log.m105928w("MicroMsg.MsaIdManager", "[!] getOAID, too many attempts.");
        r8 = r1[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0089, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x008b, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x008f, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        r1[0] = ct3.C86139c.m106651a(-10);
        com.tencent.p014mm.sdk.platformtools.Log.m105928w("MicroMsg.MsaIdManager", "[!] getOAID, unsupported device.");
        r8 = r1[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00a1, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00a3, code lost:
        return r8;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized ct3.C86139c m106649b(android.content.Context r8) {
        /*
            java.lang.Class<ct3.b> r0 = ct3.C86135b.class
            monitor-enter(r0)
            ct3.c[] r1 = f250659b     // Catch:{ all -> 0x00ad }
            monitor-enter(r1)     // Catch:{ all -> 0x00ad }
            r2 = 0
            r3 = r1[r2]     // Catch:{ all -> 0x00aa }
            r4 = 1
            r5 = -12
            if (r3 == 0) goto L_0x002d
            int r3 = r3.f250668b     // Catch:{ all -> 0x00aa }
            if (r3 == r5) goto L_0x002d
            java.lang.String r8 = "MicroMsg.MsaIdManager"
            java.lang.String r5 = "[+] getOAID, hit cache, errcode: %s, oaid: %s"
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x00aa }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00aa }
            r6[r2] = r3     // Catch:{ all -> 0x00aa }
            r3 = r1[r2]     // Catch:{ all -> 0x00aa }
            java.lang.String r3 = r3.f250667a     // Catch:{ all -> 0x00aa }
            r6[r4] = r3     // Catch:{ all -> 0x00aa }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r5, r6)     // Catch:{ all -> 0x00aa }
            r8 = r1[r2]     // Catch:{ all -> 0x00aa }
            monitor-exit(r1)     // Catch:{ all -> 0x00aa }
            monitor-exit(r0)
            return r8
        L_0x002d:
            monitor-exit(r1)     // Catch:{ all -> 0x00aa }
            boolean[] r3 = f250660c     // Catch:{ all -> 0x00ad }
            monitor-enter(r3)     // Catch:{ all -> 0x00ad }
            boolean r6 = r3[r2]     // Catch:{ all -> 0x00a7 }
            monitor-exit(r3)     // Catch:{ all -> 0x00a7 }
            if (r6 == 0) goto L_0x004a
            java.lang.String r8 = "MicroMsg.MsaIdManager"
            java.lang.String r3 = "[!] still initializing, skip rest logic."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r3)     // Catch:{ all -> 0x00ad }
            monitor-enter(r1)     // Catch:{ all -> 0x00ad }
            ct3.c r8 = ct3.C86139c.m106651a(r5)     // Catch:{ all -> 0x0047 }
            r1[r2] = r8     // Catch:{ all -> 0x0047 }
            monitor-exit(r1)     // Catch:{ all -> 0x0047 }
            monitor-exit(r0)
            return r8
        L_0x0047:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0047 }
            throw r8     // Catch:{ all -> 0x00ad }
        L_0x004a:
            java.util.Map<java.lang.String, ct3.b$b> r3 = f250658a     // Catch:{ all -> 0x00ad }
            java.lang.String r6 = f250661d     // Catch:{ all -> 0x00ad }
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3     // Catch:{ all -> 0x00ad }
            java.lang.Object r3 = r3.get(r6)     // Catch:{ all -> 0x00ad }
            ct3.b$b r3 = (ct3.C86135b.C86138b) r3     // Catch:{ all -> 0x00ad }
            if (r3 == 0) goto L_0x008f
            int r6 = r3.f250666b     // Catch:{ all -> 0x00ad }
            r7 = 5
            if (r6 > r7) goto L_0x0077
            int r6 = r6 + r4
            r3.f250666b = r6     // Catch:{ all -> 0x00ad }
            java.lang.String r3 = "MicroMsg.MsaIdManager"
            java.lang.String r4 = "[!] getOAID, no cached res, trigger async init now."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r4)     // Catch:{ all -> 0x00ad }
            m106648a(r8)     // Catch:{ all -> 0x00ad }
            monitor-enter(r1)     // Catch:{ all -> 0x00ad }
            ct3.c r8 = ct3.C86139c.m106651a(r5)     // Catch:{ all -> 0x0074 }
            r1[r2] = r8     // Catch:{ all -> 0x0074 }
            monitor-exit(r1)     // Catch:{ all -> 0x0074 }
            monitor-exit(r0)
            return r8
        L_0x0074:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0074 }
            throw r8     // Catch:{ all -> 0x00ad }
        L_0x0077:
            monitor-enter(r1)     // Catch:{ all -> 0x00ad }
            r8 = -13
            ct3.c r8 = ct3.C86139c.m106651a(r8)     // Catch:{ all -> 0x008c }
            r1[r2] = r8     // Catch:{ all -> 0x008c }
            java.lang.String r8 = "MicroMsg.MsaIdManager"
            java.lang.String r3 = "[!] getOAID, too many attempts."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r3)     // Catch:{ all -> 0x008c }
            r8 = r1[r2]     // Catch:{ all -> 0x008c }
            monitor-exit(r1)     // Catch:{ all -> 0x008c }
            monitor-exit(r0)
            return r8
        L_0x008c:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x008c }
            throw r8     // Catch:{ all -> 0x00ad }
        L_0x008f:
            monitor-enter(r1)     // Catch:{ all -> 0x00ad }
            r8 = -10
            ct3.c r8 = ct3.C86139c.m106651a(r8)     // Catch:{ all -> 0x00a4 }
            r1[r2] = r8     // Catch:{ all -> 0x00a4 }
            java.lang.String r8 = "MicroMsg.MsaIdManager"
            java.lang.String r3 = "[!] getOAID, unsupported device."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r3)     // Catch:{ all -> 0x00a4 }
            r8 = r1[r2]     // Catch:{ all -> 0x00a4 }
            monitor-exit(r1)     // Catch:{ all -> 0x00a4 }
            monitor-exit(r0)
            return r8
        L_0x00a4:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00a4 }
            throw r8     // Catch:{ all -> 0x00ad }
        L_0x00a7:
            r8 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00a7 }
            throw r8     // Catch:{ all -> 0x00ad }
        L_0x00aa:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00aa }
            throw r8     // Catch:{ all -> 0x00ad }
        L_0x00ad:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ct3.C86135b.m106649b(android.content.Context):ct3.c");
    }

    /* renamed from: c */
    public static void m106650c() {
        boolean[] zArr = f250660c;
        synchronized (zArr) {
            zArr[0] = false;
        }
    }
}
