package nn2;

import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C97625j3;
import f40.C86709a0;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p196ln.C76706g;
import p248ug.C52558c;
import rb0.C48009v0;
import tc2.C118418g;
import te3.C50632o34;
import te3.C50777p34;
import te3.C51018qv3;
import te3.C51043r10;
import te3.lx4;
import yh0.C39021b;

/* renamed from: nn2.c */
public class C47283c extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f126924d;

    /* renamed from: e */
    public C47350c f126925e;

    /* renamed from: f */
    public List<C47288f> f126926f;

    /* renamed from: g */
    public int f126927g;

    /* renamed from: h */
    public int f126928h;

    public C47283c(byte[] bArr) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50632o34();
        bVar.f127067b = new C50777p34();
        bVar.f127068c = "/cgi-bin/micromsg-bin/shakeget";
        bVar.f127069d = 162;
        bVar.f127070e = 57;
        bVar.f127071f = 1000000057;
        C47350c a = bVar.mo72403a();
        this.f126925e = a;
        C50632o34 o342 = (C50632o34) a.f127055a.f127080a;
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(bArr);
        o342.f138938d = qv32;
        o342.f138939e = 1;
        try {
            lx4 lx4 = new lx4();
            C51018qv3 qv33 = new C51018qv3();
            qv33.mo73350k(C118418g.INSTANCE.mo175821hd());
            lx4.f354117f = qv33;
            C51018qv3 qv34 = new C51018qv3();
            qv34.mo73350k(lx4.toByteArray());
            o342.f138941g = qv34;
        } catch (Throwable unused) {
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105918d("MicroMsg.NetSceneShakeGet", "doScene");
        this.f126924d = nVar;
        return dispatch(gVar, this.f126925e, this);
    }

    public int getType() {
        return 162;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneShakeGet", "onGYNetEnd errType:" + i2 + " errCode:" + i3);
        C50777p34 p342 = (C50777p34) this.f126925e.f127056b.f127083a;
        this.f126926f = new LinkedList();
        this.f126927g = p342.f139559g;
        this.f126928h = p342.f139560h;
        int i4 = p342.f139556d;
        Log.m105918d("MicroMsg.NetSceneShakeGet", "size:" + i4);
        C44668u3 v = C97625j3.m125812b().mo105907v();
        if (i4 >= 1) {
            C47289g zx02 = C76942m.zx0();
            zx02.mo72323Ow();
            Log.m105924i("MicroMsg.NewShakeItemStorage", "delOldRecord count:" + i4);
            StringBuilder sb = new StringBuilder();
            sb.append("DELETE FROM shakeitem1 WHERE shakeItemID NOT IN ( SELECT shakeItemID FROM shakeitem1 ORDER BY shakeItemID DESC LIMIT ");
            sb.append(100 > i4 ? 100 - i4 : 0);
            sb.append(" )");
            if (zx02.f126951d.execSQL("shakeitem1", sb.toString())) {
                Log.m105924i("MicroMsg.NewShakeItemStorage", "delOldRecord success count:" + i4);
                zx02.doNotify();
            }
            for (int i5 = i4 - 1; i5 >= 0; i5 += -1) {
                if (!C75592q0.m90789s().equals(p342.f139557e.get(i5).f138376d)) {
                    C52558c SE = C48009v0.Fx0().mo72757SE(p342.f139557e.get(i5).f138376d);
                    SE.field_username = p342.f139557e.get(i5).f138376d;
                    SE.field_brandList = p342.f139557e.get(i5).f138373C;
                    C51043r10 r102 = p342.f139557e.get(i5).f138374D;
                    if (r102 != null) {
                        SE.field_brandFlag = r102.f140656d;
                        SE.field_brandInfo = r102.f140658f;
                        SE.field_brandIconURL = r102.f140659g;
                        SE.field_extInfo = r102.f140657e;
                    }
                    if (!C48009v0.Fx0().replace(SE)) {
                        C48009v0.Fx0().insert(SE);
                    }
                }
                C47288f fVar = new C47288f(p342.f139557e.get(i5));
                C68097n nVar = new C68097n();
                nVar.f195728a = fVar.field_username;
                nVar.f195733f = fVar.field_hasHDImg > 0 ? 1 : 0;
                nVar.f195729b = fVar.field_imgstatus;
                nVar.f195732e = p342.f139557e.get(i5).f138371A;
                nVar.f195731d = p342.f139557e.get(i5).f138372B;
                ((C68098o) ((C76706g) C86312j.m106911c(C76706g.class)).mo106832eg()).mo93608Yt(nVar);
                nVar.f195736i = -1;
                Log.m105919d("MicroMsg.NetSceneShakeGet", "dkhurl search %s b[%s] s[%s]", nVar.mo93598g(), nVar.mo93594c(), nVar.mo93597f());
                fVar.field_reserved2 = v.mo69724s3(fVar.field_username) ? 1 : 0;
                C72996z1 z1Var = v.get(fVar.field_username);
                if (z1Var != null && ((int) z1Var.f108320R1) > 0) {
                    zx02.mo72326qq(z1Var.getUsername());
                    zx02.mo72326qq(z1Var.mo73978v2());
                }
                zx02.mo72324Yt(fVar, false);
                C97625j3.m125812b().getClass();
                C86709a0.m107528h();
                C86709a0.m107523b().mo121108c();
                C39021b.wx0().vx0().mo57651jo(fVar.field_username, this.f126927g, p342.f139557e.get(i5).f138375E);
                fVar.f126949x0 = this.f126927g;
                ((LinkedList) this.f126926f).add(fVar);
                Log.m105926v("MicroMsg.NetSceneShakeGet", "item info: " + fVar.field_username + " " + fVar.field_nickname);
            }
        }
        this.f126924d.onSceneEnd(i2, i3, str, this);
    }
}
