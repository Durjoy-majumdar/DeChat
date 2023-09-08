package je1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60628i;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C47465a;
import pe3.C89349b;
import te3.C49712hj1;
import te3.C51422to0;
import te3.C51574uo0;

/* renamed from: je1.p3 */
public final class C9364p3 extends C60628i {

    /* renamed from: g */
    public final String f29240g;

    /* renamed from: h */
    public C47350c f29241h;

    /* renamed from: i */
    public C11385n f29242i;

    /* renamed from: j */
    public final String f29243j;

    /* renamed from: n */
    public int f29244n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9364p3(String str, C89349b bVar, int i) {
        super((C49712hj1) null, 1, (C8480h) null);
        C87412m.m108594g(str, "username");
        this.f29240g = str;
        this.f29243j = "Finder.NetSceneFinderGetMentionedFeed";
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = 3810;
        C51422to0 to02 = new C51422to0();
        to02.f142302e = str;
        to02.f142303f = bVar;
        to02.f142305h = i;
        to02.f142304g = C46523h2.f125330a.mo71859a(3810);
        bVar2.f127066a = to02;
        bVar2.f127069d = 3810;
        bVar2.f127067b = new C51574uo0();
        bVar2.f127068c = "/cgi-bin/micromsg-bin/findergetmentionedlist";
        this.f29241h = bVar2.mo72403a();
        Log.m105924i("Finder.NetSceneFinderGetMentionedFeed", "NetSceneFinderGetMentionedFeed init: " + str + " lastBuffer:" + bVar);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f29242i = nVar;
        return dispatch(gVar, this.f29241h, this);
    }

    public int getType() {
        return 3810;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        String str2 = this.f29243j;
        Log.m105924i(str2, "errType " + i2 + ", errCode " + i3 + ", errMsg " + str);
        if (i2 == 0 && i3 == 0) {
            String str3 = this.f29243j;
            StringBuilder sb = new StringBuilder();
            sb.append("friendUsername ");
            sb.append(this.f29240g);
            sb.append(' ');
            C9311g2 g2Var = C9311g2.f29093a;
            C47465a aVar = this.f29241h.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetMentionedListResponse");
            LinkedList<FinderObject> linkedList = ((C51574uo0) aVar).f142974d;
            C87412m.m108593f(linkedList, "rr.responseProtoBuf as F…nedListResponse).`object`");
            sb.append(g2Var.mo10062a(linkedList));
            Log.m105924i(str3, sb.toString());
        }
        C11385n nVar = this.f29242i;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9364p3(String str, C89349b bVar, int i, int i2, C8480h hVar) {
        this(str, bVar, (i2 & 4) != 0 ? 1 : i);
    }
}
