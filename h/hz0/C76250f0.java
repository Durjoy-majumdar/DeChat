package hz0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.appbrand.p025ad.jsapi.C1500a;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49283eg3;
import te3.C77930fg3;

/* renamed from: hz0.f0 */
public class C76250f0 extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f223353d;

    /* renamed from: e */
    public C11385n f223354e;

    /* renamed from: f */
    public String f223355f;

    /* renamed from: g */
    public String f223356g;

    /* renamed from: h */
    public int f223357h;

    /* renamed from: i */
    public String f223358i;

    /* renamed from: j */
    public String f223359j;

    /* renamed from: n */
    public String f223360n;

    /* renamed from: o */
    public boolean f223361o;

    /* renamed from: p */
    public String f223362p;

    /* renamed from: q */
    public String f223363q;

    /* renamed from: r */
    public String f223364r;

    /* renamed from: s */
    public String f223365s;

    public C76250f0(int i, String str, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49283eg3();
        bVar.f127067b = new C77930fg3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/preacceptgiftcard";
        bVar.f127069d = C1500a.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f223353d = a;
        C49283eg3 eg32 = (C49283eg3) a.f127055a.f127080a;
        eg32.f132919d = i;
        eg32.f132920e = str;
        eg32.f132921f = str2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f223354e = nVar;
        return dispatch(gVar, this.f223353d, this);
    }

    public int getType() {
        return C1500a.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetScenePreAcceptGiftCard", "onGYNetEnd, errType = %d, errCode = %d ,errMsg:%s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C77930fg3 fg32 = (C77930fg3) this.f223353d.f127056b.f127083a;
            String str2 = fg32.f227397d;
            this.f223355f = str2;
            String str3 = fg32.f227398e;
            this.f223356g = str3;
            int i4 = fg32.f227399f;
            this.f223357h = i4;
            this.f223358i = fg32.f227400g;
            this.f223359j = fg32.f227401h;
            this.f223360n = fg32.f227402i;
            this.f223361o = fg32.f227403j;
            this.f223362p = fg32.f227404n;
            this.f223363q = fg32.f227405o;
            this.f223364r = fg32.f227406p;
            this.f223365s = fg32.f227407q;
            Log.m105919d("MicroMsg.NetScenePreAcceptGiftCard", "fromUserName:%s, fromUserHeadImgUrl:%s, status:%d, content:%s,buttonWording:%s, backgroundColor:%s, ignore:%b", str2, str3, Integer.valueOf(i4), this.f223358i, this.f223359j, this.f223360n, Boolean.valueOf(this.f223361o));
        }
        this.f223354e.onSceneEnd(i2, i3, str, this);
    }
}
