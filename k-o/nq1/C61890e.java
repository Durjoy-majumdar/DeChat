package nq1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import eb0.C31543z5;
import er1.C58739j4;
import gy3.C87412m;
import java.util.LinkedList;
import je1.C46523h2;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import qq1.C63317a;
import sq1.C64147b;
import sq1.C64149d;
import te3.C49966ja;
import te3.C52141yn1;
import te3.C64488kb1;
import te3.C64833xn1;
import up1.C65412c;

/* renamed from: nq1.e */
public final class C61890e extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f175992d;

    /* renamed from: e */
    public C11385n f175993e;

    /* renamed from: f */
    public final C64147b f175994f;

    public C61890e(C64147b bVar, C63317a aVar) {
        C87412m.m108594g(bVar, "unsentComment");
        C87412m.m108594g(aVar, "uniEntityItem");
        C64833xn1 xn12 = new C64833xn1();
        this.f175994f = bVar;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = xn12;
        C52141yn1 yn12 = new C52141yn1();
        yn12.BaseResponse = new C49966ja();
        bVar2.f127067b = yn12;
        bVar2.f127074i = 30000;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/finderunicomment";
        bVar2.f127069d = 6964;
        this.f175992d = bVar2.mo72403a();
        xn12.f186341f = aVar.f179669a;
        xn12.f186342g = aVar.f179670b;
        C64488kb1 kb12 = aVar.f179676h;
        xn12.f186351s = kb12 != null ? C58739j4.f168176a.mo83710g0(kb12) : null;
        xn12.f186339d = C46523h2.f125330a.mo71859a(6964);
        xn12.f186348p = 1;
        xn12.f186349q = bVar.field_scene == 1 ? 3 : 2;
        xn12.f186345j = bVar.getContent();
        long j = bVar.field_actionInfo.f186500h;
        long t2 = bVar.mo88882t2();
        xn12.f186346n = j;
        xn12.f186347o = t2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f175993e = nVar;
        return dispatch(gVar, this.f175992d, this);
    }

    public int getType() {
        return 6964;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        if (i2 == 0 && i3 == 0) {
            C47465a aVar = this.f175992d.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUniCommentResponse");
            this.f175994f.mo88876n2().createtime = C31543z5.m39451a() / 1000;
            this.f175994f.mo88876n2().commentId = ((C52141yn1) aVar).f145420d;
            LinkedList<String> linkedList = this.f175994f.f181860Q;
            if (linkedList != null) {
                linkedList.clear();
            }
            this.f175994f.field_state = 2;
        } else {
            this.f175994f.field_state = 1;
        }
        C64149d a = C64149d.f181862f.mo88889a();
        C64147b bVar = this.f175994f;
        long j = bVar.field_feedId;
        long m2 = bVar.mo88875m2();
        C64147b bVar2 = this.f175994f;
        long j2 = bVar2.field_localCommentId;
        String[] strArr = C65412c.f188250f;
        a.mo88887jo(j, m2, j2, 2, bVar2);
        C11385n nVar = this.f175993e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
