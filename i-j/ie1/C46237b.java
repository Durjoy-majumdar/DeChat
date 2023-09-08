package ie1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import it1.C60628i;
import java.util.LinkedList;
import java.util.List;
import je1.C46523h2;
import o40.C61926c;
import ob0.C11385n;
import ob0.C47350c;
import p823sg.C90193h;
import pe3.C47465a;
import pe3.C89349b;
import sx3.C64197v;
import te3.C48735am0;
import te3.C48877bm0;
import te3.C49712hj1;
import te3.C50409mj;

/* renamed from: ie1.b */
public final class C46237b extends C60628i {

    /* renamed from: g */
    public final long f124639g;

    /* renamed from: h */
    public final C89349b f124640h;

    /* renamed from: i */
    public final int f124641i;

    /* renamed from: j */
    public C47350c f124642j;

    /* renamed from: n */
    public C11385n f124643n;

    public C46237b(long j, long j2, C89349b bVar, C49712hj1 hj12, int i) {
        super(hj12);
        this.f124639g = j;
        this.f124640h = bVar;
        this.f124641i = i;
        C48735am0 am02 = new C48735am0();
        am02.f130625d = C46523h2.f125330a.mo71860b(8560, hj12);
        am02.f130626e = j;
        am02.f130628g = bVar;
        am02.f130627f = j2;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127068c = "/cgi-bin/micromsg-bin/findergetbulletcomment";
        bVar2.f127069d = 8560;
        bVar2.f127066a = am02;
        bVar2.f127067b = new C48877bm0();
        this.f124642j = bVar2.mo72403a();
        StringBuilder sb = new StringBuilder();
        sb.append("pullType=");
        sb.append(i);
        sb.append(", start_timestamp=");
        sb.append(j2);
        sb.append(", videoObjectId=");
        sb.append(C61926c.m72691p(j));
        sb.append(" lastBuffer=");
        sb.append(bVar);
        sb.append(" md5=");
        sb.append(C90193h.m112878f(bVar != null ? bVar.f257327a : null));
        Log.m105924i("Finder.NetSceneFinderGetBullet", sb.toString());
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f124643n = nVar;
        return dispatch(gVar, this.f124642j, this);
    }

    public int getType() {
        return 8560;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        if (i2 == 0 && i3 == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("count:");
            sb.append(((LinkedList) mo71649l1()).size());
            sb.append(" ,lastbuf ");
            C47465a aVar = this.f124642j.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetBulletCommentResponse");
            C89349b bVar = ((C48877bm0) aVar).f131196e;
            byte[] bArr2 = null;
            sb.append(C90193h.m112878f(bVar != null ? bVar.f257327a : null));
            sb.append(" min:");
            sb.append(mo71651n1());
            sb.append(" max: ==>");
            sb.append(mo71650m1());
            StringBuffer stringBuffer = new StringBuffer(sb.toString());
            int i4 = 0;
            for (T next : mo71649l1()) {
                int i5 = i4 + 1;
                if (i4 >= 0) {
                    C50409mj mjVar = (C50409mj) next;
                    stringBuffer.append("# " + i4 + XVFSFile.PATH_SEPARATOR_CHAR + mjVar.f138060f + ',' + mjVar.f138062h + ", ");
                    i4 = i5;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("getBulletList videoObjectId=");
            sb4.append(C61926c.m72691p(this.f124639g));
            sb4.append(' ');
            C89349b bVar2 = this.f124640h;
            if (bVar2 != null) {
                bArr2 = bVar2.f257327a;
            }
            sb4.append(C90193h.m112878f(bArr2));
            sb4.append(' ');
            sb4.append(stringBuffer);
            Log.m105924i("Finder.NetSceneFinderGetBullet", sb4.toString());
        }
        C11385n nVar = this.f124643n;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: l1 */
    public final List<C50409mj> mo71649l1() {
        C47465a aVar = this.f124642j.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetBulletCommentResponse");
        LinkedList<C50409mj> linkedList = ((C48877bm0) aVar).f131195d;
        C87412m.m108593f(linkedList, "rr.responseProtoBuf as F…entResponse).comment_list");
        return linkedList;
    }

    /* renamed from: m1 */
    public final long mo71650m1() {
        C47465a aVar = this.f124642j.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetBulletCommentResponse");
        return ((C48877bm0) aVar).f131198g;
    }

    /* renamed from: n1 */
    public final long mo71651n1() {
        C47465a aVar = this.f124642j.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetBulletCommentResponse");
        return ((C48877bm0) aVar).f131197f;
    }
}
