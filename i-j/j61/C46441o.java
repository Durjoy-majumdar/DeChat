package j61;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C101776f80;
import te3.C50757oz1;
import te3.C50892pz1;
import z51.C39315g;

/* renamed from: j61.o */
public class C46441o extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f125092d;

    /* renamed from: e */
    public C11385n f125093e;

    /* renamed from: f */
    public String f125094f;

    /* renamed from: g */
    public int f125095g;

    /* renamed from: h */
    public int f125096h;

    public C46441o(String str, int i, int i2) {
        this.f125094f = str;
        this.f125095g = i;
        this.f125096h = i2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50757oz1();
        bVar.f127067b = new C50892pz1();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getemotiondetail";
        bVar.f127069d = 412;
        bVar.f127070e = 211;
        bVar.f127071f = 1000000211;
        this.f125092d = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105925i("MicroMsg.emoji.NetSceneGetEmotionDetail", "ProductID:%s, Scene:%d, Version:%d", this.f125094f, Integer.valueOf(this.f125095g), Integer.valueOf(this.f125096h));
        this.f125093e = nVar;
        C47350c cVar = this.f125092d;
        C50757oz1 oz12 = (C50757oz1) cVar.f127055a.f127080a;
        oz12.f139460d = this.f125094f;
        oz12.f139461e = this.f125095g;
        oz12.f139462f = this.f125096h;
        return dispatch(gVar, cVar, this);
    }

    public int getType() {
        return 412;
    }

    /* renamed from: j1 */
    public C101776f80 mo71837j1() {
        new C101776f80();
        return ((C50892pz1) this.f125092d.f127056b.f127083a).f140062d;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.emoji.NetSceneGetEmotionDetail", "ErrType:" + i2 + "   errCode:" + i3);
        if (i2 == 0 || i3 == 0 || i3 == 5) {
            if (i2 == 0 && i3 == 0) {
                ((C39315g) C86312j.m106911c(C39315g.class)).mo58034O6().mo57719f().mo61537Lo(this.f125094f, (C50892pz1) this.f125092d.f127056b.f127083a, LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext()));
            }
            this.f125093e.onSceneEnd(i2, i3, str, this);
            return;
        }
        this.f125093e.onSceneEnd(i2, i3, str, this);
    }
}
