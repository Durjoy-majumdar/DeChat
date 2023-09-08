package eb1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.common.TMAssistantDownloadSDKErrorCode;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C89349b;
import te3.C101852uv1;
import te3.C101859vv1;

/* renamed from: eb1.w */
public class C97635w extends C45633a implements C1311n, C116764b {

    /* renamed from: d */
    public C11385n f286407d;

    /* renamed from: e */
    public C47350c f286408e;

    /* renamed from: f */
    public long f286409f = -1;

    /* renamed from: g */
    public float f286410g = 0.5f;

    /* renamed from: h */
    public byte[] f286411h = null;

    /* renamed from: i */
    public byte[] f286412i = null;

    public C97635w(int i, int i2, String str, String str2, byte[] bArr) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C101852uv1();
        bVar.f127067b = new C101859vv1();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getbioconfig";
        bVar.f127069d = TMAssistantDownloadSDKErrorCode.DownloadSDKErrorCode_CLIENT_PROTOCOL_EXCEPTION;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f286408e = a;
        C101852uv1 uv12 = (C101852uv1) a.f127055a.f127080a;
        uv12.f299636d = 1;
        uv12.f299637e = i;
        uv12.f299640h = i2;
        uv12.f299641i = str;
        uv12.f299642j = str2;
        uv12.f299643n = C89349b.m111674a(bArr);
    }

    /* renamed from: G */
    public byte[] mo136896G() {
        return this.f286412i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f286407d = nVar;
        return dispatch(gVar, this.f286408e, this);
    }

    public int getType() {
        return TMAssistantDownloadSDKErrorCode.DownloadSDKErrorCode_CLIENT_PROTOCOL_EXCEPTION;
    }

    /* renamed from: h0 */
    public float mo136897h0() {
        float f = this.f286410g;
        if (f <= 0.0f || f > 1.0f) {
            this.f286410g = 0.5f;
        }
        return this.f286410g;
    }

    /* renamed from: l */
    public byte[] mo136898l() {
        return this.f286411h;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C101859vv1 vv12 = (C101859vv1) ((C47350c) uVar).f127056b.f127083a;
        if (i2 == 0 && i3 == 0) {
            long j = vv12.f299684d;
            this.f286409f = j;
            C89349b bVar = vv12.f299685e;
            if (bVar != null) {
                this.f286411h = bVar.f257327a;
            }
            this.f286410g = vv12.f299689i;
            C89349b bVar2 = vv12.f299688h;
            if (bVar2 != null) {
                this.f286412i = bVar2.f257327a;
            }
            Log.m105925i("MicroMsg.NetSceneGetBioConfig", "carson logic bioId:%s Config is:%s ratio:%s", Long.valueOf(j), this.f286411h, Float.valueOf(this.f286410g));
        }
        C11385n nVar = this.f286407d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: r0 */
    public long mo136899r0() {
        return this.f286409f;
    }
}
