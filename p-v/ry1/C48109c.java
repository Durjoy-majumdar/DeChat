package ry1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.plugin.game.model.C42119w;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.wechat.aff.ting.TingClientProto;
import uy1.C52642c;

/* renamed from: ry1.c */
public abstract class C48109c implements View.OnClickListener {

    /* renamed from: d */
    public Context f128971d;

    /* renamed from: e */
    public int f128972e;

    public C48109c(Context context, int i) {
        this.f128971d = context;
        if (context == null) {
            throw new IllegalArgumentException("context is null.");
        }
    }

    /* renamed from: a */
    public int mo72853a(Context context, C42119w wVar) {
        if (wVar == null) {
            Log.m105920e("MicroMsg.GameMessageOnClickListener", "game message is null.");
            return 0;
        } else if (!Util.isNullOrNil(wVar.field_appId)) {
            Bundle bundle = new Bundle();
            bundle.putCharSequence("game_app_id", wVar.field_appId);
            bundle.putInt("game_report_from_scene", TingClientProto.TingScene.TingScene_ChatHistory_VALUE);
            return C52642c.m58996n(context, wVar.field_appId, (String) null, bundle, 0);
        } else {
            Log.m105920e("MicroMsg.GameMessageOnClickListener", "message type : " + wVar.field_msgType + " ,message.field_appId is null.");
            return 0;
        }
    }
}
