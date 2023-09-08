package z73;

import android.app.Activity;
import android.content.Context;
import bh3.C113177k;
import ch3.C113346a;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import rx3.C13604l;
import sx3.C36907w;
import sx3.C90364q0;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: z73.m */
public final class C91622m extends C15053a {

    /* renamed from: d */
    public static final C91622m f262481d = new C91622m();

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C113177k.C113179b bVar;
        C113177k.C113178a aVar;
        C13855j jVar2 = jVar;
        C13851h1 h1Var2 = h1Var;
        C87412m.m108594g(jVar2, "env");
        C87412m.m108594g(h1Var2, "msg");
        Log.m105924i("MicroMsg.WebSearch.StartAdQRScanJSApi", "handleMsg params: " + h1Var2.f38983a);
        Map<String, Object> map = h1Var2.f38983a;
        int i = -1;
        int e = C43471q.m46981e(map, "capability", -1);
        int e2 = C43471q.m46981e(map, "authScene", -1);
        if (e == 1) {
            bVar = C113177k.C113179b.LOCAION;
        } else if (e == 6) {
            bVar = C113177k.C113179b.STORAGE;
        } else if (e != 11) {
            Log.m105920e("MicroMsg.SystemCapabilityAuthorizationStatusJsApi", "capability error: " + e);
            return true;
        } else {
            bVar = C113177k.C113179b.CAMERA;
        }
        if (e2 == 10) {
            aVar = C113177k.C113178a.STORY;
        } else if (e2 != 11) {
            Log.m105920e("MicroMsg.SystemCapabilityAuthorizationStatusJsApi", "authScene error: " + e2);
            return true;
        } else {
            aVar = C113177k.C113178a.SEARCH;
        }
        Context context = jVar2.f38998a;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        boolean z = false;
        if (activity != null) {
            HashMap<C113177k.C113179b, C113346a.C113347b> hashMap = C113346a.f339121a;
            Set<Map.Entry<String, C113177k.C113179b>> entrySet = C113346a.f339122b.entrySet();
            C87412m.m108593f(entrySet, "PermissionBusinessConfig.PERMISSION_MAP.entries");
            ArrayList<Map.Entry> arrayList = new ArrayList<>();
            for (T next : entrySet) {
                if (((Map.Entry) next).getValue() == bVar) {
                    arrayList.add(next);
                }
            }
            ArrayList<String> arrayList2 = new ArrayList<>(C36907w.m41090l(arrayList, 10));
            for (Map.Entry key : arrayList) {
                arrayList2.add((String) key.getKey());
            }
            for (String ls02 : arrayList2) {
                C113177k.C79703c ls03 = ((C113177k) C86312j.m106911c(C113177k.class)).ls0(activity, ls02, aVar.f338662e);
                if (ls03 == C113177k.C79703c.SYSTEM_REFUSE) {
                    i = 2;
                } else {
                    if (ls03 == C113177k.C79703c.BUSINESS_REFUSE) {
                        i = 3;
                    }
                    if (ls03 == C113177k.C79703c.GRANTED && i != 3) {
                        i = 1;
                    }
                    if (ls03 == C113177k.C79703c.ERROR) {
                        Log.m105920e("MicroMsg.SystemCapabilityAuthorizationStatusJsApi", "IPluginSensitive.PERMISSION_RESULT.ERROR = " + ls03.f233615d);
                    }
                }
            }
        }
        C13604l[] lVarArr = new C13604l[5];
        lVarArr[0] = new C13604l("retCode", 0);
        lVarArr[1] = new C13604l("status", Integer.valueOf(i));
        lVarArr[2] = new C13604l("locationSystemAuthorizationStatus", 0);
        lVarArr[3] = new C13604l("accuracyAuthorization", Boolean.FALSE);
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_websearch_location_req, 0) == 1) {
            z = true;
        }
        lVarArr[4] = new C13604l("isLocationAuthExptEnable", Boolean.valueOf(z));
        Map f = C90364q0.m113147f(lVarArr);
        C13849g gVar = jVar2.f39001d;
        String str = h1Var2.f38990c;
        gVar.mo10774a(str, h1Var2.f38996i + ":ok", f);
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return 10000;
    }

    /* renamed from: c */
    public String mo7288c() {
        return "systemCapabilityAuthorizationStatus";
    }
}
