package qg1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import it1.C60628i;
import java.util.LinkedList;
import java.util.List;
import je1.C46523h2;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C47465a;
import pe3.C89349b;
import sk1.C63947a;
import te3.C49712hj1;
import te3.C49968ja1;
import te3.C50102ka1;

/* renamed from: qg1.g0 */
public final class C12222g0 extends C60628i {

    /* renamed from: g */
    public final String f35286g;

    /* renamed from: h */
    public int f35287h;

    /* renamed from: i */
    public C47350c f35288i;

    /* renamed from: j */
    public C11385n f35289j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12222g0(String str, String str2, C89349b bVar, C49712hj1 hj12) {
        super(hj12);
        C87412m.m108594g(str, "targetUsername");
        C87412m.m108594g(str2, "myUsername");
        this.f35286g = str;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = 5870;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/finderliveuserpage";
        C49968ja1 ja12 = new C49968ja1();
        ja12.f135967f = str2;
        ja12.f135966e = str;
        ja12.f135968g = bVar;
        ja12.f135965d = C46523h2.f125330a.mo71860b(5870, hj12);
        bVar2.f127066a = ja12;
        bVar2.f127067b = new C50102ka1();
        this.f35288i = bVar2.mo72403a();
        StringBuilder sb = new StringBuilder();
        sb.append(ja12.f135966e);
        sb.append(',');
        sb.append(ja12.f135967f);
        sb.append(',');
        sb.append(ja12.f135968g == null);
        Log.m105924i("NetSceneFinderLiveUserPage", sb.toString());
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f35289j = nVar;
        return dispatch(gVar, this.f35288i, this);
    }

    public int getType() {
        return 5870;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("NetSceneFinderLiveUserPage", "onCgiEnd: errType=" + i2 + ", errCode=" + i3 + ", errMsg=" + str + ",resp list:" + C63947a.f181274a.mo88717b(mo11954l1()));
        C11385n nVar = this.f35289j;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: l1 */
    public final List<FinderObject> mo11954l1() {
        C47465a aVar = this.f35288i.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveUserPageResponse");
        LinkedList<FinderObject> linkedList = ((C50102ka1) aVar).f136632d;
        C87412m.m108593f(linkedList, "commReqResp.responseProt…serPageResponse).`object`");
        return linkedList;
    }
}
