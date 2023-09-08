package wa3;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.y$$d;
import te3.C49544gd0;
import te3.C50812pd0;
import te3.C50945qd0;

/* renamed from: wa3.b */
public class C53142b extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f148271d;

    /* renamed from: e */
    public C11385n f148272e = null;

    /* renamed from: f */
    public int f148273f = 1;

    /* renamed from: g */
    public String f148274g = "";

    /* renamed from: h */
    public C49544gd0 f148275h = null;

    /* renamed from: i */
    public LinkedList<C49544gd0> f148276i;

    /* renamed from: j */
    public int f148277j;

    public C53142b(int i, int i2, String str, LinkedList<C49544gd0> linkedList, C49544gd0 gd02) {
        new LinkedList();
        this.f148276i = linkedList;
        this.f148275h = gd02;
        this.f148274g = str;
        this.f148273f = i2;
        this.f148277j = i;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50812pd0();
        bVar.f127067b = new C50945qd0();
        bVar.f127068c = "/cgi-bin/micromsg-bin/favsecurity ";
        bVar.f127069d = 921;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f148271d = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C47350c cVar = this.f148271d;
        C50812pd0 pd02 = (C50812pd0) cVar.f127055a.f127080a;
        pd02.f139701d = this.f148273f;
        pd02.f139704g = this.f148275h;
        pd02.f139703f = this.f148276i;
        pd02.f139702e = this.f148274g;
        this.f148272e = nVar;
        return dispatch(gVar, cVar, this);
    }

    public int getType() {
        return 921;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneCheckNoteSecurity", "netId %d errType %d errCode %d errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        C50945qd0 qd02 = (C50945qd0) ((C47350c) uVar).f127056b.f127083a;
        if (i2 != 0) {
            Log.m105925i("MicroMsg.NetSceneCheckNoteSecurity", "NetSceneCheckNoteSecurity,errType:%d,fail", Integer.valueOf(i2));
            this.f148272e.onSceneEnd(i2, -1, str, this);
        } else if (qd02 == null || qd02.getBaseResponse() == null) {
            Log.m105924i("MicroMsg.NetSceneCheckNoteSecurity", "NetSceneCheckNoteSecurity,response == null,ok");
            this.f148272e.onSceneEnd(i2, 0, str, this);
        } else if (qd02.getBaseResponse().f135955d != 0) {
            Log.m105924i("MicroMsg.NetSceneCheckNoteSecurity", "NetSceneCheckNoteSecurity,baseresponse.ret != 0,ok");
            this.f148272e.onSceneEnd(i2, 0, str, this);
        } else if (qd02.f140244d > 0) {
            Log.m105924i("MicroMsg.NetSceneCheckNoteSecurity", "NetSceneCheckNoteSecurity,SecurityResult > 0,fail");
            this.f148272e.onSceneEnd(i2, -1, str, this);
        } else {
            Log.m105924i("MicroMsg.NetSceneCheckNoteSecurity", "NetSceneCheckNoteSecurity,SecurityResult = 0,fail");
            this.f148272e.onSceneEnd(i2, 0, str, this);
        }
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }
}
