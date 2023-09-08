package p183ko;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMKVSlotManager;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import e42.C7596h;
import e42.C86430i;
import gy3.C87412m;
import java.util.HashMap;
import p150eo.C86596j;

/* renamed from: ko.a */
public final class C10367a<T extends C86596j> extends C86430i<T> {
    /* renamed from: e */
    public String mo16e() {
        return "getOldAdInfo";
    }

    /* renamed from: q */
    public void mo18q(C7596h hVar) {
        C87412m.m108594g(hVar, "data");
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("__WebJsEngineLocalData__");
        C87412m.m108593f(mmkv, "getMMKV(\"__WebJsEngineLocalData__\")");
        MMKVSlotManager mMKVSlotManager = new MMKVSlotManager(mmkv, 15552000);
        String optString = hVar.optString("key");
        C87412m.m108593f(optString, "key");
        String decodeString = mMKVSlotManager.decodeString(optString, "");
        Log.m105918d("MBJsApiGetOldAdInfo", "getLocalData:" + optString + ", " + decodeString);
        HashMap hashMap = new HashMap();
        hashMap.put("value", decodeString);
        mo120840p().invoke(mo120846k(hashMap));
    }
}
