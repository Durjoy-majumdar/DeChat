package je1;

import bo1.C0344g;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import dp1.C58417y0;
import gy3.C87412m;
import it1.C9255j;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C47465a;
import pe3.C89349b;
import rx3.C13604l;
import sx3.C26236u;
import sx3.C36907w;
import te3.C49712hj1;
import te3.C49842ig0;
import te3.C50141kk1;
import te3.C50159kp0;
import te3.C50294lp0;
import te3.C51974xh1;

/* renamed from: je1.q3 */
public final class C9368q3 extends C9255j {

    /* renamed from: g */
    public C47350c f29249g;

    /* renamed from: h */
    public C11385n f29250h;

    /* renamed from: i */
    public final String f29251i = "Finder.NetSceneFinderGetRelatedList";

    /* renamed from: j */
    public int f29252j;

    /* renamed from: n */
    public String f29253n = "";

    /* renamed from: o */
    public final int f29254o;

    /* renamed from: p */
    public String f29255p = "";

    /* renamed from: q */
    public int f29256q;

    /* renamed from: r */
    public float f29257r;

    /* renamed from: s */
    public float f29258s;

    /* renamed from: t */
    public C50141kk1 f29259t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9368q3(int i, C89349b bVar, int i2, float f, float f2, C50141kk1 kk12, C49712hj1 hj12) {
        super(hj12);
        C87412m.m108594g(kk12, "sectionInfo");
        this.f29254o = i;
        this.f29256q = i2;
        this.f29257r = f;
        this.f29258s = f2;
        this.f29259t = kk12;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = 3688;
        C50159kp0 kp02 = new C50159kp0();
        kp02.f136937f = 0;
        kp02.f136941j = this.f29253n;
        kp02.f136938g = i;
        kp02.f136939h = this.f29257r;
        kp02.f136940i = this.f29258s;
        kp02.f136936e = bVar;
        C46523h2 h2Var = C46523h2.f125330a;
        C49842ig0 b = h2Var.mo71860b(3688, this.f172736d);
        kp02.f136935d = b;
        int i3 = this.f29256q;
        kp02.f136943o = i3;
        kp02.f136945q = this.f29259t;
        h2Var.mo71865g(b, C26236u.m33719b(new C13604l(Integer.valueOf(i3), 0L)), (C49712hj1) null);
        bVar2.f127066a = kp02;
        bVar2.f127067b = new C50294lp0();
        bVar2.f127068c = "/cgi-bin/micromsg-bin/findergetrelatedlist";
        this.f29249g = bVar2.mo72403a();
        Log.m105924i("Finder.NetSceneFinderGetRelatedList", "NetSceneFinderGetRelatedList feedId " + 0 + " tabType " + i + " category " + this.f29255p + " lastBuffer " + bVar);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f29250h = nVar;
        C47350c cVar = this.f29249g;
        if (cVar != null) {
            return dispatch(gVar, cVar, this);
        }
        C87412m.m108603p("rr");
        throw null;
    }

    public int getType() {
        return 3688;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        super.mo8516k1(i, i2, i3, str, uVar, bArr);
        String str2 = this.f29251i;
        Log.m105924i(str2, "errType " + i2 + ", errCode " + i3 + ", errMsg " + str);
        if (i2 == 0 && i3 == 0) {
            String str3 = this.f29251i;
            Log.m105924i(str3, "feedId " + 0 + " tabType=" + this.f29254o + ", " + C9311g2.f29093a.mo10062a(mo10093n1()));
            for (FinderObject dv : mo10093n1()) {
                ((C58417y0) C86312j.m106911c(C58417y0.class)).mo83329dv(dv, this.f172736d);
            }
            C47350c cVar = this.f29249g;
            if (cVar != null) {
                C47465a aVar = cVar.f127056b.f127083a;
                if (aVar instanceof C50294lp0) {
                    C0344g gVar = C0344g.f929a;
                    C50294lp0 lp02 = (C50294lp0) aVar;
                    C51974xh1 xh12 = lp02.f137564h;
                    LinkedList<FinderObject> linkedList = lp02.f137560d;
                    C87412m.m108593f(linkedList, "resp.`object`");
                    gVar.mo386b(xh12, linkedList, 3688);
                }
            } else {
                C87412m.m108603p("rr");
                throw null;
            }
        }
        C11385n nVar = this.f29250h;
        if (nVar != null) {
            C87412m.m108591d(nVar);
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: l1 */
    public List<FinderItem> mo10031l1(C114799u uVar) {
        C47350c cVar = this.f29249g;
        if (cVar != null) {
            C47465a aVar = cVar.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetRelatedListResp");
            LinkedList<FinderObject> linkedList = ((C50294lp0) aVar).f137560d;
            C87412m.m108593f(linkedList, "resp.`object`");
            ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
            for (FinderObject finderObject : linkedList) {
                FinderItem.C56324a aVar2 = FinderItem.Companion;
                C87412m.m108593f(finderObject, LocaleUtil.ITALIAN);
                arrayList.add(aVar2.mo79056a(finderObject, 0));
            }
            return arrayList;
        }
        C87412m.m108603p("rr");
        throw null;
    }

    /* renamed from: m1 */
    public long mo10032m1() {
        C47350c cVar = this.f29249g;
        if (cVar != null) {
            C47465a aVar = cVar.f127055a.f127080a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetRelatedListReq");
            C49842ig0 ig02 = ((C50159kp0) aVar).f136935d;
            if (ig02 != null) {
                return ig02.f135317i;
            }
            return 0;
        }
        C87412m.m108603p("rr");
        throw null;
    }

    /* renamed from: n1 */
    public final LinkedList<FinderObject> mo10093n1() {
        C47350c cVar = this.f29249g;
        if (cVar != null) {
            C47465a aVar = cVar.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetRelatedListResp");
            LinkedList<FinderObject> linkedList = ((C50294lp0) aVar).f137560d;
            return linkedList == null ? new LinkedList<>() : linkedList;
        }
        C87412m.m108603p("rr");
        throw null;
    }
}
