package kt0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82926s;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.HashMap;
import p284zb.C91635f;

/* renamed from: kt0.b */
public final class C46743b extends C82926s {
    public static final int CTRL_INDEX = 1227;
    public static final String NAME = "sheetModeWindowStateChangedEvent";

    /* renamed from: s */
    public final void mo71967s(C91635f fVar, C34033c cVar) {
        C87412m.m108594g(fVar, "service");
        C87412m.m108594g(cVar, "state");
        Log.m105924i("MicroMsg.JsApiSheetModeWindowStateChangedEvent", "[dispatchEvent] state=" + cVar);
        int ordinal = cVar.ordinal();
        if (ordinal == 0) {
            mo115194p(fVar);
            HashMap hashMap = new HashMap();
            hashMap.put("state", "fullPage");
            mo115165o(hashMap);
            mo115158h();
        } else if (ordinal == 1) {
            mo115194p(fVar);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("state", "halfPage");
            mo115165o(hashMap2);
            mo115158h();
        }
    }
}
