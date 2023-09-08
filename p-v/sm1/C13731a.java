package sm1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import c00.C0405n;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import java.util.Map;
import ke3.C88144b;
import org.json.JSONObject;
import p206nj.C117627q;
import p255vr.C65873e;

/* renamed from: sm1.a */
public final class C13731a {

    /* renamed from: a */
    public final Context f38833a;

    public C13731a(Context context) {
        C87412m.m108594g(context, "context");
        this.f38833a = context;
    }

    /* renamed from: a */
    public final void mo13108a(Intent intent) {
        C87412m.m108594g(intent, "intent");
        C0405n nVar = (C0405n) C86312j.m106911c(C0405n.class);
        Intent O20 = nVar.O20();
        O20.putExtra("ftsneedkeyboard", true);
        O20.putExtra("ftsForceShowDarkMode", true);
        O20.putExtra("ftsbizscene", 125);
        O20.putExtra("ftsType", 17);
        O20.putExtra("key_change_search_icon", true);
        Map<String, String> hn = nVar.mo280hn(125, false, 17);
        long vk02 = ((C65873e) C86312j.m106911c(C65873e.class)).vk0(125);
        C87412m.m108593f(hn, "params");
        hn.put("sessionId", String.valueOf(vk02));
        hn.put("subSessionId", String.valueOf(vk02));
        hn.put("isSug", "1");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("finderLiveContextId", intent.getStringExtra("key_context_id"));
        hn.put("thirdExtParam", C117627q.m165909b(jSONObject.toString(), "utf8"));
        O20.putExtra("sessionId", String.valueOf(vk02));
        O20.putExtra("subSessionId", String.valueOf(vk02));
        String Vw = nVar.mo277Vw(hn);
        Log.m105924i("MicroMsg.FinderLiveSearchHelper", "searchEntranceLayout url:" + Vw);
        O20.putExtra("rawUrl", Vw);
        O20.putExtra("key_load_js_without_delay", true);
        O20.putExtra("key_search_icon_and_hint_fix_default", true);
        O20.putExtra("key_preload_biz", 4);
        C88144b.m109806x(this.f38833a, O20, (Bundle) null);
    }
}
