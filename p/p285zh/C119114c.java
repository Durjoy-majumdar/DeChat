package p285zh;

import android.content.Intent;
import com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import java.util.LinkedHashMap;
import p1195ge.C116951c;
import p210o.C11323a;
import p329d3.C86165a;
import p988jj.C87968a;
import te3.C50886px;
import te3.C77949j3;
import zt3.C119157j;

/* renamed from: zh.c */
public final class C119114c {

    /* renamed from: a */
    public static boolean f356684a;

    /* renamed from: b */
    public static boolean f356685b;

    /* renamed from: c */
    public static long f356686c;

    /* renamed from: d */
    public static final c$$e f356687d = new c$$e("push-notify");

    /* renamed from: e */
    public static final c$$e f356688e = new c$$e("receive-notify");

    /* renamed from: f */
    public static final c$$e f356689f = new c$$e("net-scene");

    /* renamed from: g */
    public static final c$$e f356690g = new c$$e("net-sync");

    /* renamed from: h */
    public static final c$$e f356691h = new c$$e("net-minSync");

    /* renamed from: i */
    public static final c$$e f356692i = new c$$e("net-syncCmd");

    /* renamed from: j */
    public static final c$$e f356693j = new c$$e("msg-type");

    /* renamed from: k */
    public static final c$$e f356694k = new c$$e("msg-appType");

    /* renamed from: l */
    public static final c$$e f356695l = new c$$e("msg-xmlType");

    /* renamed from: m */
    public static final c$$e f356696m = new c$$e("msg-action");

    /* renamed from: n */
    public static final c$$e f356697n = new c$$e("msg-mute");

    /* renamed from: o */
    public static final c$$e f356698o = new c$$e("msg-empty");

    /* renamed from: p */
    public static final c$$e f356699p = new c$$e("msg-notify");

    /* renamed from: q */
    public static final c$$e f356700q = new c$$e("msg-notifyClick");

    /* renamed from: r */
    public static C86165a<Integer> f356701r = new c$$a();

    /* renamed from: s */
    public static C86165a<Integer> f356702s = new c$$a();

    /* renamed from: t */
    public static C11323a<C77949j3, Integer> f356703t = new c$$b();

    /* renamed from: a */
    public static void m167916a() {
        if (MMApplicationContext.isMainProcess()) {
            f356687d.mo183787a();
            f356688e.mo183787a();
            f356689f.mo183787a();
            f356690g.mo183787a();
            f356691h.mo183787a();
            f356692i.mo183787a();
            f356693j.mo183787a();
            f356694k.mo183787a();
            f356695l.mo183787a();
            f356696m.mo183787a();
            f356697n.mo183787a();
            f356698o.mo183787a();
            f356699p.mo183787a();
            f356700q.mo183787a();
        }
    }

