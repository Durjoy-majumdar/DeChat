package mr3;

import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: mr3.d */
public class C88838d {

    /* renamed from: c */
    public static C88838d f256259c = new C88838d();

    /* renamed from: a */
    public String f256260a;

    /* renamed from: b */
    public Runnable f256261b = new C88839a();

    /* renamed from: mr3.d$a */
    public class C88839a implements Runnable {
        public C88839a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:52:0x00f1 A[SYNTHETIC, Splitter:B:52:0x00f1] */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x00f6 A[Catch:{ Exception -> 0x00fc }] */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x0101 A[SYNTHETIC, Splitter:B:60:0x0101] */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x0106 A[Catch:{ Exception -> 0x010e }] */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x010b A[Catch:{ Exception -> 0x010e }] */
        /* JADX WARNING: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r11 = this;
                mr3.d r0 = mr3.C88838d.this
                java.lang.String r0 = mr3.C88838d.m110916a(r0)
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                java.lang.String r1 = "MicroMsg.StartupLogcatCatcher"
                if (r0 == 0) goto L_0x0015
                java.lang.String r0 = "proc null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
                return
            L_0x0015:
                mr3.d r0 = mr3.C88838d.this
                java.lang.String r0 = mr3.C88838d.m110916a(r0)
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getSingleMMKV(r0)
                mr3.d r2 = mr3.C88838d.this
                java.lang.String r3 = "last_process_id"
                java.lang.String r4 = ""
                java.lang.String r5 = r0.getString(r3, r4)
                r2.f256260a = r5
                int r2 = android.os.Process.myPid()
                java.lang.String r2 = java.lang.String.valueOf(r2)
                r0.putString(r3, r2)
                r0.commit()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "last proc id:"
                r0.append(r2)
                mr3.d r2 = mr3.C88838d.this
                java.lang.String r2 = r2.f256260a
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                mr3.d r0 = mr3.C88838d.this
                java.lang.String r0 = r0.f256260a
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L_0x005c
                return
            L_0x005c:
                r0 = 0
                r2 = 0
                java.lang.Runtime r3 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x00e5, all -> 0x00e1 }
                java.lang.String r5 = "logcat -b all -t 2000"
                java.lang.Process r3 = r3.exec(r5)     // Catch:{ Exception -> 0x00e5, all -> 0x00e1 }
                java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00dc, all -> 0x00d7 }
                java.io.InputStream r6 = r3.getInputStream()     // Catch:{ Exception -> 0x00dc, all -> 0x00d7 }
                r5.<init>(r6)     // Catch:{ Exception -> 0x00dc, all -> 0x00d7 }
                java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00d2, all -> 0x00cf }
                r6.<init>(r5)     // Catch:{ Exception -> 0x00d2, all -> 0x00cf }
                java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x0097 }
                r2.<init>()     // Catch:{ Exception -> 0x0097 }
            L_0x007b:
                java.lang.Boolean r7 = com.tencent.p014mm.xlog.app.XLogSetup.isLogcatOpen     // Catch:{ Exception -> 0x0097 }
                boolean r7 = r7.booleanValue()     // Catch:{ Exception -> 0x0097 }
                if (r7 != 0) goto L_0x009a
                java.lang.String r7 = r6.readLine()     // Catch:{ Exception -> 0x0097 }
                if (r7 == 0) goto L_0x009a
                mr3.d r8 = mr3.C88838d.this     // Catch:{ Exception -> 0x0097 }
                java.lang.String r8 = r8.f256260a     // Catch:{ Exception -> 0x0097 }
                boolean r8 = r7.contains(r8)     // Catch:{ Exception -> 0x0097 }
                if (r8 == 0) goto L_0x007b
                r2.add(r7)     // Catch:{ Exception -> 0x0097 }
                goto L_0x007b
            L_0x0097:
                r2 = move-exception
                goto L_0x00ea
            L_0x009a:
                int r7 = r2.size()     // Catch:{ Exception -> 0x0097 }
                r8 = 100
                if (r7 < r8) goto L_0x00a3
                goto L_0x00a7
            L_0x00a3:
                int r8 = r2.size()     // Catch:{ Exception -> 0x0097 }
            L_0x00a7:
                java.util.Collections.reverse(r2)     // Catch:{ Exception -> 0x0097 }
                java.util.List r2 = r2.subList(r0, r8)     // Catch:{ Exception -> 0x0097 }
                java.util.Collections.reverse(r2)     // Catch:{ Exception -> 0x0097 }
                r7 = 0
            L_0x00b2:
                if (r7 >= r8) goto L_0x00c0
                java.lang.Object r9 = r2.get(r7)     // Catch:{ Exception -> 0x0097 }
                java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x0097 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r9)     // Catch:{ Exception -> 0x0097 }
                int r7 = r7 + 1
                goto L_0x00b2
            L_0x00c0:
                java.lang.String r2 = "finish"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ Exception -> 0x0097 }
                r3.destroy()     // Catch:{ Exception -> 0x00fc }
                r5.close()     // Catch:{ Exception -> 0x00fc }
            L_0x00cb:
                r6.close()     // Catch:{ Exception -> 0x00fc }
                goto L_0x00fc
            L_0x00cf:
                r0 = move-exception
                r6 = r2
                goto L_0x00da
            L_0x00d2:
                r6 = move-exception
                r10 = r6
                r6 = r2
                r2 = r10
                goto L_0x00ea
            L_0x00d7:
                r0 = move-exception
                r5 = r2
                r6 = r5
            L_0x00da:
                r2 = r3
                goto L_0x00ff
            L_0x00dc:
                r5 = move-exception
                r6 = r2
                r2 = r5
                r5 = r6
                goto L_0x00ea
            L_0x00e1:
                r0 = move-exception
                r5 = r2
                r6 = r5
                goto L_0x00ff
            L_0x00e5:
                r3 = move-exception
                r5 = r2
                r6 = r5
                r2 = r3
                r3 = r6
            L_0x00ea:
                java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x00fd }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r2, r4, r0)     // Catch:{ all -> 0x00fd }
                if (r3 == 0) goto L_0x00f4
                r3.destroy()     // Catch:{ Exception -> 0x00fc }
            L_0x00f4:
                if (r5 == 0) goto L_0x00f9
                r5.close()     // Catch:{ Exception -> 0x00fc }
            L_0x00f9:
                if (r6 == 0) goto L_0x00fc
                goto L_0x00cb
            L_0x00fc:
                return
            L_0x00fd:
                r0 = move-exception
                goto L_0x00da
            L_0x00ff:
                if (r2 == 0) goto L_0x0104
                r2.destroy()     // Catch:{ Exception -> 0x010e }
            L_0x0104:
                if (r5 == 0) goto L_0x0109
                r5.close()     // Catch:{ Exception -> 0x010e }
            L_0x0109:
                if (r6 == 0) goto L_0x010e
                r6.close()     // Catch:{ Exception -> 0x010e }
            L_0x010e:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: mr3.C88838d.C88839a.run():void");
        }
    }

    /* renamed from: a */
    public static String m110916a(C88838d dVar) {
        dVar.getClass();
        String processName = MMApplicationContext.getProcessName();
        return MMApplicationContext.isMainProcess() ? "STARTUP_LOGCAT_MM" : processName.endsWith(":push") ? "STARTUP_LOGCAT_PUSH" : processName.endsWith(":tools") ? "STARTUP_LOGCAT_TOOLS" : processName.endsWith(":appbrand0") ? "STARTUP_LOGCAT_APPBRAND0" : processName.endsWith(":appbrand1") ? "STARTUP_LOGCAT_APPBRAND1" : processName.endsWith(":appbrand2") ? "STARTUP_LOGCAT_APPBRAND2" : processName.endsWith(":appbrand3") ? "STARTUP_LOGCAT_APPBRAND3" : processName.endsWith(":appbrand4") ? "STARTUP_LOGCAT_APPBRAND4" : "";
    }
}
