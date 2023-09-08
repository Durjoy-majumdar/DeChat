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
import java.lang.ref.WeakReference;

/* renamed from: e52.a */
public final class C86441a<T extends C7597n> extends C86430i<T> {
    /* renamed from: e */
    public String mo16e() {
        return "startListenToEvent";
    }

    /* renamed from: q */
    public void mo18q(C7596h hVar) {
        C87412m.m108594g(hVar, "data");
        String optString = hVar.optString("eventName");
        Log.m105924i("MBJsApiStartListenToEvent", "eventName:" + optString);
        try {
            C87412m.m108593f(optString, "eventName");
            C30223r0 valueOf = C30223r0.valueOf(optString);
            C87412m.m108594g(valueOf, "event");
            ((C30187e0) C86312j.m106911c(C30187e0.class)).j60(mo120841d().f26666a, valueOf, new WeakReference(this.f251227a));
            mo120840p().invoke(mo120844i());
        } catch (IllegalArgumentException unused) {
            Log.m105920e("MBJsApiStartListenToEvent", "eventName error");
            mo120840p().invoke(mo120843h(C31415g.C7595b.f25865d));
        }
    }
}
