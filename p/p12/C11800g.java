package p12;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import eb0.C97625j3;
import java.io.IOException;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49687hc2;
import te3.C49828ic2;

/* renamed from: p12.g */
public class C11800g extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f34519d = null;

    /* renamed from: e */
    public C49687hc2 f34520e = null;

    /* renamed from: f */
    public C49828ic2 f34521f = null;

    /* renamed from: g */
    public C11385n f34522g;

    public C11800g(int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49687hc2();
        bVar.f127067b = new C49828ic2();
        bVar.f127069d = 257;
        bVar.f127068c = "/cgi-bin/micromsg-bin/getwechatoutcoupons";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f34519d = a;
        C49687hc2 hc22 = (C49687hc2) a.f127055a.f127080a;
        this.f34520e = hc22;
        hc22.f134567d = i;
        hc22.f134568e = ((Integer) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERFINO_IPCALL_REDDOT_RECHARGE_VERSION_INT, 0)).intValue();
        this.f34520e.f134569f = ((Integer) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_IPCALL_ADDRESS_ACCOUNT_ACTIVITY_TYPE_VERSION_INT, 0)).intValue();
        Log.m105925i("MicroMsg.NetSceneIPCallGetWeChatOutCoupons", "NetSceneIPCallGetWeChatOutCoupons Scene:%d, RechargeWordingVersion:%d,AccountActivityWordingVersion:%d", Integer.valueOf(this.f34520e.f134567d), Integer.valueOf(this.f34520e.f134568e), Integer.valueOf(this.f34520e.f134569f));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f34522g = nVar;
        return dispatch(gVar, this.f34519d, this);
    }

    public int getType() {
        return 257;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneIPCallGetWeChatOutCoupons", "onGYNetEnd, errType: %d, errCode: %d", Integer.valueOf(i2), Integer.valueOf(i3));
        C49828ic2 ic22 = (C49828ic2) ((C47350c) uVar).f127056b.f127083a;
        this.f34521f = ic22;
        if ((i2 == 0 || i3 == 0) && i2 == 0 && i3 == 0 && ic22 != null) {
            Log.m105925i("MicroMsg.IPCallUtil", "[royle]begin save response,Balance:%s,PVWording:%s,Coupons:%s,Wording:%s,Title:%s,Desc:%s,ImgPath:%s,UrlPath:%s,SmsDesc:%s,PackageMsg:%s", ic22.f135212j, ic22.f135213n, ic22.f135206d, ic22.f135207e, ic22.f135208f, ic22.f135209g, ic22.f135210h, ic22.f135211i, ic22.f135214o, ic22.f135220u);
            try {
                C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_IPCALL_ACCOUNT_CACHE_STRING, Util.encodeHexString(ic22.toByteArray()));
            } catch (IOException e) {
                Log.m105925i("MicroMsg.IPCallUtil", "[royle]save exception:%s", e.getMessage());
            }
        }
        C11385n nVar = this.f34522g;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