    /* renamed from: b */
    public static void m167917b() {
        Log.m105924i("MicroMsg.NotifyPowerInspector", "#clear");
        c$$e c__e = f356687d;
        c__e.f356707c = 0;
        c__e.f356710f = 0;
        c$$e c__e2 = f356689f;
        c__e2.f356707c = 0;
        c__e2.f356710f = 0;
        c$$e c__e3 = f356693j;
        c__e3.f356707c = 0;
        c__e3.f356710f = 0;
        f356686c = 0;
        MultiProcessMMKV.getMMKV("notify-inspect.bin").clearAll();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        r8 = r8.f356705a;
        r1 = 0;
        r0 = r0.entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004f, code lost:
        if (r0.hasNext() == false) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0051, code lost:
        r4 = (java.util.Map.Entry) r0.next();
        r5 = java.lang.String.valueOf(r4.getKey());
        r4 = ((java.lang.Integer) r4.getValue()).intValue();
        r2 = r2 + ((long) r4);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006d, code lost:
        if (r12 <= 0) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006f, code lost:
        if (r1 >= r12) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0071, code lost:
        r11.put(r8 + "-" + r1 + "-key", r5);
        r11.put(r8 + "-" + r1 + "-val", java.lang.Integer.valueOf(r4));
        r6 = new java.lang.StringBuilder();
        r6.append(r8);
        r6.append("-@-");
        r6.append(r5);
        r11.put(r6.toString(), java.lang.Integer.valueOf(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00c9, code lost:
        r9 = p1195ge.C116951c.m165015p((((double) r2) * 1.0d) / ((double) r9), 2);
        r11.put(r8 + "-count", java.lang.Long.valueOf(r2));
        r11.put(r8 + "-countAvg", java.lang.Double.valueOf(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0105, code lost:
        return r2;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m167918c(p285zh.c$$e r8, long r9, java.util.Map<java.lang.String, java.lang.Object> r11, int r12) {
        /*
            monitor-enter(r8)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r8.f356706b     // Catch:{ all -> 0x0106 }
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x0106 }
            r2 = 0
            if (r1 == 0) goto L_0x000d
            monitor-exit(r8)     // Catch:{ all -> 0x0106 }
            return r2
        L_0x000d:
            zh.c$$c r1 = new zh.c$$c     // Catch:{ all -> 0x0106 }
            r1.<init>()     // Catch:{ all -> 0x0106 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0106 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0106 }
            r4.<init>(r0)     // Catch:{ all -> 0x0106 }
            java.util.Collections.sort(r4, r1)     // Catch:{ all -> 0x0106 }
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0106 }
            r0.<init>()     // Catch:{ all -> 0x0106 }
            java.util.Iterator r1 = r4.iterator()     // Catch:{ all -> 0x0106 }
        L_0x0027:
            boolean r4 = r1.hasNext()     // Catch:{ all -> 0x0106 }
            if (r4 == 0) goto L_0x003f
            java.lang.Object r4 = r1.next()     // Catch:{ all -> 0x0106 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ all -> 0x0106 }
            java.lang.Object r5 = r4.getKey()     // Catch:{ all -> 0x0106 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x0106 }
            r0.put(r5, r4)     // Catch:{ all -> 0x0106 }
            goto L_0x0027
        L_0x003f:
            monitor-exit(r8)     // Catch:{ all -> 0x0106 }
            java.lang.String r8 = r8.f356705a
            r1 = 0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x004b:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x00c9
            java.lang.Object r4 = r0.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.Object r4 = r4.getValue()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            long r6 = (long) r4
            long r2 = r2 + r6
            int r1 = r1 + 1
            if (r12 <= 0) goto L_0x0071
            if (r1 >= r12) goto L_0x004b
        L_0x0071:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r8)
            java.lang.String r7 = "-"
            r6.append(r7)
            r6.append(r1)
            java.lang.String r7 = "-key"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r11.put(r6, r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r8)
            java.lang.String r7 = "-"
            r6.append(r7)
            r6.append(r1)
            java.lang.String r7 = "-val"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            r11.put(r6, r7)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r8)
            java.lang.String r7 = "-@-"
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r11.put(r5, r4)
            goto L_0x004b
        L_0x00c9:
            double r0 = (double) r2
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 * r4
            double r9 = (double) r9
            double r0 = r0 / r9
            r9 = 2
            double r9 = p1195ge.C116951c.m165015p(r0, r9)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r8)
            java.lang.String r0 = "-count"
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r11.put(r12, r0)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r8)
            java.lang.String r8 = "-countAvg"
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            java.lang.Double r9 = java.lang.Double.valueOf(r9)
            r11.put(r8, r9)
            return r2
        L_0x0106:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0106 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p285zh.C119114c.m167918c(zh.c$$e, long, java.util.Map, int):long");
    }

    /* renamed from: d */
    public static void m167919d() {
        Log.m105924i("MicroMsg.NotifyPowerInspector", "#load");
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("notify-inspect.bin");
        c$$e c__e = f356687d;
        c__e.f356707c = mmkv.getLong(c__e.f356705a + "-count", 0);
        c__e.f356710f = mmkv.getLong(c__e.f356705a + "-during", 0);
        c$$e c__e2 = f356689f;
        c__e2.f356707c = mmkv.getLong(c__e2.f356705a + "-count", 0);
        c__e2.f356710f = mmkv.getLong(c__e2.f356705a + "-during", 0);
        c$$e c__e3 = f356693j;
        c__e3.f356707c = mmkv.getLong(c__e3.f356705a + "-count", 0);
        c__e3.f356710f = mmkv.getLong(c__e3.f356705a + "-during", 0);
        f356686c = mmkv.getLong("light-push-during", 0);
    }

    /* renamed from: e */
    public static void m167920e(String str, String str2) {
        if (f356684a) {
            Log.m105924i(str, str2);
        }
    }

    /* renamed from: f */
    public static void m167921f(String str) {
        m167920e("MicroMsg.NotifyPowerInspector", "noteAddMsgAction: act=" + str);
        if (MMApplicationContext.isMainProcess() && AppExplicitBackgroundOwner.INSTANCE.isBackground()) {
            c$$e c__e = f356696m;
            if (c__e.mo183788b() || !f356685b) {
                c__e.mo183789c(str);
            }
        }
    }

    /* renamed from: g */
    public static void m167922g(String str) {
        m167920e("MicroMsg.NotifyPowerInspector", "noteAddMsgActionMute: reason=" + str);
        if (MMApplicationContext.isMainProcess() && AppExplicitBackgroundOwner.INSTANCE.isBackground()) {
            m167921f("mute");
            c$$e c__e = f356697n;
            if (c__e.mo183788b() || !f356685b) {
                c__e.mo183789c(str);
            }
        }
    }

    /* renamed from: h */
    public static void m167923h(Intent intent, String str) {
        m167920e("MicroMsg.NotifyPowerInspector", "noteAddMsgNotifySend: from=" + str);
        if (AppExplicitBackgroundOwner.INSTANCE.isBackground()) {
            m167921f("sendNotify");
            intent.putExtra("MainUI_User_Last_Msg_BgNotify_From", str);
        }
    }

    /* renamed from: i */
    public static void m167924i(String str, C50886px pxVar) {
        m167920e("MicroMsg.NotifyPowerInspector", "netSynCmd: cmd=" + pxVar.f140037d + ", from=" + str);
        if (MMApplicationContext.isMainProcess() && AppExplicitBackgroundOwner.INSTANCE.isBackground()) {
            c$$e c__e = f356692i;
            if (c__e.mo183788b() || !f356685b) {
                c__e.mo183789c(String.valueOf(pxVar.f140037d));
            }
            if (pxVar.f140037d == 5) {
                ((C119157j) C119157j.f356862d).mo183875f(new c$$d(pxVar));
            }
        }
    }

    /* renamed from: j */
    public static void m167925j(int i) {
        m167920e("MicroMsg.NotifyPowerInspector", "receiveNotify: func=" + i);
        if (MMApplicationContext.isMainProcess() && AppExplicitBackgroundOwner.INSTANCE.isBackground()) {
            c$$e c__e = f356688e;
            if (c__e.mo183788b() || !f356685b) {
                c__e.mo183789c(String.valueOf(i));
            }
        }
    }

    /* renamed from: k */
    public static void m167926k(long j, boolean z) {
        boolean z2;
        long j2 = j;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c$$e c__e = f356687d;
        long c = m167918c(c__e, j2, linkedHashMap, 5);
        long c2 = m167918c(f356688e, j2, linkedHashMap, 5);
        c$$e c__e2 = f356689f;
        long c3 = m167918c(c__e2, j2, linkedHashMap, 5);
        long c4 = m167918c(f356690g, j2, linkedHashMap, 5);
        c$$e c__e3 = c__e2;
        long c5 = m167918c(f356691h, j2, linkedHashMap, 5);
        long c6 = m167918c(f356692i, j2, linkedHashMap, 5);
        c$$e c__e4 = f356693j;
        long j3 = c6;
        c$$e c__e5 = c__e4;
        long c7 = m167918c(c__e4, j2, linkedHashMap, 5);
        long c8 = m167918c(f356694k, j2, linkedHashMap, 5);
        long c9 = m167918c(f356695l, j2, linkedHashMap, 5);
        long c15 = m167918c(f356696m, j2, linkedHashMap, 0);
        long c16 = m167918c(f356697n, j2, linkedHashMap, 0);
        long c17 = m167918c(f356698o, j2, linkedHashMap, 5);
        long c18 = m167918c(f356699p, j2, linkedHashMap, 5);
        c$$e c__e6 = c__e;
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        long c19 = m167918c(f356700q, j2, linkedHashMap, 5);
        long j4 = c18;
        double d = (double) j2;
        double d2 = (((double) c) * 1.0d) / d;
        double d3 = d2;
        if (d2 >= 15.0d) {
            Log.m105924i("MicroMsg.NotifyPowerInspector", "#overHeat");
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || f356684a) {
            boolean z3 = z2;
            long currentTimeMillis = System.currentTimeMillis();
            double d4 = d;
            long j5 = currentTimeMillis - (j2 * 60000);
            LinkedHashMap linkedHashMap3 = linkedHashMap2;
            long j6 = c4;
            long j7 = c3;
            long j8 = 0;
            long j9 = MultiProcessMMKV.getDefault().getLong("notify_power_light_push_on_ms", 0);
            long j15 = c2;
            long j16 = MultiProcessMMKV.getDefault().getLong("notify_power_light_push_off_ms", 0);
            if (j16 <= j9 && j9 > 0) {
                j16 = currentTimeMillis;
            }
            if (j9 > 0 && j9 < j16 && j5 <= j16 && currentTimeMillis >= j9) {
                long max = Math.max(j5, j9);
                long min = Math.min(currentTimeMillis, j16);
                if (min > max) {
                    long j17 = min - max;
                    Log.m105918d("MicroMsg.NotifyPowerInspector", "lightPushMs=" + j17);
                    if (j17 > 10000) {
                        j8 = Math.max(1, j17 / 60000);
                    }
                }
            }
            String str = z ? "reportBgNotifyPoll" : "reportBgNotify";
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(": minute=");
            sb.append(j2);
            sb.append(", lightPushMn=");
            sb.append(j8);
            sb.append(", pushNotifyCount=");
            sb.append(c);
            sb.append(", receiveNotifyCount=");
            long j18 = j15;
            sb.append(j18);
            sb.append(", netSceneCount=");
            sb.append(j7);
            sb.append(", netSyncCount=");
            long j19 = j6;
            sb.append(j19);
            sb.append(", netMinSyncCount=");
            long j25 = c5;
            sb.append(j25);
            sb.append(", netSyncCmdCount=");
            sb.append(j3);
            sb.append(", addMsgTypeCount=");
            sb.append(c7);
            sb.append(", addAppMsgTypeCount=");
            sb.append(c8);
            sb.append(", addXmlMsgTypeCount=");
            sb.append(c9);
            sb.append(", addMsgActionCount=");
            sb.append(c15);
            sb.append(", addMsgMuteCount=");
            sb.append(c16);
            sb.append(", addMsgEmptyCount=");
            sb.append(c17);
            sb.append(", addMsgNotifyCount=");
            sb.append(j4);
            sb.append(", addMsgNotifyClickCount=");
            sb.append(c19);
            sb.append(", addictedNotifyDuringMs=");
            c$$e c__e7 = c__e6;
            sb.append(c__e7.f356709e);
            sb.append(", addictedNetDuringMs=");
            c$$e c__e8 = c__e3;
            sb.append(c__e8.f356709e);
            sb.append(", addictedMsgDuringMs=");
            c$$e c__e9 = c__e5;
            sb.append(c__e9.f356709e);
            m167920e("MicroMsg.NotifyPowerInspector", sb.toString());
            LinkedHashMap linkedHashMap4 = linkedHashMap3;
            linkedHashMap4.put("trace-more", Boolean.valueOf(f356684a));
            linkedHashMap4.put("trace-addicted", Boolean.valueOf(f356685b));
            linkedHashMap4.put("minute", Long.valueOf(j));
            linkedHashMap4.put("minute-lightPush", Long.valueOf(j8));
            linkedHashMap4.put("msg-addictNtf-during", Long.valueOf(c__e7.f356709e));
            linkedHashMap4.put("msg-addictNtf-duringAvg", Double.valueOf(C116951c.m165015p((((double) c__e7.f356709e) * 1.0d) / d4, 2)));
            linkedHashMap4.put("msg-addictNet-during", Long.valueOf(c__e8.f356709e));
            linkedHashMap4.put("msg-addictNet-duringAvg", Double.valueOf(C116951c.m165015p((((double) c__e8.f356709e) * 1.0d) / d4, 2)));
            linkedHashMap4.put("msg-addictMsg-during", Long.valueOf(c__e9.f356709e));
            linkedHashMap4.put("msg-addictMsg-duringAvg", Double.valueOf(C116951c.m165015p((((double) c__e9.f356709e) * 1.0d) / d4, 2)));
            StringBuilder sb4 = new StringBuilder();
            sb4.append(z ? "NotifySyncCounterPoll" : "NotifySyncCounter");
            sb4.append(z3 ? "Exception" : "");
            C87968a.C87969a.C87970a.m109467a(sb4.toString(), (Throwable) null, linkedHashMap4, String.valueOf(C116951c.m165015p(d3, 2)), String.valueOf(C116951c.m165015p((((double) j18) * 1.0d) / d4, 2)), String.valueOf(C116951c.m165015p((((double) j19) * 1.0d) / d4, 2)), String.valueOf(C116951c.m165015p((((double) j25) * 1.0d) / d4, 2)));
        }
    }

    /* renamed from: l */
    public static void m167927l() {
        Log.m105924i("MicroMsg.NotifyPowerInspector", "#save");
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("notify-inspect.bin");
        StringBuilder sb = new StringBuilder();
        c$$e c__e = f356687d;
        sb.append(c__e.f356705a);
        sb.append("-count");
        mmkv.putLong(sb.toString(), c__e.f356707c).apply();
        mmkv.putLong(c__e.f356705a + "-during", c__e.f356710f).apply();
        StringBuilder sb4 = new StringBuilder();
        c$$e c__e2 = f356689f;
        sb4.append(c__e2.f356705a);
        sb4.append("-count");
        mmkv.putLong(sb4.toString(), c__e2.f356707c).apply();
        mmkv.putLong(c__e2.f356705a + "-during", c__e2.f356710f).apply();
        StringBuilder sb5 = new StringBuilder();
        c$$e c__e3 = f356693j;
        sb5.append(c__e3.f356705a);
        sb5.append("-count");
        mmkv.putLong(sb5.toString(), c__e3.f356707c).apply();
        mmkv.putLong(c__e3.f356705a + "-during", c__e3.f356710f).apply();
        mmkv.putLong("light-push-during", f356686c).apply();
    }
}
