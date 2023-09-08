package p269xe;

import android.util.Pair;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.matrix.batterycanary.monitor.feature.C114444c;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.C114519q0;
import com.tencent.matrix.batterycanary.monitor.feature.C80364g;
import com.tencent.matrix.batterycanary.monitor.feature.C80368h0;
import com.tencent.matrix.batterycanary.monitor.feature.C80373t0;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C21152b;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p1177ce.C113314g;
import p761yd.C91441c;
import p933be.C113173i;
import p981ie.C87705i;

/* renamed from: xe.a */
public final class C91177a {

    /* renamed from: a */
    public static final Runnable f261415a = new a$$e();

    /* renamed from: b */
    public static final Map<String, List<Pair<String, String>>> f261416b = new HashMap();

    /* renamed from: c */
    public static final C21152b f261417c = new a$$f();

    /* renamed from: d */
    public static final Map<Integer, Pair<String, Long>> f261418d = new HashMap();

    /* renamed from: e */
    public static final Map<String, List<Pair<String, String>>> f261419e = new HashMap();

    /* renamed from: f */
    public static final C21152b f261420f = new a$$g();

    /* renamed from: g */
    public static final Map<String, List<Pair<String, String>>> f261421g = new HashMap();

    /* renamed from: h */
    public static final C21152b f261422h = new a$$h();

    /* renamed from: i */
    public static final Map<String, List<Pair<String, String>>> f261423i = new HashMap();

    /* renamed from: j */
    public static final C21152b f261424j = new a$$i();

