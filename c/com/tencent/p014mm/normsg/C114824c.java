package com.tencent.p014mm.normsg;

import a70.C79471a;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.tencent.mars.comm.NetworkSignalUtil;
import com.tencent.p014mm.plugin.normsg.C115634f;
import com.tencent.p014mm.plugin.normsg.C115639g;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.ConnectivityCompat;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import k20.C9556a;
import nc0.C76850a;
import p156gj.C87203t;
import p182kk.C61104a;
import p734vz.C90876f;
import pv2.C110259i;
import yc2.C118984p;
import yc2.C91439h;

/* renamed from: com.tencent.mm.normsg.c */
final class C114824c {

    /* renamed from: com.tencent.mm.normsg.c$p */
    public static final class C114825p {

        /* renamed from: com.tencent.mm.normsg.c$p$a */
        public class C114826a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f344282d;

            /* renamed from: e */
            public final /* synthetic */ CountDownLatch f344283e;

            public C114826a(String str, CountDownLatch countDownLatch) {
                this.f344282d = str;
                this.f344283e = countDownLatch;
            }

            public void run() {
                String str = this.f344282d;
                C9556a aVar = new C9556a();
                aVar.mo10233c(str);
                Object obj = new Object();
                C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/normsg/c$p$1", "run", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                System.loadLibrary((String) aVar.mo10231a(0));
                C117292a.m165359e(obj, "com/tencent/mm/normsg/c$p$1", "run", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                this.f344283e.countDown();
            }
        }

        public static void _i0() {
            StringBuilder reverse = new StringBuilder("tahcew").reverse();
            reverse.append(new StringBuilder("gsmron").reverse().toString());
            String sb = reverse.toString();
            if (Process.myPid() == Process.myTid()) {
                C9556a aVar = new C9556a();
                aVar.mo10233c(sb);
                Object obj = new Object();
                C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/normsg/c$p", "_i0", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                System.loadLibrary((String) aVar.mo10231a(0));
                C117292a.m165359e(obj, "com/tencent/mm/normsg/c$p", "_i0", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                return;
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new C114826a(sb, countDownLatch));
            try {
                countDownLatch.await();
            } catch (Throwable unused) {
            }
        }

        /* renamed from: aa */
        public static native byte[] m161664aa(int i, int i2);

        /* renamed from: ab */
        public static native boolean m161665ab();

        /* renamed from: ac */
        public static native String m161666ac(String str, boolean z);

        /* renamed from: ad */
        public static native byte[] m161667ad();

        /* renamed from: ae */
        public static native byte[] m161668ae(int i);

        /* renamed from: af */
        public static native byte[] m161669af(int i);

        /* renamed from: ag */
        public static native boolean m161670ag();

        /* renamed from: ah */
        public static native boolean m161671ah();

        /* renamed from: ai */
        public static native boolean m161672ai();

        /* renamed from: aj */
        public static native boolean m161673aj();

        /* renamed from: ak */
        public static native void m161674ak();

        /* renamed from: al */
        public static native boolean m161675al();

        /* renamed from: am */
        public static native byte[] m161676am(Intent intent);

        /* renamed from: an */
        public static native byte[] m161677an(String str, long j, String str2, int i);

        /* renamed from: ao */
        public static native int m161678ao();

        /* renamed from: ba */
        public static native String m161679ba(int i);

        /* renamed from: bb */
        public static native String m161680bb(int i);

        /* renamed from: bc */
        public static native boolean m161681bc(int i, byte[] bArr, int i2, int i3, PValue<Integer> pValue, PValue<Integer> pValue2, PValue<byte[]> pValue3);

        /* renamed from: bd */
        public static native boolean m161682bd(byte[] bArr, int i, int i2, PValue<byte[]> pValue, PValue<byte[]> pValue2);

        /* renamed from: be */
        public static native boolean m161683be(byte[] bArr, int i, int i2, PValue<byte[]> pValue, PValue<byte[]> pValue2);

        /* renamed from: ca */
        public static native boolean m161684ca(Object obj, Class<?> cls);

        /* renamed from: cb */
        public static native boolean m161685cb(Object obj);

        /* renamed from: da */
        public static native void m161686da(String str);

        /* renamed from: db */
        public static native void m161687db(String str);

        /* renamed from: dc */
        public static native void m161688dc(String str);

        /* renamed from: dd */
        public static native boolean m161689dd(String str);

        /* renamed from: de */
        public static native byte[] m161690de(String str);

        /* renamed from: df */
        public static native void m161691df(String str, String str2, String str3);

        /* renamed from: dg */
        public static native void m161692dg(String str, MotionEvent motionEvent);

        /* renamed from: dh */
        public static native void m161693dh(String str);

        /* renamed from: di */
        public static native boolean m161694di(String str);

        /* renamed from: dj */
        public static native byte[] m161695dj(String str);

        /* renamed from: dk */
        public static native String m161696dk(String str);

        /* renamed from: ea */
        public static native byte[] m161697ea(int i, int i2);

        /* renamed from: eb */
        public static native boolean m161698eb(byte[] bArr, int i, int i2);

        /* renamed from: ec */
        public static native boolean m161699ec();

        /* renamed from: ed */
        public static native byte[] m161700ed();

        /* renamed from: ee */
        public static native byte[] m161701ee();

        /* renamed from: ef */
        public static native String m161702ef();

        /* renamed from: eg */
        public static native String m161703eg();

        /* renamed from: eh */
        public static native String m161704eh();

        /* renamed from: fa */
        public static native void m161705fa(String str, int i, int i2);

        /* renamed from: fb */
        public static native void m161706fb(int i, List<C114828d> list);

        /* renamed from: fc */
        public static native boolean m161707fc();

        /* renamed from: fd */
        public static native void m161708fd();

        /* renamed from: fe */
        public static native void m161709fe(int i);

        /* renamed from: ff */
        public static native void m161710ff(int i);

        /* renamed from: fg */
        public static native boolean m161711fg(String str);

        /* renamed from: fh */
        public static native void m161712fh(String str);

        /* renamed from: fi */
        public static native byte[] m161713fi(String str);

        /* renamed from: fj */
        public static native void m161714fj(String str);

        /* renamed from: fk */
        public static native void m161715fk();

        /* renamed from: fl */
        public static native int m161716fl(String str);
    }

