package y72;

import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.util.WXWebReporter;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.y$$d;
import p1081gi.C98121d;
import te3.C101819mz3;
import te3.C101848u5;
import te3.C64596nz3;

/* renamed from: y72.e */
public class C102820e extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f303532d;

    /* renamed from: e */
    public C11385n f303533e;

    /* renamed from: f */
    public String f303534f;

    /* renamed from: g */
    public String f303535g;

    /* renamed from: h */
    public int f303536h;

    /* renamed from: i */
    public String f303537i;

    /* renamed from: j */
    public String f303538j;

    /* renamed from: n */
    public String f303539n;

    /* renamed from: o */
    public String f303540o;

    public C102820e(String str, String str2, int i, String str3, String str4, String str5, String str6) {
        this.f303534f = str;
        this.f303535g = str2;
        this.f303536h = i;
        this.f303537i = str3;
        this.f303538j = str4;
        this.f303539n = str5;
        this.f303540o = str6;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C101819mz3();
        bVar.f127067b = new C64596nz3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/sendappmsg";
        bVar.f127069d = WXWebReporter.WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED_SWITCH_TO_SYS;
        bVar.f127070e = 107;
        bVar.f127071f = 1000000107;
        this.f303532d = bVar.mo72403a();
        Log.m105925i("MicroMsg.MsgSynchronizeSendAppMsgNetScene", "MsgSynchronizeSendAppMsgNetScene action[%s], messagaction[%s], fileId[%s], fileLen[%d], selfName[%s], stack[%s]", str4, this.f303538j, str, Integer.valueOf(i), str3, Util.getStack());
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f303533e = nVar;
        C68070l.C68072b bVar = new C68070l.C68072b();
        bVar.f195570f = "ChatSync";
        bVar.f195574g = "ChatSync";
        bVar.f195582i = 35;
        bVar.f195586j = this.f303534f;
        String str = this.f303535g;
        bVar.f195524R = str;
        bVar.f195594l = this.f303536h;
        bVar.f195527S = str;
        bVar.f195492H = 0;
        bVar.f195578h = "phone";
        bVar.f195539W = this.f303538j;
        bVar.f195614q = "supportAfterSleep,supportGetMore";
        bVar.f195598m = this.f303539n;
        bVar.f195649y2 = this.f303540o;
        C101848u5 u5Var = new C101848u5();
        String str2 = this.f303537i;
        u5Var.f299572d = str2;
        u5Var.f299574f = bVar.f195566e;
        u5Var.f299576h = 35;
        u5Var.f299575g = str2;
        u5Var.f299577i = C68070l.C68072b.m80419r(bVar, (String) null, (C98121d) null, 0, 0);
        u5Var.f299578j = (int) Util.nowSecond();
        ((C101819mz3) this.f303532d.f127055a.f127080a).f298885d = u5Var;
        return dispatch(gVar, this.f303532d, this);
    }

    public int getType() {
        return WXWebReporter.WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED_SWITCH_TO_SYS;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.MsgSynchronizeSendAppMsgNetScene", "msgSynchronize sendAppMsg onGYNetEnd. [%d,%d,%s]", Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f303533e.onSceneEnd(i2, i3, str, this);
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }
}
