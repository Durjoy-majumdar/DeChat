package lz2;

import az2.C39674e;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import rz2.C48202d;
import rz2.C48203e;
import su0.C13781a;
import uz2.C52705o1;
import uz2.C52707p1;

/* renamed from: lz2.k */
public final class C46926k extends C117747y implements C1311n {

    /* renamed from: d */
    public String f126167d;

    /* renamed from: e */
    public String f126168e;

    /* renamed from: f */
    public int f126169f;

    /* renamed from: g */
    public final int f126170g;

    /* renamed from: h */
    public C11385n f126171h;

    /* renamed from: i */
    public final C47350c f126172i;

    public C46926k(String str, String str2, String str3, int i, int i2) {
        C87412m.m108594g(str, "topicId");
        C87412m.m108594g(str2, "statusId");
        C87412m.m108594g(str3, "userName");
        this.f126167d = str2;
        this.f126168e = str3;
        this.f126169f = i;
        this.f126170g = i2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 4099;
        bVar.f127068c = "/cgi-bin/micromsg-bin/textstatuslike";
        bVar.f127066a = new C52705o1();
        bVar.f127067b = new C52707p1();
        C47350c a = bVar.mo72403a();
        this.f126172i = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.TextStatusLikeReq");
        C52705o1 o1Var = (C52705o1) aVar;
        o1Var.f147173d = str;
        o1Var.f147174e = this.f126167d;
        o1Var.f147175f = this.f126168e;
        o1Var.f147176g = this.f126169f;
        o1Var.f147177h = i2;
        o1Var.f147178i = this.f126167d + C31543z5.m39451a();
        Log.m105924i("MicroMsg.TextStatus.NetSceneTextStatusLike", "topicId:" + str + ", statusId:" + this.f126167d + ", username:" + this.f126168e + ", action:" + this.f126169f + ", type:" + i2);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C87412m.m108594g(gVar, "dispatcher");
        C87412m.m108594g(nVar, "callback");
        this.f126171h = nVar;
        return dispatch(gVar, this.f126172i, this);
    }

    public int getType() {
        return 4099;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C87412m.m108594g(uVar, "rr");
        Log.m105925i("MicroMsg.TextStatus.NetSceneTextStatusLike", "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C47465a aVar = this.f126172i.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.TextStatusLikeResp");
            C52707p1 p1Var = (C52707p1) aVar;
            C39674e eVar = C39674e.f106452d;
            C48203e S = eVar.mo62246S();
            String str2 = this.f126167d;
            String a = C13781a.m13082a();
            C87412m.m108593f(a, "username()");
            C48202d Lo = S.mo72950Lo(str2, a);
            int i4 = this.f126169f;
            if (i4 == 1 && Lo != null) {
                eVar.mo62246S().delete(Lo, new String[0]);
            } else if (i4 != 1) {
                if (Lo == null) {
                    Lo = new C48202d();
                }
                Lo.field_HashUserName = C13781a.m13082a();
                Lo.field_TextStatusId = this.f126167d;
                Lo.field_Type = this.f126170g;
                Lo.field_Read = 1;
                Lo.field_CreateTime = C31543z5.m39455e();
                if (((int) Lo.systemRowid) == -1) {
                    eVar.mo62246S().insert(Lo);
                } else {
                    eVar.mo62246S().update(Lo, new String[0]);
                }
            }
        }
        C11385n nVar = this.f126171h;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
