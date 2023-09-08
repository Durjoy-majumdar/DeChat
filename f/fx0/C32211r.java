package fx0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import dx0.C31332a;
import f40.C86709a0;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49612gu1;
import te3.C49753hu1;
import te3.C50197l0;

/* renamed from: fx0.r */
public class C32211r extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f85617d;

    /* renamed from: e */
    public final C47350c f85618e;

    /* renamed from: f */
    public LinkedList<String> f85619f = new LinkedList<>();

    public C32211r() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49612gu1();
        bVar.f127067b = new C49753hu1();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getapplist";
        bVar.f127069d = 387;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f85618e = a;
        C49612gu1 gu12 = (C49612gu1) a.f127055a.f127080a;
        C86709a0.m107528h();
        Object e = C86709a0.m107535s().mo121142i().mo119684e(196610, (Object) null);
        Object[] objArr = new Object[2];
        objArr[0] = 196610;
        objArr[1] = e == null ? "null" : e.toString();
        Log.m105925i("MicroMsg.BrandService.BrandServiceApplication", "get config, key[%d], value[%s]", objArr);
        int nullAs = Util.nullAs((Integer) e, 0);
        gu12.f134274d = nullAs;
        Log.m105925i("MicroMsg.BrandService.NetSceneGetAppList", "info: request hash code %d", Integer.valueOf(nullAs));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f85617d = nVar;
        Log.m105924i("MicroMsg.BrandService.NetSceneGetAppList", "do scene");
        return dispatch(gVar, this.f85618e, this);
    }

    public int getType() {
        return 387;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105929w("MicroMsg.BrandService.NetSceneGetAppList", "on scene end code(%d, %d)", Integer.valueOf(i2), Integer.valueOf(i3));
        if (i2 == 0 && i3 == 0) {
            C49753hu1 hu12 = (C49753hu1) this.f85618e.f127056b.f127083a;
            Log.m105925i("MicroMsg.BrandService.NetSceneGetAppList", "ok, hash code is %d, count is %d", Integer.valueOf(hu12.f134888f), Integer.valueOf(hu12.f134886d));
            C31332a.m39374b(196610, Integer.valueOf(hu12.f134888f));
            Iterator<C50197l0> it = hu12.f134887e.iterator();
            while (it.hasNext()) {
                this.f85619f.add(it.next().f137114d);
            }
        }
        this.f85617d.onSceneEnd(i2, i3, str, this);
    }
}
