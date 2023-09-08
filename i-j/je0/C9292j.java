package je0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import te3.C50297lq1;
import te3.C52082y80;
import te3.C52230z80;

/* renamed from: je0.j */
public final class C9292j extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f29054d;

    /* renamed from: e */
    public final C47350c f29055e;

    /* renamed from: f */
    public C52082y80 f29056f;

    /* renamed from: g */
    public C52230z80 f29057g;

    public C9292j() {
        this((List<? extends C50297lq1>) null);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C87412m.m108594g(gVar, "dispatcher");
        C87412m.m108594g(nVar, "callback");
        this.f29054d = nVar;
        return dispatch(gVar, this.f29055e, this);
    }

    public int getType() {
        return 9146;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C87412m.m108594g(uVar, "rr");
        Log.m105925i("NetSceneGetForwardWeWorkMsg", "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C47465a aVar = this.f29055e.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.EncryptForwardWxworkMsgResp");
            this.f29057g = (C52230z80) aVar;
        }
        C11385n nVar = this.f29054d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    public C9292j(List<? extends C50297lq1> list) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 9146;
        bVar.f127068c = "/cgi-bin/micromsg-bin/encryptforwardwxworkmsg";
        bVar.f127066a = new C52082y80();
        bVar.f127067b = new C52230z80();
        C47350c a = bVar.mo72403a();
        this.f29055e = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.EncryptForwardWxworkMsgReq");
        this.f29056f = (C52082y80) aVar;
        LinkedList<C50297lq1> linkedList = new LinkedList<>();
        if (list != null) {
            linkedList.addAll(list);
        }
        this.f29056f.f145168d = linkedList;
    }
}
