package p206nj;

import android.os.Environment;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.File;
import p156gj.C107835h0;

/* renamed from: nj.h */
public class C88956h {

    /* renamed from: a */
    public static Boolean f256530a;

    /* renamed from: b */
    public static Boolean f256531b;

    /* renamed from: a */
    public static File m111060a() {
        return Util.isNullOrNil(C107835h0.f322856m.f322880T) ? Environment.getDataDirectory() : new File(C107835h0.f322856m.f322880T);
    }

    /* renamed from: b */
    public static File m111061b() {
        return Util.isNullOrNil(C107835h0.f322856m.f322878R) ? Environment.getExternalStorageDirectory() : new File(C107835h0.f322856m.f322878R);
    }

    /* renamed from: c */
    public static String m111062c() {
        return Util.isNullOrNil(C107835h0.f322856m.f322882V) ? Environment.getExternalStorageState() : C107835h0.f322856m.f322882V;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
        if (r1 != null) goto L_0x002a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004d A[SYNTHETIC, Splitter:B:20:0x004d] */
    @java.lang.Deprecated
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m111063d() {
        /*
            java.lang.Boolean r0 = f256530a
            if (r0 != 0) goto L_0x0051
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0035, all -> 0x0030 }
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0035, all -> 0x0030 }
            java.io.File r3 = android.os.Environment.getRootDirectory()     // Catch:{ Exception -> 0x0035, all -> 0x0030 }
            java.lang.String r4 = "build.prop"
            r2.<init>(r3, r4)     // Catch:{ Exception -> 0x0035, all -> 0x0030 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0035, all -> 0x0030 }
            java.util.Properties r0 = new java.util.Properties     // Catch:{ Exception -> 0x002e }
            r0.<init>()     // Catch:{ Exception -> 0x002e }
            r0.load(r1)     // Catch:{ Exception -> 0x002e }
            java.lang.String r2 = "ro.miui.ui.version.name"
            boolean r0 = r0.containsKey(r2)     // Catch:{ Exception -> 0x002e }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x002e }
            f256530a = r0     // Catch:{ Exception -> 0x002e }
        L_0x002a:
            r1.close()     // Catch:{ Exception -> 0x0051 }
            goto L_0x0051
        L_0x002e:
            r0 = move-exception
            goto L_0x0039
        L_0x0030:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x004b
        L_0x0035:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x0039:
            java.lang.String r2 = "MicroMsg.Environment"
            java.lang.String r3 = "** failed to fetch miui prop, assume we are not on miui. **"
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x004a }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r3, r4)     // Catch:{ all -> 0x004a }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x004a }
            f256530a = r0     // Catch:{ all -> 0x004a }
            if (r1 == 0) goto L_0x0051
            goto L_0x002a
        L_0x004a:
            r0 = move-exception
        L_0x004b:
            if (r1 == 0) goto L_0x0050
            r1.close()     // Catch:{ Exception -> 0x0050 }
        L_0x0050:
            throw r0
        L_0x0051:
            java.lang.Boolean r0 = f256530a
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p206nj.C88956h.m111063d():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        if (r1 != null) goto L_0x0032;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0054 A[SYNTHETIC, Splitter:B:20:0x0054] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m111064e() {
        /*
            java.lang.Boolean r0 = f256531b
            if (r0 != 0) goto L_0x0058
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x003d, all -> 0x0038 }
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x003d, all -> 0x0038 }
            java.io.File r3 = android.os.Environment.getRootDirectory()     // Catch:{ Exception -> 0x003d, all -> 0x0038 }
            java.lang.String r4 = "build.prop"
            r2.<init>(r3, r4)     // Catch:{ Exception -> 0x003d, all -> 0x0038 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x003d, all -> 0x0038 }
            java.util.Properties r0 = new java.util.Properties     // Catch:{ Exception -> 0x0036 }
            r0.<init>()     // Catch:{ Exception -> 0x0036 }
            r0.load(r1)     // Catch:{ Exception -> 0x0036 }
            java.lang.String r2 = "ro.miui.ui.version.name"
            java.lang.String r3 = ""
            java.lang.String r0 = r0.getProperty(r2, r3)     // Catch:{ Exception -> 0x0036 }
            java.lang.String r2 = "V8"
            boolean r0 = r0.contains(r2)     // Catch:{ Exception -> 0x0036 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0036 }
            f256531b = r0     // Catch:{ Exception -> 0x0036 }
        L_0x0032:
            r1.close()     // Catch:{ Exception -> 0x0058 }
            goto L_0x0058
        L_0x0036:
            r0 = move-exception
            goto L_0x0041
        L_0x0038:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x0052
        L_0x003d:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x0041:
            java.lang.String r2 = "MicroMsg.Environment"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0051 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)     // Catch:{ all -> 0x0051 }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0051 }
            f256531b = r0     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x0058
            goto L_0x0032
        L_0x0051:
            r0 = move-exception
        L_0x0052:
            if (r1 == 0) goto L_0x0057
            r1.close()     // Catch:{ Exception -> 0x0057 }
        L_0x0057:
            throw r0
        L_0x0058:
            java.lang.Boolean r0 = f256531b
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p206nj.C88956h.m111064e():boolean");
    }
}
