package qg2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49470fu;
import te3.C49610gu;

/* renamed from: qg2.o */
public class C47838o extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f128416d;

    /* renamed from: e */
    public C47350c f128417e;

    /* renamed from: f */
    public C47839a f128418f;

    /* renamed from: qg2.o$a */
    public interface C47839a {
        /* renamed from: a */
        void mo72581a(String str, int i, int i2);
    }

    public C47838o(String str, String str2, String str3, int i, C47839a aVar) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49470fu();
        bVar.f127067b = new C49610gu();
        bVar.f127068c = "/cgi-bin/micromsg-bin/checkmd5";
        bVar.f127069d = 939;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f128417e = a;
        C49470fu fuVar = (C49470fu) a.f127055a.f127080a;
        fuVar.f133681d = str;
        fuVar.f133682e = str2;
        fuVar.f133683f = str3;
        fuVar.f133684g = i;
        this.f128418f = aVar;
        Log.m105925i("MicroMsg.NetSceneCheckMd5", "summersafecdn NetSceneCheckMd5 fileid[%s], md5[%s], newmd5[%s], crc[%d], stack[%s]", str, str2, str3, Integer.valueOf(i), Util.getStack());
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f128416d = nVar;
        return dispatch(gVar, this.f128417e, this);
    }

    public int getType() {
        return 939;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneCheckMd5", "summersafecdn onGYNetEnd [%d, %d, %s]", Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f128416d.onSceneEnd(i2, i3, str, this);
        C47839a aVar = this.f128418f;
        if (aVar != null) {
            String str2 = "";
            if (i2 == 0 && i3 == 0) {
                C49610gu guVar = (C49610gu) ((C47350c) uVar).f127056b.f127083a;
                if (guVar != null) {
                    str2 = guVar.f134272d;
                }
                aVar.mo72581a(str2, i2, i3);
                return;
            }
            aVar.mo72581a(str2, i2, i3);
        }
    }
}
