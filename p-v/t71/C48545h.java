package t71;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.exdevice.model.C41166r1;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;
import m71.C46947a;
import m71.C46948b;
import pe3.C47465a;
import te3.C51192s20;
import te3.C51332t20;

/* renamed from: t71.h */
public class C48545h extends C46947a<C51192s20, C51332t20> {

    /* renamed from: f */
    public String f129829f;

    /* renamed from: g */
    public final WeakReference<C46948b<C48545h>> f129830g;

    public C48545h(String str, C46948b<C48545h> bVar) {
        this.f129829f = str;
        this.f129830g = new WeakReference<>(bVar);
    }

    public int getType() {
        return 1792;
    }

    public String getUri() {
        return "/cgi-bin/mmoc-bin/hardware/delfollow";
    }

    /* renamed from: k1 */
    public C47465a mo72131k1() {
        return new C51192s20();
    }

    /* renamed from: l1 */
    public C47465a mo72132l1() {
        return new C51332t20();
    }

    /* renamed from: m1 */
    public void mo72133m1(C47465a aVar) {
        ((C51192s20) aVar).f141280d = this.f129829f;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.NetSceneDelFollow", "hy: del follow end. errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        super.onGYNetEnd(i, i2, i3, str, uVar, bArr);
        if (i2 == 0 && i3 == 0) {
            C41166r1.Ax0().mo61485Lo(this.f129829f);
        }
        C46948b bVar = this.f129830g.get();
        if (bVar != null) {
            bVar.mo64355a(i2, i3, str, this);
        }
    }
}
