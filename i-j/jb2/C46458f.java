package jb2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import ue3.C52552e;
import ue3.C52553f;
import ue3.C65338g;

/* renamed from: jb2.f */
public final class C46458f extends C117747y implements C1311n {

    /* renamed from: d */
    public final String f125148d;

    /* renamed from: e */
    public C11385n f125149e;

    /* renamed from: f */
    public final C47350c f125150f;

    public C46458f(C65338g gVar, int i, int i2, String str) {
        C87412m.m108594g(gVar, "musicInfo");
        C87412m.m108594g(str, "cacheKey");
        this.f125148d = str;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 8167;
        bVar.f127068c = "/cgi-bin/mmlistenappsvr/listenitem";
        bVar.f127066a = new C52552e();
        bVar.f127067b = new C52553f();
        C47350c a = bVar.mo72403a();
        this.f125150f = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.mv.MMListenItemRequest");
        C52552e eVar = (C52552e) aVar;
        eVar.f146774f = gVar;
        eVar.f146773e = i;
        eVar.f146775g = i2;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        stringBuffer.append("req_type:");
        stringBuffer.append(i);
        stringBuffer.append(",scene:");
        stringBuffer.append(i2);
        stringBuffer.append("musicInfo:" + gVar);
        Log.m105925i("MicroMsg.Mv.NetSceneMMListenItem", "request music info:%s", stringBuffer.substring(0, stringBuffer.length() - 1) + ']');
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125149e = nVar;
        return dispatch(gVar, this.f125150f, this);
    }

    public int getType() {
        return 8167;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.Mv.NetSceneMMListenItem", "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C47465a aVar = this.f125150f.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.mv.MMListenItemResponse");
            C52553f fVar = (C52553f) aVar;
            C11385n nVar = this.f125149e;
            if (nVar != null) {
                nVar.onSceneEnd(i2, i3, str, this);
                return;
            }
            return;
        }
        C11385n nVar2 = this.f125149e;
        if (nVar2 != null) {
            nVar2.onSceneEnd(i2, i3, str, this);
        }
    }
}
