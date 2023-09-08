package vd1;

import android.content.Context;
import android.util.Base64;
import bl3.C39818r;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C31543z5;
import gy3.C87412m;
import h81.C59774i;
import o40.C61926c;
import org.json.JSONException;
import org.json.JSONObject;
import rs1.C13442s8;
import rx3.C13598b0;
import te3.C51959xd1;
import te3.C64726td1;
import z04.C112551y;
import z04.C119027c;

/* renamed from: vd1.a */
public final class C14429a {

    /* renamed from: a */
    public static final C14429a f40033a = new C14429a();

    /* renamed from: a */
    public static void m13715a(C14429a aVar, Context context, String str, int i, int i2, C51959xd1 xd12, JSONObject jSONObject, int i3, Object obj) {
        long j;
        C64726td1 td12;
        String str2 = "";
        if ((i3 & 2) != 0) {
            str = str2;
        }
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = 138;
        }
        if ((i3 & 16) != 0) {
            xd12 = null;
        }
        if ((i3 & 32) != 0) {
            jSONObject = null;
        }
        aVar.getClass();
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "eid");
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        String str3 = ((C13442s8) C39818r.f106831a.mo62443b(context).mo75002a(C13442s8.class)).f38098n;
        String valueOf = String.valueOf(C31543z5.m39451a());
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (xd12 != null) {
            try {
                j = xd12.f144600d;
            } catch (JSONException e) {
                Log.m105920e("FinderMusicReporter", e.getMessage());
            }
        } else {
            j = 0;
        }
        jSONObject.put("music_profile_id", C61926c.m72691p(j));
        if (!(xd12 == null || (td12 = xd12.f144603g) == null)) {
            String str4 = td12.f185546s;
            if (str4 != null) {
                str2 = str4;
            }
        }
        jSONObject.put("songid", str2);
        Log.m105924i("FinderMusicReporter", "report21875 sessionId:" + Wb + " contextId:" + str3 + " commentScene:" + i2 + " action:" + i + " eid:" + str + " udf_kv:" + jSONObject);
        C115669n nVar = C115669n.INSTANCE;
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "udfKv.toString()");
        nVar.mo160131h(21875, Wb, str3, Integer.valueOf(i2), Integer.valueOf(i), valueOf, str, C112551y.m153814n(jSONObject2, ",", ";", false));
    }

    /* renamed from: b */
    public final void mo13714b(Context context, int i, C51959xd1 xd12, int i2, String str) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "wording");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("jump_type", i2);
            byte[] bytes = str.getBytes(C119027c.f356488a);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            jSONObject.put("wording", Base64.encodeToString(bytes, 2));
        } catch (JSONException e) {
            Log.m105920e("FinderMusicReporter", e.getMessage());
        }
        C13598b0 b0Var = C13598b0.f38549a;
        m13715a(this, context, "music_people_cell", i, 0, xd12, jSONObject, 8, (Object) null);
    }
}
