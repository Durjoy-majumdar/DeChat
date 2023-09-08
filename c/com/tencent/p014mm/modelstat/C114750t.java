package com.tencent.p014mm.modelstat;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.ConnectivityCompat;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import java.util.Comparator;
import java.util.HashMap;
import kj2.C117407d;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89144l0;
import ob0.l0$$e;
import p156gj.C87200o;
import qe3.C89625d;
import te3.C118444mn3;
import te3.C50568nn3;
import zt3.C119157j;

/* renamed from: com.tencent.mm.modelstat.t */
public class C114750t {

    /* renamed from: a */
    public static HashMap<String, Long> f344056a = new HashMap<>();

    /* renamed from: b */
    public static String f344057b = null;

    /* renamed from: c */
    public static long f344058c;

    /* renamed from: d */
    public static final byte[] f344059d = new byte[0];

    /* renamed from: e */
    public static long f344060e = MAlarmHandler.NEXT_FIRE_INTERVAL;

    /* renamed from: f */
    public static int f344061f = 0;

    /* renamed from: g */
    public static MTimerHandler f344062g = new MTimerHandler(C86709a0.m107525e().getLooper(), (MTimerHandler.CallBack) new C114753d(), false);

    /* renamed from: h */
    public static long f344063h = 0;

    /* renamed from: i */
    public static long f344064i = 0;

    /* renamed from: j */
    public static float f344065j = 0.0f;

    /* renamed from: k */
    public static float f344066k = 0.0f;

    /* renamed from: l */
    public static int f344067l = 0;

    /* renamed from: m */
    public static int f344068m = 0;

    /* renamed from: n */
    public static long f344069n = 0;

    /* renamed from: com.tencent.mm.modelstat.t$a */
    public class C29046a implements Comparator<ConnectivityCompat.WiFiScanResult> {
    }

    /* renamed from: com.tencent.mm.modelstat.t$e */
    public static class C29047e extends BroadcastReceiver {
        public C29047e(C29046a aVar) {
        }

        public void onReceive(Context context, Intent intent) {
            ((C119157j) C119157j.f356862d).mo183876g(new t$e$$a(intent), "NetTypeReporter");
        }
    }

    /* renamed from: com.tencent.mm.modelstat.t$b */
    public class C114751b implements l0$$e {

        /* renamed from: d */
        public final /* synthetic */ long f344070d;

        /* renamed from: e */
        public final /* synthetic */ C118444mn3 f344071e;

        /* renamed from: f */
        public final /* synthetic */ String[] f344072f;

        /* renamed from: g */
        public final /* synthetic */ float f344073g;

        /* renamed from: h */
        public final /* synthetic */ float f344074h;

        /* renamed from: i */
        public final /* synthetic */ int f344075i;

        /* renamed from: j */
        public final /* synthetic */ long f344076j;

        public C114751b(long j, C118444mn3 mn32, String[] strArr, float f, float f2, int i, long j2) {
            this.f344070d = j;
            this.f344071e = mn32;
            this.f344072f = strArr;
            this.f344073g = f;
            this.f344074h = f2;
            this.f344075i = i;
            this.f344076j = j2;
        }

