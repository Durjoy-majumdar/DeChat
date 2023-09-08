package com.tencent.p014mm.booter;

import a70.C112760b;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.tencent.mars.xlog.Xlog;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LogDecryptor;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.xlog.app.XLogSetup;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.booter.d */
public final class C80814d {

    /* renamed from: f */
    public static C80814d f237575f;

    /* renamed from: a */
    public int f237576a = -1;

    /* renamed from: b */
    public final String[] f237577b = {"_id", "key", "type", "value"};

    /* renamed from: c */
    public volatile Future<Cursor> f237578c = null;

    /* renamed from: d */
    public volatile Future<Map<String, Object>> f237579d = null;

    /* renamed from: e */
    public Context f237580e;

    /* renamed from: com.tencent.mm.booter.d$a */
    public class C80815a implements Callable<Cursor> {

        /* renamed from: d */
        public final /* synthetic */ Context f237581d;

        public C80815a(Context context) {
            this.f237581d = context;
        }

        public Object call() {
            Cursor cursor;
            if (!"18c867f0717aa67b2ab7347505ba07ed".equals(Util.getSignaturesMd5("com.tencent.mm.coolassist", this.f237581d))) {
                return null;
            }
            try {
                cursor = this.f237581d.getContentResolver().query(Uri.parse("content://" + this.f237581d.getPackageName() + ".coolassist.debugprovider/config"), C80814d.this.f237577b, (String) null, (String[]) null, (String) null);
            } catch (Exception unused) {
                cursor = null;
            }
            if (cursor == null) {
                return null;
            }
            if (cursor.getCount() > 0) {
                return cursor;
            }
            cursor.close();
            return null;
        }
    }

