package wq0;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Set;
import js0.C88021l;
import p918s2.C90111a;

/* renamed from: wq0.v */
public class C91085v {

    /* renamed from: a */
    public static final C88021l<String, C90111a.C90113b> f261269a = new C88021l<>();

    /* renamed from: a */
    public static void m114266a(String str, C90111a.C90113b bVar) {
        if (TextUtils.isEmpty(str) || bVar == null) {
            Log.m105920e("Luggage.RequestPermissionRegistry", "addCallback fail, invalid arguments");
        } else {
            f261269a.mo122464e(str, bVar);
        }
    }

    /* renamed from: b */
    public static void m114267b(String str, C90111a.C90113b bVar) {
        if (TextUtils.isEmpty(str) || bVar == null) {
            Log.m105920e("Luggage.RequestPermissionRegistry", "removeCallback fail, invalid arguments");
        } else {
            f261269a.mo122465f(str, bVar);
        }
    }

    /* renamed from: c */
    public static void m114268c(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.m105920e("Luggage.RequestPermissionRegistry", "removeCallbacks fail, invalid arguments");
        } else {
            f261269a.mo122466g(str);
        }
    }

    /* renamed from: d */
    public static void m114269d(String str, int i, String[] strArr, int[] iArr, boolean z) {
        if (str == null || str.length() == 0) {
            Log.m105920e("Luggage.RequestPermissionRegistry", "removeCallback fail, invalid id");
            return;
        }
        Set<C90111a.C90113b> d = f261269a.mo122463d(str);
        if (d != null) {
            for (C90111a.C90113b onRequestPermissionsResult : d) {
                onRequestPermissionsResult.onRequestPermissionsResult(i, strArr, iArr);
            }
            if (z) {
                d.clear();
            }
        }
    }
}
