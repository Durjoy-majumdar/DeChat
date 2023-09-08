package com.tencent.p014mm.plugin.appbrand.keylogger;

import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.FilePathGenerator;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import f40.C86709a0;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import uo0.C52586e;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.keylogger.r */
public final class C40484r implements C52586e {

    /* renamed from: a */
    public static SimpleDateFormat f108774a = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);

    /* renamed from: b */
    public static final Map<Long, String> f108775b = new HashMap();

    /* renamed from: c */
    public static String f108776c;

    /* renamed from: com.tencent.mm.plugin.appbrand.keylogger.r$b */
    public static final class C1918b implements C80916r<IPCVoid, IPCString> {
        private C1918b() {
        }

        public Object invoke(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            if (C86709a0.m107522a()) {
                return new IPCString(C86709a0.m107535s().f251807e);
            }
            Log.m105928w("MicroMsg.DefaultKeyStepLogger", "IPCGetAccPath not accHasReady");
            return new IPCString((String) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.keylogger.r$a */
    public class C40485a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f108777d;

        /* renamed from: e */
        public final /* synthetic */ Object[] f108778e;

        /* renamed from: f */
        public final /* synthetic */ String f108779f;

        public C40485a(String str, Object[] objArr, String str2) {
            this.f108777d = str;
            this.f108778e = objArr;
            this.f108779f = str2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x007a A[SYNTHETIC, Splitter:B:21:0x007a] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0081 A[SYNTHETIC, Splitter:B:26:0x0081] */
        /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r9 = this;
                java.lang.String r0 = r9.f108777d
                java.lang.Object[] r1 = r9.f108778e
                java.lang.String r0 = java.lang.String.format(r0, r1)
                com.tencent.mm.plugin.appbrand.keylogger.r r1 = com.tencent.p014mm.plugin.appbrand.keylogger.C40484r.this
                java.lang.String r2 = r9.f108779f
                r1.getClass()
                long r3 = java.lang.System.currentTimeMillis()
                java.lang.String r1 = r1.mo63266d(r3)
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                r6 = 0
                r7 = 0
                r8 = 1
                if (r5 == 0) goto L_0x0022
                r1 = r6
                goto L_0x0043
            L_0x0022:
                r5 = 4
                java.lang.Object[] r5 = new java.lang.Object[r5]
                r5[r7] = r1
                r5[r8] = r2
                r1 = 2
                java.text.SimpleDateFormat r2 = com.tencent.p014mm.plugin.appbrand.keylogger.C40484r.f108774a
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                java.lang.String r2 = r2.format(r3)
                r5[r1] = r2
                r1 = 3
                java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getProcessName()
                r5[r1] = r2
                java.lang.String r1 = "%s%s_%s_%s.keylog"
                java.lang.String r1 = java.lang.String.format(r1, r5)
            L_0x0043:
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r2 == 0) goto L_0x004a
                goto L_0x007d
            L_0x004a:
                java.io.BufferedWriter r2 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x0068 }
                com.tencent.mm.vfs.u1 r3 = new com.tencent.mm.vfs.u1     // Catch:{ IOException -> 0x0068 }
                r3.<init>((java.lang.String) r1, (boolean) r8)     // Catch:{ IOException -> 0x0068 }
                r2.<init>(r3)     // Catch:{ IOException -> 0x0068 }
                r2.write(r0)     // Catch:{ IOException -> 0x0063, all -> 0x0061 }
                r2.newLine()     // Catch:{ IOException -> 0x0063, all -> 0x0061 }
                r2.flush()     // Catch:{ IOException -> 0x0063, all -> 0x0061 }
                r2.close()     // Catch:{ IOException -> 0x007d }
                goto L_0x007d
            L_0x0061:
                r0 = move-exception
                goto L_0x007f
            L_0x0063:
                r0 = move-exception
                r6 = r2
                goto L_0x0069
            L_0x0066:
                r0 = move-exception
                goto L_0x007e
            L_0x0068:
                r0 = move-exception
            L_0x0069:
                java.lang.String r1 = "MicroMsg.DefaultKeyStepLogger"
                java.lang.String r2 = "appendLog exp:%s"
                java.lang.Object[] r3 = new java.lang.Object[r8]     // Catch:{ all -> 0x0066 }
                java.lang.String r0 = r0.getLocalizedMessage()     // Catch:{ all -> 0x0066 }
                r3[r7] = r0     // Catch:{ all -> 0x0066 }
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r1, r2, r3)     // Catch:{ all -> 0x0066 }
                if (r6 == 0) goto L_0x007d
                r6.close()     // Catch:{ IOException -> 0x007d }
            L_0x007d:
                return
            L_0x007e:
                r2 = r6
            L_0x007f:
                if (r2 == 0) goto L_0x0084
                r2.close()     // Catch:{ IOException -> 0x0084 }
            L_0x0084:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.keylogger.C40484r.C40485a.run():void");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0044 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m43709c() {
        /*
            java.lang.String r0 = f108776c
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = f108776c
            return r0
        L_0x000b:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMMProcess()
            r1 = 0
            if (r0 == 0) goto L_0x0027
            boolean r0 = f40.C86709a0.m107522a()
            if (r0 != 0) goto L_0x0020
            java.lang.String r0 = "MicroMsg.DefaultKeyStepLogger"
            java.lang.String r2 = "doGetAccPath not accHasReady"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r2)
            goto L_0x003a
        L_0x0020:
            f40.o r0 = f40.C86709a0.m107535s()
            java.lang.String r0 = r0.f251807e
            goto L_0x003e
        L_0x0027:
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getApplicationId()
            com.tencent.mm.ipcinvoker.type.IPCVoid r2 = new com.tencent.mm.ipcinvoker.type.IPCVoid
            r2.<init>()
            java.lang.Class<com.tencent.mm.plugin.appbrand.keylogger.r$b> r3 = com.tencent.p014mm.plugin.appbrand.keylogger.C40484r.C1918b.class
            java.lang.Object r0 = com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker.m98749b(r0, r2, r3)
            com.tencent.mm.ipcinvoker.type.IPCString r0 = (com.tencent.p014mm.ipcinvoker.type.IPCString) r0
            if (r0 != 0) goto L_0x003c
        L_0x003a:
            r0 = r1
            goto L_0x003e
        L_0x003c:
            java.lang.String r0 = r0.f10315d
        L_0x003e:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 == 0) goto L_0x0045
            return r1
        L_0x0045:
            java.lang.String r1 = "/"
            boolean r2 = r0.endsWith(r1)
            if (r2 != 0) goto L_0x005c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
        L_0x005c:
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "%skeystep/"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            f108776c = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.keylogger.C40484r.m43709c():java.lang.String");
    }

    /* renamed from: e */
    public static long m43710e(String str) {
        if (str == null) {
            return 0;
        }
        String[] split = str.split("-", -1);
        if (split == null || split.length != 3) {
            Log.m105929w("MicroMsg.DefaultKeyStepLogger", "getTimeFromDateFormatStr invalid date:%s", str);
            return 0;
        }
        Calendar instance = Calendar.getInstance();
        try {
            instance.set(Util.getInt(split[0], 0), Util.getInt(split[1], 0), Util.getInt(split[2], 0));
            return instance.getTimeInMillis();
        } catch (Exception e) {
            Log.m105929w("MicroMsg.DefaultKeyStepLogger", "getTimeFromDateFormatStr exp:%s", e);
            return 0;
        }
    }

    /* renamed from: a */
    public void mo63264a(String str, String str2, Object... objArr) {
        ((C119157j) C119157j.f356862d).mo183876g(new C40485a(str2, objArr, str), "MMTempKeyStepLogger");
    }

    /* renamed from: b */
    public List<String> mo63265b(String str, long j) {
        C86009m1[] u;
        ArrayList arrayList = new ArrayList();
        String d = mo63266d(j);
        if (Util.isNullOrNil(d)) {
            return arrayList;
        }
        C86009m1 m1Var = new C86009m1(d);
        if (!m1Var.mo119977o() || (u = m1Var.mo119984u()) == null) {
            return arrayList;
        }
        Log.m105925i("MicroMsg.DefaultKeyStepLogger", "collectLogPathsByProcessAndDate : %s", str);
        for (int i = 0; i < u.length; i++) {
            if (u[i].getName().startsWith(str)) {
                arrayList.add(u[i].mo119971i());
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public final String mo63266d(long j) {
        Map<Long, String> map = f108775b;
        if (((HashMap) map).containsKey(Long.valueOf(j))) {
            return (String) ((HashMap) map).get(Long.valueOf(j));
        } else if (Util.isNullOrNil(m43709c())) {
            return null;
        } else {
            String format = String.format("%s%s/", new Object[]{m43709c(), f108774a.format(Long.valueOf(j))});
            FilePathGenerator.checkMkdir(format);
            ((HashMap) map).put(Long.valueOf(j), format);
            return format;
        }
    }
}
