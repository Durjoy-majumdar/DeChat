package xd2;

import com.tencent.p014mm.autogen.mmdata.rpt.RevokePatActionReportStruct;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51159ru3;
import te3.C77988qu3;
import vd2.C78384d;

/* renamed from: xd2.a */
public class C78799a extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f230556d;

    /* renamed from: e */
    public C11385n f230557e;

    /* renamed from: f */
    public RevokePatActionReportStruct f230558f;

    /* renamed from: g */
    public long f230559g;

    /* renamed from: h */
    public long f230560h;

    public C78799a(String str, long j, long j2, long j3, String str2) {
        Object e = C86709a0.m107535s().mo121142i().mo119684e(290818, 0);
        int i = e != null ? Util.getInt(e.toString(), 0) : 0;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C77988qu3();
        bVar.f127067b = new C51159ru3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/revokemsg";
        bVar.f127069d = 594;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f230559g = j;
        this.f230560h = j2;
        C47350c a = bVar.mo72403a();
        this.f230556d = a;
        C77988qu3 qu32 = (C77988qu3) a.f127055a.f127080a;
        qu32.f228133d = str;
        qu32.f228134e = 0;
        qu32.f228136g = 0;
        qu32.f228140n = j2;
        qu32.f228135f = (int) (j3 / 1000);
        qu32.f228137h = C75592q0.m90789s();
        qu32.f228138i = str2;
        qu32.f228139j = i;
        Log.m105925i("MicroMsg.NetSceneRevokePatMsg", "clientMsgId:%s,newClientMsgId:%d,svrMsgId:%d,createTime:%d,fromUserName:%s,toUserName:%s,indexOfRequest:%d", qu32.f228133d, Integer.valueOf(qu32.f228134e), Integer.valueOf(qu32.f228136g), Integer.valueOf(qu32.f228135f), qu32.f228137h, qu32.f228138i, Integer.valueOf(qu32.f228139j));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f230557e = nVar;
        return dispatch(gVar, this.f230556d, this);
    }

    public int getType() {
        return 594;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4 = 0;
        Log.m105925i("MicroMsg.NetSceneRevokePatMsg", "onGYNetEnd errType %d, errCode %d, errMsg %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            ((C78384d) C86312j.m106911c(C78384d.class)).Hd0(this.f230559g, this.f230560h);
            Object e = C86709a0.m107535s().mo121142i().mo119684e(290818, 0);
            if (e != null) {
                i4 = Util.getInt(e.toString(), 0);
            }
            C86709a0.m107535s().mo121142i().mo119676J(290818, Integer.valueOf(i4 + 1));
            RevokePatActionReportStruct revokePatActionReportStruct = this.f230558f;
            if (revokePatActionReportStruct != null) {
                revokePatActionReportStruct.f194352l = 2;
                revokePatActionReportStruct.mo86054n();
                RevokePatActionReportStruct revokePatActionReportStruct2 = this.f230558f;
                C87412m.m108594g(revokePatActionReportStruct2, "struct");
                revokePatActionReportStruct2.mo86056r();
            }
        } else {
            RevokePatActionReportStruct revokePatActionReportStruct3 = this.f230558f;
            if (revokePatActionReportStruct3 != null) {
                revokePatActionReportStruct3.f194352l = 1;
                revokePatActionReportStruct3.mo86054n();
                RevokePatActionReportStruct revokePatActionReportStruct4 = this.f230558f;
                C87412m.m108594g(revokePatActionReportStruct4, "struct");
                revokePatActionReportStruct4.mo86056r();
            }
        }
        this.f230557e.onSceneEnd(i2, i3, str, this);
    }
}
