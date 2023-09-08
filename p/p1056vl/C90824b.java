package p1056vl;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.WindowManager;
import p1005ma.C88718b;

/* renamed from: vl.b */
public class C90824b {

    /* renamed from: a */
    public static Boolean f260777a = null;

    /* renamed from: b */
    public static Boolean f260778b = null;

    /* renamed from: c */
    public static Boolean f260779c = null;

    /* renamed from: d */
    public static String f260780d = "xiaomi&28, redmi&28, samsung&28, vivo&28, oppo&29, huawei&29, honor&29, oneplus&29, meizu&24, smartisan&24, other&29";

    /* renamed from: e */
    public static Boolean f260781e = null;

    /* renamed from: f */
    public static Boolean f260782f = null;

    static {
        new Rect(0, 0, 0, 0);
        new SparseArray(4);
        new SparseArray(4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.view.ViewGroup m113901a(android.view.Window r6, android.view.View r7) {
        /*
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            ul.b r1 = new ul.b
            java.lang.String r2 = "mContentRoot"
            r1.<init>(r6, r2, r0)
            r1.mo124827b()
            java.lang.reflect.Field r2 = r1.f260512c
            r3 = 0
            if (r2 == 0) goto L_0x0015
            r2 = 1
            goto L_0x0016
        L_0x0015:
            r2 = 0
        L_0x0016:
            if (r2 == 0) goto L_0x002f
            java.lang.Object r1 = r1.mo124826a()     // Catch:{ NoSuchFieldException -> 0x0023, IllegalAccessException -> 0x0021, IllegalArgumentException -> 0x001f }
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1     // Catch:{ NoSuchFieldException -> 0x0023, IllegalAccessException -> 0x0021, IllegalArgumentException -> 0x001f }
            goto L_0x0030
        L_0x001f:
            r1 = move-exception
            goto L_0x0024
        L_0x0021:
            r1 = move-exception
            goto L_0x0024
        L_0x0023:
            r1 = move-exception
        L_0x0024:
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r4 = "MicroMsg.UIUtils"
            p1005ma.C88718b.m110680b(r4, r1, r2)
        L_0x002f:
            r1 = r0
        L_0x0030:
            if (r1 == 0) goto L_0x0033
            return r1
        L_0x0033:
            if (r7 == 0) goto L_0x0049
            android.view.ViewParent r7 = r7.getParent()
        L_0x0039:
            android.view.View r1 = r6.getDecorView()
            if (r7 == r1) goto L_0x0049
            if (r7 == 0) goto L_0x0049
            android.view.ViewParent r0 = r7.getParent()
            r5 = r0
            r0 = r7
            r7 = r5
            goto L_0x0039
        L_0x0049:
            if (r0 != 0) goto L_0x0061
            android.view.View r7 = r6.getDecorView()
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            android.view.View r7 = r7.getChildAt(r3)
            boolean r1 = r7 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x005c
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            return r7
        L_0x005c:
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r6.clearFlags(r7)
        L_0x0061:
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1056vl.C90824b.m113901a(android.view.Window, android.view.View):android.view.ViewGroup");
    }

    /* renamed from: b */
    public static Point m113902b(Context context) {
        Point point = new Point();
        if (context == null) {
            return point;
        }
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealSize(point);
        return point;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        p1005ma.C88718b.m110680b("MicroMsg.Vendor.Vivo", "hasCutOut, IllegalAccessException!!", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005e, code lost:
        p1005ma.C88718b.m110679a("MicroMsg.Vendor.Vivo", "vivo hasCutOut: %s", java.lang.Boolean.FALSE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        p1005ma.C88718b.m110680b("MicroMsg.Vendor.Vivo", "hasCutOut, NoSuchMethodException!!", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006d, code lost:
        p1005ma.C88718b.m110679a("MicroMsg.Vendor.Vivo", "vivo hasCutOut: %s", java.lang.Boolean.FALSE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        p1005ma.C88718b.m110680b("MicroMsg.Vendor.Vivo", "hasCutOut, ClassNotFoundException!!", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007c, code lost:
        p1005ma.C88718b.m110679a("MicroMsg.Vendor.Vivo", "vivo hasCutOut: %s", java.lang.Boolean.FALSE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0086, code lost:
        p1005ma.C88718b.m110679a("MicroMsg.Vendor.Vivo", "vivo hasCutOut: %s", java.lang.Boolean.FALSE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        p1005ma.C88718b.m110680b("MicroMsg.Vendor.Huawei", "hasCutOut, InvocationTargetException!!", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d9, code lost:
        p1005ma.C88718b.m110679a("MicroMsg.Vendor.Huawei", "huawei hasCutOut: %s", java.lang.Boolean.FALSE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        p1005ma.C88718b.m110680b("MicroMsg.Vendor.Huawei", "hasCutOut, IllegalAccessException!!", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e8, code lost:
        p1005ma.C88718b.m110679a("MicroMsg.Vendor.Huawei", "huawei hasCutOut: %s", java.lang.Boolean.FALSE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        p1005ma.C88718b.m110680b("MicroMsg.Vendor.Huawei", "hasCutOut, NoSuchMethodException!!", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f7, code lost:
        p1005ma.C88718b.m110679a("MicroMsg.Vendor.Huawei", "huawei hasCutOut: %s", java.lang.Boolean.FALSE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        p1005ma.C88718b.m110680b("MicroMsg.Vendor.Huawei", "hasCutOut, ClassNotFoundException!!", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0106, code lost:
        p1005ma.C88718b.m110679a("MicroMsg.Vendor.Huawei", "huawei hasCutOut: %s", java.lang.Boolean.FALSE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0110, code lost:
        p1005ma.C88718b.m110679a("MicroMsg.Vendor.Huawei", "huawei hasCutOut: %s", java.lang.Boolean.FALSE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        p1005ma.C88718b.m110680b("MicroMsg.Vendor.Vivo", "hasCutOut, InvocationTargetException!!", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004f, code lost:
        p1005ma.C88718b.m110679a("MicroMsg.Vendor.Vivo", "vivo hasCutOut: %s", java.lang.Boolean.FALSE);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:31:0x00d4, B:34:0x00e3, B:37:0x00f2, B:40:0x0101] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:6:0x004a, B:9:0x0059, B:12:0x0068, B:15:0x0077] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0068 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0077 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00d4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00e3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00f2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x0101 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x004a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0059 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x011d  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m113903c(android.content.Context r11, boolean r12) {
        /*
            java.lang.String r12 = "vivo hasCutOut: %s"
            java.lang.String r0 = "MicroMsg.Vendor.Vivo"
            java.lang.String r1 = "hasCutOut, InvocationTargetException!!"
            java.lang.String r2 = "hasCutOut, IllegalAccessException!!"
            java.lang.String r3 = "hasCutOut, NoSuchMethodException!!"
            java.lang.String r4 = "hasCutOut, ClassNotFoundException!!"
            r5 = 1
            r6 = 0
            if (r11 != 0) goto L_0x0014
        L_0x0011:
            r7 = 0
            goto L_0x0090
        L_0x0014:
            java.lang.ClassLoader r7 = r11.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0077, NoSuchMethodException -> 0x0068, IllegalAccessException -> 0x0059, InvocationTargetException -> 0x004a }
            java.lang.String r8 = "android.util.FtFeature"
            java.lang.Class r7 = r7.loadClass(r8)     // Catch:{ ClassNotFoundException -> 0x0077, NoSuchMethodException -> 0x0068, IllegalAccessException -> 0x0059, InvocationTargetException -> 0x004a }
            java.lang.String r8 = "isFeatureSupport"
            java.lang.Class[] r9 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException -> 0x0077, NoSuchMethodException -> 0x0068, IllegalAccessException -> 0x0059, InvocationTargetException -> 0x004a }
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException -> 0x0077, NoSuchMethodException -> 0x0068, IllegalAccessException -> 0x0059, InvocationTargetException -> 0x004a }
            r9[r6] = r10     // Catch:{ ClassNotFoundException -> 0x0077, NoSuchMethodException -> 0x0068, IllegalAccessException -> 0x0059, InvocationTargetException -> 0x004a }
            java.lang.reflect.Method r8 = r7.getMethod(r8, r9)     // Catch:{ ClassNotFoundException -> 0x0077, NoSuchMethodException -> 0x0068, IllegalAccessException -> 0x0059, InvocationTargetException -> 0x004a }
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ ClassNotFoundException -> 0x0077, NoSuchMethodException -> 0x0068, IllegalAccessException -> 0x0059, InvocationTargetException -> 0x004a }
            r10 = 32
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ ClassNotFoundException -> 0x0077, NoSuchMethodException -> 0x0068, IllegalAccessException -> 0x0059, InvocationTargetException -> 0x004a }
            r9[r6] = r10     // Catch:{ ClassNotFoundException -> 0x0077, NoSuchMethodException -> 0x0068, IllegalAccessException -> 0x0059, InvocationTargetException -> 0x004a }
            java.lang.Object r7 = r8.invoke(r7, r9)     // Catch:{ ClassNotFoundException -> 0x0077, NoSuchMethodException -> 0x0068, IllegalAccessException -> 0x0059, InvocationTargetException -> 0x004a }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ ClassNotFoundException -> 0x0077, NoSuchMethodException -> 0x0068, IllegalAccessException -> 0x0059, InvocationTargetException -> 0x004a }
            boolean r7 = r7.booleanValue()     // Catch:{ ClassNotFoundException -> 0x0077, NoSuchMethodException -> 0x0068, IllegalAccessException -> 0x0059, InvocationTargetException -> 0x004a }
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)
            r8[r6] = r9
            p1005ma.C88718b.m110679a(r0, r12, r8)
            goto L_0x0090
        L_0x004a:
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x0086 }
            p1005ma.C88718b.m110680b(r0, r1, r7)     // Catch:{ all -> 0x0086 }
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r7[r6] = r8
            p1005ma.C88718b.m110679a(r0, r12, r7)
            goto L_0x0011
        L_0x0059:
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x0086 }
            p1005ma.C88718b.m110680b(r0, r2, r7)     // Catch:{ all -> 0x0086 }
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r7[r6] = r8
            p1005ma.C88718b.m110679a(r0, r12, r7)
            goto L_0x0011
        L_0x0068:
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x0086 }
            p1005ma.C88718b.m110680b(r0, r3, r7)     // Catch:{ all -> 0x0086 }
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r7[r6] = r8
            p1005ma.C88718b.m110679a(r0, r12, r7)
            goto L_0x0011
        L_0x0077:
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x0086 }
            p1005ma.C88718b.m110680b(r0, r4, r7)     // Catch:{ all -> 0x0086 }
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r7[r6] = r8
            p1005ma.C88718b.m110679a(r0, r12, r7)
            goto L_0x0011
        L_0x0086:
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r7[r6] = r8
            p1005ma.C88718b.m110679a(r0, r12, r7)
            goto L_0x0011
        L_0x0090:
            if (r7 != 0) goto L_0x011f
            if (r11 != 0) goto L_0x0096
            r12 = 0
            goto L_0x00a0
        L_0x0096:
            android.content.pm.PackageManager r12 = r11.getPackageManager()
            java.lang.String r0 = "com.oppo.feature.screen.heteromorphism"
            boolean r12 = r12.hasSystemFeature(r0)
        L_0x00a0:
            if (r12 != 0) goto L_0x011f
            java.lang.String r12 = "huawei hasCutOut: %s"
            java.lang.String r0 = "MicroMsg.Vendor.Huawei"
            if (r11 != 0) goto L_0x00aa
        L_0x00a8:
            r11 = 0
            goto L_0x011a
        L_0x00aa:
            java.lang.ClassLoader r11 = r11.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0101, NoSuchMethodException -> 0x00f2, IllegalAccessException -> 0x00e3, InvocationTargetException -> 0x00d4 }
            java.lang.String r7 = "com.huawei.android.util.HwNotchSizeUtil"
            java.lang.Class r11 = r11.loadClass(r7)     // Catch:{ ClassNotFoundException -> 0x0101, NoSuchMethodException -> 0x00f2, IllegalAccessException -> 0x00e3, InvocationTargetException -> 0x00d4 }
            java.lang.String r7 = "hasNotchInScreen"
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch:{ ClassNotFoundException -> 0x0101, NoSuchMethodException -> 0x00f2, IllegalAccessException -> 0x00e3, InvocationTargetException -> 0x00d4 }
            java.lang.reflect.Method r7 = r11.getMethod(r7, r8)     // Catch:{ ClassNotFoundException -> 0x0101, NoSuchMethodException -> 0x00f2, IllegalAccessException -> 0x00e3, InvocationTargetException -> 0x00d4 }
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ ClassNotFoundException -> 0x0101, NoSuchMethodException -> 0x00f2, IllegalAccessException -> 0x00e3, InvocationTargetException -> 0x00d4 }
            java.lang.Object r11 = r7.invoke(r11, r8)     // Catch:{ ClassNotFoundException -> 0x0101, NoSuchMethodException -> 0x00f2, IllegalAccessException -> 0x00e3, InvocationTargetException -> 0x00d4 }
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch:{ ClassNotFoundException -> 0x0101, NoSuchMethodException -> 0x00f2, IllegalAccessException -> 0x00e3, InvocationTargetException -> 0x00d4 }
            boolean r11 = r11.booleanValue()     // Catch:{ ClassNotFoundException -> 0x0101, NoSuchMethodException -> 0x00f2, IllegalAccessException -> 0x00e3, InvocationTargetException -> 0x00d4 }
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r11)
            r1[r6] = r2
            p1005ma.C88718b.m110679a(r0, r12, r1)
            goto L_0x011a
        L_0x00d4:
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x0110 }
            p1005ma.C88718b.m110680b(r0, r1, r11)     // Catch:{ all -> 0x0110 }
            java.lang.Object[] r11 = new java.lang.Object[r5]
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r11[r6] = r1
            p1005ma.C88718b.m110679a(r0, r12, r11)
            goto L_0x00a8
        L_0x00e3:
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x0110 }
            p1005ma.C88718b.m110680b(r0, r2, r11)     // Catch:{ all -> 0x0110 }
            java.lang.Object[] r11 = new java.lang.Object[r5]
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r11[r6] = r1
            p1005ma.C88718b.m110679a(r0, r12, r11)
            goto L_0x00a8
        L_0x00f2:
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x0110 }
            p1005ma.C88718b.m110680b(r0, r3, r11)     // Catch:{ all -> 0x0110 }
            java.lang.Object[] r11 = new java.lang.Object[r5]
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r11[r6] = r1
            p1005ma.C88718b.m110679a(r0, r12, r11)
            goto L_0x00a8
        L_0x0101:
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x0110 }
            p1005ma.C88718b.m110680b(r0, r4, r11)     // Catch:{ all -> 0x0110 }
            java.lang.Object[] r11 = new java.lang.Object[r5]
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r11[r6] = r1
            p1005ma.C88718b.m110679a(r0, r12, r11)
            goto L_0x00a8
        L_0x0110:
            java.lang.Object[] r11 = new java.lang.Object[r5]
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r11[r6] = r1
            p1005ma.C88718b.m110679a(r0, r12, r11)
            goto L_0x00a8
        L_0x011a:
            if (r11 == 0) goto L_0x011d
            goto L_0x011f
        L_0x011d:
            r11 = 0
            goto L_0x0120
        L_0x011f:
            r11 = 1
        L_0x0120:
            java.lang.Object[] r12 = new java.lang.Object[r5]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            r12[r6] = r0
            java.lang.String r0 = "MicroMsg.UIUtils"
            java.lang.String r1 = "hasCutOut:%s"
            p1005ma.C88718b.m110681c(r0, r1, r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p1056vl.C90824b.m113903c(android.content.Context, boolean):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m113904d(android.content.res.Resources r3) {
        /*
            java.lang.Boolean r3 = f260777a
            r0 = 1
            if (r3 != 0) goto L_0x000c
            java.lang.Boolean r3 = new java.lang.Boolean
            r3.<init>(r0)
            f260777a = r3
        L_0x000c:
            java.lang.Boolean r3 = f260777a
            boolean r3 = r3.booleanValue()
            r1 = 26
            r2 = 0
            if (r3 == 0) goto L_0x0033
            java.lang.Boolean r3 = f260782f
            if (r3 != 0) goto L_0x001f
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            f260782f = r3
        L_0x001f:
            java.lang.Boolean r3 = f260782f
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x002d
            boolean r3 = m113906f()
            if (r3 == 0) goto L_0x0033
        L_0x002d:
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r1) goto L_0x0033
            r3 = 1
            goto L_0x0034
        L_0x0033:
            r3 = 0
        L_0x0034:
            if (r3 != 0) goto L_0x003d
            boolean r3 = m113905e()
            if (r3 != 0) goto L_0x003d
            return r2
        L_0x003d:
            java.lang.Boolean r3 = f260781e
            if (r3 != 0) goto L_0x0045
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            f260781e = r3
        L_0x0045:
            java.lang.Boolean r3 = f260781e
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0086
            java.lang.Boolean r3 = f260777a
            if (r3 != 0) goto L_0x0058
            java.lang.Boolean r3 = new java.lang.Boolean
            r3.<init>(r0)
            f260777a = r3
        L_0x0058:
            java.lang.Boolean r3 = f260777a
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x007c
            java.lang.Boolean r3 = f260782f
            if (r3 != 0) goto L_0x0068
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            f260782f = r3
        L_0x0068:
            java.lang.Boolean r3 = f260782f
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x0076
            boolean r3 = m113906f()
            if (r3 == 0) goto L_0x007c
        L_0x0076:
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r1) goto L_0x007c
            r3 = 1
            goto L_0x007d
        L_0x007c:
            r3 = 0
        L_0x007d:
            if (r3 != 0) goto L_0x0087
            boolean r3 = m113905e()
            if (r3 == 0) goto L_0x0086
            goto L_0x0087
        L_0x0086:
            r0 = 0
        L_0x0087:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1056vl.C90824b.m113904d(android.content.res.Resources):boolean");
    }

    /* renamed from: e */
    public static boolean m113905e() {
        if (f260777a == null) {
            f260777a = new Boolean(true);
        }
        if (f260777a.booleanValue()) {
            if (f260782f == null) {
                f260782f = Boolean.FALSE;
            }
            if (f260782f.booleanValue() || m113906f()) {
                if (f260779c == null) {
                    f260779c = new Boolean(false);
                    try {
                        C88718b.m110681c("MicroMsg.UIUtils", "dancy test darkModeUsableBrandAPI: %s", "");
                    } catch (Exception e) {
                        C88718b.m110680b("MicroMsg.UIUtils", "darModeUsableBrandAPI %s", e.toString());
                    }
                    if (!TextUtils.isEmpty("")) {
                        String lowerCase = Build.BRAND.toLowerCase();
                        if (f260780d.contains(lowerCase)) {
                            for (String str : "".split(",")) {
                                if (str.contains(lowerCase)) {
                                    C88718b.m110681c("MicroMsg.UIUtils", "dancy test usable brandAPI: %s", str);
                                    String[] split = str.split("&");
                                    if (split.length >= 2 && !TextUtils.isEmpty(split[1])) {
                                        try {
                                            int parseInt = Integer.parseInt(split[1]);
                                            C88718b.m110679a("MicroMsg.UIUtils", "dancy test api: %s", Integer.valueOf(parseInt));
                                            if (Build.VERSION.SDK_INT >= parseInt) {
                                                f260779c = new Boolean(true);
                                            }
                                        } catch (NumberFormatException e2) {
                                            C88718b.m110680b("MicroMsg.UIUtils", "parse api error! %s", e2.toString());
                                        }
                                    }
                                }
                            }
                        } else if ("".contains("other") && Build.VERSION.SDK_INT >= 29) {
                            f260779c = new Boolean(true);
                        }
                    }
                }
                if (f260779c.booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m113906f() {
        if (f260778b == null) {
            try {
                f260778b = new Boolean(false);
            } catch (Exception e) {
                C88718b.m110680b("MicroMsg.UIUtils", "isDarkModeUnusedOn %s", e.toString());
                f260778b = new Boolean(false);
            }
        }
        return f260778b.booleanValue();
    }
}
