package eb0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49751hu;
import te3.C49896iu;
import yl0.C91483f;

/* renamed from: eb0.e4 */
public class C31458e4 extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f84178d;

    /* renamed from: e */
    public C11385n f84179e;

    /* renamed from: f */
    public int f84180f = 0;

    /* renamed from: g */
    public int f84181g = 0;

    /* renamed from: h */
    public int f84182h = 0;

    /* renamed from: i */
    public int f84183i = 0;

    public C31458e4(int i, String str, String str2, String str3, String str4, String str5) {
        C49751hu huVar = new C49751hu();
        huVar.f134875d = i;
        huVar.f134877f = str;
        huVar.f134879h = str2;
        huVar.f134878g = str3;
        huVar.f134883o = str4;
        huVar.f134882n = str5;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = huVar;
        bVar.f127067b = new C49896iu();
        bVar.f127068c = "/cgi-bin/micromsg-bin/checkmobilesimtype";
        bVar.f127069d = C91483f.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f84178d = a;
        a.f127059e = 1;
        Log.m105925i("MicroMsg.NetSceneGetMobileSIMType", "Check scene[%d] IP[%s] IMEI[%s] IMSI[%s] uuid[%s] adid[%s]", Integer.valueOf(i), huVar.f134877f, huVar.f134879h, huVar.f134878g, huVar.f134883o, huVar.f134882n);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f84179e = nVar;
        return dispatch(gVar, this.f84178d, this);
    }

    public int getType() {
        return C91483f.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneGetMobileSIMType", "summerdiz NetSceneGetMobileSIMType onGYNetEnd netId[%d], errType[%d], errCode[%d], errMsg[%s]", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C49896iu iuVar = (C49896iu) this.f84178d.f127056b.f127083a;
            this.f84180f = iuVar.f135664g;
            int i4 = iuVar.f135663f;
            this.f84181g = i4;
            this.f84182h = iuVar.f135661d;
            this.f84183i = iuVar.f135662e;
            Log.m105925i("MicroMsg.NetSceneGetMobileSIMType", "CheckMobileSIMTypeResp ProductType[%d] expiredTime[%d] flag[%d]", Integer.valueOf(i4), Integer.valueOf(iuVar.f135662e), Integer.valueOf(iuVar.f135664g));
        }
        this.f84179e.onSceneEnd(i2, i3, str, this);
    }
}
