package com.tencent.p014mm.plugin.game.commlib.util;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import org.json.JSONException;
import org.json.JSONObject;
import v10.C52735e;

/* renamed from: com.tencent.mm.plugin.game.commlib.util.b */
public final class C30081b {
    /* renamed from: a */
    public static final boolean m38959a() {
        long G = C86709a0.m107535s().mo121142i().mo119673G(C72994y1.C72995a.USERINFO_GAME_REDDOT_LEVELUP_SHUTDOWN_TIME_SEC_LONG, 0);
        Log.m105918d("GameABConfig", "reddot levelup shutdown end time: " + G + ", nowTime: " + Util.nowSecond());
        if (Util.nowSecond() < G) {
            return false;
        }
        String C50 = ((C52735e) C86312j.m106911c(C52735e.class)).C50(C32735h.C32737c.clicfg_game_center_exp_22t4_new_redpoint, "");
        Log.m105918d("GameABConfig", "isHitReddotLevelUpExp exp string: " + C50);
        if (C50 != null && C50.length() == 0) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(C50);
            return !(jSONObject.has("disable_android") && jSONObject.getInt("disable_android") == 1) && (jSONObject.has("exp_id") && jSONObject.getInt("exp_id") == 1);
        } catch (JSONException e) {
            Log.m105920e("GameABConfig", e.getMessage());
            return false;
        }
    }
}
