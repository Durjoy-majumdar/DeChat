package hz0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C83121t;
import com.tencent.p014mm.plugin.card.model.CardGiftInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C22535xw1;
import te3.C51886ww1;

/* renamed from: hz0.y */
public class C21038y extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f59526d;

    /* renamed from: e */
    public C11385n f59527e;

    /* renamed from: f */
    public CardGiftInfo f59528f;

    public C21038y(int i, String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51886ww1();
        bVar.f127067b = new C22535xw1();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getcardgiftinfo";
        bVar.f127069d = C83121t.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f59526d = a;
        C51886ww1 ww12 = (C51886ww1) a.f127055a.f127080a;
        ww12.f144321d = i;
        ww12.f144322e = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f59527e = nVar;
        return dispatch(gVar, this.f59526d, this);
    }

    public int getType() {
        return C83121t.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneGetCardGiftInfo", "onGYNetEnd, errType = %d, errCode = %d ,errMsg:%s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C22535xw1 xw12 = (C22535xw1) this.f59526d.f127056b.f127083a;
            CardGiftInfo cardGiftInfo = new CardGiftInfo();
            cardGiftInfo.f51578d = xw12.f64783d;
            cardGiftInfo.f51579e = xw12.f64784e;
            cardGiftInfo.f51580f = xw12.f64785f;
            cardGiftInfo.f51581g = xw12.f64786g;
            cardGiftInfo.f51582h = xw12.f64787h;
            cardGiftInfo.f51583i = xw12.f64788i;
            cardGiftInfo.f51584j = xw12.f64789j;
            cardGiftInfo.f51585n = xw12.f64790n;
            cardGiftInfo.f51587p = xw12.f64792p;
            cardGiftInfo.f51586o = xw12.f64791o;
            cardGiftInfo.f51589q = xw12.f64793q;
            cardGiftInfo.f51590r = xw12.f64794r;
            cardGiftInfo.f51591s = xw12.f64795s;
            cardGiftInfo.f51592t = xw12.f64796t;
            cardGiftInfo.f51593u = xw12.f64797u;
            cardGiftInfo.f51594v = xw12.f64802z;
            cardGiftInfo.f51595w = xw12.f64798v;
            cardGiftInfo.f51596x = xw12.f64799w;
            cardGiftInfo.f51598y = xw12.f64800x;
            cardGiftInfo.f51599z = xw12.f64801y;
            cardGiftInfo.f51553A = xw12.f64759A;
            cardGiftInfo.f51554B = xw12.f64760B;
            cardGiftInfo.f51555C = xw12.f64761C;
            cardGiftInfo.f51556D = xw12.f64762D;
            cardGiftInfo.f51557E = xw12.f64763E;
            cardGiftInfo.f51558F = xw12.f64764F;
            cardGiftInfo.f51559G = xw12.f64765G;
            cardGiftInfo.f51560H = xw12.f64766H;
            cardGiftInfo.f51561I = xw12.f64767I;
            cardGiftInfo.f51562J = xw12.f64768J;
            cardGiftInfo.f51563K = xw12.f64769K;
            cardGiftInfo.f51564L = xw12.f64770L;
            cardGiftInfo.f51569R = xw12.f64772N;
            cardGiftInfo.f51570S = xw12.f64773P;
            cardGiftInfo.f51571T = xw12.f64774Q;
            cardGiftInfo.f51572U = xw12.f64775R;
            cardGiftInfo.f51573V = xw12.f64776S;
            cardGiftInfo.f51574W = xw12.f64777T;
            cardGiftInfo.f51575X = xw12.f64778U;
            cardGiftInfo.f51576Y = xw12.f64779V;
            cardGiftInfo.f51588p0 = xw12.f64781X;
            cardGiftInfo.f51577Z = xw12.f64780W;
            cardGiftInfo.f51597x0 = xw12.f64782Y;
            this.f59528f = cardGiftInfo;
            Log.m105919d("MicroMsg.NetSceneGetCardGiftInfo", "%s", cardGiftInfo.toString());
        }
        this.f59527e.onSceneEnd(i2, i3, str, this);
    }
}
