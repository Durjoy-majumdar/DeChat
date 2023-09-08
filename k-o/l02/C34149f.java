package l02;

import com.tencent.p014mm.modelsimple.C68143w;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import n02.C100030c;
import ob0.C117747y;
import ob0.C35142u;
import ob0.C47350c;
import pe3.C47465a;
import su0.C13781a;
import te3.C77984q62;

/* renamed from: l02.f */
public final class C34149f implements C35142u {
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
            Log.m105918d("MicroMsg.HashInfo.PluginHashInfo", sb.toString());
            if (q622 != null) {
                C100030c vx02 = ((C99275h) C86312j.m106911c(C99275h.class)).vx0();
                String a = C13781a.m13082a();
                C87412m.m108593f(a, "username()");
                vx02.mo139361i3(a);
            }
        }
    }
}
