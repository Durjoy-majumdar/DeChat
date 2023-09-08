package o63;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C48985cc3;
import te3.C49125dc3;

/* renamed from: o63.a */
public class C47330a extends C75123k0 {

    /* renamed from: d */
    public C11385n f127014d;

    /* renamed from: e */
    public C47350c f127015e;

    /* renamed from: f */
    public String f127016f;

    /* renamed from: g */
    public String f127017g;

    public C47330a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, String str9) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C48985cc3();
        bVar.f127067b = new C49125dc3();
        bVar.f127068c = "/cgi-bin/mmpay-bin/payibggenprepay";
        bVar.f127069d = 1563;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f127015e = a;
        C48985cc3 cc32 = (C48985cc3) a.f127055a.f127080a;
        cc32.f131645d = str;
        cc32.f131648g = str4;
        cc32.f131646e = str2;
        cc32.f131649h = str5;
        cc32.f131650i = str6;
        cc32.f131647f = str3;
        cc32.f131651j = str7;
        cc32.f131652n = str8;
        cc32.f131653o = i;
        Log.m105918d("MicroMsg.NetSceneIbgPayGenPrepay", String.format("appid:%s,packageExt:%s,nonceStr:%s,paySignature:%s,signtype:%s,timeStamp:%s,url:%s,bizUsername:%s,", new Object[]{str, str4, str2, str5, str6, str3, str7, str8}));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f127014d = nVar;
        return dispatch(gVar, this.f127015e, this);
    }

    public int getType() {
        return 1563;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105925i("MicroMsg.NetSceneIbgPayGenPrepay", "hy: gen ibg prepay raw net errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C49125dc3 dc32 = (C49125dc3) ((C47350c) uVar).f127056b.f127083a;
        if (i2 == 0 && i3 == 0) {
            Log.m105925i("MicroMsg.NetSceneIbgPayGenPrepay", "hy: gen ibg prepay jump url. biz_errcode: %d, biz_errmsg: %s", Integer.valueOf(dc32.f132236g), dc32.f132237h);
            str = dc32.f132237h;
            i3 = dc32.f132236g;
            this.f127016f = dc32.f132234e;
            this.f127017g = dc32.f132238i;
        } else {
            Log.m105920e("MicroMsg.NetSceneIbgPayGenPrepay", "hy: gen ibg prepay jump url failed");
            this.f127016f = null;
        }
        if (Util.isNullOrNil(str)) {
            str = MMApplicationContext.getContext().getString(C0966R.string.krp);
        }
        this.f127014d.onSceneEnd(i2, i3, str, this);
    }
}
