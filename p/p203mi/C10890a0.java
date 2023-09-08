package p203mi;

import a11.C39479c;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.jsapi.C83051d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import eb0.C45612m0;
import eb0.C75592q0;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.qm4;
import te3.rm4;

/* renamed from: mi.a0 */
public class C10890a0 extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f32505d;

    /* renamed from: e */
    public C11385n f32506e = null;

    /* renamed from: f */
    public String f32507f = null;

    /* renamed from: g */
    public String f32508g = null;

    /* renamed from: h */
    public int f32509h = 0;

    public C10890a0(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new qm4();
        bVar.f127067b = new rm4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/upgradechatroom";
        bVar.f127069d = C83051d.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f32505d = a;
        this.f32507f = str;
        ((qm4) a.f127055a.f127080a).f140398d = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f32506e = nVar;
        return dispatch(gVar, this.f32505d, this);
    }

    public int getType() {
        return C83051d.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        rm4 rm4 = (rm4) this.f32505d.f127056b.f127083a;
        Log.m105919d("MicroMsg.NetSceneUpgradeChatroom", "NetSceneUpgradeChatroom onGYNetEnd errType:%d, errCode:%d, errMsg:%s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        String str2 = rm4.f141029d;
        this.f32508g = str2;
        if (!Util.isNullOrNil(str2)) {
            C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(this.f32507f);
            if (Lo == null) {
                Lo = new C44661m1();
            }
            Lo.mo69783F2(C75592q0.m90789s(), this.f32508g);
            C45612m0.m50680G(Lo);
        }
        this.f32509h = rm4.f141035j;
        this.f32506e.onSceneEnd(i2, i3, str, this);
    }
}
