package nv0;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.util.WXWebReporter;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import qe3.C101125b1;
import te3.C49615gv1;
import te3.C49757hv1;

/* renamed from: nv0.e */
public class C47301e extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f126952d;

    /* renamed from: e */
    public final C47350c f126953e;

    /* renamed from: f */
    public final String f126954f;

    /* renamed from: g */
    public byte[] f126955g;

    public C47301e(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49615gv1();
        bVar.f127067b = new C49757hv1();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getbakchatkey";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        bVar.f127069d = 596;
        C47350c a = bVar.mo72403a();
        this.f126953e = a;
        C49615gv1 gv12 = (C49615gv1) a.f127055a.f127080a;
        gv12.f134299d = str;
        C101125b1.m132537a();
        gv12.f134300e = WXWebReporter.WXWEB_IDKEY_SWITCH_WEBCORE_BY_USERTYPE;
        this.f126954f = str;
        Log.m105925i("MicroMsg.NetSceneGetBakchatkey", "init id:%s, ver:0x%x", gv12.f134299d, Integer.valueOf(WXWebReporter.WXWEB_IDKEY_SWITCH_WEBCORE_BY_USERTYPE));
    }

    public void cancel() {
        super.cancel();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f126952d = nVar;
        return dispatch(gVar, this.f126953e, this);
    }

    public int getType() {
        return 596;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneGetBakchatkey", "errType %d,  errCode %d", Integer.valueOf(i2), Integer.valueOf(i3));
        if (i2 == 0 && i3 == 0) {
            byte[] bArr2 = ((C49757hv1) this.f126953e.f127056b.f127083a).f134896d.f140574f.f257327a;
            this.f126955g = bArr2;
            Object[] objArr = new Object[2];
            objArr[0] = this.f126954f;
            objArr[1] = Integer.valueOf(bArr2 == null ? 0 : bArr2.length);
            Log.m105925i("MicroMsg.NetSceneGetBakchatkey", "id:%s,  key len:%d", objArr);
            byte[] bArr3 = this.f126955g;
            if (bArr3 != null) {
                String str2 = "";
                for (int i4 = 0; i4 < bArr3.length; i4++) {
                    str2 = str2 + Integer.toHexString(bArr3[i4] & ExifInterface.MARKER) + " ";
                }
                Log.m105925i("MicroMsg.NetSceneGetBakchatkey", "dump bakchat: %s", str2);
            }
        }
        this.f126952d.onSceneEnd(i2, i3, str, this);
    }
}
