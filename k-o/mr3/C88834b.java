package mr3;

import a70.C112760b;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.StatFs;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.xlog.app.XLogSetup;
import di3.C86312j;
import h81.C32735h;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: mr3.b */
public class C88834b {

    /* renamed from: g */
    public static final C88834b f256249g = new C88834b();

    /* renamed from: a */
    public boolean f256250a = true;

    /* renamed from: b */
    public boolean f256251b = true;

    /* renamed from: c */
    public Runnable f256252c = new C88835a();

    /* renamed from: d */
    public Runnable f256253d = new C88836b();

    /* renamed from: e */
    public HandlerThread f256254e = new HandlerThread("LogcatCatcher");

    /* renamed from: f */
    public Handler f256255f = null;

    /* renamed from: mr3.b$a */
    public class C88835a implements Runnable {
        public C88835a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:60:0x00dc A[SYNTHETIC, Splitter:B:60:0x00dc] */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x00e1 A[Catch:{ Exception -> 0x00e7 }] */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x00ee A[SYNTHETIC, Splitter:B:69:0x00ee] */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x00f3 A[Catch:{ Exception -> 0x00fb }] */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x00f8 A[Catch:{ Exception -> 0x00fb }] */
        /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r19 = this;
                r1 = r19
                java.lang.String r2 = ""
                java.lang.String r3 = "finish"
                mr3.b r0 = mr3.C88834b.this
                boolean r0 = r0.f256250a
                java.lang.String r4 = "MicroMsg.LogcatCatcher"
                if (r0 != 0) goto L_0x0015
                java.lang.String r0 = "worker not safe!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
                return
            L_0x0015:
                int r0 = android.os.Process.myPid()
                java.lang.String r0 = java.lang.String.valueOf(r0)
                java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getProcessName()
                r6 = 2
                java.lang.Object[] r6 = new java.lang.Object[r6]
                r7 = 0
                r6[r7] = r5
                r5 = 1
                r6[r5] = r0
                java.lang.String r8 = "init proc:%s, pid:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r8, r6)
                mr3.b r6 = mr3.C88834b.this
                java.lang.String r12 = mr3.C88834b.m110915a(r6)
                boolean r6 = r12.isEmpty()
                if (r6 == 0) goto L_0x0041
                java.lang.String r0 = "nameprefix empty!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
                return
            L_0x0041:
                r8 = 2
                r9 = 0
                java.lang.String r10 = com.tencent.p014mm.xlog.app.XLogSetup.cachePath
                java.lang.String r11 = com.tencent.p014mm.xlog.app.XLogSetup.logPath
                r13 = 0
                com.tencent.mm.sdk.platformtools.Log$LogInstance r6 = com.tencent.p014mm.sdk.platformtools.Log.openLogInstance(r8, r9, r10, r11, r12, r13)
                r6.setConsoleLogOpen(r7)
                r8 = 0
                java.lang.Runtime r9 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x00c4, all -> 0x00c0 }
                java.lang.String r10 = "logcat"
                java.lang.Process r9 = r9.exec(r10)     // Catch:{ Exception -> 0x00c4, all -> 0x00c0 }
                java.io.InputStreamReader r10 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00bb, all -> 0x00b6 }
                java.io.InputStream r11 = r9.getInputStream()     // Catch:{ Exception -> 0x00bb, all -> 0x00b6 }
                r10.<init>(r11)     // Catch:{ Exception -> 0x00bb, all -> 0x00b6 }
                java.io.BufferedReader r11 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00b3, all -> 0x00b0 }
                r11.<init>(r10)     // Catch:{ Exception -> 0x00b3, all -> 0x00b0 }
            L_0x0068:
                java.lang.Boolean r8 = com.tencent.p014mm.xlog.app.XLogSetup.isLogcatOpen     // Catch:{ Exception -> 0x00ae, all -> 0x00ac }
                boolean r8 = r8.booleanValue()     // Catch:{ Exception -> 0x00ae, all -> 0x00ac }
                if (r8 != 0) goto L_0x009f
                mr3.b r8 = mr3.C88834b.this     // Catch:{ Exception -> 0x00ae, all -> 0x00ac }
                boolean r12 = r8.f256251b     // Catch:{ Exception -> 0x00ae, all -> 0x00ac }
                if (r12 == 0) goto L_0x009f
                boolean r8 = r8.f256250a     // Catch:{ Exception -> 0x00ae, all -> 0x00ac }
                if (r8 == 0) goto L_0x009f
                java.lang.String r8 = r11.readLine()     // Catch:{ Exception -> 0x00ae, all -> 0x00ac }
                if (r8 == 0) goto L_0x009f
                boolean r12 = r8.contains(r0)     // Catch:{ Exception -> 0x00ae, all -> 0x00ac }
                java.lang.String r13 = " D "
                if (r12 == 0) goto L_0x0093
                boolean r5 = r8.contains(r13)     // Catch:{ Exception -> 0x00ae, all -> 0x00ac }
                if (r5 != 0) goto L_0x0091
                r6.iNoFormat(r2, r8)     // Catch:{ Exception -> 0x00ae, all -> 0x00ac }
            L_0x0091:
                r5 = 0
                goto L_0x0068
            L_0x0093:
                if (r5 == 0) goto L_0x0068
                boolean r12 = r8.contains(r13)     // Catch:{ Exception -> 0x00ae, all -> 0x00ac }
                if (r12 != 0) goto L_0x0068
                r6.iNoFormat(r2, r8)     // Catch:{ Exception -> 0x00ae, all -> 0x00ac }
                goto L_0x0068
            L_0x009f:
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
                r9.destroy()     // Catch:{ Exception -> 0x00e7 }
                r10.close()     // Catch:{ Exception -> 0x00e7 }
            L_0x00a8:
                r11.close()     // Catch:{ Exception -> 0x00e7 }
                goto L_0x00e7
            L_0x00ac:
                r0 = move-exception
                goto L_0x00b9
            L_0x00ae:
                r0 = move-exception
                goto L_0x00be
            L_0x00b0:
                r0 = move-exception
                r11 = r8
                goto L_0x00b9
            L_0x00b3:
                r0 = move-exception
                r11 = r8
                goto L_0x00be
            L_0x00b6:
                r0 = move-exception
                r10 = r8
                r11 = r10
            L_0x00b9:
                r8 = r9
                goto L_0x00e9
            L_0x00bb:
                r0 = move-exception
                r10 = r8
                r11 = r10
            L_0x00be:
                r8 = r9
                goto L_0x00c7
            L_0x00c0:
                r0 = move-exception
                r10 = r8
                r11 = r10
                goto L_0x00e9
            L_0x00c4:
                r0 = move-exception
                r10 = r8
                r11 = r10
            L_0x00c7:
                java.lang.Object[] r5 = new java.lang.Object[r7]     // Catch:{ all -> 0x00e8 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r2, r5)     // Catch:{ all -> 0x00e8 }
                com.tencent.mm.plugin.report.service.n r12 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x00e8 }
                r13 = 1504(0x5e0, double:7.43E-321)
                r15 = 3
                r17 = 1
                r12.mo175913w(r13, r15, r17)     // Catch:{ all -> 0x00e8 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
                if (r8 == 0) goto L_0x00df
                r8.destroy()     // Catch:{ Exception -> 0x00e7 }
            L_0x00df:
                if (r10 == 0) goto L_0x00e4
                r10.close()     // Catch:{ Exception -> 0x00e7 }
            L_0x00e4:
                if (r11 == 0) goto L_0x00e7
                goto L_0x00a8
            L_0x00e7:
                return
            L_0x00e8:
                r0 = move-exception
            L_0x00e9:
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
                if (r8 == 0) goto L_0x00f1
                r8.destroy()     // Catch:{ Exception -> 0x00fb }
            L_0x00f1:
                if (r10 == 0) goto L_0x00f6
                r10.close()     // Catch:{ Exception -> 0x00fb }
            L_0x00f6:
                if (r11 == 0) goto L_0x00fb
                r11.close()     // Catch:{ Exception -> 0x00fb }
            L_0x00fb:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: mr3.C88834b.C88835a.run():void");
        }
    }

    /* renamed from: mr3.b$b */
    public class C88836b implements Runnable {
        public C88836b() {
        }

        public void run() {
            long j;
            C86009m1[] u;
            boolean z = true;
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_logcat, 1) == 1) {
                C88834b bVar = C88834b.this;
                bVar.f256251b = true;
                if (!bVar.f256250a) {
                    Log.m105920e("MicroMsg.LogcatCatcher", "checker not safe!");
                    return;
                }
                bVar.getClass();
                try {
                    StatFs statFs = new StatFs(C112760b.m154230f0());
                    j = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
                } catch (Exception unused) {
                    j = 0;
                }
                if (j <= 0) {
                    j = 1;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("gree space:");
                sb.append(j);
                sb.append(" |");
                sb.append(6442450944L);
                sb.append("|");
                int i = (j > 6442450944L ? 1 : (j == 6442450944L ? 0 : -1));
                sb.append(i >= 0);
                Log.m105924i("MicroMsg.LogcatCatcher", sb.toString());
                if (!(i >= 0)) {
                    Log.m105920e("MicroMsg.LogcatCatcher", "no space!");
                    C88834b.this.f256250a = false;
                    return;
                }
                String a = C88834b.m110915a(C88834b.this);
                if (a.isEmpty()) {
                    Log.m105920e("MicroMsg.LogcatCatcher", "errorCheck nameprefix empty!");
                    return;
                }
                String str = a + "_" + new SimpleDateFormat("yyyyMMdd").format(new Date()) + ".xlog";
                C86009m1 m1Var = new C86009m1(XLogSetup.logPath);
                if (m1Var.mo119977o() && (u = m1Var.mo119984u()) != null) {
                    boolean z2 = true;
                    for (C86009m1 m1Var2 : u) {
                        if (m1Var2.getName().contains(str)) {
                            long r = m1Var2.mo119980r();
                            Log.m105925i("MicroMsg.LogcatCatcher", "checker find target file:%s, size:%s", str, String.valueOf(r));
                            if (r > 524288000) {
                                Log.m105920e("MicroMsg.LogcatCatcher", "maybe error! stop!");
                                z2 = false;
                            }
                        }
                    }
                    z = z2;
                }
                C88834b bVar2 = C88834b.this;
                bVar2.f256255f.removeCallbacks(bVar2.f256253d);
                if (z) {
                    C88834b bVar3 = C88834b.this;
                    bVar3.f256255f.postDelayed(bVar3.f256253d, 60000);
                    return;
                }
                C88834b.this.f256250a = false;
                C115669n.INSTANCE.mo175913w(1504, 2, 1);
                return;
            }
            C88834b.this.f256251b = false;
            Log.m105920e("MicroMsg.LogcatCatcher", "no need to work");
        }
    }

    /* renamed from: a */
    public static String m110915a(C88834b bVar) {
        bVar.getClass();
        String processName = MMApplicationContext.getProcessName();
        return MMApplicationContext.isMainProcess() ? "LOGCATMM" : processName.endsWith(":push") ? "LOGCATPUSH" : processName.endsWith(":tools") ? "LOGCATTOOLS" : processName.endsWith(":appbrand0") ? "LOGCATAPPBRAND0" : processName.endsWith(":appbrand1") ? "LOGCATAPPBRAND1" : processName.endsWith(":appbrand2") ? "LOGCATAPPBRAND2" : processName.endsWith(":appbrand3") ? "LOGCATAPPBRAND3" : processName.endsWith(":appbrand4") ? "LOGCATAPPBRAND4" : "";
    }
}