    /* renamed from: com.tencent.mm.normsg.c$q */
    public static final class C114827q {

        /* renamed from: a */
        public static volatile C114823a f344284a;

        /* renamed from: c0 */
        public static synchronized void m161717c0(C114823a aVar) {
            synchronized (C114827q.class) {
                f344284a = aVar;
            }
        }

        /* renamed from: c1 */
        public static synchronized String m161718c1() {
            synchronized (C114827q.class) {
                if (f344284a == null) {
                    return "";
                }
                String Ax0 = ((C115634f) f344284a).Ax0();
                return Ax0;
            }
        }

        private static String c10() {
            if (f344284a == null) {
                return "";
            }
            ((C115634f) f344284a).getClass();
            return C87203t.m108273i();
        }

        private static boolean c11(String str, byte[] bArr) {
            if (f344284a != null) {
                return ((C115634f) f344284a).Dx0(str, bArr);
            }
            return false;
        }

        private static byte[] c12(String str) {
            return f344284a != null ? ((C115634f) f344284a).xx0(str) : new byte[0];
        }

        private static void c13(String str) {
            if (f344284a != null) {
                ((C115634f) f344284a).Ex0(str);
            }
        }

        private static String c14() {
            return f344284a != null ? ((C115634f) f344284a).mo175831r4() : "";
        }

        private static String c15(Context context, String str) {
            return f344284a != null ? ((C115634f) f344284a).wx0(context, str) : str;
        }

        private static boolean c16(Context context) {
            if (f344284a != null) {
                return ((C115634f) f344284a).zx0(context);
            }
            return false;
        }

