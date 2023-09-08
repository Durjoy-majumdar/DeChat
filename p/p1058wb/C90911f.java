package p1058wb;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import wi0.C90988l;

/* renamed from: wb.f */
public class C90911f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C82381f f260905d;

    /* renamed from: e */
    public final /* synthetic */ C90912g f260906e;

    public C90911f(C90912g gVar, C82381f fVar) {
        this.f260906e = gVar;
        this.f260905d = fVar;
    }

    public void run() {
        Log.m105924i("Luggage.LockStepNativeInstallHelper", "initConfigLockStep initConfig ");
        if (this.f260906e.f260907a == null) {
            Log.m105924i("Luggage.LockStepNativeInstallHelper", "initConfigLockStep lockStepNative is null");
            return;
        }
        C90988l lVar = (C90988l) this.f260905d.mo109671p(C90988l.class);
        if (lVar != null) {
            Log.m105925i("Luggage.LockStepNativeInstallHelper", "lockstep appId:%s,pkgDebugType:%d,pkgVersion:%d,mbzType:%s", lVar.f261062e, Integer.valueOf(lVar.f261072r.f238585d + 1), Integer.valueOf(lVar.f261072r.pkgVersion), this.f260906e.f260908b);
            HashMap hashMap = new HashMap();
            hashMap.put("appid", lVar.f261062e);
            hashMap.put("appstate", String.valueOf(lVar.f261072r.f238585d + 1));
            hashMap.put("appversion", String.valueOf(lVar.f261072r.pkgVersion));
            hashMap.put("apptype", this.f260906e.f260908b);
            this.f260906e.f260907a.initConfig(hashMap);
            return;
        }
        Log.m105920e("Luggage.LockStepNativeInstallHelper", "initConfigLockStep sysConfig is null");
    }
}
