package z33;

import android.app.Notification;
import android.net.Uri;
import android.os.Build;
import com.tencent.p014mm.autogen.events.CheckIPCallIsStartedEvent;
import com.tencent.p014mm.autogen.events.CheckVoipCSIsStartedEvent;
import com.tencent.p014mm.autogen.events.VoipEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import lc3.C10485b;
import p156gj.C87203t;
import p206nj.C11171e;
import p918s2.C90116e;

/* renamed from: z33.n */
public class C91617n {

    /* renamed from: a */
    public static final Uri f262467a = Uri.parse("content://com.lbe.security.miui.permmgr/active");

    static {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.VERSION.CODENAME;
        String str3 = Build.VERSION.INCREMENTAL;
        String str4 = Build.BOARD;
        String str5 = Build.DEVICE;
        String str6 = Build.DISPLAY;
        String str7 = Build.FINGERPRINT;
        String str8 = Build.HOST;
        String str9 = Build.MANUFACTURER;
        C87203t.m108275k();
        String str10 = Build.PRODUCT;
        String str11 = Build.TAGS;
        String str12 = Build.TYPE;
        String str13 = Build.USER;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0075, code lost:
        r0 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0075 A[ExcHandler: all (th java.lang.Throwable), PHI: r1 
      PHI: (r1v5 java.io.InputStream) = (r1v0 java.io.InputStream), (r1v4 java.io.InputStream), (r1v4 java.io.InputStream) binds: [B:1:0x0002, B:29:0x007a, B:30:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x0002] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007a A[SYNTHETIC, Splitter:B:29:0x007a] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m114963a() {
        /*
            r0 = 0
            r1 = 0
            java.util.Properties r2 = new java.util.Properties     // Catch:{ IOException -> 0x0077, all -> 0x0075 }
            r2.<init>()     // Catch:{ IOException -> 0x0077, all -> 0x0075 }
            java.io.File r3 = android.os.Environment.getRootDirectory()     // Catch:{ IOException -> 0x0077, all -> 0x0075 }
            java.lang.String r4 = "build.prop"
            if (r3 != 0) goto L_0x0011
            r3 = r1
            goto L_0x0019
        L_0x0011:
            java.lang.String r3 = r3.getPath()     // Catch:{ IOException -> 0x0077, all -> 0x0075 }
            android.net.Uri r3 = com.tencent.p014mm.vfs.C116299g2.m163858n(r3)     // Catch:{ IOException -> 0x0077, all -> 0x0075 }
        L_0x0019:
            if (r3 != 0) goto L_0x0025
            android.net.Uri$Builder r3 = new android.net.Uri$Builder     // Catch:{ IOException -> 0x0077, all -> 0x0075 }
            r3.<init>()     // Catch:{ IOException -> 0x0077, all -> 0x0075 }
            android.net.Uri$Builder r3 = r3.path(r4)     // Catch:{ IOException -> 0x0077, all -> 0x0075 }
            goto L_0x002c
        L_0x0025:
            android.net.Uri$Builder r3 = r3.buildUpon()     // Catch:{ IOException -> 0x0077, all -> 0x0075 }
            r3.appendPath(r4)     // Catch:{ IOException -> 0x0077, all -> 0x0075 }
        L_0x002c:
            android.net.Uri r4 = r3.build()     // Catch:{ IOException -> 0x0077, all -> 0x0075 }
            java.lang.String r5 = r4.getPath()     // Catch:{ IOException -> 0x0077, all -> 0x0075 }
            if (r5 == 0) goto L_0x004c
            java.lang.String r5 = com.tencent.p014mm.vfs.C116299g2.m163855k(r5, r0, r0)     // Catch:{ IOException -> 0x0077, all -> 0x0075 }
            java.lang.String r6 = r4.getPath()     // Catch:{ IOException -> 0x0077, all -> 0x0075 }
            boolean r6 = r6.equals(r5)     // Catch:{ IOException -> 0x0077, all -> 0x0075 }
            if (r6 != 0) goto L_0x004c
            android.net.Uri$Builder r3 = r3.path(r5)     // Catch:{ IOException -> 0x0077, all -> 0x0075 }
            android.net.Uri r4 = r3.build()     // Catch:{ IOException -> 0x0077, all -> 0x0075 }
        L_0x004c:
            com.tencent.mm.vfs.f0 r3 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ IOException -> 0x0077, all -> 0x0075 }
            com.tencent.mm.vfs.f0$h r3 = r3.mo177799l(r4, r1)     // Catch:{ IOException -> 0x0077, all -> 0x0075 }
            java.io.InputStream r3 = com.tencent.p014mm.vfs.C86013q1.m106421C(r4, r3)     // Catch:{ IOException -> 0x0077, all -> 0x0075 }
            r2.load(r3)     // Catch:{ IOException -> 0x0072, all -> 0x006f }
            java.lang.String r4 = "ro.miui.ui.version.name"
            java.lang.String r1 = r2.getProperty(r4, r1)     // Catch:{ IOException -> 0x0072, all -> 0x006f }
            if (r1 == 0) goto L_0x006b
            java.lang.String r2 = "V6"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0072, all -> 0x006f }
            if (r1 == 0) goto L_0x006b
            r0 = 1
        L_0x006b:
            com.tencent.p014mm.vfs.C116299g2.m163847c(r3)
            goto L_0x0085
        L_0x006f:
            r0 = move-exception
            r1 = r3
            goto L_0x007e
        L_0x0072:
            r1 = r3
            goto L_0x0078
        L_0x0075:
            r0 = move-exception
            goto L_0x007e
        L_0x0077:
        L_0x0078:
            if (r1 == 0) goto L_0x0082
            r1.close()     // Catch:{ IOException -> 0x0082, all -> 0x0075 }
            goto L_0x0082
        L_0x007e:
            com.tencent.p014mm.vfs.C116299g2.m163847c(r1)
            throw r0
        L_0x0082:
            com.tencent.p014mm.vfs.C116299g2.m163847c(r1)
        L_0x0085:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "isMIUIv6 "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "VoipUtil"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z33.C91617n.m114963a():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0060, code lost:
        if (r4 != null) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0075, code lost:
        if (r4 == null) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0077, code lost:
        r4.close();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m114964b(android.content.Context r11) {
        /*
            boolean r0 = m114963a()
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L_0x0082
            r0 = 131072(0x20000, float:1.83671E-40)
            r3 = 2
            r4 = 0
            android.content.ContentResolver r5 = r11.getContentResolver()     // Catch:{ all -> 0x0063 }
            android.net.Uri r6 = f262467a     // Catch:{ all -> 0x0063 }
            java.lang.String r11 = "suggestAccept"
            java.lang.String r7 = "userAccept"
            java.lang.String r8 = "userPrompt"
            java.lang.String r9 = "userReject"
            java.lang.String[] r7 = new java.lang.String[]{r11, r7, r8, r9}     // Catch:{ all -> 0x0063 }
            java.lang.String r8 = "pkgName='com.tencent.mm'"
            r9 = 0
            r10 = 0
            android.database.Cursor r4 = r5.query(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0063 }
            if (r4 == 0) goto L_0x0060
            int r11 = r4.getCount()     // Catch:{ all -> 0x0063 }
            if (r11 <= 0) goto L_0x0060
            boolean r11 = r4.moveToLast()     // Catch:{ all -> 0x0063 }
            if (r11 == 0) goto L_0x0060
            int r11 = r4.getInt(r2)     // Catch:{ all -> 0x0063 }
            int r5 = r4.getInt(r1)     // Catch:{ all -> 0x0063 }
            int r6 = r4.getInt(r3)     // Catch:{ all -> 0x0063 }
            r7 = 3
            int r3 = r4.getInt(r7)     // Catch:{ all -> 0x0063 }
            r11 = r11 & r0
            if (r11 != r0) goto L_0x0055
            r11 = r6 & r0
            if (r11 != 0) goto L_0x0055
            r11 = r3 & r0
            if (r11 == 0) goto L_0x005b
        L_0x0055:
            r11 = r5 & r0
            if (r11 != r0) goto L_0x005a
            goto L_0x005b
        L_0x005a:
            r1 = 0
        L_0x005b:
            r4.close()
            r2 = r1
            goto L_0x0082
        L_0x0060:
            if (r4 == 0) goto L_0x0082
            goto L_0x0077
        L_0x0063:
            r11 = move-exception
            java.lang.String r5 = "gray"
            java.lang.String r6 = "isLbePermissionEnable"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x007b }
            r3[r2] = r11     // Catch:{ all -> 0x007b }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x007b }
            r3[r1] = r11     // Catch:{ all -> 0x007b }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r5, r6, r3)     // Catch:{ all -> 0x007b }
            if (r4 == 0) goto L_0x0082
        L_0x0077:
            r4.close()
            goto L_0x0082
        L_0x007b:
            r11 = move-exception
            if (r4 == 0) goto L_0x0081
            r4.close()
        L_0x0081:
            throw r11
        L_0x0082:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "isLbePermissionEnable ret:"
            r11.append(r0)
            r11.append(r2)
            java.lang.String r11 = r11.toString()
            java.lang.String r0 = "VoipUtil"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r11)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: z33.C91617n.m114964b(android.content.Context):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c7  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m114965c(android.content.Context r14) {
        /*
            boolean r0 = m114963a()
            java.lang.String r1 = "VoipUtil"
            r2 = 1
            r3 = 0
            if (r0 != r2) goto L_0x00d1
            r0 = 131072(0x20000, float:1.83671E-40)
            java.lang.String r4 = "userAccept"
            r5 = 0
            r6 = 2
            r7 = -1
            android.content.ContentResolver r14 = r14.getContentResolver()     // Catch:{ all -> 0x0046 }
            android.net.Uri r9 = f262467a     // Catch:{ all -> 0x0042 }
            java.lang.String[] r10 = new java.lang.String[]{r4}     // Catch:{ all -> 0x0042 }
            java.lang.String r11 = "pkgName='com.tencent.mm'"
            r12 = 0
            r13 = 0
            r8 = r14
            android.database.Cursor r8 = r8.query(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0042 }
            if (r8 == 0) goto L_0x003b
            int r9 = r8.getCount()     // Catch:{ all -> 0x0039 }
            if (r9 <= 0) goto L_0x003b
            boolean r9 = r8.moveToLast()     // Catch:{ all -> 0x0039 }
            if (r9 == 0) goto L_0x003b
            int r9 = r8.getInt(r3)     // Catch:{ all -> 0x0039 }
            goto L_0x003c
        L_0x0039:
            r9 = move-exception
            goto L_0x0049
        L_0x003b:
            r9 = -1
        L_0x003c:
            if (r8 == 0) goto L_0x005e
            r8.close()
            goto L_0x005e
        L_0x0042:
            r8 = move-exception
            r9 = r8
            r8 = r5
            goto L_0x0049
        L_0x0046:
            r9 = move-exception
            r14 = r5
            r8 = r14
        L_0x0049:
            java.lang.String r10 = "isLbePermissionEnable query "
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x00ca }
            r11[r3] = r9     // Catch:{ all -> 0x00ca }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00ca }
            r11[r2] = r9     // Catch:{ all -> 0x00ca }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r1, r10, r11)     // Catch:{ all -> 0x00ca }
            if (r8 == 0) goto L_0x005d
            r8.close()
        L_0x005d:
            r9 = -1
        L_0x005e:
            r8 = 3
            java.lang.Object[] r10 = new java.lang.Object[r8]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            r10[r3] = r11
            java.lang.String r11 = " flag: "
            r10[r2] = r11
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            r10[r6] = r12
            java.lang.String r12 = "setLbePermissionEnable query ua: "
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r12, r10)
            if (r9 == r7) goto L_0x00c4
            if (r14 == 0) goto L_0x00c4
            r9 = r9 | r0
            android.content.ContentValues r10 = new android.content.ContentValues     // Catch:{ all -> 0x00b4 }
            r10.<init>()     // Catch:{ all -> 0x00b4 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x00b4 }
            r10.put(r4, r12)     // Catch:{ all -> 0x00b4 }
            android.net.Uri r4 = f262467a     // Catch:{ all -> 0x00b4 }
            java.lang.String r12 = "pkgName='com.tencent.mm'"
            int r7 = r14.update(r4, r10, r12, r5)     // Catch:{ all -> 0x00b4 }
            java.lang.String r14 = "serLbePermissionEnable update ua: "
            r4 = 5
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x00b4 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x00b4 }
            r4[r3] = r5     // Catch:{ all -> 0x00b4 }
            r4[r2] = r11     // Catch:{ all -> 0x00b4 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00b4 }
            r4[r6] = r5     // Catch:{ all -> 0x00b4 }
            java.lang.String r5 = " ret: "
            r4[r8] = r5     // Catch:{ all -> 0x00b4 }
            r5 = 4
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x00b4 }
            r4[r5] = r8     // Catch:{ all -> 0x00b4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r14, r4)     // Catch:{ all -> 0x00b4 }
            goto L_0x00c4
        L_0x00b4:
            r14 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r6]
            r4[r3] = r14
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
            r4[r2] = r14
            java.lang.String r14 = "isLbePermissionEnable update "
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r1, r14, r4)
        L_0x00c4:
            if (r7 <= 0) goto L_0x00c7
            goto L_0x00c8
        L_0x00c7:
            r2 = 0
        L_0x00c8:
            r3 = r2
            goto L_0x00d1
        L_0x00ca:
            r14 = move-exception
            if (r8 == 0) goto L_0x00d0
            r8.close()
        L_0x00d0:
            throw r14
        L_0x00d1:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "setLbePermissionEnable ret:"
            r14.append(r0)
            r14.append(r3)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r14)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: z33.C91617n.m114965c(android.content.Context):boolean");
    }

    /* renamed from: d */
    public static int m114966d(String str, int i) {
        try {
            return Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c(str), i);
        } catch (Exception unused) {
            Log.m105920e("VoipUtil", "getIntValFromDynamicConfig parseInt failed, val: " + str);
            return i;
        }
    }

    /* renamed from: e */
    public static Notification m114967e(C90116e.C90121c cVar) {
        return C11171e.m11044a(16) ? cVar.mo124378b() : cVar.mo124378b();
    }

    /* renamed from: f */
    public static boolean m114968f() {
        CheckIPCallIsStartedEvent checkIPCallIsStartedEvent = new CheckIPCallIsStartedEvent();
        checkIPCallIsStartedEvent.publish();
        return checkIPCallIsStartedEvent.f236159d.f236160a;
    }

    /* renamed from: g */
    public static boolean m114969g() {
        CheckVoipCSIsStartedEvent checkVoipCSIsStartedEvent = new CheckVoipCSIsStartedEvent();
        checkVoipCSIsStartedEvent.publish();
        return checkVoipCSIsStartedEvent.f236161d.f236162a;
    }

    /* renamed from: h */
    public static boolean m114970h() {
        VoipEvent voipEvent = new VoipEvent();
        voipEvent.f194019d.f194022b = 2;
        voipEvent.publish();
        return voipEvent.f194020e.f194028b;
    }
}
