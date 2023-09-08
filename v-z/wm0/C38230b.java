package wm0;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandLauncherFolderUI;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import org.json.JSONObject;
import rx3.C13598b0;

/* renamed from: wm0.b */
public final class C38230b extends C82268c<C81879g> {
    @Deprecated
    public static final int CTRL_INDEX = 648;
    @Deprecated
    public static final String NAME = "openWeAppHistoryList";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81879g gVar = (C81879g) fVar;
        if (gVar != null && jSONObject != null) {
            int optInt = jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
            String optString = jSONObject.optString("sceneNote");
            int optInt2 = jSONObject.optInt("getUsageReason", 0);
            try {
                AppBrandLauncherFolderUI.C29657a aVar = AppBrandLauncherFolderUI.f246377f;
                Context context = gVar.getContext();
                C87412m.m108593f(context, "env.context");
                Intent intent = new Intent();
                intent.putExtra("extra_get_usage_reason", optInt2);
                intent.putExtra("extra_enter_scene", optInt);
                intent.putExtra("extra_enter_scene_note", optString);
                C13598b0 b0Var = C13598b0.f38549a;
                aVar.mo56888b(context, intent);
                gVar.mo109647a(i, mo115109j("ok"));
            } catch (Exception e) {
                gVar.mo109647a(i, mo115109j("fail:internal error " + e.getMessage()));
            }
        }
    }
}
