package o71;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.lang.ref.WeakReference;
import m71.C46947a;
import m71.C46948b;
import pe3.C47465a;
import te3.C52187yz;
import te3.C52328zz;

/* renamed from: o71.a */
public class C47332a extends C46947a<C52187yz, C52328zz> {

    /* renamed from: f */
    public String f127021f;

    /* renamed from: g */
    public String f127022g;

    /* renamed from: h */
    public String f127023h;

    /* renamed from: i */
    public String f127024i;

    /* renamed from: j */
    public WeakReference<C46948b<C47332a>> f127025j;

    public C47332a(String str, String str2, String str3, String str4, C46948b<C47332a> bVar) {
        this.f127021f = Util.nullAsNil(str);
        this.f127022g = Util.nullAsNil(str2);
        this.f127023h = Util.nullAsNil(str3);
        this.f127024i = Util.nullAsNil(str4);
        this.f127025j = new WeakReference<>(bVar);
    }

    public int getType() {
        return 1799;
    }

    public String getUri() {
        return "/cgi-bin/mmoc-bin/hardware/mydevice/connectedrouter";
    }

    /* renamed from: k1 */
    public C47465a mo72131k1() {
        return new C52187yz();
    }

    /* renamed from: l1 */
    public C47465a mo72132l1() {
        return new C52328zz();
    }

    /* renamed from: m1 */
    public void mo72133m1(C47465a aVar) {
        C52187yz yzVar = (C52187yz) aVar;
        yzVar.f145581d = this.f127021f;
        yzVar.f145582e = this.f127022g;
        yzVar.f145583f = this.f127023h;
        yzVar.f145584g = this.f127024i;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.NetSceneConnectedRouter", "ap: connected router end. errType: %d, errCode: %d, errMsg: %s, resp: %s", Integer.valueOf(i2), Integer.valueOf(i3), str, uVar.toString());
        super.onGYNetEnd(i, i2, i3, str, uVar, bArr);
        C46948b bVar = this.f127025j.get();
        if (bVar != null) {
            bVar.mo64355a(i2, i3, str, this);
        }
    }
}
