package p977hj;

import android.app.Application;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: hj.e */
public class C87530e {
    /* renamed from: a */
    public static C87528c m108861a(Application application, String str) {
        try {
            ClassLoader classLoader = MMApplicationContext.getContext().getClassLoader();
            C87528c cVar = (C87528c) classLoader.loadClass(MMApplicationContext.getSourcePackageName() + str).newInstance();
            cVar.f253585a = application;
            return cVar;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ProfileFactoryImpl", e, "", new Object[0]);
            return null;
        }
    }
}
