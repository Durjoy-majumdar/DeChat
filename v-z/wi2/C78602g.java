package wi2;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C11385n;
import ob0.C47350c;
import te3.nj4;
import te3.oj4;

/* renamed from: wi2.g */
public class C78602g extends C53178a {

    /* renamed from: t */
    public oj4 f230226t;

    /* renamed from: u */
    public int f230227u;

    /* renamed from: v */
    public int f230228v;

    /* renamed from: w */
    public boolean f230229w;

    /* renamed from: x */
    public boolean f230230x;

    public C78602g(String str, String str2, String str3, double d, String str4, int i, String str5, String str6, boolean z, String str7, boolean z2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new nj4();
        bVar.f127067b = new oj4();
        bVar.f127069d = 2878;
        bVar.f127068c = "/cgi-bin/mmpay-bin/transferphoneplaceorder";
        C47350c a = bVar.mo72403a();
        this.f148360r = a;
        nj4 nj4 = (nj4) a.f127055a.f127080a;
        nj4.f227885d = str;
        nj4.f227886e = str2;
        nj4.f227887f = str3;
        nj4.f227888g = (int) Math.round(100.0d * d);
        nj4.f227889h = str4;
        nj4.f227890i = i;
        nj4.f227891j = str5;
        nj4.f227892n = str6;
        if (z) {
            nj4.f227893o = Util.nullAs(str7, "");
        }
        Log.m105925i("MicroMsg.mobileRemit.NetSceneMobileRemitPlaceOrder", "do scene NetSceneMobileRemitGetRecord rcvr_openid:%s rcvr_token:%s get_rcvr_ext%s amount:%s desc:%s delay_code:%s real_name_token:%s timestamp_ms:%s isFromForceCheckName:%s replaceorder_token:%s", str, str2, str3, Double.valueOf(d), str4, Integer.valueOf(i), str5, str6, Boolean.valueOf(z), Util.nullAs(str7, "null"));
        this.f230227u = nj4.f227888g;
        this.f230228v = nj4.f227890i;
        this.f230229w = z;
        this.f230230x = z2;
    }

    public int getType() {
        return 2878;
    }

    /* renamed from: j1 */
    public void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.mobileRemit.NetSceneMobileRemitPlaceOrder", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        oj4 oj4 = (oj4) ((C47350c) uVar).f127056b.f127083a;
        this.f230226t = oj4;
        Log.m105925i("MicroMsg.mobileRemit.NetSceneMobileRemitPlaceOrder", "ret_code: %s, ret_msg: %s", Integer.valueOf(oj4.f227920d), this.f230226t.f227921e);
        C11385n nVar = this.f148361s;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: k1 */
    public void mo66608k1(C114799u uVar) {
        oj4 oj4 = (oj4) ((C47350c) uVar).f127056b.f127083a;
        this.f221036f = oj4.f227920d;
        this.f221038h = oj4.f227921e;
    }
}
