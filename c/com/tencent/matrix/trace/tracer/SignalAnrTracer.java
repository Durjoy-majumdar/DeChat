package com.tencent.matrix.trace.tracer;

import android.app.ActivityManager;
import android.app.Application;
import android.os.Process;
import com.tencent.p014mm.app.C80607n0;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import j20.C117292a;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k20.C9556a;
import org.json.JSONException;
import org.json.JSONObject;
import p1008mf.C88729a;
import p1029rf.C89960g;
import p1035sf.C90178a;
import p1035sf.C90183c;
import p269xe.C91185g;
import p723vf.C118672d;
import p723vf.C90773a;
import p723vf.C90779e;
import p761yd.C91440a;
import p761yd.C91441c;
import p995kf.C88146a;

public class SignalAnrTracer extends C89960g {

    /* renamed from: e */
    public static long f235561e = 20000;

    /* renamed from: f */
    public static boolean f235562f = false;

    /* renamed from: g */
    public static String f235563g = "";

    /* renamed from: h */
    public static String f235564h = "";

    /* renamed from: i */
    public static C80545c f235565i = null;

    /* renamed from: j */
    public static Application f235566j = null;

    /* renamed from: n */
    public static boolean f235567n = false;

    /* renamed from: o */
    public static boolean f235568o = false;

    /* renamed from: p */
    public static long f235569p = 0;

    /* renamed from: q */
    public static String f235570q = "";

    /* renamed from: r */
    public static String f235571r = "";

    /* renamed from: s */
    public static String f235572s = "";

    /* renamed from: t */
    public static String f235573t = "";

    /* renamed from: u */
    public static long f235574u;

    /* renamed from: v */
    public static long f235575v;

    /* renamed from: com.tencent.matrix.trace.tracer.SignalAnrTracer$a */
    public class C80543a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f235576d;

        public C80543a(boolean z) {
            this.f235576d = z;
        }

