package je1;

import com.tencent.p014mm.autogen.events.FeedDeleteEvent;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60628i;
import ob0.C11385n;
import ob0.C47350c;
import te3.C49712hj1;
import te3.C49842ig0;
import te3.C50690oj0;
import te3.C50837pj0;
import wp1.C15585f;

/* renamed from: je1.q2 */
public final class C46530q2 extends C60628i {

    /* renamed from: g */
    public C47350c f125354g;

    /* renamed from: h */
    public C11385n f125355h;

    /* renamed from: i */
    public long f125356i;

    /* renamed from: j */
    public FinderObject f125357j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46530q2(String str, long j, String str2, boolean z) {
        super((C49712hj1) null, 1, (C8480h) null);
        C87412m.m108594g(str, "username");
        C87412m.m108594g(str2, "objectNonceId");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderdelfeed";
        bVar.f127069d = 3627;
        C50690oj0 oj02 = new C50690oj0();
        oj02.f139212d = j;
        oj02.f139214f = str2;
        oj02.f139213e = str;
        C49842ig0 a = C46523h2.f125330a.mo71859a(3627);
        oj02.f139215g = a;
        a.f135313e = z ? 1 : 0;
        bVar.f127066a = oj02;
        bVar.f127067b = new C50837pj0();
        this.f125354g = bVar.mo72403a();
        Log.m105924i("Finder.NetSceneDeleteFinderObject", "username:" + str + " objectId:" + j + " objectNonceId:" + str2 + " isMegaVideo:" + z);
        this.f125356i = j;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125355h = nVar;
        return dispatch(gVar, this.f125354g, this);
    }

    public int getType() {
        return 3627;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        long j;
        Log.m105924i("Finder.NetSceneDeleteFinderObject", "errType " + i2 + " errCode " + i3 + " errMsg " + str + " objectId:" + this.f125356i);
        if (i2 == 0 && i3 == 0) {
            if (this.f125357j != null) {
                C15585f.f42211a.mo14339b(this.f125356i);
                j = this.f125356i;
            } else {
                j = 0;
            }
            if (j != 0) {
                FeedDeleteEvent feedDeleteEvent = new FeedDeleteEvent();
                feedDeleteEvent.f9154d.f9155a = j;
                feedDeleteEvent.publish();
            }
            if (this.f125357j == null) {
                C15585f.f42211a.mo14339b(this.f125356i);
                FeedDeleteEvent feedDeleteEvent2 = new FeedDeleteEvent();
                feedDeleteEvent2.f9154d.f9155a = this.f125356i;
                feedDeleteEvent2.publish();
            }
        }
        C11385n nVar = this.f125355h;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C46530q2(String str, long j, String str2, boolean z, int i, C8480h hVar) {
        this(str, j, str2, (i & 8) != 0 ? false : z);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C46530q2(java.lang.String r10, com.tencent.p014mm.protocal.protobuf.FinderObject r11) {
        /*
            r9 = this;
            java.lang.String r0 = "username"
            gy3.C87412m.m108594g(r10, r0)
            java.lang.String r0 = "finderObject"
            gy3.C87412m.m108594g(r11, r0)
            long r3 = r11.f164794id
            java.lang.String r0 = r11.objectNonceId
            if (r0 != 0) goto L_0x0013
            java.lang.String r0 = ""
        L_0x0013:
            r5 = r0
            r6 = 0
            r7 = 8
            r8 = 0
            r1 = r9
            r2 = r10
            r1.<init>(r2, r3, r5, r6, r7, r8)
            r9.f125357j = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je1.C46530q2.<init>(java.lang.String, com.tencent.mm.protocal.protobuf.FinderObject):void");
    }
}
