package xv3;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import gw3.C116997a;
import gw3.C116999c;
import gw3.C117002f;
import gw3.C117003g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import rv3.C118245h;
import rv3.C90101c;
import rv3.C90104i;
import uv3.C118611a;
import vv3.C118702d;

/* renamed from: xv3.a */
public class C118905a {

    /* renamed from: xv3.a$a */
    public class C118906a implements C90104i.C90105a {
    }

    /* renamed from: a */
    public static void m167654a(C118702d dVar, C116997a aVar, C118611a aVar2) {
        String str;
        if (dVar != null && aVar != null && aVar2 != null) {
            aVar.f350594e = 301096;
            aVar.f350597h = 3;
            aVar.f350598i = C118611a.DATA_USAGE_TYPE_IDENTIFY == aVar2 ? 0 : C118611a.DATA_USAGE_TYPE_IDENTIFY_TRAIN == aVar2 ? 3 : 2;
            aVar.f350600n = dVar.f355207c.f356187b;
            TextUtils.isEmpty("");
            TextUtils.isEmpty("");
            String a = C90101c.m112728a(dVar.f355205a);
            if (TextUtils.isEmpty(a)) {
                a = "";
            }
            aVar.f350601o = "" + "_" + "" + "_" + a;
            aVar.f350602p = 2;
            aVar.f350603q = Build.BRAND;
            if (C90101c.f258755a == null) {
                C90101c.f258755a = Build.MODEL;
            }
            aVar.f350604r = C90101c.f258755a;
            Context context = dVar.f355205a;
            int i = -1;
            if (context != null) {
                try {
                    i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                } catch (Exception unused) {
                }
            }
            aVar.f350606t = i;
            aVar.f350607u = "5MBQ49B5AM14YYWJ";
            Context context2 = dVar.f355205a;
            if (context2 != null) {
                try {
                    str = context2.getPackageName();
                } catch (Exception unused2) {
                }
                aVar.f350608v = str;
                aVar.f350609w = "";
                aVar.f350610x = Build.FINGERPRINT;
                aVar.f350611y = Build.VERSION.SDK_INT;
                aVar.f350587A = 3;
                aVar.f350589C = "1234567890ABCDEF";
            }
            str = "";
            aVar.f350608v = str;
            aVar.f350609w = "";
            aVar.f350610x = Build.FINGERPRINT;
            aVar.f350611y = Build.VERSION.SDK_INT;
            aVar.f350587A = 3;
            aVar.f350589C = "1234567890ABCDEF";
        }
    }

    /* renamed from: b */
    public static Map<String, String> m167655b(Context context) {
        int i;
        HashMap hashMap = new HashMap();
        try {
            Map<String, String> a = C90104i.m112734a(new C118906a());
            if (a != null) {
                String str = a.get(String.valueOf(1));
                if (!TextUtils.isEmpty(str)) {
                    hashMap.put("turingU", str);
                }
                String str2 = a.get(String.valueOf(2));
                if (!TextUtils.isEmpty(str2)) {
                    hashMap.put("turingO", str2);
                }
            }
            String d = C90101c.m112731d();
            if (!TextUtils.isEmpty(d)) {
                hashMap.put("turingSID", d);
            }
            String b = C90101c.m112729b(false);
            if (!TextUtils.isEmpty(b)) {
                hashMap.put("turingKV", b);
            }
            int i2 = -1;
            try {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
                i = displayMetrics.widthPixels;
            } catch (Throwable unused) {
                i = -1;
            }
            try {
                DisplayMetrics displayMetrics2 = new DisplayMetrics();
                ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics2);
                i2 = displayMetrics2.heightPixels;
            } catch (Throwable unused2) {
            }
            hashMap.put("turingDPL", String.valueOf(i) + "*" + String.valueOf(i2));
        } catch (Throwable unused3) {
        }
        return hashMap;
    }

    /* renamed from: c */
    public static long m167656c(C116997a aVar) {
        if (m167657d(aVar) && m167658e(aVar)) {
            ArrayList<C117003g> arrayList = aVar.f350596g.get(0).f350630e.get(0).f350617e;
            C117003g gVar = arrayList.get(0);
            C117003g gVar2 = arrayList.get(arrayList.size() - 1);
            if (!(gVar == null || gVar2 == null)) {
                long abs = Math.abs(gVar2.f350639h - gVar.f350639h);
                C118245h.m166799a("sensor_ConvtUtil", "[method: getReqDuration ] calculate by sensor : " + abs);
                return abs;
            }
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        r2 = (r2 = r2.f350630e.get(0)).f350617e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r2.f350596g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        r1 = (r2 = r2.f350596g.get(0)).f350630e;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m167657d(gw3.C116997a r2) {
        /*
            r0 = 0
            if (r2 == 0) goto L_0x003a
            java.util.ArrayList<gw3.f> r1 = r2.f350596g
            if (r1 == 0) goto L_0x003a
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x000e
            goto L_0x003a
        L_0x000e:
            java.util.ArrayList<gw3.f> r2 = r2.f350596g
            java.lang.Object r2 = r2.get(r0)
            gw3.f r2 = (gw3.C117002f) r2
            if (r2 == 0) goto L_0x003a
            java.util.ArrayList<gw3.c> r1 = r2.f350630e
            if (r1 == 0) goto L_0x003a
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0023
            goto L_0x003a
        L_0x0023:
            java.util.ArrayList<gw3.c> r2 = r2.f350630e
            java.lang.Object r2 = r2.get(r0)
            gw3.c r2 = (gw3.C116999c) r2
            if (r2 == 0) goto L_0x003a
            java.util.ArrayList<gw3.g> r2 = r2.f350617e
            if (r2 == 0) goto L_0x003a
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0038
            goto L_0x003a
        L_0x0038:
            r2 = 1
            return r2
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xv3.C118905a.m167657d(gw3.a):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        r2 = r2.f350632g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r2.f350596g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        r1 = (r2 = r2.f350596g.get(0)).f350632g;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m167658e(gw3.C116997a r2) {
        /*
            r0 = 0
            if (r2 == 0) goto L_0x0030
            java.util.ArrayList<gw3.f> r1 = r2.f350596g
            if (r1 == 0) goto L_0x0030
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x000e
            goto L_0x0030
        L_0x000e:
            java.util.ArrayList<gw3.f> r2 = r2.f350596g
            java.lang.Object r2 = r2.get(r0)
            gw3.f r2 = (gw3.C117002f) r2
            if (r2 == 0) goto L_0x0030
            java.util.ArrayList<gw3.i> r1 = r2.f350632g
            if (r1 == 0) goto L_0x0030
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0023
            goto L_0x0030
        L_0x0023:
            java.util.ArrayList<gw3.i> r2 = r2.f350632g
            if (r2 == 0) goto L_0x0030
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r2 = 1
            return r2
        L_0x0030:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xv3.C118905a.m167658e(gw3.a):boolean");
    }

    /* renamed from: f */
    public static void m167659f(C117002f fVar, C117002f fVar2) {
        ArrayList<C116999c> arrayList;
        ArrayList<C116999c> arrayList2;
        if (fVar != null && fVar2 != null && (arrayList = fVar.f350630e) != null && !arrayList.isEmpty() && fVar.f350630e.get(0).f350617e != null && (arrayList2 = fVar2.f350630e) != null && !arrayList2.isEmpty() && fVar2.f350630e.get(0).f350617e != null) {
            fVar.f350630e.get(0).f350617e.addAll(fVar2.f350630e.get(0).f350617e);
        }
    }
}