        private static boolean c17() {
            String str;
            if (f344284a == null) {
                return false;
            }
            ((C115634f) f344284a).getClass();
            try {
                str = (String) C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null);
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.NormsgSourceImpl", th, "[-] Error happened.", new Object[0]);
                str = MultiProcessMMKV.getMMKV("mmkv_crossprocess_infos").decodeString("mmkv_key_user_reg_ic", (String) null);
            }
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            Set<String> set = C91439h.f262163a;
            if (C76850a.m92639k(str)) {
                return true;
            }
            C91439h.f262163a.contains(str.toUpperCase());
            return true;
        }

        private static String c18() {
            if (f344284a == null) {
                return "";
            }
            ((C115634f) f344284a).getClass();
            return NetStatusUtil.isWifiFromCache(MMApplicationContext.getContext()) ? ConnectivityCompat.Companion.getWiFiSsid() : "";
        }

        private static String c19() {
            if (f344284a == null) {
                return "";
            }
            ((C115634f) f344284a).getClass();
            return NetStatusUtil.isWifiFromCache(MMApplicationContext.getContext()) ? ConnectivityCompat.Companion.getWiFiBssid() : "";
        }

        /* renamed from: c2 */
        public static synchronized long m161719c2() {
            synchronized (C114827q.class) {
                if (f344284a == null) {
                    return 0;
                }
                long yx02 = ((C115634f) f344284a).yx0();
                return yx02;
            }
        }

