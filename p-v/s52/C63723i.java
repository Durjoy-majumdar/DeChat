package s52;

import android.content.Context;
import android.os.Build;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import di3.C86312j;
import eb0.C116734h6;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C47350c;
import p003ay.C0235b;
import p281yz.C79173v;
import pe3.C47465a;
import qe3.C89625d;
import te3.C49543gc3;
import te3.C64419hc3;
import te3.uy4;

/* renamed from: s52.i */
public class C63723i extends C75123k0 {

    /* renamed from: d */
    public C11385n f180622d;

    /* renamed from: e */
    public C47350c f180623e;

    /* renamed from: f */
    public uy4 f180624f;

    /* renamed from: g */
    public C64419hc3 f180625g;

    public C63723i() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49543gc3();
        bVar.f127067b = new C64419hc3();
        bVar.f127068c = "/cgi-bin/mmpay-bin/payibggetoverseawallet";
        bVar.f127069d = 1577;
        C47350c a = bVar.mo72403a();
        this.f180623e = a;
        C49543gc3 gc32 = (C49543gc3) a.f127055a.f127080a;
        C86709a0.m107528h();
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_HAD_SHOW_WALLET_MULTI_WALLET_GUIDE_BOOLEAN, Boolean.FALSE);
        gc32.f133963d = f != null ? ((Boolean) f).booleanValue() : false ? 1 : 0;
        gc32.f133964e = LocaleUtil.getApplicationLanguage();
        gc32.f133966g = Build.VERSION.RELEASE;
        gc32.f133965f = ChannelUtil.formatVersion((Context) null, C89625d.f257841g);
        gc32.f133967h = Build.MANUFACTURER;
        Log.m105925i("MicroMsg.NetScenePayIBGGetOverseaWallet", "req IsShowTips %s language %s os_ver %s wxg_ver %s phone_type %s", Integer.valueOf(gc32.f133963d), gc32.f133964e, gc32.f133966g, gc32.f133965f, gc32.f133967h);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f180622d = nVar;
        return dispatch(gVar, this.f180623e, this);
    }

    public int getType() {
        return 1577;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105924i("MicroMsg.NetScenePayIBGGetOverseaWallet", "errCode " + i3 + ", errMsg " + str);
        if (i2 == 0 && i3 == 0) {
            C47465a aVar = ((C47350c) uVar).f127056b.f127083a;
            C64419hc3 hc32 = (C64419hc3) aVar;
            this.f180625g = (C64419hc3) aVar;
            if (hc32.f183469h == null || hc32.f183470i == null) {
                Log.m105924i("MicroMsg.NetScenePayIBGGetOverseaWallet", "onGYNetEnd other is null " + hc32.f183471j);
            } else {
                Log.m105925i("MicroMsg.NetScenePayIBGGetOverseaWallet", "onGYNetEnd wallet_region : %s wallet_gray_area: %s wallet_threepoint_area size: %s", Integer.valueOf(hc32.f183471j), Integer.valueOf(hc32.f183469h.f185096d.size()), Integer.valueOf(hc32.f183470i.f186614d.size()));
                uy4 uy4 = hc32.f183475q;
                if (uy4 != null) {
                    this.f180624f = uy4;
                    Log.m105925i("MicroMsg.NetScenePayIBGGetOverseaWallet", "wallet_key_info flag %s wallet_key_info.url %s", Integer.valueOf(uy4.f185809d), hc32.f183475q.f185810e);
                }
            }
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_REGION_TYPE_INT_SYNC, Integer.valueOf(hc32.f183471j));
            C116734h6.m164657m(hc32.f183471j);
            ((C0235b) C86312j.m106911c(C0235b.class)).mo268rs();
            ((C79173v) C86312j.m106911c(C79173v.class)).Hx0().mo58170Lo(hc32.f183471j, hc32);
        }
        this.f180622d.onSceneEnd(i2, i3, str, this);
    }
}
