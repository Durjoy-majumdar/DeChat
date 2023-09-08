package ob0;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C116746l3;
import eb1.C45643q;
import eb1.C45645r;
import f40.C86709a0;
import te3.C49227e33;
import te3.C49510g33;
import te3.C50270lj;
import te3.C52114yg2;

/* renamed from: ob0.z */
public abstract class C47357z extends C117747y implements C1311n {

    /* renamed from: d */
    public int f127091d = 3;

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4 = i2;
        int i5 = i3;
        C114799u uVar2 = uVar;
        int i6 = 0;
        if (i4 == 4 && i5 == -301) {
            Log.m105925i("MicroMsg.NetSceneIDCRedirectBase", "alvinluo NetScene pre process MM_ERR_IDC_REDIRECT redirectCount: %d", Integer.valueOf(this.f127091d));
            if (uVar2 != null) {
                Log.m105924i("MicroMsg.NetSceneIDCRedirectBase", "update idc info");
                C45645r rVar = (C45645r) this;
                C49510g33 k1 = rVar.mo71158k1(uVar2);
                C52114yg2 yg22 = null;
                C50270lj ljVar = k1 != null ? k1.f133828f : null;
                C49510g33 k15 = rVar.mo71158k1(uVar2);
                C49227e33 e332 = k15 != null ? k15.f133827e : null;
                C49510g33 k16 = rVar.mo71158k1(uVar2);
                if (k16 != null) {
                    yg22 = k16.f133826d;
                }
                C49510g33 k17 = rVar.mo71158k1(uVar2);
                if (k17 != null) {
                    i6 = k17.f133829g;
                }
                C116746l3.m164676c(true, ljVar, e332, yg22, true, i6);
            }
            int i7 = this.f127091d - 1;
            this.f127091d = i7;
            if (i7 <= 0) {
                C45645r rVar2 = (C45645r) this;
                C11385n nVar = rVar2.f123434e;
                if (nVar != null) {
                    nVar.onSceneEnd(3, -1, "", rVar2);
                    return;
                }
                return;
            }
            Log.m105918d("MicroMsg.NetSceneIDCRedirectBase", "redirect IDC");
            doScene(dispatcher(), ((C45645r) this).f123434e);
            return;
        }
        C45645r rVar3 = (C45645r) this;
        Log.m105925i("MicroMsg.NetSceneFaceRsaBase", "hy: errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i4 == 4 && i5 == -102) {
            int i8 = uVar.getReqObj().getRsaInfo().f296014c;
            Log.m105919d("MicroMsg.NetSceneFaceRsaBase", "hy: summerauth auth MM_ERR_CERT_EXPIRED  getcert now  old ver:%d", Integer.valueOf(i8));
            C86709a0.m107525e().postToWorker(new C45643q(rVar3, i8));
            return;
        }
        rVar3.mo71159l1(i, i2, i3, str, uVar, bArr);
    }
}