        private static List<String> c20() {
            if (f344284a == null) {
                return new ArrayList();
            }
            C115634f fVar = (C115634f) f344284a;
            fVar.getClass();
            try {
                LinkedList linkedList = new LinkedList();
                Collections.sort(linkedList, new C115639g(fVar));
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < linkedList.size(); i++) {
                    String bssid = ((ConnectivityCompat.WiFiScanResult) linkedList.get(i)).getBssid();
                    if (!TextUtils.isEmpty(bssid)) {
                        arrayList.add(bssid);
                        if (arrayList.size() >= 5) {
                            return arrayList;
                        }
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.NormsgSourceImpl", th, "[-] Error happened.", new Object[0]);
                return new ArrayList();
            }
        }

        private static long c21() {
            if (f344284a == null) {
                return -1;
            }
            ((C115634f) f344284a).getClass();
            try {
                return NetworkSignalUtil.getGSMSignalStrength();
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.NormsgSourceImpl", th, "[-] Error happened.", new Object[0]);
                return -1;
            }
        }

        private static String c22() {
            if (f344284a == null) {
                return "";
            }
            ((C115634f) f344284a).getClass();
            String b = C87203t.m108266b();
            return b == null ? "" : b;
        }

        private static boolean c23() {
            if (f344284a == null) {
                return false;
            }
            ((C115634f) f344284a).getClass();
            return !(!"false".equalsIgnoreCase(C79471a.f233013a));
        }

        private static int c24(Context context) {
            if (f344284a == null) {
                return 2;
            }
            f344284a.getClass();
            return 0;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: yc2.m$$b} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static com.tencent.p014mm.normsg.C29063b c25() {
            /*
                com.tencent.mm.normsg.a r0 = f344284a
                r1 = 0
                if (r0 == 0) goto L_0x004a
                com.tencent.mm.normsg.a r0 = f344284a
                com.tencent.mm.plugin.normsg.f r0 = (com.tencent.p014mm.plugin.normsg.C115634f) r0
                r0.getClass()
                yc2.m r0 = yc2.C118982m.INSTANCE
                java.util.concurrent.ConcurrentHashMap<java.lang.Integer, yc2.m$$b> r2 = r0.f356407d
                boolean r2 = r2.isEmpty()
                r3 = 0
                if (r2 == 0) goto L_0x0018
                goto L_0x0032
            L_0x0018:
                java.util.LinkedList r1 = new java.util.LinkedList
                java.util.concurrent.ConcurrentHashMap<java.lang.Integer, yc2.m$$b> r0 = r0.f356407d
                java.util.Collection r0 = r0.values()
                r1.<init>(r0)
                yc2.m$$a r0 = new yc2.m$$a
                r0.<init>()
                java.util.Collections.sort(r1, r0)
                java.lang.Object r0 = r1.get(r3)
                r1 = r0
                yc2.m$$b r1 = (yc2.m$$b) r1
            L_0x0032:
                if (r1 == 0) goto L_0x0040
                com.tencent.mm.normsg.b r0 = new com.tencent.mm.normsg.b
                int r2 = r1.f356409a
                java.lang.String r3 = r1.f356410b
                long r4 = r1.f356411c
                r0.<init>(r2, r3, r4)
                goto L_0x0049
            L_0x0040:
                com.tencent.mm.normsg.b r0 = new com.tencent.mm.normsg.b
                r1 = 0
                java.lang.String r4 = ""
                r0.<init>(r3, r4, r1)
            L_0x0049:
                return r0
            L_0x004a:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.normsg.C114824c.C114827q.c25():com.tencent.mm.normsg.b");
        }

        private static int c26() {
            if (f344284a == null) {
                return 0;
            }
            ((C115634f) f344284a).getClass();
            Class cls = C90876f.class;
            if (((C90876f) C86312j.m106911c(cls)).mo124867WV()) {
                return 1;
            }
            if (((C90876f) C86312j.m106911c(cls)).mo124869yj()) {
                return 2;
            }
            if (C61104a.m71644D()) {
                return 3;
            }
            return ((C90876f) C86312j.m106911c(cls)).mo124868Wj() ? 4 : 0;
        }

        /* renamed from: c3 */
        public static synchronized void m161720c3(int i, String str) {
            synchronized (C114827q.class) {
                if (f344284a != null) {
                    ((C115634f) f344284a).getClass();
                    C115669n.INSTANCE.kvStat(i, str);
                }
            }
        }

        /* renamed from: c4 */
        public static synchronized void m161721c4(int i, int i2, int i3) {
            synchronized (C114827q.class) {
                if (f344284a != null) {
                    ((C115634f) f344284a).getClass();
                    C115669n.INSTANCE.mo175913w((long) i, (long) i2, (long) i3);
                }
            }
        }

        /* renamed from: c5 */
        public static synchronized void m161722c5(int i, int i2, int i3, int i4) {
            synchronized (C114827q.class) {
                if (f344284a != null) {
                    ((C115634f) f344284a).getClass();
                    C115669n.INSTANCE.mo160138m(i, i2, i3, i4, true);
                }
            }
        }

        /* renamed from: c6 */
        public static synchronized String m161723c6() {
            synchronized (C114827q.class) {
            }
            return "";
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
            return r1;
         */
        /* renamed from: c7 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static synchronized java.lang.String m161724c7() {
            /*
                java.lang.Class<com.tencent.mm.normsg.c$q> r0 = com.tencent.p014mm.normsg.C114824c.C114827q.class
                monitor-enter(r0)
                com.tencent.mm.normsg.a r1 = f344284a     // Catch:{ all -> 0x001f }
                if (r1 == 0) goto L_0x001b
                com.tencent.mm.normsg.a r1 = f344284a     // Catch:{ all -> 0x001f }
                com.tencent.mm.plugin.normsg.f r1 = (com.tencent.p014mm.plugin.normsg.C115634f) r1     // Catch:{ all -> 0x001f }
                r1.getClass()     // Catch:{ all -> 0x001f }
                pv2.j r1 = pv2.C110259i.m149874a()     // Catch:{ all -> 0x001f }
                java.lang.String r1 = r1.f329808a     // Catch:{ all -> 0x001f }
                if (r1 == 0) goto L_0x0017
                goto L_0x0019
            L_0x0017:
                java.lang.String r1 = ""
            L_0x0019:
                monitor-exit(r0)
                return r1
            L_0x001b:
                java.lang.String r1 = ""
                monitor-exit(r0)
                return r1
            L_0x001f:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.normsg.C114824c.C114827q.m161724c7():java.lang.String");
        }

        /* renamed from: c8 */
        private static boolean m161725c8() {
            if (f344284a == null) {
                return false;
            }
            ((C115634f) f344284a).getClass();
            return C118984p.f356414b;
        }

        /* renamed from: c9 */
        private static String m161726c9() {
            if (f344284a == null) {
                return "";
            }
            ((C115634f) f344284a).getClass();
            String str = C110259i.m149874a().f329809b;
            return str != null ? str : "";
        }
    }
}
