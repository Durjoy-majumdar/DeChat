package pd0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49189dt3;
import te3.C49331et3;
import te3.C51163rv3;

/* renamed from: pd0.a */
public class C35454a extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f94867d;

    /* renamed from: e */
    public C47350c f94868e;

    /* renamed from: f */
    public C49189dt3 f94869f;

    public C35454a(int i, LinkedList<C51163rv3> linkedList, C51163rv3 rv32, C51163rv3 rv33) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49189dt3();
        bVar.f127067b = new C49331et3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/reportvoiceresult";
        bVar.f127069d = 228;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f94868e = a;
        C49189dt3 dt32 = (C49189dt3) a.f127055a.f127080a;
        this.f94869f = dt32;
        dt32.f132524d = i;
        dt32.f132525e = linkedList;
        dt32.f132526f = rv32;
        dt32.f132527g = rv33;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f94867d = nVar;
        return dispatch(gVar, this.f94868e, this);
    }

    public int getType() {
        return 228;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneNewVoiceInputReport", "onGYNetEnd errtype:" + i2 + " errcode:" + i3 + " errMsg:" + str);
        this.f94867d.onSceneEnd(i2, i3, str, this);
    }
}
