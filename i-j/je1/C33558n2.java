package je1;

import com.tencent.p014mm.autogen.events.FinderLiveNoticeStateEvent;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C33078t2;
import it1.C60628i;
import ob0.C11385n;
import ob0.C47350c;
import te3.C49712hj1;
import te3.C51826wf0;
import te3.C51965xf0;
import tf0.C64916p1;

/* renamed from: je1.n2 */
public final class C33558n2 extends C60628i {

    /* renamed from: g */
    public final String f90850g;

    /* renamed from: h */
    public final String f90851h;

    /* renamed from: i */
    public final int f90852i;

    /* renamed from: j */
    public C47350c f90853j;

    /* renamed from: n */
    public C11385n f90854n;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C33558n2(String str, String str2, int i, C49712hj1 hj12, String str3, Integer num, Long l, int i2, C8480h hVar) {
        this(str, str2, i, hj12, (i2 & 16) != 0 ? "" : str3, (i2 & 32) != 0 ? -1 : num, (i2 & 64) != 0 ? -1L : l);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f90854n = nVar;
        C47350c cVar = this.f90853j;
        if (cVar != null) {
            return dispatch(gVar, cVar, this);
        }
        C87412m.m108603p("rr");
        throw null;
    }

    public int getType() {
        return 6276;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Class cls = C33078t2.class;
        Log.m105924i("Finder.com.tencent.mm.plugin.finder.cgi.NetSceneAudienceReserveLive", "errType " + i2 + ", errCode " + i3 + ", errMsg " + str);
        C11385n nVar = this.f90854n;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
        if (i2 == 0 && i3 == 0) {
            int i4 = this.f90852i;
            boolean z = false;
            if (i4 == 3 || i4 == 4) {
                ((C33078t2) C86312j.m106911c(cls)).mo58244Vo(this.f90850g, this.f90852i == 3);
            } else {
                ((C33078t2) C86312j.m106911c(cls)).mo58243Oe(this.f90850g, this.f90851h, this.f90852i == 1);
            }
            FinderLiveNoticeStateEvent finderLiveNoticeStateEvent = new FinderLiveNoticeStateEvent();
            FinderLiveNoticeStateEvent.C28744a aVar = finderLiveNoticeStateEvent.f78792d;
            aVar.f78793a = this.f90851h;
            if (this.f90852i == 1) {
                z = true;
            }
            aVar.f78794b = z;
            finderLiveNoticeStateEvent.publish();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33558n2(String str, String str2, int i, C49712hj1 hj12, String str3, Integer num, Long l) {
        super(hj12);
        C87412m.m108594g(str, "userName");
        C87412m.m108594g(str2, "noticeId");
        this.f90850g = str;
        this.f90851h = str2;
        this.f90852i = i;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderaudiencereservelive";
        bVar.f127069d = 6276;
        C51826wf0 wf02 = new C51826wf0();
        wf02.f144011d = str;
        wf02.f144012e = str2;
        wf02.f144013f = i;
        wf02.f144016i = str3;
        int i2 = -1;
        wf02.f144017j = num != null ? num.intValue() : -1;
        wf02.f144019o = ((C64916p1) C86312j.m106911c(C64916p1.class)).mo76655Cu(l != null ? l.longValue() : -1, hj12 != null ? hj12.f134675i : 0);
        wf02.f144018n = hj12 != null ? hj12.f134678o : i2;
        C51965xf0 xf02 = new C51965xf0();
        bVar.f127066a = wf02;
        bVar.f127067b = xf02;
        this.f90853j = bVar.mo72403a();
        Log.m105924i("Finder.com.tencent.mm.plugin.finder.cgi.NetSceneAudienceReserveLive", "com.tencent.mm.plugin.finder.cgi.NetSceneAudienceReserveLive init userName:" + str + ", noticeId:" + str2 + " ,optype:" + i + " ,promoToken:" + str3 + ",scene:" + num);
    }
}