        /* renamed from: a */
        public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            String str2;
            Log.m105919d("MicroMsg.NetTypeReporter", "onGYNetEnd errType:%d errCode:%d msg:%s  %d val:%s ", Integer.valueOf(i), Integer.valueOf(i2), str, Long.valueOf(Util.milliSecondsToNow(this.f344070d)), this.f344071e.f354142j);
            if (!(i == 0 && i2 == 0)) {
                long milliSecondsToNow = Util.milliSecondsToNow(C114750t.f344063h);
                if (milliSecondsToNow > 600000 || milliSecondsToNow < 0) {
                    milliSecondsToNow = 0;
                }
                C117407d dVar = C117407d.INSTANCE;
                StringBuilder sb = new StringBuilder();
                sb.append(this.f344072f[0]);
                sb.append("1,");
                sb.append(this.f344073g);
                sb.append(",");
                sb.append(this.f344074h);
                sb.append(",");
                sb.append(this.f344075i);
                sb.append(",");
                sb.append(this.f344076j);
                sb.append(",");
                if (CrashReportFactory.foreground) {
                    str2 = "1";
                } else {
                    str2 = "" + milliSecondsToNow;
                }
                sb.append(str2);
                sb.append(",");
                sb.append(this.f344072f[1]);
                sb.append(",");
                sb.append(this.f344072f[2]);
                sb.append(",");
                sb.append(this.f344072f[3]);
                dVar.kvStat(11747, sb.toString());
            }
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_REPORTNETTYPE_LASTREPORT_LONG, Long.valueOf(Util.nowMilliSecond()));
            return 0;
        }
    }

    /* renamed from: com.tencent.mm.modelstat.t$c */
    public class C114752c implements l0$$e {

        /* renamed from: d */
        public final /* synthetic */ long f344077d;

        /* renamed from: e */
        public final /* synthetic */ C118444mn3 f344078e;

        public C114752c(long j, C118444mn3 mn32) {
            this.f344077d = j;
            this.f344078e = mn32;
        }

        /* renamed from: a */
        public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            Log.m105919d("MicroMsg.NetTypeReporter", "onGYNetEnd errType:%d errCode:%d msg:%s  %d val:%s ", Integer.valueOf(i), Integer.valueOf(i2), str, Long.valueOf(Util.milliSecondsToNow(this.f344077d)), this.f344078e.f354142j);
            return 0;
        }
    }

    /* renamed from: com.tencent.mm.modelstat.t$d */
    public class C114753d implements MTimerHandler.CallBack {
        public boolean onTimerExpired() {
            try {
                C114750t.f344060e = MAlarmHandler.NEXT_FIRE_INTERVAL;
                int i = C114750t.f344061f;
                if (i >= 2000 || i <= 1000) {
                    C114750t.m161441f(i, 0.0f, 0.0f, 0, 0);
                } else {
                    C114750t.m161436a(i, 0.0f, 0.0f, 0, 0);
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.NetTypeReporter", "run :%s", Util.stackTraceToString(e));
            }
            return false;
        }
    }

    /* renamed from: a */
    public static void m161436a(int i, float f, float f2, int i2, long j) {
        String str;
        long nowMilliSecond = Util.nowMilliSecond();
        long j2 = f344063h;
        long j3 = 0;
        if (j2 <= 0 || nowMilliSecond - j2 <= FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION) {
            String[] e = m161440e(i);
            if (e == null || e.length != 4 || Util.isNullOrNil(e[0])) {
                Log.m105920e("MicroMsg.NetTypeReporter", "report get failed val");
                return;
            }
            Log.m105919d("MicroMsg.NetTypeReporter", "report scene:%d time:%d lon:%f lat:%f pre:%d scanuse:%d [%s]", Integer.valueOf(i), Long.valueOf(Util.milliSecondsToNow(nowMilliSecond)), Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i2), Long.valueOf(j), e[0]);
            long milliSecondsToNow = Util.milliSecondsToNow(f344063h);
            if (milliSecondsToNow <= 600000 && milliSecondsToNow >= 0) {
                j3 = milliSecondsToNow;
            }
            C117407d dVar = C117407d.INSTANCE;
            StringBuilder sb = new StringBuilder();
            sb.append(e[0]);
            sb.append("1,");
            sb.append(f);
            sb.append(",");
            sb.append(f2);
            sb.append(",");
            sb.append(i2);
            sb.append(",");
            sb.append(j);
            sb.append(",");
            if (CrashReportFactory.foreground) {
                str = "1";
            } else {
                str = "" + j3;
            }
            sb.append(str);
            sb.append(",");
            sb.append(e[1]);
            sb.append(",");
            sb.append(e[2]);
            sb.append(",");
            sb.append(e[3]);
            dVar.kvStat(11747, sb.toString());
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_REPORTNETTYPE_LASTREPORT_LONG, Long.valueOf(Util.nowMilliSecond()));
            return;
        }
        Log.m105921e("MicroMsg.NetTypeReporter", "never  report (reportKV) at  background :%d diff:%d", Long.valueOf(j2), Long.valueOf(nowMilliSecond - f344063h));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.io.ObjectOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.io.ObjectOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.io.ObjectInputStream} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: type inference failed for: r6v8 */
    /* JADX WARNING: type inference failed for: r6v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01e5 A[Catch:{ Exception -> 0x01e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01f7 A[SYNTHETIC, Splitter:B:104:0x01f7] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01ff A[Catch:{ Exception -> 0x01fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c1 A[SYNTHETIC, Splitter:B:38:0x00c1] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c9 A[Catch:{ Exception -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0113 A[SYNTHETIC, Splitter:B:54:0x0113] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x011b A[Catch:{ Exception -> 0x0117 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01dd A[SYNTHETIC, Splitter:B:96:0x01dd] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m161437b(java.util.ArrayList<java.lang.String> r15) {
        /*
            java.lang.String r0 = "checkBssidShouldReport write err:%s"
            java.lang.String r1 = "checkBssidShouldReport read err:%s"
            java.lang.String r2 = "MicroMsg.NetTypeReporter"
            r3 = 0
            if (r15 == 0) goto L_0x0210
            int r4 = r15.size()
            if (r4 != 0) goto L_0x0011
            goto L_0x0210
        L_0x0011:
            java.lang.String r4 = f344057b
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 == 0) goto L_0x0032
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            f40.o r5 = f40.C86709a0.m107535s()
            java.lang.String r5 = r5.f251807e
            r4.append(r5)
            java.lang.String r5 = "bssidcache.bin"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            f344057b = r4
        L_0x0032:
            java.util.HashMap<java.lang.String, java.lang.Long> r4 = f344056a
            int r4 = r4.size()
            r5 = 2
            r6 = 0
            r7 = 1
            if (r4 != 0) goto L_0x0132
            java.lang.String r4 = f344057b     // Catch:{ Exception -> 0x00aa, all -> 0x00a7 }
            long r8 = com.tencent.p014mm.vfs.C86013q1.m106451l(r4)     // Catch:{ Exception -> 0x00aa, all -> 0x00a7 }
            r10 = 10485760(0xa00000, double:5.180654E-317)
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 <= 0) goto L_0x004f
            java.lang.String r4 = f344057b     // Catch:{ Exception -> 0x00aa, all -> 0x00a7 }
            com.tencent.p014mm.vfs.C86013q1.m106447h(r4)     // Catch:{ Exception -> 0x00aa, all -> 0x00a7 }
        L_0x004f:
            java.lang.String r4 = f344057b     // Catch:{ Exception -> 0x00aa, all -> 0x00a7 }
            java.io.InputStream r4 = com.tencent.p014mm.vfs.C86013q1.m106423E(r4)     // Catch:{ Exception -> 0x00aa, all -> 0x00a7 }
            java.io.ObjectInputStream r8 = new java.io.ObjectInputStream     // Catch:{ Exception -> 0x00a1, all -> 0x009e }
            java.io.BufferedInputStream r9 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x00a1, all -> 0x009e }
            r9.<init>(r4)     // Catch:{ Exception -> 0x00a1, all -> 0x009e }
            r8.<init>(r9)     // Catch:{ Exception -> 0x00a1, all -> 0x009e }
            java.lang.Object r9 = r8.readObject()     // Catch:{ Exception -> 0x0098, all -> 0x0094 }
            java.util.HashMap r9 = (java.util.HashMap) r9     // Catch:{ Exception -> 0x0098, all -> 0x0094 }
            f344056a = r9     // Catch:{ Exception -> 0x0098, all -> 0x0094 }
            java.lang.String r10 = "checkBssidShouldReport read file size:%d"
            java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0098, all -> 0x0094 }
            int r9 = r9.size()     // Catch:{ Exception -> 0x0098, all -> 0x0094 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x0098, all -> 0x0094 }
            r11[r3] = r9     // Catch:{ Exception -> 0x0098, all -> 0x0094 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r10, r11)     // Catch:{ Exception -> 0x0098, all -> 0x0094 }
            r8.close()     // Catch:{ Exception -> 0x0082 }
            if (r4 == 0) goto L_0x00df
            r4.close()     // Catch:{ Exception -> 0x0082 }
            goto L_0x00df
        L_0x0082:
            r4 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r4)
            r8[r3] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r1, r8)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            goto L_0x00dd
        L_0x0094:
            r15 = move-exception
            r6 = r8
            goto L_0x0111
        L_0x0098:
            r9 = move-exception
            r14 = r8
            r8 = r4
            r4 = r9
            r9 = r14
            goto L_0x00ad
        L_0x009e:
            r15 = move-exception
            goto L_0x0111
        L_0x00a1:
            r8 = move-exception
            r9 = r6
            r14 = r8
            r8 = r4
            r4 = r14
            goto L_0x00ad
        L_0x00a7:
            r15 = move-exception
            r4 = r6
            goto L_0x0111
        L_0x00aa:
            r4 = move-exception
            r8 = r6
            r9 = r8
        L_0x00ad:
            java.lang.Object[] r10 = new java.lang.Object[r7]     // Catch:{ all -> 0x010e }
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r4)     // Catch:{ all -> 0x010e }
            r10[r3] = r4     // Catch:{ all -> 0x010e }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r1, r10)     // Catch:{ all -> 0x010e }
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x010e }
            r4.<init>()     // Catch:{ all -> 0x010e }
            f344056a = r4     // Catch:{ all -> 0x010e }
            if (r9 == 0) goto L_0x00c7
            r9.close()     // Catch:{ Exception -> 0x00c5 }
            goto L_0x00c7
        L_0x00c5:
            r4 = move-exception
            goto L_0x00cd
        L_0x00c7:
            if (r8 == 0) goto L_0x00df
            r8.close()     // Catch:{ Exception -> 0x00c5 }
            goto L_0x00df
        L_0x00cd:
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r4)
            r8[r3] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r1, r8)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
        L_0x00dd:
            f344056a = r1
        L_0x00df:
            java.util.HashMap<java.lang.String, java.lang.Long> r1 = f344056a
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x00f1
            java.util.HashMap<java.lang.String, java.lang.Long> r1 = f344056a
            int r1 = r1.size()
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r1 <= r4) goto L_0x0132
        L_0x00f1:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.util.HashMap<java.lang.String, java.lang.Long> r4 = f344056a
            int r4 = r4.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r3] = r4
            java.lang.String r4 = f344057b
            r1[r7] = r4
            java.lang.String r4 = "checkBssidShouldReport remove size:%d  file:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r1)
            java.lang.String r1 = f344057b
            com.tencent.p014mm.vfs.C86013q1.m106447h(r1)
            goto L_0x0132
        L_0x010e:
            r15 = move-exception
            r4 = r8
            r6 = r9
        L_0x0111:
            if (r6 == 0) goto L_0x0119
            r6.close()     // Catch:{ Exception -> 0x0117 }
            goto L_0x0119
        L_0x0117:
            r0 = move-exception
            goto L_0x011f
        L_0x0119:
            if (r4 == 0) goto L_0x0131
            r4.close()     // Catch:{ Exception -> 0x0117 }
            goto L_0x0131
        L_0x011f:
            java.lang.Object[] r4 = new java.lang.Object[r7]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r4[r3] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r1, r4)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            f344056a = r0
        L_0x0131:
            throw r15
        L_0x0132:
            java.util.Iterator r15 = r15.iterator()
            r1 = 0
        L_0x0137:
            boolean r4 = r15.hasNext()
            if (r4 == 0) goto L_0x017c
            java.lang.Object r4 = r15.next()
            java.lang.String r4 = (java.lang.String) r4
            java.util.HashMap<java.lang.String, java.lang.Long> r8 = f344056a
            java.lang.Object r8 = r8.get(r4)
            r9 = 0
            long r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAsLong(r8, r9)
            long r11 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r11)
            java.lang.Object[] r8 = new java.lang.Object[r5]
            r8[r3] = r4
            java.lang.Long r13 = java.lang.Long.valueOf(r11)
            r8[r7] = r13
            java.lang.String r13 = "checkBssidShouldReport report bssid:%s diff:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r13, r8)
            int r8 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x016d
            r8 = 86400000(0x5265c00, double:4.2687272E-316)
            int r10 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x0137
        L_0x016d:
            java.util.HashMap<java.lang.String, java.lang.Long> r1 = f344056a
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r1.put(r4, r8)
            r1 = 1
            goto L_0x0137
        L_0x017c:
            if (r1 == 0) goto L_0x020f
            java.util.HashMap<java.lang.String, java.lang.Long> r15 = f344056a
            int r15 = r15.size()
            if (r15 <= 0) goto L_0x020f
            java.lang.String r15 = f344057b     // Catch:{ Exception -> 0x01ce, all -> 0x01cb }
            java.io.OutputStream r15 = com.tencent.p014mm.vfs.C86013q1.m106429K(r15, r3)     // Catch:{ Exception -> 0x01ce, all -> 0x01cb }
            java.io.ObjectOutputStream r4 = new java.io.ObjectOutputStream     // Catch:{ Exception -> 0x01c9 }
            r4.<init>(r15)     // Catch:{ Exception -> 0x01c9 }
            java.util.HashMap<java.lang.String, java.lang.Long> r5 = f344056a     // Catch:{ Exception -> 0x01c4, all -> 0x01c1 }
            r4.writeObject(r5)     // Catch:{ Exception -> 0x01c4, all -> 0x01c1 }
            r15.flush()     // Catch:{ Exception -> 0x01c4, all -> 0x01c1 }
            java.lang.String r5 = "checkBssidShouldReport write file size:%d"
            java.lang.Object[] r6 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x01c4, all -> 0x01c1 }
            java.util.HashMap<java.lang.String, java.lang.Long> r8 = f344056a     // Catch:{ Exception -> 0x01c4, all -> 0x01c1 }
            int r8 = r8.size()     // Catch:{ Exception -> 0x01c4, all -> 0x01c1 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x01c4, all -> 0x01c1 }
            r6[r3] = r8     // Catch:{ Exception -> 0x01c4, all -> 0x01c1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r6)     // Catch:{ Exception -> 0x01c4, all -> 0x01c1 }
            r4.close()     // Catch:{ Exception -> 0x01b4 }
            r15.close()     // Catch:{ Exception -> 0x01b4 }
            goto L_0x020f
        L_0x01b4:
            r15 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r7]
            java.lang.String r15 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r15)
            r4[r3] = r15
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r0, r4)
            goto L_0x020f
        L_0x01c1:
            r1 = move-exception
            r6 = r4
            goto L_0x01f5
        L_0x01c4:
            r5 = move-exception
            r6 = r4
            goto L_0x01d0
        L_0x01c7:
            r1 = move-exception
            goto L_0x01f5
        L_0x01c9:
            r5 = move-exception
            goto L_0x01d0
        L_0x01cb:
            r1 = move-exception
            r15 = r6
            goto L_0x01f5
        L_0x01ce:
            r5 = move-exception
            r15 = r6
        L_0x01d0:
            java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch:{ all -> 0x01c7 }
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r5)     // Catch:{ all -> 0x01c7 }
            r4[r3] = r5     // Catch:{ all -> 0x01c7 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r0, r4)     // Catch:{ all -> 0x01c7 }
            if (r6 == 0) goto L_0x01e3
            r6.close()     // Catch:{ Exception -> 0x01e1 }
            goto L_0x01e3
        L_0x01e1:
            r15 = move-exception
            goto L_0x01e9
        L_0x01e3:
            if (r15 == 0) goto L_0x020f
            r15.close()     // Catch:{ Exception -> 0x01e1 }
            goto L_0x020f
        L_0x01e9:
            java.lang.Object[] r4 = new java.lang.Object[r7]
            java.lang.String r15 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r15)
            r4[r3] = r15
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r0, r4)
            goto L_0x020f
        L_0x01f5:
            if (r6 == 0) goto L_0x01fd
            r6.close()     // Catch:{ Exception -> 0x01fb }
            goto L_0x01fd
        L_0x01fb:
            r15 = move-exception
            goto L_0x0203
        L_0x01fd:
            if (r15 == 0) goto L_0x020e
            r15.close()     // Catch:{ Exception -> 0x01fb }
            goto L_0x020e
        L_0x0203:
            java.lang.Object[] r4 = new java.lang.Object[r7]
            java.lang.String r15 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r15)
            r4[r3] = r15
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r0, r4)
        L_0x020e:
            throw r1
        L_0x020f:
            return r1
        L_0x0210:
            java.lang.String r15 = "checkBssidShouldReport no value in list."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r15)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelstat.C114750t.m161437b(java.util.ArrayList):boolean");
    }

    /* renamed from: c */
    public static void m161438c(int i, float f, float f2, int i2, long j) {
        int i3 = i;
        try {
            Log.m105925i("MicroMsg.NetTypeReporter", "checkTimeReport scene:%d diff:%d  time:%d", Integer.valueOf(i), Long.valueOf(Util.milliSecondsToNow(f344060e)), Long.valueOf(f344060e));
            if (i3 <= 2000) {
                if (Util.milliSecondsToNow(f344060e) <= 300000) {
                    if (f344060e == MAlarmHandler.NEXT_FIRE_INTERVAL) {
                        f344060e = Util.nowMilliSecond() + 60000;
                    }
                    f344061f = i3;
                    f344062g.startTimer(60000);
                    return;
                }
            }
            Log.m105925i("MicroMsg.NetTypeReporter", "force Run, scene:%d diff:%d time:%d ", Integer.valueOf(i), Long.valueOf(Util.milliSecondsToNow(f344060e)), Long.valueOf(f344060e));
            f344061f = i3;
            f344060e = MAlarmHandler.NEXT_FIRE_INTERVAL;
            m161441f(i, f, f2, i2, j);
        } catch (Throwable th) {
            Log.m105921e("MicroMsg.NetTypeReporter", "checkTimeReport error: %s", Util.stackTraceToString(th));
        }
    }

    /* renamed from: d */
    public static String m161439d(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        for (char c : str.toCharArray()) {
            if ((c < 'a' || c > 'z') && ((c < 'A' || c > 'Z') && ((c < '0' || c > '9') && c != '|' && c != '-' && c != ' ' && c != ':'))) {
                return "";
            }
        }
        return str;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* renamed from: e */
    public static java.lang.String[] m161440e(int r21) {
        /*
            r1 = r21
            java.lang.String r0 = "MicroMsg.NetTypeReporter"
            java.lang.String r2 = "dkNetTypeRead scene:%d fg:%b time:%d diff:%d"
            r3 = 4
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r21)
            r6 = 0
            r4[r6] = r5
            boolean r5 = com.tencent.p014mm.sdk.crash.CrashReportFactory.foreground
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r7 = 1
            r4[r7] = r5
            long r8 = f344063h
            java.lang.Long r5 = java.lang.Long.valueOf(r8)
            r8 = 2
            r4[r8] = r5
            long r9 = f344063h
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r9)
            java.lang.Long r5 = java.lang.Long.valueOf(r9)
            r9 = 3
            r4[r9] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r4)
            r2 = 0
            if (r1 > 0) goto L_0x0045
            java.lang.String r0 = "MicroMsg.NetTypeReporter"
            java.lang.String r3 = "ERROR PARAM: scene:%d"
            java.lang.Object[] r4 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r21)
            r4[r6] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r3, r4)
            return r2
        L_0x0045:
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            if (r4 != 0) goto L_0x005b
            java.lang.String r0 = "MicroMsg.NetTypeReporter"
            java.lang.String r3 = "ERROR Context is null scene:%d"
            java.lang.Object[] r4 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r21)
            r4[r6] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r3, r4)
            return r2
        L_0x005b:
            java.lang.String r0 = "MicroMsg.NetTypeReporter"
            java.lang.String r5 = "read scene:%d foreground:%b"
            java.lang.Object[] r10 = new java.lang.Object[r8]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r21)
            r10[r6] = r11
            boolean r11 = com.tencent.p014mm.sdk.crash.CrashReportFactory.foreground
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r10[r7] = r11
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r5, r10)
            int r0 = p156gj.C87198e0.m108253a()     // Catch:{ Exception -> 0x0078 }
            r5 = r0
            goto L_0x008a
        L_0x0078:
            r0 = move-exception
            r5 = r0
            java.lang.String r0 = "MicroMsg.NetTypeReporter"
            java.lang.String r10 = "getNetType : %s"
            java.lang.Object[] r11 = new java.lang.Object[r7]
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r5)
            r11[r6] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r10, r11)
            r5 = 0
        L_0x008a:
            java.lang.String r0 = "MicroMsg.NetTypeReporter"
            java.lang.String r10 = "get netType :%d"
            java.lang.Object[] r11 = new java.lang.Object[r7]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            r11[r6] = r12
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r10, r11)
            java.lang.String r10 = ""
            java.lang.String r11 = ""
            java.lang.String r12 = ""
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x011a }
            r0.<init>()     // Catch:{ Exception -> 0x011a }
            java.lang.StringBuffer r13 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x011a }
            r13.<init>()     // Catch:{ Exception -> 0x011a }
            java.lang.StringBuffer r14 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x011a }
            r14.<init>()     // Catch:{ Exception -> 0x011a }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ Exception -> 0x011a }
            r15.<init>()     // Catch:{ Exception -> 0x011a }
            com.tencent.mm.sdk.platformtools.ConnectivityCompat$Companion r16 = com.tencent.p014mm.sdk.platformtools.ConnectivityCompat.Companion     // Catch:{ Exception -> 0x011a }
            java.lang.String r3 = r16.getFormattedWiFiSsid()     // Catch:{ Exception -> 0x011a }
            r0.append(r3)     // Catch:{ Exception -> 0x011a }
            java.lang.String r3 = r16.getFormattedWiFiBssid()     // Catch:{ Exception -> 0x011a }
            r13.append(r3)     // Catch:{ Exception -> 0x011a }
            java.lang.String r3 = r16.getFormattedWiFiBssid()     // Catch:{ Exception -> 0x011a }
            r15.add(r3)     // Catch:{ Exception -> 0x011a }
            long r17 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x011a }
            long r19 = f344058c     // Catch:{ Exception -> 0x011a }
            long r17 = r17 - r19
            r19 = 600000(0x927c0, double:2.964394E-318)
            int r3 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r3 <= 0) goto L_0x00df
            long r17 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x011a }
            f344058c = r17     // Catch:{ Exception -> 0x011a }
        L_0x00df:
            r3 = 2000(0x7d0, float:2.803E-42)
            if (r1 >= r3) goto L_0x00f9
            boolean r3 = m161437b(r15)     // Catch:{ Exception -> 0x011a }
            if (r3 != 0) goto L_0x00f9
            java.lang.String r0 = "MicroMsg.NetTypeReporter"
            java.lang.String r3 = "checkBssid: find all report already  , give up. scene:%d "
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x011a }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r21)     // Catch:{ Exception -> 0x011a }
            r13[r6] = r14     // Catch:{ Exception -> 0x011a }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r3, r13)     // Catch:{ Exception -> 0x011a }
            return r2
        L_0x00f9:
            java.lang.String r10 = r0.toString()     // Catch:{ Exception -> 0x011a }
            java.lang.String r11 = r13.toString()     // Catch:{ Exception -> 0x011a }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x011a }
            r0.<init>()     // Catch:{ Exception -> 0x011a }
            java.lang.String r3 = ""
            r0.append(r3)     // Catch:{ Exception -> 0x011a }
            r0.append(r6)     // Catch:{ Exception -> 0x011a }
            java.lang.String r3 = r14.toString()     // Catch:{ Exception -> 0x011a }
            r0.append(r3)     // Catch:{ Exception -> 0x011a }
            java.lang.String r12 = r0.toString()     // Catch:{ Exception -> 0x011a }
            goto L_0x012a
        L_0x011a:
            r0 = move-exception
            java.lang.String r3 = "MicroMsg.NetTypeReporter"
            java.lang.String r13 = "getWifiInfo : %s"
            java.lang.Object[] r14 = new java.lang.Object[r7]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r14[r6] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r13, r14)
        L_0x012a:
            java.lang.String r0 = "MicroMsg.NetTypeReporter"
            java.lang.String r3 = "get wifi :[%s] [%s]"
            java.lang.Object[] r13 = new java.lang.Object[r8]
            r13[r6] = r11
            r13[r7] = r10
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r3, r13)
            java.lang.String r3 = ""
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r4.getSystemService(r0)     // Catch:{ Exception -> 0x0149 }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ Exception -> 0x0149 }
            if (r0 == 0) goto L_0x0159
            java.lang.String r0 = r0.getNetworkOperatorName()     // Catch:{ Exception -> 0x0149 }
            r3 = r0
            goto L_0x0159
        L_0x0149:
            r0 = move-exception
            java.lang.String r13 = "MicroMsg.NetTypeReporter"
            java.lang.String r14 = "getNetType : %s"
            java.lang.Object[] r15 = new java.lang.Object[r7]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r15[r6] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r13, r14, r15)
        L_0x0159:
            java.lang.String r0 = "MicroMsg.NetTypeReporter"
            java.lang.String r13 = "get ispName: %s"
            java.lang.Object[] r14 = new java.lang.Object[r7]
            r14[r6] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r13, r14)
            java.lang.String r13 = ""
            java.lang.String r14 = ""
            java.lang.String r15 = ""
            java.lang.String r16 = ""
            java.lang.String r17 = ""
            java.util.List r0 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.getCellInfoList(r4)     // Catch:{ Exception -> 0x0265 }
            r4 = r16
            r16 = r17
            r2 = 0
        L_0x0177:
            int r8 = r0.size()     // Catch:{ Exception -> 0x025d }
            if (r2 >= r8) goto L_0x0258
            java.lang.Object r8 = r0.get(r2)     // Catch:{ Exception -> 0x025d }
            com.tencent.mm.sdk.platformtools.NetStatusUtil$CellInfo r8 = (com.tencent.p014mm.sdk.platformtools.NetStatusUtil.CellInfo) r8     // Catch:{ Exception -> 0x025d }
            java.lang.String r9 = r8.mcc     // Catch:{ Exception -> 0x025d }
            java.lang.String r6 = ""
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r9, (java.lang.String) r6)     // Catch:{ Exception -> 0x025d }
            java.lang.String r6 = r8.mnc     // Catch:{ Exception -> 0x025d }
            java.lang.String r9 = ""
            java.lang.String r14 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r9)     // Catch:{ Exception -> 0x025d }
            int r6 = r15.length()     // Catch:{ Exception -> 0x025d }
            if (r6 <= 0) goto L_0x01bc
            java.lang.String r6 = r8.cellid     // Catch:{ Exception -> 0x01b5 }
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)     // Catch:{ Exception -> 0x01b5 }
            if (r6 != 0) goto L_0x01bc
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b5 }
            r6.<init>()     // Catch:{ Exception -> 0x01b5 }
            r6.append(r15)     // Catch:{ Exception -> 0x01b5 }
            java.lang.String r9 = "|"
            r6.append(r9)     // Catch:{ Exception -> 0x01b5 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x01b5 }
            r15 = r6
            goto L_0x01bc
        L_0x01b5:
            r0 = move-exception
            r17 = r16
            r16 = r4
            goto L_0x0266
        L_0x01bc:
            java.lang.String r6 = r8.cellid     // Catch:{ Exception -> 0x025d }
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)     // Catch:{ Exception -> 0x025d }
            if (r6 != 0) goto L_0x01d6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b5 }
            r6.<init>()     // Catch:{ Exception -> 0x01b5 }
            r6.append(r15)     // Catch:{ Exception -> 0x01b5 }
            java.lang.String r9 = r8.cellid     // Catch:{ Exception -> 0x01b5 }
            r6.append(r9)     // Catch:{ Exception -> 0x01b5 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x01b5 }
            r15 = r6
        L_0x01d6:
            int r6 = r4.length()     // Catch:{ Exception -> 0x025d }
            if (r6 <= 0) goto L_0x01f6
            java.lang.String r6 = r8.lac     // Catch:{ Exception -> 0x01b5 }
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)     // Catch:{ Exception -> 0x01b5 }
            if (r6 != 0) goto L_0x01f6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b5 }
            r6.<init>()     // Catch:{ Exception -> 0x01b5 }
            r6.append(r4)     // Catch:{ Exception -> 0x01b5 }
            java.lang.String r9 = "|"
            r6.append(r9)     // Catch:{ Exception -> 0x01b5 }
            java.lang.String r4 = r6.toString()     // Catch:{ Exception -> 0x01b5 }
        L_0x01f6:
            java.lang.String r6 = r8.lac     // Catch:{ Exception -> 0x025d }
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)     // Catch:{ Exception -> 0x025d }
            if (r6 != 0) goto L_0x020f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b5 }
            r6.<init>()     // Catch:{ Exception -> 0x01b5 }
            r6.append(r4)     // Catch:{ Exception -> 0x01b5 }
            java.lang.String r9 = r8.lac     // Catch:{ Exception -> 0x01b5 }
            r6.append(r9)     // Catch:{ Exception -> 0x01b5 }
            java.lang.String r4 = r6.toString()     // Catch:{ Exception -> 0x01b5 }
        L_0x020f:
            int r6 = r16.length()     // Catch:{ Exception -> 0x025d }
            if (r6 <= 0) goto L_0x022c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025d }
            r6.<init>()     // Catch:{ Exception -> 0x025d }
            r9 = r16
            r6.append(r9)     // Catch:{ Exception -> 0x022a }
            java.lang.String r7 = "|"
            r6.append(r7)     // Catch:{ Exception -> 0x022a }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x022a }
            goto L_0x022f
        L_0x022a:
            r0 = move-exception
            goto L_0x0260
        L_0x022c:
            r9 = r16
            r6 = r9
        L_0x022f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0252 }
            r7.<init>()     // Catch:{ Exception -> 0x0252 }
            r7.append(r6)     // Catch:{ Exception -> 0x0252 }
            java.lang.String r9 = r8.dbm     // Catch:{ Exception -> 0x0252 }
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)     // Catch:{ Exception -> 0x0252 }
            if (r9 == 0) goto L_0x0242
            java.lang.String r8 = "0"
            goto L_0x0244
        L_0x0242:
            java.lang.String r8 = r8.dbm     // Catch:{ Exception -> 0x0252 }
        L_0x0244:
            r7.append(r8)     // Catch:{ Exception -> 0x0252 }
            java.lang.String r16 = r7.toString()     // Catch:{ Exception -> 0x0252 }
            int r2 = r2 + 1
            r6 = 0
            r7 = 1
            r9 = 3
            goto L_0x0177
        L_0x0252:
            r0 = move-exception
            r16 = r4
            r17 = r6
            goto L_0x0266
        L_0x0258:
            r9 = r16
            r6 = 1
            r8 = 0
            goto L_0x027b
        L_0x025d:
            r0 = move-exception
            r9 = r16
        L_0x0260:
            r16 = r4
            r17 = r9
            goto L_0x0266
        L_0x0265:
            r0 = move-exception
        L_0x0266:
            java.lang.String r2 = "MicroMsg.NetTypeReporter"
            java.lang.String r4 = "getNetType : %s"
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r8 = 0
            r7[r8] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r4, r7)
            r4 = r16
            r16 = r17
        L_0x027b:
            java.lang.String r0 = "MicroMsg.NetTypeReporter"
            java.lang.String r2 = "mcc:%s mnc:%s cell:%s"
            r7 = 3
            java.lang.Object[] r9 = new java.lang.Object[r7]
            r9[r8] = r13
            r9[r6] = r14
            r6 = 2
            r9[r6] = r15
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r2, r9)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            r2.append(r6)
            java.lang.String r0 = ","
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = ","
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = ","
            r2.append(r0)
            java.lang.String r0 = ","
            java.lang.String r1 = " "
            java.lang.String r0 = r10.replace(r0, r1)
            r2.append(r0)
            java.lang.String r0 = ","
            r2.append(r0)
            java.lang.String r0 = ","
            java.lang.String r1 = " "
            java.lang.String r0 = r11.replace(r0, r1)
            java.lang.String r0 = m161439d(r0)
            r2.append(r0)
            java.lang.String r0 = ","
            r2.append(r0)
            java.lang.String r0 = ","
            java.lang.String r1 = " "
            java.lang.String r0 = r3.replace(r0, r1)
            r2.append(r0)
            java.lang.String r0 = ","
            r2.append(r0)
            java.lang.String r0 = ","
            java.lang.String r1 = " "
            java.lang.String r0 = r13.replace(r0, r1)
            java.lang.String r0 = m161439d(r0)
            r2.append(r0)
            java.lang.String r0 = ","
            r2.append(r0)
            java.lang.String r0 = ","
            java.lang.String r1 = " "
            java.lang.String r0 = r14.replace(r0, r1)
            java.lang.String r0 = m161439d(r0)
            r2.append(r0)
            java.lang.String r0 = ","
            r2.append(r0)
            java.lang.String r0 = ","
            java.lang.String r1 = " "
            java.lang.String r0 = r15.replace(r0, r1)
            java.lang.String r0 = m161439d(r0)
            r2.append(r0)
            java.lang.String r0 = ","
            r2.append(r0)
            byte[] r1 = f344059d
            monitor-enter(r1)
            f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0383 }
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ Exception -> 0x0383 }
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_REPORTNETTYPE_SEQ_LONG     // Catch:{ Exception -> 0x0383 }
            r5 = 0
            java.lang.Object r0 = r0.mo119685f(r3, r5)     // Catch:{ Exception -> 0x0383 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x0383 }
            r5 = 1
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Long) r0, (long) r5)     // Catch:{ Exception -> 0x0383 }
            f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0383 }
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ Exception -> 0x0383 }
            long r9 = r7 + r5
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ Exception -> 0x0383 }
            r0.mo119677K(r3, r9)     // Catch:{ Exception -> 0x0383 }
            f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0383 }
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ Exception -> 0x0383 }
            r9 = 1
            r0.mo119681a(r9)     // Catch:{ Exception -> 0x0383 }
            f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0383 }
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ Exception -> 0x0383 }
            r9 = 0
            java.lang.Object r0 = r0.mo119685f(r3, r9)     // Catch:{ Exception -> 0x0383 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x0383 }
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Long) r0, (long) r5)     // Catch:{ Exception -> 0x0383 }
            java.lang.String r0 = "MicroMsg.NetTypeReporter"
            java.lang.String r3 = "incSeq after write  old:%d new:%d"
            r9 = 2
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0383 }
            java.lang.Long r9 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x0383 }
            r11 = 0
            r10[r11] = r9     // Catch:{ Exception -> 0x0383 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x0383 }
            r6 = 1
            r10[r6] = r5     // Catch:{ Exception -> 0x0383 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r10)     // Catch:{ Exception -> 0x0383 }
            monitor-exit(r1)     // Catch:{ all -> 0x0381 }
            goto L_0x0398
        L_0x0381:
            r0 = move-exception
            goto L_0x03d9
        L_0x0383:
            r0 = move-exception
            java.lang.String r3 = "MicroMsg.NetTypeReporter"
            java.lang.String r5 = "incSeq :%s"
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x0381 }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)     // Catch:{ all -> 0x0381 }
            r6 = 0
            r7[r6] = r0     // Catch:{ all -> 0x0381 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r5, r7)     // Catch:{ all -> 0x0381 }
            r7 = -1
            monitor-exit(r1)     // Catch:{ all -> 0x0381 }
        L_0x0398:
            r0 = 0
            int r3 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r3 >= 0) goto L_0x03a0
            r1 = 0
            return r1
        L_0x03a0:
            r1 = 4
            java.lang.String[] r0 = new java.lang.String[r1]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = ""
            r1.append(r3)
            r1.append(r7)
            java.lang.String r3 = ","
            r1.append(r3)
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = m161439d(r12)
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = m161439d(r4)
            r2 = 2
            r0[r2] = r1
            java.lang.String r1 = m161439d(r16)
            r2 = 3
            r0[r2] = r1
            return r0
        L_0x03d9:
            monitor-exit(r1)     // Catch:{ all -> 0x0381 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelstat.C114750t.m161440e(int):java.lang.String[]");
    }

    /* renamed from: f */
    public static void m161441f(int i, float f, float f2, int i2, long j) {
        String str;
        long nowMilliSecond = Util.nowMilliSecond();
        long j2 = f344063h;
        long j3 = 0;
        if (j2 <= 0 || nowMilliSecond - j2 <= FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION) {
            String[] e = m161440e(i);
            if (e == null || e.length != 4 || Util.isNullOrNil(e[0])) {
                Log.m105920e("MicroMsg.NetTypeReporter", "report get failed val");
                return;
            }
            Log.m105919d("MicroMsg.NetTypeReporter", "report scene:%d time:%d lon:%f lat:%f pre:%d scanuse:%d [%s]", Integer.valueOf(i), Long.valueOf(Util.milliSecondsToNow(nowMilliSecond)), Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i2), Long.valueOf(j), e[0]);
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127066a = new C118444mn3();
            bVar.f127067b = new C50568nn3();
            bVar.f127068c = "/cgi-bin/micromsg-bin/rtkvreport";
            bVar.f127069d = 716;
            C47350c a = bVar.mo72403a();
            C118444mn3 mn32 = (C118444mn3) a.f127055a.f127080a;
            mn32.f354136d = C89625d.f257837c;
            mn32.f354137e = C89625d.f257836b;
            mn32.f354138f = C89625d.f257839e;
            mn32.f354139g = C87200o.f252873f;
            mn32.f354140h = LocaleUtil.getApplicationLanguage();
            mn32.f354141i = 11747;
            long milliSecondsToNow = Util.milliSecondsToNow(f344063h);
            if (milliSecondsToNow <= 600000 && milliSecondsToNow >= 0) {
                j3 = milliSecondsToNow;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(e[0]);
            sb.append("0,");
            sb.append(f);
            sb.append(",");
            sb.append(f2);
            sb.append(",");
            sb.append(i2);
            sb.append(",");
            sb.append(j);
            sb.append(",");
            if (CrashReportFactory.foreground) {
                str = "1";
            } else {
                str = "" + j3;
            }
            sb.append(str);
            sb.append(",");
            sb.append(e[1]);
            sb.append(",");
            sb.append(e[2]);
            sb.append(",");
            sb.append(e[3]);
            mn32.f354142j = sb.toString();
            C89144l0.m111429e(a, new C114751b(Util.nowMilliSecond(), mn32, e, f, f2, i2, j), true);
            return;
        }
        Log.m105921e("MicroMsg.NetTypeReporter", "never  report  at  background :%d diff:%d", Long.valueOf(j2), Long.valueOf(nowMilliSecond - f344063h));
    }

    /* renamed from: g */
    public static void m161442g(int i, String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C118444mn3();
        bVar.f127067b = new C50568nn3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/rtkvreport";
        bVar.f127069d = 716;
        C47350c a = bVar.mo72403a();
        C118444mn3 mn32 = (C118444mn3) a.f127055a.f127080a;
        mn32.f354136d = C89625d.f257837c;
        mn32.f354137e = C89625d.f257836b;
        mn32.f354138f = C89625d.f257839e;
        mn32.f354139g = C87200o.f252873f;
        mn32.f354140h = LocaleUtil.getApplicationLanguage();
        mn32.f354141i = i;
        mn32.f354142j = str;
        Log.m105925i("MicroMsg.NetTypeReporter", "reportCgi logId:%d, value:%s", Integer.valueOf(i), str);
        C89144l0.m111429e(a, new C114752c(Util.nowMilliSecond(), mn32), false);
    }

    /* renamed from: h */
    public static void m161443h(boolean z) {
        if (z) {
            f344063h = 0;
        } else if (!f344062g.stopped()) {
            Log.m105924i("MicroMsg.NetTypeReporter", "setToForeground user turn to background run report now");
            f344063h = Util.nowMilliSecond();
            f344062g.startTimer(0);
        }
    }
}
