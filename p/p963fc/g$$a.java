package p963fc;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.networking.lib_server_mode.WxAppLibServerMode;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import org.json.JSONObject;

/* renamed from: fc.g$$a */
public final /* synthetic */ class g$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C86812g f251971d;

    /* renamed from: e */
    public final /* synthetic */ WxAppLibServerMode f251972e;

    public /* synthetic */ g$$a(C86812g gVar, WxAppLibServerMode wxAppLibServerMode) {
        this.f251971d = gVar;
        this.f251972e = wxAppLibServerMode;
    }

    public final void run() {
        C86812g gVar = this.f251971d;
        WxAppLibServerMode wxAppLibServerMode = this.f251972e;
        if (wxAppLibServerMode == null) {
            gVar.getClass();
            wxAppLibServerMode = WxAppLibServerMode.f244338f;
        }
        gVar.f251969g1 = wxAppLibServerMode;
        C81925i2 b0 = gVar.mo113047b0();
        WxAppLibServerMode wxAppLibServerMode2 = gVar.f251969g1;
        wxAppLibServerMode2.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TPReportKeys.LiveExKeys.LIVE_EX_DEFINATION_SWICH, wxAppLibServerMode2.f244339d);
        jSONObject.put(TPReportKeys.PlayerStep.PLAYER_REASON, wxAppLibServerMode2.f244340e.f244344d);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "toJson().toString()");
        b0.mo109652f("onToggleWxappLibServerMode", jSONObject2, 0);
    }
}
