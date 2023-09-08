package ry1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.plugin.game.model.C42119w;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.wechat.aff.ting.TingClientProto;
import java.util.Map;
import uy1.C52642c;

/* renamed from: ry1.p0 */
public class C48147p0 extends C48109c {
    public C48147p0(Context context, int i) {
        super(context, TingClientProto.TingScene.TingScene_ChatHistory_VALUE);
        this.f128972e = i;
    }

    public void onClick(View view) {
        if (view.getTag() instanceof C42119w) {
            C42119w wVar = (C42119w) view.getTag();
            if (wVar.field_msgType != 6) {
                Bundle bundle = new Bundle();
                bundle.putCharSequence("game_app_id", wVar.field_appId);
                bundle.putInt("game_report_from_scene", TingClientProto.TingScene.TingScene_ChatHistory_VALUE);
                int n = C52642c.m58996n(this.f128971d, wVar.field_appId, (String) null, bundle, 0);
                String a = C40314g.m43482a((String) null, (String) null, wVar.f113474g2, (Map) null);
                C40314g.m43485d(this.f128971d, 13, TingClientProto.TingScene.TingScene_ChatHistory_VALUE, 5, n, 0, wVar.field_appId, this.f128972e, wVar.field_msgType, wVar.field_gameMsgId, wVar.f113472f2, a);
            } else if (!Util.isNullOrNil(wVar.f113487n1)) {
                C40314g.m43485d(this.f128971d, 13, TingClientProto.TingScene.TingScene_ChatHistory_VALUE, 5, C52642c.m59002t(this.f128971d, wVar.f113487n1, (String) null), 0, wVar.field_appId, this.f128972e, wVar.field_msgType, wVar.field_gameMsgId, wVar.f113472f2, C40314g.m43482a((String) null, (String) null, wVar.f113474g2, (Map) null));
            }
        }
    }
}
