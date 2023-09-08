package com.tencent.p014mm.normsgext;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.tencent.p014mm.plugin.normsg.C115634f;
import com.tencent.p014mm.plugin.report.service.C115669n;
import j20.C117292a;
import java.util.concurrent.CountDownLatch;
import k20.C9556a;
import p156gj.C87203t;
import pv2.C110259i;
import yc2.C118984p;

/* renamed from: com.tencent.mm.normsgext.d */
final class C81049d {

    /* renamed from: com.tencent.mm.normsgext.d$m */
    public static final class C81050m {

        /* renamed from: com.tencent.mm.normsgext.d$m$a */
        public static class C29064a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f79609d;

            /* renamed from: e */
            public final /* synthetic */ CountDownLatch f79610e;

            public C29064a(String str, CountDownLatch countDownLatch) {
                this.f79609d = str;
                this.f79610e = countDownLatch;
            }

            public void run() {
                String str = this.f79609d;
                C9556a aVar = new C9556a();
                aVar.mo10233c(str);
                Object obj = new Object();
                C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/normsgext/d$m$1", "run", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                System.loadLibrary((String) aVar.mo10231a(0));
                C117292a.m165359e(obj, "com/tencent/mm/normsgext/d$m$1", "run", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                this.f79610e.countDown();
            }
        }

        static {
            StringBuilder reverse = new StringBuilder("tahcew").reverse();
            reverse.append(new StringBuilder("txegsmron").reverse().toString());
            String sb = reverse.toString();
            if (Process.myPid() == Process.myTid()) {
                C9556a aVar = new C9556a();
                aVar.mo10233c(sb);
                Object obj = new Object();
                C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/normsgext/d$m", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                System.loadLibrary((String) aVar.mo10231a(0));
                C117292a.m165359e(obj, "com/tencent/mm/normsgext/d$m", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                return;
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new C29064a(sb, countDownLatch));
            try {
                countDownLatch.await();
            } catch (Throwable unused) {
            }
        }

        /* renamed from: ba */
        public static native boolean m99021ba(int i, byte[] bArr, int i2, int i3, QValue<Integer> qValue, QValue<Integer> qValue2, QValue<byte[]> qValue3);
    }

    /* renamed from: com.tencent.mm.normsgext.d$n */
    public static final class C81051n {

        /* renamed from: a */
        public static volatile C114837a f238073a;

        /* renamed from: c0 */
        public static synchronized void m99022c0(C114837a aVar) {
            synchronized (C81051n.class) {
                f238073a = aVar;
            }
        }

        /* renamed from: c1 */
        public static synchronized String m99023c1() {
            synchronized (C81051n.class) {
                if (f238073a == null) {
                    return "";
                }
                String Ax0 = ((C115634f) f238073a).Ax0();
                return Ax0;
            }
        }

        private static String c10() {
            if (f238073a == null) {
                return "";
            }
            ((C115634f) f238073a).getClass();
            return C87203t.m108273i();
        }

        private static boolean c11(String str, byte[] bArr) {
            if (f238073a != null) {
                return ((C115634f) f238073a).Dx0(str, bArr);
            }
            return false;
        }

        private static byte[] c12(String str) {
            return f238073a != null ? ((C115634f) f238073a).xx0(str) : new byte[0];
        }

        private static void c13(String str) {
            if (f238073a != null) {
                ((C115634f) f238073a).Ex0(str);
            }
        }

        private static String c14() {
            return f238073a != null ? ((C115634f) f238073a).mo175831r4() : "";
        }

        private static String c15(Context context, String str) {
            return f238073a != null ? ((C115634f) f238073a).wx0(context, str) : str;
        }

        private static boolean c16(Context context) {
            if (f238073a != null) {
                return ((C115634f) f238073a).zx0(context);
            }
            return false;
        }

        /* renamed from: c2 */
        public static synchronized long m99024c2() {
            synchronized (C81051n.class) {
                if (f238073a == null) {
                    return 0;
                }
                long yx02 = ((C115634f) f238073a).yx0();
                return yx02;
            }
        }

        /* renamed from: c3 */
        public static synchronized void m99025c3(int i, String str) {
            synchronized (C81051n.class) {
                if (f238073a != null) {
                    ((C115634f) f238073a).getClass();
                    C115669n.INSTANCE.kvStat(i, str);
                }
            }
        }

        /* renamed from: c4 */
        public static synchronized void m99026c4(int i, int i2, int i3) {
            synchronized (C81051n.class) {
                if (f238073a != null) {
                    ((C115634f) f238073a).getClass();
                    C115669n.INSTANCE.mo175913w((long) i, (long) i2, (long) i3);
                }
            }
        }

        /* renamed from: c5 */
        public static synchronized void m99027c5(int i, int i2, int i3, int i4) {
            synchronized (C81051n.class) {
                if (f238073a != null) {
                    ((C115634f) f238073a).getClass();
                    C115669n.INSTANCE.mo160138m(i, i2, i3, i4, true);
                }
            }
        }

        /* renamed from: c6 */
        public static synchronized String m99028c6() {
            synchronized (C81051n.class) {
            }
            return "";
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
            return r1;
         */
        /* renamed from: c7 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static synchronized java.lang.String m99029c7() {
            /*
                java.lang.Class<com.tencent.mm.normsgext.d$n> r0 = com.tencent.p014mm.normsgext.C81049d.C81051n.class
                monitor-enter(r0)
                com.tencent.mm.normsgext.a r1 = f238073a     // Catch:{ all -> 0x001f }
                if (r1 == 0) goto L_0x001b
                com.tencent.mm.normsgext.a r1 = f238073a     // Catch:{ all -> 0x001f }
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
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.normsgext.C81049d.C81051n.m99029c7():java.lang.String");
        }

        /* renamed from: c8 */
        private static boolean m99030c8() {
            if (f238073a == null) {
                return false;
            }
            ((C115634f) f238073a).getClass();
            return C118984p.f356414b;
        }

        /* renamed from: c9 */
        private static String m99031c9() {
            if (f238073a == null) {
                return "";
            }
            ((C115634f) f238073a).getClass();
            String str = C110259i.m149874a().f329809b;
            return str != null ? str : "";
        }
    }
}
