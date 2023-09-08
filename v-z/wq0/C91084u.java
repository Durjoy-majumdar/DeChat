package wq0;

import com.tencent.luggage.sdk.config.AppBrandSysConfigLU;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.config.C81634a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import wi0.C90988l;

/* renamed from: wq0.u */
public class C91084u {

    /* renamed from: a */
    public static final List<String> f261268a = Arrays.asList(new String[]{"scope.userLocation", "scope.camera"});

    /* renamed from: a */
    public static String m114264a(String str, AppBrandRuntime appBrandRuntime) {
        str.getClass();
        if (str.equals("scope.camera")) {
            return appBrandRuntime.f238141d.getString(C0966R.string.a4y);
        }
        C81634a.C81640f fVar = (C81634a.C81640f) ((HashMap) appBrandRuntime.mo113008F().f239607j).get(str);
        if (fVar == null) {
            return null;
        }
        return fVar.f239629b;
    }

    /* renamed from: b */
    public static boolean m114265b(String str, C90988l lVar) {
        String[] strArr;
        boolean z;
        if (!f261268a.contains(str)) {
            if (!(lVar instanceof AppBrandSysConfigLU) || (strArr = ((AppBrandSysConfigLU) lVar).f234876S0.f239294R) == null) {
                return false;
            }
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                } else if (Objects.equals(strArr[i], str)) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                return false;
            }
        }
        str.getClass();
        if (!str.equals("scope.userLocation")) {
            return true;
        }
        return lVar.f261068n;
    }
}
