package ld3;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import fd3.C97870j;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C101870ya3;
import te3.C49966ja;
import te3.C51948xa3;
import te3.C64798wa3;

/* renamed from: ld3.b */
public class C61276b extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f174382d;

    /* renamed from: e */
    public C47350c f174383e;

    /* renamed from: f */
    public C61277a f174384f;

    /* renamed from: ld3.b$a */
    public interface C61277a {
    }

    public C61276b(String str, C101870ya3 ya32, int i, byte[] bArr, C61277a aVar) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C64798wa3();
        bVar.f127067b = new C51948xa3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/parallelupload";
        bVar.f127069d = 3784;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f174383e = a;
        C64798wa3 wa32 = (C64798wa3) a.f127055a.f127080a;
        wa32.f186069d = str;
        wa32.f186070e = ya32;
        wa32.f186071f = i;
        wa32.f186072g = new C89349b(bArr, 0, bArr.length);
        this.f174384f = aVar;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f174382d = nVar;
        return dispatch(gVar, this.f174383e, this);
    }

    public int getType() {
        return 3784;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.NetSceneCGIParallelUpload", "summerbig onGYNetEnd [%d, %d, %s]", Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f174382d.onSceneEnd(i2, i3, str, this);
        if (4 == i2 || (i2 == 0 && i3 == 0)) {
            C51948xa3 xa32 = (C51948xa3) ((C47350c) uVar).f127056b.f127083a;
            C49966ja baseResponse = xa32.getBaseResponse();
            if (baseResponse == null || baseResponse.f135955d != 0) {
                C61277a aVar = this.f174384f;
                if (baseResponse != null) {
                    i3 = baseResponse.f135955d;
                }
                ((C97870j.C97871a) aVar).mo137198a(false, i3, (C51948xa3) null);
                return;
            }
            ((C97870j.C97871a) this.f174384f).mo137198a(true, 0, xa32);
            return;
        }
        Log.m105920e("MicroMsg.NetSceneCGIParallelUpload", "onSceneEnd errType = " + i2 + ", errCode = " + i3 + ", errMsg:" + str);
        ((C97870j.C97871a) this.f174384f).mo137198a(false, i3, (C51948xa3) null);
    }
}
