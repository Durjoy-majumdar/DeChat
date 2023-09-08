package ht1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import gy3.C8480h;
import gy3.C87412m;
import it1.C9255j;
import java.util.List;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C47465a;
import sx3.C26236u;
import sx3.C64186f0;
import te3.C49529g81;
import te3.C49671h81;
import te3.C49712hj1;
import te3.C49842ig0;

/* renamed from: ht1.w5 */
public final class C46118w5 extends C9255j {

    /* renamed from: g */
    public C47350c f124278g;

    /* renamed from: h */
    public C11385n f124279h;

    /* renamed from: i */
    public String f124280i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46118w5(String str) {
        super((C49712hj1) null, 1, (C8480h) null);
        C87412m.m108594g(str, "qrUrl");
        C47350c.C47352b bVar = new C47350c.C47352b();
        C49529g81 g812 = new C49529g81();
        g812.f133923e = str;
        C49671h81 h812 = new C49671h81();
        bVar.f127066a = g812;
        bVar.f127067b = h812;
        bVar.f127069d = 7424;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderliveselectgo";
        this.f124278g = bVar.mo72403a();
        this.f124280i = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f124279h = nVar;
        return dispatch(gVar, this.f124278g, this);
    }

    public int getType() {
        return 7424;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        super.mo8516k1(i, i2, i3, str, uVar, bArr);
        C11385n nVar = this.f124279h;
        if (nVar != null) {
            C87412m.m108591d(nVar);
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: l1 */
    public List<FinderItem> mo10031l1(C114799u uVar) {
        FinderObject finderObject;
        C47350c cVar = this.f124278g;
        C49671h81 h812 = null;
        C47465a aVar = cVar != null ? cVar.f127056b.f127083a : null;
        if (aVar instanceof C49671h81) {
            h812 = (C49671h81) aVar;
        }
        return (h812 == null || (finderObject = h812.f134495f) == null) ? C64186f0.f181907d : C26236u.m33719b(FinderItem.Companion.mo79056a(finderObject, 0));
    }

    /* renamed from: m1 */
    public long mo10032m1() {
        C49842ig0 ig02;
        C47350c cVar = this.f124278g;
        C49529g81 g812 = null;
        C47465a aVar = cVar != null ? cVar.f127055a.f127080a : null;
        if (aVar instanceof C49529g81) {
            g812 = (C49529g81) aVar;
        }
        if (g812 == null || (ig02 = g812.f133922d) == null) {
            return 0;
        }
        return ig02.f135317i;
    }
}
