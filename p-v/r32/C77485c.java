package r32;

import b63.C113146l;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C89349b;
import te3.C64320dn3;
import te3.C64606ob0;
import te3.C77963l1;
import te3.C77976pb0;

/* renamed from: r32.c */
public class C77485c extends C75123k0 {

    /* renamed from: d */
    public C47350c f225931d;

    /* renamed from: e */
    public C11385n f225932e;

    /* renamed from: f */
    public C64606ob0 f225933f;

    /* renamed from: g */
    public C77976pb0 f225934g;

    /* renamed from: h */
    public String f225935h;

    /* renamed from: i */
    public int f225936i;

    /* renamed from: j */
    public int f225937j;

    /* renamed from: n */
    public int f225938n;

    /* renamed from: o */
    public String f225939o;

    /* renamed from: p */
    public int f225940p;

    /* renamed from: q */
    public C64320dn3 f225941q;

    /* renamed from: r */
    public int f225942r;

    /* renamed from: s */
    public String f225943s;

    /* renamed from: t */
    public String f225944t;

    /* renamed from: u */
    public String f225945u;

    /* renamed from: v */
    public int f225946v;

    /* renamed from: w */
    public String f225947w;

    /* renamed from: x */
    public String f225948x;

    /* renamed from: y */
    public C89349b f225949y;

    public C77485c(String str, C89349b bVar) {
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = new C64606ob0();
        bVar2.f127067b = new C77976pb0();
        bVar2.f127069d = 1997;
        bVar2.f127070e = 0;
        bVar2.f127071f = 0;
        bVar2.f127068c = "/cgi-bin/mmpay-bin/ftfhb/ffopenwxhb";
        C47350c a = bVar2.mo72403a();
        this.f225931d = a;
        C64606ob0 ob02 = (C64606ob0) a.f127055a.f127080a;
        this.f225933f = ob02;
        ob02.f184649d = str;
        ob02.f184657o = bVar;
        C77963l1 c = C113146l.m154805c();
        if (c != null) {
            C64606ob0 ob03 = this.f225933f;
            ob03.f184650e = c.f227792e;
            ob03.f184651f = c.f227791d;
            ob03.f184652g = c.f227796i;
            ob03.f184653h = c.f227797j;
            ob03.f184654i = c.f227795h;
            ob03.f184655j = c.f227793f;
            ob03.f184656n = c.f227794g;
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f225932e = nVar;
        return dispatch(gVar, this.f225931d, this);
    }

    public int getType() {
        return 1997;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        this.f225934g = (C77976pb0) ((C47350c) uVar).f127056b.f127083a;
        Log.m105925i("NetSceneF2FLuckyMoneyOpen", "errType %d, retCode %d, retMsg %s", Integer.valueOf(i2), Integer.valueOf(this.f225934g.f227991d), this.f225934g.f227992e);
        C77976pb0 pb02 = this.f225934g;
        this.f225935h = pb02.f227994g;
        this.f225936i = pb02.f227995h;
        this.f225938n = pb02.f227996i;
        this.f225937j = pb02.f227993f;
        this.f225939o = pb02.f227997j;
        this.f225940p = pb02.f227998n;
        this.f225941q = pb02.f227999o;
        this.f225942r = pb02.f228000p;
        this.f225943s = pb02.f228001q;
        this.f225944t = pb02.f228002r;
        this.f225945u = pb02.f228003s;
        this.f225946v = pb02.f228004t;
        this.f225947w = pb02.f228005u;
        this.f225948x = pb02.f228006v;
        this.f225949y = pb02.f228008x;
        C11385n nVar = this.f225932e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, pb02.f227991d, pb02.f227992e, this);
        }
    }
}
