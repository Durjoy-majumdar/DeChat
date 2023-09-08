package mr3;

import com.tencent.mars.xlog.Xlog;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.xlog.app.XLogSetup;
import di3.C86312j;
import h81.C32735h;

/* renamed from: mr3.a */
public class C88832a {

    /* renamed from: b */
    public static C88832a f256247b = new C88832a();

    /* renamed from: a */
    public Runnable f256248a = new C88833a(this);

    /* renamed from: mr3.a$a */
    public class C88833a implements Runnable {
        public C88833a(C88832a aVar) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:34:0x0075 A[SYNTHETIC, Splitter:B:34:0x0075] */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x007a A[Catch:{ Exception -> 0x0080 }] */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x0085 A[SYNTHETIC, Splitter:B:43:0x0085] */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x008a A[Catch:{ Exception -> 0x0092 }] */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x008f A[Catch:{ Exception -> 0x0092 }] */
        /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r8 = this;
                java.lang.String r0 = "MicroMsg.CrashLogcatCatcher"
                r1 = 0
                java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x0066, all -> 0x0062 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0066, all -> 0x0062 }
                r3.<init>()     // Catch:{ Exception -> 0x0066, all -> 0x0062 }
                java.lang.String r4 = "logcat -b all -t 100 --pid="
                r3.append(r4)     // Catch:{ Exception -> 0x0066, all -> 0x0062 }
                int r4 = android.os.Process.myPid()     // Catch:{ Exception -> 0x0066, all -> 0x0062 }
                r3.append(r4)     // Catch:{ Exception -> 0x0066, all -> 0x0062 }
                java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0066, all -> 0x0062 }
                java.lang.Process r2 = r2.exec(r3)     // Catch:{ Exception -> 0x0066, all -> 0x0062 }
                java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x005d, all -> 0x0059 }
                java.io.InputStream r4 = r2.getInputStream()     // Catch:{ Exception -> 0x005d, all -> 0x0059 }
                r3.<init>(r4)     // Catch:{ Exception -> 0x005d, all -> 0x0059 }
                java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0054, all -> 0x0051 }
                r4.<init>(r3)     // Catch:{ Exception -> 0x0054, all -> 0x0051 }
            L_0x002e:
                java.lang.Boolean r1 = com.tencent.p014mm.xlog.app.XLogSetup.isLogcatOpen     // Catch:{ Exception -> 0x004f }
                boolean r1 = r1.booleanValue()     // Catch:{ Exception -> 0x004f }
                if (r1 != 0) goto L_0x0040
                java.lang.String r1 = r4.readLine()     // Catch:{ Exception -> 0x004f }
                if (r1 == 0) goto L_0x0040
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ Exception -> 0x004f }
                goto L_0x002e
            L_0x0040:
                java.lang.String r1 = "finish"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ Exception -> 0x004f }
                r2.destroy()     // Catch:{ Exception -> 0x0080 }
                r3.close()     // Catch:{ Exception -> 0x0080 }
            L_0x004b:
                r4.close()     // Catch:{ Exception -> 0x0080 }
                goto L_0x0080
            L_0x004f:
                r1 = move-exception
                goto L_0x006b
            L_0x0051:
                r0 = move-exception
                r4 = r1
                goto L_0x0082
            L_0x0054:
                r4 = move-exception
                r7 = r4
                r4 = r1
                r1 = r7
                goto L_0x006b
            L_0x0059:
                r0 = move-exception
                r3 = r1
                r4 = r3
                goto L_0x0082
            L_0x005d:
                r3 = move-exception
                r4 = r1
                r1 = r3
                r3 = r4
                goto L_0x006b
            L_0x0062:
                r0 = move-exception
                r3 = r1
                r4 = r3
                goto L_0x0083
            L_0x0066:
                r2 = move-exception
                r3 = r1
                r4 = r3
                r1 = r2
                r2 = r4
            L_0x006b:
                java.lang.String r5 = ""
                r6 = 0
                java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x0081 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r1, r5, r6)     // Catch:{ all -> 0x0081 }
                if (r2 == 0) goto L_0x0078
                r2.destroy()     // Catch:{ Exception -> 0x0080 }
            L_0x0078:
                if (r3 == 0) goto L_0x007d
                r3.close()     // Catch:{ Exception -> 0x0080 }
            L_0x007d:
                if (r4 == 0) goto L_0x0080
                goto L_0x004b
            L_0x0080:
                return
            L_0x0081:
                r0 = move-exception
            L_0x0082:
                r1 = r2
            L_0x0083:
                if (r1 == 0) goto L_0x0088
                r1.destroy()     // Catch:{ Exception -> 0x0092 }
            L_0x0088:
                if (r3 == 0) goto L_0x008d
                r3.close()     // Catch:{ Exception -> 0x0092 }
            L_0x008d:
                if (r4 == 0) goto L_0x0092
                r4.close()     // Catch:{ Exception -> 0x0092 }
            L_0x0092:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: mr3.C88832a.C88833a.run():void");
        }
    }

    /* renamed from: a */
    public void mo123217a() {
        C86013q1.m106444e(MMApplicationContext.getContext().getFilesDir().getAbsolutePath() + "/crashFlag.live");
        if (Log.getImpl().getClass() != Xlog.class) {
            Log.m105920e("MicroMsg.CrashLogcatCatcher", "impl is not xlog!");
            return;
        }
        Log.m105924i("MicroMsg.CrashLogcatCatcher", "Log.consoleLogOpen:" + XLogSetup.isLogcatOpen);
        if (!XLogSetup.isLogcatOpen.booleanValue()) {
            int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_logcat_crash, 0);
            Log.m105924i("MicroMsg.CrashLogcatCatcher", "is need work :" + Qe);
            if (Qe != 0) {
                ((C88833a) this.f256248a).run();
            }
        }
    }
}
