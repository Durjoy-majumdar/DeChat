package w53;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C49264ec3;
import te3.C49409fc3;

/* renamed from: w53.b */
public class C53082b extends C75123k0 {

    /* renamed from: d */
    public C11385n f148150d;

    /* renamed from: e */
    public C47350c f148151e;

    /* renamed from: f */
    public String f148152f;

    /* renamed from: g */
    public int f148153g = 0;

    public C53082b() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        C49264ec3 ec32 = new C49264ec3();
        C86709a0.m107528h();
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_HAD_SHOW_WALLET_MULTI_WALLET_GUIDE_BOOLEAN, Boolean.FALSE);
        ec32.f132865d = f != null ? ((Boolean) f).booleanValue() : false ? 1 : 0;
        bVar.f127066a = ec32;
        bVar.f127067b = new C49409fc3();
        bVar.f127068c = "/cgi-bin/mmpay-bin/payibggetjumpurl";
        bVar.f127069d = 1564;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f148151e = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f148150d = nVar;
        return dispatch(gVar, this.f148151e, this);
    }

    public int getType() {
        return 1564;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105925i("MicroMsg.NetSceneIbgPayGetJumpUrl", "hy: get ibg jump url raw net errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C49409fc3 fc32 = (C49409fc3) ((C47350c) uVar).f127056b.f127083a;
        if (i2 == 0 && i3 == 0) {
            Log.m105925i("MicroMsg.NetSceneIbgPayGetJumpUrl", "hy: get ibg pay jump url. biz_errcode: %d, biz_errmsg: %s", Integer.valueOf(fc32.f133432d), fc32.f133433e);
            str = fc32.f133433e;
            i3 = fc32.f133432d;
            this.f148152f = fc32.f133434f;
            this.f148153g = fc32.f133435g;
        } else {
            Log.m105920e("MicroMsg.NetSceneIbgPayGetJumpUrl", "hy: get ibg pay jump url failed");
            this.f148152f = null;
        }
        if (Util.isNullOrNil(str)) {
            str = MMApplicationContext.getContext().getString(C0966R.string.krp);
        }
        this.f148150d.onSceneEnd(i2, i3, str, this);
    }
}
