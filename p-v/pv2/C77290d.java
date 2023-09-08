package pv2;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import eb0.C75592q0;
import f40.C86709a0;
import java.util.HashMap;
import lt3.C21460a;
import zt3.C119157j;

/* renamed from: pv2.d */
public class C77290d {

    /* renamed from: a */
    public static int f225400a = -1;

    /* renamed from: b */
    public static int f225401b = -1;

    /* renamed from: pv2.d$a */
    public class C77291a implements Runnable {
        public void run() {
            String b = C75592q0.m90772b();
            if (!Util.isNullOrNil(C77292s.f225402a) && !C77292s.f225402a.equals(b)) {
                C86709a0.m107528h();
                boolean booleanValue = ((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINGER_PRINT_IS_OPEN_BOOLEAN_SYNC, Boolean.FALSE)).booleanValue();
                String d = C77292s.m93117d(1);
                String e = C77292s.m93118e(1);
                boolean i = C21460a.m24275i(d);
                boolean i2 = C21460a.m24275i(e);
                if (booleanValue && !i && i2) {
                    boolean i3 = C21460a.m24275i(C77292s.m93114a());
                    Log.m105925i("MicroMsg.FingerpirntReporter", "report key valid before pay: %s", Boolean.valueOf(i3));
                    if (i3) {
                        C115669n.INSTANCE.mo175911u(1104, 50);
                    } else {
                        C115669n.INSTANCE.mo175911u(1104, 49);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m93103a(int i, int i2) {
        String stackTraceToString = Util.stackTraceToString(new Throwable());
        Log.m105925i("MicroMsg.FingerpirntReporter", "alvinluo soter cLog report, sceneType: %d, detailScene: %d, content: %s", Integer.valueOf(i), Integer.valueOf(i2), stackTraceToString);
        HashMap hashMap = new HashMap();
        hashMap.put("sceneType", String.valueOf(i));
        hashMap.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, String.valueOf(i2));
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo160135k("Soter", "Fingerprint pay add authentication task failed: " + stackTraceToString, hashMap);
    }

    /* renamed from: b */
    public static void m93104b() {
        f225401b = (int) (System.currentTimeMillis() / 1000);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        if (r12 != 1004) goto L_0x004a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m93105c(int r11, int r12, long r13) {
        /*
            r0 = -3
            r1 = 0
            r2 = 4
            r3 = 3
            r4 = 1
            r5 = -1
            if (r12 == r0) goto L_0x0045
            r0 = -2
            if (r12 == r0) goto L_0x0040
            if (r12 == r2) goto L_0x0035
            r0 = 6
            if (r12 == r0) goto L_0x0033
            r0 = 1001(0x3e9, float:1.403E-42)
            if (r12 == r0) goto L_0x0031
            r0 = 1023(0x3ff, float:1.434E-42)
            if (r12 == r0) goto L_0x002d
            r11 = 1003(0x3eb, float:1.406E-42)
            if (r12 == r11) goto L_0x0021
            r11 = 1004(0x3ec, float:1.407E-42)
            if (r12 == r11) goto L_0x004b
            goto L_0x004a
        L_0x0021:
            gj.g0 r11 = p156gj.C107835h0.f322851h
            boolean r11 = r11.f322842a
            if (r11 == 0) goto L_0x002a
            r2 = 9
            goto L_0x004b
        L_0x002a:
            r2 = 10
            goto L_0x004b
        L_0x002d:
            if (r11 != r3) goto L_0x004a
            r2 = 0
            goto L_0x004b
        L_0x0031:
            r2 = 5
            goto L_0x004b
        L_0x0033:
            r2 = 3
            goto L_0x004b
        L_0x0035:
            gj.g0 r11 = p156gj.C107835h0.f322851h
            boolean r11 = r11.f322842a
            if (r11 == 0) goto L_0x003d
            r2 = 7
            goto L_0x004b
        L_0x003d:
            r2 = 8
            goto L_0x004b
        L_0x0040:
            if (r11 != r4) goto L_0x004a
            r2 = 11
            goto L_0x004b
        L_0x0045:
            if (r11 != r4) goto L_0x004a
            r2 = 12
            goto L_0x004b
        L_0x004a:
            r2 = -1
        L_0x004b:
            if (r2 == r5) goto L_0x0075
            java.lang.Object[] r11 = new java.lang.Object[r3]
            r12 = 672(0x2a0, float:9.42E-43)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11[r1] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            r11[r4] = r12
            r12 = 2
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            r11[r12] = r0
            java.lang.String r12 = "MicroMsg.FingerpirntReporter"
            java.lang.String r0 = "alvinluo soter idkey report id: %d, key: %d, value: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r0, r11)
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 672(0x2a0, double:3.32E-321)
            long r6 = (long) r2
            r10 = 0
            r8 = r13
            r3.idkeyStat(r4, r6, r8, r10)
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pv2.C77290d.m93105c(int, int, long):void");
    }

    /* renamed from: d */
    public static void m93106d(int i) {
        if (f225401b == -1) {
            Log.m105920e("MicroMsg.FingerpirntReporter", "hy: no current pay session");
            return;
        }
        C115669n.INSTANCE.mo160131h(16995, Integer.valueOf(f225401b), Integer.valueOf(i));
        f225401b = -1;
    }

    /* renamed from: e */
    public static void m93107e(int i, int i2, int i3, String str) {
        if (f225400a == -1) {
            Log.m105920e("MicroMsg.FingerpirntReporter", "hy: current open scene not set");
            return;
        }
        C115669n.INSTANCE.mo160131h(16992, Integer.valueOf(f225400a), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
    }

    /* renamed from: f */
    public static void m93108f(int i) {
        if (f225401b == -1) {
            Log.m105920e("MicroMsg.FingerpirntReporter", "hy: no current pay session");
            return;
        }
        C115669n.INSTANCE.mo160131h(12927, Integer.valueOf(f225401b), Integer.valueOf(i));
        f225401b = -1;
    }

    /* renamed from: g */
    public static void m93109g(int i, int i2, int i3, String str) {
        if (f225400a == -1) {
            Log.m105920e("MicroMsg.FingerpirntReporter", "hy: current open scene not set");
            return;
        }
        C115669n.INSTANCE.mo160131h(13413, Integer.valueOf(f225400a), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        f225400a = -1;
    }

    /* renamed from: h */
    public static void m93110h() {
        if (f225400a == -1) {
            Log.m105920e("MicroMsg.FingerpirntReporter", "hy: current open scene not set");
            return;
        }
        C115669n.INSTANCE.mo160131h(12926, Integer.valueOf(f225400a));
    }

    /* renamed from: i */
    public static void m93111i(int i, int i2) {
        Log.m105927v("MicroMsg.FingerpirntReporter", "alvinluo report open guide count, actionType: %d, actionCount: %d", Integer.valueOf(i), Integer.valueOf(i2));
        C115669n.INSTANCE.mo160131h(14381, Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: j */
    public static void m93112j() {
        if (f225400a == -1) {
            Log.m105920e("MicroMsg.FingerpirntReporter", "hy: current open scene not set");
            return;
        }
        C115669n.INSTANCE.mo160131h(12925, Integer.valueOf(f225400a));
    }

    /* renamed from: k */
    public static void m93113k() {
        ((C119157j) C119157j.f356862d).mo183875f(new C77291a());
    }
}
