package p265wx;

import com.tencent.p014mm.modelsimple.C68143w;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import ob0.C117747y;
import ob0.C35142u;
import ob0.C47350c;
import p274xx.C66446g;
import pe3.C47465a;
import te3.C77984q62;

/* renamed from: wx.k */
public final class C38331k implements C35142u {
    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (i == 0 && i2 == 0) {
            C77984q62 q622 = null;
            C68143w wVar = yVar instanceof C68143w ? (C68143w) yVar : null;
            C114799u reqResp = wVar != null ? wVar.getReqResp() : null;
            C47350c cVar = reqResp instanceof C47350c ? (C47350c) reqResp : null;
            C47465a aVar = cVar != null ? cVar.f127056b.f127083a : null;
            if (aVar instanceof C77984q62) {
                q622 = (C77984q62) aVar;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("afterNetSceneGetProfile resp:");
            sb.append(q622 != null);
            Log.m105924i("MicorMsg.SettingFindMoreReddotService", sb.toString());
            if (q622 != null) {
                ((C66446g) C86312j.m106911c(C66446g.class)).mo61615xW();
            }
        }
    }
}
