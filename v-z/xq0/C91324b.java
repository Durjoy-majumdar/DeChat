package xq0;

import com.tencent.p014mm.plugin.appbrand.permission.appidABTest.AppRuntimeAppidABTestPermissionBundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import p963fc.C86812g;
import wq0.C91065g;

/* renamed from: xq0.b */
public class C91324b {
    /* renamed from: a */
    public static final boolean m114560a(C86812g gVar) {
        AppRuntimeAppidABTestPermissionBundle appRuntimeAppidABTestPermissionBundle;
        byte[] bArr = null;
        if (gVar == null) {
            Log.m105924i("MicroMsg.AppBrandPermission.AppidABTestConfig", "fail:runtime is nil");
        } else {
            C91065g gVar2 = gVar.f251968f1;
            if (gVar2 == null) {
                Log.m105921e("MicroMsg.AppBrandPermission.AppidABTestConfig", "NULL permissionController with appId:%s", gVar.f238147j);
            } else {
                String str = gVar.f238147j;
                int i = gVar.f238149o.f239365g;
                synchronized (gVar2.f261249i) {
                    HashMap<String, AppRuntimeAppidABTestPermissionBundle> hashMap = gVar2.f261250j;
                    if (hashMap == null) {
                        appRuntimeAppidABTestPermissionBundle = null;
                    } else {
                        appRuntimeAppidABTestPermissionBundle = hashMap.get(str + "_weApp" + i);
                    }
                }
                if (appRuntimeAppidABTestPermissionBundle != null) {
                    bArr = appRuntimeAppidABTestPermissionBundle.f245269d;
                }
            }
        }
        return bArr != null && bArr.length > 2 && bArr[2] == 1;
    }
}
