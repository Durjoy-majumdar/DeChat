package p667qt;

import com.tencent.p014mm.model.newabtest.C28984e;
import com.tencent.p014mm.model.newabtest.SubCoreNewABTest;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C96980c;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import p230rt.C13584b;

@C86522b
/* renamed from: qt.b */
public class C36081b extends C86301e implements C13584b {
    /* renamed from: hH */
    public Map<String, String> mo12975hH(String str) {
        C96980c cVar = null;
        boolean z = true;
        if (str == null || str.length() == 0) {
            Log.m105925i("MicroMsg.IPCNewABTest", "get ABTestItem by layerId failed, id is null.", str);
        } else if (!C86709a0.m107531m().mo58407a().mo71804b()) {
            C28984e eVar = (C28984e) C86312j.m106911c(C28984e.class);
            eVar.getClass();
            if (str.length() != 0) {
                z = false;
            }
            if (!z) {
                cVar = new C96980c();
                cVar.field_layerId = str;
                eVar.requireAccountInitialized();
                MultiProcessMMKV vx02 = eVar.vx0();
                C87412m.m108593f(vx02, "MMKV");
                String str2 = "layer_" + cVar.field_layerId;
                cVar.field_rawXML = vx02.getString(str2 + "_rawXML", "");
                cVar.field_startTime = vx02.getLong(str2 + "_startTime", Util.nowSecond());
                cVar.field_endTime = vx02.getLong(str2 + "_endTime", Util.nowSecond());
            }
        } else if (!C86709a0.m107528h().f251724a.f251792d || !C86709a0.m107523b().f251765p) {
            Log.m105920e("MicroMsg.IPCNewABTest", "kernel or account not ready.");
        } else {
            cVar = SubCoreNewABTest.wx0().mo57622Lo(str);
        }
        return (cVar == null || !cVar.isValid()) ? new HashMap(0) : cVar.mo135598l2();
    }
}
