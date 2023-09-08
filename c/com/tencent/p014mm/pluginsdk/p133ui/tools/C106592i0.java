package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.ball.p1099ui.FloatBallProxyUI;
import com.tencent.p014mm.plugin.ball.service.FloatBallHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import org.json.JSONArray;
import org.json.JSONObject;
import xv0.C112181e;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.i0 */
public class C106592i0 extends FloatBallHelper {

    /* renamed from: r */
    public static C106592i0 f318506r = new C106592i0();

    /* renamed from: n */
    public String f318507n = "";

    /* renamed from: o */
    public String f318508o = "";

    /* renamed from: p */
    public String f318509p = "";

    /* renamed from: q */
    public int f318510q = 0;

    /* renamed from: V */
    public boolean mo35650V() {
        return true;
    }

    /* renamed from: g0 */
    public void mo149070g0(boolean z, int i) {
        if (z) {
            Log.m105924i("MicroMsg.FilesFloatBall.FilesFloatBallHelper", "onMenuFloatBallSelected, enter float ball");
            mo149077r0(false);
            C112181e eVar = this.f311729g;
            if (!(eVar != null ? eVar.mo149124h0(this.f311726d) : false)) {
                FloatBallProxyUI.m140993I7(MMApplicationContext.getContext(), 1, this.f311726d, mo149066Q(), this.f311730h);
                return;
            }
            mo68419u();
            C112181e eVar2 = this.f311729g;
            if (eVar2 != null) {
                eVar2.mo149107Y1();
            }
            Context context = MMApplicationContext.getContext();
            Intent intent = new Intent("com.tencent.QQBrowser.action.sdk.document.receiver");
            intent.setPackage("com.tencent.mtt");
            intent.putExtra("key_reader_sdk_window_close", true);
            try {
                context.sendBroadcast(intent);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.FilesFloatBall.FilesFloatBallHelper", "closeQb() Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
            }
        } else {
            Log.m105924i("MicroMsg.FilesFloatBall.FilesFloatBallHelper", "onMenuFloatBallSelected, exit float ball");
            mo68418k();
        }
    }

    /* renamed from: j0 */
    public void mo68417j0() {
        Log.m105925i("MicroMsg.FilesFloatBall.FilesFloatBallHelper", "onReceivedBallInfoRemovedEvent, filePath:%s", this.f318507n);
        Context context = MMApplicationContext.getContext();
        Intent intent = new Intent("com.tencent.QQBrowser.action.sdk.document.receiver");
        intent.setPackage("com.tencent.mtt");
        try {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", 1);
            jSONObject.put("isShow", true);
            jSONArray.put(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", 2);
            jSONObject2.put("isShow", false);
            jSONArray.put(jSONObject2);
            intent.putExtra("menuItems", jSONArray.toString());
            context.sendBroadcast(intent);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.FilesFloatBall.FilesFloatBallHelper", "updateQbFloatBallMenu() Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
        }
    }

    /* renamed from: k0 */
    public void mo64002k0() {
        Log.m105925i("MicroMsg.FilesFloatBall.FilesFloatBallHelper", "onReceivedFinishWhenSwitchBallEvent, filePath:%s", this.f318507n);
    }
}
