package fx0;

import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p196ln.C76706g;
import sf0.C48374j0;
import te3.C49134de2;
import te3.C49273ee2;
import te3.C49629gy3;
import te3.C51577uo3;
import te3.C51720vo3;

/* renamed from: fx0.s */
public class C45840s extends C117747y implements C1311n {

    /* renamed from: f */
    public static long f123771f;

    /* renamed from: d */
    public C11385n f123772d;

    /* renamed from: e */
    public C47350c f123773e;

    /* renamed from: j1 */
    public static LinkedList<C51577uo3> m51139j1() {
        try {
            byte[] O = C86013q1.m106433O(C86709a0.m107535s().f251806d + "search_biz_recommend", 0, Integer.MAX_VALUE);
            if (O != null) {
                C51720vo3 vo32 = new C51720vo3();
                vo32.parseFrom(O);
                Log.m105919d("MicroMsg.BrandService.NetSceneGroupRecommendBiz", "GroupCount2: %d", Integer.valueOf(vo32.f143604d));
                return vo32.f143605e;
            }
        } catch (Exception e) {
            Log.m105918d("MicroMsg.BrandService.NetSceneGroupRecommendBiz", e.getMessage());
            Log.printErrStackTrace("MicroMsg.BrandService.NetSceneGroupRecommendBiz", e, "", new Object[0]);
        }
        return new LinkedList<>();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        f123771f = System.currentTimeMillis();
        this.f123772d = nVar;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49134de2();
        bVar.f127067b = new C49273ee2();
        bVar.f127068c = "/cgi-bin/micromsg-bin/grouprecommendbiz";
        bVar.f127069d = 456;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f123773e = a;
        return dispatch(gVar, a, this);
    }

    public int getType() {
        return 456;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.BrandService.NetSceneGroupRecommendBiz", "onGYNetEnd errtype:" + i2 + " errcode:" + i3 + " errMsg:" + str);
        if (i2 == 0 && i3 == 0) {
            C49273ee2 ee22 = (C49273ee2) this.f123773e.f127056b.f127083a;
            int i4 = ee22.f132886d.f143604d;
            if (i4 > 0) {
                Log.m105919d("MicroMsg.BrandService.NetSceneGroupRecommendBiz", "GroupCount, %d", Integer.valueOf(i4));
                try {
                    byte[] byteArray = ee22.f132886d.toByteArray();
                    C86013q1.m106437S(C86709a0.m107535s().f251806d + "search_biz_recommend", byteArray);
                    Iterator<C51577uo3> it = ee22.f132886d.f143605e.iterator();
                    while (it.hasNext()) {
                        Iterator<C49629gy3> it4 = it.next().f142988f.iterator();
                        while (it4.hasNext()) {
                            C49629gy3 next = it4.next();
                            C68097n nVar = new C68097n();
                            nVar.f195728a = C48374j0.m53718g(next.f134351d);
                            nVar.f195732e = next.f134366v;
                            nVar.f195731d = next.f134367w;
                            nVar.f195736i = -1;
                            nVar.f195729b = 3;
                            nVar.f195733f = 1;
                            ((C68098o) ((C76706g) C86312j.m106911c(C76706g.class)).mo106832eg()).mo93608Yt(nVar);
                        }
                    }
                } catch (IOException e) {
                    Log.m105918d("MicroMsg.BrandService.NetSceneGroupRecommendBiz", e.getMessage());
                    Log.printErrStackTrace("MicroMsg.BrandService.NetSceneGroupRecommendBiz", e, "", new Object[0]);
                }
            } else {
                C86013q1.m106447h(C86709a0.m107535s().f251806d + "search_biz_recommend");
            }
        }
        this.f123772d.onSceneEnd(i2, i3, str, this);
    }
}
