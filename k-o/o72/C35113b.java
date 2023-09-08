package o72;

import android.os.Bundle;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import ei3.C86522b;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p72.C35412b;
import q72.C89536b;
import zt3.C119157j;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: o72.b */
public class C35113b extends C86301e implements C35412b {

    /* renamed from: d */
    public Map<String, C35412b.C35413a> f94194d = new ConcurrentHashMap();

    /* renamed from: Su */
    public void mo59876Su(String str, String str2, C35412b.C35413a aVar) {
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.PluginMobileVerify", "sessionId  is empty!");
            Bundle bundle = new Bundle();
            bundle.putString("session", str);
            aVar.mo60247K1(bundle);
            return;
        }
        Log.m105925i("MicroMsg.PluginMobileVerify", "getMobileNumber %s, callback %s", str, aVar);
        if (aVar != null) {
            ((ConcurrentHashMap) this.f94194d).put(str, aVar);
        }
        ((C119157j) C119157j.f356862d).mo183875f(new C89536b(str, str2));
    }

    public void h90(String str) {
        ((ConcurrentHashMap) this.f94194d).remove(str);
    }
}
