package eb1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C89349b;
import tc2.C118418g;
import te3.C49406fc0;
import te3.C49541gc0;
import te3.C51018qv3;
import te3.lx4;

/* renamed from: eb1.n */
public class C45640n extends C45633a implements C1311n, C116765c {

    /* renamed from: d */
    public C11385n f123420d;

    /* renamed from: e */
    public C47350c f123421e;

    /* renamed from: f */
    public String f123422f = null;

    /* renamed from: g */
    public String f123423g = "";

    /* renamed from: h */
    public boolean f123424h = false;

    public C45640n(long j, String str, String str2, String str3, String str4, int i, float f, int i2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49406fc0();
        bVar.f127067b = new C49541gc0();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/usrmsg/faceidentify";
        bVar.f127069d = 1080;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f123421e = a;
        C49406fc0 fc02 = (C49406fc0) a.f127055a.f127080a;
        fc02.f133407d = str;
        fc02.f133408e = j;
        fc02.f133409f = str2;
        fc02.f133411h = str3;
        fc02.f133410g = str4;
        fc02.f133414n = i;
        fc02.f133415o = f;
        fc02.f133416p = i2;
        try {
            lx4 lx4 = new lx4();
            C51018qv3 qv32 = new C51018qv3();
            qv32.mo73350k(C118418g.INSTANCE.mo175821hd());
            lx4.f354117f = qv32;
            fc02.f133417q = new C89349b(lx4.toByteArray());
        } catch (Throwable unused) {
        }
        Log.m105925i("MicroMsg.NetSceneFaceVerifyFace", "NetSceneFacePicThirdVerifyFace, checkAliveType: %s  ,light:%f ,upload_video:%d  appid:%s  bioid:%s json_str:%s picture_cdn_id:%s cdnAesKey:%s uploadVideo:%s", Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2), str, Long.valueOf(j), str2, str3, str4, Integer.valueOf(i2));
    }

    /* renamed from: F */
    public String mo71155F() {
        return this.f123422f;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f123420d = nVar;
        return dispatch(gVar, this.f123421e, this);
    }

    public int getType() {
        return 1080;
    }

    /* renamed from: o0 */
    public boolean mo71156o0() {
        return this.f123424h;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneFaceVerifyFace", "alvinluo NetSceneFacePicThirdVerifyFace errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C49541gc0 gc02 = (C49541gc0) ((C47350c) uVar).f127056b.f127083a;
        Log.m105925i("MicroMsg.NetSceneFaceVerifyFace", "identity_id: %s canRetry:%b tip:%s bizName:%s", gc02.f133958d, Boolean.valueOf(gc02.f133959e), gc02.f133961g, gc02.f133960f);
        this.f123422f = gc02.f133958d;
        this.f123424h = gc02.f133959e;
        this.f123423g = gc02.f133961g;
        C11385n nVar = this.f123420d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
