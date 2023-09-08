package rb0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import java.io.IOException;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import pe3.C89349b;
import te3.C49708hi;
import te3.C49848ii;
import te3.dy4;

/* renamed from: rb0.k0 */
public class C47985k0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f128697d;

    /* renamed from: e */
    public C47986a f128698e;

    /* renamed from: f */
    public C47350c f128699f;

    /* renamed from: rb0.k0$a */
    public static abstract class C47986a<T extends C47465a> implements C11385n {

        /* renamed from: d */
        public final T f128700d;

        public C47986a(T t) {
            this.f128700d = t;
        }

        public final void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            if (yVar != null && (yVar instanceof C47985k0)) {
                try {
                    this.f128700d.parseFrom(((C49848ii) ((C47350c) yVar.getReqResp()).f127056b.f127083a).f135351e.f257327a);
                } catch (Throwable unused) {
                }
                C48006u uVar = (C48006u) this;
                dy4 dy4 = (dy4) this.f128700d;
                if (dy4.f132566d != null) {
                    try {
                        MultiProcessMMKV.getMMKV("brandService", 1).encode(C48008v.m53370a(uVar.f128765e, 2, (String) null), dy4.f132566d.toByteArray());
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
    }

    public C47985k0(String str, int i, C47465a aVar, C47986a aVar2) {
        Log.m105925i("MicroMsg.NetSceneBiztransfer", "NetSceneBiztransfer username (%s) cmdid (%s)", str, Integer.valueOf(i));
        this.f128698e = aVar2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 1915;
        bVar.f127068c = "/cgi-bin/mmocbiz-bin-new/biztransfer";
        bVar.f127066a = new C49708hi();
        bVar.f127067b = new C49848ii();
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f128699f = a;
        C49708hi hiVar = (C49708hi) a.f127055a.f127080a;
        hiVar.f134660d = str;
        hiVar.f134661e = i;
        if (aVar != null) {
            try {
                hiVar.f134662f = C89349b.m111674a(aVar.toByteArray());
            } catch (IOException e) {
                throw new RuntimeException("bad cgi request", e);
            }
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f128697d = nVar;
        return dispatch(gVar, this.f128699f, this);
    }

    public int getType() {
        return 1915;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneBiztransfer", "NetSceneBiztransfer onGYNetEnd netId %d, errType %d, errCode %d, errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        C47986a aVar = this.f128698e;
        if (aVar != null) {
            aVar.onSceneEnd(i2, i3, str, this);
        }
        C11385n nVar = this.f128697d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
