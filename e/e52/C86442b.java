package e52;

import com.tencent.p014mm.plugin.magicbrush.C30187e0;
import com.tencent.p014mm.plugin.magicbrush.C30223r0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import e42.C31415g;
import e42.C7596h;
import e42.C7597n;
import e42.C86430i;
import gy3.C87412m;

/* renamed from: e52.b */
public final class C86442b<T extends C7597n> extends C86430i<T> {
    /* renamed from: e */
    public String mo16e() {
        return "stopListenToEvent";
    }

    /* renamed from: q */
    public void mo18q(C7596h hVar) {
        C87412m.m108594g(hVar, "data");
        String optString = hVar.optString("eventName");
        Log.m105924i("MBJsApiStopListenToEvent", "eventName:" + optString);
        try {
            C87412m.m108593f(optString, "eventName");
            ((C30187e0) C86312j.m106911c(C30187e0.class)).Ik0(mo120841d().f26666a, C30223r0.valueOf(optString));
            mo120840p().invoke(mo120844i());
        } catch (IllegalArgumentException unused) {
            Log.m105920e("MBJsApiStopListenToEvent", "eventName error");
            mo120840p().invoke(mo120843h(C31415g.C7595b.f25865d));
        }
    }
}
