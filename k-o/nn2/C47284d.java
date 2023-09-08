package nn2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C97625j3;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p680ru.C101464l;
import sf0.C48374j0;
import tc2.C118418g;
import te3.C51018qv3;
import te3.C51197s34;
import te3.C51340t34;
import te3.lx4;

/* renamed from: nn2.d */
public class C47284d extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f126929d;

    /* renamed from: e */
    public final C47350c f126930e;

    /* renamed from: f */
    public byte[] f126931f;

    /* renamed from: g */
    public int f126932g;

    public C47284d(int i, float f, float f2, int i2, int i3, String str, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51197s34();
        bVar.f127067b = new C51340t34();
        bVar.f127068c = "/cgi-bin/micromsg-bin/shakereport";
        bVar.f127069d = 161;
        bVar.f127070e = 56;
        bVar.f127071f = 1000000056;
        C47350c a = bVar.mo72403a();
        this.f126930e = a;
        C51197s34 s342 = (C51197s34) a.f127055a.f127080a;
        Log.m105925i("MicroMsg.NetSceneShakeReport", "share reprot %f %f", Float.valueOf(f2), Float.valueOf(f));
        s342.f141292d = i;
        s342.f141293e = f;
        s342.f141294f = f2;
        s342.f141295g = i2;
        s342.f141296h = str;
        s342.f141297i = str2;
        s342.f141300o = i3;
        s342.f141298j = Util.nullAs((Integer) C97625j3.m125812b().mo105906u().mo119684e(4107, (Object) null), 0);
        int nullAsNil = Util.nullAsNil((Integer) C97625j3.m125812b().mo105906u().mo119684e(4106, (Object) null));
        s342.f141299n = nullAsNil;
        C97625j3.m125812b().mo105906u().mo119676J(4106, Integer.valueOf(nullAsNil + 1));
        try {
            lx4 lx4 = new lx4();
            C51018qv3 qv32 = new C51018qv3();
            qv32.mo73350k(C118418g.INSTANCE.mo175821hd());
            lx4.f354117f = qv32;
            C51018qv3 qv33 = new C51018qv3();
            qv33.mo73350k(lx4.toByteArray());
            s342.f141302q = qv33;
        } catch (Throwable unused) {
        }
        ((C101464l) C86312j.m106911c(C101464l.class)).mo140963f9(2002, f, f2, i2);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105918d("MicroMsg.NetSceneShakeReport", "doScene");
        this.f126929d = nVar;
        return dispatch(gVar, this.f126930e, this);
    }

    public int getType() {
        return 161;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneShakeReport", "onGYNetEnd errType:" + i2 + " errCode:" + i3);
        C47350c cVar = this.f126930e;
        C51340t34 t342 = (C51340t34) cVar.f127056b.f127083a;
        C51197s34 s342 = (C51197s34) cVar.f127055a.f127080a;
        this.f126932g = uVar.getRespObj().getRetCode();
        if (i2 == 0 && i3 == 0) {
            this.f126931f = C48374j0.m53715d(t342.f141927d);
        }
        this.f126929d.onSceneEnd(i2, i3, str, this);
    }
}