    /* renamed from: com.tencent.mm.booter.d$b */
    public class C80816b implements Callable<Map<String, Object>> {
        public C80816b() {
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object call() {
            /*
                r7 = this;
                com.tencent.mm.booter.d r0 = com.tencent.p014mm.booter.C80814d.this
                java.util.concurrent.Future<android.database.Cursor> r0 = r0.f237578c
                java.lang.Object r0 = r0.get()
                android.database.Cursor r0 = (android.database.Cursor) r0
                if (r0 != 0) goto L_0x0011
                java.util.Map r0 = java.util.Collections.emptyMap()
                goto L_0x006a
            L_0x0011:
                java.lang.String r1 = "key"
                int r1 = r0.getColumnIndex(r1)
                java.lang.String r2 = "type"
                int r2 = r0.getColumnIndex(r2)
                java.lang.String r3 = "value"
                int r3 = r0.getColumnIndex(r3)
                java.util.HashMap r4 = new java.util.HashMap
                r4.<init>()
            L_0x002a:
                boolean r5 = r0.moveToNext()
                if (r5 == 0) goto L_0x0066
                int r5 = r0.getInt(r2)
                java.lang.String r6 = r0.getString(r3)
                switch(r5) {
                    case 1: goto L_0x0052;
                    case 2: goto L_0x004d;
                    case 3: goto L_0x005e;
                    case 4: goto L_0x0048;
                    case 5: goto L_0x0043;
                    case 6: goto L_0x003e;
                    default: goto L_0x003b;
                }
            L_0x003b:
                java.lang.String r5 = "MicroMsg.Debugger.Resolver"
                goto L_0x0057
            L_0x003e:
                java.lang.Double r6 = java.lang.Double.valueOf(r6)     // Catch:{ Exception -> 0x005d }
                goto L_0x005e
            L_0x0043:
                java.lang.Float r6 = java.lang.Float.valueOf(r6)     // Catch:{ Exception -> 0x005d }
                goto L_0x005e
            L_0x0048:
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ Exception -> 0x005d }
                goto L_0x005e
            L_0x004d:
                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x005d }
                goto L_0x005e
            L_0x0052:
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x005d }
                goto L_0x005e
            L_0x0057:
                java.lang.String r6 = "unknown type"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r6)     // Catch:{ Exception -> 0x005d }
            L_0x005d:
                r6 = 0
            L_0x005e:
                java.lang.String r5 = r0.getString(r1)
                r4.put(r5, r6)
                goto L_0x002a
            L_0x0066:
                r0.close()
                r0 = r4
            L_0x006a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.booter.C80814d.C80816b.call():java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.booter.d$c */
    public class C80817c implements CrashReportFactory.IDebuggerStatusProvider {
        public C80817c() {
        }

        public boolean isDebuggerAttached() {
            try {
                return C80814d.this.f237578c.get() != null;
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    public C80814d(Context context) {
        this.f237580e = context;
        C119179t tVar = C119157j.f356862d;
        C80815a aVar = new C80815a(context);
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        this.f237578c = jVar.mo183890u(aVar, 0, "DebuggerInit");
        C119179t tVar2 = C119157j.f356862d;
        C80816b bVar = new C80816b();
        C119157j jVar2 = (C119157j) tVar2;
        jVar2.getClass();
        this.f237579d = jVar2.mo183890u(bVar, 0, "DebuggerInit");
        CrashReportFactory.setDebuggerStatusProvider(new C80817c());
    }

    /* renamed from: b */
    public static C80814d m98665b(Context context) {
        if (f237575f == null) {
            f237575f = new C80814d(context);
        }
        return f237575f;
    }

    /* renamed from: a */
    public Boolean mo112567a(String str) {
        try {
            Object obj = this.f237579d.get().get(str);
            if (obj != null && (obj instanceof Boolean)) {
                Log.m105918d("MicroMsg.Debugger", "getBoolean(): key=" + str + ", value=" + obj);
                return (Boolean) obj;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: c */
    public Integer mo112568c(String str) {
        try {
            Object obj = this.f237579d.get().get(str);
            if (obj instanceof Integer) {
                Log.m105918d("MicroMsg.Debugger", "getInteger(): key=" + str + ", value=" + obj);
                return (Integer) obj;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: d */
    public String mo112569d(String str) {
        try {
            Object obj = this.f237579d.get().get(str);
            if (obj instanceof String) {
                Log.m105918d("MicroMsg.Debugger", "getString(): key=" + str + ", value=" + obj);
                return (String) obj;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: e */
    public void mo112570e(String str) {
        String d;
        Integer c = mo112568c(".com.tencent.mm.debug.log.level");
        boolean z = true;
        boolean nullAs = Util.nullAs(mo112567a(".com.tencent.mm.debug.log.append_mode"), true);
        boolean nullAs2 = Util.nullAs(mo112567a(".com.tencent.mm.debug.test.uploadLog"), false);
        if (nullAs2 && (d = mo112569d(".com.tencent.mm.debug.log.tag.skey")) != null && d.length() > 0) {
            Xlog.logDecryptor = new LogDecryptor(d);
        }
        XLogSetup.keep_setupXLog(!("MM".equalsIgnoreCase(str) ? !new File(this.f237580e.getFilesDir(), ".launched").exists() : false), C72994y1.f212833b, C112760b.m154234h0(), c, Boolean.valueOf(nullAs), Boolean.valueOf(nullAs2), str);
        Log.setLevel(Log.getLogLevel(), true);
        WeChatEnvironment.setMonkeyEnv(Util.getInt(Util.nullAs(mo112569d(".com.tencent.mm.debug.monkeyEnv"), "0"), 0) == 1);
        WeChatEnvironment.isMonkeyEnv();
        WeChatEnvironment.setCoolassistEnv(mo112568c(".com.tencent.mm.debug.log.level") != null);
        if (!WeChatEnvironment.isMonkeyEnv() && !Util.nullAs(mo112567a(".com.tencent.mm.debug.blockReleasedPatch"), false)) {
            z = false;
        }
        CrashReportFactory.setOnlinePatchBlocked(z);
    }
}