    /* renamed from: a */
    public static <T extends C114490k0> void m114417a(Class<T> cls, C87705i<T> iVar) {
        C113173i iVar2;
        T e;
        if (C91441c.m114729c() && (iVar2 = (C113173i) C91441c.m114730d().mo125377a(C113173i.class)) != null) {
            C113314g gVar = iVar2.f338613h;
            if (!gVar.f339057d.f339046q && (e = gVar.mo165880e(cls)) != null) {
                iVar.accept(e);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x008e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m114418b(android.os.PowerManager.WakeLock r8) {
        /*
            java.lang.String r0 = ")"
            java.lang.String r1 = "WakeLock ("
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 1
            java.lang.Class r4 = r8.getClass()     // Catch:{ all -> 0x0023 }
            java.lang.String r5 = "getTag"
            r6 = 0
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch:{ all -> 0x0023 }
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r5, r7)     // Catch:{ all -> 0x0023 }
            r4.setAccessible(r3)     // Catch:{ all -> 0x0023 }
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch:{ all -> 0x0023 }
            java.lang.Object r4 = r4.invoke(r8, r5)     // Catch:{ all -> 0x0023 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0023 }
            goto L_0x0028
        L_0x0023:
            r4 = move-exception
            r2.add(r4)
            r4 = 0
        L_0x0028:
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L_0x0047
            java.lang.Class r5 = r8.getClass()     // Catch:{ all -> 0x0043 }
            java.lang.String r6 = "mTag"
            java.lang.reflect.Field r5 = r5.getDeclaredField(r6)     // Catch:{ all -> 0x0043 }
            r5.setAccessible(r3)     // Catch:{ all -> 0x0043 }
            java.lang.Object r5 = r5.get(r8)     // Catch:{ all -> 0x0043 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0043 }
            r4 = r5
            goto L_0x0047
        L_0x0043:
            r5 = move-exception
            r2.add(r5)
        L_0x0047:
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L_0x0088
            java.lang.Class r5 = r8.getClass()     // Catch:{ all -> 0x0084 }
            java.lang.String r6 = "mTraceName"
            java.lang.reflect.Field r5 = r5.getDeclaredField(r6)     // Catch:{ all -> 0x0084 }
            r5.setAccessible(r3)     // Catch:{ all -> 0x0084 }
            java.lang.Object r8 = r5.get(r8)     // Catch:{ all -> 0x0084 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0084 }
            if (r8 == 0) goto L_0x0082
            boolean r3 = r8.startsWith(r1)     // Catch:{ all -> 0x007f }
            if (r3 == 0) goto L_0x0082
            boolean r3 = r8.endsWith(r0)     // Catch:{ all -> 0x007f }
            if (r3 == 0) goto L_0x0082
            int r1 = r8.indexOf(r1)     // Catch:{ all -> 0x007f }
            int r1 = r1 + 10
            int r0 = r8.lastIndexOf(r0)     // Catch:{ all -> 0x007f }
            if (r1 >= r0) goto L_0x0082
            java.lang.String r8 = r8.substring(r1, r0)     // Catch:{ all -> 0x007f }
            goto L_0x0082
        L_0x007f:
            r0 = move-exception
            r4 = r8
            goto L_0x0085
        L_0x0082:
            r4 = r8
            goto L_0x0088
        L_0x0084:
            r0 = move-exception
        L_0x0085:
            r2.add(r0)
        L_0x0088:
            boolean r8 = android.text.TextUtils.isEmpty(r4)
            if (r8 == 0) goto L_0x00cf
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.util.Iterator r0 = r2.iterator()
        L_0x0097:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00b9
            java.lang.Object r1 = r0.next()
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            int r2 = r8.length()
            if (r2 != 0) goto L_0x00ac
            java.lang.String r2 = ""
            goto L_0x00ae
        L_0x00ac:
            java.lang.String r2 = ";"
        L_0x00ae:
            r8.append(r2)
            java.lang.String r1 = r1.getMessage()
            r8.append(r1)
            goto L_0x0097
        L_0x00b9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getWakeLockTag err: "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.String r0 = "Matrix.battery.AmsInvokeListener"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r8)
        L_0x00cf:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p269xe.C91177a.m114418b(android.os.PowerManager$WakeLock):java.lang.String");
    }

    /* renamed from: c */
    public static void m114419c(String str, String str2, String str3, String str4, String str5, String str6, Object obj, Object[] objArr) {
        C113173i iVar;
        C114490k0 e;
        C113173i iVar2;
        C114490k0 e2;
        String str7 = str;
        String str8 = str5;
        Class cls = C114444c.class;
        Class cls2 = C113173i.class;
        StringBuilder sb = new StringBuilder();
        sb.append("on ");
        sb.append(str);
        sb.append(" invoke");
        sb.append(", method = ");
        sb.append(str5);
        sb.append(", form = ");
        String str9 = str2;
        sb.append(str2);
        Object obj2 = "";
        String str10 = obj2;
        if ("wakelock".equals(str)) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("@");
            Object obj3 = obj2;
            if (obj != null) {
                obj3 = Integer.valueOf(obj.hashCode());
            }
            sb4.append(obj3);
            str10 = sb4.toString();
        }
        sb.append(str10);
        sb.append(", args = ");
        sb.append(Arrays.toString(objArr));
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case 3649301:
                if (str.equals("wifi")) {
                    c = 0;
                    break;
                }
                break;
            case 92895825:
                if (str.equals("alarm")) {
                    c = 1;
                    break;
                }
                break;
            case 93166550:
                if (str.equals("audio")) {
                    c = 2;
                    break;
                }
                break;
            case 289465551:
                if (str.equals("wakelock")) {
                    c = 3;
                    break;
                }
                break;
            case 1901043637:
                if (str.equals(FirebaseAnalytics.C113379b.LOCATION)) {
                    c = 4;
                    break;
                }
                break;
            case 1968882350:
                if (str.equals("bluetooth")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                m114417a(C80373t0.class, new a$$a(str5));
                break;
            case 1:
                m114417a(cls, new a$$d(str5));
                break;
            case 2:
                if (C91441c.m114729c() && (iVar = (C113173i) C91441c.m114730d().mo125377a(cls2)) != null) {
                    C113314g gVar = iVar.f338613h;
                    if (!gVar.f339057d.f339046q && (e = gVar.mo165880e(cls)) != null) {
                        C114444c cVar = (C114444c) e;
                        str5.getClass();
                        break;
                    }
                }
            case 3:
                m114417a(C114519q0.class, new a$$c(str5, objArr, sb, str2, str3, str4, obj));
                break;
            case 4:
                Class cls3 = C80368h0.class;
                if (C91441c.m114729c() && (iVar2 = (C113173i) C91441c.m114730d().mo125377a(cls2)) != null) {
                    C113314g gVar2 = iVar2.f338613h;
                    if (!gVar2.f339057d.f339046q && (e2 = gVar2.mo165880e(cls3)) != null) {
                        C80368h0 h0Var = (C80368h0) e2;
                        str5.getClass();
                        if (str5.equals("requestLocationUpdates")) {
                            h0Var.f235246b.f235249a++;
                            break;
                        }
                    }
                }
                break;
            case 5:
                m114417a(C80364g.class, new a$$b(str5));
                break;
        }
        Log.m105924i("Matrix.battery.AmsInvokeListener", sb.toString());
    }
}
