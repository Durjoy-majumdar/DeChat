package je0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import g62.C75880o;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C51505u73;
import te3.C51659v73;

/* renamed from: je0.s */
public class C46496s extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f125265d;

    /* renamed from: e */
    public final C47350c f125266e;

    /* renamed from: f */
    public int f125267f;

    /* renamed from: g */
    public C75880o f125268g;

    public C46496s(C75880o oVar) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51505u73();
        bVar.f127067b = new C51659v73();
        bVar.f127068c = "/cgi-bin/micromsg-bin/openimoplog";
        bVar.f127069d = 806;
        C47350c a = bVar.mo72403a();
        this.f125266e = a;
        int i = oVar.f222532f;
        this.f125267f = i;
        this.f125268g = oVar;
        Log.m105925i("MicroMsg.Openim.NetSceneOpenIMOPLog", "type: %d", Integer.valueOf(i));
        C51505u73 u732 = (C51505u73) a.f127055a.f127080a;
        u732.f142653d = this.f125267f;
        u732.f142654e = new C89349b(oVar.mo106149a());
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125265d = nVar;
        return dispatch(gVar, this.f125266e, this);
    }

    public int getType() {
        return 806;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.Openim.NetSceneOpenIMOPLog", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, opType:%d", Integer.valueOf(i2), Integer.valueOf(i3), str, Integer.valueOf(this.f125267f));
        this.f125265d.onSceneEnd(i2, i3, str, this);
    }
}
