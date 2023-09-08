package mj1;

import ak1.C54067f0;
import ak1.C54116w;
import cl1.C55004v1;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import org.json.JSONObject;
import z04.C112551y;

/* renamed from: mj1.e */
public final class C61491e {

    /* renamed from: a */
    public static final C61491e f174819a = new C61491e();

    /* renamed from: b */
    public static /* synthetic */ void m72198b(C61491e eVar, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        eVar.mo86466a(i, str, str2);
    }

    /* renamed from: a */
    public final void mo86466a(int i, String str, String str2) {
        int i2 = i;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event_type", i2);
        String str3 = "";
        if (i2 == 4 || i2 == 5) {
            if (str != null) {
                str3 = str;
            }
            jSONObject.put("stream_id", str3);
        } else if (i2 != 6) {
            C55004v1 v1Var = (C55004v1) FinderLiveService.f159376d.mo77630e(C55004v1.class);
            if (v1Var != null) {
                str3 = v1Var.mo76046c3();
            }
            jSONObject.put("stream_id", str3);
        } else {
            jSONObject.put("stream_id", str == null ? str3 : str);
            if (str2 != null) {
                str3 = str2;
            }
            jSONObject.put("last_stream_id", str3);
        }
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "json.toString()");
        String n = C112551y.m153814n(jSONObject2, ",", ";", false);
        Log.m105924i("LiveMicIntercomUtil", "reportMultiStream json: " + jSONObject);
        C7335d c = C86312j.m106911c(C54116w.class);
        C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
        C54116w.Ex0((C54116w) c, C54067f0.C54076o0.LIVE_MULTI_STREAM, n, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
    }
}