        public void run() {
            boolean z = this.f235576d;
            boolean z2 = SignalAnrTracer.f235562f;
            int i = 0;
            while (i < 40) {
                i++;
                try {
                    if (SignalAnrTracer.m98141j()) {
                        SignalAnrTracer.m98144m(true, z);
                        return;
                    }
                    Thread.sleep(500);
                } catch (Throwable th) {
                    C118672d.m167352b("SignalAnrTracer", "checkErrorStateCycle error, e : " + th.getMessage(), new Object[0]);
                    return;
                }
            }
        }
    }

    /* renamed from: com.tencent.matrix.trace.tracer.SignalAnrTracer$b */
    public class C80544b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ CountDownLatch f235577d;

        public C80544b(CountDownLatch countDownLatch) {
            this.f235577d = countDownLatch;
        }

        public void run() {
            BufferedReader bufferedReader;
            SignalAnrTracer.f235575v = System.currentTimeMillis();
            C118672d.m167353c("SignalAnrTracer", "onANRDumped", new Object[0]);
            String b = C90183c.m112854b();
            SignalAnrTracer.f235572s = b;
            C118672d.m167353c("SignalAnrTracer", "onANRDumped, stackTrace = %s, duration = %d", b, Long.valueOf(System.currentTimeMillis() - SignalAnrTracer.f235575v));
            StringBuilder sb = new StringBuilder();
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/self/cgroup")));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append("\n");
                }
                bufferedReader.close();
            } catch (Throwable unused) {
            }
            SignalAnrTracer.f235571r = sb.toString();
            C118672d.m167353c("SignalAnrTracer", "onANRDumped, read cgroup duration = %d", Long.valueOf(System.currentTimeMillis() - SignalAnrTracer.f235575v));
            SignalAnrTracer.f235562f = C90178a.m112843a();
            C118672d.m167353c("SignalAnrTracer", "onANRDumped, isInterestingToUser duration = %d", Long.valueOf(System.currentTimeMillis() - SignalAnrTracer.f235575v));
            SignalAnrTracer.m98142k(true);
            this.f235577d.countDown();
            return;
            throw th;
        }
    }

    /* renamed from: com.tencent.matrix.trace.tracer.SignalAnrTracer$c */
    public interface C80545c {
    }

    /* renamed from: com.tencent.matrix.trace.tracer.SignalAnrTracer$d */
    public static class C80546d {

        /* renamed from: a */
        public final Pattern f235578a = Pattern.compile("^\"(.*?)\" .*? tid=(\\d+) \\w+$");

        /* renamed from: b */
        public final Pattern f235579b = Pattern.compile("^  - .*?\\(a (.*?)\\) held by thread (\\d+)$");

        /* renamed from: c */
        public final StringBuilder f235580c = new StringBuilder();

        /* renamed from: d */
        public final HashMap<Integer, C80547b> f235581d = new HashMap<>();

        /* renamed from: e */
        public LinkedList<C80547b> f235582e = new LinkedList<>();

        /* renamed from: f */
        public String f235583f = "";

        /* renamed from: g */
        public boolean f235584g = false;

        /* renamed from: h */
        public C80547b f235585h = new C80547b();

        /* renamed from: com.tencent.matrix.trace.tracer.SignalAnrTracer$d$a */
        public static class C0965a<F, S> implements Map.Entry<F, S> {

            /* renamed from: d */
            public F f2310d;

            /* renamed from: e */
            public S f2311e;

            public C0965a(F f, S s) {
                this.f2310d = f;
                this.f2311e = s;
            }

            public F getKey() {
                return this.f2310d;
            }

            public S getValue() {
                return this.f2311e;
            }

            public S setValue(S s) {
                this.f2311e = s;
                return s;
            }

            public String toString() {
                return "Pair{f=" + this.f2310d + ", s=" + this.f2311e + '}';
            }
        }

        /* renamed from: com.tencent.matrix.trace.tracer.SignalAnrTracer$d$b */
        public static class C80547b {

            /* renamed from: a */
            public int f235586a;

            /* renamed from: b */
            public String f235587b;

            /* renamed from: c */
            public String f235588c;

            /* renamed from: d */
            public int f235589d = -1;

            /* renamed from: e */
            public int f235590e = 0;
        }

        public C80546d(C80543a aVar) {
        }

        /* renamed from: a */
        public final C80547b mo112127a(C80547b bVar) {
            C80547b a;
            this.f235582e.addLast(bVar);
            bVar.f235590e = 1;
            C80547b bVar2 = this.f235581d.get(Integer.valueOf(bVar.f235589d));
            if (bVar2 != null) {
                int i = bVar2.f235590e;
                if (i == 1) {
                    return bVar2;
                }
                if (i == 0 && (a = mo112127a(bVar2)) != null) {
                    return a;
                }
            }
            bVar.f235590e = 2;
            this.f235582e.removeLast();
            return null;
        }

        /* renamed from: b */
        public Map.Entry<int[], String[]> mo112128b() {
            if (this.f235582e.size() == 0) {
                return new C0965a(null, null);
            }
            int[] iArr = new int[this.f235582e.size()];
            String[] strArr = new String[this.f235582e.size()];
            int i = 0;
            Iterator<C80547b> it = this.f235582e.iterator();
            while (it.hasNext()) {
                C80547b next = it.next();
                iArr[i] = next.f235586a;
                strArr[i] = next.f235588c;
                i++;
            }
            return new C0965a(iArr, strArr);
        }

        /* renamed from: c */
        public boolean mo112129c() {
            mo112130d("");
            this.f235582e.clear();
            for (Map.Entry<Integer, C80547b> value : this.f235581d.entrySet()) {
                C80547b bVar = (C80547b) value.getValue();
                if (bVar.f235590e == 0 && (r1 = mo112127a(bVar)) != null) {
                    while (this.f235582e.size() > 0 && this.f235582e.getFirst() != r1) {
                        this.f235582e.removeFirst();
                    }
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public void mo112130d(String str) {
            if (str.isEmpty()) {
                this.f235584g = false;
                if (this.f235580c.length() > 0 && this.f235585h.f235589d >= 0) {
                    String sb = this.f235580c.toString();
                    C80547b bVar = this.f235585h;
                    int i = bVar.f235586a;
                    if (i == 1) {
                        this.f235583f = sb;
                    }
                    bVar.f235587b = sb;
                    this.f235581d.put(Integer.valueOf(i), this.f235585h);
                    this.f235585h = new C80547b();
                }
            } else if (!this.f235584g) {
                Matcher matcher = this.f235578a.matcher(str);
                if (matcher.find()) {
                    this.f235584g = true;
                    this.f235580c.setLength(0);
                    StringBuilder sb4 = this.f235580c;
                    sb4.append(str);
                    sb4.append(10);
                    try {
                        C80547b bVar2 = this.f235585h;
                        String group = matcher.group(2);
                        Objects.requireNonNull(group);
                        bVar2.f235586a = Integer.parseInt(group);
                    } catch (Exception e) {
                        C118672d.m167352b("SignalAnrTracer", e.toString(), new Object[0]);
                    }
                }
            } else {
                Matcher matcher2 = this.f235579b.matcher(str);
                if (matcher2.find()) {
                    try {
                        this.f235585h.f235588c = matcher2.group(1);
                        C80547b bVar3 = this.f235585h;
                        String group2 = matcher2.group(2);
                        Objects.requireNonNull(group2);
                        bVar3.f235589d = Integer.parseInt(group2);
                    } catch (Exception e2) {
                        C118672d.m167352b("SignalAnrTracer", e2.toString(), new Object[0]);
                    }
                }
                StringBuilder sb5 = this.f235580c;
                sb5.append(str);
                sb5.append(10);
            }
        }
    }

    static {
        C9556a aVar = new C9556a();
        aVar.mo10233c("trace-canary");
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/matrix/trace/tracer/SignalAnrTracer", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar.mo10231a(0));
        C117292a.m165359e(obj, "com/tencent/matrix/trace/tracer/SignalAnrTracer", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public SignalAnrTracer(Application application, String str, String str2) {
        f235568o = true;
        f235563g = str;
        f235564h = str2;
        f235566j = application;
    }

    /* renamed from: j */
    public static boolean m98141j() {
        try {
            C118672d.m167353c("SignalAnrTracer", "[checkErrorState] start", new Object[0]);
            Application application = f235566j;
            if (application == null) {
                application = C91441c.m114730d().f262168b;
            }
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = ((ActivityManager) application.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getProcessesInErrorState();
            if (processesInErrorState == null) {
                C118672d.m167353c("SignalAnrTracer", "[checkErrorState] procs == null", new Object[0]);
                return false;
            }
            for (ActivityManager.ProcessErrorStateInfo next : processesInErrorState) {
                C118672d.m167353c("SignalAnrTracer", "[checkErrorState] found Error State proccessName = %s, proc.condition = %d", next.processName, Integer.valueOf(next.condition));
                if (next.uid != Process.myUid() && next.condition == 2) {
                    C118672d.m167353c("SignalAnrTracer", "maybe received other apps ANR signal", new Object[0]);
                    return false;
                } else if (next.pid == Process.myPid()) {
                    if (next.condition == 2) {
                        C118672d.m167353c("SignalAnrTracer", "error sate longMsg = %s", next.longMsg);
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            C118672d.m167352b("SignalAnrTracer", "[checkErrorState] error : %s", th.getMessage());
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0084  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m98142k(boolean r7) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "confirmRealAnr, isSigQuit = "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "SignalAnrTracer"
            p723vf.C118672d.m167353c(r3, r0, r2)
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x0074 }
            android.os.MessageQueue r0 = r0.getQueue()     // Catch:{ Exception -> 0x0074 }
            java.lang.Class r2 = r0.getClass()     // Catch:{ Exception -> 0x0074 }
            java.lang.String r4 = "mMessages"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r4)     // Catch:{ Exception -> 0x0074 }
            r4 = 1
            r2.setAccessible(r4)     // Catch:{ Exception -> 0x0074 }
            java.lang.Object r0 = r2.get(r0)     // Catch:{ Exception -> 0x0074 }
            android.os.Message r0 = (android.os.Message) r0     // Catch:{ Exception -> 0x0074 }
            if (r0 == 0) goto L_0x0076
            java.lang.String r2 = r0.toString()     // Catch:{ Exception -> 0x0074 }
            f235570q = r2     // Catch:{ Exception -> 0x0074 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0074 }
            r2.<init>()     // Catch:{ Exception -> 0x0074 }
            java.lang.String r5 = "anrMessageString = "
            r2.append(r5)     // Catch:{ Exception -> 0x0074 }
            java.lang.String r5 = f235570q     // Catch:{ Exception -> 0x0074 }
            r2.append(r5)     // Catch:{ Exception -> 0x0074 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0074 }
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0074 }
            p723vf.C118672d.m167353c(r3, r2, r5)     // Catch:{ Exception -> 0x0074 }
            long r2 = r0.getWhen()     // Catch:{ Exception -> 0x0074 }
            r5 = 0
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0060
            goto L_0x0074
        L_0x0060:
            long r5 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0074 }
            long r2 = r2 - r5
            f235569p = r2     // Catch:{ Exception -> 0x0074 }
            r5 = -10000(0xffffffffffffd8f0, double:NaN)
            boolean r0 = f235562f     // Catch:{ Exception -> 0x0074 }
            if (r0 == 0) goto L_0x006f
            r5 = -2000(0xfffffffffffff830, double:NaN)
        L_0x006f:
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0074
            goto L_0x007e
        L_0x0074:
            r4 = 0
            goto L_0x007e
        L_0x0076:
            java.lang.String r0 = "mMessage is null"
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0074 }
            p723vf.C118672d.m167353c(r3, r0, r2)     // Catch:{ Exception -> 0x0074 }
            goto L_0x0074
        L_0x007e:
            if (r4 == 0) goto L_0x0084
            m98144m(r1, r7)
            goto L_0x0093
        L_0x0084:
            java.lang.Thread r0 = new java.lang.Thread
            com.tencent.matrix.trace.tracer.SignalAnrTracer$a r1 = new com.tencent.matrix.trace.tracer.SignalAnrTracer$a
            r1.<init>(r7)
            java.lang.String r7 = "Check-ANR-State-Thread"
            r0.<init>(r1, r7)
            r0.start()
        L_0x0093:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.trace.tracer.SignalAnrTracer.m98142k(boolean):void");
    }

    /* renamed from: l */
    public static void m98143l() {
        if (!f235568o) {
            C118672d.m167352b("SignalAnrTracer", "SignalAnrTracer has not been initialize", new Object[0]);
        } else if (f235564h.equals("")) {
            C118672d.m167352b("SignalAnrTracer", "PrintTraceFilePath has not been set", new Object[0]);
        } else {
            nativePrintTrace();
        }
    }

    /* renamed from: m */
    public static void m98144m(boolean z, boolean z2) {
        try {
            C80545c cVar = f235565i;
            if (cVar == null) {
                C88146a aVar = (C88146a) C91441c.m114730d().mo125377a(C88146a.class);
                if (aVar != null) {
                    String a = C91440a.INSTANCE.mo125374a();
                    JSONObject jSONObject = new JSONObject();
                    C90773a.m113838d(jSONObject, C91441c.m114730d().f262168b);
                    if (z2) {
                        jSONObject.put("detail", C88729a.SIGNAL_ANR);
                        jSONObject.put("threadStack", f235572s);
                    } else {
                        jSONObject.put("detail", C88729a.SIGNAL_ANR_NATIVE_BACKTRACE);
                        jSONObject.put("threadStack", f235573t);
                    }
                    jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, a);
                    jSONObject.put("isProcessForeground", f235562f);
                    C91185g gVar = new C91185g();
                    gVar.f261444b = "Trace_EvilMethod";
                    gVar.f261446d = jSONObject;
                    aVar.onDetectIssue(gVar);
                    C118672d.m167352b("SignalAnrTracer", "happens real ANR : %s ", jSONObject.toString());
                    f235574u = System.currentTimeMillis();
                    return;
                }
            } else if (z2) {
                ((C80607n0) cVar).mo112348a(f235572s, f235570q, f235569p, z, f235571r);
            } else {
                ((C80607n0) cVar).mo112351d(f235573t, f235570q, f235569p, z);
            }
            f235574u = System.currentTimeMillis();
        } catch (JSONException e) {
            C118672d.m167352b("SignalAnrTracer", "[JSONException error: %s", e);
        } catch (Throwable th) {
            f235574u = System.currentTimeMillis();
            throw th;
        }
    }

    private static native void nativeFreeSignalAnrDetective();

    private static native void nativeInitSignalAnrDetective(String str, String str2);

    private static native void nativePrintTrace();

    /* JADX WARNING: Removed duplicated region for block: B:28:0x006e A[Catch:{ all -> 0x0067, all -> 0x00bb, all -> 0x00c0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void onANRDumpTrace() {
        /*
            java.lang.String r0 = "SignalAnrTracer"
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x00c0 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x00c0 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ all -> 0x00c0 }
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x00c0 }
            java.lang.String r6 = f235563g     // Catch:{ all -> 0x00c0 }
            r5.<init>(r6)     // Catch:{ all -> 0x00c0 }
            r4.<init>(r5)     // Catch:{ all -> 0x00c0 }
            java.lang.String r5 = "UTF-8"
            r3.<init>(r4, r5)     // Catch:{ all -> 0x00c0 }
            r2.<init>(r3)     // Catch:{ all -> 0x00c0 }
            com.tencent.matrix.trace.tracer.SignalAnrTracer$d r3 = new com.tencent.matrix.trace.tracer.SignalAnrTracer$d     // Catch:{ all -> 0x0067 }
            r4 = 0
            r3.<init>(r4)     // Catch:{ all -> 0x0067 }
        L_0x0021:
            java.lang.String r4 = r2.readLine()     // Catch:{ all -> 0x0067 }
            if (r4 == 0) goto L_0x0030
            r3.mo112130d(r4)     // Catch:{ all -> 0x0067 }
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ all -> 0x0067 }
            p723vf.C118672d.m167353c(r0, r4, r5)     // Catch:{ all -> 0x0067 }
            goto L_0x0021
        L_0x0030:
            com.tencent.matrix.trace.tracer.SignalAnrTracer$c r4 = f235565i     // Catch:{ all -> 0x0067 }
            if (r4 == 0) goto L_0x00b3
            boolean r4 = r3.mo112129c()     // Catch:{ all -> 0x0067 }
            if (r4 == 0) goto L_0x00a0
            com.tencent.matrix.trace.tracer.SignalAnrTracer$c r4 = f235565i     // Catch:{ all -> 0x0067 }
            java.lang.String r5 = r3.f235583f     // Catch:{ all -> 0x0067 }
            java.util.LinkedList<com.tencent.matrix.trace.tracer.SignalAnrTracer$d$b> r6 = r3.f235582e     // Catch:{ all -> 0x0067 }
            java.lang.String r7 = ""
            if (r6 == 0) goto L_0x0069
            int r6 = r6.size()     // Catch:{ all -> 0x0067 }
            if (r6 != 0) goto L_0x004b
            goto L_0x0069
        L_0x004b:
            java.util.LinkedList<com.tencent.matrix.trace.tracer.SignalAnrTracer$d$b> r6 = r3.f235582e     // Catch:{ all -> 0x0067 }
            java.lang.Object r6 = r6.get(r1)     // Catch:{ all -> 0x0067 }
            com.tencent.matrix.trace.tracer.SignalAnrTracer$d$b r6 = (com.tencent.matrix.trace.tracer.SignalAnrTracer.C80546d.C80547b) r6     // Catch:{ all -> 0x0067 }
            int r6 = r6.f235586a     // Catch:{ all -> 0x0067 }
            java.util.HashMap<java.lang.Integer, com.tencent.matrix.trace.tracer.SignalAnrTracer$d$b> r8 = r3.f235581d     // Catch:{ all -> 0x0067 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0067 }
            java.lang.Object r6 = r8.get(r6)     // Catch:{ all -> 0x0067 }
            com.tencent.matrix.trace.tracer.SignalAnrTracer$d$b r6 = (com.tencent.matrix.trace.tracer.SignalAnrTracer.C80546d.C80547b) r6     // Catch:{ all -> 0x0067 }
            if (r6 != 0) goto L_0x0064
            goto L_0x0069
        L_0x0064:
            java.lang.String r6 = r6.f235587b     // Catch:{ all -> 0x0067 }
            goto L_0x006a
        L_0x0067:
            r3 = move-exception
            goto L_0x00b7
        L_0x0069:
            r6 = r7
        L_0x006a:
            java.util.LinkedList<com.tencent.matrix.trace.tracer.SignalAnrTracer$d$b> r8 = r3.f235582e     // Catch:{ all -> 0x0067 }
            if (r8 == 0) goto L_0x0096
            int r8 = r8.size()     // Catch:{ all -> 0x0067 }
            if (r8 != 0) goto L_0x0075
            goto L_0x0096
        L_0x0075:
            java.util.LinkedList<com.tencent.matrix.trace.tracer.SignalAnrTracer$d$b> r8 = r3.f235582e     // Catch:{ all -> 0x0067 }
            int r9 = r8.size()     // Catch:{ all -> 0x0067 }
            int r9 = r9 + -1
            java.lang.Object r8 = r8.get(r9)     // Catch:{ all -> 0x0067 }
            com.tencent.matrix.trace.tracer.SignalAnrTracer$d$b r8 = (com.tencent.matrix.trace.tracer.SignalAnrTracer.C80546d.C80547b) r8     // Catch:{ all -> 0x0067 }
            int r8 = r8.f235586a     // Catch:{ all -> 0x0067 }
            java.util.HashMap<java.lang.Integer, com.tencent.matrix.trace.tracer.SignalAnrTracer$d$b> r9 = r3.f235581d     // Catch:{ all -> 0x0067 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0067 }
            java.lang.Object r8 = r9.get(r8)     // Catch:{ all -> 0x0067 }
            com.tencent.matrix.trace.tracer.SignalAnrTracer$d$b r8 = (com.tencent.matrix.trace.tracer.SignalAnrTracer.C80546d.C80547b) r8     // Catch:{ all -> 0x0067 }
            if (r8 != 0) goto L_0x0094
            goto L_0x0096
        L_0x0094:
            java.lang.String r7 = r8.f235587b     // Catch:{ all -> 0x0067 }
        L_0x0096:
            java.util.Map$Entry r3 = r3.mo112128b()     // Catch:{ all -> 0x0067 }
            com.tencent.mm.app.n0 r4 = (com.tencent.p014mm.app.C80607n0) r4     // Catch:{ all -> 0x0067 }
            r4.mo112349b(r5, r6, r7, r3)     // Catch:{ all -> 0x0067 }
            goto L_0x00b3
        L_0x00a0:
            java.lang.String r4 = r3.f235583f     // Catch:{ all -> 0x0067 }
            java.lang.String r5 = "android.os.MessageQueue.nativePollOnce"
            boolean r4 = r4.contains(r5)     // Catch:{ all -> 0x0067 }
            if (r4 == 0) goto L_0x00b3
            com.tencent.matrix.trace.tracer.SignalAnrTracer$c r4 = f235565i     // Catch:{ all -> 0x0067 }
            java.lang.String r3 = r3.f235583f     // Catch:{ all -> 0x0067 }
            com.tencent.mm.app.n0 r4 = (com.tencent.p014mm.app.C80607n0) r4     // Catch:{ all -> 0x0067 }
            r4.mo112350c(r3)     // Catch:{ all -> 0x0067 }
        L_0x00b3:
            r2.close()     // Catch:{ all -> 0x00c0 }
            goto L_0x00ec
        L_0x00b7:
            r2.close()     // Catch:{ all -> 0x00bb }
            goto L_0x00bf
        L_0x00bb:
            r2 = move-exception
            r3.addSuppressed(r2)     // Catch:{ all -> 0x00c0 }
        L_0x00bf:
            throw r3     // Catch:{ all -> 0x00c0 }
        L_0x00c0:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00dd }
            r3.<init>()     // Catch:{ all -> 0x00dd }
            java.lang.String r4 = "printFileByLine failed e : "
            r3.append(r4)     // Catch:{ all -> 0x00dd }
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x00dd }
            r3.append(r2)     // Catch:{ all -> 0x00dd }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x00dd }
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ all -> 0x00dd }
            p723vf.C118672d.m167352b(r0, r2, r3)     // Catch:{ all -> 0x00dd }
            goto L_0x00ec
        L_0x00dd:
            r2 = move-exception
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r2 = r2.getMessage()
            r3[r1] = r2
            java.lang.String r1 = "onANRDumpTrace error: %s"
            p723vf.C118672d.m167352b(r0, r1, r3)
        L_0x00ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.trace.tracer.SignalAnrTracer.onANRDumpTrace():void");
    }

    private static synchronized void onANRDumped() {
        synchronized (SignalAnrTracer.class) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new C80544b(countDownLatch), "ANR-Dump-Thread").start();
            try {
                countDownLatch.await(f235561e, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
            }
        }
    }

    private static void onNativeBacktraceDumped() {
        C118672d.m167353c("SignalAnrTracer", "happens onNativeBacktraceDumped", new Object[0]);
        if (System.currentTimeMillis() - f235574u < 20000) {
            C118672d.m167353c("SignalAnrTracer", "report SIGQUIT recently, just return", new Object[0]);
            return;
        }
        f235573t = C90183c.m112854b();
        C118672d.m167353c("SignalAnrTracer", "happens onNativeBacktraceDumped, mainThreadStackTrace = " + f235572s, new Object[0]);
        m98142k(false);
    }

    private static void onPrintTrace() {
        try {
            C90779e.m113850e("SignalAnrTracer", f235564h);
        } catch (Throwable th) {
            C118672d.m167352b("SignalAnrTracer", "onPrintTrace error: %s", th.getMessage());
        }
    }

    /* renamed from: f */
    public void mo112123f() {
        super.mo112123f();
        if (!f235567n) {
            nativeInitSignalAnrDetective(f235563g, f235564h);
            C90178a aVar = C90178a.INSTANCE;
            if (!aVar.f258899d) {
                aVar.f258899d = true;
            }
            f235567n = true;
        }
    }

    /* renamed from: h */
    public void mo112124h() {
        super.mo112124h();
        nativeFreeSignalAnrDetective();
    }
}
