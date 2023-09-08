package rp0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C90423kk2;
import te3.w55;

/* renamed from: rp0.g */
public class C90079g extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f258742d;

    /* renamed from: e */
    public C11385n f258743e;

    /* renamed from: f */
    public C90080a<C90079g> f258744f;

    /* renamed from: rp0.g$a */
    public interface C90080a<T extends C117747y> {
        /* renamed from: a */
        void mo114559a(int i, int i2, String str, T t);
    }

    public C90079g(String str, String str2, String str3, int i, int i2, int i3, int i4, boolean z, String str4, int i5, boolean z2) {
        Log.m105925i("MicroMsg.webview.NetSceneJSOperateWxData", "<init> hash[%d] appId [%s], data [%s], grantScope [%s], versionType [%d], opt [%d], extScene [%d]  sessionId [%s]  avatarOpt [%d]", Integer.valueOf(hashCode()), str, str2, str3, Integer.valueOf(i), Integer.valueOf(i3), Integer.valueOf(i4), str4, Integer.valueOf(i5));
        C47350c a = mo124367j1(z).mo72403a();
        this.f258742d = a;
        C90423kk2 kk22 = (C90423kk2) a.f127055a.f127080a;
        kk22.f259643d = str;
        kk22.f259644e = new C89349b(str2.getBytes() == null ? new byte[0] : str2.getBytes());
        kk22.f259645f = str3;
        kk22.f259647h = i;
        kk22.f259646g = i3;
        kk22.f259649j = i2;
        kk22.f259651o = i5;
        kk22.f259650n = str4;
        kk22.f259652p = z2;
        if (i4 > 0) {
            w55 w55 = new w55();
            kk22.f259648i = w55;
            w55.f143869e = i4;
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105925i("MicroMsg.webview.NetSceneJSOperateWxData", "doScene hash=%d, funcid=%d", Integer.valueOf(hashCode()), Integer.valueOf(this.f258742d.f127058d));
        this.f258743e = nVar;
        return dispatch(gVar, this.f258742d, this);
    }

    public int getType() {
        return 1133;
    }

    /* renamed from: j1 */
    public C47350c.C47352b mo124367j1(boolean z) {
        return C90081h.m112683a(z);
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.webview.NetSceneJSOperateWxData", "onGYNetEnd, hash[%d] errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(hashCode()), Integer.valueOf(i2), Integer.valueOf(i3), str);
        C11385n nVar = this.f258743e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
        C90080a<C90079g> aVar = this.f258744f;
        if (aVar != null) {
            aVar.mo114559a(i2, i3, str, this);
        }
    }
}
