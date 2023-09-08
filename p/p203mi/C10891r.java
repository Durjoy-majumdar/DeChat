package p203mi;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import em0.C86570p;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51170rx1;
import te3.C51312sx1;

/* renamed from: mi.r */
public class C10891r extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f32510d;

    /* renamed from: e */
    public C11385n f32511e = null;

    /* renamed from: f */
    public int f32512f;

    /* renamed from: g */
    public int f32513g;

    public C10891r(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51170rx1();
        bVar.f127067b = new C51312sx1();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getchatroomupgradestatus";
        bVar.f127069d = C86570p.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f32510d = a;
        ((C51170rx1) a.f127055a.f127080a).f141203d = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f32511e = nVar;
        return dispatch(gVar, this.f32510d, this);
    }

    public int getType() {
        return C86570p.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C51312sx1 sx12 = (C51312sx1) this.f32510d.f127056b.f127083a;
        Log.m105919d("MicroMsg.NetSceneGetChatRoomUpgradeStatus", "NetSceneGetChatRoomUpgradeStatus onGYNetEnd errType:%d, errCode:%d, errMsg:%s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f32512f = sx12.f141812d;
        this.f32513g = sx12.f141818j;
        this.f32511e.onSceneEnd(i2, i3, str, this);
    }
}
