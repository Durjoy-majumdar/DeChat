package j61;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30790w2;
import di3.C86312j;
import java.io.IOException;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p441aq.C92054g;
import te3.C51618uz1;
import te3.C51759vz1;
import wh3.C38141p;
import wh3.C38142q;

/* renamed from: j61.r */
public class C33523r extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f90768d;

    /* renamed from: e */
    public final C47350c f90769e;

    /* renamed from: f */
    public String f90770f;

    /* renamed from: g */
    public int f90771g;

    public C33523r(String str, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51618uz1();
        bVar.f127067b = new C51759vz1();
        bVar.f127068c = "/cgi-bin/micromsg-bin/mmgetemotionreward";
        bVar.f127069d = 822;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f90769e = bVar.mo72403a();
        this.f90770f = str;
        this.f90771g = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f90768d = nVar;
        C47350c cVar = this.f90769e;
        C51618uz1 uz12 = (C51618uz1) cVar.f127055a.f127080a;
        uz12.f143199d = this.f90770f;
        uz12.f143200e = this.f90771g;
        return dispatch(gVar, cVar, this);
    }

    public int getType() {
        return 822;
    }

    /* renamed from: j1 */
    public C51759vz1 mo59186j1() {
        return (C51759vz1) this.f90769e.f127056b.f127083a;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C38142q qVar;
        Class cls = C92054g.class;
        Log.m105925i("MicroMsg.emoji.NetSceneGetEmotionReward", "errType:%d, errCode:%d", Integer.valueOf(i2), Integer.valueOf(i3));
        if (i2 == 0 && i3 == 0) {
            if (this.f90771g == 0) {
                ((C92054g) C86312j.m106911c(cls)).getClass();
                C30790w2 h = C30790w2.m39221h();
                synchronized (h.f82769a) {
                    qVar = h.f82777i;
                }
                String str2 = this.f90770f;
                C51759vz1 j1 = mo59186j1();
                qVar.getClass();
                if (Util.isNullOrNil(str2) || j1 == null) {
                    Log.m105928w("MicroMsg.emoji.EmotionRewardInfoStorage", "saveEmotionRewardResponseWithPID failed. productId or response is null.");
                } else {
                    try {
                        C38141p pVar = new C38141p();
                        pVar.field_productID = str2;
                        pVar.field_content = j1.toByteArray();
                        if (qVar.f100789d.replace("EmotionRewardInfo", "productID", pVar.convertTo()) > 0) {
                            Log.m105925i("MicroMsg.emoji.EmotionRewardInfoStorage", "saveEmotionRewardResponseWithPID success. ProductId:%s", str2);
                        } else {
                            Log.m105925i("MicroMsg.emoji.EmotionRewardInfoStorage", "saveEmotionRewardResponseWithPID failed. ProductId:%s", str2);
                        }
                    } catch (IOException e) {
                        Log.m105921e("MicroMsg.emoji.EmotionRewardInfoStorage", "saveEmotionRewardResponseWithPID exception:%s", Util.stackTraceToString(e));
                    }
                }
            }
            if (mo59186j1() == null || mo59186j1().f143785g == null) {
                Log.m105924i("MicroMsg.emoji.NetSceneGetEmotionReward", "getEmotionRewardRespone is null. so i think no such product reward information");
                ((C92054g) C86312j.m106911c(cls)).getClass();
                C30790w2.m39221h().mo57716c().mo61542qq(this.f90770f, 256);
                ((C92054g) C86312j.m106911c(cls)).yx0().mo59031e(this.f90770f, 256);
            } else {
                ((C92054g) C86312j.m106911c(cls)).getClass();
                C30790w2.m39221h().mo57716c().mo61542qq(this.f90770f, mo59186j1().f143785g.f137252o);
                ((C92054g) C86312j.m106911c(cls)).yx0().mo59031e(this.f90770f, mo59186j1().f143785g.f137252o);
            }
        } else if (i3 == 1) {
            ((C92054g) C86312j.m106911c(cls)).getClass();
            C30790w2.m39221h().mo57716c().mo61542qq(this.f90770f, 256);
            ((C92054g) C86312j.m106911c(cls)).yx0().mo59031e(this.f90770f, 256);
        }
        this.f90768d.onSceneEnd(i2, i3, str, this);
    }
}
