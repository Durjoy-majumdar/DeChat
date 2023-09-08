package lz2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import uz2.C52671c;
import uz2.C52674d;

/* renamed from: lz2.c */
public final class C46920c extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f126147d;

    /* renamed from: e */
    public final C47350c f126148e;

    /* renamed from: f */
    public C52674d f126149f;

    public C46920c(String str, int i) {
        C87412m.m108594g(str, "iconId");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 4301;
        bVar.f127068c = "/cgi-bin/mmbiz-bin/rank/getcheerssignatureforwerun";
        bVar.f127066a = new C52671c();
        bVar.f127067b = new C52674d();
        C47350c a = bVar.mo72403a();
        this.f126148e = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.GetCheersSignatureForWerunReq");
        C52671c cVar = (C52671c) aVar;
        cVar.f147063d = str;
        cVar.f147064e = i;
        Log.m105924i("MicroMsg.TextStatus.NetSceneSportTextStatus", "iconId:" + str + " source:" + i);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f126147d = nVar;
        return dispatch(gVar, this.f126148e, this);
    }

    public int getType() {
        return 4301;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.TextStatus.NetSceneSportTextStatus", "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C47465a aVar = this.f126148e.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.GetCheersSignatureForWerunResp");
            this.f126149f = (C52674d) aVar;
        }
        C11385n nVar = this.f126147d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
